// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616;

import com.aliyun.tea.*;
import com.aliyun.alb20200616.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * @summary Adds IP entries to an access control list (ACL).
     *
     * @description *   Each ACL can contain IP addresses or CIDR blocks. Take note of the following limits on ACLs:
     *     *   The maximum number of IP entries that can be added to an ACL with each Alibaba Cloud account at a time: 20
     *     *   The maximum number of IP entries that each ACL can contain: 1,000
     * *   **AddEntriesToAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclEntries](https://help.aliyun.com/document_detail/213616.html) operation to query the status of the task.
     *     *   If the ACL is in the **Adding** state, the IP entries are being added.
     *     *   If the ACL is in the **Available** state, the IP entries are added.
     *
     * @param request AddEntriesToAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEntriesToAclResponse
     */
    public AddEntriesToAclResponse addEntriesToAclWithOptions(AddEntriesToAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntries)) {
            query.put("AclEntries", request.aclEntries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEntriesToAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEntriesToAclResponse());
    }

    /**
     * @summary Adds IP entries to an access control list (ACL).
     *
     * @description *   Each ACL can contain IP addresses or CIDR blocks. Take note of the following limits on ACLs:
     *     *   The maximum number of IP entries that can be added to an ACL with each Alibaba Cloud account at a time: 20
     *     *   The maximum number of IP entries that each ACL can contain: 1,000
     * *   **AddEntriesToAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclEntries](https://help.aliyun.com/document_detail/213616.html) operation to query the status of the task.
     *     *   If the ACL is in the **Adding** state, the IP entries are being added.
     *     *   If the ACL is in the **Available** state, the IP entries are added.
     *
     * @param request AddEntriesToAclRequest
     * @return AddEntriesToAclResponse
     */
    public AddEntriesToAclResponse addEntriesToAcl(AddEntriesToAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEntriesToAclWithOptions(request, runtime);
    }

    /**
     * @summary Adds backend servers to a server group.
     *
     * @description **AddServersToServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     * *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     * *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     * *   If a backend server is in the **Adding** state, it indicates that the backend server is being added to a server group.
     * *   If a backend server is in the **Available** state, it indicates that the server is running.
     *
     * @param request AddServersToServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddServersToServerGroupResponse
     */
    public AddServersToServerGroupResponse addServersToServerGroupWithOptions(AddServersToServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servers)) {
            query.put("Servers", request.servers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddServersToServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddServersToServerGroupResponse());
    }

    /**
     * @summary Adds backend servers to a server group.
     *
     * @description **AddServersToServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     * *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     * *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     * *   If a backend server is in the **Adding** state, it indicates that the backend server is being added to a server group.
     * *   If a backend server is in the **Available** state, it indicates that the server is running.
     *
     * @param request AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    public AddServersToServerGroupResponse addServersToServerGroup(AddServersToServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addServersToServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Applies a health check template to a server group.
     *
     * @param request ApplyHealthCheckTemplateToServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyHealthCheckTemplateToServerGroupResponse
     */
    public ApplyHealthCheckTemplateToServerGroupResponse applyHealthCheckTemplateToServerGroupWithOptions(ApplyHealthCheckTemplateToServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateId)) {
            query.put("HealthCheckTemplateId", request.healthCheckTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyHealthCheckTemplateToServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyHealthCheckTemplateToServerGroupResponse());
    }

    /**
     * @summary Applies a health check template to a server group.
     *
     * @param request ApplyHealthCheckTemplateToServerGroupRequest
     * @return ApplyHealthCheckTemplateToServerGroupResponse
     */
    public ApplyHealthCheckTemplateToServerGroupResponse applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyHealthCheckTemplateToServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Associates access control lists (ACLs) with a listener.
     *
     * @description **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclRelations](https://help.aliyun.com/document_detail/213618.html) operation to query the status of the task.
     * *   If an ACL is in the **Associating** state, the ACL is being associated with a listener.
     * *   If an ACL is in the **Associated** state, the ACL is associated with a listener.
     *
     * @param request AssociateAclsWithListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateAclsWithListenerResponse
     */
    public AssociateAclsWithListenerResponse associateAclsWithListenerWithOptions(AssociateAclsWithListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAclsWithListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateAclsWithListenerResponse());
    }

    /**
     * @summary Associates access control lists (ACLs) with a listener.
     *
     * @description **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclRelations](https://help.aliyun.com/document_detail/213618.html) operation to query the status of the task.
     * *   If an ACL is in the **Associating** state, the ACL is being associated with a listener.
     * *   If an ACL is in the **Associated** state, the ACL is associated with a listener.
     *
     * @param request AssociateAclsWithListenerRequest
     * @return AssociateAclsWithListenerResponse
     */
    public AssociateAclsWithListenerResponse associateAclsWithListener(AssociateAclsWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateAclsWithListenerWithOptions(request, runtime);
    }

    /**
     * @summary Associates additional certificates with a listener.
     *
     * @description **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) operation to query the status of the task:
     * *   If the HTTPS or QUIC listener is in the **Associating** state, the additional certificates are being associated.
     * *   If the HTTPS or QUIC listener is in the **Associated** state, the additional certificates are associated.
     *
     * @param request AssociateAdditionalCertificatesWithListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListenerWithOptions(AssociateAdditionalCertificatesWithListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAdditionalCertificatesWithListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateAdditionalCertificatesWithListenerResponse());
    }

    /**
     * @summary Associates additional certificates with a listener.
     *
     * @description **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) operation to query the status of the task:
     * *   If the HTTPS or QUIC listener is in the **Associating** state, the additional certificates are being associated.
     * *   If the HTTPS or QUIC listener is in the **Associated** state, the additional certificates are associated.
     *
     * @param request AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateAdditionalCertificatesWithListenerWithOptions(request, runtime);
    }

    /**
     * @summary Associates an EIP bandwidth plan with an Application Load Balancer (ALB) instance.
     *
     * @description **AttachCommonBandwidthPackageToLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If the ALB instance is in the **Configuring** state, the EIP bandwidth plan is being associated with the ALB instance.
     * *   If the ALB instance is in the **Active** state, the EIP bandwidth plan is associated with the ALB instance.
     *
     * @param request AttachCommonBandwidthPackageToLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachCommonBandwidthPackageToLoadBalancerResponse
     */
    public AttachCommonBandwidthPackageToLoadBalancerResponse attachCommonBandwidthPackageToLoadBalancerWithOptions(AttachCommonBandwidthPackageToLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachCommonBandwidthPackageToLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCommonBandwidthPackageToLoadBalancerResponse());
    }

    /**
     * @summary Associates an EIP bandwidth plan with an Application Load Balancer (ALB) instance.
     *
     * @description **AttachCommonBandwidthPackageToLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If the ALB instance is in the **Configuring** state, the EIP bandwidth plan is being associated with the ALB instance.
     * *   If the ALB instance is in the **Active** state, the EIP bandwidth plan is associated with the ALB instance.
     *
     * @param request AttachCommonBandwidthPackageToLoadBalancerRequest
     * @return AttachCommonBandwidthPackageToLoadBalancerResponse
     */
    public AttachCommonBandwidthPackageToLoadBalancerResponse attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachCommonBandwidthPackageToLoadBalancerWithOptions(request, runtime);
    }

    /**
     * @summary Adds the elastic IP address (EIP) and virtual IP address (VIP) of a zone to a DNS record.
     *
     * @description This operation is supported only by Application Load Balancer (ALB) instances that use static IP addresses. Before you call this operation, you must call the StartShiftLoadBalancerZones operation to remove the zone from the ALB instance.
     *
     * @param request CancelShiftLoadBalancerZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelShiftLoadBalancerZonesResponse
     */
    public CancelShiftLoadBalancerZonesResponse cancelShiftLoadBalancerZonesWithOptions(CancelShiftLoadBalancerZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelShiftLoadBalancerZones"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelShiftLoadBalancerZonesResponse());
    }

    /**
     * @summary Adds the elastic IP address (EIP) and virtual IP address (VIP) of a zone to a DNS record.
     *
     * @description This operation is supported only by Application Load Balancer (ALB) instances that use static IP addresses. Before you call this operation, you must call the StartShiftLoadBalancerZones operation to remove the zone from the ALB instance.
     *
     * @param request CancelShiftLoadBalancerZonesRequest
     * @return CancelShiftLoadBalancerZonesResponse
     */
    public CancelShiftLoadBalancerZonesResponse cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelShiftLoadBalancerZonesWithOptions(request, runtime);
    }

    /**
     * @summary Creates AScript rules.
     *
     * @description ### Prerequisites
     * *   A standard or WAF-enabled Application Load Balancer (ALB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html).
     * *   By default, the feature to create and manage AScript rules is unavailable. Log on to the [Quota Center console](https://quotas.console.aliyun.com/white-list-products/alb/quotas?spm=a2c4g.11186623.0.0.6e8834f6IFiF2I). On the **Privileges** page, enter the quota ID `slb_user_visible_gray_label/ascript` and apply for the quota.
     * ### Usage notes
     * *   **CreateAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](https://help.aliyun.com/document_detail/472574.html) operation to query the status of the task:
     *     *   If an AScript rule is in the **Creating** state, the AScript rule is being created.
     *     *   If an AScript rule is in the **Available** state, the AScript rule is created.
     * *   In the following table, the value of **N** is **1**.
     *
     * @param request CreateAScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAScriptsResponse
     */
    public CreateAScriptsResponse createAScriptsWithOptions(CreateAScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AScripts)) {
            query.put("AScripts", request.AScripts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAScripts"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAScriptsResponse());
    }

    /**
     * @summary Creates AScript rules.
     *
     * @description ### Prerequisites
     * *   A standard or WAF-enabled Application Load Balancer (ALB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html).
     * *   By default, the feature to create and manage AScript rules is unavailable. Log on to the [Quota Center console](https://quotas.console.aliyun.com/white-list-products/alb/quotas?spm=a2c4g.11186623.0.0.6e8834f6IFiF2I). On the **Privileges** page, enter the quota ID `slb_user_visible_gray_label/ascript` and apply for the quota.
     * ### Usage notes
     * *   **CreateAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](https://help.aliyun.com/document_detail/472574.html) operation to query the status of the task:
     *     *   If an AScript rule is in the **Creating** state, the AScript rule is being created.
     *     *   If an AScript rule is in the **Available** state, the AScript rule is created.
     * *   In the following table, the value of **N** is **1**.
     *
     * @param request CreateAScriptsRequest
     * @return CreateAScriptsResponse
     */
    public CreateAScriptsResponse createAScripts(CreateAScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAScriptsWithOptions(request, runtime);
    }

    /**
     * @summary Creates an access control list (ACL) in a region.
     *
     * @description ## Usage notes
     * The **CreateAcl** operation is asynchronous. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListAcls](https://help.aliyun.com/document_detail/213617.html) operation to query the status of an ACL:
     * *   If an ACL is in the **Creating** state, the ACL is being created.
     * *   If an ACL is in the **Available** state, the ACL is created.
     *
     * @param request CreateAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAclResponse
     */
    public CreateAclResponse createAclWithOptions(CreateAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAclResponse());
    }

    /**
     * @summary Creates an access control list (ACL) in a region.
     *
     * @description ## Usage notes
     * The **CreateAcl** operation is asynchronous. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListAcls](https://help.aliyun.com/document_detail/213617.html) operation to query the status of an ACL:
     * *   If an ACL is in the **Creating** state, the ACL is being created.
     * *   If an ACL is in the **Available** state, the ACL is created.
     *
     * @param request CreateAclRequest
     * @return CreateAclResponse
     */
    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    /**
     * @summary Creates a health check template in a region.
     *
     * @param request CreateHealthCheckTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHealthCheckTemplateResponse
     */
    public CreateHealthCheckTemplateResponse createHealthCheckTemplateWithOptions(CreateHealthCheckTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckCodes)) {
            query.put("HealthCheckCodes", request.healthCheckCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHost)) {
            query.put("HealthCheckHost", request.healthCheckHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpVersion)) {
            query.put("HealthCheckHttpVersion", request.healthCheckHttpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPath)) {
            query.put("HealthCheckPath", request.healthCheckPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckProtocol)) {
            query.put("HealthCheckProtocol", request.healthCheckProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateName)) {
            query.put("HealthCheckTemplateName", request.healthCheckTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHealthCheckTemplate"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHealthCheckTemplateResponse());
    }

    /**
     * @summary Creates a health check template in a region.
     *
     * @param request CreateHealthCheckTemplateRequest
     * @return CreateHealthCheckTemplateResponse
     */
    public CreateHealthCheckTemplateResponse createHealthCheckTemplate(CreateHealthCheckTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHealthCheckTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Creates an HTTP, HTTPS, or QUIC listener in a region.
     *
     * @description ## Usage notes
     * **CreateListener** is an asynchronous operation. After you call this operation, the system returns a request ID. However, the operation is still being performed in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/214353.html) operation to query the status of the HTTP, HTTPS, or QUIC listener.
     * *   If the HTTP, HTTPS, or QUIC listener is in the **Provisioning** state, it indicates that the listener is being created.
     * *   If the HTTP, HTTPS, or QUIC listener is in the **Running** state, it indicates that the listener has been created successfully.
     *
     * @param request CreateListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertificates)) {
            query.put("CaCertificates", request.caCertificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caEnabled)) {
            query.put("CaEnabled", request.caEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultActions)) {
            query.put("DefaultActions", request.defaultActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzipEnabled)) {
            query.put("GzipEnabled", request.gzipEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Enabled)) {
            query.put("Http2Enabled", request.http2Enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerDescription)) {
            query.put("ListenerDescription", request.listenerDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quicConfig)) {
            query.put("QuicConfig", request.quicConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedForConfig)) {
            query.put("XForwardedForConfig", request.XForwardedForConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateListenerResponse());
    }

    /**
     * @summary Creates an HTTP, HTTPS, or QUIC listener in a region.
     *
     * @description ## Usage notes
     * **CreateListener** is an asynchronous operation. After you call this operation, the system returns a request ID. However, the operation is still being performed in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/214353.html) operation to query the status of the HTTP, HTTPS, or QUIC listener.
     * *   If the HTTP, HTTPS, or QUIC listener is in the **Provisioning** state, it indicates that the listener is being created.
     * *   If the HTTP, HTTPS, or QUIC listener is in the **Running** state, it indicates that the listener has been created successfully.
     *
     * @param request CreateListenerRequest
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    /**
     * @summary Creates an Application Load Balancer (ALB) instance in a region.
     *
     * @description **CreateLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of an ALB instance.
     * *   If an ALB instance is in the **Provisioning** state, it indicates that the ALB instance is being created.
     * *   If an ALB instance is in the **Active** state, it indicates that the ALB instance is created.
     *
     * @param request CreateLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressAllocatedMode)) {
            query.put("AddressAllocatedMode", request.addressAllocatedMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIpVersion)) {
            query.put("AddressIpVersion", request.addressIpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtectionEnabled)) {
            query.put("DeletionProtectionEnabled", request.deletionProtectionEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerBillingConfig)) {
            query.put("LoadBalancerBillingConfig", request.loadBalancerBillingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerEdition)) {
            query.put("LoadBalancerEdition", request.loadBalancerEdition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modificationProtectionConfig)) {
            query.put("ModificationProtectionConfig", request.modificationProtectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerResponse());
    }

    /**
     * @summary Creates an Application Load Balancer (ALB) instance in a region.
     *
     * @description **CreateLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of an ALB instance.
     * *   If an ALB instance is in the **Provisioning** state, it indicates that the ALB instance is being created.
     * *   If an ALB instance is in the **Active** state, it indicates that the ALB instance is created.
     *
     * @param request CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    /**
     * @summary Creates a forwarding rule for a listener.
     *
     * @description Take note of the following limits:
     * *   When you configure the **Redirect** action, you can use the default value only for the **HttpCode** parameter. Do not use the default values for the other parameters.
     * *   If you specify the **Rewrite** action together with other actions in a forwarding rule, make sure that the **ForwardGroup** action is specified.
     * *   **CreateRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of a forwarding rule.
     *     *   If a forwarding rule is in the **Provisioning** state, the forwarding rule is being created.
     *     *   If a forwarding rule is in the **Available** state, the forwarding rule is created.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. The limits on conditions and actions are:
     *     *   Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.
     *     *   Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.
     *
     * @param request CreateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleActions)) {
            query.put("RuleActions", request.ruleActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditions)) {
            query.put("RuleConditions", request.ruleConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    /**
     * @summary Creates a forwarding rule for a listener.
     *
     * @description Take note of the following limits:
     * *   When you configure the **Redirect** action, you can use the default value only for the **HttpCode** parameter. Do not use the default values for the other parameters.
     * *   If you specify the **Rewrite** action together with other actions in a forwarding rule, make sure that the **ForwardGroup** action is specified.
     * *   **CreateRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of a forwarding rule.
     *     *   If a forwarding rule is in the **Provisioning** state, the forwarding rule is being created.
     *     *   If a forwarding rule is in the **Available** state, the forwarding rule is created.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. The limits on conditions and actions are:
     *     *   Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.
     *     *   Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.
     *
     * @param request CreateRuleRequest
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    /**
     * @summary Creates one or more forwarding rules at a time.
     *
     * @description When you call this operation, take note of the following limits:
     * *   When you configure the **Redirect** action, you can use the default value for the **HttpCode** parameter but you cannot use the default values for all of the other parameters.
     * *   If you specify the **Rewrite** action and other actions in a forwarding rule, make sure that one of the actions is **ForwardGroup**.
     * *   **CreateRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of forwarding rules.
     *     *   If forwarding rules are in the **Provisioning** state, the forwarding rules are being created.
     *     *   If forwarding rules are in the **Available** state, the forwarding rules have been created.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:
     *     *   Limits on conditions: You can specify at most 5 conditions if you use a basic Application Load Balancer (ALB) instance, at most 10 conditions if you use a standard ALB instance, and at most 10 conditions if you use a WAF-enabled ALB instance.
     *     *   Limits on actions: You can specify at most 3 actions if you use a basic ALB instance, at most 5 actions if you use a standard ALB instance, and at most 10 actions if you use a WAF-enabled ALB instance.
     *
     * @param request CreateRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRulesResponse
     */
    public CreateRulesResponse createRulesWithOptions(CreateRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRules"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRulesResponse());
    }

    /**
     * @summary Creates one or more forwarding rules at a time.
     *
     * @description When you call this operation, take note of the following limits:
     * *   When you configure the **Redirect** action, you can use the default value for the **HttpCode** parameter but you cannot use the default values for all of the other parameters.
     * *   If you specify the **Rewrite** action and other actions in a forwarding rule, make sure that one of the actions is **ForwardGroup**.
     * *   **CreateRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of forwarding rules.
     *     *   If forwarding rules are in the **Provisioning** state, the forwarding rules are being created.
     *     *   If forwarding rules are in the **Available** state, the forwarding rules have been created.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:
     *     *   Limits on conditions: You can specify at most 5 conditions if you use a basic Application Load Balancer (ALB) instance, at most 10 conditions if you use a standard ALB instance, and at most 10 conditions if you use a WAF-enabled ALB instance.
     *     *   Limits on actions: You can specify at most 3 actions if you use a basic ALB instance, at most 5 actions if you use a standard ALB instance, and at most 10 actions if you use a WAF-enabled ALB instance.
     *
     * @param request CreateRulesRequest
     * @return CreateRulesResponse
     */
    public CreateRulesResponse createRules(CreateRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRulesWithOptions(request, runtime);
    }

    /**
     * @summary Creates a custom security policy in a region.
     *
     * @param request CreateSecurityPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityPolicyResponse
     */
    public CreateSecurityPolicyResponse createSecurityPolicyWithOptions(CreateSecurityPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphers)) {
            query.put("Ciphers", request.ciphers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyName)) {
            query.put("SecurityPolicyName", request.securityPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSVersions)) {
            query.put("TLSVersions", request.TLSVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityPolicy"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityPolicyResponse());
    }

    /**
     * @summary Creates a custom security policy in a region.
     *
     * @param request CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     */
    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Creates a server group in a region.
     *
     * @description **CreateServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) to query the status of a server group.
     * *   If a server group is in the **Creating** state, it indicates that the server group is being created.
     * *   If a server group is in the **Available** state, it indicates that the server group is created.
     *
     * @param request CreateServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroupWithOptions(CreateServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrainConfig)) {
            query.put("ConnectionDrainConfig", request.connectionDrainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConfig)) {
            query.put("HealthCheckConfig", request.healthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupName)) {
            query.put("ServerGroupName", request.serverGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupType)) {
            query.put("ServerGroupType", request.serverGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slowStartConfig)) {
            query.put("SlowStartConfig", request.slowStartConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionConfig)) {
            query.put("StickySessionConfig", request.stickySessionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uchConfig)) {
            query.put("UchConfig", request.uchConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamKeepaliveEnabled)) {
            query.put("UpstreamKeepaliveEnabled", request.upstreamKeepaliveEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerGroupResponse());
    }

    /**
     * @summary Creates a server group in a region.
     *
     * @description **CreateServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) to query the status of a server group.
     * *   If a server group is in the **Creating** state, it indicates that the server group is being created.
     * *   If a server group is in the **Available** state, it indicates that the server group is created.
     *
     * @param request CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes AScript rules.
     *
     * @description **DeleteAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](https://help.aliyun.com/document_detail/472574.html) operation to query the status of the task:
     * *   If an AScript rule is in the **Deleting** state, the AScript rule is being deleted.
     * *   If an AScript rule cannot be found, the AScript rule is deleted.
     *
     * @param request DeleteAScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAScriptsResponse
     */
    public DeleteAScriptsResponse deleteAScriptsWithOptions(DeleteAScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AScriptIds)) {
            query.put("AScriptIds", request.AScriptIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAScripts"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAScriptsResponse());
    }

    /**
     * @summary Deletes AScript rules.
     *
     * @description **DeleteAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](https://help.aliyun.com/document_detail/472574.html) operation to query the status of the task:
     * *   If an AScript rule is in the **Deleting** state, the AScript rule is being deleted.
     * *   If an AScript rule cannot be found, the AScript rule is deleted.
     *
     * @param request DeleteAScriptsRequest
     * @return DeleteAScriptsResponse
     */
    public DeleteAScriptsResponse deleteAScripts(DeleteAScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAScriptsWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an access control list (ACL).
     *
     * @description **DeleteAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAcls](https://help.aliyun.com/document_detail/213617.html) operation to query the status of the task.
     * *   If the ACL is in the **Deleting** state, the ACL is being deleted.
     * *   If the ACL cannot be found, the ACL is deleted.
     *
     * @param request DeleteAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAclResponse
     */
    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAclResponse());
    }

    /**
     * @summary Deletes an access control list (ACL).
     *
     * @description **DeleteAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAcls](https://help.aliyun.com/document_detail/213617.html) operation to query the status of the task.
     * *   If the ACL is in the **Deleting** state, the ACL is being deleted.
     * *   If the ACL cannot be found, the ACL is deleted.
     *
     * @param request DeleteAclRequest
     * @return DeleteAclResponse
     */
    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    /**
     * @summary Deletes health check templates.
     *
     * @param request DeleteHealthCheckTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHealthCheckTemplatesResponse
     */
    public DeleteHealthCheckTemplatesResponse deleteHealthCheckTemplatesWithOptions(DeleteHealthCheckTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateIds)) {
            query.put("HealthCheckTemplateIds", request.healthCheckTemplateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHealthCheckTemplates"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHealthCheckTemplatesResponse());
    }

    /**
     * @summary Deletes health check templates.
     *
     * @param request DeleteHealthCheckTemplatesRequest
     * @return DeleteHealthCheckTemplatesResponse
     */
    public DeleteHealthCheckTemplatesResponse deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHealthCheckTemplatesWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a listener.
     *
     * @description **DeleteListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) to query the status of the task.
     * *   If the listener is in the **Deleting** state, the listener is being deleted.
     * *   If the listener cannot be found, the listener is deleted.
     *
     * @param request DeleteListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteListenerResponse());
    }

    /**
     * @summary Deletes a listener.
     *
     * @description **DeleteListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) to query the status of the task.
     * *   If the listener is in the **Deleting** state, the listener is being deleted.
     * *   If the listener cannot be found, the listener is deleted.
     *
     * @param request DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an Application Load Balancer (ALB) instance.
     *
     * @description **DeleteLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If an ALB instance is in the **Deleting** state, the ALB instance is being deleted.
     * *   If an ALB instance cannot be found, the ALB instance is deleted.
     *
     * @param request DeleteLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerResponse());
    }

    /**
     * @summary Deletes an Application Load Balancer (ALB) instance.
     *
     * @description **DeleteLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If an ALB instance is in the **Deleting** state, the ALB instance is being deleted.
     * *   If an ALB instance cannot be found, the ALB instance is deleted.
     *
     * @param request DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a forwarding rule.
     *
     * @description **DeleteRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of a forwarding rule:
     * *   If the forwarding rule is in the **Deleting** state, the forwarding rule is being deleted.
     * *   If the forwarding rule cannot be found, the forwarding rule is deleted.
     *
     * @param request DeleteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    /**
     * @summary Deletes a forwarding rule.
     *
     * @description **DeleteRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of a forwarding rule:
     * *   If the forwarding rule is in the **Deleting** state, the forwarding rule is being deleted.
     * *   If the forwarding rule cannot be found, the forwarding rule is deleted.
     *
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * @summary Deletes one or more forwarding rules from a listener at a time.
     *
     * @description **DeleteRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of forwarding rules.
     * *   If the forwarding rules are in the **Deleting** state, the forwarding rules are being deleted.
     * *   If the forwarding rules cannot be found, the forwarding rules are deleted.
     *
     * @param request DeleteRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRulesResponse
     */
    public DeleteRulesResponse deleteRulesWithOptions(DeleteRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRules"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRulesResponse());
    }

    /**
     * @summary Deletes one or more forwarding rules from a listener at a time.
     *
     * @description **DeleteRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of forwarding rules.
     * *   If the forwarding rules are in the **Deleting** state, the forwarding rules are being deleted.
     * *   If the forwarding rules cannot be found, the forwarding rules are deleted.
     *
     * @param request DeleteRulesRequest
     * @return DeleteRulesResponse
     */
    public DeleteRulesResponse deleteRules(DeleteRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRulesWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a custom security policy.
     *
     * @param request DeleteSecurityPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityPolicyResponse
     */
    public DeleteSecurityPolicyResponse deleteSecurityPolicyWithOptions(DeleteSecurityPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityPolicy"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityPolicyResponse());
    }

    /**
     * @summary Deletes a custom security policy.
     *
     * @param request DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     */
    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a server group.
     *
     * @description **DeleteServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of the task.
     * *   If a server group is in the **Deleting** state, it indicates that the server group is being deleted.
     * *   If a specified server group cannot be found, it indicates that the server group has been deleted.
     *
     * @param request DeleteServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServerGroupResponse
     */
    public DeleteServerGroupResponse deleteServerGroupWithOptions(DeleteServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServerGroupResponse());
    }

    /**
     * @summary Deletes a server group.
     *
     * @description **DeleteServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of the task.
     * *   If a server group is in the **Deleting** state, it indicates that the server group is being deleted.
     * *   If a specified server group cannot be found, it indicates that the server group has been deleted.
     *
     * @param request DeleteServerGroupRequest
     * @return DeleteServerGroupResponse
     */
    public DeleteServerGroupResponse deleteServerGroup(DeleteServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries available regions.
     *
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * @summary Queries available regions.
     *
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries zones in a region.
     *
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * @summary Queries zones in a region.
     *
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * @summary Disassociates an elastic IP address (EIP) bandwidth plan from an Application Load Balancer (ALB) instance.
     *
     * @description **DetachCommonBandwidthPackageFromLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214359.html) operation to query the status of the task.
     * *   If an ALB instance is in the **Configuring** state, the EIP bandwidth plan is being disassociated from the ALB instance.
     * *   If an ALB instance is in the **Active** state, the EIP bandwidth plan is disassociated from the ALB instance.
     *
     * @param request DetachCommonBandwidthPackageFromLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachCommonBandwidthPackageFromLoadBalancerResponse
     */
    public DetachCommonBandwidthPackageFromLoadBalancerResponse detachCommonBandwidthPackageFromLoadBalancerWithOptions(DetachCommonBandwidthPackageFromLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachCommonBandwidthPackageFromLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCommonBandwidthPackageFromLoadBalancerResponse());
    }

    /**
     * @summary Disassociates an elastic IP address (EIP) bandwidth plan from an Application Load Balancer (ALB) instance.
     *
     * @description **DetachCommonBandwidthPackageFromLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214359.html) operation to query the status of the task.
     * *   If an ALB instance is in the **Configuring** state, the EIP bandwidth plan is being disassociated from the ALB instance.
     * *   If an ALB instance is in the **Active** state, the EIP bandwidth plan is disassociated from the ALB instance.
     *
     * @param request DetachCommonBandwidthPackageFromLoadBalancerRequest
     * @return DetachCommonBandwidthPackageFromLoadBalancerResponse
     */
    public DetachCommonBandwidthPackageFromLoadBalancerResponse detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachCommonBandwidthPackageFromLoadBalancerWithOptions(request, runtime);
    }

    /**
     * @summary Disables deletion protection for an Application Load Balancer (ALB) instance.
     *
     * @param request DisableDeletionProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDeletionProtectionResponse
     */
    public DisableDeletionProtectionResponse disableDeletionProtectionWithOptions(DisableDeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDeletionProtection"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDeletionProtectionResponse());
    }

    /**
     * @summary Disables deletion protection for an Application Load Balancer (ALB) instance.
     *
     * @param request DisableDeletionProtectionRequest
     * @return DisableDeletionProtectionResponse
     */
    public DisableDeletionProtectionResponse disableDeletionProtection(DisableDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDeletionProtectionWithOptions(request, runtime);
    }

    /**
     * @summary Disables the access log feature for a Server Load Balancer (SLB) instance.
     *
     * @param request DisableLoadBalancerAccessLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableLoadBalancerAccessLogResponse
     */
    public DisableLoadBalancerAccessLogResponse disableLoadBalancerAccessLogWithOptions(DisableLoadBalancerAccessLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableLoadBalancerAccessLog"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableLoadBalancerAccessLogResponse());
    }

    /**
     * @summary Disables the access log feature for a Server Load Balancer (SLB) instance.
     *
     * @param request DisableLoadBalancerAccessLogRequest
     * @return DisableLoadBalancerAccessLogResponse
     */
    public DisableLoadBalancerAccessLogResponse disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableLoadBalancerAccessLogWithOptions(request, runtime);
    }

    /**
     * @summary Changes the type of the IPv6 address that is used by a dual-stack Application Load Balancer (ALB) instance from public to private.
     *
     * @description ### Prerequisites
     * An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html) operation and set **AddressIpVersion** to **DualStack** to create a dual-stack ALB instance.
     * > If you set **AddressIpVersion** to **DualStack**:
     * *   If you set **AddressType** to **Internet**, the ALB instance uses a public IPv4 IP address and a private IPv6 address.
     * *   If you set **AddressType** to **Intranet**, the ALB instance uses a private IPv4 IP address and a private IPv6 address.
     * ### Description
     * *   After the DisableLoadBalancerIpv6Internet operation is called, the value of **Ipv6AddressType** is changed to **Intranet** and the type of the IPv6 address of the ALB instance is changed from public to private. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, private IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the value of **Ipv6AddressType**.
     * *   **DisableLoadBalancerIpv6Internet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of the task.
     *     *   If the ALB instance is in the **Configuring** state, the network type of the IPv6 address that is used by the ALB instance is being changed.
     *     *   If the ALB instance is in the **Active** state, the network type of the IPv6 address that is used by the ALB instance is changed.
     *
     * @param request DisableLoadBalancerIpv6InternetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableLoadBalancerIpv6InternetResponse
     */
    public DisableLoadBalancerIpv6InternetResponse disableLoadBalancerIpv6InternetWithOptions(DisableLoadBalancerIpv6InternetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableLoadBalancerIpv6Internet"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableLoadBalancerIpv6InternetResponse());
    }

    /**
     * @summary Changes the type of the IPv6 address that is used by a dual-stack Application Load Balancer (ALB) instance from public to private.
     *
     * @description ### Prerequisites
     * An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html) operation and set **AddressIpVersion** to **DualStack** to create a dual-stack ALB instance.
     * > If you set **AddressIpVersion** to **DualStack**:
     * *   If you set **AddressType** to **Internet**, the ALB instance uses a public IPv4 IP address and a private IPv6 address.
     * *   If you set **AddressType** to **Intranet**, the ALB instance uses a private IPv4 IP address and a private IPv6 address.
     * ### Description
     * *   After the DisableLoadBalancerIpv6Internet operation is called, the value of **Ipv6AddressType** is changed to **Intranet** and the type of the IPv6 address of the ALB instance is changed from public to private. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, private IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the value of **Ipv6AddressType**.
     * *   **DisableLoadBalancerIpv6Internet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of the task.
     *     *   If the ALB instance is in the **Configuring** state, the network type of the IPv6 address that is used by the ALB instance is being changed.
     *     *   If the ALB instance is in the **Active** state, the network type of the IPv6 address that is used by the ALB instance is changed.
     *
     * @param request DisableLoadBalancerIpv6InternetRequest
     * @return DisableLoadBalancerIpv6InternetResponse
     */
    public DisableLoadBalancerIpv6InternetResponse disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableLoadBalancerIpv6InternetWithOptions(request, runtime);
    }

    /**
     * @summary Disassociates access control lists (ACLs) from a listener.
     *
     * @description **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclRelations](https://help.aliyun.com/document_detail/213618.html) operation to query the status of the task.
     * *   If an ACL is in the **Dissociating** state, the ACL is being disassociated from the listener.
     * *   If an ACL is in the **Dissociated** state, the ACL is disassociated from the listener.
     *
     * @param request DissociateAclsFromListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateAclsFromListenerResponse
     */
    public DissociateAclsFromListenerResponse dissociateAclsFromListenerWithOptions(DissociateAclsFromListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAclsFromListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateAclsFromListenerResponse());
    }

    /**
     * @summary Disassociates access control lists (ACLs) from a listener.
     *
     * @description **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclRelations](https://help.aliyun.com/document_detail/213618.html) operation to query the status of the task.
     * *   If an ACL is in the **Dissociating** state, the ACL is being disassociated from the listener.
     * *   If an ACL is in the **Dissociated** state, the ACL is disassociated from the listener.
     *
     * @param request DissociateAclsFromListenerRequest
     * @return DissociateAclsFromListenerResponse
     */
    public DissociateAclsFromListenerResponse dissociateAclsFromListener(DissociateAclsFromListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateAclsFromListenerWithOptions(request, runtime);
    }

    /**
     * @summary Disassociates additional certificates from a listener.
     *
     * @description **DissociateAdditionalCertificatesFromListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListListenerCertificates](https://help.aliyun.com/document_detail/214354.html) operation to query the status of the task. - If an additional certificate is in the **Dissociating** state, the additional certificate is being disassociated. - If an additional certificate is in the **Dissociated** state, the additional certificate is disassociated.
     *
     * @param request DissociateAdditionalCertificatesFromListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListenerWithOptions(DissociateAdditionalCertificatesFromListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAdditionalCertificatesFromListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateAdditionalCertificatesFromListenerResponse());
    }

    /**
     * @summary Disassociates additional certificates from a listener.
     *
     * @description **DissociateAdditionalCertificatesFromListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListListenerCertificates](https://help.aliyun.com/document_detail/214354.html) operation to query the status of the task. - If an additional certificate is in the **Dissociating** state, the additional certificate is being disassociated. - If an additional certificate is in the **Dissociated** state, the additional certificate is disassociated.
     *
     * @param request DissociateAdditionalCertificatesFromListenerRequest
     * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateAdditionalCertificatesFromListenerWithOptions(request, runtime);
    }

    /**
     * @summary Enables deletion protection for a resource.
     *
     * @param request EnableDeletionProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDeletionProtectionResponse
     */
    public EnableDeletionProtectionResponse enableDeletionProtectionWithOptions(EnableDeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDeletionProtection"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeletionProtectionResponse());
    }

    /**
     * @summary Enables deletion protection for a resource.
     *
     * @param request EnableDeletionProtectionRequest
     * @return EnableDeletionProtectionResponse
     */
    public EnableDeletionProtectionResponse enableDeletionProtection(EnableDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDeletionProtectionWithOptions(request, runtime);
    }

    /**
     * @summary Enables the access log feature for an Application Load Balancer (ALB) instance.
     *
     * @param request EnableLoadBalancerAccessLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableLoadBalancerAccessLogResponse
     */
    public EnableLoadBalancerAccessLogResponse enableLoadBalancerAccessLogWithOptions(EnableLoadBalancerAccessLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProject)) {
            query.put("LogProject", request.logProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            query.put("LogStore", request.logStore);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableLoadBalancerAccessLog"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableLoadBalancerAccessLogResponse());
    }

    /**
     * @summary Enables the access log feature for an Application Load Balancer (ALB) instance.
     *
     * @param request EnableLoadBalancerAccessLogRequest
     * @return EnableLoadBalancerAccessLogResponse
     */
    public EnableLoadBalancerAccessLogResponse enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableLoadBalancerAccessLogWithOptions(request, runtime);
    }

    /**
     * @summary Changes the type of the IPv6 address that is used by a dual-stack Application Load Balancer (ALB) instance from private to public.
     *
     * @description ### Prerequisites
     * An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html) operation and set **AddressIpVersion** to **DualStack** to create a dual-stack ALB instance.
     * > If you set **AddressIpVersion** to **DualStack**:
     * *   If you set **AddressType** to **Internet**, the ALB instance uses a public IPv4 IP address and a private IPv6 address.
     * *   If you set **AddressType** to **Intranet**, the ALB instance uses a private IPv4 IP address and a private IPv6 address.
     * ### Description
     * *   After the EnableLoadBalancerIpv6Internet operation is called, the value of **Ipv6AddressType** is changed to **Internet** and the type of the IPv6 address of the ALB instance is changed from private to public. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, public IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the value of **Ipv6AddressType**.
     * *   **EnableLoadBalancerIpv6Internet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of the task.
     *     *   If the ALB instance is in the **Configuring** state, the network type of the IPv6 address that is used by the ALB instance is being changed.
     *     *   If the ALB instance is in the **Active** state, the network type of the IPv6 address that is used by the ALB instance is changed.
     *
     * @param request EnableLoadBalancerIpv6InternetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableLoadBalancerIpv6InternetResponse
     */
    public EnableLoadBalancerIpv6InternetResponse enableLoadBalancerIpv6InternetWithOptions(EnableLoadBalancerIpv6InternetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableLoadBalancerIpv6Internet"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableLoadBalancerIpv6InternetResponse());
    }

    /**
     * @summary Changes the type of the IPv6 address that is used by a dual-stack Application Load Balancer (ALB) instance from private to public.
     *
     * @description ### Prerequisites
     * An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html) operation and set **AddressIpVersion** to **DualStack** to create a dual-stack ALB instance.
     * > If you set **AddressIpVersion** to **DualStack**:
     * *   If you set **AddressType** to **Internet**, the ALB instance uses a public IPv4 IP address and a private IPv6 address.
     * *   If you set **AddressType** to **Intranet**, the ALB instance uses a private IPv4 IP address and a private IPv6 address.
     * ### Description
     * *   After the EnableLoadBalancerIpv6Internet operation is called, the value of **Ipv6AddressType** is changed to **Internet** and the type of the IPv6 address of the ALB instance is changed from private to public. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, public IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the value of **Ipv6AddressType**.
     * *   **EnableLoadBalancerIpv6Internet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of the task.
     *     *   If the ALB instance is in the **Configuring** state, the network type of the IPv6 address that is used by the ALB instance is being changed.
     *     *   If the ALB instance is in the **Active** state, the network type of the IPv6 address that is used by the ALB instance is changed.
     *
     * @param request EnableLoadBalancerIpv6InternetRequest
     * @return EnableLoadBalancerIpv6InternetResponse
     */
    public EnableLoadBalancerIpv6InternetResponse enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableLoadBalancerIpv6InternetWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a health check template.
     *
     * @param request GetHealthCheckTemplateAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHealthCheckTemplateAttributeResponse
     */
    public GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttributeWithOptions(GetHealthCheckTemplateAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateId)) {
            query.put("HealthCheckTemplateId", request.healthCheckTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHealthCheckTemplateAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthCheckTemplateAttributeResponse());
    }

    /**
     * @summary Queries the details about a health check template.
     *
     * @param request GetHealthCheckTemplateAttributeRequest
     * @return GetHealthCheckTemplateAttributeResponse
     */
    public GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHealthCheckTemplateAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a listener.
     *
     * @param request GetListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListenerAttributeResponse
     */
    public GetListenerAttributeResponse getListenerAttributeWithOptions(GetListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListenerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListenerAttributeResponse());
    }

    /**
     * @summary Queries the details about a listener.
     *
     * @param request GetListenerAttributeRequest
     * @return GetListenerAttributeResponse
     */
    public GetListenerAttributeResponse getListenerAttribute(GetListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the health check status of a listener and its forwarding rules.
     *
     * @param request GetListenerHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListenerHealthStatusResponse
     */
    public GetListenerHealthStatusResponse getListenerHealthStatusWithOptions(GetListenerHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeRule)) {
            query.put("IncludeRule", request.includeRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListenerHealthStatus"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListenerHealthStatusResponse());
    }

    /**
     * @summary Queries the health check status of a listener and its forwarding rules.
     *
     * @param request GetListenerHealthStatusRequest
     * @return GetListenerHealthStatusResponse
     */
    public GetListenerHealthStatusResponse getListenerHealthStatus(GetListenerHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getListenerHealthStatusWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of an Application Load Balancer (ALB) instance.
     *
     * @param request GetLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoadBalancerAttributeResponse
     */
    public GetLoadBalancerAttributeResponse getLoadBalancerAttributeWithOptions(GetLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoadBalancerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoadBalancerAttributeResponse());
    }

    /**
     * @summary Queries the details of an Application Load Balancer (ALB) instance.
     *
     * @param request GetLoadBalancerAttributeRequest
     * @return GetLoadBalancerAttributeResponse
     */
    public GetLoadBalancerAttributeResponse getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries AScript rules.
     *
     * @param request ListAScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAScriptsResponse
     */
    public ListAScriptsResponse listAScriptsWithOptions(ListAScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AScriptIds)) {
            query.put("AScriptIds", request.AScriptIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.AScriptNames)) {
            query.put("AScriptNames", request.AScriptNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerIds)) {
            query.put("ListenerIds", request.listenerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAScripts"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAScriptsResponse());
    }

    /**
     * @summary Queries AScript rules.
     *
     * @param request ListAScriptsRequest
     * @return ListAScriptsResponse
     */
    public ListAScriptsResponse listAScripts(ListAScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAScriptsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the entries of an access control list (ACL).
     *
     * @param request ListAclEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAclEntriesResponse
     */
    public ListAclEntriesResponse listAclEntriesWithOptions(ListAclEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAclEntries"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclEntriesResponse());
    }

    /**
     * @summary Queries the entries of an access control list (ACL).
     *
     * @param request ListAclEntriesRequest
     * @return ListAclEntriesResponse
     */
    public ListAclEntriesResponse listAclEntries(ListAclEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAclEntriesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the listeners that are associated with access control lists (ACLs).
     *
     * @param request ListAclRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAclRelationsResponse
     */
    public ListAclRelationsResponse listAclRelationsWithOptions(ListAclRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAclRelations"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclRelationsResponse());
    }

    /**
     * @summary Queries the listeners that are associated with access control lists (ACLs).
     *
     * @param request ListAclRelationsRequest
     * @return ListAclRelationsResponse
     */
    public ListAclRelationsResponse listAclRelations(ListAclRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAclRelationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the access control lists (ACLs) in a region.
     *
     * @param request ListAclsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAclsResponse
     */
    public ListAclsResponse listAclsWithOptions(ListAclsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclNames)) {
            query.put("AclNames", request.aclNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAcls"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclsResponse());
    }

    /**
     * @summary Queries the access control lists (ACLs) in a region.
     *
     * @param request ListAclsRequest
     * @return ListAclsResponse
     */
    public ListAclsResponse listAcls(ListAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAclsWithOptions(request, runtime);
    }

    /**
     * @summary Queries asynchronous tasks in a region.
     *
     * @param request ListAsynJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAsynJobsResponse
     */
    public ListAsynJobsResponse listAsynJobsWithOptions(ListAsynJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAsynJobs"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAsynJobsResponse());
    }

    /**
     * @summary Queries asynchronous tasks in a region.
     *
     * @param request ListAsynJobsRequest
     * @return ListAsynJobsResponse
     */
    public ListAsynJobsResponse listAsynJobs(ListAsynJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAsynJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries health check templates in a region.
     *
     * @param request ListHealthCheckTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHealthCheckTemplatesResponse
     */
    public ListHealthCheckTemplatesResponse listHealthCheckTemplatesWithOptions(ListHealthCheckTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateIds)) {
            query.put("HealthCheckTemplateIds", request.healthCheckTemplateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateNames)) {
            query.put("HealthCheckTemplateNames", request.healthCheckTemplateNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHealthCheckTemplates"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHealthCheckTemplatesResponse());
    }

    /**
     * @summary Queries health check templates in a region.
     *
     * @param request ListHealthCheckTemplatesRequest
     * @return ListHealthCheckTemplatesResponse
     */
    public ListHealthCheckTemplatesResponse listHealthCheckTemplates(ListHealthCheckTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHealthCheckTemplatesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the certificates that are associated with a listener, including additional certificates and the default certificate.
     *
     * @param request ListListenerCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListenerCertificatesResponse
     */
    public ListListenerCertificatesResponse listListenerCertificatesWithOptions(ListListenerCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateIds)) {
            query.put("CertificateIds", request.certificateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateType)) {
            query.put("CertificateType", request.certificateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenerCertificates"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenerCertificatesResponse());
    }

    /**
     * @summary Queries the certificates that are associated with a listener, including additional certificates and the default certificate.
     *
     * @param request ListListenerCertificatesRequest
     * @return ListListenerCertificatesResponse
     */
    public ListListenerCertificatesResponse listListenerCertificates(ListListenerCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenerCertificatesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the listeners in a region.
     *
     * @param request ListListenersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListenersResponse
     */
    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerIds)) {
            query.put("ListenerIds", request.listenerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            query.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListeners"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersResponse());
    }

    /**
     * @summary Queries the listeners in a region.
     *
     * @param request ListListenersRequest
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    /**
     * @summary Queries Application Load Balancer (ALB) instances in a region based on filter conditions.
     *
     * @param request ListLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancersWithOptions(ListLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressIpVersion)) {
            query.put("AddressIpVersion", request.addressIpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSName)) {
            query.put("DNSName", request.DNSName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressType)) {
            query.put("Ipv6AddressType", request.ipv6AddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerBussinessStatus)) {
            query.put("LoadBalancerBussinessStatus", request.loadBalancerBussinessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            query.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerNames)) {
            query.put("LoadBalancerNames", request.loadBalancerNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerStatus)) {
            query.put("LoadBalancerStatus", request.loadBalancerStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIds)) {
            query.put("VpcIds", request.vpcIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancers"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancersResponse());
    }

    /**
     * @summary Queries Application Load Balancer (ALB) instances in a region based on filter conditions.
     *
     * @param request ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLoadBalancersWithOptions(request, runtime);
    }

    /**
     * @summary Queries the forwarding rules in a region.
     *
     * @param request ListRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRulesResponse
     */
    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerIds)) {
            query.put("ListenerIds", request.listenerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            query.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    /**
     * @summary Queries the forwarding rules in a region.
     *
     * @param request ListRulesRequest
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries custom security policies in a region.
     *
     * @param request ListSecurityPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityPoliciesResponse
     */
    public ListSecurityPoliciesResponse listSecurityPoliciesWithOptions(ListSecurityPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyIds)) {
            query.put("SecurityPolicyIds", request.securityPolicyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyNames)) {
            query.put("SecurityPolicyNames", request.securityPolicyNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityPolicies"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityPoliciesResponse());
    }

    /**
     * @summary Queries custom security policies in a region.
     *
     * @param request ListSecurityPoliciesRequest
     * @return ListSecurityPoliciesResponse
     */
    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityPoliciesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the listeners that are associated with security policies.
     *
     * @param request ListSecurityPolicyRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityPolicyRelationsResponse
     */
    public ListSecurityPolicyRelationsResponse listSecurityPolicyRelationsWithOptions(ListSecurityPolicyRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyIds)) {
            query.put("SecurityPolicyIds", request.securityPolicyIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityPolicyRelations"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityPolicyRelationsResponse());
    }

    /**
     * @summary Queries the listeners that are associated with security policies.
     *
     * @param request ListSecurityPolicyRelationsRequest
     * @return ListSecurityPolicyRelationsResponse
     */
    public ListSecurityPolicyRelationsResponse listSecurityPolicyRelations(ListSecurityPolicyRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityPolicyRelationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries servers in a server group.
     *
     * @param request ListServerGroupServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerGroupServersResponse
     */
    public ListServerGroupServersResponse listServerGroupServersWithOptions(ListServerGroupServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverIds)) {
            query.put("ServerIds", request.serverIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerGroupServers"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerGroupServersResponse());
    }

    /**
     * @summary Queries servers in a server group.
     *
     * @param request ListServerGroupServersRequest
     * @return ListServerGroupServersResponse
     */
    public ListServerGroupServersResponse listServerGroupServers(ListServerGroupServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServerGroupServersWithOptions(request, runtime);
    }

    /**
     * @summary Queries server groups in a region.
     *
     * @param request ListServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroupsWithOptions(ListServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupIds)) {
            query.put("ServerGroupIds", request.serverGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupNames)) {
            query.put("ServerGroupNames", request.serverGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupType)) {
            query.put("ServerGroupType", request.serverGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerGroups"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerGroupsResponse());
    }

    /**
     * @summary Queries server groups in a region.
     *
     * @param request ListServerGroupsRequest
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries system security policies in a region.
     *
     * @param request ListSystemSecurityPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPoliciesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemSecurityPolicies"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSystemSecurityPoliciesResponse());
    }

    /**
     * @summary Queries system security policies in a region.
     *
     * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSystemSecurityPoliciesWithOptions(runtime);
    }

    /**
     * @summary Queries tag keys.
     *
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * @summary Queries tag keys.
     *
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * @summary Queries the tags of resources.
     *
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * @summary Queries the tags of resources.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Queries tag values.
     *
     * @param request ListTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    /**
     * @summary Queries tag values.
     *
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * @summary Moves a resource to another resource group.
     *
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * @summary Moves a resource to another resource group.
     *
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Removes entries from an access control list (ACL).
     *
     * @description **RemoveEntriesFromAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclEntries](https://help.aliyun.com/document_detail/213616.html) operation to query the status of the task.
     * *   If an ACL is in the **Removing** state, the entries are being removed.
     * *   If an ACL cannot be found, the entries are removed.
     *
     * @param request RemoveEntriesFromAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveEntriesFromAclResponse
     */
    public RemoveEntriesFromAclResponse removeEntriesFromAclWithOptions(RemoveEntriesFromAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entries)) {
            query.put("Entries", request.entries);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEntriesFromAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveEntriesFromAclResponse());
    }

    /**
     * @summary Removes entries from an access control list (ACL).
     *
     * @description **RemoveEntriesFromAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclEntries](https://help.aliyun.com/document_detail/213616.html) operation to query the status of the task.
     * *   If an ACL is in the **Removing** state, the entries are being removed.
     * *   If an ACL cannot be found, the entries are removed.
     *
     * @param request RemoveEntriesFromAclRequest
     * @return RemoveEntriesFromAclResponse
     */
    public RemoveEntriesFromAclResponse removeEntriesFromAcl(RemoveEntriesFromAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEntriesFromAclWithOptions(request, runtime);
    }

    /**
     * @summary Removes backend servers from a server group.
     *
     * @description **RemoveServersFromServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     *     *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     *     *   If a backend server is in the **Removing** state, the server is being removed from the server group.
     *     *   If a backend server cannot be found, the server is no longer in the server group.
     *
     * @param request RemoveServersFromServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveServersFromServerGroupResponse
     */
    public RemoveServersFromServerGroupResponse removeServersFromServerGroupWithOptions(RemoveServersFromServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servers)) {
            query.put("Servers", request.servers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveServersFromServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveServersFromServerGroupResponse());
    }

    /**
     * @summary Removes backend servers from a server group.
     *
     * @description **RemoveServersFromServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     *     *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     *     *   If a backend server is in the **Removing** state, the server is being removed from the server group.
     *     *   If a backend server cannot be found, the server is no longer in the server group.
     *
     * @param request RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    public RemoveServersFromServerGroupResponse removeServersFromServerGroup(RemoveServersFromServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeServersFromServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Replaces backend servers in a server group.
     *
     * @description **ReplaceServersInServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     *     *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     *     *   If a backend server is in the **Replacing** state, it indicates that the server is being removed from the server group and a new server is added to the server group.
     *     *   If a backend server is in the \\*\\*Available\\*\\* state, it indicates that the server is running.
     *
     * @param request ReplaceServersInServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceServersInServerGroupResponse
     */
    public ReplaceServersInServerGroupResponse replaceServersInServerGroupWithOptions(ReplaceServersInServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addedServers)) {
            query.put("AddedServers", request.addedServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removedServers)) {
            query.put("RemovedServers", request.removedServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceServersInServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceServersInServerGroupResponse());
    }

    /**
     * @summary Replaces backend servers in a server group.
     *
     * @description **ReplaceServersInServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     *     *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     *     *   If a backend server is in the **Replacing** state, it indicates that the server is being removed from the server group and a new server is added to the server group.
     *     *   If a backend server is in the \\*\\*Available\\*\\* state, it indicates that the server is running.
     *
     * @param request ReplaceServersInServerGroupRequest
     * @return ReplaceServersInServerGroupResponse
     */
    public ReplaceServersInServerGroupResponse replaceServersInServerGroup(ReplaceServersInServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceServersInServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Enables a listener.
     *
     * @description **StartListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) to query the status of the task.
     * *   If a listener is in the **Configuring** state, the listener is being enabled.
     * *   If a listener is in the **Running** state, the listener is enabled.
     *
     * @param request StartListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartListenerResponse
     */
    public StartListenerResponse startListenerWithOptions(StartListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartListenerResponse());
    }

    /**
     * @summary Enables a listener.
     *
     * @description **StartListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) to query the status of the task.
     * *   If a listener is in the **Configuring** state, the listener is being enabled.
     * *   If a listener is in the **Running** state, the listener is enabled.
     *
     * @param request StartListenerRequest
     * @return StartListenerResponse
     */
    public StartListenerResponse startListener(StartListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startListenerWithOptions(request, runtime);
    }

    /**
     * @summary Removes an elastic IP address (EIP) or a virtual IP address (VIP) of a zone from a DNS record.
     *
     * @description This operation is supported by Application Load Balancer (ALB) instances that use static IP addresses. The zone cannot be removed if the ALB instance has only one available zone.
     *
     * @param request StartShiftLoadBalancerZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartShiftLoadBalancerZonesResponse
     */
    public StartShiftLoadBalancerZonesResponse startShiftLoadBalancerZonesWithOptions(StartShiftLoadBalancerZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartShiftLoadBalancerZones"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartShiftLoadBalancerZonesResponse());
    }

    /**
     * @summary Removes an elastic IP address (EIP) or a virtual IP address (VIP) of a zone from a DNS record.
     *
     * @description This operation is supported by Application Load Balancer (ALB) instances that use static IP addresses. The zone cannot be removed if the ALB instance has only one available zone.
     *
     * @param request StartShiftLoadBalancerZonesRequest
     * @return StartShiftLoadBalancerZonesResponse
     */
    public StartShiftLoadBalancerZonesResponse startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startShiftLoadBalancerZonesWithOptions(request, runtime);
    }

    /**
     * @summary Disables a listener.
     *
     * @description **StopListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) operation to query the status of the task:
     * *   If a listener is in the **Configuring** state, the listener is being disabled.
     * *   If a listener is in the **Stopped** state, the listener is disabled.
     *
     * @param request StopListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopListenerResponse
     */
    public StopListenerResponse stopListenerWithOptions(StopListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopListenerResponse());
    }

    /**
     * @summary Disables a listener.
     *
     * @description **StopListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) operation to query the status of the task:
     * *   If a listener is in the **Configuring** state, the listener is being disabled.
     * *   If a listener is in the **Stopped** state, the listener is disabled.
     *
     * @param request StopListenerRequest
     * @return StopListenerResponse
     */
    public StopListenerResponse stopListener(StopListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopListenerWithOptions(request, runtime);
    }

    /**
     * @summary Adds tags to resources.
     *
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * @summary Adds tags to resources.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Removes tags from resources.
     *
     * @param request UnTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    /**
     * @summary Removes tags from resources.
     *
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Updates AScript rules.
     *
     * @description *   **UpdateAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](https://help.aliyun.com/document_detail/472574.html) operation to query the status of the task.
     *     *   If an AScript rule is in the **Configuring** state, the AScript rule is being updated.
     *     *   If an AScript rule is in the **Available** state, the AScript rule is updated.
     * *   In the following table, the maximum value of **N** is **4**.
     *
     * @param request UpdateAScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAScriptsResponse
     */
    public UpdateAScriptsResponse updateAScriptsWithOptions(UpdateAScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AScripts)) {
            query.put("AScripts", request.AScripts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAScripts"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAScriptsResponse());
    }

    /**
     * @summary Updates AScript rules.
     *
     * @description *   **UpdateAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](https://help.aliyun.com/document_detail/472574.html) operation to query the status of the task.
     *     *   If an AScript rule is in the **Configuring** state, the AScript rule is being updated.
     *     *   If an AScript rule is in the **Available** state, the AScript rule is updated.
     * *   In the following table, the maximum value of **N** is **4**.
     *
     * @param request UpdateAScriptsRequest
     * @return UpdateAScriptsResponse
     */
    public UpdateAScriptsResponse updateAScripts(UpdateAScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAScriptsWithOptions(request, runtime);
    }

    /**
     * @summary Updates the attributes of an access control list (ACL), such as the name.
     *
     * @param request UpdateAclAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAclAttributeResponse
     */
    public UpdateAclAttributeResponse updateAclAttributeWithOptions(UpdateAclAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAclAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAclAttributeResponse());
    }

    /**
     * @summary Updates the attributes of an access control list (ACL), such as the name.
     *
     * @param request UpdateAclAttributeRequest
     * @return UpdateAclAttributeResponse
     */
    public UpdateAclAttributeResponse updateAclAttribute(UpdateAclAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAclAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the attributes, such as the name and protocol, of a health check template.
     *
     * @param request UpdateHealthCheckTemplateAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHealthCheckTemplateAttributeResponse
     */
    public UpdateHealthCheckTemplateAttributeResponse updateHealthCheckTemplateAttributeWithOptions(UpdateHealthCheckTemplateAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckCodes)) {
            query.put("HealthCheckCodes", request.healthCheckCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHost)) {
            query.put("HealthCheckHost", request.healthCheckHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpVersion)) {
            query.put("HealthCheckHttpVersion", request.healthCheckHttpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPath)) {
            query.put("HealthCheckPath", request.healthCheckPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckProtocol)) {
            query.put("HealthCheckProtocol", request.healthCheckProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateId)) {
            query.put("HealthCheckTemplateId", request.healthCheckTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTemplateName)) {
            query.put("HealthCheckTemplateName", request.healthCheckTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHealthCheckTemplateAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHealthCheckTemplateAttributeResponse());
    }

    /**
     * @summary Modifies the attributes, such as the name and protocol, of a health check template.
     *
     * @param request UpdateHealthCheckTemplateAttributeRequest
     * @return UpdateHealthCheckTemplateAttributeResponse
     */
    public UpdateHealthCheckTemplateAttributeResponse updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHealthCheckTemplateAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Updates the attributes of a listener, such as the name and the default action.
     *
     * @description **UpdateListenerAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) operation to query the status of the task.
     * *   If a listener is in the **Configuring** state, the configuration of the listener is being modified.
     * *   If a listener is in the **Running** state, the configuration of the listener is modified.
     *
     * @param request UpdateListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateListenerAttributeResponse
     */
    public UpdateListenerAttributeResponse updateListenerAttributeWithOptions(UpdateListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertificates)) {
            query.put("CaCertificates", request.caCertificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caEnabled)) {
            query.put("CaEnabled", request.caEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultActions)) {
            query.put("DefaultActions", request.defaultActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzipEnabled)) {
            query.put("GzipEnabled", request.gzipEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Enabled)) {
            query.put("Http2Enabled", request.http2Enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerDescription)) {
            query.put("ListenerDescription", request.listenerDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quicConfig)) {
            query.put("QuicConfig", request.quicConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedForConfig)) {
            query.put("XForwardedForConfig", request.XForwardedForConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListenerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerAttributeResponse());
    }

    /**
     * @summary Updates the attributes of a listener, such as the name and the default action.
     *
     * @description **UpdateListenerAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) operation to query the status of the task.
     * *   If a listener is in the **Configuring** state, the configuration of the listener is being modified.
     * *   If a listener is in the **Running** state, the configuration of the listener is modified.
     *
     * @param request UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    public UpdateListenerAttributeResponse updateListenerAttribute(UpdateListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Updates the log configuration of a listener, such as the access log configuration.
     *
     * @description **UpdateListenerLogConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) to query the status of the task:
     * *   If a listener is in the **Configuring** state, the log configuration of the listener is being modified.
     * *   If a listener is in the **Running** state, the log configuration of the listener is modified.
     * > You can update the log configuration of a listener only after you enable the access log feature.
     *
     * @param request UpdateListenerLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateListenerLogConfigResponse
     */
    public UpdateListenerLogConfigResponse updateListenerLogConfigWithOptions(UpdateListenerLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLogRecordCustomizedHeadersEnabled)) {
            query.put("AccessLogRecordCustomizedHeadersEnabled", request.accessLogRecordCustomizedHeadersEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogTracingConfig)) {
            query.put("AccessLogTracingConfig", request.accessLogTracingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListenerLogConfig"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerLogConfigResponse());
    }

    /**
     * @summary Updates the log configuration of a listener, such as the access log configuration.
     *
     * @description **UpdateListenerLogConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](https://help.aliyun.com/document_detail/2254865.html) to query the status of the task:
     * *   If a listener is in the **Configuring** state, the log configuration of the listener is being modified.
     * *   If a listener is in the **Running** state, the log configuration of the listener is modified.
     * > You can update the log configuration of a listener only after you enable the access log feature.
     *
     * @param request UpdateListenerLogConfigRequest
     * @return UpdateListenerLogConfigResponse
     */
    public UpdateListenerLogConfigResponse updateListenerLogConfig(UpdateListenerLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListenerLogConfigWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the network type of an Application Load Balancer (ALB) instance.
     *
     * @description ## Prerequisites
     * *   An ALB instance is created. For more information about how to create an ALB instance, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html).
     * *   If you want to change the network type from internal-facing to Internet-facing, you must first create an elastic IP address (EIP). For more information, see [AllocateEipAddress](https://help.aliyun.com/document_detail/120192.html).
     * ## Usage notes
     * **UpdateLoadBalancerAddressTypeConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of the task.
     * *   If an ALB instance is in the **Configuring** state, the network type is being changed.
     * *   If an ALB instance is in the **Active** state, the network type has been changed.
     *
     * @param request UpdateLoadBalancerAddressTypeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerAddressTypeConfigResponse
     */
    public UpdateLoadBalancerAddressTypeConfigResponse updateLoadBalancerAddressTypeConfigWithOptions(UpdateLoadBalancerAddressTypeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerAddressTypeConfig"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerAddressTypeConfigResponse());
    }

    /**
     * @summary Modifies the network type of an Application Load Balancer (ALB) instance.
     *
     * @description ## Prerequisites
     * *   An ALB instance is created. For more information about how to create an ALB instance, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/214358.html).
     * *   If you want to change the network type from internal-facing to Internet-facing, you must first create an elastic IP address (EIP). For more information, see [AllocateEipAddress](https://help.aliyun.com/document_detail/120192.html).
     * ## Usage notes
     * **UpdateLoadBalancerAddressTypeConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) operation to query the status of the task.
     * *   If an ALB instance is in the **Configuring** state, the network type is being changed.
     * *   If an ALB instance is in the **Active** state, the network type has been changed.
     *
     * @param request UpdateLoadBalancerAddressTypeConfigRequest
     * @return UpdateLoadBalancerAddressTypeConfigResponse
     */
    public UpdateLoadBalancerAddressTypeConfigResponse updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerAddressTypeConfigWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the attributes of an Application Load Balancer (ALB) instance, such as the name and the configuration read-only mode.
     *
     * @description **UpdateLoadBalancerAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If the ALB instance is in the **Configuring** state, the ALB instance is being modified.
     * *   If the ALB instance is in the **Active** state, the ALB instance is modified.
     *
     * @param request UpdateLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerAttributeResponse
     */
    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttributeWithOptions(UpdateLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modificationProtectionConfig)) {
            query.put("ModificationProtectionConfig", request.modificationProtectionConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerAttributeResponse());
    }

    /**
     * @summary Modifies the attributes of an Application Load Balancer (ALB) instance, such as the name and the configuration read-only mode.
     *
     * @description **UpdateLoadBalancerAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If the ALB instance is in the **Configuring** state, the ALB instance is being modified.
     * *   If the ALB instance is in the **Active** state, the ALB instance is modified.
     *
     * @param request UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Changes the edition of an Application Load Balancer (ALB) instance.
     *
     * @description ##
     * *   You can upgrade a basic ALB instance to a standard ALB instance or a WAF-enabled ALB instance but you cannot downgrade a standard ALB instance or a WAF-enabled ALB instance to a basic ALB instance. For more information, see [Upgrade an ALB instance](https://help.aliyun.com/document_detail/214654.html).
     * *   **UpdateLoadBalancerEdition** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     *     *   If the ALB instance is in the **Configuring** state, the edition of the ALB instance is being modified.
     *     *   If the ALB instance is in the **Active** state, the edition of the ALB instance has been modified.
     *
     * @param request UpdateLoadBalancerEditionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerEditionResponse
     */
    public UpdateLoadBalancerEditionResponse updateLoadBalancerEditionWithOptions(UpdateLoadBalancerEditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerEdition)) {
            query.put("LoadBalancerEdition", request.loadBalancerEdition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerEdition"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerEditionResponse());
    }

    /**
     * @summary Changes the edition of an Application Load Balancer (ALB) instance.
     *
     * @description ##
     * *   You can upgrade a basic ALB instance to a standard ALB instance or a WAF-enabled ALB instance but you cannot downgrade a standard ALB instance or a WAF-enabled ALB instance to a basic ALB instance. For more information, see [Upgrade an ALB instance](https://help.aliyun.com/document_detail/214654.html).
     * *   **UpdateLoadBalancerEdition** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     *     *   If the ALB instance is in the **Configuring** state, the edition of the ALB instance is being modified.
     *     *   If the ALB instance is in the **Active** state, the edition of the ALB instance has been modified.
     *
     * @param request UpdateLoadBalancerEditionRequest
     * @return UpdateLoadBalancerEditionResponse
     */
    public UpdateLoadBalancerEditionResponse updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerEditionWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the zones of an Application Load Balancer (ALB) instance.
     *
     * @description **UpdateLoadBalancerZones** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If an ALB instance is in the **Configuring** state, the zones are being modified.
     * *   If an ALB instance is in the **Active** state, the zones are modified.
     * > You may be charged after you call UpdateLoadBalancerZones.
     *
     * @param request UpdateLoadBalancerZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerZonesResponse
     */
    public UpdateLoadBalancerZonesResponse updateLoadBalancerZonesWithOptions(UpdateLoadBalancerZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerZones"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerZonesResponse());
    }

    /**
     * @summary Modifies the zones of an Application Load Balancer (ALB) instance.
     *
     * @description **UpdateLoadBalancerZones** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](https://help.aliyun.com/document_detail/214362.html) to query the status of the task.
     * *   If an ALB instance is in the **Configuring** state, the zones are being modified.
     * *   If an ALB instance is in the **Active** state, the zones are modified.
     * > You may be charged after you call UpdateLoadBalancerZones.
     *
     * @param request UpdateLoadBalancerZonesRequest
     * @return UpdateLoadBalancerZonesResponse
     */
    public UpdateLoadBalancerZonesResponse updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerZonesWithOptions(request, runtime);
    }

    /**
     * @summary Updates a forwarding rule, such as the match condition, action, and name.
     *
     * @description *   **UpdateRuleAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of a forwarding rule:
     *     *   If a forwarding rule is in the **Configuring** state, the forwarding rule is being updated.
     *     *   If a forwarding rule is in the **Available** state, the forwarding rule is updated.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:
     *     *   Number of conditions: You can specify at most 5 for a basic Application Load Balancer (ALB) instance, at most 10 for a standard ALB instance, and at most 10 for a WAF-enabled ALB instance.
     *     *   Number of actions: You can specify at most 3 for a basic ALB instance, at most 5 for a standard ALB instance, and at most 5 for a WAF-enabled ALB instance.
     *
     * @param request UpdateRuleAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleAttributeResponse
     */
    public UpdateRuleAttributeResponse updateRuleAttributeWithOptions(UpdateRuleAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleActions)) {
            query.put("RuleActions", request.ruleActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConditions)) {
            query.put("RuleConditions", request.ruleConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleAttributeResponse());
    }

    /**
     * @summary Updates a forwarding rule, such as the match condition, action, and name.
     *
     * @description *   **UpdateRuleAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of a forwarding rule:
     *     *   If a forwarding rule is in the **Configuring** state, the forwarding rule is being updated.
     *     *   If a forwarding rule is in the **Available** state, the forwarding rule is updated.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:
     *     *   Number of conditions: You can specify at most 5 for a basic Application Load Balancer (ALB) instance, at most 10 for a standard ALB instance, and at most 10 for a WAF-enabled ALB instance.
     *     *   Number of actions: You can specify at most 3 for a basic ALB instance, at most 5 for a standard ALB instance, and at most 5 for a WAF-enabled ALB instance.
     *
     * @param request UpdateRuleAttributeRequest
     * @return UpdateRuleAttributeResponse
     */
    public UpdateRuleAttributeResponse updateRuleAttribute(UpdateRuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the attributes of forwarding rules.
     *
     * @description **UpdateRulesAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of the task.
     * *   If a forwarding rule is in the **Configuring** state, the forwarding rule is being updated.
     * *   If a forwarding rule is in the **Available** state, the forwarding rule is updated.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the maximum number of conditions and the maximum number of actions in each forwarding rule:
     *     *   Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.
     *     *   Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.
     *
     * @param request UpdateRulesAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRulesAttributeResponse
     */
    public UpdateRulesAttributeResponse updateRulesAttributeWithOptions(UpdateRulesAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRulesAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRulesAttributeResponse());
    }

    /**
     * @summary Modifies the attributes of forwarding rules.
     *
     * @description **UpdateRulesAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](https://help.aliyun.com/document_detail/214379.html) operation to query the status of the task.
     * *   If a forwarding rule is in the **Configuring** state, the forwarding rule is being updated.
     * *   If a forwarding rule is in the **Available** state, the forwarding rule is updated.
     * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the maximum number of conditions and the maximum number of actions in each forwarding rule:
     *     *   Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.
     *     *   Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.
     *
     * @param request UpdateRulesAttributeRequest
     * @return UpdateRulesAttributeResponse
     */
    public UpdateRulesAttributeResponse updateRulesAttribute(UpdateRulesAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRulesAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Updates the attributes of a security policy, such as the TLS protocol version and the supported cipher suites.
     *
     * @description ##
     * **UpdateSecurityPolicyAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListSecurityPolicies](https://help.aliyun.com/document_detail/213609.html) to query the status of the task.
     * *   If a security policy is in the **Configuring** state, the security policy is being updated.
     * *   If a security policy is in the **Available** state, the security policy is updated.
     *
     * @param request UpdateSecurityPolicyAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityPolicyAttributeResponse
     */
    public UpdateSecurityPolicyAttributeResponse updateSecurityPolicyAttributeWithOptions(UpdateSecurityPolicyAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphers)) {
            query.put("Ciphers", request.ciphers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyName)) {
            query.put("SecurityPolicyName", request.securityPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSVersions)) {
            query.put("TLSVersions", request.TLSVersions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecurityPolicyAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityPolicyAttributeResponse());
    }

    /**
     * @summary Updates the attributes of a security policy, such as the TLS protocol version and the supported cipher suites.
     *
     * @description ##
     * **UpdateSecurityPolicyAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListSecurityPolicies](https://help.aliyun.com/document_detail/213609.html) to query the status of the task.
     * *   If a security policy is in the **Configuring** state, the security policy is being updated.
     * *   If a security policy is in the **Available** state, the security policy is updated.
     *
     * @param request UpdateSecurityPolicyAttributeRequest
     * @return UpdateSecurityPolicyAttributeResponse
     */
    public UpdateSecurityPolicyAttributeResponse updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityPolicyAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of a server group, such as health checks, session persistence, server group names, routing algorithms, and protocols.
     *
     * @description ## Description
     * **UpdateServerGroupAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group:
     * *   If a server group is in the **Configuring** state, the configuration of the server group is being modified.
     * *   If a server group is in the **Available** state, the configuration of the server group is modified.
     *
     * @param request UpdateServerGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServerGroupAttributeResponse
     */
    public UpdateServerGroupAttributeResponse updateServerGroupAttributeWithOptions(UpdateServerGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrainConfig)) {
            query.put("ConnectionDrainConfig", request.connectionDrainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConfig)) {
            query.put("HealthCheckConfig", request.healthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupName)) {
            query.put("ServerGroupName", request.serverGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slowStartConfig)) {
            query.put("SlowStartConfig", request.slowStartConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionConfig)) {
            query.put("StickySessionConfig", request.stickySessionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uchConfig)) {
            query.put("UchConfig", request.uchConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamKeepaliveEnabled)) {
            query.put("UpstreamKeepaliveEnabled", request.upstreamKeepaliveEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServerGroupAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerGroupAttributeResponse());
    }

    /**
     * @summary Modifies the configurations of a server group, such as health checks, session persistence, server group names, routing algorithms, and protocols.
     *
     * @description ## Description
     * **UpdateServerGroupAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group:
     * *   If a server group is in the **Configuring** state, the configuration of the server group is being modified.
     * *   If a server group is in the **Available** state, the configuration of the server group is modified.
     *
     * @param request UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    public UpdateServerGroupAttributeResponse updateServerGroupAttribute(UpdateServerGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServerGroupAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations, such as the backend server weight and description, of a server group.
     *
     * @description **UpdateServerGroupServersAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     *     *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     *     *   If a backend server is in the **Configuring** state, it indicates that the backend server is being modified.
     *     *   If a backend server is in the **Available** state, it indicates that the backend server is running.
     *
     * @param request UpdateServerGroupServersAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServerGroupServersAttributeResponse
     */
    public UpdateServerGroupServersAttributeResponse updateServerGroupServersAttributeWithOptions(UpdateServerGroupServersAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            query.put("ServerGroupId", request.serverGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servers)) {
            query.put("Servers", request.servers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServerGroupServersAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerGroupServersAttributeResponse());
    }

    /**
     * @summary Modifies the configurations, such as the backend server weight and description, of a server group.
     *
     * @description **UpdateServerGroupServersAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
     * 1.  You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query the status of a server group.
     *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
     *     *   If a server group is in the **Available** state, it indicates that the server group is running.
     * 2.  You can call the [ListServerGroupServers](https://help.aliyun.com/document_detail/213628.html) operation to query the status of a backend server.
     *     *   If a backend server is in the **Configuring** state, it indicates that the backend server is being modified.
     *     *   If a backend server is in the **Available** state, it indicates that the backend server is running.
     *
     * @param request UpdateServerGroupServersAttributeRequest
     * @return UpdateServerGroupServersAttributeResponse
     */
    public UpdateServerGroupServersAttributeResponse updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServerGroupServersAttributeWithOptions(request, runtime);
    }
}
