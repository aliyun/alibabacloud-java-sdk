// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120;

import com.aliyun.tea.*;
import com.aliyun.csas20230120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "csas.aliyuncs.com"),
            new TeaPair("public", "csas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("csas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>Appends associated terminal devices to a static device label in batches.</p>
     * 
     * @param request AddDeviceGroupMatchDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDeviceGroupMatchDevicesResponse
     */
    public AddDeviceGroupMatchDevicesResponse addDeviceGroupMatchDevicesWithOptions(AddDeviceGroupMatchDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTags)) {
            bodyFlat.put("DevTags", request.devTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            body.put("DeviceGroupId", request.deviceGroupId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDeviceGroupMatchDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceGroupMatchDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Appends associated terminal devices to a static device label in batches.</p>
     * 
     * @param request AddDeviceGroupMatchDevicesRequest
     * @return AddDeviceGroupMatchDevicesResponse
     */
    public AddDeviceGroupMatchDevicesResponse addDeviceGroupMatchDevices(AddDeviceGroupMatchDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceGroupMatchDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Appends entries in batches to the virus scan blacklists and whitelists for a specified operating system without overwriting existing entries. Quotas are calculated independently for each combination of matching dimension and list type. Each combination allows a maximum of 10,000 whitelist entries and 1,000 blacklist entries. If the quota is exceeded after appending, the entire batch fails.</p>
     * 
     * @param request AddVirusScanAdditionalListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVirusScanAdditionalListsResponse
     */
    public AddVirusScanAdditionalListsResponse addVirusScanAdditionalListsWithOptions(AddVirusScanAdditionalListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalLists)) {
            bodyFlat.put("AdditionalLists", request.additionalLists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devType)) {
            body.put("DevType", request.devType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVirusScanAdditionalLists"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVirusScanAdditionalListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Appends entries in batches to the virus scan blacklists and whitelists for a specified operating system without overwriting existing entries. Quotas are calculated independently for each combination of matching dimension and list type. Each combination allows a maximum of 10,000 whitelist entries and 1,000 blacklist entries. If the quota is exceeded after appending, the entire batch fails.</p>
     * 
     * @param request AddVirusScanAdditionalListsRequest
     * @return AddVirusScanAdditionalListsResponse
     */
    public AddVirusScanAdditionalListsResponse addVirusScanAdditionalLists(AddVirusScanAdditionalListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVirusScanAdditionalListsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches the private access applications of a Connector under the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq AttachApplication2ConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachApplication2ConnectorResponse
     */
    public AttachApplication2ConnectorResponse attachApplication2ConnectorWithOptions(AttachApplication2ConnectorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachApplication2ConnectorShrinkRequest request = new AttachApplication2ConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationIds)) {
            request.applicationIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationIds, "ApplicationIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIdsShrink)) {
            body.put("ApplicationIds", request.applicationIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachApplication2Connector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachApplication2ConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches the private access applications of a Connector under the current Alibaba Cloud account.</p>
     * 
     * @param request AttachApplication2ConnectorRequest
     * @return AttachApplication2ConnectorResponse
     */
    public AttachApplication2ConnectorResponse attachApplication2Connector(AttachApplication2ConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachApplication2ConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a business policy to a specified approval process.</p>
     * 
     * @param request AttachPolicy2ApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachPolicy2ApprovalProcessResponse
     */
    public AttachPolicy2ApprovalProcessResponse attachPolicy2ApprovalProcessWithOptions(AttachPolicy2ApprovalProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            body.put("ProcessId", request.processId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachPolicy2ApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachPolicy2ApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a business policy to a specified approval process.</p>
     * 
     * @param request AttachPolicy2ApprovalProcessRequest
     * @return AttachPolicy2ApprovalProcessResponse
     */
    public AttachPolicy2ApprovalProcessResponse attachPolicy2ApprovalProcess(AttachPolicy2ApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachPolicy2ApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Appends domain name entries in batches to a specified domain name list (<code>ListId</code>). Domain names must be second-level or higher domain names. Wildcard domain names (<code>*.example.com</code>) are supported, but overly broad patterns such as <code>*.com</code> or <code>*.com.cn</code> are prohibited.</p>
     * 
     * <b>summary</b> : 
     * <p>Inserts domain name entries into a domain name list in batches.</p>
     * 
     * @param request BatchCreateDomainItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateDomainItemsResponse
     */
    public BatchCreateDomainItemsResponse batchCreateDomainItemsWithOptions(BatchCreateDomainItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainItems)) {
            bodyFlat.put("DomainItems", request.domainItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listId)) {
            body.put("ListId", request.listId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            body.put("ListType", request.listType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateDomainItems"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateDomainItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Appends domain name entries in batches to a specified domain name list (<code>ListId</code>). Domain names must be second-level or higher domain names. Wildcard domain names (<code>*.example.com</code>) are supported, but overly broad patterns such as <code>*.com</code> or <code>*.com.cn</code> are prohibited.</p>
     * 
     * <b>summary</b> : 
     * <p>Inserts domain name entries into a domain name list in batches.</p>
     * 
     * @param request BatchCreateDomainItemsRequest
     * @return BatchCreateDomainItemsResponse
     */
    public BatchCreateDomainItemsResponse batchCreateDomainItems(BatchCreateDomainItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateDomainItemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Batch deletes domain name entries from a specified domain name list by entry IDs (<code>ItemIds</code>, obtained from the <code>ItemId</code> field returned by ListDomainItems).</p>
     * 
     * <b>summary</b> : 
     * <p>Batch deletes domain name entries from a domain name list.</p>
     * 
     * @param request BatchDeleteDomainItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteDomainItemsResponse
     */
    public BatchDeleteDomainItemsResponse batchDeleteDomainItemsWithOptions(BatchDeleteDomainItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemIds)) {
            bodyFlat.put("ItemIds", request.itemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listId)) {
            body.put("ListId", request.listId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            body.put("ListType", request.listType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDomainItems"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDomainItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Batch deletes domain name entries from a specified domain name list by entry IDs (<code>ItemIds</code>, obtained from the <code>ItemId</code> field returned by ListDomainItems).</p>
     * 
     * <b>summary</b> : 
     * <p>Batch deletes domain name entries from a domain name list.</p>
     * 
     * @param request BatchDeleteDomainItemsRequest
     * @return BatchDeleteDomainItemsResponse
     */
    public BatchDeleteDomainItemsResponse batchDeleteDomainItems(BatchDeleteDomainItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDomainItemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Applications that are referenced by office network recognition or policies cannot be deleted. References:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal-facing access applications in batches.</li>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Lists internal-facing access policies in batches.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes internal-facing applications in batches.</p>
     * 
     * @param request BatchDeletePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeletePrivateAccessApplicationResponse
     */
    public BatchDeletePrivateAccessApplicationResponse batchDeletePrivateAccessApplicationWithOptions(BatchDeletePrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeletePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeletePrivateAccessApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Applications that are referenced by office network recognition or policies cannot be deleted. References:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal-facing access applications in batches.</li>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Lists internal-facing access policies in batches.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes internal-facing applications in batches.</p>
     * 
     * @param request BatchDeletePrivateAccessApplicationRequest
     * @return BatchDeletePrivateAccessApplicationResponse
     */
    public BatchDeletePrivateAccessApplicationResponse batchDeletePrivateAccessApplication(BatchDeletePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeletePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes internal network access policies in batches.</p>
     * 
     * @param request BatchDeletePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeletePrivateAccessPolicyResponse
     */
    public BatchDeletePrivateAccessPolicyResponse batchDeletePrivateAccessPolicyWithOptions(BatchDeletePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIds)) {
            bodyFlat.put("PolicyIds", request.policyIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeletePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeletePrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes internal network access policies in batches.</p>
     * 
     * @param request BatchDeletePrivateAccessPolicyRequest
     * @return BatchDeletePrivateAccessPolicyResponse
     */
    public BatchDeletePrivateAccessPolicyResponse batchDeletePrivateAccessPolicy(BatchDeletePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeletePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels multiple virus scan tasks that have not yet expired in a batch. After cancellation, terminals no longer pull and execute the tasks. Scans already running on terminals are not interrupted.</p>
     * 
     * @param request CancelVirusScanTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelVirusScanTasksResponse
     */
    public CancelVirusScanTasksResponse cancelVirusScanTasksWithOptions(CancelVirusScanTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            bodyFlat.put("TaskIds", request.taskIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelVirusScanTasks"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelVirusScanTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels multiple virus scan tasks that have not yet expired in a batch. After cancellation, terminals no longer pull and execute the tasks. Scans already running on terminals are not interrupted.</p>
     * 
     * @param request CancelVirusScanTasksRequest
     * @return CancelVirusScanTasksResponse
     */
    public CancelVirusScanTasksResponse cancelVirusScanTasks(CancelVirusScanTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelVirusScanTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels multiple vulnerability scanning tasks that have not yet expired in a batch.</p>
     * 
     * @param request CancelVulScanTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelVulScanTasksResponse
     */
    public CancelVulScanTasksResponse cancelVulScanTasksWithOptions(CancelVulScanTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            bodyFlat.put("TaskIds", request.taskIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelVulScanTasks"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelVulScanTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels multiple vulnerability scanning tasks that have not yet expired in a batch.</p>
     * 
     * @param request CancelVulScanTasksRequest
     * @return CancelVulScanTasksResponse
     */
    public CancelVulScanTasksResponse cancelVulScanTasks(CancelVulScanTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelVulScanTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an approval flow under the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq CreateApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApprovalProcessResponse
     */
    public CreateApprovalProcessResponse createApprovalProcessWithOptions(CreateApprovalProcessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApprovalProcessShrinkRequest request = new CreateApprovalProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchSchemas)) {
            request.matchSchemasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchSchemas, "MatchSchemas", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchSchemasShrink)) {
            body.put("MatchSchemas", request.matchSchemasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            body.put("ProcessName", request.processName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processNodes)) {
            bodyFlat.put("ProcessNodes", request.processNodes);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an approval flow under the current Alibaba Cloud account.</p>
     * 
     * @param request CreateApprovalProcessRequest
     * @return CreateApprovalProcessResponse
     */
    public CreateApprovalProcessResponse createApprovalProcess(CreateApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a custom identity source user for your Alibaba Cloud account.</p>
     * 
     * @param request CreateClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientUserResponse
     */
    public CreateClientUserResponse createClientUserWithOptions(CreateClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a custom identity source user for your Alibaba Cloud account.</p>
     * 
     * @param request CreateClientUserRequest
     * @return CreateClientUserResponse
     */
    public CreateClientUserResponse createClientUser(CreateClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a connector.</p>
     * 
     * @param request CreateConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConnectorResponse
     */
    public CreateConnectorResponse createConnectorWithOptions(CreateConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchStatus)) {
            body.put("SwitchStatus", request.switchStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConnector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a connector.</p>
     * 
     * @param request CreateConnectorRequest
     * @return CreateConnectorResponse
     */
    public CreateConnectorResponse createConnector(CreateConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a device label.</p>
     * 
     * @param tmpReq CreateDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeviceGroupResponse
     */
    public CreateDeviceGroupResponse createDeviceGroupWithOptions(CreateDeviceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDeviceGroupShrinkRequest request = new CreateDeviceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dynamicRule)) {
            request.dynamicRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dynamicRule, "DynamicRule", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicOperator)) {
            body.put("DynamicOperator", request.dynamicOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRuleShrink)) {
            body.put("DynamicRule", request.dynamicRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            body.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a device label.</p>
     * 
     * @param request CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     */
    public CreateDeviceGroupResponse createDeviceGroup(CreateDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a domain name list of a specified type (blacklist or whitelist) under the current tenant and returns the ListId of the new list. A maximum of 100 lists can be created for each list type per tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain name list.</p>
     * 
     * @param request CreateDomainMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainMetaResponse
     */
    public CreateDomainMetaResponse createDomainMetaWithOptions(CreateDomainMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            body.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomainMeta"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a domain name list of a specified type (blacklist or whitelist) under the current tenant and returns the ListId of the new list. A maximum of 100 lists can be created for each list type per tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain name list.</p>
     * 
     * @param request CreateDomainMetaRequest
     * @return CreateDomainMetaResponse
     */
    public CreateDomainMetaResponse createDomainMeta(CreateDomainMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, you can create a maximum of 100 dynamic routes.</p>
     * 
     * <b>summary</b> : 
     * <p>Create dynamic routes for the current Alibaba Cloud account.</p>
     * 
     * @param request CreateDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDynamicRouteResponse
     */
    public CreateDynamicRouteResponse createDynamicRouteWithOptions(CreateDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteType)) {
            body.put("DynamicRouteType", request.dynamicRouteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            body.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIds)) {
            bodyFlat.put("RegionIds", request.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDynamicRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, you can create a maximum of 100 dynamic routes.</p>
     * 
     * <b>summary</b> : 
     * <p>Create dynamic routes for the current Alibaba Cloud account.</p>
     * 
     * @param request CreateDynamicRouteRequest
     * @return CreateDynamicRouteResponse
     */
    public CreateDynamicRouteResponse createDynamicRoute(CreateDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an enterprise acceleration policy.</p>
     * 
     * @param request CreateEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseAcceleratePolicyResponse
     */
    public CreateEnterpriseAcceleratePolicyResponse createEnterpriseAcceleratePolicyWithOptions(CreateEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerationType)) {
            body.put("AccelerationType", request.accelerationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showInClient)) {
            body.put("ShowInClient", request.showInClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamHost)) {
            body.put("UpstreamHost", request.upstreamHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamPort)) {
            body.put("UpstreamPort", request.upstreamPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamType)) {
            body.put("UpstreamType", request.upstreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAttributeGroup)) {
            body.put("UserAttributeGroup", request.userAttributeGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an enterprise acceleration policy.</p>
     * 
     * @param request CreateEnterpriseAcceleratePolicyRequest
     * @return CreateEnterpriseAcceleratePolicyResponse
     */
    public CreateEnterpriseAcceleratePolicyResponse createEnterpriseAcceleratePolicy(CreateEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an enterprise acceleration address.</p>
     * 
     * @param request CreateEnterpriseAccelerateTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseAccelerateTargetResponse
     */
    public CreateEnterpriseAccelerateTargetResponse createEnterpriseAccelerateTargetWithOptions(CreateEnterpriseAccelerateTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            bodyFlat.put("Target", request.target);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterpriseAccelerateTarget"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseAccelerateTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an enterprise acceleration address.</p>
     * 
     * @param request CreateEnterpriseAccelerateTargetRequest
     * @return CreateEnterpriseAccelerateTargetResponse
     */
    public CreateEnterpriseAccelerateTargetResponse createEnterpriseAccelerateTarget(CreateEnterpriseAccelerateTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnterpriseAccelerateTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a traffic forwarding rule.</p>
     * 
     * @param request CreateForwardStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateForwardStrategyResponse
     */
    public CreateForwardStrategyResponse createForwardStrategyWithOptions(CreateForwardStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationId)) {
            body.put("DestinationId", request.destinationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            body.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForwardStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForwardStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a traffic forwarding rule.</p>
     * 
     * @param request CreateForwardStrategyRequest
     * @return CreateForwardStrategyResponse
     */
    public CreateForwardStrategyResponse createForwardStrategy(CreateForwardStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a department for a custom identity source in the current Alibaba Cloud account.</p>
     * 
     * @param request CreateIdpDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdpDepartmentResponse
     */
    public CreateIdpDepartmentResponse createIdpDepartmentWithOptions(CreateIdpDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentName)) {
            query.put("DepartmentName", request.departmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdpDepartment"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdpDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a department for a custom identity source in the current Alibaba Cloud account.</p>
     * 
     * @param request CreateIdpDepartmentRequest
     * @return CreateIdpDepartmentResponse
     */
    public CreateIdpDepartmentResponse createIdpDepartment(CreateIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a diagnostic task for internal network access.</p>
     * 
     * @param tmpReq CreatePADiagnosisTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePADiagnosisTaskResponse
     */
    public CreatePADiagnosisTaskResponse createPADiagnosisTaskWithOptions(CreatePADiagnosisTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePADiagnosisTaskShrinkRequest request = new CreatePADiagnosisTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.udpExtraConfigs)) {
            request.udpExtraConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.udpExtraConfigs, "UdpExtraConfigs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            body.put("DevTag", request.devTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diagnoseType)) {
            body.put("DiagnoseType", request.diagnoseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popId)) {
            body.put("PopId", request.popId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popMode)) {
            body.put("PopMode", request.popMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udpExtraConfigsShrink)) {
            body.put("UdpExtraConfigs", request.udpExtraConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePADiagnosisTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePADiagnosisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a diagnostic task for internal network access.</p>
     * 
     * @param request CreatePADiagnosisTaskRequest
     * @return CreatePADiagnosisTaskResponse
     */
    public CreatePADiagnosisTaskResponse createPADiagnosisTask(CreatePADiagnosisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPADiagnosisTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 500 internal-facing access applications by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an internal-facing access application under the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq CreatePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessApplicationResponse
     */
    public CreatePrivateAccessApplicationResponse createPrivateAccessApplicationWithOptions(CreatePrivateAccessApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePrivateAccessApplicationShrinkRequest request = new CreatePrivateAccessApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.l7Config)) {
            request.l7ConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.l7Config, "L7Config", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.unauthorizedAccessConfig)) {
            request.unauthorizedAccessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.unauthorizedAccessConfig, "UnauthorizedAccessConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressGroups)) {
            bodyFlat.put("AddressGroups", request.addressGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            bodyFlat.put("Addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserAccessStatus)) {
            body.put("BrowserAccessStatus", request.browserAccessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMode)) {
            body.put("ConfigMode", request.configMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ConfigShrink)) {
            body.put("L7Config", request.l7ConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainAutomaticPrefix)) {
            body.put("L7ProxyDomainAutomaticPrefix", request.l7ProxyDomainAutomaticPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainCustom)) {
            body.put("L7ProxyDomainCustom", request.l7ProxyDomainCustom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            bodyFlat.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unauthorizedAccessConfigShrink)) {
            body.put("UnauthorizedAccessConfig", request.unauthorizedAccessConfigShrink);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateAccessApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 500 internal-facing access applications by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an internal-facing access application under the current Alibaba Cloud account.</p>
     * 
     * @param request CreatePrivateAccessApplicationRequest
     * @return CreatePrivateAccessApplicationResponse
     */
    public CreatePrivateAccessApplicationResponse createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, up to 500 private access policies can be created.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Private Access Policy</p>
     * 
     * @param request CreatePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessPolicyResponse
     */
    public CreatePrivateAccessPolicyResponse createPrivateAccessPolicyWithOptions(CreatePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserAttributes)) {
            bodyFlat.put("CustomUserAttributes", request.customUserAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeAction)) {
            body.put("DeviceAttributeAction", request.deviceAttributeAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeId)) {
            body.put("DeviceAttributeId", request.deviceAttributeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyAction)) {
            body.put("PolicyAction", request.policyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTemplateId)) {
            body.put("TriggerTemplateId", request.triggerTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessGroupIds)) {
            bodyFlat.put("TrustedProcessGroupIds", request.trustedProcessGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessStatus)) {
            body.put("TrustedProcessStatus", request.trustedProcessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedSoftwareIds)) {
            bodyFlat.put("TrustedSoftwareIds", request.trustedSoftwareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupMode)) {
            body.put("UserGroupMode", request.userGroupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validFrom)) {
            body.put("ValidFrom", request.validFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTimeStatus)) {
            body.put("ValidTimeStatus", request.validTimeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validUntil)) {
            body.put("ValidUntil", request.validUntil);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, up to 500 private access policies can be created.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Private Access Policy</p>
     * 
     * @param request CreatePrivateAccessPolicyRequest
     * @return CreatePrivateAccessPolicyResponse
     */
    public CreatePrivateAccessPolicyResponse createPrivateAccessPolicy(CreatePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 500 internal-facing access tags by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an internal-facing access tag under the current Alibaba Cloud account.</p>
     * 
     * @param request CreatePrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessTagResponse
     */
    public CreatePrivateAccessTagResponse createPrivateAccessTagWithOptions(CreatePrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateAccessTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 500 internal-facing access tags by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an internal-facing access tag under the current Alibaba Cloud account.</p>
     * 
     * @param request CreatePrivateAccessTagRequest
     * @return CreatePrivateAccessTagResponse
     */
    public CreatePrivateAccessTagResponse createPrivateAccessTag(CreatePrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a software ban policy.</p>
     * 
     * @param request CreateProhibitedPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProhibitedPolicyResponse
     */
    public CreateProhibitedPolicyResponse createProhibitedPolicyWithOptions(CreateProhibitedPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowReport)) {
            body.put("AllowReport", request.allowReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceKill)) {
            body.put("ForceKill", request.forceKill);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextCh)) {
            body.put("MainButtonTextCh", request.mainButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextEn)) {
            body.put("MainButtonTextEn", request.mainButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextCh)) {
            body.put("MinorButtonTextCh", request.minorButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextEn)) {
            body.put("MinorButtonTextEn", request.minorButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptCh)) {
            body.put("PromptCh", request.promptCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptEn)) {
            body.put("PromptEn", request.promptEn);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.softwareIds)) {
            bodyFlat.put("SoftwareIds", request.softwareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.titleCh)) {
            body.put("TitleCh", request.titleCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.titleEn)) {
            body.put("TitleEn", request.titleEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProhibitedPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProhibitedPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a software ban policy.</p>
     * 
     * @param request CreateProhibitedPolicyRequest
     * @return CreateProhibitedPolicyResponse
     */
    public CreateProhibitedPolicyResponse createProhibitedPolicy(CreateProhibitedPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProhibitedPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom disabled software entry.</p>
     * 
     * @param request CreateProhibitedSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProhibitedSoftwareResponse
     */
    public CreateProhibitedSoftwareResponse createProhibitedSoftwareWithOptions(CreateProhibitedSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.linuxProcesses)) {
            bodyFlat.put("LinuxProcesses", request.linuxProcesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macOSProcesses)) {
            bodyFlat.put("MacOSProcesses", request.macOSProcesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.windowsProcesses)) {
            bodyFlat.put("WindowsProcesses", request.windowsProcesses);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProhibitedSoftware"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProhibitedSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom disabled software entry.</p>
     * 
     * @param request CreateProhibitedSoftwareRequest
     * @return CreateProhibitedSoftwareResponse
     */
    public CreateProhibitedSoftwareResponse createProhibitedSoftware(CreateProhibitedSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProhibitedSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom disabled software tag.</p>
     * 
     * @param request CreateProhibitedTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProhibitedTagResponse
     */
    public CreateProhibitedTagResponse createProhibitedTagWithOptions(CreateProhibitedTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProhibitedTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProhibitedTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom disabled software tag.</p>
     * 
     * @param request CreateProhibitedTagRequest
     * @return CreateProhibitedTagResponse
     */
    public CreateProhibitedTagResponse createProhibitedTag(CreateProhibitedTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProhibitedTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a device registration policy for your Alibaba Cloud account.</p>
     * 
     * @param tmpReq CreateRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRegistrationPolicyResponse
     */
    public CreateRegistrationPolicyResponse createRegistrationPolicyWithOptions(CreateRegistrationPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRegistrationPolicyShrinkRequest request = new CreateRegistrationPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyLimitCount)) {
            request.companyLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyLimitCount, "CompanyLimitCount", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personalLimitCount)) {
            request.personalLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personalLimitCount, "PersonalLimitCount", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitCountShrink)) {
            body.put("CompanyLimitCount", request.companyLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitType)) {
            body.put("CompanyLimitType", request.companyLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitCountShrink)) {
            body.put("PersonalLimitCount", request.personalLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitType)) {
            body.put("PersonalLimitType", request.personalLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRegistrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a device registration policy for your Alibaba Cloud account.</p>
     * 
     * @param request CreateRegistrationPolicyRequest
     * @return CreateRegistrationPolicyResponse
     */
    public CreateRegistrationPolicyResponse createRegistrationPolicy(CreateRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 500 user groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user group for your Alibaba Cloud account.</p>
     * 
     * @param request CreateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            bodyFlat.put("Attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 500 user groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user group for your Alibaba Cloud account.</p>
     * 
     * @param request CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled virus scan policy that automatically sends scan tasks to user terminal devices within the effective scope based on the configured cycle.</p>
     * 
     * @param request CreateVirusScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirusScanScheduledStrategyResponse
     */
    public CreateVirusScanScheduledStrategyResponse createVirusScanScheduledStrategyWithOptions(CreateVirusScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.highRiskOperation)) {
            body.put("HighRiskOperation", request.highRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowRiskOperation)) {
            body.put("LowRiskOperation", request.lowRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCpuUsage)) {
            body.put("MaxCpuUsage", request.maxCpuUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.midRiskOperation)) {
            body.put("MidRiskOperation", request.midRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.performanceMode)) {
            body.put("PerformanceMode", request.performanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanBeginTime)) {
            body.put("ScanBeginTime", request.scanBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanEndTime)) {
            body.put("ScanEndTime", request.scanEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanFrequency)) {
            body.put("ScanFrequency", request.scanFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanInterval)) {
            body.put("ScanInterval", request.scanInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanMode)) {
            body.put("ScanMode", request.scanMode);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scanPath)) {
            bodyFlat.put("ScanPath", request.scanPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanTargets)) {
            bodyFlat.put("ScanTargets", request.scanTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyDescription)) {
            body.put("StrategyDescription", request.strategyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            body.put("StrategyName", request.strategyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirusScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirusScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled virus scan policy that automatically sends scan tasks to user terminal devices within the effective scope based on the configured cycle.</p>
     * 
     * @param request CreateVirusScanScheduledStrategyRequest
     * @return CreateVirusScanScheduledStrategyResponse
     */
    public CreateVirusScanScheduledStrategyResponse createVirusScanScheduledStrategy(CreateVirusScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirusScanScheduledStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instant virus scan task and delivers it to user endpoint devices within the effective scope. The task takes effect immediately after creation. A maximum of 10 tasks can be created per Alibaba Cloud account per minute.</p>
     * 
     * @param request CreateVirusScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirusScanTaskResponse
     */
    public CreateVirusScanTaskResponse createVirusScanTaskWithOptions(CreateVirusScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.highRiskOperation)) {
            body.put("HighRiskOperation", request.highRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowRiskOperation)) {
            body.put("LowRiskOperation", request.lowRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCpuUsage)) {
            body.put("MaxCpuUsage", request.maxCpuUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.midRiskOperation)) {
            body.put("MidRiskOperation", request.midRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.performanceMode)) {
            body.put("PerformanceMode", request.performanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanMode)) {
            body.put("ScanMode", request.scanMode);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scanPath)) {
            bodyFlat.put("ScanPath", request.scanPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanTargets)) {
            bodyFlat.put("ScanTargets", request.scanTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("TaskDescription", request.taskDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirusScanTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirusScanTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instant virus scan task and delivers it to user endpoint devices within the effective scope. The task takes effect immediately after creation. A maximum of 10 tasks can be created per Alibaba Cloud account per minute.</p>
     * 
     * @param request CreateVirusScanTaskRequest
     * @return CreateVirusScanTaskResponse
     */
    public CreateVirusScanTaskResponse createVirusScanTask(CreateVirusScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirusScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled vulnerability scanning policy that automatically sends vulnerability scanning tasks to user endpoint devices within the effective scope based on the configured cycle.</p>
     * 
     * @param request CreateVulScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVulScanScheduledStrategyResponse
     */
    public CreateVulScanScheduledStrategyResponse createVulScanScheduledStrategyWithOptions(CreateVulScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanBeginTime)) {
            body.put("ScanBeginTime", request.scanBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanEndTime)) {
            body.put("ScanEndTime", request.scanEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanFrequency)) {
            body.put("ScanFrequency", request.scanFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanInterval)) {
            body.put("ScanInterval", request.scanInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyDescription)) {
            body.put("StrategyDescription", request.strategyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            body.put("StrategyName", request.strategyName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVulScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVulScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled vulnerability scanning policy that automatically sends vulnerability scanning tasks to user endpoint devices within the effective scope based on the configured cycle.</p>
     * 
     * @param request CreateVulScanScheduledStrategyRequest
     * @return CreateVulScanScheduledStrategyResponse
     */
    public CreateVulScanScheduledStrategyResponse createVulScanScheduledStrategy(CreateVulScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVulScanScheduledStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instant vulnerability scanning task and delivers it to user endpoint devices within the effective scope.</p>
     * 
     * @param request CreateVulScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVulScanTaskResponse
     */
    public CreateVulScanTaskResponse createVulScanTaskWithOptions(CreateVulScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            body.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("TaskDescription", request.taskDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVulScanTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVulScanTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instant vulnerability scanning task and delivers it to user endpoint devices within the effective scope.</p>
     * 
     * @param request CreateVulScanTaskRequest
     * @return CreateVulScanTaskResponse
     */
    public CreateVulScanTaskResponse createVulScanTask(CreateVulScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVulScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vulnerability fix task that delivers the patch for a specified vulnerability to user endpoint devices and performs the installation.</p>
     * 
     * @param tmpReq CreateVulnerabilityFixTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVulnerabilityFixTaskResponse
     */
    public CreateVulnerabilityFixTaskResponse createVulnerabilityFixTaskWithOptions(CreateVulnerabilityFixTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVulnerabilityFixTaskShrinkRequest request = new CreateVulnerabilityFixTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.wuyingVulFixConfig)) {
            request.wuyingVulFixConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.wuyingVulFixConfig, "WuyingVulFixConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTags)) {
            bodyFlat.put("DevTags", request.devTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixMode)) {
            body.put("FixMode", request.fixMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDownloadSpeed)) {
            body.put("MaxDownloadSpeed", request.maxDownloadSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateId)) {
            body.put("UpdateId", request.updateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingVulFixConfigShrink)) {
            body.put("WuyingVulFixConfig", request.wuyingVulFixConfigShrink);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVulnerabilityFixTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVulnerabilityFixTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vulnerability fix task that delivers the patch for a specified vulnerability to user endpoint devices and performs the installation.</p>
     * 
     * @param request CreateVulnerabilityFixTaskRequest
     * @return CreateVulnerabilityFixTaskResponse
     */
    public CreateVulnerabilityFixTaskResponse createVulnerabilityFixTask(CreateVulnerabilityFixTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVulnerabilityFixTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the invisible watermark transparent background image for web watermarks, screen watermarks, and App watermarks.</p>
     * 
     * @param tmpReq CreateWmBaseImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmBaseImageResponse
     */
    public CreateWmBaseImageResponse createWmBaseImageWithOptions(CreateWmBaseImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWmBaseImageShrinkRequest request = new CreateWmBaseImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageControl)) {
            request.imageControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageControl, "ImageControl", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("comment", request.comment);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageControlShrink)) {
            body.put("ImageControl", request.imageControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opacity)) {
            body.put("Opacity", request.opacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scale)) {
            body.put("Scale", request.scale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("Width", request.width);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoBytesB64)) {
            body.put("WmInfoBytesB64", request.wmInfoBytesB64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoUint)) {
            body.put("WmInfoUint", request.wmInfoUint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmBaseImage"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmBaseImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the invisible watermark transparent background image for web watermarks, screen watermarks, and App watermarks.</p>
     * 
     * @param request CreateWmBaseImageRequest
     * @return CreateWmBaseImageResponse
     */
    public CreateWmBaseImageResponse createWmBaseImage(CreateWmBaseImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmBaseImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create a maximum of 500 user groups by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a digital watermarking embedding task.</p>
     * 
     * @param tmpReq CreateWmEmbedTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmEmbedTaskResponse
     */
    public CreateWmEmbedTaskResponse createWmEmbedTaskWithOptions(CreateWmEmbedTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWmEmbedTaskShrinkRequest request = new CreateWmEmbedTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.audioControl)) {
            request.audioControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.audioControl, "AudioControl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.csvControl)) {
            request.csvControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.csvControl, "CsvControl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentControl)) {
            request.documentControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentControl, "DocumentControl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageControl)) {
            request.imageControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageControl, "ImageControl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoControl)) {
            request.videoControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoControl, "VideoControl", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioControlShrink)) {
            body.put("AudioControl", request.audioControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csvControlShrink)) {
            body.put("CsvControl", request.csvControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentControlShrink)) {
            body.put("DocumentControl", request.documentControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            body.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageControlShrink)) {
            body.put("ImageControl", request.imageControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageEmbedJpegQuality)) {
            body.put("ImageEmbedJpegQuality", request.imageEmbedJpegQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageEmbedLevel)) {
            body.put("ImageEmbedLevel", request.imageEmbedLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invisibleEnable)) {
            body.put("InvisibleEnable", request.invisibleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoBitrate)) {
            body.put("VideoBitrate", request.videoBitrate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoControlShrink)) {
            body.put("VideoControl", request.videoControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoIsLong)) {
            body.put("VideoIsLong", request.videoIsLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoBytesB64)) {
            body.put("WmInfoBytesB64", request.wmInfoBytesB64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoUint)) {
            body.put("WmInfoUint", request.wmInfoUint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmEmbedTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmEmbedTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create a maximum of 500 user groups by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a digital watermarking embedding task.</p>
     * 
     * @param request CreateWmEmbedTaskRequest
     * @return CreateWmEmbedTaskResponse
     */
    public CreateWmEmbedTaskResponse createWmEmbedTask(CreateWmEmbedTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmEmbedTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a digital watermarking extraction task.</p>
     * 
     * @param tmpReq CreateWmExtractTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmExtractTaskResponse
     */
    public CreateWmExtractTaskResponse createWmExtractTaskWithOptions(CreateWmExtractTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWmExtractTaskShrinkRequest request = new CreateWmExtractTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.csvControl)) {
            request.csvControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.csvControl, "CsvControl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageExtractParamsOpenApi)) {
            request.imageExtractParamsOpenApiShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageExtractParamsOpenApi, "ImageExtractParamsOpenApi", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csvControlShrink)) {
            query.put("CsvControl", request.csvControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageExtractParamsOpenApiShrink)) {
            query.put("ImageExtractParamsOpenApi", request.imageExtractParamsOpenApiShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isClientEmbed)) {
            query.put("IsClientEmbed", request.isClientEmbed);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIsCapture)) {
            body.put("DocumentIsCapture", request.documentIsCapture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            body.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoIsLong)) {
            body.put("VideoIsLong", request.videoIsLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoSpeed)) {
            body.put("VideoSpeed", request.videoSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmExtractTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmExtractTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a digital watermarking extraction task.</p>
     * 
     * @param request CreateWmExtractTaskRequest
     * @return CreateWmExtractTaskResponse
     */
    public CreateWmExtractTaskResponse createWmExtractTask(CreateWmExtractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmExtractTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a mapping from string-format watermark information to digital-format watermark information.</p>
     * 
     * @param request CreateWmInfoMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmInfoMappingResponse
     */
    public CreateWmInfoMappingResponse createWmInfoMappingWithOptions(CreateWmInfoMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoBytesB64)) {
            body.put("WmInfoBytesB64", request.wmInfoBytesB64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmInfoMapping"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmInfoMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a mapping from string-format watermark information to digital-format watermark information.</p>
     * 
     * @param request CreateWmInfoMappingRequest
     * @return CreateWmInfoMappingResponse
     */
    public CreateWmInfoMappingResponse createWmInfoMapping(CreateWmInfoMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmInfoMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes approval processes in batches from your Alibaba Cloud account.</p>
     * 
     * @param request DeleteApprovalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApprovalProcessesResponse
     */
    public DeleteApprovalProcessesResponse deleteApprovalProcessesWithOptions(DeleteApprovalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processIds)) {
            bodyFlat.put("ProcessIds", request.processIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApprovalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApprovalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes approval processes in batches from your Alibaba Cloud account.</p>
     * 
     * @param request DeleteApprovalProcessesRequest
     * @return DeleteApprovalProcessesResponse
     */
    public DeleteApprovalProcessesResponse deleteApprovalProcesses(DeleteApprovalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApprovalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a specified user from your Alibaba Cloud account\&quot;s custom identity source.</p>
     * 
     * @param request DeleteClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientUserResponse
     */
    public DeleteClientUserResponse deleteClientUserWithOptions(DeleteClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a specified user from your Alibaba Cloud account\&quot;s custom identity source.</p>
     * 
     * @param request DeleteClientUserRequest
     * @return DeleteClientUserResponse
     */
    public DeleteClientUserResponse deleteClientUser(DeleteClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a connector.</p>
     * 
     * @param request DeleteConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectorResponse
     */
    public DeleteConnectorResponse deleteConnectorWithOptions(DeleteConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a connector.</p>
     * 
     * @param request DeleteConnectorRequest
     * @return DeleteConnectorResponse
     */
    public DeleteConnectorResponse deleteConnector(DeleteConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a ConnectorClient under the current Alibaba Cloud account.</p>
     * 
     * @param request DeleteConnectorClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectorClientResponse
     */
    public DeleteConnectorClientResponse deleteConnectorClientWithOptions(DeleteConnectorClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            body.put("DevTag", request.devTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnectorClient"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectorClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a ConnectorClient under the current Alibaba Cloud account.</p>
     * 
     * @param request DeleteConnectorClientRequest
     * @return DeleteConnectorClientResponse
     */
    public DeleteConnectorClientResponse deleteConnectorClient(DeleteConnectorClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectorClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes instance tags in batches.</p>
     * 
     * @param request DeleteDeviceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeviceGroupsResponse
     */
    public DeleteDeviceGroupsResponse deleteDeviceGroupsWithOptions(DeleteDeviceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupIds)) {
            bodyFlat.put("DeviceGroupIds", request.deviceGroupIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceGroups"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes instance tags in batches.</p>
     * 
     * @param request DeleteDeviceGroupsRequest
     * @return DeleteDeviceGroupsResponse
     */
    public DeleteDeviceGroupsResponse deleteDeviceGroups(DeleteDeviceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes detection records of a specified vulnerability from specified user endpoint devices in batches.</p>
     * 
     * @param request DeleteDevicesVulnerabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDevicesVulnerabilityResponse
     */
    public DeleteDevicesVulnerabilityResponse deleteDevicesVulnerabilityWithOptions(DeleteDevicesVulnerabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTags)) {
            bodyFlat.put("DevTags", request.devTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateId)) {
            body.put("UpdateId", request.updateId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevicesVulnerability"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDevicesVulnerabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes detection records of a specified vulnerability from specified user endpoint devices in batches.</p>
     * 
     * @param request DeleteDevicesVulnerabilityRequest
     * @return DeleteDevicesVulnerabilityResponse
     */
    public DeleteDevicesVulnerabilityResponse deleteDevicesVulnerability(DeleteDevicesVulnerabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDevicesVulnerabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified domain name list under the current tenant. Before deletion, the system checks whether any domain name policy references the list. If a reference exists, the deletion is rejected.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a domain name list.</p>
     * 
     * @param request DeleteDomainMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainMetaResponse
     */
    public DeleteDomainMetaResponse deleteDomainMetaWithOptions(DeleteDomainMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listId)) {
            body.put("ListId", request.listId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            body.put("ListType", request.listType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainMeta"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified domain name list under the current tenant. Before deletion, the system checks whether any domain name policy references the list. If a reference exists, the deletion is rejected.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a domain name list.</p>
     * 
     * @param request DeleteDomainMetaRequest
     * @return DeleteDomainMetaResponse
     */
    public DeleteDomainMetaResponse deleteDomainMeta(DeleteDomainMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a dynamic route from your current Alibaba Cloud account.</p>
     * 
     * @param request DeleteDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDynamicRouteResponse
     */
    public DeleteDynamicRouteResponse deleteDynamicRouteWithOptions(DeleteDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteId)) {
            query.put("DynamicRouteId", request.dynamicRouteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDynamicRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a dynamic route from your current Alibaba Cloud account.</p>
     * 
     * @param request DeleteDynamicRouteRequest
     * @return DeleteDynamicRouteResponse
     */
    public DeleteDynamicRouteResponse deleteDynamicRoute(DeleteDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an enterprise acceleration policy.</p>
     * 
     * @param request DeleteEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseAcceleratePolicyResponse
     */
    public DeleteEnterpriseAcceleratePolicyResponse deleteEnterpriseAcceleratePolicyWithOptions(DeleteEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an enterprise acceleration policy.</p>
     * 
     * @param request DeleteEnterpriseAcceleratePolicyRequest
     * @return DeleteEnterpriseAcceleratePolicyResponse
     */
    public DeleteEnterpriseAcceleratePolicyResponse deleteEnterpriseAcceleratePolicy(DeleteEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes enterprise acceleration addresses.</p>
     * 
     * @param request DeleteEnterpriseAccelerateTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseAccelerateTargetResponse
     */
    public DeleteEnterpriseAccelerateTargetResponse deleteEnterpriseAccelerateTargetWithOptions(DeleteEnterpriseAccelerateTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            bodyFlat.put("Target", request.target);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseAccelerateTarget"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseAccelerateTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes enterprise acceleration addresses.</p>
     * 
     * @param request DeleteEnterpriseAccelerateTargetRequest
     * @return DeleteEnterpriseAccelerateTargetResponse
     */
    public DeleteEnterpriseAccelerateTargetResponse deleteEnterpriseAccelerateTarget(DeleteEnterpriseAccelerateTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseAccelerateTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a forwarding rule.</p>
     * 
     * @param request DeleteForwardStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteForwardStrategyResponse
     */
    public DeleteForwardStrategyResponse deleteForwardStrategyWithOptions(DeleteForwardStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardId)) {
            body.put("ForwardId", request.forwardId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteForwardStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteForwardStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a forwarding rule.</p>
     * 
     * @param request DeleteForwardStrategyRequest
     * @return DeleteForwardStrategyResponse
     */
    public DeleteForwardStrategyResponse deleteForwardStrategy(DeleteForwardStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a department from a custom identity provider in your Alibaba Cloud account.</p>
     * 
     * @param request DeleteIdpDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdpDepartmentResponse
     */
    public DeleteIdpDepartmentResponse deleteIdpDepartmentWithOptions(DeleteIdpDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdpDepartment"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdpDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a department from a custom identity provider in your Alibaba Cloud account.</p>
     * 
     * @param request DeleteIdpDepartmentRequest
     * @return DeleteIdpDepartmentResponse
     */
    public DeleteIdpDepartmentResponse deleteIdpDepartment(DeleteIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user\&quot;s One-Time Password (OTP) configuration.</p>
     * 
     * @param request DeleteOtpConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOtpConfigResponse
     */
    public DeleteOtpConfigResponse deleteOtpConfigWithOptions(DeleteOtpConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOtpConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOtpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user\&quot;s One-Time Password (OTP) configuration.</p>
     * 
     * @param request DeleteOtpConfigRequest
     * @return DeleteOtpConfigResponse
     */
    public DeleteOtpConfigResponse deleteOtpConfig(DeleteOtpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOtpConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete an application if it is referenced by an office zone or a policy. For more information, see:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal network access applications.</li>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolicies</a>: Lists internal network access policies.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an internal network access application from your Alibaba Cloud account.</p>
     * 
     * @param request DeletePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateAccessApplicationResponse
     */
    public DeletePrivateAccessApplicationResponse deletePrivateAccessApplicationWithOptions(DeletePrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateAccessApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete an application if it is referenced by an office zone or a policy. For more information, see:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal network access applications.</li>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolicies</a>: Lists internal network access policies.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an internal network access application from your Alibaba Cloud account.</p>
     * 
     * @param request DeletePrivateAccessApplicationRequest
     * @return DeletePrivateAccessApplicationResponse
     */
    public DeletePrivateAccessApplicationResponse deletePrivateAccessApplication(DeletePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a private network access policy for the current Alibaba Cloud account.</p>
     * 
     * @param request DeletePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateAccessPolicyResponse
     */
    public DeletePrivateAccessPolicyResponse deletePrivateAccessPolicyWithOptions(DeletePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a private network access policy for the current Alibaba Cloud account.</p>
     * 
     * @param request DeletePrivateAccessPolicyRequest
     * @return DeletePrivateAccessPolicyResponse
     */
    public DeletePrivateAccessPolicyResponse deletePrivateAccessPolicy(DeletePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletion is not allowed when the tag is referenced by applications, office networks, or policies. References:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal access applications.</li>
     * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Lists internal access tags.</li>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Lists internal access policies.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an internal access tag from the current Alibaba Cloud account.</p>
     * 
     * @param request DeletePrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateAccessTagResponse
     */
    public DeletePrivateAccessTagResponse deletePrivateAccessTagWithOptions(DeletePrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            body.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateAccessTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletion is not allowed when the tag is referenced by applications, office networks, or policies. References:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal access applications.</li>
     * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Lists internal access tags.</li>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Lists internal access policies.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an internal access tag from the current Alibaba Cloud account.</p>
     * 
     * @param request DeletePrivateAccessTagRequest
     * @return DeletePrivateAccessTagResponse
     */
    public DeletePrivateAccessTagResponse deletePrivateAccessTag(DeletePrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes software prohibition policies in batches.</p>
     * 
     * @param request DeleteProhibitedPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProhibitedPoliciesResponse
     */
    public DeleteProhibitedPoliciesResponse deleteProhibitedPoliciesWithOptions(DeleteProhibitedPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIds)) {
            bodyFlat.put("PolicyIds", request.policyIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProhibitedPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProhibitedPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes software prohibition policies in batches.</p>
     * 
     * @param request DeleteProhibitedPoliciesRequest
     * @return DeleteProhibitedPoliciesResponse
     */
    public DeleteProhibitedPoliciesResponse deleteProhibitedPolicies(DeleteProhibitedPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProhibitedPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom prohibited software in batches.</p>
     * 
     * @param request DeleteProhibitedSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProhibitedSoftwareResponse
     */
    public DeleteProhibitedSoftwareResponse deleteProhibitedSoftwareWithOptions(DeleteProhibitedSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.softwareIds)) {
            bodyFlat.put("SoftwareIds", request.softwareIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProhibitedSoftware"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProhibitedSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom prohibited software in batches.</p>
     * 
     * @param request DeleteProhibitedSoftwareRequest
     * @return DeleteProhibitedSoftwareResponse
     */
    public DeleteProhibitedSoftwareResponse deleteProhibitedSoftware(DeleteProhibitedSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProhibitedSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom prohibited software labels in batches.</p>
     * 
     * @param request DeleteProhibitedTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProhibitedTagsResponse
     */
    public DeleteProhibitedTagsResponse deleteProhibitedTagsWithOptions(DeleteProhibitedTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProhibitedTags"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProhibitedTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom prohibited software labels in batches.</p>
     * 
     * @param request DeleteProhibitedTagsRequest
     * @return DeleteProhibitedTagsResponse
     */
    public DeleteProhibitedTagsResponse deleteProhibitedTags(DeleteProhibitedTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProhibitedTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch delete device registration policies under your Alibaba Cloud account.</p>
     * 
     * @param request DeleteRegistrationPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistrationPoliciesResponse
     */
    public DeleteRegistrationPoliciesResponse deleteRegistrationPoliciesWithOptions(DeleteRegistrationPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIds)) {
            bodyFlat.put("PolicyIds", request.policyIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistrationPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistrationPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch delete device registration policies under your Alibaba Cloud account.</p>
     * 
     * @param request DeleteRegistrationPoliciesRequest
     * @return DeleteRegistrationPoliciesResponse
     */
    public DeleteRegistrationPoliciesResponse deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRegistrationPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete up to 100 devices at a time. Each device must be in a non-online status. If some device IDs in the specified collection do not meet the status requirement, only the devices that meet the requirement are deleted, and the operation still returns a success response.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes user endpoint devices in batches.</p>
     * 
     * @param request DeleteUserDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserDevicesResponse
     */
    public DeleteUserDevicesResponse deleteUserDevicesWithOptions(DeleteUserDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDevicesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete up to 100 devices at a time. Each device must be in a non-online status. If some device IDs in the specified collection do not meet the status requirement, only the devices that meet the requirement are deleted, and the operation still returns a success response.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes user endpoint devices in batches.</p>
     * 
     * @param request DeleteUserDevicesRequest
     * @return DeleteUserDevicesResponse
     */
    public DeleteUserDevicesResponse deleteUserDevices(DeleteUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information, see:</p>
     * <ul>
     * <li><a href="~~ListPolicesForUserGroup~~">ListPolicesForUserGroup</a>: Query policies attached to a user group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete a user group in your Alibaba Cloud account.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For more information, see:</p>
     * <ul>
     * <li><a href="~~ListPolicesForUserGroup~~">ListPolicesForUserGroup</a>: Query policies attached to a user group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete a user group in your Alibaba Cloud account.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virus file record that failed to be handled. Only records with a handling action of Fail can be deleted. This operation does not delete the actual file on the user\&quot;s endpoint device.</p>
     * 
     * @param request DeleteVirusFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirusFileResponse
     */
    public DeleteVirusFileResponse deleteVirusFileWithOptions(DeleteVirusFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            body.put("DevTag", request.devTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileMd5)) {
            body.put("FileMd5", request.fileMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirusFile"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirusFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virus file record that failed to be handled. Only records with a handling action of Fail can be deleted. This operation does not delete the actual file on the user\&quot;s endpoint device.</p>
     * 
     * @param request DeleteVirusFileRequest
     * @return DeleteVirusFileResponse
     */
    public DeleteVirusFileResponse deleteVirusFile(DeleteVirusFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirusFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes virus scheduled scan policies in batches. After deletion, no new scan tasks are triggered, but scan tasks that have already been dispatched are not affected. If any policy ID does not belong to the current Alibaba Cloud account, the entire deletion fails.</p>
     * 
     * @param request DeleteVirusScanScheduledStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirusScanScheduledStrategiesResponse
     */
    public DeleteVirusScanScheduledStrategiesResponse deleteVirusScanScheduledStrategiesWithOptions(DeleteVirusScanScheduledStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.strategyIds)) {
            bodyFlat.put("StrategyIds", request.strategyIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirusScanScheduledStrategies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirusScanScheduledStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes virus scheduled scan policies in batches. After deletion, no new scan tasks are triggered, but scan tasks that have already been dispatched are not affected. If any policy ID does not belong to the current Alibaba Cloud account, the entire deletion fails.</p>
     * 
     * @param request DeleteVirusScanScheduledStrategiesRequest
     * @return DeleteVirusScanScheduledStrategiesResponse
     */
    public DeleteVirusScanScheduledStrategiesResponse deleteVirusScanScheduledStrategies(DeleteVirusScanScheduledStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirusScanScheduledStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified scheduled vulnerability scanning policy.</p>
     * 
     * @param request DeleteVulScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVulScanScheduledStrategyResponse
     */
    public DeleteVulScanScheduledStrategyResponse deleteVulScanScheduledStrategyWithOptions(DeleteVulScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            body.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVulScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVulScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified scheduled vulnerability scanning policy.</p>
     * 
     * @param request DeleteVulScanScheduledStrategyRequest
     * @return DeleteVulScanScheduledStrategyResponse
     */
    public DeleteVulScanScheduledStrategyResponse deleteVulScanScheduledStrategy(DeleteVulScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVulScanScheduledStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches private network access applications from a Connector in your Alibaba Cloud account.</p>
     * 
     * @deprecated OpenAPI DetachApplication2Connector is deprecated, please use csas::2023-01-20::ModifyForwardStrategy instead.
     * 
     * @param tmpReq DetachApplication2ConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachApplication2ConnectorResponse
     */
    @Deprecated
    // Deprecated
    public DetachApplication2ConnectorResponse detachApplication2ConnectorWithOptions(DetachApplication2ConnectorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachApplication2ConnectorShrinkRequest request = new DetachApplication2ConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationIds)) {
            request.applicationIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationIds, "ApplicationIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIdsShrink)) {
            body.put("ApplicationIds", request.applicationIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachApplication2Connector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachApplication2ConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches private network access applications from a Connector in your Alibaba Cloud account.</p>
     * 
     * @deprecated OpenAPI DetachApplication2Connector is deprecated, please use csas::2023-01-20::ModifyForwardStrategy instead.
     * 
     * @param request DetachApplication2ConnectorRequest
     * @return DetachApplication2ConnectorResponse
     */
    @Deprecated
    // Deprecated
    public DetachApplication2ConnectorResponse detachApplication2Connector(DetachApplication2ConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachApplication2ConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detach a business policy from an approval process.</p>
     * 
     * @param request DetachPolicy2ApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachPolicy2ApprovalProcessResponse
     */
    public DetachPolicy2ApprovalProcessResponse detachPolicy2ApprovalProcessWithOptions(DetachPolicy2ApprovalProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            body.put("ProcessId", request.processId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachPolicy2ApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachPolicy2ApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detach a business policy from an approval process.</p>
     * 
     * @param request DetachPolicy2ApprovalProcessRequest
     * @return DetachPolicy2ApprovalProcessResponse
     */
    public DetachPolicy2ApprovalProcessResponse detachPolicy2ApprovalProcess(DetachPolicy2ApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachPolicy2ApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an enterprise acceleration policy.</p>
     * 
     * @param request DisableEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableEnterpriseAcceleratePolicyResponse
     */
    public DisableEnterpriseAcceleratePolicyResponse disableEnterpriseAcceleratePolicyWithOptions(DisableEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an enterprise acceleration policy.</p>
     * 
     * @param request DisableEnterpriseAcceleratePolicyRequest
     * @return DisableEnterpriseAcceleratePolicyResponse
     */
    public DisableEnterpriseAcceleratePolicyResponse disableEnterpriseAcceleratePolicy(DisableEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an enterprise acceleration policy.</p>
     * 
     * @param request EnableEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableEnterpriseAcceleratePolicyResponse
     */
    public EnableEnterpriseAcceleratePolicyResponse enableEnterpriseAcceleratePolicyWithOptions(EnableEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an enterprise acceleration policy.</p>
     * 
     * @param request EnableEnterpriseAcceleratePolicyRequest
     * @return EnableEnterpriseAcceleratePolicyResponse
     */
    public EnableEnterpriseAcceleratePolicyResponse enableEnterpriseAcceleratePolicy(EnableEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export a list of user terminal devices to an Excel file.</p>
     * 
     * @param request ExportUserDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportUserDevicesResponse
     */
    public ExportUserDevicesResponse exportUserDevicesWithOptions(ExportUserDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appStatuses)) {
            bodyFlat.put("AppStatuses", request.appStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            body.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceBelong)) {
            body.put("DeviceBelong", request.deviceBelong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatuses)) {
            bodyFlat.put("DeviceStatuses", request.deviceStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTypes)) {
            bodyFlat.put("DeviceTypes", request.deviceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlpStatuses)) {
            bodyFlat.put("DlpStatuses", request.dlpStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            body.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaStatuses)) {
            bodyFlat.put("IaStatuses", request.iaStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            body.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacStatuses)) {
            bodyFlat.put("NacStatuses", request.nacStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paStatuses)) {
            bodyFlat.put("PaStatuses", request.paStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saseUserId)) {
            body.put("SaseUserId", request.saseUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharingStatus)) {
            body.put("SharingStatus", request.sharingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportUserDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportUserDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export a list of user terminal devices to an Excel file.</p>
     * 
     * @param request ExportUserDevicesRequest
     * @return ExportUserDevicesResponse
     */
    public ExportUserDevicesResponse exportUserDevices(ExportUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportUserDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the identity provider configuration enabled for your Alibaba Cloud account.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetActiveIdpConfigResponse
     */
    public GetActiveIdpConfigResponse getActiveIdpConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActiveIdpConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActiveIdpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the identity provider configuration enabled for your Alibaba Cloud account.</p>
     * @return GetActiveIdpConfigResponse
     */
    public GetActiveIdpConfigResponse getActiveIdpConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getActiveIdpConfigWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the real-time antivirus defense policy of the current Alibaba Cloud account.</p>
     * 
     * @param request GetAntiVirusRealTimeDefenceStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAntiVirusRealTimeDefenceStrategyResponse
     */
    public GetAntiVirusRealTimeDefenceStrategyResponse getAntiVirusRealTimeDefenceStrategyWithOptions(GetAntiVirusRealTimeDefenceStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAntiVirusRealTimeDefenceStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAntiVirusRealTimeDefenceStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the real-time antivirus defense policy of the current Alibaba Cloud account.</p>
     * 
     * @param request GetAntiVirusRealTimeDefenceStrategyRequest
     * @return GetAntiVirusRealTimeDefenceStrategyResponse
     */
    public GetAntiVirusRealTimeDefenceStrategyResponse getAntiVirusRealTimeDefenceStrategy(GetAntiVirusRealTimeDefenceStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAntiVirusRealTimeDefenceStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an approval instance under the current Alibaba Cloud account.</p>
     * 
     * @param request GetApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalResponse
     */
    public GetApprovalResponse getApprovalWithOptions(GetApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApproval"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an approval instance under the current Alibaba Cloud account.</p>
     * 
     * @param request GetApprovalRequest
     * @return GetApprovalResponse
     */
    public GetApprovalResponse getApproval(GetApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an approval process under the current Alibaba Cloud account.</p>
     * 
     * @param request GetApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalProcessResponse
     */
    public GetApprovalProcessResponse getApprovalProcessWithOptions(GetApprovalProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an approval process under the current Alibaba Cloud account.</p>
     * 
     * @param request GetApprovalProcessRequest
     * @return GetApprovalProcessResponse
     */
    public GetApprovalProcessResponse getApprovalProcess(GetApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an approval template for your Alibaba Cloud account.</p>
     * 
     * @param request GetApprovalSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalSchemaResponse
     */
    public GetApprovalSchemaResponse getApprovalSchemaWithOptions(GetApprovalSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApprovalSchema"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an approval template for your Alibaba Cloud account.</p>
     * 
     * @param request GetApprovalSchemaRequest
     * @return GetApprovalSchemaResponse
     */
    public GetApprovalSchemaResponse getApprovalSchema(GetApprovalSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the auto-start and anti-uninstall policy under the current Alibaba Cloud account.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBootAndAntiUninstallPolicyResponse
     */
    public GetBootAndAntiUninstallPolicyResponse getBootAndAntiUninstallPolicyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBootAndAntiUninstallPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBootAndAntiUninstallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the auto-start and anti-uninstall policy under the current Alibaba Cloud account.</p>
     * @return GetBootAndAntiUninstallPolicyResponse
     */
    public GetBootAndAntiUninstallPolicyResponse getBootAndAntiUninstallPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBootAndAntiUninstallPolicyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a user from a custom identity source in your Alibaba Cloud account.</p>
     * 
     * @param request GetClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientUserResponse
     */
    public GetClientUserResponse getClientUserWithOptions(GetClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a user from a custom identity source in your Alibaba Cloud account.</p>
     * 
     * @param request GetClientUserRequest
     * @return GetClientUserResponse
     */
    public GetClientUserResponse getClientUser(GetClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a connector.</p>
     * 
     * @param request GetConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectorResponse
     */
    public GetConnectorResponse getConnectorWithOptions(GetConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a connector.</p>
     * 
     * @param request GetConnectorRequest
     * @return GetConnectorResponse
     */
    public GetConnectorResponse getConnector(GetConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a ConnectorClient.</p>
     * 
     * @param request GetConnectorClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectorClientResponse
     */
    public GetConnectorClientResponse getConnectorClientWithOptions(GetConnectorClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectorClient"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectorClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a ConnectorClient.</p>
     * 
     * @param request GetConnectorClientRequest
     * @return GetConnectorClientResponse
     */
    public GetConnectorClientResponse getConnectorClient(GetConnectorClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectorClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified device label.</p>
     * 
     * @param request GetDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceGroupResponse
     */
    public GetDeviceGroupResponse getDeviceGroupWithOptions(GetDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified device label.</p>
     * 
     * @param request GetDeviceGroupRequest
     * @return GetDeviceGroupResponse
     */
    public GetDeviceGroupResponse getDeviceGroup(GetDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the online time distribution of a specified terminal device on a specified date, aggregated by minute.</p>
     * 
     * @param request GetDeviceOnlineHeatmapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceOnlineHeatmapResponse
     */
    public GetDeviceOnlineHeatmapResponse getDeviceOnlineHeatmapWithOptions(GetDeviceOnlineHeatmapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            query.put("DevTag", request.devTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saseUserId)) {
            query.put("SaseUserId", request.saseUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceOnlineHeatmap"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceOnlineHeatmapResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the online time distribution of a specified terminal device on a specified date, aggregated by minute.</p>
     * 
     * @param request GetDeviceOnlineHeatmapRequest
     * @return GetDeviceOnlineHeatmapResponse
     */
    public GetDeviceOnlineHeatmapResponse getDeviceOnlineHeatmap(GetDeviceOnlineHeatmapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceOnlineHeatmapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details about a dynamic route in your Alibaba Cloud account.</p>
     * 
     * @param request GetDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDynamicRouteResponse
     */
    public GetDynamicRouteResponse getDynamicRouteWithOptions(GetDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDynamicRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details about a dynamic route in your Alibaba Cloud account.</p>
     * 
     * @param request GetDynamicRouteRequest
     * @return GetDynamicRouteResponse
     */
    public GetDynamicRouteResponse getDynamicRoute(GetDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a domain name list of a specified type (blacklist/whitelist) under the current tenant and returns the ListId of the new list. You can create up to 100 lists of each type per tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a forwarding rule.</p>
     * 
     * @param request GetForwardStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetForwardStrategyResponse
     */
    public GetForwardStrategyResponse getForwardStrategyWithOptions(GetForwardStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetForwardStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetForwardStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a domain name list of a specified type (blacklist/whitelist) under the current tenant and returns the ListId of the new list. You can create up to 100 lists of each type per tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a forwarding rule.</p>
     * 
     * @param request GetForwardStrategyRequest
     * @return GetForwardStrategyResponse
     */
    public GetForwardStrategyResponse getForwardStrategy(GetForwardStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getForwardStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the configuration details of a specified identity provider for your Alibaba Cloud account.</p>
     * 
     * @param request GetIdpConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdpConfigResponse
     */
    public GetIdpConfigResponse getIdpConfigWithOptions(GetIdpConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdpConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the configuration details of a specified identity provider for your Alibaba Cloud account.</p>
     * 
     * @param request GetIdpConfigRequest
     * @return GetIdpConfigResponse
     */
    public GetIdpConfigResponse getIdpConfig(GetIdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdpConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves all phone numbers in the whitelist.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the phone number whitelist for visitor admission SMS logon.</p>
     * 
     * @param request GetNacPortalSmsPhoneWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNacPortalSmsPhoneWhitelistResponse
     */
    public GetNacPortalSmsPhoneWhitelistResponse getNacPortalSmsPhoneWhitelistWithOptions(GetNacPortalSmsPhoneWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNacPortalSmsPhoneWhitelist"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNacPortalSmsPhoneWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves all phone numbers in the whitelist.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the phone number whitelist for visitor admission SMS logon.</p>
     * 
     * @param request GetNacPortalSmsPhoneWhitelistRequest
     * @return GetNacPortalSmsPhoneWhitelistResponse
     */
    public GetNacPortalSmsPhoneWhitelistResponse getNacPortalSmsPhoneWhitelist(GetNacPortalSmsPhoneWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNacPortalSmsPhoneWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a private access diagnostic task.</p>
     * 
     * @param request GetPADiagnosisTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPADiagnosisTaskResponse
     */
    public GetPADiagnosisTaskResponse getPADiagnosisTaskWithOptions(GetPADiagnosisTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPADiagnosisTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPADiagnosisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a private access diagnostic task.</p>
     * 
     * @param request GetPADiagnosisTaskRequest
     * @return GetPADiagnosisTaskResponse
     */
    public GetPADiagnosisTaskResponse getPADiagnosisTask(GetPADiagnosisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPADiagnosisTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an internal-facing access application under the current Alibaba Cloud account.</p>
     * 
     * @param request GetPrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrivateAccessApplicationResponse
     */
    public GetPrivateAccessApplicationResponse getPrivateAccessApplicationWithOptions(GetPrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrivateAccessApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an internal-facing access application under the current Alibaba Cloud account.</p>
     * 
     * @param request GetPrivateAccessApplicationRequest
     * @return GetPrivateAccessApplicationResponse
     */
    public GetPrivateAccessApplicationResponse getPrivateAccessApplication(GetPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Intranet Access Policy Details</p>
     * 
     * @param request GetPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrivateAccessPolicyResponse
     */
    public GetPrivateAccessPolicyResponse getPrivateAccessPolicyWithOptions(GetPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Intranet Access Policy Details</p>
     * 
     * @param request GetPrivateAccessPolicyRequest
     * @return GetPrivateAccessPolicyResponse
     */
    public GetPrivateAccessPolicyResponse getPrivateAccessPolicy(GetPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified software prohibition policy.</p>
     * 
     * @param request GetProhibitedPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProhibitedPolicyResponse
     */
    public GetProhibitedPolicyResponse getProhibitedPolicyWithOptions(GetProhibitedPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProhibitedPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProhibitedPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified software prohibition policy.</p>
     * 
     * @param request GetProhibitedPolicyRequest
     * @return GetProhibitedPolicyResponse
     */
    public GetProhibitedPolicyResponse getProhibitedPolicy(GetProhibitedPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProhibitedPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified prohibited software.</p>
     * 
     * @param tmpReq GetProhibitedSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProhibitedSoftwareResponse
     */
    public GetProhibitedSoftwareResponse getProhibitedSoftwareWithOptions(GetProhibitedSoftwareRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetProhibitedSoftwareShrinkRequest request = new GetProhibitedSoftwareShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.softwareId)) {
            request.softwareIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.softwareId, "SoftwareId", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProhibitedSoftware"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProhibitedSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified prohibited software.</p>
     * 
     * @param request GetProhibitedSoftwareRequest
     * @return GetProhibitedSoftwareResponse
     */
    public GetProhibitedSoftwareResponse getProhibitedSoftware(GetProhibitedSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProhibitedSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a device registration policy within the current Alibaba Cloud account.</p>
     * 
     * @param request GetRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistrationPolicyResponse
     */
    public GetRegistrationPolicyResponse getRegistrationPolicyWithOptions(GetRegistrationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a device registration policy within the current Alibaba Cloud account.</p>
     * 
     * @param request GetRegistrationPolicyRequest
     * @return GetRegistrationPolicyResponse
     */
    public GetRegistrationPolicyResponse getRegistrationPolicy(GetRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a user endpoint device under the current Alibaba Cloud account.</p>
     * 
     * @param request GetUserDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserDeviceResponse
     */
    public GetUserDeviceResponse getUserDeviceWithOptions(GetUserDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDevice"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a user endpoint device under the current Alibaba Cloud account.</p>
     * 
     * @param request GetUserDeviceRequest
     * @return GetUserDeviceResponse
     */
    public GetUserDeviceResponse getUserDevice(GetUserDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the workload usage trends of a specified endpoint device.</p>
     * 
     * @param request GetUserDeviceWorkloadTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserDeviceWorkloadTrendResponse
     */
    public GetUserDeviceWorkloadTrendResponse getUserDeviceWorkloadTrendWithOptions(GetUserDeviceWorkloadTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTag)) {
            query.put("DeviceTag", request.deviceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadType)) {
            query.put("WorkloadType", request.workloadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDeviceWorkloadTrend"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDeviceWorkloadTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the workload usage trends of a specified endpoint device.</p>
     * 
     * @param request GetUserDeviceWorkloadTrendRequest
     * @return GetUserDeviceWorkloadTrendResponse
     */
    public GetUserDeviceWorkloadTrendResponse getUserDeviceWorkloadTrend(GetUserDeviceWorkloadTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDeviceWorkloadTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a user group in the current Alibaba Cloud account.</p>
     * 
     * @param request GetUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroupWithOptions(GetUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a user group in the current Alibaba Cloud account.</p>
     * 
     * @param request GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroup(GetUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global anti-virus configuration of the current Alibaba Cloud account, including the virus file upload switch and upload limits. If the current Alibaba Cloud account does not have its own configuration record, the default configurations are returned.</p>
     * 
     * @param request GetVirusScanGlobalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVirusScanGlobalConfigResponse
     */
    public GetVirusScanGlobalConfigResponse getVirusScanGlobalConfigWithOptions(GetVirusScanGlobalConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVirusScanGlobalConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVirusScanGlobalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global anti-virus configuration of the current Alibaba Cloud account, including the virus file upload switch and upload limits. If the current Alibaba Cloud account does not have its own configuration record, the default configurations are returned.</p>
     * 
     * @param request GetVirusScanGlobalConfigRequest
     * @return GetVirusScanGlobalConfigResponse
     */
    public GetVirusScanGlobalConfigResponse getVirusScanGlobalConfig(GetVirusScanGlobalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVirusScanGlobalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified scheduled virus scan policy.</p>
     * 
     * @param request GetVirusScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVirusScanScheduledStrategyResponse
     */
    public GetVirusScanScheduledStrategyResponse getVirusScanScheduledStrategyWithOptions(GetVirusScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVirusScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVirusScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified scheduled virus scan policy.</p>
     * 
     * @param request GetVirusScanScheduledStrategyRequest
     * @return GetVirusScanScheduledStrategyResponse
     */
    public GetVirusScanScheduledStrategyResponse getVirusScanScheduledStrategy(GetVirusScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVirusScanScheduledStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global configuration of vulnerability scanning for the current Alibaba Cloud account.</p>
     * 
     * @param request GetVulScanGlobalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulScanGlobalConfigResponse
     */
    public GetVulScanGlobalConfigResponse getVulScanGlobalConfigWithOptions(GetVulScanGlobalConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulScanGlobalConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulScanGlobalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global configuration of vulnerability scanning for the current Alibaba Cloud account.</p>
     * 
     * @param request GetVulScanGlobalConfigRequest
     * @return GetVulScanGlobalConfigResponse
     */
    public GetVulScanGlobalConfigResponse getVulScanGlobalConfig(GetVulScanGlobalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulScanGlobalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the complete configuration of a specified vulnerability scheduled scan policy.</p>
     * 
     * @param request GetVulScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulScanScheduledStrategyResponse
     */
    public GetVulScanScheduledStrategyResponse getVulScanScheduledStrategyWithOptions(GetVulScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the complete configuration of a specified vulnerability scheduled scan policy.</p>
     * 
     * @param request GetVulScanScheduledStrategyRequest
     * @return GetVulScanScheduledStrategyResponse
     */
    public GetVulScanScheduledStrategyResponse getVulScanScheduledStrategy(GetVulScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulScanScheduledStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified vulnerability.</p>
     * 
     * @param request GetVulnerabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulnerabilityResponse
     */
    public GetVulnerabilityResponse getVulnerabilityWithOptions(GetVulnerabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulnerability"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulnerabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified vulnerability.</p>
     * 
     * @param request GetVulnerabilityRequest
     * @return GetVulnerabilityResponse
     */
    public GetVulnerabilityResponse getVulnerability(GetVulnerabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulnerabilityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use the job ID obtained from creating a watermark embedding job to query the embedding job result.</p>
     * 
     * @param request GetWmEmbedTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWmEmbedTaskResponse
     */
    public GetWmEmbedTaskResponse getWmEmbedTaskWithOptions(GetWmEmbedTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWmEmbedTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWmEmbedTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use the job ID obtained from creating a watermark embedding job to query the embedding job result.</p>
     * 
     * @param request GetWmEmbedTaskRequest
     * @return GetWmEmbedTaskResponse
     */
    public GetWmEmbedTaskResponse getWmEmbedTask(GetWmEmbedTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWmEmbedTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a watermark extraction task using the task ID that is returned when you create the task.</p>
     * 
     * @param request GetWmExtractTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWmExtractTaskResponse
     */
    public GetWmExtractTaskResponse getWmExtractTaskWithOptions(GetWmExtractTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWmExtractTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWmExtractTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a watermark extraction task using the task ID that is returned when you create the task.</p>
     * 
     * @param request GetWmExtractTaskRequest
     * @return GetWmExtractTaskResponse
     */
    public GetWmExtractTaskResponse getWmExtractTask(GetWmExtractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWmExtractTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports acceleration addresses in batches.</p>
     * 
     * @param request ImportEnterpriseAccelerateTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportEnterpriseAccelerateTargetsResponse
     */
    public ImportEnterpriseAccelerateTargetsResponse importEnterpriseAccelerateTargetsWithOptions(ImportEnterpriseAccelerateTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportEnterpriseAccelerateTargets"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportEnterpriseAccelerateTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports acceleration addresses in batches.</p>
     * 
     * @param request ImportEnterpriseAccelerateTargetsRequest
     * @return ImportEnterpriseAccelerateTargetsResponse
     */
    public ImportEnterpriseAccelerateTargetsResponse importEnterpriseAccelerateTargets(ImportEnterpriseAccelerateTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importEnterpriseAccelerateTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications associated with one or more private access policies.</p>
     * 
     * @param request ListApplicationsForPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    public ListApplicationsForPrivateAccessPolicyResponse listApplicationsForPrivateAccessPolicyWithOptions(ListApplicationsForPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForPrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications associated with one or more private access policies.</p>
     * 
     * @param request ListApplicationsForPrivateAccessPolicyRequest
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    public ListApplicationsForPrivateAccessPolicyResponse listApplicationsForPrivateAccessPolicy(ListApplicationsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch-query applications associated with private network access tags within your Alibaba Cloud account.</p>
     * 
     * @param request ListApplicationsForPrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    public ListApplicationsForPrivateAccessTagResponse listApplicationsForPrivateAccessTagWithOptions(ListApplicationsForPrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForPrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForPrivateAccessTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch-query applications associated with private network access tags within your Alibaba Cloud account.</p>
     * 
     * @param request ListApplicationsForPrivateAccessTagRequest
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    public ListApplicationsForPrivateAccessTagResponse listApplicationsForPrivateAccessTag(ListApplicationsForPrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of approval processes under the current Alibaba Cloud account.</p>
     * 
     * @param request ListApprovalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalProcessesResponse
     */
    public ListApprovalProcessesResponse listApprovalProcessesWithOptions(ListApprovalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of approval processes under the current Alibaba Cloud account.</p>
     * 
     * @param request ListApprovalProcessesRequest
     * @return ListApprovalProcessesResponse
     */
    public ListApprovalProcessesResponse listApprovalProcesses(ListApprovalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the approval flows associated with approval rendering templates.</p>
     * 
     * @param request ListApprovalProcessesForApprovalSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalProcessesForApprovalSchemasResponse
     */
    public ListApprovalProcessesForApprovalSchemasResponse listApprovalProcessesForApprovalSchemasWithOptions(ListApprovalProcessesForApprovalSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalProcessesForApprovalSchemas"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalProcessesForApprovalSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the approval flows associated with approval rendering templates.</p>
     * 
     * @param request ListApprovalProcessesForApprovalSchemasRequest
     * @return ListApprovalProcessesForApprovalSchemasResponse
     */
    public ListApprovalProcessesForApprovalSchemasResponse listApprovalProcessesForApprovalSchemas(ListApprovalProcessesForApprovalSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalProcessesForApprovalSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the approval templates for your Alibaba Cloud account.</p>
     * 
     * @param request ListApprovalSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalSchemasResponse
     */
    public ListApprovalSchemasResponse listApprovalSchemasWithOptions(ListApprovalSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalSchemas"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the approval templates for your Alibaba Cloud account.</p>
     * 
     * @param request ListApprovalSchemasRequest
     * @return ListApprovalSchemasResponse
     */
    public ListApprovalSchemasResponse listApprovalSchemas(ListApprovalSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rendering templates associated with approval processes.</p>
     * 
     * @param request ListApprovalSchemasForApprovalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalSchemasForApprovalProcessesResponse
     */
    public ListApprovalSchemasForApprovalProcessesResponse listApprovalSchemasForApprovalProcessesWithOptions(ListApprovalSchemasForApprovalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalSchemasForApprovalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalSchemasForApprovalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rendering templates associated with approval processes.</p>
     * 
     * @param request ListApprovalSchemasForApprovalProcessesRequest
     * @return ListApprovalSchemasForApprovalProcessesResponse
     */
    public ListApprovalSchemasForApprovalProcessesResponse listApprovalSchemasForApprovalProcesses(ListApprovalSchemasForApprovalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalSchemasForApprovalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of approval instances under the current Alibaba Cloud account.</p>
     * 
     * @param request ListApprovalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalsResponse
     */
    public ListApprovalsResponse listApprovalsWithOptions(ListApprovalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovals"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of approval instances under the current Alibaba Cloud account.</p>
     * 
     * @param request ListApprovalsRequest
     * @return ListApprovalsResponse
     */
    public ListApprovalsResponse listApprovals(ListApprovalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query user information from custom identity sources in your Alibaba Cloud account.</p>
     * 
     * @param request ListClientUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientUsersResponse
     */
    public ListClientUsersResponse listClientUsersWithOptions(ListClientUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientUsers"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query user information from custom identity sources in your Alibaba Cloud account.</p>
     * 
     * @param request ListClientUsersRequest
     * @return ListClientUsersResponse
     */
    public ListClientUsersResponse listClientUsers(ListClientUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query connectors in batches.</p>
     * 
     * @param request ListConnectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectorsWithOptions(ListConnectorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectors"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query connectors in batches.</p>
     * 
     * @param request ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectors(ListConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of device groups under the current Alibaba Cloud account by using paging.</p>
     * 
     * @param request ListDeviceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceGroupsResponse
     */
    public ListDeviceGroupsResponse listDeviceGroupsWithOptions(ListDeviceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupIds)) {
            query.put("DeviceGroupIds", request.deviceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceGroups"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of device groups under the current Alibaba Cloud account by using paging.</p>
     * 
     * @param request ListDeviceGroupsRequest
     * @return ListDeviceGroupsResponse
     */
    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user endpoint devices affected by a specified vulnerability and their remediation status by paging.</p>
     * 
     * @param request ListDevicesForVulnerabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDevicesForVulnerabilityResponse
     */
    public ListDevicesForVulnerabilityResponse listDevicesForVulnerabilityWithOptions(ListDevicesForVulnerabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevicesForVulnerability"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevicesForVulnerabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user endpoint devices affected by a specified vulnerability and their remediation status by paging.</p>
     * 
     * @param request ListDevicesForVulnerabilityRequest
     * @return ListDevicesForVulnerabilityResponse
     */
    public ListDevicesForVulnerabilityResponse listDevicesForVulnerability(ListDevicesForVulnerabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicesForVulnerabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of domain name entries in a specified domain name list by paging. Use this operation together with ListDomainMetas: first obtain the <code>ListId</code>, and then use this operation to perform paging through the domain names in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries domain name entries in a domain name list by paging.</p>
     * 
     * @param request ListDomainItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainItemsResponse
     */
    public ListDomainItemsResponse listDomainItemsWithOptions(ListDomainItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemValue)) {
            query.put("ItemValue", request.itemValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listId)) {
            query.put("ListId", request.listId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomainItems"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of domain name entries in a specified domain name list by paging. Use this operation together with ListDomainMetas: first obtain the <code>ListId</code>, and then use this operation to perform paging through the domain names in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries domain name entries in a domain name list by paging.</p>
     * 
     * @param request ListDomainItemsRequest
     * @return ListDomainItemsResponse
     */
    public ListDomainItemsResponse listDomainItems(ListDomainItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainItemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on the metadata of domain name lists (the header information of domain name blacklists/whitelists, excluding the specific domain name entries within the lists) for the current tenant with paging. You can filter by list type (blacklist/whitelist), perform fuzzy search by name, and specify whether to include system built-in default template lists in the results. Each record includes the number of domain name entries in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of domain name lists.</p>
     * 
     * @param request ListDomainMetasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainMetasResponse
     */
    public ListDomainMetasResponse listDomainMetasWithOptions(ListDomainMetasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultTemplate)) {
            query.put("DefaultTemplate", request.defaultTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomainMetas"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainMetasResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on the metadata of domain name lists (the header information of domain name blacklists/whitelists, excluding the specific domain name entries within the lists) for the current tenant with paging. You can filter by list type (blacklist/whitelist), perform fuzzy search by name, and specify whether to include system built-in default template lists in the results. Each record includes the number of domain name entries in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of domain name lists.</p>
     * 
     * @param request ListDomainMetasRequest
     * @return ListDomainMetasResponse
     */
    public ListDomainMetasResponse listDomainMetas(ListDomainMetasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainMetasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Query Dynamic Policy Disposal Processes</p>
     * 
     * @param request ListDynamicDisposalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicDisposalProcessesResponse
     */
    public ListDynamicDisposalProcessesResponse listDynamicDisposalProcessesWithOptions(ListDynamicDisposalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicDisposalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicDisposalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Query Dynamic Policy Disposal Processes</p>
     * 
     * @param request ListDynamicDisposalProcessesRequest
     * @return ListDynamicDisposalProcessesResponse
     */
    public ListDynamicDisposalProcessesResponse listDynamicDisposalProcesses(ListDynamicDisposalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicDisposalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions that are supported by the access points of SASE POP clusters for your Alibaba Cloud account.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicRouteRegionsResponse
     */
    public ListDynamicRouteRegionsResponse listDynamicRouteRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicRouteRegions"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicRouteRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions that are supported by the access points of SASE POP clusters for your Alibaba Cloud account.</p>
     * @return ListDynamicRouteRegionsResponse
     */
    public ListDynamicRouteRegionsResponse listDynamicRouteRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicRouteRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about all dynamic routes for the current Alibaba Cloud account.</p>
     * 
     * @param request ListDynamicRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicRoutesResponse
     */
    public ListDynamicRoutesResponse listDynamicRoutesWithOptions(ListDynamicRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicRoutes"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about all dynamic routes for the current Alibaba Cloud account.</p>
     * 
     * @param request ListDynamicRoutesRequest
     * @return ListDynamicRoutesResponse
     */
    public ListDynamicRoutesResponse listDynamicRoutes(ListDynamicRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries audit logs for enterprise acceleration.</p>
     * 
     * @param request ListEnterpriseAccelerateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseAccelerateLogsResponse
     */
    public ListEnterpriseAccelerateLogsResponse listEnterpriseAccelerateLogsWithOptions(ListEnterpriseAccelerateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseAccelerateLogs"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseAccelerateLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries audit logs for enterprise acceleration.</p>
     * 
     * @param request ListEnterpriseAccelerateLogsRequest
     * @return ListEnterpriseAccelerateLogsResponse
     */
    public ListEnterpriseAccelerateLogsResponse listEnterpriseAccelerateLogs(ListEnterpriseAccelerateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseAccelerateLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query acceleration policies</p>
     * 
     * @param request ListEnterpriseAcceleratePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseAcceleratePoliciesResponse
     */
    public ListEnterpriseAcceleratePoliciesResponse listEnterpriseAcceleratePoliciesWithOptions(ListEnterpriseAcceleratePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseAcceleratePolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseAcceleratePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query acceleration policies</p>
     * 
     * @param request ListEnterpriseAcceleratePoliciesRequest
     * @return ListEnterpriseAcceleratePoliciesResponse
     */
    public ListEnterpriseAcceleratePoliciesResponse listEnterpriseAcceleratePolicies(ListEnterpriseAcceleratePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseAcceleratePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of enterprise acceleration targets.</p>
     * 
     * @param request ListEnterpriseAccelerateTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseAccelerateTargetsResponse
     */
    public ListEnterpriseAccelerateTargetsResponse listEnterpriseAccelerateTargetsWithOptions(ListEnterpriseAccelerateTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseAccelerateTargets"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseAccelerateTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of enterprise acceleration targets.</p>
     * 
     * @param request ListEnterpriseAccelerateTargetsRequest
     * @return ListEnterpriseAccelerateTargetsResponse
     */
    public ListEnterpriseAccelerateTargetsResponse listEnterpriseAccelerateTargets(ListEnterpriseAccelerateTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseAccelerateTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists excess end-user device registration applications in the current Alibaba Cloud account.</p>
     * 
     * @param request ListExcessiveDeviceRegistrationApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    public ListExcessiveDeviceRegistrationApplicationsResponse listExcessiveDeviceRegistrationApplicationsWithOptions(ListExcessiveDeviceRegistrationApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExcessiveDeviceRegistrationApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExcessiveDeviceRegistrationApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists excess end-user device registration applications in the current Alibaba Cloud account.</p>
     * 
     * @param request ListExcessiveDeviceRegistrationApplicationsRequest
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    public ListExcessiveDeviceRegistrationApplicationsResponse listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExcessiveDeviceRegistrationApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries forwarding rules in batches.</p>
     * 
     * @param request ListForwardStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListForwardStrategiesResponse
     */
    public ListForwardStrategiesResponse listForwardStrategiesWithOptions(ListForwardStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListForwardStrategies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListForwardStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries forwarding rules in batches.</p>
     * 
     * @param request ListForwardStrategiesRequest
     * @return ListForwardStrategiesResponse
     */
    public ListForwardStrategiesResponse listForwardStrategies(ListForwardStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listForwardStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bindings of forwarding rules in batches.</p>
     * 
     * @param request ListForwardStrategyBindingItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListForwardStrategyBindingItemsResponse
     */
    public ListForwardStrategyBindingItemsResponse listForwardStrategyBindingItemsWithOptions(ListForwardStrategyBindingItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListForwardStrategyBindingItems"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListForwardStrategyBindingItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bindings of forwarding rules in batches.</p>
     * 
     * @param request ListForwardStrategyBindingItemsRequest
     * @return ListForwardStrategyBindingItemsResponse
     */
    public ListForwardStrategyBindingItemsResponse listForwardStrategyBindingItems(ListForwardStrategyBindingItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listForwardStrategyBindingItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists identity provider configurations for the current Alibaba Cloud account.</p>
     * 
     * @param request ListIdpConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdpConfigsResponse
     */
    public ListIdpConfigsResponse listIdpConfigsWithOptions(ListIdpConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdpConfigs"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdpConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists identity provider configurations for the current Alibaba Cloud account.</p>
     * 
     * @param request ListIdpConfigsRequest
     * @return ListIdpConfigsResponse
     */
    public ListIdpConfigsResponse listIdpConfigs(ListIdpConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdpConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves department information for a custom identity provider (IdP) associated with your Alibaba Cloud account.</p>
     * 
     * @param request ListIdpDepartmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdpDepartmentsResponse
     */
    public ListIdpDepartmentsResponse listIdpDepartmentsWithOptions(ListIdpDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdpDepartments"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdpDepartmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves department information for a custom identity provider (IdP) associated with your Alibaba Cloud account.</p>
     * 
     * @param request ListIdpDepartmentsRequest
     * @return ListIdpDepartmentsResponse
     */
    public ListIdpDepartmentsResponse listIdpDepartments(ListIdpDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdpDepartmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists onboarded users.</p>
     * 
     * @param request ListNacUserCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNacUserCertResponse
     */
    public ListNacUserCertResponse listNacUserCertWithOptions(ListNacUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNacUserCert"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNacUserCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists onboarded users.</p>
     * 
     * @param request ListNacUserCertRequest
     * @return ListNacUserCertResponse
     */
    public ListNacUserCertResponse listNacUserCert(ListNacUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNacUserCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies for private access applications in your Alibaba Cloud account in batches.</p>
     * 
     * @param request ListPolicesForPrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    public ListPolicesForPrivateAccessApplicationResponse listPolicesForPrivateAccessApplicationWithOptions(ListPolicesForPrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicesForPrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicesForPrivateAccessApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies for private access applications in your Alibaba Cloud account in batches.</p>
     * 
     * @param request ListPolicesForPrivateAccessApplicationRequest
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    public ListPolicesForPrivateAccessApplicationResponse listPolicesForPrivateAccessApplication(ListPolicesForPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch query policies for private network access tags in your Alibaba Cloud account.</p>
     * 
     * @param request ListPolicesForPrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicesForPrivateAccessTagResponse
     */
    public ListPolicesForPrivateAccessTagResponse listPolicesForPrivateAccessTagWithOptions(ListPolicesForPrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicesForPrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicesForPrivateAccessTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch query policies for private network access tags in your Alibaba Cloud account.</p>
     * 
     * @param request ListPolicesForPrivateAccessTagRequest
     * @return ListPolicesForPrivateAccessTagResponse
     */
    public ListPolicesForPrivateAccessTagResponse listPolicesForPrivateAccessTag(ListPolicesForPrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies for multiple user groups within your Alibaba Cloud account.</p>
     * 
     * @param request ListPolicesForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicesForUserGroupResponse
     */
    public ListPolicesForUserGroupResponse listPolicesForUserGroupWithOptions(ListPolicesForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicesForUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicesForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies for multiple user groups within your Alibaba Cloud account.</p>
     * 
     * @param request ListPolicesForUserGroupRequest
     * @return ListPolicesForUserGroupResponse
     */
    public ListPolicesForUserGroupResponse listPolicesForUserGroup(ListPolicesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves bandwidth usage statistics for Secure Access Service Edge (SASE) points of presence (POPs).</p>
     * 
     * @param request ListPopTrafficStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPopTrafficStatisticsResponse
     */
    public ListPopTrafficStatisticsResponse listPopTrafficStatisticsWithOptions(ListPopTrafficStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPopTrafficStatistics"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPopTrafficStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves bandwidth usage statistics for Secure Access Service Edge (SASE) points of presence (POPs).</p>
     * 
     * @param request ListPopTrafficStatisticsRequest
     * @return ListPopTrafficStatisticsResponse
     */
    public ListPopTrafficStatisticsResponse listPopTrafficStatistics(ListPopTrafficStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPopTrafficStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Layer 7 switches of internal-facing applications in batches.</p>
     * 
     * @param request ListPrivateAccessApplicationL7SwitchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessApplicationL7SwitchesResponse
     */
    public ListPrivateAccessApplicationL7SwitchesResponse listPrivateAccessApplicationL7SwitchesWithOptions(ListPrivateAccessApplicationL7SwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessApplicationL7Switches"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessApplicationL7SwitchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Layer 7 switches of internal-facing applications in batches.</p>
     * 
     * @param request ListPrivateAccessApplicationL7SwitchesRequest
     * @return ListPrivateAccessApplicationL7SwitchesResponse
     */
    public ListPrivateAccessApplicationL7SwitchesResponse listPrivateAccessApplicationL7Switches(ListPrivateAccessApplicationL7SwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationL7SwitchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about all internal-facing access applications under the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessApplicationsResponse
     */
    public ListPrivateAccessApplicationsResponse listPrivateAccessApplicationsWithOptions(ListPrivateAccessApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessModes)) {
            query.put("AccessModes", request.accessModes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            query.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about all internal-facing access applications under the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessApplicationsRequest
     * @return ListPrivateAccessApplicationsResponse
     */
    public ListPrivateAccessApplicationsResponse listPrivateAccessApplications(ListPrivateAccessApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List private access applications for dynamic routes in your Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessApplicationsForDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    public ListPrivateAccessApplicationsForDynamicRouteResponse listPrivateAccessApplicationsForDynamicRouteWithOptions(ListPrivateAccessApplicationsForDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessApplicationsForDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessApplicationsForDynamicRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List private access applications for dynamic routes in your Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessApplicationsForDynamicRouteRequest
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    public ListPrivateAccessApplicationsForDynamicRouteResponse listPrivateAccessApplicationsForDynamicRoute(ListPrivateAccessApplicationsForDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationsForDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all private access policies under the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessPolicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessPolicesResponse
     */
    public ListPrivateAccessPolicesResponse listPrivateAccessPolicesWithOptions(ListPrivateAccessPolicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessPolices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessPolicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all private access policies under the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessPolicesRequest
     * @return ListPrivateAccessPolicesResponse
     */
    public ListPrivateAccessPolicesResponse listPrivateAccessPolices(ListPrivateAccessPolicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessPolicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all internal access tags within the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessTagsResponse
     */
    public ListPrivateAccessTagsResponse listPrivateAccessTagsWithOptions(ListPrivateAccessTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessTags"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all internal access tags within the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessTagsRequest
     * @return ListPrivateAccessTagsResponse
     */
    public ListPrivateAccessTagsResponse listPrivateAccessTags(ListPrivateAccessTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tags for dynamic routes in your Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessTagsForDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    public ListPrivateAccessTagsForDynamicRouteResponse listPrivateAccessTagsForDynamicRouteWithOptions(ListPrivateAccessTagsForDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessTagsForDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessTagsForDynamicRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tags for dynamic routes in your Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessTagsForDynamicRouteRequest
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    public ListPrivateAccessTagsForDynamicRouteResponse listPrivateAccessTagsForDynamicRoute(ListPrivateAccessTagsForDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessTagsForDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of software prohibition policies under the current Alibaba Cloud account by paging.</p>
     * 
     * @param tmpReq ListProhibitedPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProhibitedPoliciesResponse
     */
    public ListProhibitedPoliciesResponse listProhibitedPoliciesWithOptions(ListProhibitedPoliciesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProhibitedPoliciesShrinkRequest request = new ListProhibitedPoliciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.softwareId)) {
            request.softwareIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.softwareId, "SoftwareId", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProhibitedPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProhibitedPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of software prohibition policies under the current Alibaba Cloud account by paging.</p>
     * 
     * @param request ListProhibitedPoliciesRequest
     * @return ListProhibitedPoliciesResponse
     */
    public ListProhibitedPoliciesResponse listProhibitedPolicies(ListProhibitedPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProhibitedPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of prohibited software under the current Alibaba Cloud account by using paging.</p>
     * 
     * @param tmpReq ListProhibitedSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProhibitedSoftwareResponse
     */
    public ListProhibitedSoftwareResponse listProhibitedSoftwareWithOptions(ListProhibitedSoftwareRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProhibitedSoftwareShrinkRequest request = new ListProhibitedSoftwareShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagId)) {
            request.tagIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagId, "TagId", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProhibitedSoftware"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProhibitedSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of prohibited software under the current Alibaba Cloud account by using paging.</p>
     * 
     * @param request ListProhibitedSoftwareRequest
     * @return ListProhibitedSoftwareResponse
     */
    public ListProhibitedSoftwareResponse listProhibitedSoftware(ListProhibitedSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProhibitedSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of prohibited software tags under the current Alibaba Cloud account by paging.</p>
     * 
     * @param tmpReq ListProhibitedTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProhibitedTagsResponse
     */
    public ListProhibitedTagsResponse listProhibitedTagsWithOptions(ListProhibitedTagsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProhibitedTagsShrinkRequest request = new ListProhibitedTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.softwareId)) {
            request.softwareIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.softwareId, "SoftwareId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softwareIdShrink)) {
            query.put("SoftwareId", request.softwareIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            query.put("TagIds", request.tagIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProhibitedTags"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProhibitedTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of prohibited software tags under the current Alibaba Cloud account by paging.</p>
     * 
     * @param request ListProhibitedTagsRequest
     * @return ListProhibitedTagsResponse
     */
    public ListProhibitedTagsResponse listProhibitedTags(ListProhibitedTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProhibitedTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of device registration policies for your Alibaba Cloud account.</p>
     * 
     * @param request ListRegistrationPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistrationPoliciesResponse
     */
    public ListRegistrationPoliciesResponse listRegistrationPoliciesWithOptions(ListRegistrationPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistrationPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistrationPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of device registration policies for your Alibaba Cloud account.</p>
     * 
     * @param request ListRegistrationPoliciesRequest
     * @return ListRegistrationPoliciesResponse
     */
    public ListRegistrationPoliciesResponse listRegistrationPolicies(ListRegistrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegistrationPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the device registration policies that are associated with user groups in your Alibaba Cloud account.</p>
     * 
     * @param request ListRegistrationPoliciesForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    public ListRegistrationPoliciesForUserGroupResponse listRegistrationPoliciesForUserGroupWithOptions(ListRegistrationPoliciesForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistrationPoliciesForUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistrationPoliciesForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the device registration policies that are associated with user groups in your Alibaba Cloud account.</p>
     * 
     * @param request ListRegistrationPoliciesForUserGroupRequest
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    public ListRegistrationPoliciesForUserGroupResponse listRegistrationPoliciesForUserGroup(ListRegistrationPoliciesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegistrationPoliciesForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used for paging query of risk events that meet specified conditional criteria.</li>
     * <li><code>CurrentPage</code> and <code>PageSize</code> are required parameters that specify the current page number and the number of entries per page.</li>
     * <li>You can set parameters such as <code>RiskId</code>, <code>RiskScene</code>, and <code>RiskCategory</code> to perform exact or fuzzy queries for specific risk events.</li>
     * <li>The <code>Status</code> and <code>StatusList</code> parameters cannot be used at the same time. They are used to filter risk events by disposition status.</li>
     * <li>Fuzzy match queries are supported by settings <code>PolicyName</code> and <code>Username</code>.</li>
     * <li>The response includes the total number of risk events that meet the query conditions and their details.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of risk events under the current Alibaba Cloud account.</p>
     * 
     * @param request ListRiskItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRiskItemsResponse
     */
    public ListRiskItemsResponse listRiskItemsWithOptions(ListRiskItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskCategory)) {
            query.put("RiskCategory", request.riskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskId)) {
            query.put("RiskId", request.riskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskScene)) {
            query.put("RiskScene", request.riskScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRiskItems"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRiskItemsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used for paging query of risk events that meet specified conditional criteria.</li>
     * <li><code>CurrentPage</code> and <code>PageSize</code> are required parameters that specify the current page number and the number of entries per page.</li>
     * <li>You can set parameters such as <code>RiskId</code>, <code>RiskScene</code>, and <code>RiskCategory</code> to perform exact or fuzzy queries for specific risk events.</li>
     * <li>The <code>Status</code> and <code>StatusList</code> parameters cannot be used at the same time. They are used to filter risk events by disposition status.</li>
     * <li>Fuzzy match queries are supported by settings <code>PolicyName</code> and <code>Username</code>.</li>
     * <li>The response includes the total number of risk events that meet the query conditions and their details.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of risk events under the current Alibaba Cloud account.</p>
     * 
     * @param request ListRiskItemsRequest
     * @return ListRiskItemsResponse
     */
    public ListRiskItemsResponse listRiskItems(ListRiskItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRiskItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of software installed on user endpoint devices under the current Alibaba Cloud account.</p>
     * 
     * @param request ListSoftwareForUserDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSoftwareForUserDeviceResponse
     */
    public ListSoftwareForUserDeviceResponse listSoftwareForUserDeviceWithOptions(ListSoftwareForUserDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSoftwareForUserDevice"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSoftwareForUserDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of software installed on user endpoint devices under the current Alibaba Cloud account.</p>
     * 
     * @param request ListSoftwareForUserDeviceRequest
     * @return ListSoftwareForUserDeviceResponse
     */
    public ListSoftwareForUserDeviceResponse listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSoftwareForUserDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch query tags for private network access applications under the current Alibaba Cloud account.</p>
     * 
     * @param request ListTagsForPrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    public ListTagsForPrivateAccessApplicationResponse listTagsForPrivateAccessApplicationWithOptions(ListTagsForPrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagsForPrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsForPrivateAccessApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch query tags for private network access applications under the current Alibaba Cloud account.</p>
     * 
     * @param request ListTagsForPrivateAccessApplicationRequest
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    public ListTagsForPrivateAccessApplicationResponse listTagsForPrivateAccessApplication(ListTagsForPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsForPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of internal network access policies in your Alibaba Cloud account.</p>
     * 
     * @param request ListTagsForPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    public ListTagsForPrivateAccessPolicyResponse listTagsForPrivateAccessPolicyWithOptions(ListTagsForPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagsForPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsForPrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of internal network access policies in your Alibaba Cloud account.</p>
     * 
     * @param request ListTagsForPrivateAccessPolicyRequest
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    public ListTagsForPrivateAccessPolicyResponse listTagsForPrivateAccessPolicy(ListTagsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of uninstall applications under the current Alibaba Cloud account in batches.</p>
     * 
     * @param request ListUninstallApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUninstallApplicationsResponse
     */
    public ListUninstallApplicationsResponse listUninstallApplicationsWithOptions(ListUninstallApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUninstallApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUninstallApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of uninstall applications under the current Alibaba Cloud account in batches.</p>
     * 
     * @param request ListUninstallApplicationsRequest
     * @return ListUninstallApplicationsResponse
     */
    public ListUninstallApplicationsResponse listUninstallApplications(ListUninstallApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUninstallApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the application permissions of the logged-in user in the current Alibaba Cloud account.</p>
     * 
     * @param request ListUserApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserApplicationsResponse
     */
    public ListUserApplicationsResponse listUserApplicationsWithOptions(ListUserApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the application permissions of the logged-in user in the current Alibaba Cloud account.</p>
     * 
     * @param request ListUserApplicationsRequest
     * @return ListUserApplicationsResponse
     */
    public ListUserApplicationsResponse listUserApplications(ListUserApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of user endpoint devices under the current Alibaba Cloud account.</p>
     * 
     * @param request ListUserDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDevicesResponse
     */
    public ListUserDevicesResponse listUserDevicesWithOptions(ListUserDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appStatuses)) {
            query.put("AppStatuses", request.appStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersions)) {
            query.put("AppVersions", request.appVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoLoginStatuses)) {
            query.put("AutoLoginStatuses", request.autoLoginStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceBelong)) {
            query.put("DeviceBelong", request.deviceBelong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatuses)) {
            query.put("DeviceStatuses", request.deviceStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            query.put("DeviceTags", request.deviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTypes)) {
            query.put("DeviceTypes", request.deviceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlpStatuses)) {
            query.put("DlpStatuses", request.dlpStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaStatuses)) {
            query.put("IaStatuses", request.iaStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerIp)) {
            query.put("InnerIp", request.innerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacStatuses)) {
            query.put("NacStatuses", request.nacStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paStatuses)) {
            query.put("PaStatuses", request.paStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saseUserId)) {
            query.put("SaseUserId", request.saseUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharingStatus)) {
            query.put("SharingStatus", request.sharingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snBios)) {
            query.put("SnBios", request.snBios);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snSystem)) {
            query.put("SnSystem", request.snSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workshop)) {
            query.put("Workshop", request.workshop);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of user endpoint devices under the current Alibaba Cloud account.</p>
     * 
     * @param request ListUserDevicesRequest
     * @return ListUserDevicesResponse
     */
    public ListUserDevicesResponse listUserDevices(ListUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about all user groups in your Alibaba Cloud account.</p>
     * 
     * @param request ListUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroups"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about all user groups in your Alibaba Cloud account.</p>
     * 
     * @param request ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve user groups for private network access policies in batches under your Alibaba Cloud account.</p>
     * 
     * @param request ListUserGroupsForPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    public ListUserGroupsForPrivateAccessPolicyResponse listUserGroupsForPrivateAccessPolicyWithOptions(ListUserGroupsForPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupsForPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsForPrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve user groups for private network access policies in batches under your Alibaba Cloud account.</p>
     * 
     * @param request ListUserGroupsForPrivateAccessPolicyRequest
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    public ListUserGroupsForPrivateAccessPolicyResponse listUserGroupsForPrivateAccessPolicy(ListUserGroupsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the user groups associated with device registration policies in your Alibaba Cloud account.</p>
     * 
     * @param request ListUserGroupsForRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    public ListUserGroupsForRegistrationPolicyResponse listUserGroupsForRegistrationPolicyWithOptions(ListUserGroupsForRegistrationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupsForRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsForRegistrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the user groups associated with device registration policies in your Alibaba Cloud account.</p>
     * 
     * @param request ListUserGroupsForRegistrationPolicyRequest
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    public ListUserGroupsForRegistrationPolicyResponse listUserGroupsForRegistrationPolicy(ListUserGroupsForRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsForRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of user zero trust policies.</p>
     * 
     * @param request ListUserPrivateAccessPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPrivateAccessPoliciesResponse
     */
    public ListUserPrivateAccessPoliciesResponse listUserPrivateAccessPoliciesWithOptions(ListUserPrivateAccessPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPrivateAccessPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPrivateAccessPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of user zero trust policies.</p>
     * 
     * @param request ListUserPrivateAccessPoliciesRequest
     * @return ListUserPrivateAccessPoliciesResponse
     */
    public ListUserPrivateAccessPoliciesResponse listUserPrivateAccessPolicies(ListUserPrivateAccessPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPrivateAccessPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the users for the current Alibaba Cloud account.</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the users for the current Alibaba Cloud account.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virus files detected under the current Alibaba Cloud account and their disposition status with paging. Supports filtering by virus type, risk level, user terminal device, user, and discovery time.</p>
     * 
     * @param request ListVirusFileStatusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusFileStatusesResponse
     */
    public ListVirusFileStatusesResponse listVirusFileStatusesWithOptions(ListVirusFileStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusFileStatuses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusFileStatusesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virus files detected under the current Alibaba Cloud account and their disposition status with paging. Supports filtering by virus type, risk level, user terminal device, user, and discovery time.</p>
     * 
     * @param request ListVirusFileStatusesRequest
     * @return ListVirusFileStatusesResponse
     */
    public ListVirusFileStatusesResponse listVirusFileStatuses(ListVirusFileStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusFileStatusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询病毒扫描额外名单</p>
     * 
     * @param request ListVirusScanAdditionalListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusScanAdditionalListsResponse
     */
    public ListVirusScanAdditionalListsResponse listVirusScanAdditionalListsWithOptions(ListVirusScanAdditionalListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusScanAdditionalLists"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusScanAdditionalListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询病毒扫描额外名单</p>
     * 
     * @param request ListVirusScanAdditionalListsRequest
     * @return ListVirusScanAdditionalListsResponse
     */
    public ListVirusScanAdditionalListsResponse listVirusScanAdditionalLists(ListVirusScanAdditionalListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusScanAdditionalListsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virus scheduled scan policies under the current Alibaba Cloud account with paging.</p>
     * 
     * @param request ListVirusScanScheduledStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusScanScheduledStrategiesResponse
     */
    public ListVirusScanScheduledStrategiesResponse listVirusScanScheduledStrategiesWithOptions(ListVirusScanScheduledStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusScanScheduledStrategies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusScanScheduledStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virus scheduled scan policies under the current Alibaba Cloud account with paging.</p>
     * 
     * @param request ListVirusScanScheduledStrategiesRequest
     * @return ListVirusScanScheduledStrategiesResponse
     */
    public ListVirusScanScheduledStrategiesResponse listVirusScanScheduledStrategies(ListVirusScanScheduledStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusScanScheduledStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询病毒扫描任务的状态</p>
     * 
     * @param request ListVirusScanTaskStatusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusScanTaskStatusesResponse
     */
    public ListVirusScanTaskStatusesResponse listVirusScanTaskStatusesWithOptions(ListVirusScanTaskStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusScanTaskStatuses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusScanTaskStatusesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询病毒扫描任务的状态</p>
     * 
     * @param request ListVirusScanTaskStatusesRequest
     * @return ListVirusScanTaskStatusesResponse
     */
    public ListVirusScanTaskStatusesResponse listVirusScanTaskStatuses(ListVirusScanTaskStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusScanTaskStatusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询病毒扫描任务统计数据</p>
     * 
     * @param request ListVirusScanTaskSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusScanTaskSummaryResponse
     */
    public ListVirusScanTaskSummaryResponse listVirusScanTaskSummaryWithOptions(ListVirusScanTaskSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusScanTaskSummary"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusScanTaskSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询病毒扫描任务统计数据</p>
     * 
     * @param request ListVirusScanTaskSummaryRequest
     * @return ListVirusScanTaskSummaryResponse
     */
    public ListVirusScanTaskSummaryResponse listVirusScanTaskSummary(ListVirusScanTaskSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusScanTaskSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询病毒扫描任务</p>
     * 
     * @param request ListVirusScanTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusScanTasksResponse
     */
    public ListVirusScanTasksResponse listVirusScanTasksWithOptions(ListVirusScanTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusScanTasks"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusScanTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询病毒扫描任务</p>
     * 
     * @param request ListVirusScanTasksRequest
     * @return ListVirusScanTasksResponse
     */
    public ListVirusScanTasksResponse listVirusScanTasks(ListVirusScanTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusScanTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scheduled vulnerability scan policies under the current Alibaba Cloud account by paging.</p>
     * 
     * @param request ListVulScanScheduledStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVulScanScheduledStrategiesResponse
     */
    public ListVulScanScheduledStrategiesResponse listVulScanScheduledStrategiesWithOptions(ListVulScanScheduledStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVulScanScheduledStrategies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVulScanScheduledStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scheduled vulnerability scan policies under the current Alibaba Cloud account by paging.</p>
     * 
     * @param request ListVulScanScheduledStrategiesRequest
     * @return ListVulScanScheduledStrategiesResponse
     */
    public ListVulScanScheduledStrategiesResponse listVulScanScheduledStrategies(ListVulScanScheduledStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVulScanScheduledStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries vulnerability scanning tasks under the current Alibaba Cloud account by paged query.</p>
     * 
     * @param request ListVulScanTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVulScanTasksResponse
     */
    public ListVulScanTasksResponse listVulScanTasksWithOptions(ListVulScanTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVulScanTasks"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVulScanTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries vulnerability scanning tasks under the current Alibaba Cloud account by paged query.</p>
     * 
     * @param request ListVulScanTasksRequest
     * @return ListVulScanTasksResponse
     */
    public ListVulScanTasksResponse listVulScanTasks(ListVulScanTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVulScanTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries vulnerabilities detected by scans under the current Alibaba Cloud account by using paged query with paging.</p>
     * 
     * @param request ListVulnerabilitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVulnerabilitiesResponse
     */
    public ListVulnerabilitiesResponse listVulnerabilitiesWithOptions(ListVulnerabilitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVulnerabilities"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVulnerabilitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries vulnerabilities detected by scans under the current Alibaba Cloud account by using paged query with paging.</p>
     * 
     * @param request ListVulnerabilitiesRequest
     * @return ListVulnerabilitiesResponse
     */
    public ListVulnerabilitiesResponse listVulnerabilities(ListVulnerabilitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVulnerabilitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Look up an existing watermark information mapping to retrieve the corresponding string-formatted watermark information from numeric-formatted watermark data.</p>
     * 
     * @param request LookupWmInfoMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LookupWmInfoMappingResponse
     */
    public LookupWmInfoMappingResponse lookupWmInfoMappingWithOptions(LookupWmInfoMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LookupWmInfoMapping"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LookupWmInfoMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Look up an existing watermark information mapping to retrieve the corresponding string-formatted watermark information from numeric-formatted watermark data.</p>
     * 
     * @param request LookupWmInfoMappingRequest
     * @return LookupWmInfoMappingResponse
     */
    public LookupWmInfoMappingResponse lookupWmInfoMapping(LookupWmInfoMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupWmInfoMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an enterprise acceleration policy.</p>
     * 
     * @param request ModifyEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEnterpriseAcceleratePolicyResponse
     */
    public ModifyEnterpriseAcceleratePolicyResponse modifyEnterpriseAcceleratePolicyWithOptions(ModifyEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerationType)) {
            body.put("AccelerationType", request.accelerationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onTls)) {
            body.put("OnTls", request.onTls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showInClient)) {
            body.put("ShowInClient", request.showInClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamHost)) {
            body.put("UpstreamHost", request.upstreamHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamPort)) {
            body.put("UpstreamPort", request.upstreamPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamType)) {
            body.put("UpstreamType", request.upstreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAttributeGroup)) {
            body.put("UserAttributeGroup", request.userAttributeGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an enterprise acceleration policy.</p>
     * 
     * @param request ModifyEnterpriseAcceleratePolicyRequest
     * @return ModifyEnterpriseAcceleratePolicyResponse
     */
    public ModifyEnterpriseAcceleratePolicyResponse modifyEnterpriseAcceleratePolicy(ModifyEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a forwarding rule.</p>
     * 
     * @param request ModifyForwardStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyForwardStrategyResponse
     */
    public ModifyForwardStrategyResponse modifyForwardStrategyWithOptions(ModifyForwardStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationId)) {
            body.put("DestinationId", request.destinationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            body.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardId)) {
            body.put("ForwardId", request.forwardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyForwardStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyForwardStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a forwarding rule.</p>
     * 
     * @param request ModifyForwardStrategyRequest
     * @return ModifyForwardStrategyResponse
     */
    public ModifyForwardStrategyResponse modifyForwardStrategy(ModifyForwardStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyForwardStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the binding items of a forwarding rule.</p>
     * 
     * @param request ModifyForwardStrategyBindingItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyForwardStrategyBindingItemsResponse
     */
    public ModifyForwardStrategyBindingItemsResponse modifyForwardStrategyBindingItemsWithOptions(ModifyForwardStrategyBindingItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemIds)) {
            query.put("ItemIds", request.itemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            query.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardId)) {
            body.put("ForwardId", request.forwardId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyForwardStrategyBindingItems"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyForwardStrategyBindingItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the binding items of a forwarding rule.</p>
     * 
     * @param request ModifyForwardStrategyBindingItemsRequest
     * @return ModifyForwardStrategyBindingItemsResponse
     */
    public ModifyForwardStrategyBindingItemsResponse modifyForwardStrategyBindingItems(ModifyForwardStrategyBindingItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyForwardStrategyBindingItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes associated terminal devices from a static device label in batches.</p>
     * 
     * @param request RemoveDeviceGroupMatchDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDeviceGroupMatchDevicesResponse
     */
    public RemoveDeviceGroupMatchDevicesResponse removeDeviceGroupMatchDevicesWithOptions(RemoveDeviceGroupMatchDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTags)) {
            bodyFlat.put("DevTags", request.devTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            body.put("DeviceGroupId", request.deviceGroupId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDeviceGroupMatchDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDeviceGroupMatchDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes associated terminal devices from a static device label in batches.</p>
     * 
     * @param request RemoveDeviceGroupMatchDevicesRequest
     * @return RemoveDeviceGroupMatchDevicesResponse
     */
    public RemoveDeviceGroupMatchDevicesResponse removeDeviceGroupMatchDevices(RemoveDeviceGroupMatchDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDeviceGroupMatchDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes virus scan blacklists and whitelists entries in batch by entry IDs. The entire removal operation is failed if any of the specified entry IDs do not belong to the current Alibaba Cloud account.</p>
     * 
     * @param request RemoveVirusScanAdditionalListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveVirusScanAdditionalListsResponse
     */
    public RemoveVirusScanAdditionalListsResponse removeVirusScanAdditionalListsWithOptions(RemoveVirusScanAdditionalListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listIds)) {
            bodyFlat.put("ListIds", request.listIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVirusScanAdditionalLists"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVirusScanAdditionalListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes virus scan blacklists and whitelists entries in batch by entry IDs. The entire removal operation is failed if any of the specified entry IDs do not belong to the current Alibaba Cloud account.</p>
     * 
     * @param request RemoveVirusScanAdditionalListsRequest
     * @return RemoveVirusScanAdditionalListsResponse
     */
    public RemoveVirusScanAdditionalListsResponse removeVirusScanAdditionalLists(RemoveVirusScanAdditionalListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVirusScanAdditionalListsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a user device session.</p>
     * 
     * @param request RevokeUserDeviceSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeUserDeviceSessionResponse
     */
    public RevokeUserDeviceSessionResponse revokeUserDeviceSessionWithOptions(RevokeUserDeviceSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            body.put("DevTag", request.devTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saseUserId)) {
            body.put("SaseUserId", request.saseUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeUserDeviceSession"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeUserDeviceSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a user device session.</p>
     * 
     * @param request RevokeUserDeviceSessionRequest
     * @return RevokeUserDeviceSessionResponse
     */
    public RevokeUserDeviceSessionResponse revokeUserDeviceSession(RevokeUserDeviceSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeUserDeviceSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a user logon session.</p>
     * 
     * @deprecated OpenAPI RevokeUserSession is deprecated
     * 
     * @param request RevokeUserSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeUserSessionResponse
     */
    @Deprecated
    // Deprecated
    public RevokeUserSessionResponse revokeUserSessionWithOptions(RevokeUserSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalIds)) {
            query.put("ExternalIds", request.externalIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpId)) {
            query.put("IdpId", request.idpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeUserSession"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeUserSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a user logon session.</p>
     * 
     * @deprecated OpenAPI RevokeUserSession is deprecated
     * 
     * @param request RevokeUserSessionRequest
     * @return RevokeUserSessionResponse
     */
    @Deprecated
    // Deprecated
    public RevokeUserSessionResponse revokeUserSession(RevokeUserSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeUserSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the real-time anti-virus defense policy for the current Alibaba Cloud account. The first call creates the policy, and subsequent calls update it. The complete updated configuration is returned. When configuring for the first time, Status, MatchMode, HighRiskOperation, MidRiskOperation, LowRiskOperation, and ScanTargets are all required. ScanTargets and Whitelist are full replacements. The collection you pass in replaces the existing configuration. When MatchMode is set to UserGroupNormal, you must pass in the complete UserGroupIds on every call. When Status is not set to Disabled, the system validates the endpoint hardening license count. The call fails if the count exceeds the purchased licenses.</p>
     * 
     * @param request UpdateAntiVirusRealTimeDefenceStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntiVirusRealTimeDefenceStrategyResponse
     */
    public UpdateAntiVirusRealTimeDefenceStrategyResponse updateAntiVirusRealTimeDefenceStrategyWithOptions(UpdateAntiVirusRealTimeDefenceStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.highRiskOperation)) {
            body.put("HighRiskOperation", request.highRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowRiskOperation)) {
            body.put("LowRiskOperation", request.lowRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCpuUsage)) {
            body.put("MaxCpuUsage", request.maxCpuUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.midRiskOperation)) {
            body.put("MidRiskOperation", request.midRiskOperation);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scanTargets)) {
            bodyFlat.put("ScanTargets", request.scanTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntiVirusRealTimeDefenceStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntiVirusRealTimeDefenceStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the real-time anti-virus defense policy for the current Alibaba Cloud account. The first call creates the policy, and subsequent calls update it. The complete updated configuration is returned. When configuring for the first time, Status, MatchMode, HighRiskOperation, MidRiskOperation, LowRiskOperation, and ScanTargets are all required. ScanTargets and Whitelist are full replacements. The collection you pass in replaces the existing configuration. When MatchMode is set to UserGroupNormal, you must pass in the complete UserGroupIds on every call. When Status is not set to Disabled, the system validates the endpoint hardening license count. The call fails if the count exceeds the purchased licenses.</p>
     * 
     * @param request UpdateAntiVirusRealTimeDefenceStrategyRequest
     * @return UpdateAntiVirusRealTimeDefenceStrategyResponse
     */
    public UpdateAntiVirusRealTimeDefenceStrategyResponse updateAntiVirusRealTimeDefenceStrategy(UpdateAntiVirusRealTimeDefenceStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntiVirusRealTimeDefenceStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an approval process under the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq UpdateApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApprovalProcessResponse
     */
    public UpdateApprovalProcessResponse updateApprovalProcessWithOptions(UpdateApprovalProcessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateApprovalProcessShrinkRequest request = new UpdateApprovalProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchSchemaConfigs)) {
            request.matchSchemaConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchSchemaConfigs, "MatchSchemaConfigs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchSchemas)) {
            request.matchSchemasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchSchemas, "MatchSchemas", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            query.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventLabel)) {
            query.put("EventLabel", request.eventLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalConfig)) {
            query.put("ExternalConfig", request.externalConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchSchemaConfigsShrink)) {
            query.put("MatchSchemaConfigs", request.matchSchemaConfigsShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchSchemasShrink)) {
            body.put("MatchSchemas", request.matchSchemasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            body.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            body.put("ProcessName", request.processName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processNodes)) {
            bodyFlat.put("ProcessNodes", request.processNodes);
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
            new TeaPair("action", "UpdateApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an approval process under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateApprovalProcessRequest
     * @return UpdateApprovalProcessResponse
     */
    public UpdateApprovalProcessResponse updateApprovalProcess(UpdateApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the instance status of an approval under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateApprovalStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApprovalStatusResponse
     */
    public UpdateApprovalStatusResponse updateApprovalStatusWithOptions(UpdateApprovalStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            query.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApprovalStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApprovalStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the instance status of an approval under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateApprovalStatusRequest
     * @return UpdateApprovalStatusResponse
     */
    public UpdateApprovalStatusResponse updateApprovalStatus(UpdateApprovalStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApprovalStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the auto-start and anti-uninstall policy for your Alibaba Cloud account.</p>
     * 
     * @param tmpReq UpdateBootAndAntiUninstallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBootAndAntiUninstallPolicyResponse
     */
    public UpdateBootAndAntiUninstallPolicyResponse updateBootAndAntiUninstallPolicyWithOptions(UpdateBootAndAntiUninstallPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBootAndAntiUninstallPolicyShrinkRequest request = new UpdateBootAndAntiUninstallPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.blockContent)) {
            request.blockContentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.blockContent, "BlockContent", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowReport)) {
            body.put("AllowReport", request.allowReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockContentShrink)) {
            body.put("BlockContent", request.blockContentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAntiUninstall)) {
            body.put("IsAntiUninstall", request.isAntiUninstall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBoot)) {
            body.put("IsBoot", request.isBoot);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistUsers)) {
            bodyFlat.put("WhitelistUsers", request.whitelistUsers);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBootAndAntiUninstallPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBootAndAntiUninstallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the auto-start and anti-uninstall policy for your Alibaba Cloud account.</p>
     * 
     * @param request UpdateBootAndAntiUninstallPolicyRequest
     * @return UpdateBootAndAntiUninstallPolicyResponse
     */
    public UpdateBootAndAntiUninstallPolicyResponse updateBootAndAntiUninstallPolicy(UpdateBootAndAntiUninstallPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBootAndAntiUninstallPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update user information for a custom identity provider in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientUserResponse
     */
    public UpdateClientUserResponse updateClientUserWithOptions(UpdateClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update user information for a custom identity provider in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateClientUserRequest
     * @return UpdateClientUserResponse
     */
    public UpdateClientUserResponse updateClientUser(UpdateClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the password for a specified user that belongs to a custom identity source.</p>
     * 
     * @param request UpdateClientUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientUserPasswordResponse
     */
    public UpdateClientUserPasswordResponse updateClientUserPasswordWithOptions(UpdateClientUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientUserPassword"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the password for a specified user that belongs to a custom identity source.</p>
     * 
     * @param request UpdateClientUserPasswordRequest
     * @return UpdateClientUserPasswordResponse
     */
    public UpdateClientUserPasswordResponse updateClientUserPassword(UpdateClientUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of a specified user from a custom identity source for your Alibaba Cloud account.</p>
     * 
     * @param request UpdateClientUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientUserStatusResponse
     */
    public UpdateClientUserStatusResponse updateClientUserStatusWithOptions(UpdateClientUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientUserStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientUserStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of a specified user from a custom identity source for your Alibaba Cloud account.</p>
     * 
     * @param request UpdateClientUserStatusRequest
     * @return UpdateClientUserStatusResponse
     */
    public UpdateClientUserStatusResponse updateClientUserStatus(UpdateClientUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Connector instance under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectorResponse
     */
    public UpdateConnectorResponse updateConnectorWithOptions(UpdateConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerateStatus)) {
            body.put("AccelerateStatus", request.accelerateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchStatus)) {
            body.put("SwitchStatus", request.switchStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vipCidr)) {
            body.put("VipCidr", request.vipCidr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Connector instance under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    public UpdateConnectorResponse updateConnector(UpdateConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a ConnectorClient under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateConnectorClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectorClientResponse
     */
    public UpdateConnectorClientResponse updateConnectorClientWithOptions(UpdateConnectorClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            body.put("DevTag", request.devTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnectorClient"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectorClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a ConnectorClient under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateConnectorClientRequest
     * @return UpdateConnectorClientResponse
     */
    public UpdateConnectorClientResponse updateConnectorClient(UpdateConnectorClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectorClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a device label.</p>
     * 
     * @param request UpdateDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeviceGroupResponse
     */
    public UpdateDeviceGroupResponse updateDeviceGroupWithOptions(UpdateDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            body.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicOperator)) {
            body.put("DynamicOperator", request.dynamicOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a device label.</p>
     * 
     * @param request UpdateDeviceGroupRequest
     * @return UpdateDeviceGroupResponse
     */
    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of a domain name list.</p>
     * 
     * @param request UpdateDomainMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainMetaResponse
     */
    public UpdateDomainMetaResponse updateDomainMetaWithOptions(UpdateDomainMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listId)) {
            body.put("ListId", request.listId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            body.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainMeta"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of a domain name list.</p>
     * 
     * @param request UpdateDomainMetaRequest
     * @return UpdateDomainMetaResponse
     */
    public UpdateDomainMetaResponse updateDomainMeta(UpdateDomainMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a dynamic route in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDynamicRouteResponse
     */
    public UpdateDynamicRouteResponse updateDynamicRouteWithOptions(UpdateDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteId)) {
            body.put("DynamicRouteId", request.dynamicRouteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteType)) {
            body.put("DynamicRouteType", request.dynamicRouteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            body.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIds)) {
            bodyFlat.put("RegionIds", request.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDynamicRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a dynamic route in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateDynamicRouteRequest
     * @return UpdateDynamicRouteResponse
     */
    public UpdateDynamicRouteResponse updateDynamicRoute(UpdateDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the status of device registration applications that exceed your Alibaba Cloud account\&quot;s quota.</p>
     * 
     * @param request UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse updateExcessiveDeviceRegistrationApplicationsStatusWithOptions(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExcessiveDeviceRegistrationApplicationsStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExcessiveDeviceRegistrationApplicationsStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the status of device registration applications that exceed your Alibaba Cloud account\&quot;s quota.</p>
     * 
     * @param request UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse updateExcessiveDeviceRegistrationApplicationsStatus(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExcessiveDeviceRegistrationApplicationsStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a department from a custom identity provider for the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateIdpDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdpDepartmentResponse
     */
    public UpdateIdpDepartmentResponse updateIdpDepartmentWithOptions(UpdateIdpDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentName)) {
            query.put("DepartmentName", request.departmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdpDepartment"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdpDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a department from a custom identity provider for the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateIdpDepartmentRequest
     * @return UpdateIdpDepartmentResponse
     */
    public UpdateIdpDepartmentResponse updateIdpDepartment(UpdateIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A maximum of 1024 phone numbers are supported.</li>
     * <li>Duplicate phone numbers are not allowed. Phone numbers in invalid formats are rejected. Only Chinese mainland phone numbers are supported.</li>
     * <li>You must update all phone numbers at once. Incremental updates are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the phone number whitelist for visitor access SMS logon.</p>
     * 
     * @param request UpdateNacPortalSmsPhoneWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacPortalSmsPhoneWhitelistResponse
     */
    public UpdateNacPortalSmsPhoneWhitelistResponse updateNacPortalSmsPhoneWhitelistWithOptions(UpdateNacPortalSmsPhoneWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phones)) {
            query.put("Phones", request.phones);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacPortalSmsPhoneWhitelist"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacPortalSmsPhoneWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A maximum of 1024 phone numbers are supported.</li>
     * <li>Duplicate phone numbers are not allowed. Phone numbers in invalid formats are rejected. Only Chinese mainland phone numbers are supported.</li>
     * <li>You must update all phone numbers at once. Incremental updates are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the phone number whitelist for visitor access SMS logon.</p>
     * 
     * @param request UpdateNacPortalSmsPhoneWhitelistRequest
     * @return UpdateNacPortalSmsPhoneWhitelistResponse
     */
    public UpdateNacPortalSmsPhoneWhitelistResponse updateNacPortalSmsPhoneWhitelist(UpdateNacPortalSmsPhoneWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacPortalSmsPhoneWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the network access certificate status for users in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateNacUserCertStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacUserCertStatusResponse
     */
    public UpdateNacUserCertStatusResponse updateNacUserCertStatusWithOptions(UpdateNacUserCertStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idList)) {
            bodyFlat.put("IdList", request.idList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacUserCertStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacUserCertStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the network access certificate status for users in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateNacUserCertStatusRequest
     * @return UpdateNacUserCertStatusResponse
     */
    public UpdateNacUserCertStatusResponse updateNacUserCertStatus(UpdateNacUserCertStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacUserCertStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a private access application under the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq UpdatePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateAccessApplicationResponse
     */
    public UpdatePrivateAccessApplicationResponse updatePrivateAccessApplicationWithOptions(UpdatePrivateAccessApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePrivateAccessApplicationShrinkRequest request = new UpdatePrivateAccessApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.l7Config)) {
            request.l7ConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.l7Config, "L7Config", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.unauthorizedAccessConfig)) {
            request.unauthorizedAccessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.unauthorizedAccessConfig, "UnauthorizedAccessConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressGroups)) {
            bodyFlat.put("AddressGroups", request.addressGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            bodyFlat.put("Addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMode)) {
            body.put("ConfigMode", request.configMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ConfigShrink)) {
            body.put("L7Config", request.l7ConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainAutomaticPrefix)) {
            body.put("L7ProxyDomainAutomaticPrefix", request.l7ProxyDomainAutomaticPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainCustom)) {
            body.put("L7ProxyDomainCustom", request.l7ProxyDomainCustom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainPrivate)) {
            body.put("L7ProxyDomainPrivate", request.l7ProxyDomainPrivate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            bodyFlat.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unauthorizedAccessConfigShrink)) {
            body.put("UnauthorizedAccessConfig", request.unauthorizedAccessConfigShrink);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateAccessApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a private access application under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdatePrivateAccessApplicationRequest
     * @return UpdatePrivateAccessApplicationResponse
     */
    public UpdatePrivateAccessApplicationResponse updatePrivateAccessApplication(UpdatePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Layer 7 access switch for an internal-facing application.</p>
     * 
     * @param request UpdatePrivateAccessApplicationL7SwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateAccessApplicationL7SwitchResponse
     */
    public UpdatePrivateAccessApplicationL7SwitchResponse updatePrivateAccessApplicationL7SwitchWithOptions(UpdatePrivateAccessApplicationL7SwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devTagMarkStatus)) {
            body.put("DevTagMarkStatus", request.devTagMarkStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadAuditStatus)) {
            body.put("DownloadAuditStatus", request.downloadAuditStatus);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            bodyFlat.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIpMarkStatus)) {
            body.put("SrcIpMarkStatus", request.srcIpMarkStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSec)) {
            body.put("TimeoutSec", request.timeoutSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMarkStatus)) {
            body.put("UserMarkStatus", request.userMarkStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroTrustStatus)) {
            body.put("ZeroTrustStatus", request.zeroTrustStatus);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateAccessApplicationL7Switch"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateAccessApplicationL7SwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Layer 7 access switch for an internal-facing application.</p>
     * 
     * @param request UpdatePrivateAccessApplicationL7SwitchRequest
     * @return UpdatePrivateAccessApplicationL7SwitchResponse
     */
    public UpdatePrivateAccessApplicationL7SwitchResponse updatePrivateAccessApplicationL7Switch(UpdatePrivateAccessApplicationL7SwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessApplicationL7SwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update an internal network access policy for your Alibaba Cloud account.</p>
     * 
     * @param request UpdatePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateAccessPolicyResponse
     */
    public UpdatePrivateAccessPolicyResponse updatePrivateAccessPolicyWithOptions(UpdatePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserAttributes)) {
            bodyFlat.put("CustomUserAttributes", request.customUserAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeAction)) {
            body.put("DeviceAttributeAction", request.deviceAttributeAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeId)) {
            body.put("DeviceAttributeId", request.deviceAttributeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyAction)) {
            body.put("PolicyAction", request.policyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTemplateId)) {
            body.put("TriggerTemplateId", request.triggerTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessGroupIds)) {
            bodyFlat.put("TrustedProcessGroupIds", request.trustedProcessGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessStatus)) {
            body.put("TrustedProcessStatus", request.trustedProcessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedSoftwareIds)) {
            bodyFlat.put("TrustedSoftwareIds", request.trustedSoftwareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupMode)) {
            body.put("UserGroupMode", request.userGroupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validFrom)) {
            body.put("ValidFrom", request.validFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTimeStatus)) {
            body.put("ValidTimeStatus", request.validTimeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validUntil)) {
            body.put("ValidUntil", request.validUntil);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateAccessPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update an internal network access policy for your Alibaba Cloud account.</p>
     * 
     * @param request UpdatePrivateAccessPolicyRequest
     * @return UpdatePrivateAccessPolicyResponse
     */
    public UpdatePrivateAccessPolicyResponse updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a software prohibition policy.</p>
     * 
     * @param request UpdateProhibitedPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProhibitedPolicyResponse
     */
    public UpdateProhibitedPolicyResponse updateProhibitedPolicyWithOptions(UpdateProhibitedPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowReport)) {
            body.put("AllowReport", request.allowReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceKill)) {
            body.put("ForceKill", request.forceKill);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextCh)) {
            body.put("MainButtonTextCh", request.mainButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextEn)) {
            body.put("MainButtonTextEn", request.mainButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextCh)) {
            body.put("MinorButtonTextCh", request.minorButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextEn)) {
            body.put("MinorButtonTextEn", request.minorButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptCh)) {
            body.put("PromptCh", request.promptCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptEn)) {
            body.put("PromptEn", request.promptEn);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.softwareIds)) {
            bodyFlat.put("SoftwareIds", request.softwareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.titleCh)) {
            body.put("TitleCh", request.titleCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.titleEn)) {
            body.put("TitleEn", request.titleEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProhibitedPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProhibitedPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a software prohibition policy.</p>
     * 
     * @param request UpdateProhibitedPolicyRequest
     * @return UpdateProhibitedPolicyResponse
     */
    public UpdateProhibitedPolicyResponse updateProhibitedPolicy(UpdateProhibitedPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProhibitedPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom prohibited software entry.</p>
     * 
     * @param request UpdateProhibitedSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProhibitedSoftwareResponse
     */
    public UpdateProhibitedSoftwareResponse updateProhibitedSoftwareWithOptions(UpdateProhibitedSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.linuxProcesses)) {
            bodyFlat.put("LinuxProcesses", request.linuxProcesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macOSProcesses)) {
            bodyFlat.put("MacOSProcesses", request.macOSProcesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softwareId)) {
            body.put("SoftwareId", request.softwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.windowsProcesses)) {
            bodyFlat.put("WindowsProcesses", request.windowsProcesses);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProhibitedSoftware"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProhibitedSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom prohibited software entry.</p>
     * 
     * @param request UpdateProhibitedSoftwareRequest
     * @return UpdateProhibitedSoftwareResponse
     */
    public UpdateProhibitedSoftwareResponse updateProhibitedSoftware(UpdateProhibitedSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProhibitedSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom prohibited software tag.</p>
     * 
     * @param request UpdateProhibitedTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProhibitedTagResponse
     */
    public UpdateProhibitedTagResponse updateProhibitedTagWithOptions(UpdateProhibitedTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            body.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProhibitedTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProhibitedTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom prohibited software tag.</p>
     * 
     * @param request UpdateProhibitedTagRequest
     * @return UpdateProhibitedTagResponse
     */
    public UpdateProhibitedTagResponse updateProhibitedTag(UpdateProhibitedTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProhibitedTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a device registration policy for your Alibaba Cloud account.</p>
     * 
     * @param tmpReq UpdateRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegistrationPolicyResponse
     */
    public UpdateRegistrationPolicyResponse updateRegistrationPolicyWithOptions(UpdateRegistrationPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRegistrationPolicyShrinkRequest request = new UpdateRegistrationPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyLimitCount)) {
            request.companyLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyLimitCount, "CompanyLimitCount", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personalLimitCount)) {
            request.personalLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personalLimitCount, "PersonalLimitCount", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitCountShrink)) {
            body.put("CompanyLimitCount", request.companyLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitType)) {
            body.put("CompanyLimitType", request.companyLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitCountShrink)) {
            body.put("PersonalLimitCount", request.personalLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitType)) {
            body.put("PersonalLimitType", request.personalLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegistrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a device registration policy for your Alibaba Cloud account.</p>
     * 
     * @param request UpdateRegistrationPolicyRequest
     * @return UpdateRegistrationPolicyResponse
     */
    public UpdateRegistrationPolicyResponse updateRegistrationPolicy(UpdateRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to update the processing status of a specific risk event under your Alibaba Cloud account.</li>
     * <li>When <code>Status</code> is set to <code>Processed</code>, you must provide the <code>RiskConfirm</code> parameter to specify the manually confirmed risk conclusion.</li>
     * <li>If <code>Status</code> is <code>Unprocess</code> or <code>Processing</code>, do not include the <code>RiskConfirm</code> parameter.</li>
     * <li>The <code>RiskScene</code> parameter is optional. If not provided, the system automatically populates it based on <code>RiskId</code>.</li>
     * <li>The <code>RiskConfirmDesc</code> field provides additional explanation or remarks for the processing decision. The length must be 1 to 128 characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the current processing status and conclusion of a specified risk event.</p>
     * 
     * @param request UpdateRiskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRiskStatusResponse
     */
    public UpdateRiskStatusResponse updateRiskStatusWithOptions(UpdateRiskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.riskConfirm)) {
            body.put("RiskConfirm", request.riskConfirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskConfirmDesc)) {
            body.put("RiskConfirmDesc", request.riskConfirmDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskId)) {
            body.put("RiskId", request.riskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskScene)) {
            body.put("RiskScene", request.riskScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRiskStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRiskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to update the processing status of a specific risk event under your Alibaba Cloud account.</li>
     * <li>When <code>Status</code> is set to <code>Processed</code>, you must provide the <code>RiskConfirm</code> parameter to specify the manually confirmed risk conclusion.</li>
     * <li>If <code>Status</code> is <code>Unprocess</code> or <code>Processing</code>, do not include the <code>RiskConfirm</code> parameter.</li>
     * <li>The <code>RiskScene</code> parameter is optional. If not provided, the system automatically populates it based on <code>RiskId</code>.</li>
     * <li>The <code>RiskConfirmDesc</code> field provides additional explanation or remarks for the processing decision. The length must be 1 to 128 characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the current processing status and conclusion of a specified risk event.</p>
     * 
     * @param request UpdateRiskStatusRequest
     * @return UpdateRiskStatusResponse
     */
    public UpdateRiskStatusResponse updateRiskStatus(UpdateRiskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRiskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of uninstall applications in batches under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateUninstallApplicationsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUninstallApplicationsStatusResponse
     */
    public UpdateUninstallApplicationsStatusResponse updateUninstallApplicationsStatusWithOptions(UpdateUninstallApplicationsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUninstallApplicationsStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUninstallApplicationsStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of uninstall applications in batches under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateUninstallApplicationsStatusRequest
     * @return UpdateUninstallApplicationsStatusResponse
     */
    public UpdateUninstallApplicationsStatusResponse updateUninstallApplicationsStatus(UpdateUninstallApplicationsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUninstallApplicationsStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the sharing status of devices for multiple enterprise users.</p>
     * 
     * @param request UpdateUserDevicesSharingStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDevicesSharingStatusResponse
     */
    public UpdateUserDevicesSharingStatusResponse updateUserDevicesSharingStatusWithOptions(UpdateUserDevicesSharingStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharingStatus)) {
            body.put("SharingStatus", request.sharingStatus);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDevicesSharingStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDevicesSharingStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the sharing status of devices for multiple enterprise users.</p>
     * 
     * @param request UpdateUserDevicesSharingStatusRequest
     * @return UpdateUserDevicesSharingStatusResponse
     */
    public UpdateUserDevicesSharingStatusResponse updateUserDevicesSharingStatus(UpdateUserDevicesSharingStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDevicesSharingStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the status of endpoint devices for your Alibaba Cloud account.</p>
     * 
     * @param request UpdateUserDevicesStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDevicesStatusResponse
     */
    public UpdateUserDevicesStatusResponse updateUserDevicesStatusWithOptions(UpdateUserDevicesStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceAction)) {
            body.put("DeviceAction", request.deviceAction);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDevicesStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDevicesStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the status of endpoint devices for your Alibaba Cloud account.</p>
     * 
     * @param request UpdateUserDevicesStatusRequest
     * @return UpdateUserDevicesStatusResponse
     */
    public UpdateUserDevicesStatusResponse updateUserDevicesStatus(UpdateUserDevicesStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDevicesStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a user group under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            bodyFlat.put("Attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a user group under the current Alibaba Cloud account.</p>
     * 
     * @param request UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of users in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateUsersStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUsersStatusResponse
     */
    public UpdateUsersStatusResponse updateUsersStatusWithOptions(UpdateUsersStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.saseUserIds)) {
            query.put("SaseUserIds", request.saseUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUsersStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUsersStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of users in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateUsersStatusRequest
     * @return UpdateUsersStatusResponse
     */
    public UpdateUsersStatusResponse updateUsersStatus(UpdateUsersStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUsersStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Quarantines or trusts a virus file on a specified user terminal device. DevTag, FilePath, and FileMd5 together identify a virus file record. The call fails if the record does not exist. Quarantine is an asynchronous operation. After the server creates a disposal task, the user terminal device pulls and executes it. The same virus file record can only be disposed of once within one minute.</p>
     * 
     * @param request UpdateVirusFileStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVirusFileStatusResponse
     */
    public UpdateVirusFileStatusResponse updateVirusFileStatusWithOptions(UpdateVirusFileStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devTag)) {
            body.put("DevTag", request.devTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileMd5)) {
            body.put("FileMd5", request.fileMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virusType)) {
            body.put("VirusType", request.virusType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVirusFileStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirusFileStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Quarantines or trusts a virus file on a specified user terminal device. DevTag, FilePath, and FileMd5 together identify a virus file record. The call fails if the record does not exist. Quarantine is an asynchronous operation. After the server creates a disposal task, the user terminal device pulls and executes it. The same virus file record can only be disposed of once within one minute.</p>
     * 
     * @param request UpdateVirusFileStatusRequest
     * @return UpdateVirusFileStatusResponse
     */
    public UpdateVirusFileStatusResponse updateVirusFileStatus(UpdateVirusFileStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVirusFileStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the anti-virus global configuration for the current Alibaba Cloud account. The four configuration items are treated as a whole and are entirely overwritten with each call. Therefore, pass in the complete configuration with each call: set VirusFileUpload to false, UploadFileSuffixBlacklist to empty, and UploadFileMaxSize and UploadFileMaxSpeed to 0 (no limit). After VirusFileUpload is changed, the virus file upload module switch is synchronously updated, which affects whether cloud-based STS tokens are issued to user terminal devices.</p>
     * 
     * @param request UpdateVirusScanGlobalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVirusScanGlobalConfigResponse
     */
    public UpdateVirusScanGlobalConfigResponse updateVirusScanGlobalConfigWithOptions(UpdateVirusScanGlobalConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uploadFileMaxSize)) {
            body.put("UploadFileMaxSize", request.uploadFileMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadFileMaxSpeed)) {
            body.put("UploadFileMaxSpeed", request.uploadFileMaxSpeed);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uploadFileSuffixBlacklist)) {
            bodyFlat.put("UploadFileSuffixBlacklist", request.uploadFileSuffixBlacklist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virusFileUpload)) {
            body.put("VirusFileUpload", request.virusFileUpload);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVirusScanGlobalConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirusScanGlobalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the anti-virus global configuration for the current Alibaba Cloud account. The four configuration items are treated as a whole and are entirely overwritten with each call. Therefore, pass in the complete configuration with each call: set VirusFileUpload to false, UploadFileSuffixBlacklist to empty, and UploadFileMaxSize and UploadFileMaxSpeed to 0 (no limit). After VirusFileUpload is changed, the virus file upload module switch is synchronously updated, which affects whether cloud-based STS tokens are issued to user terminal devices.</p>
     * 
     * @param request UpdateVirusScanGlobalConfigRequest
     * @return UpdateVirusScanGlobalConfigResponse
     */
    public UpdateVirusScanGlobalConfigResponse updateVirusScanGlobalConfig(UpdateVirusScanGlobalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVirusScanGlobalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a specified scheduled virus scan policy. The Whitelist parameter performs a full overwrite, meaning the provided list replaces the existing exception user list of the policy.</p>
     * 
     * @param request UpdateVirusScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVirusScanScheduledStrategyResponse
     */
    public UpdateVirusScanScheduledStrategyResponse updateVirusScanScheduledStrategyWithOptions(UpdateVirusScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.highRiskOperation)) {
            body.put("HighRiskOperation", request.highRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowRiskOperation)) {
            body.put("LowRiskOperation", request.lowRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCpuUsage)) {
            body.put("MaxCpuUsage", request.maxCpuUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.midRiskOperation)) {
            body.put("MidRiskOperation", request.midRiskOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.performanceMode)) {
            body.put("PerformanceMode", request.performanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanBeginTime)) {
            body.put("ScanBeginTime", request.scanBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanEndTime)) {
            body.put("ScanEndTime", request.scanEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanFrequency)) {
            body.put("ScanFrequency", request.scanFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanInterval)) {
            body.put("ScanInterval", request.scanInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanMode)) {
            body.put("ScanMode", request.scanMode);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scanPath)) {
            bodyFlat.put("ScanPath", request.scanPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanTargets)) {
            bodyFlat.put("ScanTargets", request.scanTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyDescription)) {
            body.put("StrategyDescription", request.strategyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            body.put("StrategyId", request.strategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            body.put("StrategyName", request.strategyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVirusScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirusScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a specified scheduled virus scan policy. The Whitelist parameter performs a full overwrite, meaning the provided list replaces the existing exception user list of the policy.</p>
     * 
     * @param request UpdateVirusScanScheduledStrategyRequest
     * @return UpdateVirusScanScheduledStrategyResponse
     */
    public UpdateVirusScanScheduledStrategyResponse updateVirusScanScheduledStrategy(UpdateVirusScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVirusScanScheduledStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the global vulnerability scanning configuration for the current Alibaba Cloud account and returns the complete updated configuration.</p>
     * 
     * @param tmpReq UpdateVulScanGlobalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVulScanGlobalConfigResponse
     */
    public UpdateVulScanGlobalConfigResponse updateVulScanGlobalConfigWithOptions(UpdateVulScanGlobalConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateVulScanGlobalConfigShrinkRequest request = new UpdateVulScanGlobalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.wuyingVulFixConfig)) {
            request.wuyingVulFixConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.wuyingVulFixConfig, "WuyingVulFixConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxDownloadSpeed)) {
            body.put("MaxDownloadSpeed", request.maxDownloadSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingVulFixConfigShrink)) {
            body.put("WuyingVulFixConfig", request.wuyingVulFixConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVulScanGlobalConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVulScanGlobalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the global vulnerability scanning configuration for the current Alibaba Cloud account and returns the complete updated configuration.</p>
     * 
     * @param request UpdateVulScanGlobalConfigRequest
     * @return UpdateVulScanGlobalConfigResponse
     */
    public UpdateVulScanGlobalConfigResponse updateVulScanGlobalConfig(UpdateVulScanGlobalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVulScanGlobalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a specified vulnerability scheduled scan policy and returns the complete updated configuration.</p>
     * 
     * @param request UpdateVulScanScheduledStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVulScanScheduledStrategyResponse
     */
    public UpdateVulScanScheduledStrategyResponse updateVulScanScheduledStrategyWithOptions(UpdateVulScanScheduledStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanBeginTime)) {
            body.put("ScanBeginTime", request.scanBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanEndTime)) {
            body.put("ScanEndTime", request.scanEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanFrequency)) {
            body.put("ScanFrequency", request.scanFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanInterval)) {
            body.put("ScanInterval", request.scanInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyDescription)) {
            body.put("StrategyDescription", request.strategyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            body.put("StrategyId", request.strategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            body.put("StrategyName", request.strategyName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVulScanScheduledStrategy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVulScanScheduledStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a specified vulnerability scheduled scan policy and returns the complete updated configuration.</p>
     * 
     * @param request UpdateVulScanScheduledStrategyRequest
     * @return UpdateVulScanScheduledStrategyResponse
     */
    public UpdateVulScanScheduledStrategyResponse updateVulScanScheduledStrategy(UpdateVulScanScheduledStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVulScanScheduledStrategyWithOptions(request, runtime);
    }
}
