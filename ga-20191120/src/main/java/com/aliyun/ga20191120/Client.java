// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120;

import com.aliyun.tea.*;
import com.aliyun.ga20191120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ga", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * *   The **AddEntriesToAcl** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the status of an ACL:
      *     *   If an ACL is in the **configuring** state, the IP entries are being added. In this case, you can perform only query operations.
      *     *   If an ACL is in the **active** state, the IP entries are added.
      * *   You cannot repeatedly call the **AddEntriesToAcl** operation for the same Global Accelerator (GA) instance within the specified period of time.
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEntriesToAcl"),
            new TeaPair("version", "2019-11-20"),
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
      * *   The **AddEntriesToAcl** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the status of an ACL:
      *     *   If an ACL is in the **configuring** state, the IP entries are being added. In this case, you can perform only query operations.
      *     *   If an ACL is in the **active** state, the IP entries are added.
      * *   You cannot repeatedly call the **AddEntriesToAcl** operation for the same Global Accelerator (GA) instance within the specified period of time.
      *
      * @param request AddEntriesToAclRequest
      * @return AddEntriesToAclResponse
     */
    public AddEntriesToAclResponse addEntriesToAcl(AddEntriesToAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEntriesToAclWithOptions(request, runtime);
    }

    /**
      * *   **AssociateAclsWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of the listener with which you attempt to associate an ACL.
      *     *   If the listener is in the **updating** state, it indicates that the ACL is being associated. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the ACL is associated.
      * *   The **AssociateAclsWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAclsWithListener"),
            new TeaPair("version", "2019-11-20"),
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
      * *   **AssociateAclsWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of the listener with which you attempt to associate an ACL.
      *     *   If the listener is in the **updating** state, it indicates that the ACL is being associated. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the ACL is associated.
      * *   The **AssociateAclsWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request AssociateAclsWithListenerRequest
      * @return AssociateAclsWithListenerResponse
     */
    public AssociateAclsWithListenerResponse associateAclsWithListener(AssociateAclsWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateAclsWithListenerWithOptions(request, runtime);
    }

    /**
      * *   You can associate additional certificates with only HTTPS listeners.
      * *   **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of the listener with which you attempt to associate an additional certificate.
      *     *   If the listener is in the **updating** state, it indicates that the additional certificate is being associated. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the additional certificate is associated.
      * *   The **AssociateAdditionalCertificatesWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request AssociateAdditionalCertificatesWithListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListenerWithOptions(AssociateAdditionalCertificatesWithListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAdditionalCertificatesWithListener"),
            new TeaPair("version", "2019-11-20"),
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
      * *   You can associate additional certificates with only HTTPS listeners.
      * *   **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of the listener with which you attempt to associate an additional certificate.
      *     *   If the listener is in the **updating** state, it indicates that the additional certificate is being associated. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the additional certificate is associated.
      * *   The **AssociateAdditionalCertificatesWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request AssociateAdditionalCertificatesWithListenerRequest
      * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateAdditionalCertificatesWithListenerWithOptions(request, runtime);
    }

    /**
      * When you call this operation, take note of the following items:
      * *   When you call this operation, the system checks whether the GA instance assumes the service-linked role AliyunServiceRoleForGaAntiDdos. In this case, the following rules apply to the GA instance:
      *     *   If the GA instance does not assume the service-linked role AliyunServiceRoleForGaAntiDdos, the system automatically creates the service-linked role and attaches the policy AliyunServiceRolePolicyForGaAntiDdos to the service-linked role. This allows GA to access the Anti-DDoS Pro/Premium instance.
      *     *   If the GA instance assumes the service-linked role AliyunServiceRoleForGaAntiDdos, the system does not create the service-linked role again.
      *     For more information, see [AliyunServiceRoleForGaAntiDdos](~~186805~~).
      * *   **AttachDdosToAccelerator** is an asynchronous operation. After you call the operation, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, the Anti-DDoS Pro/Premium instance is being associated with the GA instance. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the Anti-DDoS Pro/Premium instance is associated with the GA instance.
      * *   You cannot repeatedly call the **AttachDdosToAccelerator** operation for the same GA instance within a specific period of time.
      *
      * @param request AttachDdosToAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachDdosToAcceleratorResponse
     */
    public AttachDdosToAcceleratorResponse attachDdosToAcceleratorWithOptions(AttachDdosToAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosId)) {
            query.put("DdosId", request.ddosId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDdosToAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDdosToAcceleratorResponse());
    }

    /**
      * When you call this operation, take note of the following items:
      * *   When you call this operation, the system checks whether the GA instance assumes the service-linked role AliyunServiceRoleForGaAntiDdos. In this case, the following rules apply to the GA instance:
      *     *   If the GA instance does not assume the service-linked role AliyunServiceRoleForGaAntiDdos, the system automatically creates the service-linked role and attaches the policy AliyunServiceRolePolicyForGaAntiDdos to the service-linked role. This allows GA to access the Anti-DDoS Pro/Premium instance.
      *     *   If the GA instance assumes the service-linked role AliyunServiceRoleForGaAntiDdos, the system does not create the service-linked role again.
      *     For more information, see [AliyunServiceRoleForGaAntiDdos](~~186805~~).
      * *   **AttachDdosToAccelerator** is an asynchronous operation. After you call the operation, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, the Anti-DDoS Pro/Premium instance is being associated with the GA instance. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the Anti-DDoS Pro/Premium instance is associated with the GA instance.
      * *   You cannot repeatedly call the **AttachDdosToAccelerator** operation for the same GA instance within a specific period of time.
      *
      * @param request AttachDdosToAcceleratorRequest
      * @return AttachDdosToAcceleratorResponse
     */
    public AttachDdosToAcceleratorResponse attachDdosToAccelerator(AttachDdosToAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDdosToAcceleratorWithOptions(request, runtime);
    }

    /**
      * *   **AttachLogStoreToEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that a Logstore is being associated with the group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that a Logstore is associated with the group.
      * *   The **AttachLogStoreToEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request AttachLogStoreToEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachLogStoreToEndpointGroupResponse
     */
    public AttachLogStoreToEndpointGroupResponse attachLogStoreToEndpointGroupWithOptions(AttachLogStoreToEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupIds)) {
            query.put("EndpointGroupIds", request.endpointGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStoreName)) {
            query.put("SlsLogStoreName", request.slsLogStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectName)) {
            query.put("SlsProjectName", request.slsProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            query.put("SlsRegionId", request.slsRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachLogStoreToEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachLogStoreToEndpointGroupResponse());
    }

    /**
      * *   **AttachLogStoreToEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that a Logstore is being associated with the group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that a Logstore is associated with the group.
      * *   The **AttachLogStoreToEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request AttachLogStoreToEndpointGroupRequest
      * @return AttachLogStoreToEndpointGroupResponse
     */
    public AttachLogStoreToEndpointGroupResponse attachLogStoreToEndpointGroup(AttachLogStoreToEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLogStoreToEndpointGroupWithOptions(request, runtime);
    }

    /**
      * *   **BandwidthPackageAddAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan that you attempt to associate.
      *     *   If the bandwidth plan is in the **binding** state, it indicates that the bandwidth plan is being associated. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is associated.
      * *   The **BandwidthPackageAddAccelerator** operation cannot be called repeatedly for the same GA instance.
      *
      * @param request BandwidthPackageAddAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BandwidthPackageAddAcceleratorResponse
     */
    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAcceleratorWithOptions(BandwidthPackageAddAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BandwidthPackageAddAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BandwidthPackageAddAcceleratorResponse());
    }

    /**
      * *   **BandwidthPackageAddAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan that you attempt to associate.
      *     *   If the bandwidth plan is in the **binding** state, it indicates that the bandwidth plan is being associated. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is associated.
      * *   The **BandwidthPackageAddAccelerator** operation cannot be called repeatedly for the same GA instance.
      *
      * @param request BandwidthPackageAddAcceleratorRequest
      * @return BandwidthPackageAddAcceleratorResponse
     */
    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bandwidthPackageAddAcceleratorWithOptions(request, runtime);
    }

    /**
      * *   **BandwidthPackageRemoveAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan that you attempt to disassociate.
      *     *   If the bandwidth plan is in the **unbinding** state, it indicates that the bandwidth plan is being disassociated. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is disassociated.
      * *   The **BandwidthPackageRemoveAccelerator** cannot be called repeatedly for the same GA instance.
      *
      * @param request BandwidthPackageRemoveAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BandwidthPackageRemoveAcceleratorResponse
     */
    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAcceleratorWithOptions(BandwidthPackageRemoveAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BandwidthPackageRemoveAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BandwidthPackageRemoveAcceleratorResponse());
    }

    /**
      * *   **BandwidthPackageRemoveAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan that you attempt to disassociate.
      *     *   If the bandwidth plan is in the **unbinding** state, it indicates that the bandwidth plan is being disassociated. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is disassociated.
      * *   The **BandwidthPackageRemoveAccelerator** cannot be called repeatedly for the same GA instance.
      *
      * @param request BandwidthPackageRemoveAcceleratorRequest
      * @return BandwidthPackageRemoveAcceleratorResponse
     */
    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bandwidthPackageRemoveAcceleratorWithOptions(request, runtime);
    }

    /**
      * The **ChangeResourceGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request ChangeResourceGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
      * The **ChangeResourceGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request ChangeResourceGroupRequest
      * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
      * *   **ConfigEndpointProbe** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of the endpoint group to which an endpoint belongs and determine whether latency monitoring is configured for the endpoint.
      *     *   If the endpoint group is in the **updating** state, it indicates that latency monitoring is being configured for the endpoint. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that latency monitoring is configured for the endpoint.
      * *   The **ConfigEndpointProbe** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request ConfigEndpointProbeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ConfigEndpointProbeResponse
     */
    public ConfigEndpointProbeResponse configEndpointProbeWithOptions(ConfigEndpointProbeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probePort)) {
            query.put("ProbePort", request.probePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeProtocol)) {
            query.put("ProbeProtocol", request.probeProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigEndpointProbe"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigEndpointProbeResponse());
    }

    /**
      * *   **ConfigEndpointProbe** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of the endpoint group to which an endpoint belongs and determine whether latency monitoring is configured for the endpoint.
      *     *   If the endpoint group is in the **updating** state, it indicates that latency monitoring is being configured for the endpoint. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that latency monitoring is configured for the endpoint.
      * *   The **ConfigEndpointProbe** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request ConfigEndpointProbeRequest
      * @return ConfigEndpointProbeResponse
     */
    public ConfigEndpointProbeResponse configEndpointProbe(ConfigEndpointProbeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configEndpointProbeWithOptions(request, runtime);
    }

    /**
      * **CreateAccelerator** is an asynchronous operation. After you send a request, the system returns the ID of a GA instance, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      * *   If the GA instance is in the **init** state, it indicates that the GA instance is being created. In this case, you can perform only query operations.
      * *   If the GA instance is in the **active** state, it indicates that the GA instance is created.
      *
      * @param request CreateAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAcceleratorResponse
     */
    public CreateAcceleratorResponse createAcceleratorWithOptions(CreateAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthBillingType)) {
            query.put("BandwidthBillingType", request.bandwidthBillingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetConfig)) {
            query.put("IpSetConfig", request.ipSetConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAcceleratorResponse());
    }

    /**
      * **CreateAccelerator** is an asynchronous operation. After you send a request, the system returns the ID of a GA instance, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      * *   If the GA instance is in the **init** state, it indicates that the GA instance is being created. In this case, you can perform only query operations.
      * *   If the GA instance is in the **active** state, it indicates that the GA instance is created.
      *
      * @param request CreateAcceleratorRequest
      * @return CreateAcceleratorResponse
     */
    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAcceleratorWithOptions(request, runtime);
    }

    /**
      * **CreateAcl** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the state of an ACL.
      * *   If the ACL is in the **init** state, the ACL is being created. In this case, you can only perform only query operations.
      * *   If the ACL is in the **active** state, the ACL is created.
      *
      * @param request CreateAclRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAclResponse
     */
    public CreateAclResponse createAclWithOptions(CreateAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntries)) {
            query.put("AclEntries", request.aclEntries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAcl"),
            new TeaPair("version", "2019-11-20"),
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
      * **CreateAcl** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the state of an ACL.
      * *   If the ACL is in the **init** state, the ACL is being created. In this case, you can only perform only query operations.
      * *   If the ACL is in the **active** state, the ACL is created.
      *
      * @param request CreateAclRequest
      * @return CreateAclResponse
     */
    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    /**
      * You can call the **CreateApplicationMonitor** operation to create an origin probing task. An origin probing task monitors the network quality between the client and origin server and checks the availability of the origin.
      * Before you call this operation, take note of the following items:
      * *   **CreateApplicationMonitor** is an asynchronous operation. After you send a request, the system returns the ID of an origin probing task, but the origin probing task is still being created in the system background. You can call the [DescribeApplicationMonitor](~~408463~~) or [ListApplicationMonitor](~~408462~~) operation to query the state of the origin probing task.
      *     *   If the origin probing task is in the **init** state, it indicates that the task is being created. In this case, you can only perform query operations.
      *     *   If the origin probing task is in the **active** state, it indicates that the task is created.
      * *   The **CreateApplicationMonitor** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateApplicationMonitorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateApplicationMonitorResponse
     */
    public CreateApplicationMonitorResponse createApplicationMonitorWithOptions(CreateApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectEnable)) {
            query.put("DetectEnable", request.detectEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectThreshold)) {
            query.put("DetectThreshold", request.detectThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectTimes)) {
            query.put("DetectTimes", request.detectTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsJson)) {
            query.put("OptionsJson", request.optionsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationMonitorResponse());
    }

    /**
      * You can call the **CreateApplicationMonitor** operation to create an origin probing task. An origin probing task monitors the network quality between the client and origin server and checks the availability of the origin.
      * Before you call this operation, take note of the following items:
      * *   **CreateApplicationMonitor** is an asynchronous operation. After you send a request, the system returns the ID of an origin probing task, but the origin probing task is still being created in the system background. You can call the [DescribeApplicationMonitor](~~408463~~) or [ListApplicationMonitor](~~408462~~) operation to query the state of the origin probing task.
      *     *   If the origin probing task is in the **init** state, it indicates that the task is being created. In this case, you can only perform query operations.
      *     *   If the origin probing task is in the **active** state, it indicates that the task is created.
      * *   The **CreateApplicationMonitor** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateApplicationMonitorRequest
      * @return CreateApplicationMonitorResponse
     */
    public CreateApplicationMonitorResponse createApplicationMonitor(CreateApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationMonitorWithOptions(request, runtime);
    }

    /**
      * To use Global Accelerator (GA) for acceleration, you must purchase a basic bandwidth plan. A basic bandwidth plan supports the following bandwidth types:
      * *   **Basic**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service is deployed on Alibaba Cloud.
      * *   **Enhanced**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud.
      * *   **Premium**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud. If you want to accelerate data transfer for clients in the Chinese mainland, you must select China (Hong Kong) as the acceleration region.
      * When you call this operation, take note of the following items:
      * *   **CreateBandwidthPackage** is an asynchronous operation. After you send a request, the system returns the ID of a bandwidth plan, but the bandwidth plan is still being created in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan.
      *     *   If the bandwidth plan is in the **init** state, it indicates that the bandwidth plan is being created. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is created.
      * *   The **CreateBandwidthPackage** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBandwidthPackageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBandwidthPackageResponse
     */
    public CreateBandwidthPackageResponse createBandwidthPackageWithOptions(CreateBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthType)) {
            query.put("BandwidthType", request.bandwidthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingType)) {
            query.put("BillingType", request.billingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cbnGeographicRegionIdA)) {
            query.put("CbnGeographicRegionIdA", request.cbnGeographicRegionIdA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cbnGeographicRegionIdB)) {
            query.put("CbnGeographicRegionIdB", request.cbnGeographicRegionIdB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            query.put("Ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBandwidthPackageResponse());
    }

    /**
      * To use Global Accelerator (GA) for acceleration, you must purchase a basic bandwidth plan. A basic bandwidth plan supports the following bandwidth types:
      * *   **Basic**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service is deployed on Alibaba Cloud.
      * *   **Enhanced**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud.
      * *   **Premium**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud. If you want to accelerate data transfer for clients in the Chinese mainland, you must select China (Hong Kong) as the acceleration region.
      * When you call this operation, take note of the following items:
      * *   **CreateBandwidthPackage** is an asynchronous operation. After you send a request, the system returns the ID of a bandwidth plan, but the bandwidth plan is still being created in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan.
      *     *   If the bandwidth plan is in the **init** state, it indicates that the bandwidth plan is being created. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is created.
      * *   The **CreateBandwidthPackage** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBandwidthPackageRequest
      * @return CreateBandwidthPackageResponse
     */
    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBandwidthPackageWithOptions(request, runtime);
    }

    /**
      * *   **CreateBasicAccelerateIp** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicAccelerateIp](~~466794~~) operation to query the status of an accelerated IP address:
      *     *   If no status information is returned, the accelerated IP address is being created. In this case, you can perform only query operations.
      *     *   If the accelerated IP address is in the **active** state, the accelerated IP address is created.
      * *   The **CreateBasicAccelerateIp** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBasicAccelerateIpRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicAccelerateIpResponse
     */
    public CreateBasicAccelerateIpResponse createBasicAccelerateIpWithOptions(CreateBasicAccelerateIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicAccelerateIp"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicAccelerateIpResponse());
    }

    /**
      * *   **CreateBasicAccelerateIp** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicAccelerateIp](~~466794~~) operation to query the status of an accelerated IP address:
      *     *   If no status information is returned, the accelerated IP address is being created. In this case, you can perform only query operations.
      *     *   If the accelerated IP address is in the **active** state, the accelerated IP address is created.
      * *   The **CreateBasicAccelerateIp** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBasicAccelerateIpRequest
      * @return CreateBasicAccelerateIpResponse
     */
    public CreateBasicAccelerateIpResponse createBasicAccelerateIp(CreateBasicAccelerateIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAccelerateIpWithOptions(request, runtime);
    }

    /**
      * *   **CreateBasicAccelerateIpEndpointRelation** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerateIp](~~466794~~) or [ListBasicEndpoints](~~466831~~) API operation to query the status of an accelerated IP address or an endpoint to determine the association status between the accelerated IP address and endpoint.
      *     *   If the status of the accelerated IP address and endpoint is **binding**, the accelerated IP address is being associated with the endpoint. In this case, you can query the accelerated IP address and endpoint but cannot perform other operations.
      *     *   If the status of the accelerated IP address and endpoint is **bound** and the status returned by the [ListBasicAccelerateIpEndpointRelations](~~466803~~) API operation is **active**, the accelerated IP address is associated with the endpoint.
      * *   The **CreateBasicAccelerateIpEndpointRelation** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request CreateBasicAccelerateIpEndpointRelationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicAccelerateIpEndpointRelationResponse
     */
    public CreateBasicAccelerateIpEndpointRelationResponse createBasicAccelerateIpEndpointRelationWithOptions(CreateBasicAccelerateIpEndpointRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicAccelerateIpEndpointRelation"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicAccelerateIpEndpointRelationResponse());
    }

    /**
      * *   **CreateBasicAccelerateIpEndpointRelation** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerateIp](~~466794~~) or [ListBasicEndpoints](~~466831~~) API operation to query the status of an accelerated IP address or an endpoint to determine the association status between the accelerated IP address and endpoint.
      *     *   If the status of the accelerated IP address and endpoint is **binding**, the accelerated IP address is being associated with the endpoint. In this case, you can query the accelerated IP address and endpoint but cannot perform other operations.
      *     *   If the status of the accelerated IP address and endpoint is **bound** and the status returned by the [ListBasicAccelerateIpEndpointRelations](~~466803~~) API operation is **active**, the accelerated IP address is associated with the endpoint.
      * *   The **CreateBasicAccelerateIpEndpointRelation** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request CreateBasicAccelerateIpEndpointRelationRequest
      * @return CreateBasicAccelerateIpEndpointRelationResponse
     */
    public CreateBasicAccelerateIpEndpointRelationResponse createBasicAccelerateIpEndpointRelation(CreateBasicAccelerateIpEndpointRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAccelerateIpEndpointRelationWithOptions(request, runtime);
    }

    /**
      * *   The **CreateBasicAccelerateIpEndpointRelations** is asynchronous. After you send a request, the system returns a request ID and runs the task in the system background. You can call the [GetBasicAccelerateIp](~~466794~~) or [ListBasicEndpoints](~~466831~~) API operation to query the status of an accelerated IP address or an endpoint to determine the association status.
      *     *   If an accelerated IP address and the endpoint are in the **binding** state, the accelerated IP address is being associated with the endpoint. In this case, you can only query the accelerated IP address and endpoint, but cannot perform other operations.
      *     *   If all the accelerated IP addresses and the endpoint are in the **bound** state, and the association status returned by the [ListBasicAccelerateIpEndpointRelations](~~466803~~) API operation is **active**, the accelerated IP addresses are associated with the endpoints.
      * *   The **CreateBasicAccelerateIpEndpointRelations** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request CreateBasicAccelerateIpEndpointRelationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicAccelerateIpEndpointRelationsResponse
     */
    public CreateBasicAccelerateIpEndpointRelationsResponse createBasicAccelerateIpEndpointRelationsWithOptions(CreateBasicAccelerateIpEndpointRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpEndpointRelations)) {
            query.put("AccelerateIpEndpointRelations", request.accelerateIpEndpointRelations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicAccelerateIpEndpointRelations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicAccelerateIpEndpointRelationsResponse());
    }

    /**
      * *   The **CreateBasicAccelerateIpEndpointRelations** is asynchronous. After you send a request, the system returns a request ID and runs the task in the system background. You can call the [GetBasicAccelerateIp](~~466794~~) or [ListBasicEndpoints](~~466831~~) API operation to query the status of an accelerated IP address or an endpoint to determine the association status.
      *     *   If an accelerated IP address and the endpoint are in the **binding** state, the accelerated IP address is being associated with the endpoint. In this case, you can only query the accelerated IP address and endpoint, but cannot perform other operations.
      *     *   If all the accelerated IP addresses and the endpoint are in the **bound** state, and the association status returned by the [ListBasicAccelerateIpEndpointRelations](~~466803~~) API operation is **active**, the accelerated IP addresses are associated with the endpoints.
      * *   The **CreateBasicAccelerateIpEndpointRelations** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request CreateBasicAccelerateIpEndpointRelationsRequest
      * @return CreateBasicAccelerateIpEndpointRelationsResponse
     */
    public CreateBasicAccelerateIpEndpointRelationsResponse createBasicAccelerateIpEndpointRelations(CreateBasicAccelerateIpEndpointRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAccelerateIpEndpointRelationsWithOptions(request, runtime);
    }

    /**
      * Basic GA instances use high-quality global network bandwidth and the transmission network of Alibaba Cloud to provide users with point-to-point acceleration services. You can use basic GA instances to accelerate content delivery at Layer 3 (IP protocols). For more information, see [Overview of GA instances](~~153127~~).
      * The **CreateBasicAccelerator** operation is asynchronous. After you send a request, the system returns the ID of a basic GA instance, but the operation is still being performed in the background. You can call the [GetBasicAccelerator](~~353188~~) or [ListBasicAccelerators](~~353189~~) operation to query the status of a basic GA instance:
      * *   If a basic GA instance is in the **init** state, the basic GA instance is being created. In this case, you can perform only query operations.
      * *   If a basic GA instance is in the **active** state, the basic GA instance is created.
      *
      * @param request CreateBasicAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicAcceleratorResponse
     */
    public CreateBasicAcceleratorResponse createBasicAcceleratorWithOptions(CreateBasicAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthBillingType)) {
            query.put("BandwidthBillingType", request.bandwidthBillingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicAcceleratorResponse());
    }

    /**
      * Basic GA instances use high-quality global network bandwidth and the transmission network of Alibaba Cloud to provide users with point-to-point acceleration services. You can use basic GA instances to accelerate content delivery at Layer 3 (IP protocols). For more information, see [Overview of GA instances](~~153127~~).
      * The **CreateBasicAccelerator** operation is asynchronous. After you send a request, the system returns the ID of a basic GA instance, but the operation is still being performed in the background. You can call the [GetBasicAccelerator](~~353188~~) or [ListBasicAccelerators](~~353189~~) operation to query the status of a basic GA instance:
      * *   If a basic GA instance is in the **init** state, the basic GA instance is being created. In this case, you can perform only query operations.
      * *   If a basic GA instance is in the **active** state, the basic GA instance is created.
      *
      * @param request CreateBasicAcceleratorRequest
      * @return CreateBasicAcceleratorResponse
     */
    public CreateBasicAcceleratorResponse createBasicAccelerator(CreateBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAcceleratorWithOptions(request, runtime);
    }

    /**
      * *   **CreateBasicEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) API operation to query the status of an endpoint.
      *     *   If the endpoint is in the **init** state, the endpoint is being created. In this case, you can perform only query operations.
      *     *   If the endpoint is in the **active** state, the endpoint is created.
      * *   The **CreateBasicEndpoint** API operation cannot be repeatedly called for the same basic GA instance within a specific period of time.
      *
      * @param request CreateBasicEndpointRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicEndpointResponse
     */
    public CreateBasicEndpointResponse createBasicEndpointWithOptions(CreateBasicEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointAddress)) {
            query.put("EndpointAddress", request.endpointAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointSubAddress)) {
            query.put("EndpointSubAddress", request.endpointSubAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointSubAddressType)) {
            query.put("EndpointSubAddressType", request.endpointSubAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointZoneId)) {
            query.put("EndpointZoneId", request.endpointZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicEndpoint"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicEndpointResponse());
    }

    /**
      * *   **CreateBasicEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) API operation to query the status of an endpoint.
      *     *   If the endpoint is in the **init** state, the endpoint is being created. In this case, you can perform only query operations.
      *     *   If the endpoint is in the **active** state, the endpoint is created.
      * *   The **CreateBasicEndpoint** API operation cannot be repeatedly called for the same basic GA instance within a specific period of time.
      *
      * @param request CreateBasicEndpointRequest
      * @return CreateBasicEndpointResponse
     */
    public CreateBasicEndpointResponse createBasicEndpoint(CreateBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicEndpointWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   You can add only one endpoint group and one endpoint for each basic GA instance. The endpoint must be a Classic Load Balancer (CLB) instance of the Virtual Private Cloud (VPC) type or a secondary elastic network interface (ENI).
      * *   You cannot add a secondary ENI or CLB instance as an endpoint for a basic GA instance if the secondary ENI or CLB instance is associated with an elastic IP address (EIP).
      * *   **CreateBasicEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicEndpointGroup](~~362984~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **init** state, the endpoint is being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, the endpoint group is created.
      * *   The **CreateBasicEndpointGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBasicEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicEndpointGroupResponse
     */
    public CreateBasicEndpointGroupResponse createBasicEndpointGroupWithOptions(CreateBasicEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointAddress)) {
            query.put("EndpointAddress", request.endpointAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupRegion)) {
            query.put("EndpointGroupRegion", request.endpointGroupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointSubAddress)) {
            query.put("EndpointSubAddress", request.endpointSubAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicEndpointGroupResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   You can add only one endpoint group and one endpoint for each basic GA instance. The endpoint must be a Classic Load Balancer (CLB) instance of the Virtual Private Cloud (VPC) type or a secondary elastic network interface (ENI).
      * *   You cannot add a secondary ENI or CLB instance as an endpoint for a basic GA instance if the secondary ENI or CLB instance is associated with an elastic IP address (EIP).
      * *   **CreateBasicEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicEndpointGroup](~~362984~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **init** state, the endpoint is being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, the endpoint group is created.
      * *   The **CreateBasicEndpointGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBasicEndpointGroupRequest
      * @return CreateBasicEndpointGroupResponse
     */
    public CreateBasicEndpointGroupResponse createBasicEndpointGroup(CreateBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
      * *   **CreateEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) API operation to query the status of endpoints.
      *     *   If the endpoints are in the **init** state, the endpoints are being created. In this case, you can perform only query operations.
      *     *   If all endpoints are in the **active** state, the endpoints are created.
      * *   The **CreateBasicEndpointGroup** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request CreateBasicEndpointsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicEndpointsResponse
     */
    public CreateBasicEndpointsResponse createBasicEndpointsWithOptions(CreateBasicEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoints)) {
            query.put("Endpoints", request.endpoints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicEndpoints"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicEndpointsResponse());
    }

    /**
      * *   **CreateEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) API operation to query the status of endpoints.
      *     *   If the endpoints are in the **init** state, the endpoints are being created. In this case, you can perform only query operations.
      *     *   If all endpoints are in the **active** state, the endpoints are created.
      * *   The **CreateBasicEndpointGroup** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request CreateBasicEndpointsRequest
      * @return CreateBasicEndpointsResponse
     */
    public CreateBasicEndpointsResponse createBasicEndpoints(CreateBasicEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicEndpointsWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   You can add only one acceleration region for each basic GA instance, and only IPv4 clients can connect to basic GA instances.
      * *   **CreateBasicIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicIpSet](~~362987~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **init** state, the acceleration region is being created. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is created.
      * *   The **CreateBasicIpSet** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBasicIpSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBasicIpSetResponse
     */
    public CreateBasicIpSetResponse createBasicIpSetWithOptions(CreateBasicIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateRegionId)) {
            query.put("AccelerateRegionId", request.accelerateRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispType)) {
            query.put("IspType", request.ispType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBasicIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBasicIpSetResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   You can add only one acceleration region for each basic GA instance, and only IPv4 clients can connect to basic GA instances.
      * *   **CreateBasicIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicIpSet](~~362987~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **init** state, the acceleration region is being created. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is created.
      * *   The **CreateBasicIpSet** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateBasicIpSetRequest
      * @return CreateBasicIpSetResponse
     */
    public CreateBasicIpSetResponse createBasicIpSet(CreateBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicIpSetWithOptions(request, runtime);
    }

    /**
      * After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, mapping information (protocols and port ranges) of the associated endpoint groups, and IP addresses of endpoints (vSwitches) and forwards client requests to specified IP addresses and ports in the vSwitches.  
      * This operation is used to create endpoint group mappings for custom routing listeners. When you call this operation, take note of the following items: 
      * - **CreateCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) operation to query the state of a specified endpoint group and determine whether mappings are created in the endpoint group.
      *     
      *     - If the endpoint group is in the **updating** state, it indicates that mappings are being created in the endpoint group. In this case, you can perform only query operations.
      *     - If the endpoint group is in the **active** state, it indicates that mappings are created in the endpoint group.
      * - The **CreateCustomRoutingEndpointGroupDestinations** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the standard GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners, and create a custom routing listener for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      * - Create an endpoint group for the custom routing listener. For more information, see [CreateCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
      *
      * @param request CreateCustomRoutingEndpointGroupDestinationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCustomRoutingEndpointGroupDestinationsResponse
     */
    public CreateCustomRoutingEndpointGroupDestinationsResponse createCustomRoutingEndpointGroupDestinationsWithOptions(CreateCustomRoutingEndpointGroupDestinationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationConfigurations)) {
            query.put("DestinationConfigurations", request.destinationConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomRoutingEndpointGroupDestinations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomRoutingEndpointGroupDestinationsResponse());
    }

    /**
      * After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, mapping information (protocols and port ranges) of the associated endpoint groups, and IP addresses of endpoints (vSwitches) and forwards client requests to specified IP addresses and ports in the vSwitches.  
      * This operation is used to create endpoint group mappings for custom routing listeners. When you call this operation, take note of the following items: 
      * - **CreateCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) operation to query the state of a specified endpoint group and determine whether mappings are created in the endpoint group.
      *     
      *     - If the endpoint group is in the **updating** state, it indicates that mappings are being created in the endpoint group. In this case, you can perform only query operations.
      *     - If the endpoint group is in the **active** state, it indicates that mappings are created in the endpoint group.
      * - The **CreateCustomRoutingEndpointGroupDestinations** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the standard GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners, and create a custom routing listener for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      * - Create an endpoint group for the custom routing listener. For more information, see [CreateCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
      *
      * @param request CreateCustomRoutingEndpointGroupDestinationsRequest
      * @return CreateCustomRoutingEndpointGroupDestinationsResponse
     */
    public CreateCustomRoutingEndpointGroupDestinationsResponse createCustomRoutingEndpointGroupDestinations(CreateCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
      * GA forwards client requests to endpoints in an endpoint group based on the routing type of the listener that is associated with the endpoint group.  
      * - After you configure an intelligent routing listener for a GA instance, the GA instance selects a nearby and healthy endpoint group and forwards client requests to a healthy endpoint in the endpoint group.
      * - After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches) and forwards client requests to specified IP addresses and ports in the vSwitches.
      * This operation is used to create endpoint groups for custom routing listeners. For information about how to create endpoint groups for intelligent routing listeners, see [CreateEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/createendpointgroup).  
      * When you call this operation, take note of the following items:
      * - **CreateCustomRoutingEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) or [ListCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/listcustomroutingendpointgroups) operation to query the status of the endpoint groups that are associated with custom routing listeners.
      *     
      *     - If one or more endpoints groups are in the **init** state, it indicates that the endpoint groups are being created. In this case, you can perform only query operations.
      *     - If all endpoint groups are in the **active** state, it indicates that the endpoint groups are created.
      * - The **CreateCustomRoutingEndpointGroups** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the standard GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners, and create a custom routing listener for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      *
      * @param request CreateCustomRoutingEndpointGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCustomRoutingEndpointGroupsResponse
     */
    public CreateCustomRoutingEndpointGroupsResponse createCustomRoutingEndpointGroupsWithOptions(CreateCustomRoutingEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupConfigurations)) {
            query.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomRoutingEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomRoutingEndpointGroupsResponse());
    }

    /**
      * GA forwards client requests to endpoints in an endpoint group based on the routing type of the listener that is associated with the endpoint group.  
      * - After you configure an intelligent routing listener for a GA instance, the GA instance selects a nearby and healthy endpoint group and forwards client requests to a healthy endpoint in the endpoint group.
      * - After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches) and forwards client requests to specified IP addresses and ports in the vSwitches.
      * This operation is used to create endpoint groups for custom routing listeners. For information about how to create endpoint groups for intelligent routing listeners, see [CreateEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/createendpointgroup).  
      * When you call this operation, take note of the following items:
      * - **CreateCustomRoutingEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) or [ListCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/listcustomroutingendpointgroups) operation to query the status of the endpoint groups that are associated with custom routing listeners.
      *     
      *     - If one or more endpoints groups are in the **init** state, it indicates that the endpoint groups are being created. In this case, you can perform only query operations.
      *     - If all endpoint groups are in the **active** state, it indicates that the endpoint groups are created.
      * - The **CreateCustomRoutingEndpointGroups** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the standard GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners, and create a custom routing listener for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      *
      * @param request CreateCustomRoutingEndpointGroupsRequest
      * @return CreateCustomRoutingEndpointGroupsResponse
     */
    public CreateCustomRoutingEndpointGroupsResponse createCustomRoutingEndpointGroups(CreateCustomRoutingEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointGroupsWithOptions(request, runtime);
    }

    /**
      * This operation takes effect only when traffic is allowed to specified destinations. You can call the [DescribeCustomRoutingEndpoint](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpoint) operation to query the access policy of traffic for the specified endpoint. This operation takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.  
      * When you call this operation, take note of the following items:
      * - **CreateCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) operation to query the state of an endpoint group to check whether access policies of traffic are created for endpoints in the endpoint group. 
      *     
      *      - If the endpoint group is in the **updating** state, access policies of traffic are being created for endpoints in the endpoint group. In this case, you can perform only query operations.
      *     - If the endpoint group is in the **active** state, access policies of traffic are created for endpoints in the endpoint group.
      * - The **CreateCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners and create custom routing listeners for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      * - Create endpoint groups for the custom routing listeners. For more information, see [CreateCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
      * - Create endpoints for the custom routing listeners. For more information, see [CreateCustomRoutingEndpoints](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpoints).
      *
      * @param request CreateCustomRoutingEndpointTrafficPoliciesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCustomRoutingEndpointTrafficPoliciesResponse
     */
    public CreateCustomRoutingEndpointTrafficPoliciesResponse createCustomRoutingEndpointTrafficPoliciesWithOptions(CreateCustomRoutingEndpointTrafficPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyConfigurations)) {
            query.put("PolicyConfigurations", request.policyConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomRoutingEndpointTrafficPolicies"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomRoutingEndpointTrafficPoliciesResponse());
    }

    /**
      * This operation takes effect only when traffic is allowed to specified destinations. You can call the [DescribeCustomRoutingEndpoint](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpoint) operation to query the access policy of traffic for the specified endpoint. This operation takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.  
      * When you call this operation, take note of the following items:
      * - **CreateCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) operation to query the state of an endpoint group to check whether access policies of traffic are created for endpoints in the endpoint group. 
      *     
      *      - If the endpoint group is in the **updating** state, access policies of traffic are being created for endpoints in the endpoint group. In this case, you can perform only query operations.
      *     - If the endpoint group is in the **active** state, access policies of traffic are created for endpoints in the endpoint group.
      * - The **CreateCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners and create custom routing listeners for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      * - Create endpoint groups for the custom routing listeners. For more information, see [CreateCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
      * - Create endpoints for the custom routing listeners. For more information, see [CreateCustomRoutingEndpoints](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpoints).
      *
      * @param request CreateCustomRoutingEndpointTrafficPoliciesRequest
      * @return CreateCustomRoutingEndpointTrafficPoliciesResponse
     */
    public CreateCustomRoutingEndpointTrafficPoliciesResponse createCustomRoutingEndpointTrafficPolicies(CreateCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
      * After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches. 
      * This operation is used to create endpoints for custom routing listeners. When you call this operation to create endpoints in an endpoint group, take note of the following items: 
      * - **CreateCustomRoutingEndpoints** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) operation to query the state of the endpoint group and determine whether endpoints are created in the endpoint group. 
      *    
      *     - If the endpoint group is in the **updating** state, it indicates that endpoints are being created. In this case, you can perform only query operations.
      *     - If the endpoint group is in the **active** state, it indicates that endpoints are created.
      * - The **CreateCustomRoutingEndpoints** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners, and create a custom routing listener for the standard GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      * - Create an endpoint group for the custom routing listener. For more information, see [CreateCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
      *
      * @param request CreateCustomRoutingEndpointsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCustomRoutingEndpointsResponse
     */
    public CreateCustomRoutingEndpointsResponse createCustomRoutingEndpointsWithOptions(CreateCustomRoutingEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointConfigurations)) {
            query.put("EndpointConfigurations", request.endpointConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomRoutingEndpoints"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomRoutingEndpointsResponse());
    }

    /**
      * After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches. 
      * This operation is used to create endpoints for custom routing listeners. When you call this operation to create endpoints in an endpoint group, take note of the following items: 
      * - **CreateCustomRoutingEndpoints** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](https://www.alibabacloud.com/help/en/global-accelerator/latest/describecustomroutingendpointgroup) operation to query the state of the endpoint group and determine whether endpoints are created in the endpoint group. 
      *    
      *     - If the endpoint group is in the **updating** state, it indicates that endpoints are being created. In this case, you can perform only query operations.
      *     - If the endpoint group is in the **active** state, it indicates that endpoints are created.
      * - The **CreateCustomRoutingEndpoints** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ## Prerequisites
      * The following operations are complete before you call this operation:
      * - Create a standard GA instance. For more information, see [CreateAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createaccelerator).
      * - Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/bandwidthpackageaddaccelerator).
      * - Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * - Apply for permissions to use custom routing listeners, and create a custom routing listener for the standard GA instance. The custom routing listener feature is in invitational preview. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex). For information about how to create a custom routing listener, see [CreateListener](https://www.alibabacloud.com/help/en/global-accelerator/latest/createlistener).
      * - Create an endpoint group for the custom routing listener. For more information, see [CreateCustomRoutingEndpointGroups](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
      *
      * @param request CreateCustomRoutingEndpointsRequest
      * @return CreateCustomRoutingEndpointsResponse
     */
    public CreateCustomRoutingEndpointsResponse createCustomRoutingEndpoints(CreateCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
      * After you associate an accelerated domain name for which an ICP number is obtained with a GA instance, you do not need to complete filing for the accelerated domain name or its subdomains on Alibaba Cloud.
      * You can call this operation to add an accelerated domain name and associate the accelerated domain name with GA instances. When you call this operation, take note of the following items:
      * *   If your accelerated domain name is hosted in the Chinese mainland, you must obtain an ICP number for the domain name.
      * *   The same accelerated domain name cannot be repeatedly associated with the same GA instance.
      * *   You cannot repeatedly call the **CreateDomain** operation by using the same Alibaba Cloud account within a specific period of time.
      *
      * @param request CreateDomainRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorIds)) {
            query.put("AcceleratorIds", request.acceleratorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    /**
      * After you associate an accelerated domain name for which an ICP number is obtained with a GA instance, you do not need to complete filing for the accelerated domain name or its subdomains on Alibaba Cloud.
      * You can call this operation to add an accelerated domain name and associate the accelerated domain name with GA instances. When you call this operation, take note of the following items:
      * *   If your accelerated domain name is hosted in the Chinese mainland, you must obtain an ICP number for the domain name.
      * *   The same accelerated domain name cannot be repeatedly associated with the same GA instance.
      * *   You cannot repeatedly call the **CreateDomain** operation by using the same Alibaba Cloud account within a specific period of time.
      *
      * @param request CreateDomainRequest
      * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    /**
      * *   **CreateEndpointGroup** is an asynchronous operation. After you send a request, the system returns the ID of an endpoint group, but the endpoint group is still being created in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of the endpoint group.
      *     *   If the endpoint group is in the **init** state, it indicates that the endpoint group is being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the endpoint group is created.
      * *   The **CreateEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateEndpointGroupResponse
     */
    public CreateEndpointGroupResponse createEndpointGroupWithOptions(CreateEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointConfigurations)) {
            query.put("EndpointConfigurations", request.endpointConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupRegion)) {
            query.put("EndpointGroupRegion", request.endpointGroupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupType)) {
            query.put("EndpointGroupType", request.endpointGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointRequestProtocol)) {
            query.put("EndpointRequestProtocol", request.endpointRequestProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckEnabled)) {
            query.put("HealthCheckEnabled", request.healthCheckEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckIntervalSeconds)) {
            query.put("HealthCheckIntervalSeconds", request.healthCheckIntervalSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPath)) {
            query.put("HealthCheckPath", request.healthCheckPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPort)) {
            query.put("HealthCheckPort", request.healthCheckPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckProtocol)) {
            query.put("HealthCheckProtocol", request.healthCheckProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portOverrides)) {
            query.put("PortOverrides", request.portOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdCount)) {
            query.put("ThresholdCount", request.thresholdCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficPercentage)) {
            query.put("TrafficPercentage", request.trafficPercentage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEndpointGroupResponse());
    }

    /**
      * *   **CreateEndpointGroup** is an asynchronous operation. After you send a request, the system returns the ID of an endpoint group, but the endpoint group is still being created in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of the endpoint group.
      *     *   If the endpoint group is in the **init** state, it indicates that the endpoint group is being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the endpoint group is created.
      * *   The **CreateEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateEndpointGroupRequest
      * @return CreateEndpointGroupResponse
     */
    public CreateEndpointGroupResponse createEndpointGroup(CreateEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEndpointGroupWithOptions(request, runtime);
    }

    /**
      * *   **CreateEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) or [ListEndpointGroups](~~153261~~) to query the state of an endpoint group.
      *     *   If an endpoint group is in the **init** state, the endpoint group is being created. In this case, you can perform only query operations.
      *     *   If all endpoint groups are in the **active**, endpoint groups are created.
      * *   The **CreateEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateEndpointGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateEndpointGroupsResponse
     */
    public CreateEndpointGroupsResponse createEndpointGroupsWithOptions(CreateEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupConfigurations)) {
            query.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEndpointGroupsResponse());
    }

    /**
      * *   **CreateEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) or [ListEndpointGroups](~~153261~~) to query the state of an endpoint group.
      *     *   If an endpoint group is in the **init** state, the endpoint group is being created. In this case, you can perform only query operations.
      *     *   If all endpoint groups are in the **active**, endpoint groups are created.
      * *   The **CreateEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateEndpointGroupsRequest
      * @return CreateEndpointGroupsResponse
     */
    public CreateEndpointGroupsResponse createEndpointGroups(CreateEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEndpointGroupsWithOptions(request, runtime);
    }

    /**
      * HTTP and HTTPS listeners of Global Accelerator (GA) support domain name-based and path-based forwarding rules. After an HTTP or HTTPS listener receives a request, the system matches the request against the forwarding conditions in a forwarding rule and then performs the corresponding forwarding action. For example, if you set **Host** to `www.example.com` as the forwarding condition and **Forward** to `epg-bp1enpdcrqhl78g6r****` as the forwarding action in a forwarding rule, requests to the `www.example.com` domain name match this forwarding rule and are forwarded to the `epg-bp1enpdcrqhl78g6r****` endpoint group. Before you call this API operation to create a forwarding rule, we recommend that you understand forwarding rules. For more information, see [Forwarding rules](~~204224~~).
      * When you call this operation, take note of the following items:
      * *   **CreateForwardingRules** is an asynchronous operation. After you send a request, the system returns the ID of a forwarding rule, but the forwarding rule is still being created in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of the forwarding rule.
      *     *   If the forwarding rule is in the **configuring** state, it indicates that the rule is being created. In this case, you can only perform query operations.
      *     *   If the forwarding rule is in the **active** state, it indicates that the rule is created.
      * *   The **CreateForwardingRules** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateForwardingRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateForwardingRulesResponse
     */
    public CreateForwardingRulesResponse createForwardingRulesWithOptions(CreateForwardingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardingRules)) {
            query.put("ForwardingRules", request.forwardingRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForwardingRulesResponse());
    }

    /**
      * HTTP and HTTPS listeners of Global Accelerator (GA) support domain name-based and path-based forwarding rules. After an HTTP or HTTPS listener receives a request, the system matches the request against the forwarding conditions in a forwarding rule and then performs the corresponding forwarding action. For example, if you set **Host** to `www.example.com` as the forwarding condition and **Forward** to `epg-bp1enpdcrqhl78g6r****` as the forwarding action in a forwarding rule, requests to the `www.example.com` domain name match this forwarding rule and are forwarded to the `epg-bp1enpdcrqhl78g6r****` endpoint group. Before you call this API operation to create a forwarding rule, we recommend that you understand forwarding rules. For more information, see [Forwarding rules](~~204224~~).
      * When you call this operation, take note of the following items:
      * *   **CreateForwardingRules** is an asynchronous operation. After you send a request, the system returns the ID of a forwarding rule, but the forwarding rule is still being created in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of the forwarding rule.
      *     *   If the forwarding rule is in the **configuring** state, it indicates that the rule is being created. In this case, you can only perform query operations.
      *     *   If the forwarding rule is in the **active** state, it indicates that the rule is created.
      * *   The **CreateForwardingRules** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request CreateForwardingRulesRequest
      * @return CreateForwardingRulesResponse
     */
    public CreateForwardingRulesResponse createForwardingRules(CreateForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardingRulesWithOptions(request, runtime);
    }

    /**
      * *   **CreateIpSets** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of acceleration regions.
      *     *   If acceleration regions are in the **init** state, it indicates that the acceleration regions are being created. In this case, you can perform only query operations.
      *     *   If acceleration regions are in the **active** state, it indicates that the acceleration regions are created.
      * *   The **CreateIpSets** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateIpSetsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateIpSetsResponse
     */
    public CreateIpSetsResponse createIpSetsWithOptions(CreateIpSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateRegion)) {
            query.put("AccelerateRegion", request.accelerateRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpSetsResponse());
    }

    /**
      * *   **CreateIpSets** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of acceleration regions.
      *     *   If acceleration regions are in the **init** state, it indicates that the acceleration regions are being created. In this case, you can perform only query operations.
      *     *   If acceleration regions are in the **active** state, it indicates that the acceleration regions are created.
      * *   The **CreateIpSets** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request CreateIpSetsRequest
      * @return CreateIpSetsResponse
     */
    public CreateIpSetsResponse createIpSets(CreateIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpSetsWithOptions(request, runtime);
    }

    /**
      * A listener listens for connection requests and then distributes the requests to endpoints based on the forwarding rules that are defined by a specified scheduling algorithm. You can call this operation to create a listener for a standard GA instance.
      * Before you call this operation, take note of the following limits:
      * *   The **CreateListener** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the status of a listener:
      *     *   If a listener is in the **init** state, the listener is being created. In this case, you can perform only query operations.
      *     *   If a listener is in the **active** state, the listener is created.
      * *   You cannot repeatedly call the **CreateListener** operation for the same GA instance within the specified period of time.
      *
      * @param request CreateListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateListenerResponse
     */
    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientAffinity)) {
            query.put("ClientAffinity", request.clientAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customRoutingEndpointGroupConfigurations)) {
            query.put("CustomRoutingEndpointGroupConfigurations", request.customRoutingEndpointGroupConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupConfigurations)) {
            query.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            query.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocol)) {
            query.put("ProxyProtocol", request.proxyProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedForConfig)) {
            query.put("XForwardedForConfig", request.XForwardedForConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateListener"),
            new TeaPair("version", "2019-11-20"),
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
      * A listener listens for connection requests and then distributes the requests to endpoints based on the forwarding rules that are defined by a specified scheduling algorithm. You can call this operation to create a listener for a standard GA instance.
      * Before you call this operation, take note of the following limits:
      * *   The **CreateListener** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the status of a listener:
      *     *   If a listener is in the **init** state, the listener is being created. In this case, you can perform only query operations.
      *     *   If a listener is in the **active** state, the listener is created.
      * *   You cannot repeatedly call the **CreateListener** operation for the same GA instance within the specified period of time.
      *
      * @param request CreateListenerRequest
      * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    /**
      * *   **CreateSpareIps** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that spare IP addresses are being created for the CNAME that is assigned to the GA instance. In this case, you can only perform query operations.
      *     *   If the GA instance is in the **active** state, it indicates that spare IP addresses are created for the CNAME that is assigned to the GA instance.
      * *   The **CreateSpareIps** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
      * @param request CreateSpareIpsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateSpareIpsResponse
     */
    public CreateSpareIpsResponse createSpareIpsWithOptions(CreateSpareIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spareIps)) {
            query.put("SpareIps", request.spareIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSpareIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSpareIpsResponse());
    }

    /**
      * *   **CreateSpareIps** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that spare IP addresses are being created for the CNAME that is assigned to the GA instance. In this case, you can only perform query operations.
      *     *   If the GA instance is in the **active** state, it indicates that spare IP addresses are created for the CNAME that is assigned to the GA instance.
      * *   The **CreateSpareIps** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
      * @param request CreateSpareIpsRequest
      * @return CreateSpareIpsResponse
     */
    public CreateSpareIpsResponse createSpareIps(CreateSpareIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSpareIpsWithOptions(request, runtime);
    }

    /**
      * *   Subscription GA instances cannot be deleted.
      * *   GA instances that have bandwidth plans associated cannot be deleted. To delete such GA instances, disassociate the bandwidth plans. For information about how to disassociate a bandwidth plan from a GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   **DeleteAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **deleting** state, it indicates that the GA instance is being deleted. In this case, you can perform only query operations.
      *     *   If the GA instance cannot be queried, it indicates that the GA instance is deleted.
      *
      * @param request DeleteAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAcceleratorResponse
     */
    public DeleteAcceleratorResponse deleteAcceleratorWithOptions(DeleteAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAcceleratorResponse());
    }

    /**
      * *   Subscription GA instances cannot be deleted.
      * *   GA instances that have bandwidth plans associated cannot be deleted. To delete such GA instances, disassociate the bandwidth plans. For information about how to disassociate a bandwidth plan from a GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   **DeleteAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **deleting** state, it indicates that the GA instance is being deleted. In this case, you can perform only query operations.
      *     *   If the GA instance cannot be queried, it indicates that the GA instance is deleted.
      *
      * @param request DeleteAcceleratorRequest
      * @return DeleteAcceleratorResponse
     */
    public DeleteAcceleratorResponse deleteAccelerator(DeleteAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAcceleratorWithOptions(request, runtime);
    }

    /**
      * **DeleteAcl** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) operation to query the state of a network ACL.
      * *   If the network ACL is in the **deleting** state, it indicates that the network ACL is being deleted. In this case, you can perform only query operations.
      * *   If the network ACL cannot be queried, it indicates that the network ACL is deleted.
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAcl"),
            new TeaPair("version", "2019-11-20"),
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
      * **DeleteAcl** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) operation to query the state of a network ACL.
      * *   If the network ACL is in the **deleting** state, it indicates that the network ACL is being deleted. In this case, you can perform only query operations.
      * *   If the network ACL cannot be queried, it indicates that the network ACL is deleted.
      *
      * @param request DeleteAclRequest
      * @return DeleteAclResponse
     */
    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    /**
      * *   **DeleteApplicationMonitor** is an asynchronous operation. After you call this operation, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListApplicationMonitor](~~408462~~) operation to query the state of an origin probing task.
      *     *   If the origin probing task is in the **deleting** state, it indicates that the task is being deleted. In this case, you can perform only query operations.
      *     <!---->
      *     *   If the origin probing task cannot be queried, it indicates that the task is deleted.
      * *   The **DeleteApplicationMonitor** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteApplicationMonitorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteApplicationMonitorResponse
     */
    public DeleteApplicationMonitorResponse deleteApplicationMonitorWithOptions(DeleteApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationMonitorResponse());
    }

    /**
      * *   **DeleteApplicationMonitor** is an asynchronous operation. After you call this operation, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListApplicationMonitor](~~408462~~) operation to query the state of an origin probing task.
      *     *   If the origin probing task is in the **deleting** state, it indicates that the task is being deleted. In this case, you can perform only query operations.
      *     <!---->
      *     *   If the origin probing task cannot be queried, it indicates that the task is deleted.
      * *   The **DeleteApplicationMonitor** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteApplicationMonitorRequest
      * @return DeleteApplicationMonitorResponse
     */
    public DeleteApplicationMonitorResponse deleteApplicationMonitor(DeleteApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationMonitorWithOptions(request, runtime);
    }

    /**
      * *   By default, subscription bandwidth plans cannot be deleted. To delete a subscription bandwidth plan by calling this operation, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   Bandwidth plans that are associated with Global Accelerator (GA) instances cannot be deleted. Before you can delete a bandwidth plan that is associated with a GA instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   **DeleteBandwidthPackage** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan that you attempt to delete.
      *     *   If the bandwidth plan is in the **deleting** state, it indicates that the bandwidth plan is being deleted. In this case, you can perform only query operations.
      *     *   If the bandwidth plan cannot be found, it indicates that the bandwidth plan is deleted.
      * *   The **DeleteBandwidthPackage** operation cannot be called repeatedly for the same bandwidth plan within a specific period of time.
      *
      * @param request DeleteBandwidthPackageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBandwidthPackageResponse
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBandwidthPackageResponse());
    }

    /**
      * *   By default, subscription bandwidth plans cannot be deleted. To delete a subscription bandwidth plan by calling this operation, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   Bandwidth plans that are associated with Global Accelerator (GA) instances cannot be deleted. Before you can delete a bandwidth plan that is associated with a GA instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   **DeleteBandwidthPackage** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the state of the bandwidth plan that you attempt to delete.
      *     *   If the bandwidth plan is in the **deleting** state, it indicates that the bandwidth plan is being deleted. In this case, you can perform only query operations.
      *     *   If the bandwidth plan cannot be found, it indicates that the bandwidth plan is deleted.
      * *   The **DeleteBandwidthPackage** operation cannot be called repeatedly for the same bandwidth plan within a specific period of time.
      *
      * @param request DeleteBandwidthPackageRequest
      * @return DeleteBandwidthPackageResponse
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    /**
      * *   **DeleteBasicAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerateIp](~~466794~~) API operation to query the status of an accelerated IP address:
      *     *   If the accelerated IP address is in the **deleting** state, the accelerated IP address is being deleted. In this case, you can perform only query operations.
      *     *   If the system fails to return information about the accelerated IP address, the accelerated IP address is deleted.
      * *   The **DeleteBasicAccelerateIp** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request DeleteBasicAccelerateIpRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBasicAccelerateIpResponse
     */
    public DeleteBasicAccelerateIpResponse deleteBasicAccelerateIpWithOptions(DeleteBasicAccelerateIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBasicAccelerateIp"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBasicAccelerateIpResponse());
    }

    /**
      * *   **DeleteBasicAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerateIp](~~466794~~) API operation to query the status of an accelerated IP address:
      *     *   If the accelerated IP address is in the **deleting** state, the accelerated IP address is being deleted. In this case, you can perform only query operations.
      *     *   If the system fails to return information about the accelerated IP address, the accelerated IP address is deleted.
      * *   The **DeleteBasicAccelerateIp** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request DeleteBasicAccelerateIpRequest
      * @return DeleteBasicAccelerateIpResponse
     */
    public DeleteBasicAccelerateIpResponse deleteBasicAccelerateIp(DeleteBasicAccelerateIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicAccelerateIpWithOptions(request, runtime);
    }

    /**
      * *   **DeleteBasicAccelerateIpEndpointRelation** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the following operations to check whether an accelerated IP address is disassociated from an endpoint:
      *     *   You can call the [GetBasicAccelerateIp](~~466794~~) and [ListBasicEndpoints](~~466831~~) operations to query the status of an accelerated IP address and an endpoint. If the accelerated IP address and the endpoint are in the **unbinding** state, the accelerated IP address is being disassociated from the endpoint. In this case, you can query the IP address and endpoint but cannot perform other operations.
      *     *   If the association status between the accelerated IP address and the endpoint cannot be queried by calling the [ListBasicAccelerateIpEndpointRelations](~~466803~~) operation, the accelerated IP address is disassociated from the endpoint.
      * *   The **DeleteBasicAccelerateIpEndpointRelation** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request DeleteBasicAccelerateIpEndpointRelationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBasicAccelerateIpEndpointRelationResponse
     */
    public DeleteBasicAccelerateIpEndpointRelationResponse deleteBasicAccelerateIpEndpointRelationWithOptions(DeleteBasicAccelerateIpEndpointRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBasicAccelerateIpEndpointRelation"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBasicAccelerateIpEndpointRelationResponse());
    }

    /**
      * *   **DeleteBasicAccelerateIpEndpointRelation** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the following operations to check whether an accelerated IP address is disassociated from an endpoint:
      *     *   You can call the [GetBasicAccelerateIp](~~466794~~) and [ListBasicEndpoints](~~466831~~) operations to query the status of an accelerated IP address and an endpoint. If the accelerated IP address and the endpoint are in the **unbinding** state, the accelerated IP address is being disassociated from the endpoint. In this case, you can query the IP address and endpoint but cannot perform other operations.
      *     *   If the association status between the accelerated IP address and the endpoint cannot be queried by calling the [ListBasicAccelerateIpEndpointRelations](~~466803~~) operation, the accelerated IP address is disassociated from the endpoint.
      * *   The **DeleteBasicAccelerateIpEndpointRelation** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request DeleteBasicAccelerateIpEndpointRelationRequest
      * @return DeleteBasicAccelerateIpEndpointRelationResponse
     */
    public DeleteBasicAccelerateIpEndpointRelationResponse deleteBasicAccelerateIpEndpointRelation(DeleteBasicAccelerateIpEndpointRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicAccelerateIpEndpointRelationWithOptions(request, runtime);
    }

    /**
      * **DeleteBasicAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicAccelerator](~~353188~~) operation to query the state of a basic GA instance.
      * *   If the basic GA instance is in the **deleting** state, it indicates that the instance is being deleted. In this case, you can perform only query operations.
      * *   If the information of the basic GA instance is not displayed in the response, it indicates that the instance is deleted.
      *
      * @param request DeleteBasicAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBasicAcceleratorResponse
     */
    public DeleteBasicAcceleratorResponse deleteBasicAcceleratorWithOptions(DeleteBasicAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBasicAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBasicAcceleratorResponse());
    }

    /**
      * **DeleteBasicAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicAccelerator](~~353188~~) operation to query the state of a basic GA instance.
      * *   If the basic GA instance is in the **deleting** state, it indicates that the instance is being deleted. In this case, you can perform only query operations.
      * *   If the information of the basic GA instance is not displayed in the response, it indicates that the instance is deleted.
      *
      * @param request DeleteBasicAcceleratorRequest
      * @return DeleteBasicAcceleratorResponse
     */
    public DeleteBasicAcceleratorResponse deleteBasicAccelerator(DeleteBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicAcceleratorWithOptions(request, runtime);
    }

    /**
      * *   **DeleteBasicEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) operation to query the status of endpoints.
      *     *   If the endpoint is in the **deleting** state, it indicates that the endpoint is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint cannot be found, it indicates that the endpoint is deleted.
      * *   The **DeleteBasicEndpoint** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request DeleteBasicEndpointRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBasicEndpointResponse
     */
    public DeleteBasicEndpointResponse deleteBasicEndpointWithOptions(DeleteBasicEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBasicEndpoint"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBasicEndpointResponse());
    }

    /**
      * *   **DeleteBasicEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) operation to query the status of endpoints.
      *     *   If the endpoint is in the **deleting** state, it indicates that the endpoint is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint cannot be found, it indicates that the endpoint is deleted.
      * *   The **DeleteBasicEndpoint** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
      * @param request DeleteBasicEndpointRequest
      * @return DeleteBasicEndpointResponse
     */
    public DeleteBasicEndpointResponse deleteBasicEndpoint(DeleteBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicEndpointWithOptions(request, runtime);
    }

    /**
      * *   **DeleteBasicEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicEndpointGroup](~~362984~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteBasicEndpointGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request DeleteBasicEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBasicEndpointGroupResponse
     */
    public DeleteBasicEndpointGroupResponse deleteBasicEndpointGroupWithOptions(DeleteBasicEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBasicEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBasicEndpointGroupResponse());
    }

    /**
      * *   **DeleteBasicEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicEndpointGroup](~~362984~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteBasicEndpointGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request DeleteBasicEndpointGroupRequest
      * @return DeleteBasicEndpointGroupResponse
     */
    public DeleteBasicEndpointGroupResponse deleteBasicEndpointGroup(DeleteBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
      * *   **DeleteBasicIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicIpSet](~~362987~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the information of the acceleration region is not displayed in the response, it indicates that the acceleration region is deleted.
      * *   The **DeleteBasicIpSet** cannot be called repeatedly for the same basic GA instance within a specific period of time.
      *
      * @param request DeleteBasicIpSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBasicIpSetResponse
     */
    public DeleteBasicIpSetResponse deleteBasicIpSetWithOptions(DeleteBasicIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBasicIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBasicIpSetResponse());
    }

    /**
      * *   **DeleteBasicIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicIpSet](~~362987~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the information of the acceleration region is not displayed in the response, it indicates that the acceleration region is deleted.
      * *   The **DeleteBasicIpSet** cannot be called repeatedly for the same basic GA instance within a specific period of time.
      *
      * @param request DeleteBasicIpSetRequest
      * @return DeleteBasicIpSetResponse
     */
    public DeleteBasicIpSetResponse deleteBasicIpSet(DeleteBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicIpSetWithOptions(request, runtime);
    }

    /**
      * *   **DeleteCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) to query the state of an endpoint group and determine whether mappings are deleted from the endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that mappings are being deleted from the endpoint group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state and no information about the mappings that you attempt to delete is found in the response when you call the [DescribeCustomRoutingEndpointGroupDestinations](~~449378~~) operation, it indicates the mappings are deleted from the endpoint group.
      * *   The **DeleteCustomRoutingEndpointGroupDestinations** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteCustomRoutingEndpointGroupDestinationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCustomRoutingEndpointGroupDestinationsResponse
     */
    public DeleteCustomRoutingEndpointGroupDestinationsResponse deleteCustomRoutingEndpointGroupDestinationsWithOptions(DeleteCustomRoutingEndpointGroupDestinationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationIds)) {
            query.put("DestinationIds", request.destinationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomRoutingEndpointGroupDestinations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomRoutingEndpointGroupDestinationsResponse());
    }

    /**
      * *   **DeleteCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) to query the state of an endpoint group and determine whether mappings are deleted from the endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that mappings are being deleted from the endpoint group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state and no information about the mappings that you attempt to delete is found in the response when you call the [DescribeCustomRoutingEndpointGroupDestinations](~~449378~~) operation, it indicates the mappings are deleted from the endpoint group.
      * *   The **DeleteCustomRoutingEndpointGroupDestinations** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteCustomRoutingEndpointGroupDestinationsRequest
      * @return DeleteCustomRoutingEndpointGroupDestinationsResponse
     */
    public DeleteCustomRoutingEndpointGroupDestinationsResponse deleteCustomRoutingEndpointGroupDestinations(DeleteCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
      * *   **DeleteCustomRoutingEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of the endpoint groups associated with a custom routing listener that you attempt to delete.
      *     *   If the endpoint groups are in the **deleting** state, the endpoint groups are being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint groups cannot be queried, the endpoint groups are deleted.
      * *   The **DeleteCustomRoutingEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteCustomRoutingEndpointGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCustomRoutingEndpointGroupsResponse
     */
    public DeleteCustomRoutingEndpointGroupsResponse deleteCustomRoutingEndpointGroupsWithOptions(DeleteCustomRoutingEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupIds)) {
            query.put("EndpointGroupIds", request.endpointGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomRoutingEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomRoutingEndpointGroupsResponse());
    }

    /**
      * *   **DeleteCustomRoutingEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of the endpoint groups associated with a custom routing listener that you attempt to delete.
      *     *   If the endpoint groups are in the **deleting** state, the endpoint groups are being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint groups cannot be queried, the endpoint groups are deleted.
      * *   The **DeleteCustomRoutingEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteCustomRoutingEndpointGroupsRequest
      * @return DeleteCustomRoutingEndpointGroupsResponse
     */
    public DeleteCustomRoutingEndpointGroupsResponse deleteCustomRoutingEndpointGroups(DeleteCustomRoutingEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointGroupsWithOptions(request, runtime);
    }

    /**
      * *   **DeleteCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of an endpoint group to check whether access policies of traffic for endpoints in the endpoint group are deleted.
      *     *   If the endpoint group is in the **updating** state, access policies of traffic for endpoints in the endpoint group are being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state and access policies of traffic that you want to delete cannot be queried by calling the [DescribeCustomRoutingEndPointTrafficPolicy](~~449392~~) operation, the access policies of traffic for endpoints in the endpoint group are deleted.
      * *   The **DeleteCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteCustomRoutingEndpointTrafficPoliciesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCustomRoutingEndpointTrafficPoliciesResponse
     */
    public DeleteCustomRoutingEndpointTrafficPoliciesResponse deleteCustomRoutingEndpointTrafficPoliciesWithOptions(DeleteCustomRoutingEndpointTrafficPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyIds)) {
            query.put("PolicyIds", request.policyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomRoutingEndpointTrafficPolicies"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomRoutingEndpointTrafficPoliciesResponse());
    }

    /**
      * *   **DeleteCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of an endpoint group to check whether access policies of traffic for endpoints in the endpoint group are deleted.
      *     *   If the endpoint group is in the **updating** state, access policies of traffic for endpoints in the endpoint group are being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state and access policies of traffic that you want to delete cannot be queried by calling the [DescribeCustomRoutingEndPointTrafficPolicy](~~449392~~) operation, the access policies of traffic for endpoints in the endpoint group are deleted.
      * *   The **DeleteCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteCustomRoutingEndpointTrafficPoliciesRequest
      * @return DeleteCustomRoutingEndpointTrafficPoliciesResponse
     */
    public DeleteCustomRoutingEndpointTrafficPoliciesResponse deleteCustomRoutingEndpointTrafficPolicies(DeleteCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
      * *   The **DeleteCustomRoutingEndpoints** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) to query the status of an endpoint group and check whether an endpoint is deleted.
      *     *   If an endpoint group is in the **updating** state, the endpoint is being deleted. In this case, you can perform only query operations.
      *     *   If an endpoint group is in the **active** state and the endpoint cannot be found after you call the [DescribeCustomRoutingEndpoint](~~449386~~) operation, the endpoint is deleted.
      * *   You cannot repeatedly call the **DeleteCustomRoutingEndpoints** operation for the same Global Accelerator (GA) instance within the specified period of time.
      *
      * @param request DeleteCustomRoutingEndpointsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCustomRoutingEndpointsResponse
     */
    public DeleteCustomRoutingEndpointsResponse deleteCustomRoutingEndpointsWithOptions(DeleteCustomRoutingEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointIds)) {
            query.put("EndpointIds", request.endpointIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomRoutingEndpoints"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomRoutingEndpointsResponse());
    }

    /**
      * *   The **DeleteCustomRoutingEndpoints** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) to query the status of an endpoint group and check whether an endpoint is deleted.
      *     *   If an endpoint group is in the **updating** state, the endpoint is being deleted. In this case, you can perform only query operations.
      *     *   If an endpoint group is in the **active** state and the endpoint cannot be found after you call the [DescribeCustomRoutingEndpoint](~~449386~~) operation, the endpoint is deleted.
      * *   You cannot repeatedly call the **DeleteCustomRoutingEndpoints** operation for the same Global Accelerator (GA) instance within the specified period of time.
      *
      * @param request DeleteCustomRoutingEndpointsRequest
      * @return DeleteCustomRoutingEndpointsResponse
     */
    public DeleteCustomRoutingEndpointsResponse deleteCustomRoutingEndpoints(DeleteCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
      * You cannot repeatedly call the **DeleteDomainAcceleratorRelation** operation by using the same Alibaba Cloud account within a specific period of time.
      *
      * @param request DeleteDomainAcceleratorRelationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDomainAcceleratorRelationResponse
     */
    public DeleteDomainAcceleratorRelationResponse deleteDomainAcceleratorRelationWithOptions(DeleteDomainAcceleratorRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorIds)) {
            query.put("AcceleratorIds", request.acceleratorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainAcceleratorRelation"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainAcceleratorRelationResponse());
    }

    /**
      * You cannot repeatedly call the **DeleteDomainAcceleratorRelation** operation by using the same Alibaba Cloud account within a specific period of time.
      *
      * @param request DeleteDomainAcceleratorRelationRequest
      * @return DeleteDomainAcceleratorRelationResponse
     */
    public DeleteDomainAcceleratorRelationResponse deleteDomainAcceleratorRelation(DeleteDomainAcceleratorRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainAcceleratorRelationWithOptions(request, runtime);
    }

    /**
      * *   **DeleteEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteEndpointGroupResponse
     */
    public DeleteEndpointGroupResponse deleteEndpointGroupWithOptions(DeleteEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEndpointGroupResponse());
    }

    /**
      * *   **DeleteEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteEndpointGroupRequest
      * @return DeleteEndpointGroupResponse
     */
    public DeleteEndpointGroupResponse deleteEndpointGroup(DeleteEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEndpointGroupWithOptions(request, runtime);
    }

    /**
      * *   **DeleteEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteEndpointGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteEndpointGroupsResponse
     */
    public DeleteEndpointGroupsResponse deleteEndpointGroupsWithOptions(DeleteEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupIds)) {
            query.put("EndpointGroupIds", request.endpointGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEndpointGroupsResponse());
    }

    /**
      * *   **DeleteEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteEndpointGroupsRequest
      * @return DeleteEndpointGroupsResponse
     */
    public DeleteEndpointGroupsResponse deleteEndpointGroups(DeleteEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEndpointGroupsWithOptions(request, runtime);
    }

    /**
      * *   **DeleteForwardingRules** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of a forwarding rule.
      *     *   If the forwarding rule is in the **deleting** state, the forwarding rule is being deleted. In this case, you can perform only query operations.
      *     *   If the forwarding rule cannot be queried, the forwarding rule is deleted.
      * *   The **DeleteForwardingRules** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteForwardingRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteForwardingRulesResponse
     */
    public DeleteForwardingRulesResponse deleteForwardingRulesWithOptions(DeleteForwardingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardingRuleIds)) {
            query.put("ForwardingRuleIds", request.forwardingRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteForwardingRulesResponse());
    }

    /**
      * *   **DeleteForwardingRules** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of a forwarding rule.
      *     *   If the forwarding rule is in the **deleting** state, the forwarding rule is being deleted. In this case, you can perform only query operations.
      *     *   If the forwarding rule cannot be queried, the forwarding rule is deleted.
      * *   The **DeleteForwardingRules** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteForwardingRulesRequest
      * @return DeleteForwardingRulesResponse
     */
    public DeleteForwardingRulesResponse deleteForwardingRules(DeleteForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardingRulesWithOptions(request, runtime);
    }

    /**
      * *   **DeleteIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the acceleration region cannot be queried, the acceleration region is deleted.
      * *   The **DeleteIpSet** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteIpSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteIpSetResponse
     */
    public DeleteIpSetResponse deleteIpSetWithOptions(DeleteIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpSetResponse());
    }

    /**
      * *   **DeleteIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the acceleration region cannot be queried, the acceleration region is deleted.
      * *   The **DeleteIpSet** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteIpSetRequest
      * @return DeleteIpSetResponse
     */
    public DeleteIpSetResponse deleteIpSet(DeleteIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpSetWithOptions(request, runtime);
    }

    /**
      * *   **DeleteIpSets** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the acceleration region cannot be queried, the acceleration region is deleted.
      * *   The **DeleteIpSets** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteIpSetsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteIpSetsResponse
     */
    public DeleteIpSetsResponse deleteIpSetsWithOptions(DeleteIpSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipSetIds)) {
            query.put("IpSetIds", request.ipSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpSetsResponse());
    }

    /**
      * *   **DeleteIpSets** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the acceleration region cannot be queried, the acceleration region is deleted.
      * *   The **DeleteIpSets** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteIpSetsRequest
      * @return DeleteIpSetsResponse
     */
    public DeleteIpSetsResponse deleteIpSets(DeleteIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpSetsWithOptions(request, runtime);
    }

    /**
      * *   **DeleteListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener.
      *     *   If the listener is in the **deleting** state, it indicates that the listener is being deleted. In this case, you can perform only query operations.
      *     *   If the listener cannot be queried, it indicates that the listener is deleted.
      * *   The **DeleteListener** operation cannot be repeatedly called to delete listeners for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteListener"),
            new TeaPair("version", "2019-11-20"),
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
      * *   **DeleteListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener.
      *     *   If the listener is in the **deleting** state, it indicates that the listener is being deleted. In this case, you can perform only query operations.
      *     *   If the listener cannot be queried, it indicates that the listener is deleted.
      * *   The **DeleteListener** operation cannot be repeatedly called to delete listeners for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DeleteListenerRequest
      * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    /**
      * *   **DeleteSpareIps** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the secondary IP addresses for the CNAME are being deleted. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state and the secondary IP addresses for the CNAME cannot be queried by calling the [ListSpareIps](~~262121~~) operation, it indicates that the IP addresses are deleted.
      * *   The **DeleteSpareIps** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request DeleteSpareIpsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteSpareIpsResponse
     */
    public DeleteSpareIpsResponse deleteSpareIpsWithOptions(DeleteSpareIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spareIps)) {
            query.put("SpareIps", request.spareIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpareIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpareIpsResponse());
    }

    /**
      * *   **DeleteSpareIps** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the secondary IP addresses for the CNAME are being deleted. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state and the secondary IP addresses for the CNAME cannot be queried by calling the [ListSpareIps](~~262121~~) operation, it indicates that the IP addresses are deleted.
      * *   The **DeleteSpareIps** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request DeleteSpareIpsRequest
      * @return DeleteSpareIpsResponse
     */
    public DeleteSpareIpsResponse deleteSpareIps(DeleteSpareIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSpareIpsWithOptions(request, runtime);
    }

    public DescribeAcceleratorResponse describeAcceleratorWithOptions(DescribeAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAcceleratorResponse());
    }

    public DescribeAcceleratorResponse describeAccelerator(DescribeAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAcceleratorWithOptions(request, runtime);
    }

    public DescribeAcceleratorAutoRenewAttributeResponse describeAcceleratorAutoRenewAttributeWithOptions(DescribeAcceleratorAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAcceleratorAutoRenewAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAcceleratorAutoRenewAttributeResponse());
    }

    public DescribeAcceleratorAutoRenewAttributeResponse describeAcceleratorAutoRenewAttribute(DescribeAcceleratorAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAcceleratorAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeApplicationMonitorResponse describeApplicationMonitorWithOptions(DescribeApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationMonitorResponse());
    }

    public DescribeApplicationMonitorResponse describeApplicationMonitor(DescribeApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationMonitorWithOptions(request, runtime);
    }

    public DescribeBandwidthPackageResponse describeBandwidthPackageWithOptions(DescribeBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwidthPackageResponse());
    }

    public DescribeBandwidthPackageResponse describeBandwidthPackage(DescribeBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthPackageWithOptions(request, runtime);
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponse describeBandwidthPackageAutoRenewAttributeWithOptions(DescribeBandwidthPackageAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwidthPackageAutoRenewAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwidthPackageAutoRenewAttributeResponse());
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponse describeBandwidthPackageAutoRenewAttribute(DescribeBandwidthPackageAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthPackageAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeCommodityResponse describeCommodityWithOptions(DescribeCommodityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommodity"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommodityResponse());
    }

    public DescribeCommodityResponse describeCommodity(DescribeCommodityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommodityWithOptions(request, runtime);
    }

    public DescribeCommodityPriceResponse describeCommodityPriceWithOptions(DescribeCommodityPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orders)) {
            query.put("Orders", request.orders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommodityPrice"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommodityPriceResponse());
    }

    public DescribeCommodityPriceResponse describeCommodityPrice(DescribeCommodityPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommodityPriceWithOptions(request, runtime);
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponse describeCustomRoutingEndPointTrafficPolicyWithOptions(DescribeCustomRoutingEndPointTrafficPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomRoutingEndPointTrafficPolicy"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomRoutingEndPointTrafficPolicyResponse());
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponse describeCustomRoutingEndPointTrafficPolicy(DescribeCustomRoutingEndPointTrafficPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndPointTrafficPolicyWithOptions(request, runtime);
    }

    public DescribeCustomRoutingEndpointResponse describeCustomRoutingEndpointWithOptions(DescribeCustomRoutingEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroup)) {
            query.put("EndpointGroup", request.endpointGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomRoutingEndpoint"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomRoutingEndpointResponse());
    }

    public DescribeCustomRoutingEndpointResponse describeCustomRoutingEndpoint(DescribeCustomRoutingEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndpointWithOptions(request, runtime);
    }

    public DescribeCustomRoutingEndpointGroupResponse describeCustomRoutingEndpointGroupWithOptions(DescribeCustomRoutingEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomRoutingEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomRoutingEndpointGroupResponse());
    }

    public DescribeCustomRoutingEndpointGroupResponse describeCustomRoutingEndpointGroup(DescribeCustomRoutingEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndpointGroupWithOptions(request, runtime);
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponse describeCustomRoutingEndpointGroupDestinationsWithOptions(DescribeCustomRoutingEndpointGroupDestinationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationId)) {
            query.put("DestinationId", request.destinationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomRoutingEndpointGroupDestinations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomRoutingEndpointGroupDestinationsResponse());
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponse describeCustomRoutingEndpointGroupDestinations(DescribeCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    public DescribeEndpointGroupResponse describeEndpointGroupWithOptions(DescribeEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndpointGroupResponse());
    }

    public DescribeEndpointGroupResponse describeEndpointGroup(DescribeEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndpointGroupWithOptions(request, runtime);
    }

    public DescribeIpSetResponse describeIpSetWithOptions(DescribeIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpSetResponse());
    }

    public DescribeIpSetResponse describeIpSet(DescribeIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpSetWithOptions(request, runtime);
    }

    /**
      * This operation is used to query configuration information about a specified listener of a GA instance. The information includes the routing type of the listener, the state of the listener, the timestamp that indicates when the listener was created, and the listener ports.
      *
      * @param request DescribeListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeListenerResponse
     */
    public DescribeListenerResponse describeListenerWithOptions(DescribeListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeListener"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListenerResponse());
    }

    /**
      * This operation is used to query configuration information about a specified listener of a GA instance. The information includes the routing type of the listener, the state of the listener, the timestamp that indicates when the listener was created, and the listener ports.
      *
      * @param request DescribeListenerRequest
      * @return DescribeListenerResponse
     */
    public DescribeListenerResponse describeListener(DescribeListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListenerWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-11-20"),
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

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
      * *   The **DetachDdosFromAccelerator** operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, the Anti-DDoS Pro/Premium instance is being disassociated from the GA instance. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the Anti-DDoS Pro/Premium instance is disassociated from the GA instance.
      * *   **DetachDdosFromAccelerator** cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request DetachDdosFromAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachDdosFromAcceleratorResponse
     */
    public DetachDdosFromAcceleratorResponse detachDdosFromAcceleratorWithOptions(DetachDdosFromAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDdosFromAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDdosFromAcceleratorResponse());
    }

    /**
      * *   The **DetachDdosFromAccelerator** operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, the Anti-DDoS Pro/Premium instance is being disassociated from the GA instance. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the Anti-DDoS Pro/Premium instance is disassociated from the GA instance.
      * *   **DetachDdosFromAccelerator** cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request DetachDdosFromAcceleratorRequest
      * @return DetachDdosFromAcceleratorResponse
     */
    public DetachDdosFromAcceleratorResponse detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDdosFromAcceleratorWithOptions(request, runtime);
    }

    /**
      * *   **DetachLogStoreFromEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, the Log Service Logstore is being disassociated from the endpoint group. In this case, you can perform only query operations.
      *     <!---->
      *     *   If the endpoint group is in the **active** state, the Log Service Logstore is disassociated from the endpoint group.
      * *   The **DetachLogStoreFromEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DetachLogStoreFromEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachLogStoreFromEndpointGroupResponse
     */
    public DetachLogStoreFromEndpointGroupResponse detachLogStoreFromEndpointGroupWithOptions(DetachLogStoreFromEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupIds)) {
            query.put("EndpointGroupIds", request.endpointGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachLogStoreFromEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachLogStoreFromEndpointGroupResponse());
    }

    /**
      * *   **DetachLogStoreFromEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, the Log Service Logstore is being disassociated from the endpoint group. In this case, you can perform only query operations.
      *     <!---->
      *     *   If the endpoint group is in the **active** state, the Log Service Logstore is disassociated from the endpoint group.
      * *   The **DetachLogStoreFromEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DetachLogStoreFromEndpointGroupRequest
      * @return DetachLogStoreFromEndpointGroupResponse
     */
    public DetachLogStoreFromEndpointGroupResponse detachLogStoreFromEndpointGroup(DetachLogStoreFromEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLogStoreFromEndpointGroupWithOptions(request, runtime);
    }

    public DetectApplicationMonitorResponse detectApplicationMonitorWithOptions(DetectApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectApplicationMonitorResponse());
    }

    public DetectApplicationMonitorResponse detectApplicationMonitor(DetectApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectApplicationMonitorWithOptions(request, runtime);
    }

    public DisableApplicationMonitorResponse disableApplicationMonitorWithOptions(DisableApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationMonitorResponse());
    }

    public DisableApplicationMonitorResponse disableApplicationMonitor(DisableApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationMonitorWithOptions(request, runtime);
    }

    /**
      * *   **DissociateAclsFromListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener:
      *     *   If the listener is in the **updating** state, ACLs are being disassociated from the listener. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, ACLs are disassociated from the listener.
      * *   The **DissociateAclsFromListener** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAclsFromListener"),
            new TeaPair("version", "2019-11-20"),
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
      * *   **DissociateAclsFromListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener:
      *     *   If the listener is in the **updating** state, ACLs are being disassociated from the listener. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, ACLs are disassociated from the listener.
      * *   The **DissociateAclsFromListener** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request DissociateAclsFromListenerRequest
      * @return DissociateAclsFromListenerResponse
     */
    public DissociateAclsFromListenerResponse dissociateAclsFromListener(DissociateAclsFromListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateAclsFromListenerWithOptions(request, runtime);
    }

    /**
      * *   **DissociateAdditionalCertificatesFromListener** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of an HTTPS listener.
      *     *   If the listener is in the **updating** state, it indicates that the additional certificate is being dissociated from the listener. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the additional certificate is dissociated from the listener.
      * *   The **DissociateAdditionalCertificatesFromListener** operation cannot be repeatedly called for the same Global Accelerator (GA) instance with a specific period of time.
      *
      * @param request DissociateAdditionalCertificatesFromListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListenerWithOptions(DissociateAdditionalCertificatesFromListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAdditionalCertificatesFromListener"),
            new TeaPair("version", "2019-11-20"),
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
      * *   **DissociateAdditionalCertificatesFromListener** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of an HTTPS listener.
      *     *   If the listener is in the **updating** state, it indicates that the additional certificate is being dissociated from the listener. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the additional certificate is dissociated from the listener.
      * *   The **DissociateAdditionalCertificatesFromListener** operation cannot be repeatedly called for the same Global Accelerator (GA) instance with a specific period of time.
      *
      * @param request DissociateAdditionalCertificatesFromListenerRequest
      * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateAdditionalCertificatesFromListenerWithOptions(request, runtime);
    }

    public EnableApplicationMonitorResponse enableApplicationMonitorWithOptions(EnableApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationMonitorResponse());
    }

    public EnableApplicationMonitorResponse enableApplicationMonitor(EnableApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationMonitorWithOptions(request, runtime);
    }

    public GetAclResponse getAclWithOptions(GetAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAcl"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAclResponse());
    }

    public GetAclResponse getAcl(GetAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAclWithOptions(request, runtime);
    }

    public GetBasicAccelerateIpResponse getBasicAccelerateIpWithOptions(GetBasicAccelerateIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicAccelerateIp"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicAccelerateIpResponse());
    }

    public GetBasicAccelerateIpResponse getBasicAccelerateIp(GetBasicAccelerateIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAccelerateIpWithOptions(request, runtime);
    }

    public GetBasicAccelerateIpEndpointRelationResponse getBasicAccelerateIpEndpointRelationWithOptions(GetBasicAccelerateIpEndpointRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicAccelerateIpEndpointRelation"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicAccelerateIpEndpointRelationResponse());
    }

    public GetBasicAccelerateIpEndpointRelationResponse getBasicAccelerateIpEndpointRelation(GetBasicAccelerateIpEndpointRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAccelerateIpEndpointRelationWithOptions(request, runtime);
    }

    public GetBasicAccelerateIpIdleCountResponse getBasicAccelerateIpIdleCountWithOptions(GetBasicAccelerateIpIdleCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicAccelerateIpIdleCount"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicAccelerateIpIdleCountResponse());
    }

    public GetBasicAccelerateIpIdleCountResponse getBasicAccelerateIpIdleCount(GetBasicAccelerateIpIdleCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAccelerateIpIdleCountWithOptions(request, runtime);
    }

    public GetBasicAcceleratorResponse getBasicAcceleratorWithOptions(GetBasicAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicAcceleratorResponse());
    }

    public GetBasicAcceleratorResponse getBasicAccelerator(GetBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAcceleratorWithOptions(request, runtime);
    }

    public GetBasicEndpointResponse getBasicEndpointWithOptions(GetBasicEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicEndpoint"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicEndpointResponse());
    }

    public GetBasicEndpointResponse getBasicEndpoint(GetBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicEndpointWithOptions(request, runtime);
    }

    public GetBasicEndpointGroupResponse getBasicEndpointGroupWithOptions(GetBasicEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicEndpointGroupResponse());
    }

    public GetBasicEndpointGroupResponse getBasicEndpointGroup(GetBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicEndpointGroupWithOptions(request, runtime);
    }

    public GetBasicIpSetResponse getBasicIpSetWithOptions(GetBasicIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicIpSetResponse());
    }

    public GetBasicIpSetResponse getBasicIpSet(GetBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicIpSetWithOptions(request, runtime);
    }

    public GetHealthStatusResponse getHealthStatusWithOptions(GetHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHealthStatus"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthStatusResponse());
    }

    public GetHealthStatusResponse getHealthStatus(GetHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHealthStatusWithOptions(request, runtime);
    }

    public GetInvalidDomainCountResponse getInvalidDomainCountWithOptions(GetInvalidDomainCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInvalidDomainCount"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInvalidDomainCountResponse());
    }

    public GetInvalidDomainCountResponse getInvalidDomainCount(GetInvalidDomainCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInvalidDomainCountWithOptions(request, runtime);
    }

    public GetIpsetsBandwidthLimitResponse getIpsetsBandwidthLimitWithOptions(GetIpsetsBandwidthLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIpsetsBandwidthLimit"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIpsetsBandwidthLimitResponse());
    }

    public GetIpsetsBandwidthLimitResponse getIpsetsBandwidthLimit(GetIpsetsBandwidthLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIpsetsBandwidthLimitWithOptions(request, runtime);
    }

    public GetSpareIpResponse getSpareIpWithOptions(GetSpareIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spareIp)) {
            query.put("SpareIp", request.spareIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpareIp"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpareIpResponse());
    }

    public GetSpareIpResponse getSpareIp(GetSpareIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSpareIpWithOptions(request, runtime);
    }

    public ListAccelerateAreasResponse listAccelerateAreasWithOptions(ListAccelerateAreasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccelerateAreas"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccelerateAreasResponse());
    }

    public ListAccelerateAreasResponse listAccelerateAreas(ListAccelerateAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccelerateAreasWithOptions(request, runtime);
    }

    public ListAcceleratorsResponse listAcceleratorsWithOptions(ListAcceleratorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccelerators"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAcceleratorsResponse());
    }

    public ListAcceleratorsResponse listAccelerators(ListAcceleratorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAcceleratorsWithOptions(request, runtime);
    }

    public ListAclsResponse listAclsWithOptions(ListAclsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-11-20"),
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

    public ListAclsResponse listAcls(ListAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAclsWithOptions(request, runtime);
    }

    public ListApplicationMonitorResponse listApplicationMonitorWithOptions(ListApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("SearchValue", request.searchValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationMonitorResponse());
    }

    public ListApplicationMonitorResponse listApplicationMonitor(ListApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationMonitorWithOptions(request, runtime);
    }

    public ListApplicationMonitorDetectResultResponse listApplicationMonitorDetectResultWithOptions(ListApplicationMonitorDetectResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationMonitorDetectResult"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationMonitorDetectResultResponse());
    }

    public ListApplicationMonitorDetectResultResponse listApplicationMonitorDetectResult(ListApplicationMonitorDetectResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationMonitorDetectResultWithOptions(request, runtime);
    }

    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreasWithOptions(ListAvailableAccelerateAreasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableAccelerateAreas"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableAccelerateAreasResponse());
    }

    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableAccelerateAreasWithOptions(request, runtime);
    }

    public ListAvailableBusiRegionsResponse listAvailableBusiRegionsWithOptions(ListAvailableBusiRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableBusiRegions"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableBusiRegionsResponse());
    }

    public ListAvailableBusiRegionsResponse listAvailableBusiRegions(ListAvailableBusiRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableBusiRegionsWithOptions(request, runtime);
    }

    public ListBandwidthPackagesResponse listBandwidthPackagesWithOptions(ListBandwidthPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBandwidthPackages"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBandwidthPackagesResponse());
    }

    public ListBandwidthPackagesResponse listBandwidthPackages(ListBandwidthPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBandwidthPackagesWithOptions(request, runtime);
    }

    public ListBandwidthackagesResponse listBandwidthackagesWithOptions(ListBandwidthackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBandwidthackages"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBandwidthackagesResponse());
    }

    public ListBandwidthackagesResponse listBandwidthackages(ListBandwidthackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBandwidthackagesWithOptions(request, runtime);
    }

    public ListBasicAccelerateIpEndpointRelationsResponse listBasicAccelerateIpEndpointRelationsWithOptions(ListBasicAccelerateIpEndpointRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBasicAccelerateIpEndpointRelations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBasicAccelerateIpEndpointRelationsResponse());
    }

    public ListBasicAccelerateIpEndpointRelationsResponse listBasicAccelerateIpEndpointRelations(ListBasicAccelerateIpEndpointRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicAccelerateIpEndpointRelationsWithOptions(request, runtime);
    }

    public ListBasicAccelerateIpsResponse listBasicAccelerateIpsWithOptions(ListBasicAccelerateIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpAddress)) {
            query.put("AccelerateIpAddress", request.accelerateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accelerateIpId)) {
            query.put("AccelerateIpId", request.accelerateIpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBasicAccelerateIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBasicAccelerateIpsResponse());
    }

    public ListBasicAccelerateIpsResponse listBasicAccelerateIps(ListBasicAccelerateIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicAccelerateIpsWithOptions(request, runtime);
    }

    public ListBasicAcceleratorsResponse listBasicAcceleratorsWithOptions(ListBasicAcceleratorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBasicAccelerators"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBasicAcceleratorsResponse());
    }

    public ListBasicAcceleratorsResponse listBasicAccelerators(ListBasicAcceleratorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicAcceleratorsWithOptions(request, runtime);
    }

    public ListBasicEndpointsResponse listBasicEndpointsWithOptions(ListBasicEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBasicEndpoints"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBasicEndpointsResponse());
    }

    public ListBasicEndpointsResponse listBasicEndpoints(ListBasicEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicEndpointsWithOptions(request, runtime);
    }

    public ListBusiRegionsResponse listBusiRegionsWithOptions(ListBusiRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBusiRegions"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusiRegionsResponse());
    }

    public ListBusiRegionsResponse listBusiRegions(ListBusiRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusiRegionsWithOptions(request, runtime);
    }

    public ListCommonAreasResponse listCommonAreasWithOptions(ListCommonAreasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEpg)) {
            query.put("IsEpg", request.isEpg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isIpSet)) {
            query.put("IsIpSet", request.isIpSet);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommonAreas"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommonAreasResponse());
    }

    public ListCommonAreasResponse listCommonAreas(ListCommonAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommonAreasWithOptions(request, runtime);
    }

    public ListCustomRoutingEndpointGroupDestinationsResponse listCustomRoutingEndpointGroupDestinationsWithOptions(ListCustomRoutingEndpointGroupDestinationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPort)) {
            query.put("FromPort", request.fromPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            query.put("Protocols", request.protocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPort)) {
            query.put("ToPort", request.toPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomRoutingEndpointGroupDestinations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomRoutingEndpointGroupDestinationsResponse());
    }

    public ListCustomRoutingEndpointGroupDestinationsResponse listCustomRoutingEndpointGroupDestinations(ListCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    public ListCustomRoutingEndpointGroupsResponse listCustomRoutingEndpointGroupsWithOptions(ListCustomRoutingEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomRoutingEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomRoutingEndpointGroupsResponse());
    }

    public ListCustomRoutingEndpointGroupsResponse listCustomRoutingEndpointGroups(ListCustomRoutingEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointGroupsWithOptions(request, runtime);
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponse listCustomRoutingEndpointTrafficPoliciesWithOptions(ListCustomRoutingEndpointTrafficPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomRoutingEndpointTrafficPolicies"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomRoutingEndpointTrafficPoliciesResponse());
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponse listCustomRoutingEndpointTrafficPolicies(ListCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    public ListCustomRoutingEndpointsResponse listCustomRoutingEndpointsWithOptions(ListCustomRoutingEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomRoutingEndpoints"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomRoutingEndpointsResponse());
    }

    public ListCustomRoutingEndpointsResponse listCustomRoutingEndpoints(ListCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
      * After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches). The custom routing listener forwards client requests to specified IP addresses and ports in the vSwitches based on the port mapping table. This operation is used to query the generated port mapping table.
      *
      * @param request ListCustomRoutingPortMappingsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListCustomRoutingPortMappingsResponse
     */
    public ListCustomRoutingPortMappingsResponse listCustomRoutingPortMappingsWithOptions(ListCustomRoutingPortMappingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomRoutingPortMappings"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomRoutingPortMappingsResponse());
    }

    /**
      * After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches). The custom routing listener forwards client requests to specified IP addresses and ports in the vSwitches based on the port mapping table. This operation is used to query the generated port mapping table.
      *
      * @param request ListCustomRoutingPortMappingsRequest
      * @return ListCustomRoutingPortMappingsResponse
     */
    public ListCustomRoutingPortMappingsResponse listCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingPortMappingsWithOptions(request, runtime);
    }

    public ListCustomRoutingPortMappingsByDestinationResponse listCustomRoutingPortMappingsByDestinationWithOptions(ListCustomRoutingPortMappingsByDestinationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationAddress)) {
            query.put("DestinationAddress", request.destinationAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomRoutingPortMappingsByDestination"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomRoutingPortMappingsByDestinationResponse());
    }

    public ListCustomRoutingPortMappingsByDestinationResponse listCustomRoutingPortMappingsByDestination(ListCustomRoutingPortMappingsByDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingPortMappingsByDestinationWithOptions(request, runtime);
    }

    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsResponse());
    }

    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainsWithOptions(request, runtime);
    }

    public ListEndpointGroupsResponse listEndpointGroupsWithOptions(ListEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogSwitch)) {
            query.put("AccessLogSwitch", request.accessLogSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupType)) {
            query.put("EndpointGroupType", request.endpointGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEndpointGroupsResponse());
    }

    public ListEndpointGroupsResponse listEndpointGroups(ListEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEndpointGroupsWithOptions(request, runtime);
    }

    /**
      * >  This operation is used to query only custom forwarding rules, not the default forwarding rule.
      *
      * @param request ListForwardingRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListForwardingRulesResponse
     */
    public ListForwardingRulesResponse listForwardingRulesWithOptions(ListForwardingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardingRuleId)) {
            query.put("ForwardingRuleId", request.forwardingRuleId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListForwardingRulesResponse());
    }

    /**
      * >  This operation is used to query only custom forwarding rules, not the default forwarding rule.
      *
      * @param request ListForwardingRulesRequest
      * @return ListForwardingRulesResponse
     */
    public ListForwardingRulesResponse listForwardingRules(ListForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listForwardingRulesWithOptions(request, runtime);
    }

    public ListIpSetsResponse listIpSetsWithOptions(ListIpSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpSetsResponse());
    }

    public ListIpSetsResponse listIpSets(ListIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpSetsWithOptions(request, runtime);
    }

    public ListIspTypesResponse listIspTypesWithOptions(ListIspTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessRegionId)) {
            query.put("BusinessRegionId", request.businessRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIspTypes"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIspTypesResponse());
    }

    public ListIspTypesResponse listIspTypes(ListIspTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIspTypesWithOptions(request, runtime);
    }

    public ListListenerCertificatesResponse listListenerCertificatesWithOptions(ListListenerCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenerCertificates"),
            new TeaPair("version", "2019-11-20"),
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

    public ListListenerCertificatesResponse listListenerCertificates(ListListenerCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenerCertificatesWithOptions(request, runtime);
    }

    /**
      * This operation is used to query information about the listeners of a GA instance, including the state of each listener, the timestamp that indicates when each listener was created, and the listener ports.
      *
      * @param request ListListenersRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListListenersResponse
     */
    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListeners"),
            new TeaPair("version", "2019-11-20"),
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
      * This operation is used to query information about the listeners of a GA instance, including the state of each listener, the timestamp that indicates when each listener was created, and the listener ports.
      *
      * @param request ListListenersRequest
      * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    public ListSpareIpsResponse listSpareIpsWithOptions(ListSpareIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSpareIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSpareIpsResponse());
    }

    public ListSpareIpsResponse listSpareIps(ListSpareIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSpareIpsWithOptions(request, runtime);
    }

    /**
      * You can select a TLS security policy when you create and modify an HTTPS listener. This API operation is used to query the TLS security policies that are supported by HTTPS listeners.
      *
      * @param request ListSystemSecurityPoliciesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPoliciesWithOptions(ListSystemSecurityPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemSecurityPolicies"),
            new TeaPair("version", "2019-11-20"),
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
      * You can select a TLS security policy when you create and modify an HTTPS listener. This API operation is used to query the TLS security policies that are supported by HTTPS listeners.
      *
      * @param request ListSystemSecurityPoliciesRequest
      * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSystemSecurityPoliciesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-11-20"),
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

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public QueryCrossPrivatePermissionResponse queryCrossPrivatePermissionWithOptions(QueryCrossPrivatePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCrossPrivatePermission"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCrossPrivatePermissionResponse());
    }

    public QueryCrossPrivatePermissionResponse queryCrossPrivatePermission(QueryCrossPrivatePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCrossPrivatePermissionWithOptions(request, runtime);
    }

    /**
      * *   The **RemoveEntriesFromAcl** operation is asynchronous. After you send a request, the system returns the request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the status of an ACL:
      *     *   If an ACL is in the **configuring** state, the IP entries are being deleted. In this case, you can perform only query operations.
      *     *   If an ACL is in the **active** state, the IP entries are deleted.
      * *   You cannot repeatedly call the **RemoveEntriesFromAcl** operation for the same Global Accelerator (GA) instance within the specified period of time.
      *
      * @param request RemoveEntriesFromAclRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RemoveEntriesFromAclResponse
     */
    public RemoveEntriesFromAclResponse removeEntriesFromAclWithOptions(RemoveEntriesFromAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEntriesFromAcl"),
            new TeaPair("version", "2019-11-20"),
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
      * *   The **RemoveEntriesFromAcl** operation is asynchronous. After you send a request, the system returns the request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the status of an ACL:
      *     *   If an ACL is in the **configuring** state, the IP entries are being deleted. In this case, you can perform only query operations.
      *     *   If an ACL is in the **active** state, the IP entries are deleted.
      * *   You cannot repeatedly call the **RemoveEntriesFromAcl** operation for the same Global Accelerator (GA) instance within the specified period of time.
      *
      * @param request RemoveEntriesFromAclRequest
      * @return RemoveEntriesFromAclResponse
     */
    public RemoveEntriesFromAclResponse removeEntriesFromAcl(RemoveEntriesFromAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEntriesFromAclWithOptions(request, runtime);
    }

    /**
      * When you call this operation to replace the bandwidth plan that is associated with a GA instance, take note of the following items:
      * *   The GA instance continues to forward network traffic.
      * *   **ReplaceBandwidthPackage** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the state of the GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the associated bandwidth plan is being replaced. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the associated bandwidth plan is replaced.
      * *   The **ReplaceBandwidthPackage** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
      * @param request ReplaceBandwidthPackageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReplaceBandwidthPackageResponse
     */
    public ReplaceBandwidthPackageResponse replaceBandwidthPackageWithOptions(ReplaceBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBandwidthPackageId)) {
            query.put("TargetBandwidthPackageId", request.targetBandwidthPackageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceBandwidthPackageResponse());
    }

    /**
      * When you call this operation to replace the bandwidth plan that is associated with a GA instance, take note of the following items:
      * *   The GA instance continues to forward network traffic.
      * *   **ReplaceBandwidthPackage** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the state of the GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the associated bandwidth plan is being replaced. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the associated bandwidth plan is replaced.
      * *   The **ReplaceBandwidthPackage** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
      * @param request ReplaceBandwidthPackageRequest
      * @return ReplaceBandwidthPackageResponse
     */
    public ReplaceBandwidthPackageResponse replaceBandwidthPackage(ReplaceBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceBandwidthPackageWithOptions(request, runtime);
    }

    /**
      * You can add up to 20 tags to a single Global Accelerator (GA) resource. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags attached to the resource. If the quota is reached, an error message is returned.
      *
      * @param request TagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-11-20"),
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
      * You can add up to 20 tags to a single Global Accelerator (GA) resource. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags attached to the resource. If the quota is reached, an error message is returned.
      *
      * @param request TagResourcesRequest
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
      * *   **UpdateAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **configuring** state, the GA instance is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the GA instance is modified.
      * *   The **UpdateAccelerator** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateAcceleratorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAcceleratorResponse
     */
    public UpdateAcceleratorResponse updateAcceleratorWithOptions(UpdateAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorResponse());
    }

    /**
      * *   **UpdateAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      *     *   If the GA instance is in the **configuring** state, the GA instance is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the GA instance is modified.
      * *   The **UpdateAccelerator** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateAcceleratorRequest
      * @return UpdateAcceleratorResponse
     */
    public UpdateAcceleratorResponse updateAccelerator(UpdateAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorWithOptions(request, runtime);
    }

    /**
      * The **UpdateAcceleratorAutoRenewAttribute** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateAcceleratorAutoRenewAttributeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAcceleratorAutoRenewAttributeResponse
     */
    public UpdateAcceleratorAutoRenewAttributeResponse updateAcceleratorAutoRenewAttributeWithOptions(UpdateAcceleratorAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcceleratorAutoRenewAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorAutoRenewAttributeResponse());
    }

    /**
      * The **UpdateAcceleratorAutoRenewAttribute** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateAcceleratorAutoRenewAttributeRequest
      * @return UpdateAcceleratorAutoRenewAttributeResponse
     */
    public UpdateAcceleratorAutoRenewAttributeResponse updateAcceleratorAutoRenewAttribute(UpdateAcceleratorAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
      * After you modify the specification of a GA instance, you must confirm the modification. The **UpdateAcceleratorConfirm** operation is used to confirm the specification modification to a GA instance. When you call this operation to confirm the specification modification to a GA instance, take note of the following items:
      * *   **UpdateAcceleratorConfirm** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of the GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the specification of the instance is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the specification of the instance is modified.
      * *   The **UpdateAcceleratorConfirm** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
      * @param request UpdateAcceleratorConfirmRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAcceleratorConfirmResponse
     */
    public UpdateAcceleratorConfirmResponse updateAcceleratorConfirmWithOptions(UpdateAcceleratorConfirmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcceleratorConfirm"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorConfirmResponse());
    }

    /**
      * After you modify the specification of a GA instance, you must confirm the modification. The **UpdateAcceleratorConfirm** operation is used to confirm the specification modification to a GA instance. When you call this operation to confirm the specification modification to a GA instance, take note of the following items:
      * *   **UpdateAcceleratorConfirm** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of the GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the specification of the instance is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the specification of the instance is modified.
      * *   The **UpdateAcceleratorConfirm** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
      * @param request UpdateAcceleratorConfirmRequest
      * @return UpdateAcceleratorConfirmResponse
     */
    public UpdateAcceleratorConfirmResponse updateAcceleratorConfirm(UpdateAcceleratorConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorConfirmWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAclAttribute"),
            new TeaPair("version", "2019-11-20"),
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

    public UpdateAclAttributeResponse updateAclAttribute(UpdateAclAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAclAttributeWithOptions(request, runtime);
    }

    /**
      * The UpdateAdditionalCertificateWithListener operation is used to replace an additional certificate. You can call this operation when you want to replace an expired additional certificate with a new additional certificate without changing the associated domain name.
      * *   **UpdateAdditionalCertificateWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListListenerCertificates](~~307743~~) operation to query the state of the additional certificate that is associated with an HTTP listener:
      *     *   If the certificate that you want to replace is in the **updating** state, it indicates that the additional certificate is being replaced for the HTTP listener. In this case, you can perform only query operations.
      *     *   If the replacement certificate is in the **active** state, it indicates that the replacement operation is complete and the replacement certificate is associated with the HTTP listener.
      * *   The **UpdateAdditionalCertificateWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateAdditionalCertificateWithListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAdditionalCertificateWithListenerResponse
     */
    public UpdateAdditionalCertificateWithListenerResponse updateAdditionalCertificateWithListenerWithOptions(UpdateAdditionalCertificateWithListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAdditionalCertificateWithListener"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdditionalCertificateWithListenerResponse());
    }

    /**
      * The UpdateAdditionalCertificateWithListener operation is used to replace an additional certificate. You can call this operation when you want to replace an expired additional certificate with a new additional certificate without changing the associated domain name.
      * *   **UpdateAdditionalCertificateWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListListenerCertificates](~~307743~~) operation to query the state of the additional certificate that is associated with an HTTP listener:
      *     *   If the certificate that you want to replace is in the **updating** state, it indicates that the additional certificate is being replaced for the HTTP listener. In this case, you can perform only query operations.
      *     *   If the replacement certificate is in the **active** state, it indicates that the replacement operation is complete and the replacement certificate is associated with the HTTP listener.
      * *   The **UpdateAdditionalCertificateWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateAdditionalCertificateWithListenerRequest
      * @return UpdateAdditionalCertificateWithListenerResponse
     */
    public UpdateAdditionalCertificateWithListenerResponse updateAdditionalCertificateWithListener(UpdateAdditionalCertificateWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAdditionalCertificateWithListenerWithOptions(request, runtime);
    }

    /**
      * **UpdateApplicationMonitor** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeApplicationMonitor](~~408463~~) or [ListApplicationMonitor](~~408462~~) operation to check whether the configurations of an origin probing task are modified.
      * *   If the values of modified parameters remain unchanged, it indicates that the origin probing task is being modified. In this case, you can perform only query operations.
      * *   If the values of modified parameters change, it indicates that the origin probing task is modified.
      *
      * @param request UpdateApplicationMonitorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateApplicationMonitorResponse
     */
    public UpdateApplicationMonitorResponse updateApplicationMonitorWithOptions(UpdateApplicationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectEnable)) {
            query.put("DetectEnable", request.detectEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectThreshold)) {
            query.put("DetectThreshold", request.detectThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectTimes)) {
            query.put("DetectTimes", request.detectTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsJson)) {
            query.put("OptionsJson", request.optionsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationMonitor"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationMonitorResponse());
    }

    /**
      * **UpdateApplicationMonitor** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeApplicationMonitor](~~408463~~) or [ListApplicationMonitor](~~408462~~) operation to check whether the configurations of an origin probing task are modified.
      * *   If the values of modified parameters remain unchanged, it indicates that the origin probing task is being modified. In this case, you can perform only query operations.
      * *   If the values of modified parameters change, it indicates that the origin probing task is modified.
      *
      * @param request UpdateApplicationMonitorRequest
      * @return UpdateApplicationMonitorResponse
     */
    public UpdateApplicationMonitorResponse updateApplicationMonitor(UpdateApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationMonitorWithOptions(request, runtime);
    }

    /**
      * You cannot repeatedly call the **UpdateBandwidthPackagaAutoRenewAttribute** operation to modify the auto-renewal settings of a bandwidth plan.
      *
      * @param request UpdateBandwidthPackagaAutoRenewAttributeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateBandwidthPackagaAutoRenewAttributeResponse
     */
    public UpdateBandwidthPackagaAutoRenewAttributeResponse updateBandwidthPackagaAutoRenewAttributeWithOptions(UpdateBandwidthPackagaAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBandwidthPackagaAutoRenewAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBandwidthPackagaAutoRenewAttributeResponse());
    }

    /**
      * You cannot repeatedly call the **UpdateBandwidthPackagaAutoRenewAttribute** operation to modify the auto-renewal settings of a bandwidth plan.
      *
      * @param request UpdateBandwidthPackagaAutoRenewAttributeRequest
      * @return UpdateBandwidthPackagaAutoRenewAttributeResponse
     */
    public UpdateBandwidthPackagaAutoRenewAttributeResponse updateBandwidthPackagaAutoRenewAttribute(UpdateBandwidthPackagaAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBandwidthPackagaAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
      * When you call this operation, take note of the following items:
      * *   **UpdateBandwidthPackage** is a synchronous operation when it is called to modify the configurations excluding the bandwidth value of a bandwidth plan. The new configurations take effect immediately after the operation is performed.
      * *   **UpdateBandwidthPackage** is an asynchronous operation when it is called to modify the configurations including the bandwidth value of a bandwidth plan that is not associated with a Global Accelerator (GA) instance. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query whether the bandwidth plan is modified.
      *     *   If the parameter settings of the bandwidth plan remain unchanged, it indicates that the bandwidth plan is being modified. In this case, you can perform only query operations.
      *     *   If the parameter settings of the bandwidth plan change, it indicates that the bandwidth plan is modified.
      * *   **UpdateBandwidthPackage** is an asynchronous operation when it is called to modify the configurations including the bandwidth value of a bandwidth plan that is associated with a GA instance. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of the GA instance and determine whether its associated bandwidth plan is modified.
      *     *   If the GA instance is in the **configuring** state, it indicates that the bandwidth plan is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the bandwidth plan is modified.
      * *   The **UpdateBandwidthPackage** operation cannot be called repeatedly for the same bandwidth plan within a specific period of time.
      *
      * @param request UpdateBandwidthPackageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateBandwidthPackageResponse
     */
    public UpdateBandwidthPackageResponse updateBandwidthPackageWithOptions(UpdateBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageId)) {
            query.put("BandwidthPackageId", request.bandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthType)) {
            query.put("BandwidthType", request.bandwidthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBandwidthPackageResponse());
    }

    /**
      * When you call this operation, take note of the following items:
      * *   **UpdateBandwidthPackage** is a synchronous operation when it is called to modify the configurations excluding the bandwidth value of a bandwidth plan. The new configurations take effect immediately after the operation is performed.
      * *   **UpdateBandwidthPackage** is an asynchronous operation when it is called to modify the configurations including the bandwidth value of a bandwidth plan that is not associated with a Global Accelerator (GA) instance. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query whether the bandwidth plan is modified.
      *     *   If the parameter settings of the bandwidth plan remain unchanged, it indicates that the bandwidth plan is being modified. In this case, you can perform only query operations.
      *     *   If the parameter settings of the bandwidth plan change, it indicates that the bandwidth plan is modified.
      * *   **UpdateBandwidthPackage** is an asynchronous operation when it is called to modify the configurations including the bandwidth value of a bandwidth plan that is associated with a GA instance. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of the GA instance and determine whether its associated bandwidth plan is modified.
      *     *   If the GA instance is in the **configuring** state, it indicates that the bandwidth plan is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the bandwidth plan is modified.
      * *   The **UpdateBandwidthPackage** operation cannot be called repeatedly for the same bandwidth plan within a specific period of time.
      *
      * @param request UpdateBandwidthPackageRequest
      * @return UpdateBandwidthPackageResponse
     */
    public UpdateBandwidthPackageResponse updateBandwidthPackage(UpdateBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBandwidthPackageWithOptions(request, runtime);
    }

    public UpdateBasicAcceleratorResponse updateBasicAcceleratorWithOptions(UpdateBasicAcceleratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBasicAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBasicAcceleratorResponse());
    }

    public UpdateBasicAcceleratorResponse updateBasicAccelerator(UpdateBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicAcceleratorWithOptions(request, runtime);
    }

    public UpdateBasicEndpointResponse updateBasicEndpointWithOptions(UpdateBasicEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBasicEndpoint"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBasicEndpointResponse());
    }

    public UpdateBasicEndpointResponse updateBasicEndpoint(UpdateBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicEndpointWithOptions(request, runtime);
    }

    /**
      * *   **UpdateBasicEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. After you call this operation to modify an endpoint group that is associated with a basic GA instance, the system deletes the endpoint group and creates another endpoint group in the background for the basic GA instance. You can call the [GetBasicAccelerator](~~353188~~) operation to query the state of the basic GA instance.
      *     *   If the basic GA instance is in the **configuring** state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the basic GA instance is in the **active** state, it indicates that the configurations of the endpoint group are modified.
      * *   The **UpdateBasicEndpointGroup** operation cannot be called repeatedly for the same basic GA instance within a specific period of time.
      *
      * @param request UpdateBasicEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateBasicEndpointGroupResponse
     */
    public UpdateBasicEndpointGroupResponse updateBasicEndpointGroupWithOptions(UpdateBasicEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointAddress)) {
            query.put("EndpointAddress", request.endpointAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointSubAddress)) {
            query.put("EndpointSubAddress", request.endpointSubAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBasicEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBasicEndpointGroupResponse());
    }

    /**
      * *   **UpdateBasicEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. After you call this operation to modify an endpoint group that is associated with a basic GA instance, the system deletes the endpoint group and creates another endpoint group in the background for the basic GA instance. You can call the [GetBasicAccelerator](~~353188~~) operation to query the state of the basic GA instance.
      *     *   If the basic GA instance is in the **configuring** state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the basic GA instance is in the **active** state, it indicates that the configurations of the endpoint group are modified.
      * *   The **UpdateBasicEndpointGroup** operation cannot be called repeatedly for the same basic GA instance within a specific period of time.
      *
      * @param request UpdateBasicEndpointGroupRequest
      * @return UpdateBasicEndpointGroupResponse
     */
    public UpdateBasicEndpointGroupResponse updateBasicEndpointGroup(UpdateBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following limits:
      * *   You can call this operation for only basic GA instances whose bandwidth is billed by Cloud Data Transfer (CDT).
      * *   The **UpdateBasicIpSet** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call the [GetBasicIpSet](~~362987~~) operation to query the status of an acceleration region:
      *     *   If an acceleration region is in the **updating** state, the bandwidth of the acceleration region is being modified. In this state, you can perform only query operations.
      *     *   If an acceleration region is in the **active** state, the bandwidth of the acceleration region is modified.
      * *   You cannot repeatedly call the **UpdateBasicIpSet** operation for the same basic GA instance within the specified period of time.
      *
      * @param request UpdateBasicIpSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateBasicIpSetResponse
     */
    public UpdateBasicIpSetResponse updateBasicIpSetWithOptions(UpdateBasicIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBasicIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBasicIpSetResponse());
    }

    /**
      * Before you call this operation, take note of the following limits:
      * *   You can call this operation for only basic GA instances whose bandwidth is billed by Cloud Data Transfer (CDT).
      * *   The **UpdateBasicIpSet** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call the [GetBasicIpSet](~~362987~~) operation to query the status of an acceleration region:
      *     *   If an acceleration region is in the **updating** state, the bandwidth of the acceleration region is being modified. In this state, you can perform only query operations.
      *     *   If an acceleration region is in the **active** state, the bandwidth of the acceleration region is modified.
      * *   You cannot repeatedly call the **UpdateBasicIpSet** operation for the same basic GA instance within the specified period of time.
      *
      * @param request UpdateBasicIpSetRequest
      * @return UpdateBasicIpSetResponse
     */
    public UpdateBasicIpSetResponse updateBasicIpSet(UpdateBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicIpSetWithOptions(request, runtime);
    }

    public UpdateCrossPrivateStateResponse updateCrossPrivateStateWithOptions(UpdateCrossPrivateStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossPrivateState)) {
            query.put("CrossPrivateState", request.crossPrivateState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCrossPrivateState"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCrossPrivateStateResponse());
    }

    public UpdateCrossPrivateStateResponse updateCrossPrivateState(UpdateCrossPrivateStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCrossPrivateStateWithOptions(request, runtime);
    }

    public UpdateCustomRoutingEndpointGroupAttributeResponse updateCustomRoutingEndpointGroupAttributeWithOptions(UpdateCustomRoutingEndpointGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomRoutingEndpointGroupAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomRoutingEndpointGroupAttributeResponse());
    }

    public UpdateCustomRoutingEndpointGroupAttributeResponse updateCustomRoutingEndpointGroupAttribute(UpdateCustomRoutingEndpointGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointGroupAttributeWithOptions(request, runtime);
    }

    /**
      * *   **UpdateCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of an endpoint group associated with a custom route listener to check whether the mappings of the endpoint group is modified.
      *     *   If the endpoint group is in the **updating** state, the mappings of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, the mappings of the endpoint group are modified.
      * *   The **UpdateCustomRoutingEndpointGroupDestinations** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateCustomRoutingEndpointGroupDestinationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateCustomRoutingEndpointGroupDestinationsResponse
     */
    public UpdateCustomRoutingEndpointGroupDestinationsResponse updateCustomRoutingEndpointGroupDestinationsWithOptions(UpdateCustomRoutingEndpointGroupDestinationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationConfigurations)) {
            query.put("DestinationConfigurations", request.destinationConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomRoutingEndpointGroupDestinations"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomRoutingEndpointGroupDestinationsResponse());
    }

    /**
      * *   **UpdateCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of an endpoint group associated with a custom route listener to check whether the mappings of the endpoint group is modified.
      *     *   If the endpoint group is in the **updating** state, the mappings of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, the mappings of the endpoint group are modified.
      * *   The **UpdateCustomRoutingEndpointGroupDestinations** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateCustomRoutingEndpointGroupDestinationsRequest
      * @return UpdateCustomRoutingEndpointGroupDestinationsResponse
     */
    public UpdateCustomRoutingEndpointGroupDestinationsResponse updateCustomRoutingEndpointGroupDestinations(UpdateCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
      * *   **UpdateCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of an endpoint group associated with a custom routing listener to check whether access policies of traffic are modified for endpoints in the endpoint group.
      *     *   If the endpoint group is in the **updating** state, access policies of traffic are being modified for endpoints in the endpoint group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, access policies of traffic are modified for endpoints in the endpoint group.
      * *   The **UpdateCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateCustomRoutingEndpointTrafficPoliciesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateCustomRoutingEndpointTrafficPoliciesResponse
     */
    public UpdateCustomRoutingEndpointTrafficPoliciesResponse updateCustomRoutingEndpointTrafficPoliciesWithOptions(UpdateCustomRoutingEndpointTrafficPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyConfigurations)) {
            query.put("PolicyConfigurations", request.policyConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomRoutingEndpointTrafficPolicies"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomRoutingEndpointTrafficPoliciesResponse());
    }

    /**
      * *   **UpdateCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of an endpoint group associated with a custom routing listener to check whether access policies of traffic are modified for endpoints in the endpoint group.
      *     *   If the endpoint group is in the **updating** state, access policies of traffic are being modified for endpoints in the endpoint group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, access policies of traffic are modified for endpoints in the endpoint group.
      * *   The **UpdateCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateCustomRoutingEndpointTrafficPoliciesRequest
      * @return UpdateCustomRoutingEndpointTrafficPoliciesResponse
     */
    public UpdateCustomRoutingEndpointTrafficPoliciesResponse updateCustomRoutingEndpointTrafficPolicies(UpdateCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
      * *   **UpdateCustomRoutingEndpoints** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of the endpoint groups associated with a custom routing listener to check whether the endpoints in the endpoint groups are modified.
      *     *   If an endpoint group is in the **updating** state, the endpoints in the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If an endpoint group is in the **active** state, the endpoints in the endpoint group are modified.
      * *   The **UpdateCustomRoutingEndpoints** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateCustomRoutingEndpointsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateCustomRoutingEndpointsResponse
     */
    public UpdateCustomRoutingEndpointsResponse updateCustomRoutingEndpointsWithOptions(UpdateCustomRoutingEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointConfigurations)) {
            query.put("EndpointConfigurations", request.endpointConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomRoutingEndpoints"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomRoutingEndpointsResponse());
    }

    /**
      * *   **UpdateCustomRoutingEndpoints** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of the endpoint groups associated with a custom routing listener to check whether the endpoints in the endpoint groups are modified.
      *     *   If an endpoint group is in the **updating** state, the endpoints in the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If an endpoint group is in the **active** state, the endpoints in the endpoint group are modified.
      * *   The **UpdateCustomRoutingEndpoints** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateCustomRoutingEndpointsRequest
      * @return UpdateCustomRoutingEndpointsResponse
     */
    public UpdateCustomRoutingEndpointsResponse updateCustomRoutingEndpoints(UpdateCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointsWithOptions(request, runtime);
    }

    public UpdateDomainResponse updateDomainWithOptions(UpdateDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDomain)) {
            query.put("TargetDomain", request.targetDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomain"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainResponse());
    }

    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainWithOptions(request, runtime);
    }

    public UpdateDomainStateResponse updateDomainStateWithOptions(UpdateDomainStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainState"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainStateResponse());
    }

    public UpdateDomainStateResponse updateDomainState(UpdateDomainStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainStateWithOptions(request, runtime);
    }

    /**
      * *   **UpdateEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the configurations of the endpoint group are modified.
      * *   The **UpdateEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateEndpointGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateEndpointGroupResponse
     */
    public UpdateEndpointGroupResponse updateEndpointGroupWithOptions(UpdateEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointConfigurations)) {
            query.put("EndpointConfigurations", request.endpointConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupRegion)) {
            query.put("EndpointGroupRegion", request.endpointGroupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointRequestProtocol)) {
            query.put("EndpointRequestProtocol", request.endpointRequestProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckEnabled)) {
            query.put("HealthCheckEnabled", request.healthCheckEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckIntervalSeconds)) {
            query.put("HealthCheckIntervalSeconds", request.healthCheckIntervalSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPath)) {
            query.put("HealthCheckPath", request.healthCheckPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPort)) {
            query.put("HealthCheckPort", request.healthCheckPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckProtocol)) {
            query.put("HealthCheckProtocol", request.healthCheckProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portOverrides)) {
            query.put("PortOverrides", request.portOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdCount)) {
            query.put("ThresholdCount", request.thresholdCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficPercentage)) {
            query.put("TrafficPercentage", request.trafficPercentage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointGroupResponse());
    }

    /**
      * *   **UpdateEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the configurations of the endpoint group are modified.
      * *   The **UpdateEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateEndpointGroupRequest
      * @return UpdateEndpointGroupResponse
     */
    public UpdateEndpointGroupResponse updateEndpointGroup(UpdateEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEndpointGroupWithOptions(request, runtime);
    }

    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttributeWithOptions(UpdateEndpointGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupId)) {
            query.put("EndpointGroupId", request.endpointGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpointGroupAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointGroupAttributeResponse());
    }

    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEndpointGroupAttributeWithOptions(request, runtime);
    }

    /**
      * *   **UpdateEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) or [ListEndpointGroups](~~153261~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, the configuration of the endpoint group is being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active**, the configuration of the endpoint group is modified.
      * *   The **UpdateEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateEndpointGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateEndpointGroupsResponse
     */
    public UpdateEndpointGroupsResponse updateEndpointGroupsWithOptions(UpdateEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupConfigurations)) {
            query.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointGroupsResponse());
    }

    /**
      * *   **UpdateEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) or [ListEndpointGroups](~~153261~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, the configuration of the endpoint group is being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active**, the configuration of the endpoint group is modified.
      * *   The **UpdateEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateEndpointGroupsRequest
      * @return UpdateEndpointGroupsResponse
     */
    public UpdateEndpointGroupsResponse updateEndpointGroups(UpdateEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEndpointGroupsWithOptions(request, runtime);
    }

    /**
      * *   **UpdateForwardingRules** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of a forwarding rule.
      *     *   If the forwarding rule is in the **configuring** state, it indicates that the forwarding rule is being modified. In this case, you can perform only query operations.
      *     *   If the forwarding rule is in the **active** state, it indicates that the forwarding rule is modified.
      * *   The **UpdateForwardingRules** operation cannot be repeatedly called to modify forwarding rules for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateForwardingRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateForwardingRulesResponse
     */
    public UpdateForwardingRulesResponse updateForwardingRulesWithOptions(UpdateForwardingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardingRules)) {
            query.put("ForwardingRules", request.forwardingRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateForwardingRulesResponse());
    }

    /**
      * *   **UpdateForwardingRules** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of a forwarding rule.
      *     *   If the forwarding rule is in the **configuring** state, it indicates that the forwarding rule is being modified. In this case, you can perform only query operations.
      *     *   If the forwarding rule is in the **active** state, it indicates that the forwarding rule is modified.
      * *   The **UpdateForwardingRules** operation cannot be repeatedly called to modify forwarding rules for the same Global Accelerator (GA) instance within a specific period of time.
      *
      * @param request UpdateForwardingRulesRequest
      * @return UpdateForwardingRulesResponse
     */
    public UpdateForwardingRulesResponse updateForwardingRules(UpdateForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateForwardingRulesWithOptions(request, runtime);
    }

    /**
      * *   **UpdateIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **updating** state, the acceleration region is being modified. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is modified.
      * *   The **UpdateIpSet** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateIpSetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateIpSetResponse
     */
    public UpdateIpSetResponse updateIpSetWithOptions(UpdateIpSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSetId)) {
            query.put("IpSetId", request.ipSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpSetResponse());
    }

    /**
      * *   **UpdateIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **updating** state, the acceleration region is being modified. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is modified.
      * *   The **UpdateIpSet** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateIpSetRequest
      * @return UpdateIpSetResponse
     */
    public UpdateIpSetResponse updateIpSet(UpdateIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpSetWithOptions(request, runtime);
    }

    /**
      * *   **UpdateIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **updating** state, the acceleration region is being modified. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is modified.
      * *   The **UpdateIpSet** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateIpSetsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateIpSetsResponse
     */
    public UpdateIpSetsResponse updateIpSetsWithOptions(UpdateIpSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipSets)) {
            query.put("IpSets", request.ipSets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpSetsResponse());
    }

    /**
      * *   **UpdateIpSet** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeIpSet](~~153246~~) operation to query the state of an acceleration region.
      *     *   If the acceleration region is in the **updating** state, the acceleration region is being modified. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is modified.
      * *   The **UpdateIpSet** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
      * @param request UpdateIpSetsRequest
      * @return UpdateIpSetsResponse
     */
    public UpdateIpSetsResponse updateIpSets(UpdateIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpSetsWithOptions(request, runtime);
    }

    /**
      * This operation can be called to modify the configurations such as protocol and ports of a listener to meet your business requirements.
      * When you call this operation, take note of the following items:
      * *   **UpdateListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener.
      *     *   If the listener is in the **updating** state, it indicates that its configurations are being modified. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that its configurations are modified.
      * *   The **UpdateListener** operation cannot be repeatedly called to modify listener configurations for the same GA instance within a specific period of time.
      *
      * @param request UpdateListenerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListenerWithOptions(UpdateListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendPorts)) {
            query.put("BackendPorts", request.backendPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientAffinity)) {
            query.put("ClientAffinity", request.clientAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            query.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocol)) {
            query.put("ProxyProtocol", request.proxyProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "UpdateListener"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerResponse());
    }

    /**
      * This operation can be called to modify the configurations such as protocol and ports of a listener to meet your business requirements.
      * When you call this operation, take note of the following items:
      * *   **UpdateListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener.
      *     *   If the listener is in the **updating** state, it indicates that its configurations are being modified. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that its configurations are modified.
      * *   The **UpdateListener** operation cannot be repeatedly called to modify listener configurations for the same GA instance within a specific period of time.
      *
      * @param request UpdateListenerRequest
      * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListenerWithOptions(request, runtime);
    }
}
