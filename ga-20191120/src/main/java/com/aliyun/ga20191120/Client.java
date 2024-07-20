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
     * <b>description</b> :
     * <p>  <strong>AddEntriesToAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the status of the ACL to which you want to add IP entries.
     *     *   If the ACL is in the <strong>configuring</strong> state, it indicates that IP entries are added to the ACL. In this case, you can perform only query operations.
     *     *   If the ACL is in the <strong>active</strong> state, it indicates that IP entries are added to the ACL.</p>
     * <ul>
     * <li>The <strong>AddEntriesToAcl</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds IP addresses or CIDR blocks to an access control list (ACL). You can add IP addresses or CIDR blocks to an ACL and configure a whitelist or blacklist to allow or deny requests from clients.</p>
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
     * <b>description</b> :
     * <p>  <strong>AddEntriesToAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the status of the ACL to which you want to add IP entries.
     *     *   If the ACL is in the <strong>configuring</strong> state, it indicates that IP entries are added to the ACL. In this case, you can perform only query operations.
     *     *   If the ACL is in the <strong>active</strong> state, it indicates that IP entries are added to the ACL.</p>
     * <ul>
     * <li>The <strong>AddEntriesToAcl</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds IP addresses or CIDR blocks to an access control list (ACL). You can add IP addresses or CIDR blocks to an ACL and configure a whitelist or blacklist to allow or deny requests from clients.</p>
     * 
     * @param request AddEntriesToAclRequest
     * @return AddEntriesToAclResponse
     */
    public AddEntriesToAclResponse addEntriesToAcl(AddEntriesToAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEntriesToAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>AssociateAclsWithListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of the listener with which you attempt to associate an ACL.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the ACL is being associated. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the ACL is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateAclsWithListener</strong> operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates access control lists (ACLs) with a listener.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>AssociateAclsWithListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of the listener with which you attempt to associate an ACL.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the ACL is being associated. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the ACL is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateAclsWithListener</strong> operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates access control lists (ACLs) with a listener.</p>
     * 
     * @param request AssociateAclsWithListenerRequest
     * @return AssociateAclsWithListenerResponse
     */
    public AssociateAclsWithListenerResponse associateAclsWithListener(AssociateAclsWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateAclsWithListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only HTTPS listeners can be associated with additional certificates.</p>
     * <ul>
     * <li><strong>AssociateAdditionalCertificatesWithListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the listener with which you want to associate an additional certificate.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the additional certificate is being associated. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the additional certificate is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateAdditionalCertificatesWithListener</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates additional certificates with an HTTPS listener. You can associate multiple certificates with an HTTPS listener and configure virtual endpoint groups and forwarding rules to accelerate access to multiple HTTPS-capable domain names.</p>
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
     * <b>description</b> :
     * <p>  Only HTTPS listeners can be associated with additional certificates.</p>
     * <ul>
     * <li><strong>AssociateAdditionalCertificatesWithListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the listener with which you want to associate an additional certificate.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the additional certificate is being associated. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the additional certificate is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateAdditionalCertificatesWithListener</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates additional certificates with an HTTPS listener. You can associate multiple certificates with an HTTPS listener and configure virtual endpoint groups and forwarding rules to accelerate access to multiple HTTPS-capable domain names.</p>
     * 
     * @param request AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateAdditionalCertificatesWithListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>AttachDdosToAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, the Anti-DDoS Pro or Anti-DDoS Premium instance is being associated with the GA instance. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, the Anti-DDoS Pro or Anti-DDoS Premium instance is associated with the GA instance.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AttachDdosToAccelerator</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates an Anti-DDoS Pro or Anti-DDoS Premium instance with a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>AttachDdosToAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, the Anti-DDoS Pro or Anti-DDoS Premium instance is being associated with the GA instance. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, the Anti-DDoS Pro or Anti-DDoS Premium instance is associated with the GA instance.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AttachDdosToAccelerator</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates an Anti-DDoS Pro or Anti-DDoS Premium instance with a Global Accelerator (GA) instance.</p>
     * 
     * @param request AttachDdosToAcceleratorRequest
     * @return AttachDdosToAcceleratorResponse
     */
    public AttachDdosToAcceleratorResponse attachDdosToAccelerator(AttachDdosToAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDdosToAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>AttachLogStoreToEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that a Logstore is being associated with the group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that a Logstore is associated with the group.</p>
     * <ul>
     * <li>The <strong>AttachLogStoreToEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a Log Service Logstore with an endpoint group.</p>
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
     * <b>description</b> :
     * <p>  <strong>AttachLogStoreToEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that a Logstore is being associated with the group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that a Logstore is associated with the group.</p>
     * <ul>
     * <li>The <strong>AttachLogStoreToEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a Log Service Logstore with an endpoint group.</p>
     * 
     * @param request AttachLogStoreToEndpointGroupRequest
     * @return AttachLogStoreToEndpointGroupResponse
     */
    public AttachLogStoreToEndpointGroupResponse attachLogStoreToEndpointGroup(AttachLogStoreToEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLogStoreToEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>BandwidthPackageAddAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan that you want to associate.
     *     *   If the bandwidth plan is in the <strong>binding</strong> state, it indicates that the bandwidth plan is being associated. In this case, you can perform only query operations.
     *     *   If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is associated.</p>
     * <ul>
     * <li>The <strong>BandwidthPackageAddAccelerator</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth plan with a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>BandwidthPackageAddAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan that you want to associate.
     *     *   If the bandwidth plan is in the <strong>binding</strong> state, it indicates that the bandwidth plan is being associated. In this case, you can perform only query operations.
     *     *   If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is associated.</p>
     * <ul>
     * <li>The <strong>BandwidthPackageAddAccelerator</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth plan with a Global Accelerator (GA) instance.</p>
     * 
     * @param request BandwidthPackageAddAcceleratorRequest
     * @return BandwidthPackageAddAcceleratorResponse
     */
    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bandwidthPackageAddAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>BandwidthPackageRemoveAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan that you attempt to disassociate.
     *     *   If the bandwidth plan is in the <strong>unbinding</strong> state, it indicates that the bandwidth plan is being disassociated. In this case, you can perform only query operations.
     *     *   If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is disassociated.</p>
     * <ul>
     * <li>The <strong>BandwidthPackageRemoveAccelerator</strong> cannot be called repeatedly for the same GA instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a bandwidth plan from a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>BandwidthPackageRemoveAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan that you attempt to disassociate.
     *     *   If the bandwidth plan is in the <strong>unbinding</strong> state, it indicates that the bandwidth plan is being disassociated. In this case, you can perform only query operations.
     *     *   If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is disassociated.</p>
     * <ul>
     * <li>The <strong>BandwidthPackageRemoveAccelerator</strong> cannot be called repeatedly for the same GA instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a bandwidth plan from a Global Accelerator (GA) instance.</p>
     * 
     * @param request BandwidthPackageRemoveAcceleratorRequest
     * @return BandwidthPackageRemoveAcceleratorResponse
     */
    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bandwidthPackageRemoveAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <strong>ChangeResourceGroup</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the resource group to which a Global Accelerator (GA) resource belongs.</p>
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
     * <b>description</b> :
     * <p>The <strong>ChangeResourceGroup</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the resource group to which a Global Accelerator (GA) resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>ConfigEndpointProbe</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the endpoint group to which an endpoint belongs and determine whether latency monitoring is configured for the endpoint.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that latency monitoring is being configured for the endpoint. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that latency monitoring is configured for the endpoint.</p>
     * <ul>
     * <li>The <strong>ConfigEndpointProbe</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures latency monitoring for an endpoint.</p>
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
     * <b>description</b> :
     * <p>  <strong>ConfigEndpointProbe</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the endpoint group to which an endpoint belongs and determine whether latency monitoring is configured for the endpoint.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that latency monitoring is being configured for the endpoint. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that latency monitoring is configured for the endpoint.</p>
     * <ul>
     * <li>The <strong>ConfigEndpointProbe</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures latency monitoring for an endpoint.</p>
     * 
     * @param request ConfigEndpointProbeRequest
     * @return ConfigEndpointProbeResponse
     */
    public ConfigEndpointProbeResponse configEndpointProbe(ConfigEndpointProbeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configEndpointProbeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p><strong>CreateAccelerator</strong> is an asynchronous operation. After you send a request, the system returns the ID of a GA instance, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the state of a GA instance.</p>
     * <ul>
     * <li>If the GA instance is in the <strong>init</strong> state, it indicates that the GA instance is being created. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the GA instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Global Accelerator (GA) instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p><strong>CreateAccelerator</strong> is an asynchronous operation. After you send a request, the system returns the ID of a GA instance, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the state of a GA instance.</p>
     * <ul>
     * <li>If the GA instance is in the <strong>init</strong> state, it indicates that the GA instance is being created. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the GA instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateAcceleratorRequest
     * @return CreateAcceleratorResponse
     */
    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateAcl</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the state of an ACL.</p>
     * <ul>
     * <li>If the ACL is in the <strong>init</strong> state, the ACL is being created. In this case, you can only perform only query operations.</li>
     * <li>If the ACL is in the <strong>active</strong> state, the ACL is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <b>description</b> :
     * <p><em>CreateAcl</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the state of an ACL.</p>
     * <ul>
     * <li>If the ACL is in the <strong>init</strong> state, the ACL is being created. In this case, you can only perform only query operations.</li>
     * <li>If the ACL is in the <strong>active</strong> state, the ACL is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL).</p>
     * 
     * @param request CreateAclRequest
     * @return CreateAclResponse
     */
    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <strong>CreateApplicationMonitor</strong> operation to create an origin probing task. An origin probing task monitors the network quality between a client and an origin server and checks the availability of the origin server.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can create origin detection tasks only for subscription Standard Global Accelerator (GA) instances whose specification is Medium Ⅰ.</li>
     * <li>You cannot create an origin probe task for a UDP listener.</li>
     * <li>The service port of the URL or IP address that is probed must be within the listening port range.</li>
     * <li><strong>CreateApplicationMonitor</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/408463.html">DescribeApplicationMonitor</a> or <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to query the status of the origin probing task.<ul>
     * <li>If the origin probing task is in the <strong>init</strong> state, it indicates that the task is being created. You can perform only query operations.</li>
     * <li>If the origin probing task is in the <strong>active</strong> state, it indicates that the task is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateApplicationMonitor</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an origin probing task.</p>
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
     * <b>description</b> :
     * <p>You can call the <strong>CreateApplicationMonitor</strong> operation to create an origin probing task. An origin probing task monitors the network quality between a client and an origin server and checks the availability of the origin server.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can create origin detection tasks only for subscription Standard Global Accelerator (GA) instances whose specification is Medium Ⅰ.</li>
     * <li>You cannot create an origin probe task for a UDP listener.</li>
     * <li>The service port of the URL or IP address that is probed must be within the listening port range.</li>
     * <li><strong>CreateApplicationMonitor</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/408463.html">DescribeApplicationMonitor</a> or <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to query the status of the origin probing task.<ul>
     * <li>If the origin probing task is in the <strong>init</strong> state, it indicates that the task is being created. You can perform only query operations.</li>
     * <li>If the origin probing task is in the <strong>active</strong> state, it indicates that the task is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateApplicationMonitor</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an origin probing task.</p>
     * 
     * @param request CreateApplicationMonitorRequest
     * @return CreateApplicationMonitorResponse
     */
    public CreateApplicationMonitorResponse createApplicationMonitor(CreateApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To use Global Accelerator (GA) for acceleration, you must purchase a basic bandwidth plan. A basic bandwidth plan supports the following bandwidth types:</p>
     * <ul>
     * <li><strong>Basic</strong>: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service is deployed on Alibaba Cloud.</li>
     * <li><strong>Enhanced</strong>: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud.</li>
     * <li><strong>Premium</strong>: Both the default acceleration region and the default service region are outside the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud. If you want to accelerate data transfer for clients in the Chinese mainland, you must select China (Hong Kong) as the acceleration region.
     * When you call this operation, take note of the following items:</li>
     * <li><strong>CreateBandwidthPackage</strong> is an asynchronous operation. After you send a request, the system returns the ID of a bandwidth plan, but the bandwidth plan is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan.<ul>
     * <li>If the bandwidth plan is in the <strong>init</strong> state, it indicates that the bandwidth plan is being created. In this case, you can perform only query operations.</li>
     * <li>If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateBandwidthPackage</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a bandwidth plan.</p>
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
     * <b>description</b> :
     * <p>To use Global Accelerator (GA) for acceleration, you must purchase a basic bandwidth plan. A basic bandwidth plan supports the following bandwidth types:</p>
     * <ul>
     * <li><strong>Basic</strong>: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service is deployed on Alibaba Cloud.</li>
     * <li><strong>Enhanced</strong>: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud.</li>
     * <li><strong>Premium</strong>: Both the default acceleration region and the default service region are outside the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud. If you want to accelerate data transfer for clients in the Chinese mainland, you must select China (Hong Kong) as the acceleration region.
     * When you call this operation, take note of the following items:</li>
     * <li><strong>CreateBandwidthPackage</strong> is an asynchronous operation. After you send a request, the system returns the ID of a bandwidth plan, but the bandwidth plan is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan.<ul>
     * <li>If the bandwidth plan is in the <strong>init</strong> state, it indicates that the bandwidth plan is being created. In this case, you can perform only query operations.</li>
     * <li>If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateBandwidthPackage</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a bandwidth plan.</p>
     * 
     * @param request CreateBandwidthPackageRequest
     * @return CreateBandwidthPackageResponse
     */
    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicAccelerateIp</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> operation to query the status of an accelerated IP address:
     *     *   If no status information is returned, the accelerated IP address is being created. In this case, you can perform only query operations.
     *     *   If the accelerated IP address is in the <strong>active</strong> state, the accelerated IP address is created.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIp</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an accelerated IP address for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateBasicAccelerateIp</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> operation to query the status of an accelerated IP address:
     *     *   If no status information is returned, the accelerated IP address is being created. In this case, you can perform only query operations.
     *     *   If the accelerated IP address is in the <strong>active</strong> state, the accelerated IP address is created.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIp</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an accelerated IP address for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicAccelerateIpRequest
     * @return CreateBasicAccelerateIpResponse
     */
    public CreateBasicAccelerateIpResponse createBasicAccelerateIp(CreateBasicAccelerateIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAccelerateIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicAccelerateIpEndpointRelation</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> or <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an accelerated IP address or an endpoint to determine the association status between the accelerated IP address and endpoint.
     *     *   If the status of the accelerated IP address and endpoint is <strong>binding</strong>, the accelerated IP address is being associated with the endpoint. In this case, you can query the accelerated IP address and endpoint but cannot perform other operations.
     *     *   If the status of the accelerated IP address and endpoint is <strong>bound</strong> and the status returned by the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> API operation is <strong>active</strong>, the accelerated IP address is associated with the endpoint.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIpEndpointRelation</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a mapping between an accelerated IP address and an endpoint for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateBasicAccelerateIpEndpointRelation</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> or <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an accelerated IP address or an endpoint to determine the association status between the accelerated IP address and endpoint.
     *     *   If the status of the accelerated IP address and endpoint is <strong>binding</strong>, the accelerated IP address is being associated with the endpoint. In this case, you can query the accelerated IP address and endpoint but cannot perform other operations.
     *     *   If the status of the accelerated IP address and endpoint is <strong>bound</strong> and the status returned by the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> API operation is <strong>active</strong>, the accelerated IP address is associated with the endpoint.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIpEndpointRelation</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a mapping between an accelerated IP address and an endpoint for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicAccelerateIpEndpointRelationRequest
     * @return CreateBasicAccelerateIpEndpointRelationResponse
     */
    public CreateBasicAccelerateIpEndpointRelationResponse createBasicAccelerateIpEndpointRelation(CreateBasicAccelerateIpEndpointRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAccelerateIpEndpointRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>CreateBasicAccelerateIpEndpointRelations</strong> is asynchronous. After you send a request, the system returns a request ID and runs the task in the system background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> or <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an accelerated IP address or an endpoint to determine the association status.
     *     *   If an accelerated IP address and the endpoint are in the <strong>binding</strong> state, the accelerated IP address is being associated with the endpoint. In this case, you can only query the accelerated IP address and endpoint, but cannot perform other operations.
     *     *   If all the accelerated IP addresses and the endpoint are in the <strong>bound</strong> state, and the association status returned by the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> API operation is <strong>active</strong>, the accelerated IP addresses are associated with the endpoints.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIpEndpointRelations</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates mappings between accelerated IP addresses and endpoints for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  The <strong>CreateBasicAccelerateIpEndpointRelations</strong> is asynchronous. After you send a request, the system returns a request ID and runs the task in the system background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> or <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an accelerated IP address or an endpoint to determine the association status.
     *     *   If an accelerated IP address and the endpoint are in the <strong>binding</strong> state, the accelerated IP address is being associated with the endpoint. In this case, you can only query the accelerated IP address and endpoint, but cannot perform other operations.
     *     *   If all the accelerated IP addresses and the endpoint are in the <strong>bound</strong> state, and the association status returned by the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> API operation is <strong>active</strong>, the accelerated IP addresses are associated with the endpoints.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIpEndpointRelations</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates mappings between accelerated IP addresses and endpoints for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicAccelerateIpEndpointRelationsRequest
     * @return CreateBasicAccelerateIpEndpointRelationsResponse
     */
    public CreateBasicAccelerateIpEndpointRelationsResponse createBasicAccelerateIpEndpointRelations(CreateBasicAccelerateIpEndpointRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAccelerateIpEndpointRelationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateBasicAccelerator</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> or <a href="https://help.aliyun.com/document_detail/353189.html">ListBasicAccelerators</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If the basic GA instance is in the <strong>init</strong> state, it indicates that the basic GA instance is being created. In this case, you can perform only query operations.</li>
     * <li>If the basic GA instance is in the <strong>active</strong> state, it indicates that the basic GA instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Basic Global Accelerator (GA) instances leverage the immense bandwidth of the high-quality global network of Alibaba Cloud to provide end-to-end acceleration services. You can use basic GA instances to accelerate content delivery at Layer 3 (IP). You can call the CreateBasicAccelerator operation to create a basic GA instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <b>description</b> :
     * <p><em>CreateBasicAccelerator</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> or <a href="https://help.aliyun.com/document_detail/353189.html">ListBasicAccelerators</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If the basic GA instance is in the <strong>init</strong> state, it indicates that the basic GA instance is being created. In this case, you can perform only query operations.</li>
     * <li>If the basic GA instance is in the <strong>active</strong> state, it indicates that the basic GA instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Basic Global Accelerator (GA) instances leverage the immense bandwidth of the high-quality global network of Alibaba Cloud to provide end-to-end acceleration services. You can use basic GA instances to accelerate content delivery at Layer 3 (IP). You can call the CreateBasicAccelerator operation to create a basic GA instance.</p>
     * 
     * @param request CreateBasicAcceleratorRequest
     * @return CreateBasicAcceleratorResponse
     */
    public CreateBasicAcceleratorResponse createBasicAccelerator(CreateBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an endpoint.
     *     *   If the endpoint is in the <strong>init</strong> state, the endpoint is being created. In this case, you can perform only query operations.
     *     *   If the endpoint is in the <strong>active</strong> state, the endpoint is created.</p>
     * <ul>
     * <li>The <strong>CreateBasicEndpoint</strong> API operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an endpoint.
     *     *   If the endpoint is in the <strong>init</strong> state, the endpoint is being created. In this case, you can perform only query operations.
     *     *   If the endpoint is in the <strong>active</strong> state, the endpoint is created.</p>
     * <ul>
     * <li>The <strong>CreateBasicEndpoint</strong> API operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicEndpointRequest
     * @return CreateBasicEndpointResponse
     */
    public CreateBasicEndpointResponse createBasicEndpoint(CreateBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns an endpoint group ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362984.html">GetBasicEndpointGroup</a> operation to query the status of the task.
     *     *   If the endpoint group is in the <strong>init</strong> state, the endpoint is being created. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, the endpoint group is created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateBasicEndpointGroup</strong> operation again on the same GA instance before the previous request is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint group for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns an endpoint group ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362984.html">GetBasicEndpointGroup</a> operation to query the status of the task.
     *     *   If the endpoint group is in the <strong>init</strong> state, the endpoint is being created. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, the endpoint group is created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateBasicEndpointGroup</strong> operation again on the same GA instance before the previous request is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint group for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicEndpointGroupRequest
     * @return CreateBasicEndpointGroupResponse
     */
    public CreateBasicEndpointGroupResponse createBasicEndpointGroup(CreateBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpoints</strong> is an asynchronous operation. After you call this operation, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operation to query the status of endpoints. - If one or more endpoints are in the <strong>init</strong> state, it indicates that the endpoints are being created. In this case, you can continue to perform query operations on the endpoints. If all endpoints are in the <strong>active</strong> state, it indicates that the endpoints are created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateBasicEndpoints</strong> operation again on the same GA instance before the previous operation is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple endpoints for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpoints</strong> is an asynchronous operation. After you call this operation, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operation to query the status of endpoints. - If one or more endpoints are in the <strong>init</strong> state, it indicates that the endpoints are being created. In this case, you can continue to perform query operations on the endpoints. If all endpoints are in the <strong>active</strong> state, it indicates that the endpoints are created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateBasicEndpoints</strong> operation again on the same GA instance before the previous operation is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple endpoints for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicEndpointsRequest
     * @return CreateBasicEndpointsResponse
     */
    public CreateBasicEndpointsResponse createBasicEndpoints(CreateBasicEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Take note of the following limits:</p>
     * <ul>
     * <li>You can specify only one acceleration region for each basic GA instance, and only IPv4 clients can connect to basic GA instances.</li>
     * <li><strong>CreateBasicIpSet</strong> is an asynchronous operation. After you send a request, the system returns an acceleration region ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>init</strong> state, the acceleration region is being created. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region is in the <strong>active</strong> state, the acceleration region is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateBasicIpSet</strong> operation again on the same GA instance before the previous task is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an acceleration region for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>Take note of the following limits:</p>
     * <ul>
     * <li>You can specify only one acceleration region for each basic GA instance, and only IPv4 clients can connect to basic GA instances.</li>
     * <li><strong>CreateBasicIpSet</strong> is an asynchronous operation. After you send a request, the system returns an acceleration region ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>init</strong> state, the acceleration region is being created. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region is in the <strong>active</strong> state, the acceleration region is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateBasicIpSet</strong> operation again on the same GA instance before the previous task is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an acceleration region for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request CreateBasicIpSetRequest
     * @return CreateBasicIpSetResponse
     */
    public CreateBasicIpSetResponse createBasicIpSet(CreateBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBasicIpSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>readAndWrite</p>
     * 
     * <b>summary</b> : 
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the GA instance generates a port mapping table based on the listener port range, mapping information (protocols and port ranges) of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to the specified IP addresses and ports in the vSwitches.
     * You can call this operation to create mappings for an endpoint group of a custom routing listener. Take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that the mappings are being created for the endpoint group. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the mappings are created for the endpoint group.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateCustomRoutingEndpointGroupDestinations</strong> operation again on the same GA instance before the previous task is completed.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>Make sure that the following prerequisites are met before you call this operation:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>A bandwidth plan is associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application is deployed as an endpoint to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired and a custom routing listener is created for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex">submit a ticket</a>. For information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>An endpoint group is created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>readAndWrite</p>
     * 
     * <b>summary</b> : 
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the GA instance generates a port mapping table based on the listener port range, mapping information (protocols and port ranges) of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to the specified IP addresses and ports in the vSwitches.
     * You can call this operation to create mappings for an endpoint group of a custom routing listener. Take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that the mappings are being created for the endpoint group. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the mappings are created for the endpoint group.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateCustomRoutingEndpointGroupDestinations</strong> operation again on the same GA instance before the previous task is completed.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>Make sure that the following prerequisites are met before you call this operation:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>A bandwidth plan is associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application is deployed as an endpoint to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired and a custom routing listener is created for the GA instance. The custom routing listener feature is in invitational preview. To use the feature, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex">submit a ticket</a>. For information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>An endpoint group is created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * </ul>
     * 
     * @param request CreateCustomRoutingEndpointGroupDestinationsRequest
     * @return CreateCustomRoutingEndpointGroupDestinationsResponse
     */
    public CreateCustomRoutingEndpointGroupDestinationsResponse createCustomRoutingEndpointGroupDestinations(CreateCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Global Accelerator (GA) forwards client requests to endpoints in an endpoint group based on the routing type of the listener that is associated with the endpoint group.</p>
     * <ul>
     * <li>After you configure an intelligent routing listener for a GA instance, the GA instance selects a nearby and healthy endpoint group and forwards client requests to a healthy endpoint in the endpoint group.</li>
     * <li>After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
     * You can call this operation to create endpoint groups for custom routing listeners. For information about how to create endpoint groups for intelligent routing listeners, see <a href="https://help.aliyun.com/document_detail/153259.html">CreateEndpointGroup</a>.
     * When you call this operation, take note of the following items:</li>
     * <li><strong>CreateCustomRoutingEndpointGroups</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/449374.html">ListCustomRoutingEndpointGroups</a> operation to query the status of the endpoint groups that are associated with custom routing listeners.<ul>
     * <li>If one or more endpoint groups are in the <strong>init</strong> state, it indicates that the endpoint groups are being created. In this case, you can perform only query operations.</li>
     * <li>If all endpoint groups are in the <strong>active</strong> state, it indicates that the endpoint groups are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateCustomRoutingEndpointGroups</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>Make sure that the following requirements are met before you call this operation:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>A bandwidth plan is associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired and a custom routing listener is created for the GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates endpoint groups for a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>Global Accelerator (GA) forwards client requests to endpoints in an endpoint group based on the routing type of the listener that is associated with the endpoint group.</p>
     * <ul>
     * <li>After you configure an intelligent routing listener for a GA instance, the GA instance selects a nearby and healthy endpoint group and forwards client requests to a healthy endpoint in the endpoint group.</li>
     * <li>After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
     * You can call this operation to create endpoint groups for custom routing listeners. For information about how to create endpoint groups for intelligent routing listeners, see <a href="https://help.aliyun.com/document_detail/153259.html">CreateEndpointGroup</a>.
     * When you call this operation, take note of the following items:</li>
     * <li><strong>CreateCustomRoutingEndpointGroups</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/449374.html">ListCustomRoutingEndpointGroups</a> operation to query the status of the endpoint groups that are associated with custom routing listeners.<ul>
     * <li>If one or more endpoint groups are in the <strong>init</strong> state, it indicates that the endpoint groups are being created. In this case, you can perform only query operations.</li>
     * <li>If all endpoint groups are in the <strong>active</strong> state, it indicates that the endpoint groups are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateCustomRoutingEndpointGroups</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>Make sure that the following requirements are met before you call this operation:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>A bandwidth plan is associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired and a custom routing listener is created for the GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates endpoint groups for a custom routing listener.</p>
     * 
     * @param request CreateCustomRoutingEndpointGroupsRequest
     * @return CreateCustomRoutingEndpointGroupsResponse
     */
    public CreateCustomRoutingEndpointGroupsResponse createCustomRoutingEndpointGroups(CreateCustomRoutingEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation takes effect only when the traffic access policy of an endpoint allows traffic to specified destinations. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic access policy of an endpoint. This operation takes effect only if the value of <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>, which allows traffic to specific destinations.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, the traffic destinations are being created. In this state, you can only query the traffic destinations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, the traffic destinations are created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateCustomRoutingEndpointTrafficPolicies</strong> operation repeatedly for the same GA instance in a specific period of time.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>If the bandwidth metering method of the standard GA instance is <strong>pay-by-bandwidth</strong>, a bandwidth plan must be associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application that serves as the endpoint of the standard GA instance is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired, and a custom routing listener is created. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>Endpoint groups are created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * <li>Endpoints are created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449382.html">CreateCustomRoutingEndpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates traffic destinations for an endpoint that is associated with a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>This operation takes effect only when the traffic access policy of an endpoint allows traffic to specified destinations. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic access policy of an endpoint. This operation takes effect only if the value of <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>, which allows traffic to specific destinations.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, the traffic destinations are being created. In this state, you can only query the traffic destinations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, the traffic destinations are created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateCustomRoutingEndpointTrafficPolicies</strong> operation repeatedly for the same GA instance in a specific period of time.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>If the bandwidth metering method of the standard GA instance is <strong>pay-by-bandwidth</strong>, a bandwidth plan must be associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application that serves as the endpoint of the standard GA instance is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired, and a custom routing listener is created. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>Endpoint groups are created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * <li>Endpoints are created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449382.html">CreateCustomRoutingEndpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates traffic destinations for an endpoint that is associated with a custom routing listener.</p>
     * 
     * @param request CreateCustomRoutingEndpointTrafficPoliciesRequest
     * @return CreateCustomRoutingEndpointTrafficPoliciesResponse
     */
    public CreateCustomRoutingEndpointTrafficPoliciesResponse createCustomRoutingEndpointTrafficPolicies(CreateCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, the protocols and port ranges of the associated endpoint groups, and the IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
     * This operation is used to create endpoints for custom routing listeners. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpoints</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group and determine whether endpoints are created in the endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that endpoints are being created. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that endpoints are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateCustomRoutingEndpoints</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>The following operations are complete before you call this operation:</p>
     * <ul>
     * <li>Create a standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>Associate a bandwidth plan with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>Apply for permissions to use custom routing listeners and create a custom routing listener for the standard GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>Create an endpoint group for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates endpoints for a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, the protocols and port ranges of the associated endpoint groups, and the IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
     * This operation is used to create endpoints for custom routing listeners. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpoints</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group and determine whether endpoints are created in the endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that endpoints are being created. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that endpoints are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateCustomRoutingEndpoints</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>The following operations are complete before you call this operation:</p>
     * <ul>
     * <li>Create a standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>Associate a bandwidth plan with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>Apply for permissions to use custom routing listeners and create a custom routing listener for the standard GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>Create an endpoint group for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates endpoints for a custom routing listener.</p>
     * 
     * @param request CreateCustomRoutingEndpointsRequest
     * @return CreateCustomRoutingEndpointsResponse
     */
    public CreateCustomRoutingEndpointsResponse createCustomRoutingEndpoints(CreateCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you associate an accelerated domain name that has obtained an ICP number with a Global Accelerator (GA) instance, you do not need to complete filing for the accelerated domain name or its subdomains on Alibaba Cloud.
     * You can call this operation to add an accelerated domain name and associate the accelerated domain name with GA instances. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If your accelerated domain name is hosted in the Chinese mainland, you must obtain an ICP number for the domain name.</li>
     * <li>The same accelerated domain name cannot be repeatedly associated with the same GA instance.</li>
     * <li>You cannot repeatedly call the <strong>CreateDomain</strong> operation by using the same Alibaba Cloud account within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain name and associates it with Global Accelerator (GA) instances.</p>
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
     * <b>description</b> :
     * <p>After you associate an accelerated domain name that has obtained an ICP number with a Global Accelerator (GA) instance, you do not need to complete filing for the accelerated domain name or its subdomains on Alibaba Cloud.
     * You can call this operation to add an accelerated domain name and associate the accelerated domain name with GA instances. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If your accelerated domain name is hosted in the Chinese mainland, you must obtain an ICP number for the domain name.</li>
     * <li>The same accelerated domain name cannot be repeatedly associated with the same GA instance.</li>
     * <li>You cannot repeatedly call the <strong>CreateDomain</strong> operation by using the same Alibaba Cloud account within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain name and associates it with Global Accelerator (GA) instances.</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation to create a virtual endpoint group for a Layer 4 listener, make sure that a default endpoint group is created.</p>
     * <ul>
     * <li><strong>CreateEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns the ID of an endpoint group, but the endpoint group is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of the endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>init</strong> state, it indicates that the endpoint group is being created. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the endpoint group is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.endpointProtocolVersion)) {
            query.put("EndpointProtocolVersion", request.endpointProtocolVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <b>description</b> :
     * <p>  When you call this operation to create a virtual endpoint group for a Layer 4 listener, make sure that a default endpoint group is created.</p>
     * <ul>
     * <li><strong>CreateEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns the ID of an endpoint group, but the endpoint group is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of the endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>init</strong> state, it indicates that the endpoint group is being created. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the endpoint group is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint group.</p>
     * 
     * @param request CreateEndpointGroupRequest
     * @return CreateEndpointGroupResponse
     */
    public CreateEndpointGroupResponse createEndpointGroup(CreateEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/153261.html">ListEndpointGroups</a> operation to query the status of the task:
     *     *   If the endpoint groups are in the <strong>init</strong> state, the endpoint groups are being created. In this case, you can perform only query operations.
     *     *   If all endpoint groups are in the <strong>active</strong> state, the endpoint groups are created.</p>
     * <ul>
     * <li>The <strong>CreateEndpointGroups</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates endpoint groups.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupConfigurations)) {
            bodyFlat.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>description</b> :
     * <p>  <strong>CreateEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/153261.html">ListEndpointGroups</a> operation to query the status of the task:
     *     *   If the endpoint groups are in the <strong>init</strong> state, the endpoint groups are being created. In this case, you can perform only query operations.
     *     *   If all endpoint groups are in the <strong>active</strong> state, the endpoint groups are created.</p>
     * <ul>
     * <li>The <strong>CreateEndpointGroups</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates endpoint groups.</p>
     * 
     * @param request CreateEndpointGroupsRequest
     * @return CreateEndpointGroupsResponse
     */
    public CreateEndpointGroupsResponse createEndpointGroups(CreateEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>HTTP and HTTPS listeners of Global Accelerator (GA) support domain name-based and path-based forwarding rules. After an HTTP or HTTPS listener receives a request, the system matches the request against the forwarding conditions in a forwarding rule and then performs the corresponding forwarding action. For example, if you set <strong>Host</strong> to <code>www.example.com</code> as the forwarding condition and <strong>Forward</strong> to <code>epg-bp1enpdcrqhl78g6r****</code> as the forwarding action in a forwarding rule, requests to the <code>www.example.com</code> domain name match this forwarding rule and are forwarded to the <code>epg-bp1enpdcrqhl78g6r****</code> endpoint group. Before you call this API operation to create a forwarding rule, we recommend that you understand forwarding rules. For more information, see <a href="https://help.aliyun.com/document_detail/204224.html">Forwarding rules</a>.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateForwardingRules</strong> is an asynchronous operation. After you send a request, the system returns the ID of a forwarding rule, but the forwarding rule is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the state of the forwarding rule.<ul>
     * <li>If the forwarding rule is in the <strong>configuring</strong> state, it indicates that the rule is being created. In this case, you can only perform query operations.</li>
     * <li>If the forwarding rule is in the <strong>active</strong> state, it indicates that the rule is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateForwardingRules</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates forwarding rules.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardingRules)) {
            bodyFlat.put("ForwardingRules", request.forwardingRules);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>description</b> :
     * <p>HTTP and HTTPS listeners of Global Accelerator (GA) support domain name-based and path-based forwarding rules. After an HTTP or HTTPS listener receives a request, the system matches the request against the forwarding conditions in a forwarding rule and then performs the corresponding forwarding action. For example, if you set <strong>Host</strong> to <code>www.example.com</code> as the forwarding condition and <strong>Forward</strong> to <code>epg-bp1enpdcrqhl78g6r****</code> as the forwarding action in a forwarding rule, requests to the <code>www.example.com</code> domain name match this forwarding rule and are forwarded to the <code>epg-bp1enpdcrqhl78g6r****</code> endpoint group. Before you call this API operation to create a forwarding rule, we recommend that you understand forwarding rules. For more information, see <a href="https://help.aliyun.com/document_detail/204224.html">Forwarding rules</a>.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateForwardingRules</strong> is an asynchronous operation. After you send a request, the system returns the ID of a forwarding rule, but the forwarding rule is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the state of the forwarding rule.<ul>
     * <li>If the forwarding rule is in the <strong>configuring</strong> state, it indicates that the rule is being created. In this case, you can only perform query operations.</li>
     * <li>If the forwarding rule is in the <strong>active</strong> state, it indicates that the rule is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateForwardingRules</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates forwarding rules.</p>
     * 
     * @param request CreateForwardingRulesRequest
     * @return CreateForwardingRulesResponse
     */
    public CreateForwardingRulesResponse createForwardingRules(CreateForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardingRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateIpSets</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If acceleration regions are in the <strong>init</strong> state, it indicates that the acceleration regions are being created. In this case, you can perform only query operations.
     *     *   If acceleration regions are in the <strong>active</strong> state, it indicates that the acceleration regions are created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateIpSets</strong> operation again on the same GA instance before the previous operation is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates acceleration regions.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateIpSets</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If acceleration regions are in the <strong>init</strong> state, it indicates that the acceleration regions are being created. In this case, you can perform only query operations.
     *     *   If acceleration regions are in the <strong>active</strong> state, it indicates that the acceleration regions are created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateIpSets</strong> operation again on the same GA instance before the previous operation is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates acceleration regions.</p>
     * 
     * @param request CreateIpSetsRequest
     * @return CreateIpSetsResponse
     */
    public CreateIpSetsResponse createIpSets(CreateIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpSetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the task.<ul>
     * <li>If the listener is in the <strong>init</strong> state, the listener is being created. In this state, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, the listener is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateListener</strong> operation for the same GA instance within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A listener checks connection requests and distributes the requests to endpoints based on forwarding rules that are defined by the scheduling algorithm. You can call the CreateListener operation to create a listener for a GA instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.httpVersion)) {
            query.put("HttpVersion", request.httpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the task.<ul>
     * <li>If the listener is in the <strong>init</strong> state, the listener is being created. In this state, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, the listener is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateListener</strong> operation for the same GA instance within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A listener checks connection requests and distributes the requests to endpoints based on forwarding rules that are defined by the scheduling algorithm. You can call the CreateListener operation to create a listener for a GA instance.</p>
     * 
     * @param request CreateListenerRequest
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>CreateSpareIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, it indicates that secondary IP addresses are being created for the CNAME that is assigned to the GA instance. In this case, you can only perform query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, it indicates that secondary IP addresses are created for the CNAME that is assigned to the GA instance.</p>
     * <ul>
     * <li>The <strong>CreateSpareIps</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates secondary IP addresses for a CNAME that is assigned to a Global Accelerator (GA) instance. If an acceleration area of the GA instance becomes unavailable, access traffic is redirected to the secondary IP addresses.</p>
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
     * <b>description</b> :
     * <p>  <strong>CreateSpareIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, it indicates that secondary IP addresses are being created for the CNAME that is assigned to the GA instance. In this case, you can only perform query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, it indicates that secondary IP addresses are created for the CNAME that is assigned to the GA instance.</p>
     * <ul>
     * <li>The <strong>CreateSpareIps</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates secondary IP addresses for a CNAME that is assigned to a Global Accelerator (GA) instance. If an acceleration area of the GA instance becomes unavailable, access traffic is redirected to the secondary IP addresses.</p>
     * 
     * @param request CreateSpareIpsRequest
     * @return CreateSpareIpsResponse
     */
    public CreateSpareIpsResponse createSpareIps(CreateSpareIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSpareIpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete subscription GA instances.</p>
     * <ul>
     * <li><strong>DeleteAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the GA instance is in the <strong>deleting</strong> state, the GA instance is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the GA instance cannot be queried, the GA instance is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  You cannot delete subscription GA instances.</p>
     * <ul>
     * <li><strong>DeleteAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the GA instance is in the <strong>deleting</strong> state, the GA instance is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the GA instance cannot be queried, the GA instance is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteAcceleratorRequest
     * @return DeleteAcceleratorResponse
     */
    public DeleteAcceleratorResponse deleteAccelerator(DeleteAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteAcl</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> operation to query the status of an ACL.</p>
     * <ul>
     * <li>If the ACL is in the <strong>deleting</strong> state, it indicates that the ACL is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the ACL cannot be queried, it indicates that the ACL is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a access control list (ACL) of a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p><em>DeleteAcl</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> operation to query the status of an ACL.</p>
     * <ul>
     * <li>If the ACL is in the <strong>deleting</strong> state, it indicates that the ACL is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the ACL cannot be queried, it indicates that the ACL is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a access control list (ACL) of a Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteAclRequest
     * @return DeleteAclResponse
     */
    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteApplicationMonitor</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to query the state of an origin probing task.
     *     *   If the origin probing task is in the <strong>deleting</strong> state, it indicates that the task is being deleted. In this case, you can perform only query operations.
     *     *   If the origin probing task cannot be queried, it indicates that the task is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteApplicationMonitor</strong> operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an origin probing task.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteApplicationMonitor</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to query the state of an origin probing task.
     *     *   If the origin probing task is in the <strong>deleting</strong> state, it indicates that the task is being deleted. In this case, you can perform only query operations.
     *     *   If the origin probing task cannot be queried, it indicates that the task is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteApplicationMonitor</strong> operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an origin probing task.</p>
     * 
     * @param request DeleteApplicationMonitorRequest
     * @return DeleteApplicationMonitorResponse
     */
    public DeleteApplicationMonitorResponse deleteApplicationMonitor(DeleteApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  By default, subscription bandwidth plans cannot be deleted. If you want to unsubscribe from subscription bandwidth plans, go to the <a href="https://usercenter2-intl.aliyun.com/refund/refund">Unsubscribe</a> page. Before you can unsubscribe from a subscription bandwidth plan that is associated with a Global Accelerator (GA) instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</p>
     * <ul>
     * <li>Bandwidth plans that are associated with GA instances cannot be deleted. Before you can delete a bandwidth plan that is associated with a GA instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</li>
     * <li><strong>DeleteBandwidthPackage</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the task.<ul>
     * <li>If the bandwidth plan is in the <strong>deleting</strong> state, the bandwidth plan is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the bandwidth plan cannot be found, the bandwidth plan is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteBandwidthPackage</strong> operation cannot be repeatedly called for the same bandwidth plan within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bandwidth plan.</p>
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
     * <b>description</b> :
     * <p>  By default, subscription bandwidth plans cannot be deleted. If you want to unsubscribe from subscription bandwidth plans, go to the <a href="https://usercenter2-intl.aliyun.com/refund/refund">Unsubscribe</a> page. Before you can unsubscribe from a subscription bandwidth plan that is associated with a Global Accelerator (GA) instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</p>
     * <ul>
     * <li>Bandwidth plans that are associated with GA instances cannot be deleted. Before you can delete a bandwidth plan that is associated with a GA instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</li>
     * <li><strong>DeleteBandwidthPackage</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the task.<ul>
     * <li>If the bandwidth plan is in the <strong>deleting</strong> state, the bandwidth plan is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the bandwidth plan cannot be found, the bandwidth plan is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteBandwidthPackage</strong> operation cannot be repeatedly called for the same bandwidth plan within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bandwidth plan.</p>
     * 
     * @param request DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteBasicAccelerateIp</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> operation to query the status of an accelerated IP address.
     *     *   If an accelerated IP address is in the <strong>deleting</strong> state, the accelerated IP address is being deleted. In this case, you can perform only query operations.
     *     *   If the system fails to return information about an accelerated IP address, the accelerated IP address is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteBasicAccelerateIp</strong> operation for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an accelerated IP address of a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteBasicAccelerateIp</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> operation to query the status of an accelerated IP address.
     *     *   If an accelerated IP address is in the <strong>deleting</strong> state, the accelerated IP address is being deleted. In this case, you can perform only query operations.
     *     *   If the system fails to return information about an accelerated IP address, the accelerated IP address is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteBasicAccelerateIp</strong> operation for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an accelerated IP address of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteBasicAccelerateIpRequest
     * @return DeleteBasicAccelerateIpResponse
     */
    public DeleteBasicAccelerateIpResponse deleteBasicAccelerateIp(DeleteBasicAccelerateIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicAccelerateIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteBasicAccelerateIpEndpointRelation</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the following operations to check whether an accelerated IP address is disassociated from an endpoint:
     *     *   You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> and <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operations to query the status of an accelerated IP address and an endpoint. If the accelerated IP address and the endpoint are in the <strong>unbinding</strong> state, the accelerated IP address is being disassociated from the endpoint. In this case, you can query the IP address and endpoint but cannot perform other operations.
     *     *   If the association status between the accelerated IP address and the endpoint cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> operation, the accelerated IP address is disassociated from the endpoint.</p>
     * <ul>
     * <li>The <strong>DeleteBasicAccelerateIpEndpointRelation</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a mapping between an accelerated IP address and an endpoint for a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteBasicAccelerateIpEndpointRelation</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the following operations to check whether an accelerated IP address is disassociated from an endpoint:
     *     *   You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> and <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operations to query the status of an accelerated IP address and an endpoint. If the accelerated IP address and the endpoint are in the <strong>unbinding</strong> state, the accelerated IP address is being disassociated from the endpoint. In this case, you can query the IP address and endpoint but cannot perform other operations.
     *     *   If the association status between the accelerated IP address and the endpoint cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> operation, the accelerated IP address is disassociated from the endpoint.</p>
     * <ul>
     * <li>The <strong>DeleteBasicAccelerateIpEndpointRelation</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a mapping between an accelerated IP address and an endpoint for a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteBasicAccelerateIpEndpointRelationRequest
     * @return DeleteBasicAccelerateIpEndpointRelationResponse
     */
    public DeleteBasicAccelerateIpEndpointRelationResponse deleteBasicAccelerateIpEndpointRelation(DeleteBasicAccelerateIpEndpointRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicAccelerateIpEndpointRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete subscription basic GA instances. You can unsubscribe from a basic GA instance on the <a href="https://usercenter2-intl.aliyun.com/refund/refund">Unsubscribe</a> page. Before you unsubscribe from a basic GA instance, make sure that the acceleration areas and endpoint groups of the GA instance are deleted and no bandwidth plans are associated with the GA instance.
     *     *   For information about how to delete an acceleration area, see <a href="https://help.aliyun.com/document_detail/2253388.html">DeleteBasicIpSet</a>.
     *     *   For information about how to delete an endpoint group, see <a href="https://help.aliyun.com/document_detail/2253399.html">DeleteBasicEndpointGroup</a>.
     *     *   For information about how to disassociate a bandwidth plan from a basic GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</p>
     * <ul>
     * <li>Before you call this operation to delete a pay-as-you-go basic GA instance, make sure that all data is migrated and the acceleration areas and endpoint groups of the instance are deleted.<ul>
     * <li>For information about how to delete an acceleration area, see <a href="https://help.aliyun.com/document_detail/2253388.html">DeleteBasicIpSet</a>.</li>
     * <li>For information about how to delete an endpoint group, see <a href="https://help.aliyun.com/document_detail/2253399.html">DeleteBasicEndpointGroup</a>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteBasicAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the basic GA instance is in the <strong>deleting</strong> state, it indicates that the instance is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the information about the basic GA instance is not displayed in the response, it indicates that the instance is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  You cannot delete subscription basic GA instances. You can unsubscribe from a basic GA instance on the <a href="https://usercenter2-intl.aliyun.com/refund/refund">Unsubscribe</a> page. Before you unsubscribe from a basic GA instance, make sure that the acceleration areas and endpoint groups of the GA instance are deleted and no bandwidth plans are associated with the GA instance.
     *     *   For information about how to delete an acceleration area, see <a href="https://help.aliyun.com/document_detail/2253388.html">DeleteBasicIpSet</a>.
     *     *   For information about how to delete an endpoint group, see <a href="https://help.aliyun.com/document_detail/2253399.html">DeleteBasicEndpointGroup</a>.
     *     *   For information about how to disassociate a bandwidth plan from a basic GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</p>
     * <ul>
     * <li>Before you call this operation to delete a pay-as-you-go basic GA instance, make sure that all data is migrated and the acceleration areas and endpoint groups of the instance are deleted.<ul>
     * <li>For information about how to delete an acceleration area, see <a href="https://help.aliyun.com/document_detail/2253388.html">DeleteBasicIpSet</a>.</li>
     * <li>For information about how to delete an endpoint group, see <a href="https://help.aliyun.com/document_detail/2253399.html">DeleteBasicEndpointGroup</a>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteBasicAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the basic GA instance is in the <strong>deleting</strong> state, it indicates that the instance is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the information about the basic GA instance is not displayed in the response, it indicates that the instance is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteBasicAcceleratorRequest
     * @return DeleteBasicAcceleratorResponse
     */
    public DeleteBasicAcceleratorResponse deleteBasicAccelerator(DeleteBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteBasicEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operation to query the status of endpoints.
     *     *   If the endpoint is in the <strong>deleting</strong> state, it indicates that the endpoint is being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint cannot be found, it indicates that the endpoint is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteBasicEndpoint</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint that is associated with a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteBasicEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operation to query the status of endpoints.
     *     *   If the endpoint is in the <strong>deleting</strong> state, it indicates that the endpoint is being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint cannot be found, it indicates that the endpoint is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteBasicEndpoint</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteBasicEndpointRequest
     * @return DeleteBasicEndpointResponse
     */
    public DeleteBasicEndpointResponse deleteBasicEndpoint(DeleteBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an endpoint group, take note of the following items:</p>
     * <ul>
     * <li>If an endpoint in the endpoint group is associated with an accelerated IP address, you cannot delete the endpoint group. You can call the <a href="https://help.aliyun.com/document_detail/2253413.html">DeleteBasicAccelerateIpEndpointRelation</a> operation to disassociate the endpoint from the accelerated IP address.</li>
     * <li>If no endpoint in the endpoint group is associated with an accelerated IP address, you can delete the endpoint group. When you delete an endpoint group, all endpoints in the endpoint group are deleted.</li>
     * <li><strong>DeleteBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362984.html">GetBasicEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>deleting</strong> state, the endpoint group is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group cannot be queried, the endpoint group is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteBasicEndpointGroup</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint group that is associated with a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>Before you delete an endpoint group, take note of the following items:</p>
     * <ul>
     * <li>If an endpoint in the endpoint group is associated with an accelerated IP address, you cannot delete the endpoint group. You can call the <a href="https://help.aliyun.com/document_detail/2253413.html">DeleteBasicAccelerateIpEndpointRelation</a> operation to disassociate the endpoint from the accelerated IP address.</li>
     * <li>If no endpoint in the endpoint group is associated with an accelerated IP address, you can delete the endpoint group. When you delete an endpoint group, all endpoints in the endpoint group are deleted.</li>
     * <li><strong>DeleteBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362984.html">GetBasicEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>deleting</strong> state, the endpoint group is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group cannot be queried, the endpoint group is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteBasicEndpointGroup</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint group that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteBasicEndpointGroupRequest
     * @return DeleteBasicEndpointGroupResponse
     */
    public DeleteBasicEndpointGroupResponse deleteBasicEndpointGroup(DeleteBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If an accelerated IP address is associated with an endpoint, you cannot delete the acceleration region. You can call the <a href="https://help.aliyun.com/document_detail/2253413.html">DeleteBasicAccelerateIpEndpointRelation</a> operation to disassociate the accelerated IP address from the endpoint.</p>
     * <ul>
     * <li>\<em>\<em>DeleteBasicIpSet\</em>\</em> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>deleting</strong> state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.</li>
     * </ul>
     * </li>
     * <li>The \<em>\<em>DeleteBasicIpSet\</em>\</em> operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the acceleration region of a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  If an accelerated IP address is associated with an endpoint, you cannot delete the acceleration region. You can call the <a href="https://help.aliyun.com/document_detail/2253413.html">DeleteBasicAccelerateIpEndpointRelation</a> operation to disassociate the accelerated IP address from the endpoint.</p>
     * <ul>
     * <li>\<em>\<em>DeleteBasicIpSet\</em>\</em> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>deleting</strong> state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.</li>
     * </ul>
     * </li>
     * <li>The \<em>\<em>DeleteBasicIpSet\</em>\</em> operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the acceleration region of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request DeleteBasicIpSetRequest
     * @return DeleteBasicIpSetResponse
     */
    public DeleteBasicIpSetResponse deleteBasicIpSet(DeleteBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBasicIpSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> to query the status of the task.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that mappings are being deleted from the endpoint group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state and no information about the mappings that you want to delete is found in the response when you call the <a href="https://help.aliyun.com/document_detail/449378.html">DescribeCustomRoutingEndpointGroupDestinations</a> operation, it indicates the mappings are deleted from the endpoint group.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteCustomRoutingEndpointGroupDestinations</strong> operation again on the same Global Accelerator (GA) instance before the previous request is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes mappings from an endpoint group that is associated with a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> to query the status of the task.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that mappings are being deleted from the endpoint group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state and no information about the mappings that you want to delete is found in the response when you call the <a href="https://help.aliyun.com/document_detail/449378.html">DescribeCustomRoutingEndpointGroupDestinations</a> operation, it indicates the mappings are deleted from the endpoint group.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteCustomRoutingEndpointGroupDestinations</strong> operation again on the same Global Accelerator (GA) instance before the previous request is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes mappings from an endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request DeleteCustomRoutingEndpointGroupDestinationsRequest
     * @return DeleteCustomRoutingEndpointGroupDestinationsResponse
     */
    public DeleteCustomRoutingEndpointGroupDestinationsResponse deleteCustomRoutingEndpointGroupDestinations(DeleteCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointGroups</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the state of the endpoint groups associated with a custom routing listener that you attempt to delete.
     *     *   If the endpoint groups are in the <strong>deleting</strong> state, the endpoint groups are being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint groups cannot be queried, the endpoint groups are deleted.</p>
     * <ul>
     * <li>You cannot use the <strong>DeleteCustomRoutingEndpointGroups</strong> operation on the same Global Accelerator (GA) instance before the previous operation is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple endpoint groups that are associated with a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointGroups</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the state of the endpoint groups associated with a custom routing listener that you attempt to delete.
     *     *   If the endpoint groups are in the <strong>deleting</strong> state, the endpoint groups are being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint groups cannot be queried, the endpoint groups are deleted.</p>
     * <ul>
     * <li>You cannot use the <strong>DeleteCustomRoutingEndpointGroups</strong> operation on the same Global Accelerator (GA) instance before the previous operation is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple endpoint groups that are associated with a custom routing listener.</p>
     * 
     * @param request DeleteCustomRoutingEndpointGroupsRequest
     * @return DeleteCustomRoutingEndpointGroupsResponse
     */
    public DeleteCustomRoutingEndpointGroupsResponse deleteCustomRoutingEndpointGroups(DeleteCustomRoutingEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group to check whether the traffic destinations are deleted.
     *     *   If the endpoint group is in the <strong>updating</strong> state, the traffic destinations are being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state and the traffic destinations that you want to delete cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/449392.html">DescribeCustomRoutingEndPointTrafficPolicy</a> operation, the traffic destinations are deleted.</p>
     * <ul>
     * <li>The <strong>DeleteCustomRoutingEndpointTrafficPolicies</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes traffic destinations from an endpoint.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group to check whether the traffic destinations are deleted.
     *     *   If the endpoint group is in the <strong>updating</strong> state, the traffic destinations are being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state and the traffic destinations that you want to delete cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/449392.html">DescribeCustomRoutingEndPointTrafficPolicy</a> operation, the traffic destinations are deleted.</p>
     * <ul>
     * <li>The <strong>DeleteCustomRoutingEndpointTrafficPolicies</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes traffic destinations from an endpoint.</p>
     * 
     * @param request DeleteCustomRoutingEndpointTrafficPoliciesRequest
     * @return DeleteCustomRoutingEndpointTrafficPoliciesResponse
     */
    public DeleteCustomRoutingEndpointTrafficPoliciesResponse deleteCustomRoutingEndpointTrafficPolicies(DeleteCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpoints</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> to query the status of the task.
     *     *   If an endpoint group is in the <strong>updating</strong> state, the endpoint is being deleted. In this case, you can perform only query operations.
     *     *   If an endpoint group is in the <strong>active</strong> state and the endpoint cannot be found after you call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation, the endpoint is deleted.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteCustomRoutingEndpoints</strong> operation again on the same Global Accelerator (GA) instance before the previous task is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes endpoints from a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpoints</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> to query the status of the task.
     *     *   If an endpoint group is in the <strong>updating</strong> state, the endpoint is being deleted. In this case, you can perform only query operations.
     *     *   If an endpoint group is in the <strong>active</strong> state and the endpoint cannot be found after you call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation, the endpoint is deleted.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteCustomRoutingEndpoints</strong> operation again on the same Global Accelerator (GA) instance before the previous task is completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes endpoints from a custom routing listener.</p>
     * 
     * @param request DeleteCustomRoutingEndpointsRequest
     * @return DeleteCustomRoutingEndpointsResponse
     */
    public DeleteCustomRoutingEndpointsResponse deleteCustomRoutingEndpoints(DeleteCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot call the <strong>DeleteDomainAcceleratorRelation</strong> operation again by using the same Alibaba Cloud account before the previous operation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a domain name from Global Accelerator (GA) instances.</p>
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
     * <b>description</b> :
     * <p>You cannot call the <strong>DeleteDomainAcceleratorRelation</strong> operation again by using the same Alibaba Cloud account before the previous operation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a domain name from Global Accelerator (GA) instances.</p>
     * 
     * @param request DeleteDomainAcceleratorRelationRequest
     * @return DeleteDomainAcceleratorRelationResponse
     */
    public DeleteDomainAcceleratorRelationResponse deleteDomainAcceleratorRelation(DeleteDomainAcceleratorRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainAcceleratorRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the endpoint group.
     *     *   If the endpoint group is in the <strong>deleting</strong> state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteEndpointGroup</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint group.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the endpoint group.
     *     *   If the endpoint group is in the <strong>deleting</strong> state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteEndpointGroup</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint group.</p>
     * 
     * @param request DeleteEndpointGroupRequest
     * @return DeleteEndpointGroupResponse
     */
    public DeleteEndpointGroupResponse deleteEndpointGroup(DeleteEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the task.
     *     *   If an endpoint group is in the <strong>deleting</strong> state, the endpoint group is being deleted. In this case, you can perform only query operations.
     *     *   If an endpoint group cannot be queried, the endpoint group is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteEndpointGroups</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes endpoint groups.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the task.
     *     *   If an endpoint group is in the <strong>deleting</strong> state, the endpoint group is being deleted. In this case, you can perform only query operations.
     *     *   If an endpoint group cannot be queried, the endpoint group is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteEndpointGroups</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes endpoint groups.</p>
     * 
     * @param request DeleteEndpointGroupsRequest
     * @return DeleteEndpointGroupsResponse
     */
    public DeleteEndpointGroupsResponse deleteEndpointGroups(DeleteEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteForwardingRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of the task.
     *     *   If a forwarding rule is in the <strong>deleting</strong> state, the forwarding rule is being deleted. In this case, you can perform only query operations.
     *     *   If a forwarding rule cannot be queried, the forwarding rule is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteForwardingRules</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes forwarding rules.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteForwardingRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of the task.
     *     *   If a forwarding rule is in the <strong>deleting</strong> state, the forwarding rule is being deleted. In this case, you can perform only query operations.
     *     *   If a forwarding rule cannot be queried, the forwarding rule is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteForwardingRules</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes forwarding rules.</p>
     * 
     * @param request DeleteForwardingRulesRequest
     * @return DeleteForwardingRulesResponse
     */
    public DeleteForwardingRulesResponse deleteForwardingRules(DeleteForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardingRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteIpSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of an acceleration region.
     *     *   If the acceleration region is in the <strong>deleting</strong> state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
     *     *   If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteIpSet</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an acceleration region.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteIpSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of an acceleration region.
     *     *   If the acceleration region is in the <strong>deleting</strong> state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
     *     *   If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteIpSet</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an acceleration region.</p>
     * 
     * @param request DeleteIpSetRequest
     * @return DeleteIpSetResponse
     */
    public DeleteIpSetResponse deleteIpSet(DeleteIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteIpSets</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If the acceleration region is in the <strong>deleting</strong> state, the acceleration region is being deleted. In this case, you can perform only query operations.
     *     *   If you cannot query the acceleration region, the acceleration region is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteIpSets</strong> operation for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes acceleration regions.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteIpSets</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If the acceleration region is in the <strong>deleting</strong> state, the acceleration region is being deleted. In this case, you can perform only query operations.
     *     *   If you cannot query the acceleration region, the acceleration region is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteIpSets</strong> operation for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes acceleration regions.</p>
     * 
     * @param request DeleteIpSetsRequest
     * @return DeleteIpSetsResponse
     */
    public DeleteIpSetsResponse deleteIpSets(DeleteIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpSetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call the <strong>DeleteListener</strong> operation, make sure that no endpoint groups are associated with the listener that you want to delete. For information about how to delete an endpoint group, see the following topics:
     *     *   <a href="https://help.aliyun.com/document_detail/2253305.html">DeleteEndpointGroup</a>: deletes an endpoint group that is associated with an intelligent routing listener.
     *     *   <a href="https://help.aliyun.com/document_detail/2253311.html">DeleteEndpointGroups</a>: deletes multiple endpoint groups that are associated with intelligent routing listeners at the same time.
     *     *   <a href="https://help.aliyun.com/document_detail/2303183.html">DeleteCustomRoutingEndpointGroups</a>: deletes multiple endpoint groups that are associated with custom routing listeners at the same time.</p>
     * <ul>
     * <li><strong>DeleteListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the listener.<ul>
     * <li>If the listener is in the <strong>deleting</strong> state, the listener is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the listener cannot be queried, the listener is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteListener</strong> operation to delete the listeners of the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a listener.</p>
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
     * <b>description</b> :
     * <p>  Before you call the <strong>DeleteListener</strong> operation, make sure that no endpoint groups are associated with the listener that you want to delete. For information about how to delete an endpoint group, see the following topics:
     *     *   <a href="https://help.aliyun.com/document_detail/2253305.html">DeleteEndpointGroup</a>: deletes an endpoint group that is associated with an intelligent routing listener.
     *     *   <a href="https://help.aliyun.com/document_detail/2253311.html">DeleteEndpointGroups</a>: deletes multiple endpoint groups that are associated with intelligent routing listeners at the same time.
     *     *   <a href="https://help.aliyun.com/document_detail/2303183.html">DeleteCustomRoutingEndpointGroups</a>: deletes multiple endpoint groups that are associated with custom routing listeners at the same time.</p>
     * <ul>
     * <li><strong>DeleteListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the listener.<ul>
     * <li>If the listener is in the <strong>deleting</strong> state, the listener is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the listener cannot be queried, the listener is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteListener</strong> operation to delete the listeners of the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a listener.</p>
     * 
     * @param request DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteSpareIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, it indicates that the secondary IP addresses for the CNAME are being deleted. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state and the secondary IP addresses for the CNAME cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/262121.html">ListSpareIps</a> operation, it indicates that the IP addresses are deleted.</p>
     * <ul>
     * <li>The <strong>DeleteSpareIps</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the secondary IP addresses that are associated with a CNAME.</p>
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
     * <b>description</b> :
     * <p>  <strong>DeleteSpareIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, it indicates that the secondary IP addresses for the CNAME are being deleted. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state and the secondary IP addresses for the CNAME cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/262121.html">ListSpareIps</a> operation, it indicates that the IP addresses are deleted.</p>
     * <ul>
     * <li>The <strong>DeleteSpareIps</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the secondary IP addresses that are associated with a CNAME.</p>
     * 
     * @param request DeleteSpareIpsRequest
     * @return DeleteSpareIpsResponse
     */
    public DeleteSpareIpsResponse deleteSpareIps(DeleteSpareIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSpareIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeAcceleratorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAcceleratorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about a Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeAcceleratorRequest
     * @return DescribeAcceleratorResponse
     */
    public DescribeAcceleratorResponse describeAccelerator(DescribeAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal status of a Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeAcceleratorAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAcceleratorAutoRenewAttributeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal status of a Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeAcceleratorAutoRenewAttributeRequest
     * @return DescribeAcceleratorAutoRenewAttributeResponse
     */
    public DescribeAcceleratorAutoRenewAttributeResponse describeAcceleratorAutoRenewAttribute(DescribeAcceleratorAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAcceleratorAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a pay-as-you-go Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeAcceleratorServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAcceleratorServiceStatusResponse
     */
    public DescribeAcceleratorServiceStatusResponse describeAcceleratorServiceStatusWithOptions(DescribeAcceleratorServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAcceleratorServiceStatus"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAcceleratorServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a pay-as-you-go Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeAcceleratorServiceStatusRequest
     * @return DescribeAcceleratorServiceStatusResponse
     */
    public DescribeAcceleratorServiceStatusResponse describeAcceleratorServiceStatus(DescribeAcceleratorServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAcceleratorServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about an origin probing task.</p>
     * 
     * @param request DescribeApplicationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationMonitorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about an origin probing task.</p>
     * 
     * @param request DescribeApplicationMonitorRequest
     * @return DescribeApplicationMonitorResponse
     */
    public DescribeApplicationMonitorResponse describeApplicationMonitor(DescribeApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a bandwidth plan.</p>
     * 
     * @param request DescribeBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBandwidthPackageResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about a bandwidth plan.</p>
     * 
     * @param request DescribeBandwidthPackageRequest
     * @return DescribeBandwidthPackageResponse
     */
    public DescribeBandwidthPackageResponse describeBandwidthPackage(DescribeBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal status of a bandwidth plan.</p>
     * 
     * @param request DescribeBandwidthPackageAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBandwidthPackageAutoRenewAttributeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal status of a bandwidth plan.</p>
     * 
     * @param request DescribeBandwidthPackageAutoRenewAttributeRequest
     * @return DescribeBandwidthPackageAutoRenewAttributeResponse
     */
    public DescribeBandwidthPackageAutoRenewAttributeResponse describeBandwidthPackageAutoRenewAttribute(DescribeBandwidthPackageAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthPackageAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about commodities.</p>
     * 
     * @param request DescribeCommodityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommodityResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about commodities.</p>
     * 
     * @param request DescribeCommodityRequest
     * @return DescribeCommodityResponse
     */
    public DescribeCommodityResponse describeCommodity(DescribeCommodityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommodityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2253233.html">DescribeCommodity</a> operation to query information about the commodity modules.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the prices of commodities.</p>
     * 
     * @param request DescribeCommodityPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommodityPriceResponse
     */
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

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2253233.html">DescribeCommodity</a> operation to query information about the commodity modules.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the prices of commodities.</p>
     * 
     * @param request DescribeCommodityPriceRequest
     * @return DescribeCommodityPriceResponse
     */
    public DescribeCommodityPriceResponse describeCommodityPrice(DescribeCommodityPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommodityPriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a traffic destination of an endpoint.</p>
     * 
     * @param request DescribeCustomRoutingEndPointTrafficPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomRoutingEndPointTrafficPolicyResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a traffic destination of an endpoint.</p>
     * 
     * @param request DescribeCustomRoutingEndPointTrafficPolicyRequest
     * @return DescribeCustomRoutingEndPointTrafficPolicyResponse
     */
    public DescribeCustomRoutingEndPointTrafficPolicyResponse describeCustomRoutingEndPointTrafficPolicy(DescribeCustomRoutingEndPointTrafficPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndPointTrafficPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a specified endpoint that is associated with a custom routing listener.</p>
     * 
     * @param request DescribeCustomRoutingEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomRoutingEndpointResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a specified endpoint that is associated with a custom routing listener.</p>
     * 
     * @param request DescribeCustomRoutingEndpointRequest
     * @return DescribeCustomRoutingEndpointResponse
     */
    public DescribeCustomRoutingEndpointResponse describeCustomRoutingEndpoint(DescribeCustomRoutingEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a specific endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request DescribeCustomRoutingEndpointGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomRoutingEndpointGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a specific endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request DescribeCustomRoutingEndpointGroupRequest
     * @return DescribeCustomRoutingEndpointGroupResponse
     */
    public DescribeCustomRoutingEndpointGroupResponse describeCustomRoutingEndpointGroup(DescribeCustomRoutingEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mapping configuration of a specified endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request DescribeCustomRoutingEndpointGroupDestinationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomRoutingEndpointGroupDestinationsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the mapping configuration of a specified endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request DescribeCustomRoutingEndpointGroupDestinationsRequest
     * @return DescribeCustomRoutingEndpointGroupDestinationsResponse
     */
    public DescribeCustomRoutingEndpointGroupDestinationsResponse describeCustomRoutingEndpointGroupDestinations(DescribeCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an endpoint group.</p>
     * 
     * @param request DescribeEndpointGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEndpointGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an endpoint group.</p>
     * 
     * @param request DescribeEndpointGroupRequest
     * @return DescribeEndpointGroupResponse
     */
    public DescribeEndpointGroupResponse describeEndpointGroup(DescribeEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an acceleration region.</p>
     * 
     * @param request DescribeIpSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpSetResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about an acceleration region.</p>
     * 
     * @param request DescribeIpSetRequest
     * @return DescribeIpSetResponse
     */
    public DescribeIpSetResponse describeIpSet(DescribeIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to query configuration information about a listener of a GA instance. The information includes the routing type of the listener, the status of the listener, the timestamp that indicates when the listener was created, and the listener ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries configuration information about a listener of a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>This operation is used to query configuration information about a listener of a GA instance. The information includes the routing type of the listener, the status of the listener, the timestamp that indicates when the listener was created, and the listener ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries configuration information about a listener of a Global Accelerator (GA) instance.</p>
     * 
     * @param request DescribeListenerRequest
     * @return DescribeListenerResponse
     */
    public DescribeListenerResponse describeListener(DescribeListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListenerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Simple Log Service project and Logstore associated with an endpoint group.</p>
     * 
     * @param request DescribeLogStoreOfEndpointGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogStoreOfEndpointGroupResponse
     */
    public DescribeLogStoreOfEndpointGroupResponse describeLogStoreOfEndpointGroupWithOptions(DescribeLogStoreOfEndpointGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogStoreOfEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogStoreOfEndpointGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Simple Log Service project and Logstore associated with an endpoint group.</p>
     * 
     * @param request DescribeLogStoreOfEndpointGroupRequest
     * @return DescribeLogStoreOfEndpointGroupResponse
     */
    public DescribeLogStoreOfEndpointGroupResponse describeLogStoreOfEndpointGroup(DescribeLogStoreOfEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogStoreOfEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions where Global Accelerator (GA) instances are deployed.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the regions where Global Accelerator (GA) instances are deployed.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>DetachDdosFromAccelerator</strong> operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, the Anti-DDoS Pro/Premium instance is being disassociated from the GA instance. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, the Anti-DDoS Pro/Premium instance is disassociated from the GA instance.</p>
     * <ul>
     * <li><strong>DetachDdosFromAccelerator</strong> cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Global Accelerator (GA) instance from an Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
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
     * <b>description</b> :
     * <p>  The <strong>DetachDdosFromAccelerator</strong> operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, the Anti-DDoS Pro/Premium instance is being disassociated from the GA instance. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, the Anti-DDoS Pro/Premium instance is disassociated from the GA instance.</p>
     * <ul>
     * <li><strong>DetachDdosFromAccelerator</strong> cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Global Accelerator (GA) instance from an Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * 
     * @param request DetachDdosFromAcceleratorRequest
     * @return DetachDdosFromAcceleratorResponse
     */
    public DetachDdosFromAcceleratorResponse detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDdosFromAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DetachLogStoreFromEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, the Log Service Logstore is being disassociated from the endpoint group. In this case, you can perform only query operations.<!----></li>
     * <li>If the endpoint group is in the <strong>active</strong> state, the Log Service Logstore is disassociated from the endpoint group.</li>
     * </ul>
     * </li>
     * <li>The <strong>DetachLogStoreFromEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Log Service Logstore from an endpoint group.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DetachLogStoreFromEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, the Log Service Logstore is being disassociated from the endpoint group. In this case, you can perform only query operations.<!----></li>
     * <li>If the endpoint group is in the <strong>active</strong> state, the Log Service Logstore is disassociated from the endpoint group.</li>
     * </ul>
     * </li>
     * <li>The <strong>DetachLogStoreFromEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Log Service Logstore from an endpoint group.</p>
     * 
     * @param request DetachLogStoreFromEndpointGroupRequest
     * @return DetachLogStoreFromEndpointGroupResponse
     */
    public DetachLogStoreFromEndpointGroupResponse detachLogStoreFromEndpointGroup(DetachLogStoreFromEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLogStoreFromEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the diagnostic feature for an origin probing task.</p>
     * 
     * @param request DetectApplicationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectApplicationMonitorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables the diagnostic feature for an origin probing task.</p>
     * 
     * @param request DetectApplicationMonitorRequest
     * @return DetectApplicationMonitorResponse
     */
    public DetectApplicationMonitorResponse detectApplicationMonitor(DetectApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an origin probing task.</p>
     * 
     * @param request DisableApplicationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationMonitorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Disables an origin probing task.</p>
     * 
     * @param request DisableApplicationMonitorRequest
     * @return DisableApplicationMonitorResponse
     */
    public DisableApplicationMonitorResponse disableApplicationMonitor(DisableApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DissociateAclsFromListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of a listener:<ul>
     * <li>If the listener is in the <strong>updating</strong> state, ACLs are being disassociated from the listener. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, ACLs are disassociated from the listener.</li>
     * </ul>
     * </li>
     * <li>The <strong>DissociateAclsFromListener</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates access control lists (ACLs) from a listener.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DissociateAclsFromListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of a listener:<ul>
     * <li>If the listener is in the <strong>updating</strong> state, ACLs are being disassociated from the listener. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, ACLs are disassociated from the listener.</li>
     * </ul>
     * </li>
     * <li>The <strong>DissociateAclsFromListener</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates access control lists (ACLs) from a listener.</p>
     * 
     * @param request DissociateAclsFromListenerRequest
     * @return DissociateAclsFromListenerResponse
     */
    public DissociateAclsFromListenerResponse dissociateAclsFromListener(DissociateAclsFromListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateAclsFromListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DissociateAdditionalCertificatesFromListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of an HTTPS listener.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the additional certificate is being dissociated from the listener. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the additional certificate is dissociated from the listener.</li>
     * </ul>
     * </li>
     * <li>The <strong>DissociateAdditionalCertificatesFromListener</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance with a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates an additional certificate from an HTTPS listener.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DissociateAdditionalCertificatesFromListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of an HTTPS listener.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the additional certificate is being dissociated from the listener. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the additional certificate is dissociated from the listener.</li>
     * </ul>
     * </li>
     * <li>The <strong>DissociateAdditionalCertificatesFromListener</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance with a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates an additional certificate from an HTTPS listener.</p>
     * 
     * @param request DissociateAdditionalCertificatesFromListenerRequest
     * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateAdditionalCertificatesFromListenerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an origin probing task.</p>
     * 
     * @param request EnableApplicationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationMonitorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Enables an origin probing task.</p>
     * 
     * @param request EnableApplicationMonitorRequest
     * @return EnableApplicationMonitorResponse
     */
    public EnableApplicationMonitorResponse enableApplicationMonitor(EnableApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an access control list (ACL).</p>
     * 
     * @param request GetAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAclResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries an access control list (ACL).</p>
     * 
     * @param request GetAclRequest
     * @return GetAclResponse
     */
    public GetAclResponse getAcl(GetAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an accelerated IP address of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicAccelerateIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicAccelerateIpResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an accelerated IP address of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicAccelerateIpRequest
     * @return GetBasicAccelerateIpResponse
     */
    public GetBasicAccelerateIpResponse getBasicAccelerateIp(GetBasicAccelerateIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAccelerateIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the accelerated IP address of a basic Global Accelerator (GA) instance is associated with an endpoint.</p>
     * 
     * @param request GetBasicAccelerateIpEndpointRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicAccelerateIpEndpointRelationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries whether the accelerated IP address of a basic Global Accelerator (GA) instance is associated with an endpoint.</p>
     * 
     * @param request GetBasicAccelerateIpEndpointRelationRequest
     * @return GetBasicAccelerateIpEndpointRelationResponse
     */
    public GetBasicAccelerateIpEndpointRelationResponse getBasicAccelerateIpEndpointRelation(GetBasicAccelerateIpEndpointRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAccelerateIpEndpointRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of idle accelerated IP addresses of a Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicAccelerateIpIdleCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicAccelerateIpIdleCountResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the number of idle accelerated IP addresses of a Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicAccelerateIpIdleCountRequest
     * @return GetBasicAccelerateIpIdleCountResponse
     */
    public GetBasicAccelerateIpIdleCountResponse getBasicAccelerateIpIdleCount(GetBasicAccelerateIpIdleCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAccelerateIpIdleCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicAcceleratorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicAcceleratorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicAcceleratorRequest
     * @return GetBasicAcceleratorResponse
     */
    public GetBasicAcceleratorResponse getBasicAccelerator(GetBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about an endpoint that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicEndpointResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about an endpoint that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicEndpointRequest
     * @return GetBasicEndpointResponse
     */
    public GetBasicEndpointResponse getBasicEndpoint(GetBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the endpoint group of a basic GA instance.</p>
     * 
     * @param request GetBasicEndpointGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicEndpointGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the endpoint group of a basic GA instance.</p>
     * 
     * @param request GetBasicEndpointGroupRequest
     * @return GetBasicEndpointGroupResponse
     */
    public GetBasicEndpointGroupResponse getBasicEndpointGroup(GetBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the acceleration region of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicIpSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBasicIpSetResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the acceleration region of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request GetBasicIpSetRequest
     * @return GetBasicIpSetResponse
     */
    public GetBasicIpSetResponse getBasicIpSet(GetBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBasicIpSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health status of the endpoints and endpoint groups of a listener.</p>
     * 
     * @param request GetHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHealthStatusResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the health status of the endpoints and endpoint groups of a listener.</p>
     * 
     * @param request GetHealthStatusRequest
     * @return GetHealthStatusResponse
     */
    public GetHealthStatusResponse getHealthStatus(GetHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of invalid domain names.</p>
     * 
     * @param request GetInvalidDomainCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInvalidDomainCountResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the number of invalid domain names.</p>
     * 
     * @param request GetInvalidDomainCountRequest
     * @return GetInvalidDomainCountResponse
     */
    public GetInvalidDomainCountResponse getInvalidDomainCount(GetInvalidDomainCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInvalidDomainCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the maximum bandwidth of an acceleration area.</p>
     * 
     * @param request GetIpsetsBandwidthLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIpsetsBandwidthLimitResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the maximum bandwidth of an acceleration area.</p>
     * 
     * @param request GetIpsetsBandwidthLimitRequest
     * @return GetIpsetsBandwidthLimitResponse
     */
    public GetIpsetsBandwidthLimitResponse getIpsetsBandwidthLimit(GetIpsetsBandwidthLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIpsetsBandwidthLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a secondary IP address that is associated with a CNAME.</p>
     * 
     * @param request GetSpareIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSpareIpResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a secondary IP address that is associated with a CNAME.</p>
     * 
     * @param request GetSpareIpRequest
     * @return GetSpareIpResponse
     */
    public GetSpareIpResponse getSpareIp(GetSpareIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSpareIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available acceleration areas and regions.</p>
     * 
     * @param request ListAccelerateAreasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccelerateAreasResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries available acceleration areas and regions.</p>
     * 
     * @param request ListAccelerateAreasRequest
     * @return ListAccelerateAreasResponse
     */
    public ListAccelerateAreasResponse listAccelerateAreas(ListAccelerateAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccelerateAreasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Global Accelerator (GA) instances.</p>
     * 
     * @param request ListAcceleratorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAcceleratorsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries Global Accelerator (GA) instances.</p>
     * 
     * @param request ListAcceleratorsRequest
     * @return ListAcceleratorsResponse
     */
    public ListAcceleratorsResponse listAccelerators(ListAcceleratorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAcceleratorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of access control lists (ACLs).</p>
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of access control lists (ACLs).</p>
     * 
     * @param request ListAclsRequest
     * @return ListAclsResponse
     */
    public ListAclsResponse listAcls(ListAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAclsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries origin probing tasks.</p>
     * 
     * @param request ListApplicationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationMonitorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries origin probing tasks.</p>
     * 
     * @param request ListApplicationMonitorRequest
     * @return ListApplicationMonitorResponse
     */
    public ListApplicationMonitorResponse listApplicationMonitor(ListApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of origin probing tasks.</p>
     * 
     * @param request ListApplicationMonitorDetectResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationMonitorDetectResultResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of origin probing tasks.</p>
     * 
     * @param request ListApplicationMonitorDetectResultRequest
     * @return ListApplicationMonitorDetectResultResponse
     */
    public ListApplicationMonitorDetectResultResponse listApplicationMonitorDetectResult(ListApplicationMonitorDetectResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationMonitorDetectResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available acceleration regions.</p>
     * 
     * @param request ListAvailableAccelerateAreasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableAccelerateAreasResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries available acceleration regions.</p>
     * 
     * @param request ListAvailableAccelerateAreasRequest
     * @return ListAvailableAccelerateAreasResponse
     */
    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableAccelerateAreasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available acceleration regions of a Global Accelerator (GA) instance.</p>
     * 
     * @param request ListAvailableBusiRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableBusiRegionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the available acceleration regions of a Global Accelerator (GA) instance.</p>
     * 
     * @param request ListAvailableBusiRegionsRequest
     * @return ListAvailableBusiRegionsResponse
     */
    public ListAvailableBusiRegionsResponse listAvailableBusiRegions(ListAvailableBusiRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableBusiRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries bandwidth plans.</p>
     * 
     * @param request ListBandwidthPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBandwidthPackagesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries bandwidth plans.</p>
     * 
     * @param request ListBandwidthPackagesRequest
     * @return ListBandwidthPackagesResponse
     */
    public ListBandwidthPackagesResponse listBandwidthPackages(ListBandwidthPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBandwidthPackagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To query the detailed information about a bandwidth plan, call the <strong>ListBandwidthPackages</strong> operation. For more information, see <a href="https://help.aliyun.com/document_detail/2253239.html">ListBandwidthPackages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth plans.</p>
     * 
     * @param request ListBandwidthackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBandwidthackagesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>To query the detailed information about a bandwidth plan, call the <strong>ListBandwidthPackages</strong> operation. For more information, see <a href="https://help.aliyun.com/document_detail/2253239.html">ListBandwidthPackages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth plans.</p>
     * 
     * @param request ListBandwidthackagesRequest
     * @return ListBandwidthackagesResponse
     */
    public ListBandwidthackagesResponse listBandwidthackages(ListBandwidthackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBandwidthackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the accelerated IP address of a basic Global Accelerator (GA) instance is associated with an endpoint.</p>
     * 
     * @param request ListBasicAccelerateIpEndpointRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBasicAccelerateIpEndpointRelationsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries whether the accelerated IP address of a basic Global Accelerator (GA) instance is associated with an endpoint.</p>
     * 
     * @param request ListBasicAccelerateIpEndpointRelationsRequest
     * @return ListBasicAccelerateIpEndpointRelationsResponse
     */
    public ListBasicAccelerateIpEndpointRelationsResponse listBasicAccelerateIpEndpointRelations(ListBasicAccelerateIpEndpointRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicAccelerateIpEndpointRelationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accelerated IP addresses in the acceleration region of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request ListBasicAccelerateIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBasicAccelerateIpsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the accelerated IP addresses in the acceleration region of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request ListBasicAccelerateIpsRequest
     * @return ListBasicAccelerateIpsResponse
     */
    public ListBasicAccelerateIpsResponse listBasicAccelerateIps(ListBasicAccelerateIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicAccelerateIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries basic Global Accelerator (GA) instances.</p>
     * 
     * @param request ListBasicAcceleratorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBasicAcceleratorsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries basic Global Accelerator (GA) instances.</p>
     * 
     * @param request ListBasicAcceleratorsRequest
     * @return ListBasicAcceleratorsResponse
     */
    public ListBasicAcceleratorsResponse listBasicAccelerators(ListBasicAcceleratorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicAcceleratorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints that are associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request ListBasicEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBasicEndpointsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints that are associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request ListBasicEndpointsRequest
     * @return ListBasicEndpointsResponse
     */
    public ListBasicEndpointsResponse listBasicEndpoints(ListBasicEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBasicEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the acceleration regions that are supported by Global Accelerator (GA).</p>
     * 
     * @param request ListBusiRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBusiRegionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the acceleration regions that are supported by Global Accelerator (GA).</p>
     * 
     * @param request ListBusiRegionsRequest
     * @return ListBusiRegionsResponse
     */
    public ListBusiRegionsResponse listBusiRegions(ListBusiRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusiRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the acceleration areas and regions that you can specify on the wizard page of Global Accelerator (GA) and for free-trial GA instances. You can filter acceleration areas and regions based on specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries available acceleration areas and regions.</p>
     * 
     * @param request ListCommonAreasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommonAreasResponse
     */
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

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the acceleration areas and regions that you can specify on the wizard page of Global Accelerator (GA) and for free-trial GA instances. You can filter acceleration areas and regions based on specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries available acceleration areas and regions.</p>
     * 
     * @param request ListCommonAreasRequest
     * @return ListCommonAreasResponse
     */
    public ListCommonAreasResponse listCommonAreas(ListCommonAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommonAreasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoint group mapping configurations of a custom routing listener of a Global Accelerator (GA) instance.</p>
     * 
     * @param request ListCustomRoutingEndpointGroupDestinationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomRoutingEndpointGroupDestinationsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoint group mapping configurations of a custom routing listener of a Global Accelerator (GA) instance.</p>
     * 
     * @param request ListCustomRoutingEndpointGroupDestinationsRequest
     * @return ListCustomRoutingEndpointGroupDestinationsResponse
     */
    public ListCustomRoutingEndpointGroupDestinationsResponse listCustomRoutingEndpointGroupDestinations(ListCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ga%5C&api=ListCustomRoutingEndpointGroups%5C&type=RPC%5C&version=2019-11-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the endpoint groups that are associated with a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingEndpointGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomRoutingEndpointGroupsResponse
     */
    public ListCustomRoutingEndpointGroupsResponse listCustomRoutingEndpointGroupsWithOptions(ListCustomRoutingEndpointGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ga%5C&api=ListCustomRoutingEndpointGroups%5C&type=RPC%5C&version=2019-11-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the endpoint groups that are associated with a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingEndpointGroupsRequest
     * @return ListCustomRoutingEndpointGroupsResponse
     */
    public ListCustomRoutingEndpointGroupsResponse listCustomRoutingEndpointGroups(ListCustomRoutingEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic policies of an endpoint that belongs to a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingEndpointTrafficPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomRoutingEndpointTrafficPoliciesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic policies of an endpoint that belongs to a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingEndpointTrafficPoliciesRequest
     * @return ListCustomRoutingEndpointTrafficPoliciesResponse
     */
    public ListCustomRoutingEndpointTrafficPoliciesResponse listCustomRoutingEndpointTrafficPolicies(ListCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of an endpoint.</p>
     * 
     * @param request ListCustomRoutingEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomRoutingEndpointsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of an endpoint.</p>
     * 
     * @param request ListCustomRoutingEndpointsRequest
     * @return ListCustomRoutingEndpointsResponse
     */
    public ListCustomRoutingEndpointsResponse listCustomRoutingEndpoints(ListCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches). The custom routing listener forwards client requests to specified IP addresses and ports in the vSwitches based on the port mapping table. This operation is used to query the generated port mapping table.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the port mapping table of a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches). The custom routing listener forwards client requests to specified IP addresses and ports in the vSwitches based on the port mapping table. This operation is used to query the generated port mapping table.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the port mapping table of a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingPortMappingsRequest
     * @return ListCustomRoutingPortMappingsResponse
     */
    public ListCustomRoutingPortMappingsResponse listCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingPortMappingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the port mapping table of a specified backend instance that is associated with a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingPortMappingsByDestinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomRoutingPortMappingsByDestinationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the port mapping table of a specified backend instance that is associated with a custom routing listener.</p>
     * 
     * @param request ListCustomRoutingPortMappingsByDestinationRequest
     * @return ListCustomRoutingPortMappingsByDestinationResponse
     */
    public ListCustomRoutingPortMappingsByDestinationResponse listCustomRoutingPortMappingsByDestination(ListCustomRoutingPortMappingsByDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomRoutingPortMappingsByDestinationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an accelerated domain name of a GA instance.</p>
     * 
     * @param request ListDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an accelerated domain name of a GA instance.</p>
     * 
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the public CIDR blocks to which the endpoint group IP addresses belong. The CIDR blocks can be used to configure ACLs in terminals.</p>
     * 
     * @param request ListEndpointGroupIpAddressCidrBlocksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEndpointGroupIpAddressCidrBlocksResponse
     */
    public ListEndpointGroupIpAddressCidrBlocksResponse listEndpointGroupIpAddressCidrBlocksWithOptions(ListEndpointGroupIpAddressCidrBlocksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointGroupRegion)) {
            query.put("EndpointGroupRegion", request.endpointGroupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEndpointGroupIpAddressCidrBlocks"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEndpointGroupIpAddressCidrBlocksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the public CIDR blocks to which the endpoint group IP addresses belong. The CIDR blocks can be used to configure ACLs in terminals.</p>
     * 
     * @param request ListEndpointGroupIpAddressCidrBlocksRequest
     * @return ListEndpointGroupIpAddressCidrBlocksResponse
     */
    public ListEndpointGroupIpAddressCidrBlocksResponse listEndpointGroupIpAddressCidrBlocks(ListEndpointGroupIpAddressCidrBlocksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEndpointGroupIpAddressCidrBlocksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoint groups.</p>
     * 
     * @param request ListEndpointGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEndpointGroupsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoint groups.</p>
     * 
     * @param request ListEndpointGroupsRequest
     * @return ListEndpointGroupsResponse
     */
    public ListEndpointGroupsResponse listEndpointGroups(ListEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is used to query only custom forwarding rules, not the default forwarding rule.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about existing forwarding rules.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is used to query only custom forwarding rules, not the default forwarding rule.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about existing forwarding rules.</p>
     * 
     * @param request ListForwardingRulesRequest
     * @return ListForwardingRulesResponse
     */
    public ListForwardingRulesResponse listForwardingRules(ListForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listForwardingRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries acceleration regions.</p>
     * 
     * @param request ListIpSetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpSetsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries acceleration regions.</p>
     * 
     * @param request ListIpSetsRequest
     * @return ListIpSetsResponse
     */
    public ListIpSetsResponse listIpSets(ListIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpSetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the line types of elastic IP addresses (EIPs) that are supported in an acceleration region.</p>
     * 
     * @param request ListIspTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIspTypesResponse
     */
    public ListIspTypesResponse listIspTypesWithOptions(ListIspTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

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

    /**
     * <b>summary</b> : 
     * <p>Queries the line types of elastic IP addresses (EIPs) that are supported in an acceleration region.</p>
     * 
     * @param request ListIspTypesRequest
     * @return ListIspTypesResponse
     */
    public ListIspTypesResponse listIspTypes(ListIspTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIspTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates associated with a listener.</p>
     * 
     * @param request ListListenerCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListenerCertificatesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates associated with a listener.</p>
     * 
     * @param request ListListenerCertificatesRequest
     * @return ListListenerCertificatesResponse
     */
    public ListListenerCertificatesResponse listListenerCertificates(ListListenerCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenerCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to query information about the listeners of a GA instance, including the status of each listener, the timestamp that indicates when each listener was created, and the listener ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the listeners of a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>This operation is used to query information about the listeners of a GA instance, including the status of each listener, the timestamp that indicates when each listener was created, and the listener ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the listeners of a Global Accelerator (GA) instance.</p>
     * 
     * @param request ListListenersRequest
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the secondary IP addresses that are associated with a CNAME.</p>
     * 
     * @param request ListSpareIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSpareIpsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the secondary IP addresses that are associated with a CNAME.</p>
     * 
     * @param request ListSpareIpsRequest
     * @return ListSpareIpsResponse
     */
    public ListSpareIpsResponse listSpareIps(ListSpareIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSpareIpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can select a TLS security policy when you create an HTTPS listener. This API operation is used to query the TLS security policies that are supported by HTTPS listeners.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the TLS security policies that are supported by HTTPS listeners.</p>
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
     * <b>description</b> :
     * <p>You can select a TLS security policy when you create an HTTPS listener. This API operation is used to query the TLS security policies that are supported by HTTPS listeners.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the TLS security policies that are supported by HTTPS listeners.</p>
     * 
     * @param request ListSystemSecurityPoliciesRequest
     * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSystemSecurityPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You must specify <strong>ResourceId</strong> or <strong>Tag</strong> in the request to specify the object that you want to query.********</p>
     * <ul>
     * <li><strong>Tag</strong> is a resource tag that consists of a key-value pair (Key and Value). If you specify only <strong>Key</strong>, all tag values that are associated with the specified tag key are returned. If you specify only <strong>Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag</strong> and <strong>ResourceId</strong> to filter tags, <strong>ResourceId</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain the key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to Global Accelerator (GA) resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>  You must specify <strong>ResourceId</strong> or <strong>Tag</strong> in the request to specify the object that you want to query.********</p>
     * <ul>
     * <li><strong>Tag</strong> is a resource tag that consists of a key-value pair (Key and Value). If you specify only <strong>Key</strong>, all tag values that are associated with the specified tag key are returned. If you specify only <strong>Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag</strong> and <strong>ResourceId</strong> to filter tags, <strong>ResourceId</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain the key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to Global Accelerator (GA) resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the pay-as-you-go Global Accelerator (GA) service. If you want to use pay-as-you-go GA instances, you must activate the pay-as-you-go GA service first.</p>
     * 
     * @param request OpenAcceleratorServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenAcceleratorServiceResponse
     */
    public OpenAcceleratorServiceResponse openAcceleratorServiceWithOptions(OpenAcceleratorServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "OpenAcceleratorService"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenAcceleratorServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the pay-as-you-go Global Accelerator (GA) service. If you want to use pay-as-you-go GA instances, you must activate the pay-as-you-go GA service first.</p>
     * 
     * @param request OpenAcceleratorServiceRequest
     * @return OpenAcceleratorServiceResponse
     */
    public OpenAcceleratorServiceResponse openAcceleratorService(OpenAcceleratorServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openAcceleratorServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Inquire about the approval status of cross-border permissions for an Alibaba Cloud account (main account).</p>
     * 
     * @param request QueryCrossBorderApprovalStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCrossBorderApprovalStatusResponse
     */
    public QueryCrossBorderApprovalStatusResponse queryCrossBorderApprovalStatusWithOptions(QueryCrossBorderApprovalStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCrossBorderApprovalStatus"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCrossBorderApprovalStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Inquire about the approval status of cross-border permissions for an Alibaba Cloud account (main account).</p>
     * 
     * @param request QueryCrossBorderApprovalStatusRequest
     * @return QueryCrossBorderApprovalStatusResponse
     */
    public QueryCrossBorderApprovalStatusResponse queryCrossBorderApprovalStatus(QueryCrossBorderApprovalStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCrossBorderApprovalStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>RemoveEntriesFromAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the status of the ACL from which you want to delete IP entries.
     *     *   If the ACL is in the <strong>configuring</strong> state, it indicates that the IP entries are being deleted. In this case, you can perform only query operations.
     *     *   If the ACL is in the <strong>active</strong> state, it indicates that the IP entries are deleted.</p>
     * <ul>
     * <li>The <strong>RemoveEntriesFromAcl</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes IP entries from an access control list (ACL).</p>
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
     * <b>description</b> :
     * <p>  <strong>RemoveEntriesFromAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the status of the ACL from which you want to delete IP entries.
     *     *   If the ACL is in the <strong>configuring</strong> state, it indicates that the IP entries are being deleted. In this case, you can perform only query operations.
     *     *   If the ACL is in the <strong>active</strong> state, it indicates that the IP entries are deleted.</p>
     * <ul>
     * <li>The <strong>RemoveEntriesFromAcl</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes IP entries from an access control list (ACL).</p>
     * 
     * @param request RemoveEntriesFromAclRequest
     * @return RemoveEntriesFromAclResponse
     */
    public RemoveEntriesFromAclResponse removeEntriesFromAcl(RemoveEntriesFromAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEntriesFromAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The GA instance continues to forward network traffic.</li>
     * <li><strong>ReplaceBandwidthPackage</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, it indicates that the associated bandwidth plan is being replaced. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the associated bandwidth plan is replaced.</li>
     * </ul>
     * </li>
     * <li>The <strong>ReplaceBandwidthPackage</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces the bandwidth plans of Global Accelerator (GA) instances.</p>
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The GA instance continues to forward network traffic.</li>
     * <li><strong>ReplaceBandwidthPackage</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, it indicates that the associated bandwidth plan is being replaced. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the associated bandwidth plan is replaced.</li>
     * </ul>
     * </li>
     * <li>The <strong>ReplaceBandwidthPackage</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces the bandwidth plans of Global Accelerator (GA) instances.</p>
     * 
     * @param request ReplaceBandwidthPackageRequest
     * @return ReplaceBandwidthPackageResponse
     */
    public ReplaceBandwidthPackageResponse replaceBandwidthPackage(ReplaceBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>You can add up to 20 tags to each GA resource. When you call this operation, Alibaba Cloud first checks the number of existing tags attached to the resource. If the quota is reached, an error message is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to Global Accelerator (GA) resources.</p>
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
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>You can add up to 20 tags to each GA resource. When you call this operation, Alibaba Cloud first checks the number of existing tags attached to the resource. If the quota is reached, an error message is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to Global Accelerator (GA) resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from Global Accelerator (GA) resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Removes tags from Global Accelerator (GA) resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, the GA instance is being modified. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, the GA instance is modified.</p>
     * <ul>
     * <li>The <strong>UpdateAccelerator</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, the GA instance is being modified. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, the GA instance is modified.</p>
     * <ul>
     * <li>The <strong>UpdateAccelerator</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorRequest
     * @return UpdateAcceleratorResponse
     */
    public UpdateAcceleratorResponse updateAccelerator(UpdateAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateAcceleratorAutoRenewAttribute</strong> operation for the same GA instance within a specific period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the auto-renewal settings of a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateAcceleratorAutoRenewAttribute</strong> operation for the same GA instance within a specific period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the auto-renewal settings of a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorAutoRenewAttributeRequest
     * @return UpdateAcceleratorAutoRenewAttributeResponse
     */
    public UpdateAcceleratorAutoRenewAttributeResponse updateAcceleratorAutoRenewAttribute(UpdateAcceleratorAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you modify the specification of a GA instance, you must confirm the modification. The <strong>UpdateAcceleratorConfirm</strong> operation is used to confirm the specification of a GA instance that is modified. When you call this operation to confirm the specification of a GA instance, take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateAcceleratorConfirm</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, it indicates that the specification of the instance is being modified. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the specification of the instance is modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateAcceleratorConfirm</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Confirms the updated specification of a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>After you modify the specification of a GA instance, you must confirm the modification. The <strong>UpdateAcceleratorConfirm</strong> operation is used to confirm the specification of a GA instance that is modified. When you call this operation to confirm the specification of a GA instance, take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateAcceleratorConfirm</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, it indicates that the specification of the instance is being modified. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the specification of the instance is modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateAcceleratorConfirm</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Confirms the updated specification of a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorConfirmRequest
     * @return UpdateAcceleratorConfirmResponse
     */
    public UpdateAcceleratorConfirmResponse updateAcceleratorConfirm(UpdateAcceleratorConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorConfirmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the type of transmission network for a <strong>standard</strong> GA instance whose bandwidth metering method is <strong>pay-by-data-transfer</strong>. Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>Cloud Data Transfer (CDT) is activated. When you call the <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a> operation and set <strong>BandwidthBillingType</strong> to <strong>CDT</strong> to create a <strong>standard</strong> GA instance whose bandwidth metering method is <strong>pay-by-data-transfer</strong>, CDT is automatically activated. The data transfer fees are managed by CDT.</li>
     * <li>If you want to set <strong>CrossBorderMode</strong> to <strong>private</strong>, which specifies cross-border Express Connect circuit as the type of transmission network, make sure that real-name verification is complete for your enterprise account. For more information, see <a href="https://help.aliyun.com/document_detail/52595.html">Real-name verification</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the type of transmission network for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorCrossBorderModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAcceleratorCrossBorderModeResponse
     */
    public UpdateAcceleratorCrossBorderModeResponse updateAcceleratorCrossBorderModeWithOptions(UpdateAcceleratorCrossBorderModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossBorderMode)) {
            query.put("CrossBorderMode", request.crossBorderMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcceleratorCrossBorderMode"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorCrossBorderModeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the type of transmission network for a <strong>standard</strong> GA instance whose bandwidth metering method is <strong>pay-by-data-transfer</strong>. Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>Cloud Data Transfer (CDT) is activated. When you call the <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a> operation and set <strong>BandwidthBillingType</strong> to <strong>CDT</strong> to create a <strong>standard</strong> GA instance whose bandwidth metering method is <strong>pay-by-data-transfer</strong>, CDT is automatically activated. The data transfer fees are managed by CDT.</li>
     * <li>If you want to set <strong>CrossBorderMode</strong> to <strong>private</strong>, which specifies cross-border Express Connect circuit as the type of transmission network, make sure that real-name verification is complete for your enterprise account. For more information, see <a href="https://help.aliyun.com/document_detail/52595.html">Real-name verification</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the type of transmission network for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorCrossBorderModeRequest
     * @return UpdateAcceleratorCrossBorderModeResponse
     */
    public UpdateAcceleratorCrossBorderModeResponse updateAcceleratorCrossBorderMode(UpdateAcceleratorCrossBorderModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorCrossBorderModeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to enable or disable the cross-border data transmission feature for a GA instance. Before you enable the cross-border data transmission feature, make sure that the following requirements are met:</p>
     * <ul>
     * <li><strong>Basic GA instances</strong>:
     * Cloud Data Transfer (CDT) is activated. When you call the CreateBasicAccelerator operation to create a basic GA instance, set BandwidthBillingType to CDT. Then, the system automatically activates CDT. The data transfer fees are managed by CDT.
     * If you want to enable the cross-border data transmission feature, make sure that the current account has completed enterprise real-name registration. For more information, see Real-name registration FAQs.</li>
     * <li><strong>Standard GA instances</strong>:
     * CDT is activated. When you call the CreateAccelerator operation to create a standard GA instance, set BandwidthBillingType to CDT. Then, the system automatically activates CDT. The data transfer fees are managed by CDT.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables cross-border data transmission for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorCrossBorderStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAcceleratorCrossBorderStatusResponse
     */
    public UpdateAcceleratorCrossBorderStatusResponse updateAcceleratorCrossBorderStatusWithOptions(UpdateAcceleratorCrossBorderStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorId)) {
            query.put("AcceleratorId", request.acceleratorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossBorderStatus)) {
            query.put("CrossBorderStatus", request.crossBorderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcceleratorCrossBorderStatus"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorCrossBorderStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to enable or disable the cross-border data transmission feature for a GA instance. Before you enable the cross-border data transmission feature, make sure that the following requirements are met:</p>
     * <ul>
     * <li><strong>Basic GA instances</strong>:
     * Cloud Data Transfer (CDT) is activated. When you call the CreateBasicAccelerator operation to create a basic GA instance, set BandwidthBillingType to CDT. Then, the system automatically activates CDT. The data transfer fees are managed by CDT.
     * If you want to enable the cross-border data transmission feature, make sure that the current account has completed enterprise real-name registration. For more information, see Real-name registration FAQs.</li>
     * <li><strong>Standard GA instances</strong>:
     * CDT is activated. When you call the CreateAccelerator operation to create a standard GA instance, set BandwidthBillingType to CDT. Then, the system automatically activates CDT. The data transfer fees are managed by CDT.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables cross-border data transmission for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAcceleratorCrossBorderStatusRequest
     * @return UpdateAcceleratorCrossBorderStatusResponse
     */
    public UpdateAcceleratorCrossBorderStatusResponse updateAcceleratorCrossBorderStatus(UpdateAcceleratorCrossBorderStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAcceleratorCrossBorderStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of an access control list (ACL) of a Global Accelerator (GA) instance.</p>
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of an access control list (ACL) of a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateAclAttributeRequest
     * @return UpdateAclAttributeResponse
     */
    public UpdateAclAttributeResponse updateAclAttribute(UpdateAclAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAclAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The UpdateAdditionalCertificateWithListener operation is used to replace an additional certificate. This operation is suitable for scenarios in which the original certificate expires and needs to be replaced with a new certificate and the associated domain name remains unchanged.</p>
     * <ul>
     * <li><strong>UpdateAdditionalCertificateWithListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/307743.html">ListListenerCertificates</a> to query the status of the task:<ul>
     * <li>If the certificate to be replaced is in the <strong>updating</strong> state, the certificate is being replaced. In this case, you can only query the certificate.</li>
     * <li>If the new certificate is in the <strong>active</strong> state, the new certificate is in effect.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateAdditionalCertificateWithListener</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces an expired additional certificate for an HTTPS listener.</p>
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
     * <b>description</b> :
     * <p>The UpdateAdditionalCertificateWithListener operation is used to replace an additional certificate. This operation is suitable for scenarios in which the original certificate expires and needs to be replaced with a new certificate and the associated domain name remains unchanged.</p>
     * <ul>
     * <li><strong>UpdateAdditionalCertificateWithListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/307743.html">ListListenerCertificates</a> to query the status of the task:<ul>
     * <li>If the certificate to be replaced is in the <strong>updating</strong> state, the certificate is being replaced. In this case, you can only query the certificate.</li>
     * <li>If the new certificate is in the <strong>active</strong> state, the new certificate is in effect.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateAdditionalCertificateWithListener</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces an expired additional certificate for an HTTPS listener.</p>
     * 
     * @param request UpdateAdditionalCertificateWithListenerRequest
     * @return UpdateAdditionalCertificateWithListenerResponse
     */
    public UpdateAdditionalCertificateWithListenerResponse updateAdditionalCertificateWithListener(UpdateAdditionalCertificateWithListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAdditionalCertificateWithListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateApplicationMonitor</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/408463.html">DescribeApplicationMonitor</a> or <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to check whether the configurations of an origin probing task are modified.</p>
     * <ul>
     * <li>If the values of modified parameters remain unchanged, it indicates that the origin probing task is being modified. In this case, you can perform only query operations.</li>
     * <li>If the values of modified parameters change, it indicates that the origin probing task is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an origin probing task.</p>
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
     * <b>description</b> :
     * <p><em>UpdateApplicationMonitor</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/408463.html">DescribeApplicationMonitor</a> or <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to check whether the configurations of an origin probing task are modified.</p>
     * <ul>
     * <li>If the values of modified parameters remain unchanged, it indicates that the origin probing task is being modified. In this case, you can perform only query operations.</li>
     * <li>If the values of modified parameters change, it indicates that the origin probing task is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an origin probing task.</p>
     * 
     * @param request UpdateApplicationMonitorRequest
     * @return UpdateApplicationMonitorResponse
     */
    public UpdateApplicationMonitorResponse updateApplicationMonitor(UpdateApplicationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateBandwidthPackagaAutoRenewAttribute</strong> operation to modify the auto-renewal settings of a bandwidth plan.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the auto-renewal status of a bandwidth plan.</p>
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
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateBandwidthPackagaAutoRenewAttribute</strong> operation to modify the auto-renewal settings of a bandwidth plan.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the auto-renewal status of a bandwidth plan.</p>
     * 
     * @param request UpdateBandwidthPackagaAutoRenewAttributeRequest
     * @return UpdateBandwidthPackagaAutoRenewAttributeResponse
     */
    public UpdateBandwidthPackagaAutoRenewAttributeResponse updateBandwidthPackagaAutoRenewAttribute(UpdateBandwidthPackagaAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBandwidthPackagaAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateBandwidthPackage</strong> is a synchronous operation when you call the operation to modify the configuration excluding the bandwidth value of a bandwidth plan. The new configuration immediately takes effect after the operation is performed.</li>
     * <li><strong>UpdateBandwidthPackage</strong> is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is not associated with a Global Accelerator (GA) instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the task.<ul>
     * <li>If the parameter values of the bandwidth plan remain unchanged, the bandwidth plan is being modified. In this case, you can perform only query operations.</li>
     * <li>If the parameter values of the bandwidth plan are changed, the bandwidth plan is modified.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateBandwidthPackage</strong> is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is associated with a GA instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, the bandwidth plan is being modified. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, the bandwidth plan is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateBandwidthPackage</strong> operation for the same bandwidth plan within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a bandwidth plan.</p>
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
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateBandwidthPackage</strong> is a synchronous operation when you call the operation to modify the configuration excluding the bandwidth value of a bandwidth plan. The new configuration immediately takes effect after the operation is performed.</li>
     * <li><strong>UpdateBandwidthPackage</strong> is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is not associated with a Global Accelerator (GA) instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the task.<ul>
     * <li>If the parameter values of the bandwidth plan remain unchanged, the bandwidth plan is being modified. In this case, you can perform only query operations.</li>
     * <li>If the parameter values of the bandwidth plan are changed, the bandwidth plan is modified.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateBandwidthPackage</strong> is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is associated with a GA instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, the bandwidth plan is being modified. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, the bandwidth plan is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateBandwidthPackage</strong> operation for the same bandwidth plan within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a bandwidth plan.</p>
     * 
     * @param request UpdateBandwidthPackageRequest
     * @return UpdateBandwidthPackageResponse
     */
    public UpdateBandwidthPackageResponse updateBandwidthPackage(UpdateBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateBasicAcceleratorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBasicAcceleratorResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateBasicAcceleratorRequest
     * @return UpdateBasicAcceleratorResponse
     */
    public UpdateBasicAcceleratorResponse updateBasicAccelerator(UpdateBasicAcceleratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicAcceleratorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an endpoint that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateBasicEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBasicEndpointResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an endpoint that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateBasicEndpointRequest
     * @return UpdateBasicEndpointResponse
     */
    public UpdateBasicEndpointResponse updateBasicEndpoint(UpdateBasicEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. The system modifies the configurations of an endpoint group that is associated with a basic GA instance by deleting the endpoint group and creating a new endpoint group. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> operation to query the status of the task.
     *     *   If the basic GA instance is in the <strong>configuring</strong> state, the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the basic GA instance is in the <strong>active</strong> state, the configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateBasicEndpointGroup</strong> operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an endpoint group that is associated with a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. The system modifies the configurations of an endpoint group that is associated with a basic GA instance by deleting the endpoint group and creating a new endpoint group. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> operation to query the status of the task.
     *     *   If the basic GA instance is in the <strong>configuring</strong> state, the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the basic GA instance is in the <strong>active</strong> state, the configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateBasicEndpointGroup</strong> operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an endpoint group that is associated with a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateBasicEndpointGroupRequest
     * @return UpdateBasicEndpointGroupResponse
     */
    public UpdateBasicEndpointGroupResponse updateBasicEndpointGroup(UpdateBasicEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can modify the bandwidth of an acceleration region of a basic GA instance only if the bandwidth metering method of the basic GA instance is <strong>pay-by-data-transfer</strong>.</li>
     * <li><strong>UpdateBasicIpSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>updating</strong> state, it indicates that the bandwidth of the acceleration region is being modified. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region is in the <strong>active</strong> state, it indicates that the bandwidth of the acceleration region is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateBasicIpSet</strong> operation for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the bandwidth of an acceleration region of a basic Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can modify the bandwidth of an acceleration region of a basic GA instance only if the bandwidth metering method of the basic GA instance is <strong>pay-by-data-transfer</strong>.</li>
     * <li><strong>UpdateBasicIpSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>updating</strong> state, it indicates that the bandwidth of the acceleration region is being modified. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region is in the <strong>active</strong> state, it indicates that the bandwidth of the acceleration region is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateBasicIpSet</strong> operation for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the bandwidth of an acceleration region of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateBasicIpSetRequest
     * @return UpdateBasicIpSetResponse
     */
    public UpdateBasicIpSetResponse updateBasicIpSet(UpdateBasicIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBasicIpSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of an endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request UpdateCustomRoutingEndpointGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomRoutingEndpointGroupAttributeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of an endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request UpdateCustomRoutingEndpointGroupAttributeRequest
     * @return UpdateCustomRoutingEndpointGroupAttributeResponse
     */
    public UpdateCustomRoutingEndpointGroupAttributeResponse updateCustomRoutingEndpointGroupAttribute(UpdateCustomRoutingEndpointGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group associated with a custom routing listener to check whether the mapping configurations of the endpoint group are modified.
     *     *   If the endpoint group is in the <strong>updating</strong> state, the mapping configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, the mapping configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateCustomRoutingEndpointGroupDestinations</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the mapping configurations of an endpoint group that is associated with a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group associated with a custom routing listener to check whether the mapping configurations of the endpoint group are modified.
     *     *   If the endpoint group is in the <strong>updating</strong> state, the mapping configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, the mapping configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateCustomRoutingEndpointGroupDestinations</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the mapping configurations of an endpoint group that is associated with a custom routing listener.</p>
     * 
     * @param request UpdateCustomRoutingEndpointGroupDestinationsRequest
     * @return UpdateCustomRoutingEndpointGroupDestinationsResponse
     */
    public UpdateCustomRoutingEndpointGroupDestinationsResponse updateCustomRoutingEndpointGroupDestinations(UpdateCustomRoutingEndpointGroupDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointGroupDestinationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.
     *     *   If the endpoint group is in the <strong>updating</strong> state, traffic policies are being modified for endpoints in the endpoint group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, traffic policies are modified for endpoints in the endpoint group.</p>
     * <ul>
     * <li>The <strong>UpdateCustomRoutingEndpointTrafficPolicies</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the traffic policies for an endpoint that is associated with a custom routing listener.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.
     *     *   If the endpoint group is in the <strong>updating</strong> state, traffic policies are being modified for endpoints in the endpoint group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, traffic policies are modified for endpoints in the endpoint group.</p>
     * <ul>
     * <li>The <strong>UpdateCustomRoutingEndpointTrafficPolicies</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the traffic policies for an endpoint that is associated with a custom routing listener.</p>
     * 
     * @param request UpdateCustomRoutingEndpointTrafficPoliciesRequest
     * @return UpdateCustomRoutingEndpointTrafficPoliciesResponse
     */
    public UpdateCustomRoutingEndpointTrafficPoliciesResponse updateCustomRoutingEndpointTrafficPolicies(UpdateCustomRoutingEndpointTrafficPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointTrafficPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>UpdateCustomRoutingEndpoints</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the state of the endpoint groups associated with a custom routing listener to check whether the endpoints in the endpoint groups are modified.<ul>
     * <li>If an endpoint group is in the <strong>updating</strong> state, the endpoints in the endpoint group are being modified. In this case, you can perform only query operations.</li>
     * <li>If an endpoint group is in the <strong>active</strong> state, the endpoints in the endpoint group are modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateCustomRoutingEndpoints</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the endpoints of a custom routing listener.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>UpdateCustomRoutingEndpoints</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the state of the endpoint groups associated with a custom routing listener to check whether the endpoints in the endpoint groups are modified.<ul>
     * <li>If an endpoint group is in the <strong>updating</strong> state, the endpoints in the endpoint group are being modified. In this case, you can perform only query operations.</li>
     * <li>If an endpoint group is in the <strong>active</strong> state, the endpoints in the endpoint group are modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateCustomRoutingEndpoints</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the endpoints of a custom routing listener.</p>
     * 
     * @param request UpdateCustomRoutingEndpointsRequest
     * @return UpdateCustomRoutingEndpointsResponse
     */
    public UpdateCustomRoutingEndpointsResponse updateCustomRoutingEndpoints(UpdateCustomRoutingEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomRoutingEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify an accelerated domain name. If the new accelerated domain name is hosted in the Chinese mainland, you must obtain an Internet content provider (ICP) number for the domain name.
     * You cannot call the <strong>UpdateDomain</strong> operation again by using the same Alibaba Cloud account before the previous request is completed.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an accelerated domain name.</p>
     * 
     * @param request UpdateDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainResponse
     */
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

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify an accelerated domain name. If the new accelerated domain name is hosted in the Chinese mainland, you must obtain an Internet content provider (ICP) number for the domain name.
     * You cannot call the <strong>UpdateDomain</strong> operation again by using the same Alibaba Cloud account before the previous request is completed.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an accelerated domain name.</p>
     * 
     * @param request UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query and update the ICP filing status of an accelerated domain name.
     * The <strong>UpdateDomainState</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation with the same Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the ICP filing status of an accelerated domain name.</p>
     * 
     * @param request UpdateDomainStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainStateResponse
     */
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

    /**
     * <b>description</b> :
     * <p>You can call this operation to query and update the ICP filing status of an accelerated domain name.
     * The <strong>UpdateDomainState</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation with the same Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the ICP filing status of an accelerated domain name.</p>
     * 
     * @param request UpdateDomainStateRequest
     * @return UpdateDomainStateResponse
     */
    public UpdateDomainStateResponse updateDomainState(UpdateDomainStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that the configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an endpoint group of a basic Global Accelerator (GA) instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.endpointProtocolVersion)) {
            query.put("EndpointProtocolVersion", request.endpointProtocolVersion);
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
     * <b>description</b> :
     * <p>  <strong>UpdateEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that the configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an endpoint group of a basic Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateEndpointGroupRequest
     * @return UpdateEndpointGroupResponse
     */
    public UpdateEndpointGroupResponse updateEndpointGroup(UpdateEndpointGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEndpointGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of an endpoint group.</p>
     * 
     * @param request UpdateEndpointGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEndpointGroupAttributeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of an endpoint group.</p>
     * 
     * @param request UpdateEndpointGroupAttributeRequest
     * @return UpdateEndpointGroupAttributeResponse
     */
    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEndpointGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <ul>
     * <li><strong>UpdateEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/153261.html">ListEndpointGroups</a> operation to query the status of an endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that the configuration of the endpoint group is being modified. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the configuration of the endpoint group is modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateEndpointGroups</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the endpoint groups that are associated with a listener.</p>
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
     * <b>description</b> :
     * <h3>Description</h3>
     * <ul>
     * <li><strong>UpdateEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/153261.html">ListEndpointGroups</a> operation to query the status of an endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that the configuration of the endpoint group is being modified. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the configuration of the endpoint group is modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateEndpointGroups</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the endpoint groups that are associated with a listener.</p>
     * 
     * @param request UpdateEndpointGroupsRequest
     * @return UpdateEndpointGroupsResponse
     */
    public UpdateEndpointGroupsResponse updateEndpointGroups(UpdateEndpointGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEndpointGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateForwardingRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of a forwarding rule.
     *     *   If the forwarding rule is in the <strong>configuring</strong> state, it indicates that the forwarding rule is being modified. In this case, you can perform only query operations.
     *     *   If the forwarding rule is in the <strong>active</strong> state, it indicates that the forwarding rule is modified.</p>
     * <ul>
     * <li>The <strong>UpdateForwardingRules</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a forwarding rule.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateForwardingRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of a forwarding rule.
     *     *   If the forwarding rule is in the <strong>configuring</strong> state, it indicates that the forwarding rule is being modified. In this case, you can perform only query operations.
     *     *   If the forwarding rule is in the <strong>active</strong> state, it indicates that the forwarding rule is modified.</p>
     * <ul>
     * <li>The <strong>UpdateForwardingRules</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a forwarding rule.</p>
     * 
     * @param request UpdateForwardingRulesRequest
     * @return UpdateForwardingRulesResponse
     */
    public UpdateForwardingRulesResponse updateForwardingRules(UpdateForwardingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateForwardingRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateIpSet</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of an acceleration region.
     *     *   If the acceleration region is in the <strong>updating</strong> state, it indicates that the acceleration region is being modified. In this case, you can continue to perform query operations on the acceleration regions.
     *     *   If the acceleration region is in the <strong>active</strong> state, it indicates that the acceleration region is modified.</p>
     * <ul>
     * <li>You cannot call the <strong>UpdateIpSet</strong> operation again on the same GA instance before the previous operation is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an acceleration region in an acceleration area for a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateIpSet</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of an acceleration region.
     *     *   If the acceleration region is in the <strong>updating</strong> state, it indicates that the acceleration region is being modified. In this case, you can continue to perform query operations on the acceleration regions.
     *     *   If the acceleration region is in the <strong>active</strong> state, it indicates that the acceleration region is modified.</p>
     * <ul>
     * <li>You cannot call the <strong>UpdateIpSet</strong> operation again on the same GA instance before the previous operation is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an acceleration region in an acceleration area for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateIpSetRequest
     * @return UpdateIpSetResponse
     */
    public UpdateIpSetResponse updateIpSet(UpdateIpSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateIpSets</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If an acceleration region is in the <strong>updating</strong> state, the acceleration region is being modified. In this case, you can perform only query operations.
     *     *   If an acceleration region is in the <strong>active</strong> state, the acceleration region is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UpdateIpSets</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of acceleration regions in an acceleration area for a Global Accelerator (GA) instance.</p>
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
     * <b>description</b> :
     * <p>  <strong>UpdateIpSets</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If an acceleration region is in the <strong>updating</strong> state, the acceleration region is being modified. In this case, you can perform only query operations.
     *     *   If an acceleration region is in the <strong>active</strong> state, the acceleration region is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UpdateIpSets</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of acceleration regions in an acceleration area for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateIpSetsRequest
     * @return UpdateIpSetsResponse
     */
    public UpdateIpSetsResponse updateIpSets(UpdateIpSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpSetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation can be called to modify the configurations such as the protocol and ports of a listener to meet your business requirements.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of a listener.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that its configurations are being modified. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that its configurations are modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateListener</strong> operation cannot be repeatedly called to modify listener configurations for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a listener for a Global Accelerator (GA) instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.httpVersion)) {
            query.put("HttpVersion", request.httpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
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
     * <b>description</b> :
     * <p>This operation can be called to modify the configurations such as the protocol and ports of a listener to meet your business requirements.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of a listener.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that its configurations are being modified. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that its configurations are modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateListener</strong> operation cannot be repeatedly called to modify listener configurations for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a listener for a Global Accelerator (GA) instance.</p>
     * 
     * @param request UpdateListenerRequest
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>managed</strong> Global Accelerator (GA) instances.</p>
     * <ul>
     * <li>After you change the control mode of a GA instance from managed mode to unmanaged mode, you cannot change the mode of the instance to managed mode.</li>
     * <li>After you change the control mode of a GA instance from managed mode to unmanaged mode, you can obtain all operation permissions on the instance.
     *   <warning>If you change or delete a configuration of a GA instance whose control mode is changed from managed mode to unmanaged mode, the cloud services that depend on the instance may not work as expected. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the control mode of a resource from managed mode to unmanaged mode.</p>
     * 
     * @param request UpdateServiceManagedControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceManagedControlResponse
     */
    public UpdateServiceManagedControlResponse updateServiceManagedControlWithOptions(UpdateServiceManagedControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceManaged)) {
            query.put("ServiceManaged", request.serviceManaged);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceManagedControl"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceManagedControlResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>managed</strong> Global Accelerator (GA) instances.</p>
     * <ul>
     * <li>After you change the control mode of a GA instance from managed mode to unmanaged mode, you cannot change the mode of the instance to managed mode.</li>
     * <li>After you change the control mode of a GA instance from managed mode to unmanaged mode, you can obtain all operation permissions on the instance.
     *   <warning>If you change or delete a configuration of a GA instance whose control mode is changed from managed mode to unmanaged mode, the cloud services that depend on the instance may not work as expected. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the control mode of a resource from managed mode to unmanaged mode.</p>
     * 
     * @param request UpdateServiceManagedControlRequest
     * @return UpdateServiceManagedControlResponse
     */
    public UpdateServiceManagedControlResponse updateServiceManagedControl(UpdateServiceManagedControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceManagedControlWithOptions(request, runtime);
    }
}
