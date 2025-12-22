// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626;

import com.aliyun.tea.*;
import com.aliyun.nas20170626.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou-finance", "nas.cn-hangzhou-dg-a01.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "nas.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "nas.aliyuncs.com"),
            new TeaPair("cn-fujian", "nas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "nas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "nas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "nas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "nas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "nas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "nas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "nas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>The API operation is available only for CPFS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a client to the blacklist of a Cloud Parallel File Storage (CPFS) file system and revokes the write access from the client. The blacklist serves as an I/O fence.</p>
     * 
     * @deprecated OpenAPI AddClientToBlackList is deprecated
     * 
     * @param request AddClientToBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    // Deprecated
    public AddClientToBlackListResponse addClientToBlackListWithOptions(AddClientToBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddClientToBlackList"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddClientToBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for CPFS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a client to the blacklist of a Cloud Parallel File Storage (CPFS) file system and revokes the write access from the client. The blacklist serves as an I/O fence.</p>
     * 
     * @deprecated OpenAPI AddClientToBlackList is deprecated
     * 
     * @param request AddClientToBlackListRequest
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    // Deprecated
    public AddClientToBlackListResponse addClientToBlackList(AddClientToBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClientToBlackListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * <li>You can apply only one automatic snapshot policy to each file system.</li>
     * <li>Each automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If an automatic snapshot policy is applied to a file system, you can call the ApplyAutoSnapshotPolicy operation to change the automatic snapshot policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies an automatic snapshot policy to one or more file systems.</p>
     * 
     * @param request ApplyAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemIds)) {
            query.put("FileSystemIds", request.fileSystemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * <li>You can apply only one automatic snapshot policy to each file system.</li>
     * <li>Each automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If an automatic snapshot policy is applied to a file system, you can call the ApplyAutoSnapshotPolicy operation to change the automatic snapshot policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies an automatic snapshot policy to one or more file systems.</p>
     * 
     * @param request ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add AutoRefresh configurations only to the dataflows that are in the <code>Running</code> state.</li>
     * <li>You can add a maximum of five AutoRefresh configurations to a dataflow.</li>
     * <li>It generally takes 2 to 5 minutes to create an AutoRefresh configuration. You can call the <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> operation to query the dataflow status.</li>
     * <li>AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.
     * **
     * <strong>Note</strong> The event buses and event rules created for CPFS in the EventBridge console contain the <code>Create for cpfs auto refresh</code> description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.</li>
     * <li>The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS data flow.</li>
     * <li>After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a data flow task to load the updated data.</li>
     * <li>AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS data flow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the data flow status becomes Misconfigured. To resolve these issues, you can increase the data flow specifications or reduce the frequency of triggering the object modification event.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds AutoRefresh configurations to a dataflow.</p>
     * 
     * @param request ApplyDataFlowAutoRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyDataFlowAutoRefreshResponse
     */
    public ApplyDataFlowAutoRefreshResponse applyDataFlowAutoRefreshWithOptions(ApplyDataFlowAutoRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshInterval)) {
            query.put("AutoRefreshInterval", request.autoRefreshInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshPolicy)) {
            query.put("AutoRefreshPolicy", request.autoRefreshPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshs)) {
            query.put("AutoRefreshs", request.autoRefreshs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDataFlowAutoRefresh"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDataFlowAutoRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add AutoRefresh configurations only to the dataflows that are in the <code>Running</code> state.</li>
     * <li>You can add a maximum of five AutoRefresh configurations to a dataflow.</li>
     * <li>It generally takes 2 to 5 minutes to create an AutoRefresh configuration. You can call the <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> operation to query the dataflow status.</li>
     * <li>AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.
     * **
     * <strong>Note</strong> The event buses and event rules created for CPFS in the EventBridge console contain the <code>Create for cpfs auto refresh</code> description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.</li>
     * <li>The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS data flow.</li>
     * <li>After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a data flow task to load the updated data.</li>
     * <li>AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS data flow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the data flow status becomes Misconfigured. To resolve these issues, you can increase the data flow specifications or reduce the frequency of triggering the object modification event.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds AutoRefresh configurations to a dataflow.</p>
     * 
     * @param request ApplyDataFlowAutoRefreshRequest
     * @return ApplyDataFlowAutoRefreshResponse
     */
    public ApplyDataFlowAutoRefreshResponse applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only CPFS for Lingjun supports this operation.</p>
     * <ul>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIDs, meaning the VscId in the ResourceIds must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates the VSC device with the file system.</p>
     * 
     * @param request AttachVscToFilesystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachVscToFilesystemsResponse
     */
    public AttachVscToFilesystemsResponse attachVscToFilesystemsWithOptions(AttachVscToFilesystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVscToFilesystems"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVscToFilesystemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only CPFS for Lingjun supports this operation.</p>
     * <ul>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIDs, meaning the VscId in the ResourceIds must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates the VSC device with the file system.</p>
     * 
     * @param request AttachVscToFilesystemsRequest
     * @return AttachVscToFilesystemsResponse
     */
    public AttachVscToFilesystemsResponse attachVscToFilesystems(AttachVscToFilesystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVscToFilesystemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes automatic snapshot policies from one or more file systems.</p>
     * 
     * @param request CancelAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemIds)) {
            query.put("FileSystemIds", request.fileSystemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes automatic snapshot policies from one or more file systems.</p>
     * 
     * @param request CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can cancel AutoRefresh configurations only for the dataflows that are in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to cancel the AutoRefresh configurations. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the status of the AutoRefresh tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the AutoRefresh configuration for a dataflow.</p>
     * 
     * @param request CancelDataFlowAutoRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDataFlowAutoRefreshResponse
     */
    public CancelDataFlowAutoRefreshResponse cancelDataFlowAutoRefreshWithOptions(CancelDataFlowAutoRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshPath)) {
            query.put("RefreshPath", request.refreshPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDataFlowAutoRefresh"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDataFlowAutoRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can cancel AutoRefresh configurations only for the dataflows that are in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to cancel the AutoRefresh configurations. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the status of the AutoRefresh tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the AutoRefresh configuration for a dataflow.</p>
     * 
     * @param request CancelDataFlowAutoRefreshRequest
     * @return CancelDataFlowAutoRefreshResponse
     */
    public CancelDataFlowAutoRefreshResponse cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can cancel a data streaming task only when the task is in the CREATED or RUNNING state.</li>
     * <li>Data streaming tasks are executed asynchronously. You can call the DescribeDataFlowSubTasks operation to query the task execution status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data streaming task.</p>
     * 
     * @param request CancelDataFlowSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDataFlowSubTaskResponse
     */
    public CancelDataFlowSubTaskResponse cancelDataFlowSubTaskWithOptions(CancelDataFlowSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowSubTaskId)) {
            query.put("DataFlowSubTaskId", request.dataFlowSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowTaskId)) {
            query.put("DataFlowTaskId", request.dataFlowTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDataFlowSubTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDataFlowSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can cancel a data streaming task only when the task is in the CREATED or RUNNING state.</li>
     * <li>Data streaming tasks are executed asynchronously. You can call the DescribeDataFlowSubTasks operation to query the task execution status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data streaming task.</p>
     * 
     * @param request CancelDataFlowSubTaskRequest
     * @return CancelDataFlowSubTaskResponse
     */
    public CancelDataFlowSubTaskResponse cancelDataFlowSubTask(CancelDataFlowSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can cancel only the data flow tasks that are in the <code>Pending</code> and <code>Executing</code> states.</li>
     * <li>It generally takes 5 to 10 minutes to cancel a data flow task. You can query the task execution status by calling the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation.</li>
     * <li>If a data streaming task contains running subtasks, you cannot cancel the streaming task. Otherwise, an InvalidStatus.ResourceMismatch error message is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a batch or streaming task that is in the Pending or Execute state.</p>
     * 
     * @param request CancelDataFlowTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDataFlowTaskResponse
     */
    public CancelDataFlowTaskResponse cancelDataFlowTaskWithOptions(CancelDataFlowTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDataFlowTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDataFlowTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can cancel only the data flow tasks that are in the <code>Pending</code> and <code>Executing</code> states.</li>
     * <li>It generally takes 5 to 10 minutes to cancel a data flow task. You can query the task execution status by calling the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation.</li>
     * <li>If a data streaming task contains running subtasks, you cannot cancel the streaming task. Otherwise, an InvalidStatus.ResourceMismatch error message is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a batch or streaming task that is in the Pending or Execute state.</p>
     * 
     * @param request CancelDataFlowTaskRequest
     * @return CancelDataFlowTaskResponse
     */
    public CancelDataFlowTaskResponse cancelDataFlowTask(CancelDataFlowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the directory quota of a file system.</p>
     * 
     * @param request CancelDirQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDirQuotaResponse
     */
    public CancelDirQuotaResponse cancelDirQuotaWithOptions(CancelDirQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDirQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDirQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the directory quota of a file system.</p>
     * 
     * @param request CancelDirQuotaRequest
     * @return CancelDirQuotaResponse
     */
    public CancelDirQuotaResponse cancelDirQuota(CancelDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDirQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.7.0 and later support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the quota set for a fileset.</p>
     * 
     * @param request CancelFilesetQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelFilesetQuotaResponse
     */
    public CancelFilesetQuotaResponse cancelFilesetQuotaWithOptions(CancelFilesetQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelFilesetQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelFilesetQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.7.0 and later support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the quota set for a fileset.</p>
     * 
     * @param request CancelFilesetQuotaRequest
     * @return CancelFilesetQuotaResponse
     */
    public CancelFilesetQuotaResponse cancelFilesetQuota(CancelFilesetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelFilesetQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a running data retrieval task.</p>
     * 
     * @param request CancelLifecycleRetrieveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelLifecycleRetrieveJobResponse
     */
    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJobWithOptions(CancelLifecycleRetrieveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelLifecycleRetrieveJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelLifecycleRetrieveJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a running data retrieval task.</p>
     * 
     * @param request CancelLifecycleRetrieveJobRequest
     * @return CancelLifecycleRetrieveJobResponse
     */
    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.</li>
     * <li>If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.</li>
     * <li>If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a running job of the recycle bin.</p>
     * 
     * @param request CancelRecycleBinJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRecycleBinJobResponse
     */
    public CancelRecycleBinJobResponse cancelRecycleBinJobWithOptions(CancelRecycleBinJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRecycleBinJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRecycleBinJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.</li>
     * <li>If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.</li>
     * <li>If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a running job of the recycle bin.</p>
     * 
     * @param request CancelRecycleBinJobRequest
     * @return CancelRecycleBinJobResponse
     */
    public CancelRecycleBinJobResponse cancelRecycleBinJob(CancelRecycleBinJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRecycleBinJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a file system belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("version", "2017-06-26"),
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
     * <b>summary</b> : 
     * <p>Changes the resource group to which a file system belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a permission group.</p>
     * 
     * @param request CreateAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessGroupResponse
     */
    public CreateAccessGroupResponse createAccessGroupWithOptions(CreateAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupType)) {
            query.put("AccessGroupType", request.accessGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessGroup"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a permission group.</p>
     * 
     * @param request CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    public CreateAccessGroupResponse createAccessGroup(CreateAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you call the CreateAccessPoint operation, an access point is not immediately created. Therefore, after you call the CreateAccessPoint operation successfully, call the <a href="https://help.aliyun.com/document_detail/2712239.html">DescribeAccessPoints</a> or <a href="https://help.aliyun.com/document_detail/2712240.html">DescribeAccessPoint</a> operation to query the status of the access point. If the status is <strong>Active</strong>, mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * <ul>
     * <li>Only General-purpose Network File System (NFS) file systems support access points.</li>
     * <li>If you want to call the EnabledRam operation to enable a Resource Access Management (RAM) policy, you must configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an access point.</p>
     * 
     * @param request CreateAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessPointResponse
     */
    public CreateAccessPointResponse createAccessPointWithOptions(CreateAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroup)) {
            query.put("AccessGroup", request.accessGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointName)) {
            query.put("AccessPointName", request.accessPointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabledRam)) {
            query.put("EnabledRam", request.enabledRam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerGroupId)) {
            query.put("OwnerGroupId", request.ownerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posixGroupId)) {
            query.put("PosixGroupId", request.posixGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posixSecondaryGroupIds)) {
            query.put("PosixSecondaryGroupIds", request.posixSecondaryGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posixUserId)) {
            query.put("PosixUserId", request.posixUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDirectory)) {
            query.put("RootDirectory", request.rootDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswId)) {
            query.put("VswId", request.vswId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After you call the CreateAccessPoint operation, an access point is not immediately created. Therefore, after you call the CreateAccessPoint operation successfully, call the <a href="https://help.aliyun.com/document_detail/2712239.html">DescribeAccessPoints</a> or <a href="https://help.aliyun.com/document_detail/2712240.html">DescribeAccessPoint</a> operation to query the status of the access point. If the status is <strong>Active</strong>, mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * <ul>
     * <li>Only General-purpose Network File System (NFS) file systems support access points.</li>
     * <li>If you want to call the EnabledRam operation to enable a Resource Access Management (RAM) policy, you must configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an access point.</p>
     * 
     * @param request CreateAccessPointRequest
     * @return CreateAccessPointResponse
     */
    public CreateAccessPointResponse createAccessPoint(CreateAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a rule for a permission group.</p>
     * 
     * @param request CreateAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createAccessRuleWithOptions(CreateAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6SourceCidrIp)) {
            query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RWAccessType)) {
            query.put("RWAccessType", request.RWAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessType)) {
            query.put("UserAccessType", request.userAccessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessRule"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a rule for a permission group.</p>
     * 
     * @param request CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createAccessRule(CreateAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account.</li>
     * <li>If an auto snapshot is being created when the scheduled time for a new auto snapshot arrives, the creation of the new snapshot is skipped. This occurs if the file system stores a large volume of data. For example, you have scheduled auto snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a file system. The system starts to create an auto snapshot at 09:00:00 and does not complete the process until 10:20:00. The process takes 80 minutes because the file system has a large volume of data. In this case, the system does not create an auto snapshot at 10:00:00, but creates an auto snapshot at 11:00:00.</li>
     * <li>A maximum of 128 auto snapshots can be created for a file system. If the upper limit is reached, the earliest auto snapshot is deleted. This rule does not apply to manual snapshots.</li>
     * <li>If you modify the retention period of an automatic snapshot policy, the modification applies only to subsequent snapshots, but not to the existing snapshots.</li>
     * <li>If an auto snapshot is being created for a file system, you cannot create a manual snapshot for the file system. You must wait after the auto snapshot is created.</li>
     * <li>You can only apply automatic snapshot policies to a file system that is in the Running state.</li>
     * <li>All auto snapshots are named in the <code>auto_yyyyMMdd_X</code> format, where: <code>auto</code> indicates that the snapshot is created based on an automatic snapshot policy. <code>yyyyMMdd</code> indicates the date on which the snapshot is created. <code>y</code> indicates the year. <code>M</code> indicates the month. <code>d</code> indicates the day. <code>X</code> indicates the ordinal number of the snapshot on the current day. For example, <code>auto_20201018_1</code> indicates the first auto snapshot that was created on October 18, 2020.</li>
     * <li>After an automatic snapshot policy is created, you can call the ApplyAutoSnapshotPolicy operation to apply the policy to a file system and call the ModifyAutoSnapshotPolicy operation to modify the policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic snapshot policy.</p>
     * 
     * @param request CreateAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyName)) {
            query.put("AutoSnapshotPolicyName", request.autoSnapshotPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatWeekdays)) {
            query.put("RepeatWeekdays", request.repeatWeekdays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoints)) {
            query.put("TimePoints", request.timePoints);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account.</li>
     * <li>If an auto snapshot is being created when the scheduled time for a new auto snapshot arrives, the creation of the new snapshot is skipped. This occurs if the file system stores a large volume of data. For example, you have scheduled auto snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a file system. The system starts to create an auto snapshot at 09:00:00 and does not complete the process until 10:20:00. The process takes 80 minutes because the file system has a large volume of data. In this case, the system does not create an auto snapshot at 10:00:00, but creates an auto snapshot at 11:00:00.</li>
     * <li>A maximum of 128 auto snapshots can be created for a file system. If the upper limit is reached, the earliest auto snapshot is deleted. This rule does not apply to manual snapshots.</li>
     * <li>If you modify the retention period of an automatic snapshot policy, the modification applies only to subsequent snapshots, but not to the existing snapshots.</li>
     * <li>If an auto snapshot is being created for a file system, you cannot create a manual snapshot for the file system. You must wait after the auto snapshot is created.</li>
     * <li>You can only apply automatic snapshot policies to a file system that is in the Running state.</li>
     * <li>All auto snapshots are named in the <code>auto_yyyyMMdd_X</code> format, where: <code>auto</code> indicates that the snapshot is created based on an automatic snapshot policy. <code>yyyyMMdd</code> indicates the date on which the snapshot is created. <code>y</code> indicates the year. <code>M</code> indicates the month. <code>d</code> indicates the day. <code>X</code> indicates the ordinal number of the snapshot on the current day. For example, <code>auto_20201018_1</code> indicates the first auto snapshot that was created on October 18, 2020.</li>
     * <li>After an automatic snapshot policy is created, you can call the ApplyAutoSnapshotPolicy operation to apply the policy to a file system and call the ModifyAutoSnapshotPolicy operation to modify the policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic snapshot policy.</p>
     * 
     * @param request CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Basic operations
     *     *   Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support data flows.
     *     *   You can create a data flow only when a CPFS or CPFS for Lingjun file system is in the Running state.
     *     *   A maximum of 10 data flows can be created for a CPFS or CPFS for Lingjun file system.
     *     *   It generally takes 2 to 5 minutes to create a data flow. You can call the DescribeDataFlows operation to check whether the data flow has been created.</p>
     * <ul>
     * <li>Permission
     * When you create a data flow, CPFS obtains the following two service-linked roles: <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code>. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">CPFS service-linked roles</a>.</li>
     * <li>CPFS usage notes<ul>
     * <li>Billing<ul>
     * <li>If you create a data flow, you are charged for using the data flow throughput. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing of CPFS</a>.</li>
     * <li>When you configure the AutoRefresh feature for a data flow, CPFS must use EventBridge to collect object modification events from the source Object Storage Service (OSS) bucket. Event fees are incurred. For more information, see <a href="https://help.aliyun.com/document_detail/163752.html">Billing of EventBridge</a>.</li>
     * </ul>
     * </li>
     * <li>Data flow specifications<ul>
     * <li>The data flow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data flow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a data flow.</li>
     * <li>When you create a data flow, the vSwitch IP addresses used by a CPFS mount target are consumed. Make sure that the vSwitch can provide sufficient IP addresses.</li>
     * <li>Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the data flow whose throughput is changed meet the requirements.</li>
     * </ul>
     * </li>
     * <li>Fileset<ul>
     * <li>The destination for a data flow is a fileset in the CPFS file system. A fileset is a new directory tree structure (a small file directory) in a CPFS file system. Each fileset independently manages an inode space.</li>
     * <li>When you create a data flow for a CPFS file system, the related fileset must already exist and cannot be nested with other filesets. Only one data flow can be created in a fileset, which corresponds to one source storage.</li>
     * <li>A fileset supports a maximum of one million files. If the number of files imported from an OSS bucket into the fileset exceeds the upper limit, the <code>no space</code> error message is returned when you add new files.
     * **
     * **Note **If data already exists in the fileset, after you create a data flow, the existing data in the fileset is cleared and replaced with the data synchronized from the OSS bucket.</li>
     * </ul>
     * </li>
     * <li>AutoRefresh<ul>
     * <li>After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a data flow task to load the updated data.</li>
     * <li>AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.</li>
     * <li>The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. You can configure a maximum of five AutoRefresh directories for a data flow.</li>
     * <li>AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS data flow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the data flow status becomes <code>Misconfigured</code>. To resolve these issues, you can increase the data flow specifications or reduce the frequency of triggering the object modification event.</li>
     * <li>When you add an AutoRefresh configuration to the prefix for a CPFS data flow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS data flow.
     * **
     * **Note **The event buses and event rules created for CPFS in the EventBridge console contain the <code>Create for cpfs auto refresh</code> description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.</li>
     * </ul>
     * </li>
     * <li>Source storage<ul>
     * <li>The source storage is an OSS bucket. SourceStorage for a data flow must be an OSS bucket.</li>
     * <li>CPFS data flows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.</li>
     * <li>If data flows for multiple CPFS file systems or multiple data flows for the same CPFS file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS file systems to one OSS bucket.</li>
     * <li>Data flows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.
     * **
     * **Note **Before you create a data flow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created data flow can access the data in the OSS bucket. When a data flow is being used, do not delete or modify the tag. Otherwise, the data flow for CPFS cannot access the data in the OSS bucket.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Source storage<ul>
     * <li>The source storage is an OSS bucket. SourceStorage for a data flow must be an OSS bucket.</li>
     * <li>CPFS for Lingjun data flows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.</li>
     * <li>If data flows for multiple CPFS for Lingjun file systems or multiple data flows for the same CPFS for Lingjun file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS for Lingjun file systems to one OSS bucket.</li>
     * <li>Data flows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.</li>
     * <li>CPFS for Lingjun V2.6.0 and later allow you to create data flows for OSS buckets across accounts.</li>
     * <li>The account id parameter is required only when you use OSS buckets across accounts.</li>
     * <li>To use OSS buckets across accounts, you must first grant permissions to the related accounts. For more information, see <a href="https://help.aliyun.com/document_detail/2713462.html">Cross-account authorization on data flows</a>.
     * **
     * **Note **Before you create a data flow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created data flow can access the data in the OSS bucket. When a data flow is being used, do not delete or modify the tag. Otherwise, the data flow for CPFS for Lingjun cannot access the data in the OSS bucket.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on file systems<ul>
     * <li>You cannot rename a non-empty directory in a path that is associated with a data flow. Otherwise, the Permission Denied error message or an error message indicating that the directory is not empty is returned.</li>
     * <li>Proceed with caution when you use special characters in the names of directories and files. The following characters are supported: letters, digits, exclamation points (!), hyphens (-), underscores (_), periods (.), asterisks (\*), and parentheses (()).</li>
     * <li>The path can be up to 1,023 characters in length.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on import<ul>
     * <li>After a symbolic link is imported to CPFS for Lingjun, the symbolic link is converted into a common data file that contains no symbolic link information.</li>
     * <li>If an OSS bucket has multiple versions, only data of the latest version is used.</li>
     * <li>The name of a file or a subdirectory can be up to 255 bytes in length.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on export<ul>
     * <li>After a symbolic link is synchronized to OSS, the file that the symbolic link points to is not synchronized to OSS. In this case, the symbolic link is converted into a common object that contains no data.</li>
     * <li>Hard links can be synchronized to OSS only as common files that contain no link information.</li>
     * <li>After a file of the Socket, Device, or Pipe type is exported to an OSS bucket, the file is converted into a common object that contains no data.</li>
     * <li>The directory path can be up to 1,023 characters in length.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dataflow for a Cloud Parallel File Storage (CPFS) file system and source storage.</p>
     * 
     * @param request CreateDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataFlowResponse
     */
    public CreateDataFlowResponse createDataFlowWithOptions(CreateDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshInterval)) {
            query.put("AutoRefreshInterval", request.autoRefreshInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshPolicy)) {
            query.put("AutoRefreshPolicy", request.autoRefreshPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshs)) {
            query.put("AutoRefreshs", request.autoRefreshs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemPath)) {
            query.put("FileSystemPath", request.fileSystemPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSecurityType)) {
            query.put("SourceSecurityType", request.sourceSecurityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceStorage)) {
            query.put("SourceStorage", request.sourceStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceStoragePath)) {
            query.put("SourceStoragePath", request.sourceStoragePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughput)) {
            query.put("Throughput", request.throughput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Basic operations
     *     *   Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support data flows.
     *     *   You can create a data flow only when a CPFS or CPFS for Lingjun file system is in the Running state.
     *     *   A maximum of 10 data flows can be created for a CPFS or CPFS for Lingjun file system.
     *     *   It generally takes 2 to 5 minutes to create a data flow. You can call the DescribeDataFlows operation to check whether the data flow has been created.</p>
     * <ul>
     * <li>Permission
     * When you create a data flow, CPFS obtains the following two service-linked roles: <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code>. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">CPFS service-linked roles</a>.</li>
     * <li>CPFS usage notes<ul>
     * <li>Billing<ul>
     * <li>If you create a data flow, you are charged for using the data flow throughput. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing of CPFS</a>.</li>
     * <li>When you configure the AutoRefresh feature for a data flow, CPFS must use EventBridge to collect object modification events from the source Object Storage Service (OSS) bucket. Event fees are incurred. For more information, see <a href="https://help.aliyun.com/document_detail/163752.html">Billing of EventBridge</a>.</li>
     * </ul>
     * </li>
     * <li>Data flow specifications<ul>
     * <li>The data flow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data flow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a data flow.</li>
     * <li>When you create a data flow, the vSwitch IP addresses used by a CPFS mount target are consumed. Make sure that the vSwitch can provide sufficient IP addresses.</li>
     * <li>Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the data flow whose throughput is changed meet the requirements.</li>
     * </ul>
     * </li>
     * <li>Fileset<ul>
     * <li>The destination for a data flow is a fileset in the CPFS file system. A fileset is a new directory tree structure (a small file directory) in a CPFS file system. Each fileset independently manages an inode space.</li>
     * <li>When you create a data flow for a CPFS file system, the related fileset must already exist and cannot be nested with other filesets. Only one data flow can be created in a fileset, which corresponds to one source storage.</li>
     * <li>A fileset supports a maximum of one million files. If the number of files imported from an OSS bucket into the fileset exceeds the upper limit, the <code>no space</code> error message is returned when you add new files.
     * **
     * **Note **If data already exists in the fileset, after you create a data flow, the existing data in the fileset is cleared and replaced with the data synchronized from the OSS bucket.</li>
     * </ul>
     * </li>
     * <li>AutoRefresh<ul>
     * <li>After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a data flow task to load the updated data.</li>
     * <li>AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.</li>
     * <li>The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. You can configure a maximum of five AutoRefresh directories for a data flow.</li>
     * <li>AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS data flow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the data flow status becomes <code>Misconfigured</code>. To resolve these issues, you can increase the data flow specifications or reduce the frequency of triggering the object modification event.</li>
     * <li>When you add an AutoRefresh configuration to the prefix for a CPFS data flow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS data flow.
     * **
     * **Note **The event buses and event rules created for CPFS in the EventBridge console contain the <code>Create for cpfs auto refresh</code> description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.</li>
     * </ul>
     * </li>
     * <li>Source storage<ul>
     * <li>The source storage is an OSS bucket. SourceStorage for a data flow must be an OSS bucket.</li>
     * <li>CPFS data flows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.</li>
     * <li>If data flows for multiple CPFS file systems or multiple data flows for the same CPFS file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS file systems to one OSS bucket.</li>
     * <li>Data flows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.
     * **
     * **Note **Before you create a data flow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created data flow can access the data in the OSS bucket. When a data flow is being used, do not delete or modify the tag. Otherwise, the data flow for CPFS cannot access the data in the OSS bucket.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Source storage<ul>
     * <li>The source storage is an OSS bucket. SourceStorage for a data flow must be an OSS bucket.</li>
     * <li>CPFS for Lingjun data flows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.</li>
     * <li>If data flows for multiple CPFS for Lingjun file systems or multiple data flows for the same CPFS for Lingjun file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS for Lingjun file systems to one OSS bucket.</li>
     * <li>Data flows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.</li>
     * <li>CPFS for Lingjun V2.6.0 and later allow you to create data flows for OSS buckets across accounts.</li>
     * <li>The account id parameter is required only when you use OSS buckets across accounts.</li>
     * <li>To use OSS buckets across accounts, you must first grant permissions to the related accounts. For more information, see <a href="https://help.aliyun.com/document_detail/2713462.html">Cross-account authorization on data flows</a>.
     * **
     * **Note **Before you create a data flow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created data flow can access the data in the OSS bucket. When a data flow is being used, do not delete or modify the tag. Otherwise, the data flow for CPFS for Lingjun cannot access the data in the OSS bucket.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on file systems<ul>
     * <li>You cannot rename a non-empty directory in a path that is associated with a data flow. Otherwise, the Permission Denied error message or an error message indicating that the directory is not empty is returned.</li>
     * <li>Proceed with caution when you use special characters in the names of directories and files. The following characters are supported: letters, digits, exclamation points (!), hyphens (-), underscores (_), periods (.), asterisks (\*), and parentheses (()).</li>
     * <li>The path can be up to 1,023 characters in length.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on import<ul>
     * <li>After a symbolic link is imported to CPFS for Lingjun, the symbolic link is converted into a common data file that contains no symbolic link information.</li>
     * <li>If an OSS bucket has multiple versions, only data of the latest version is used.</li>
     * <li>The name of a file or a subdirectory can be up to 255 bytes in length.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on export<ul>
     * <li>After a symbolic link is synchronized to OSS, the file that the symbolic link points to is not synchronized to OSS. In this case, the symbolic link is converted into a common object that contains no data.</li>
     * <li>Hard links can be synchronized to OSS only as common files that contain no link information.</li>
     * <li>After a file of the Socket, Device, or Pipe type is exported to an OSS bucket, the file is converted into a common object that contains no data.</li>
     * <li>The directory path can be up to 1,023 characters in length.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dataflow for a Cloud Parallel File Storage (CPFS) file system and source storage.</p>
     * 
     * @param request CreateDataFlowRequest
     * @return CreateDataFlowResponse
     */
    public CreateDataFlowResponse createDataFlow(CreateDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can create subtasks only for a data streaming subtask in the Executing state.</li>
     * <li>Data streaming tasks are executed asynchronously. You can call the DescribeDataFlowSubTasks operation to query the task execution status.</li>
     * <li>When the type of data flow task is streaming, the running status only indicates that a streaming import or export task can be created. It does not indicate that the import or export task is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data streaming subtask.</p>
     * 
     * @param request CreateDataFlowSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataFlowSubTaskResponse
     */
    public CreateDataFlowSubTaskResponse createDataFlowSubTaskWithOptions(CreateDataFlowSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowTaskId)) {
            query.put("DataFlowTaskId", request.dataFlowTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstFilePath)) {
            query.put("DstFilePath", request.dstFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcFilePath)) {
            query.put("SrcFilePath", request.srcFilePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataFlowSubTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataFlowSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can create subtasks only for a data streaming subtask in the Executing state.</li>
     * <li>Data streaming tasks are executed asynchronously. You can call the DescribeDataFlowSubTasks operation to query the task execution status.</li>
     * <li>When the type of data flow task is streaming, the running status only indicates that a streaming import or export task can be created. It does not indicate that the import or export task is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data streaming subtask.</p>
     * 
     * @param request CreateDataFlowSubTaskRequest
     * @return CreateDataFlowSubTaskResponse
     */
    public CreateDataFlowSubTaskResponse createDataFlowSubTask(CreateDataFlowSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  CPFS usage notes
     *     *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     *     *   Dataflow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.
     *     *   You can create a dataflow task only for a dataflow that is in the Running state.
     *     *   When you manually run a dataflow task, the automatic data update task for the dataflow is interrupted and enters the pending state.
     *     *   When you create an export task, make sure that the total length of the absolute path of the files to be exported from a CPFS file system does not exceed 1,023 characters.</p>
     * <ul>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Only CPFS for Lingjun V2.4.0 and later support dataflow. You can view the version information on the file system details page in the console.</li>
     * <li>Dataflow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.</li>
     * <li>You can create a dataflow task only for a dataflow that is in the Running state.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the files to be exported from a CPFS for Lingjun file system does not exceed 1,023 characters.</li>
     * <li>CPFS for Lingjun supports two types of tasks: batch tasks and streaming tasks. For more information, see <a href="https://help.aliyun.com/document_detail/2845429.html">Task types</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dataflow task.</p>
     * 
     * @param request CreateDataFlowTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataFlowTaskResponse
     */
    public CreateDataFlowTaskResponse createDataFlowTaskWithOptions(CreateDataFlowTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conflictPolicy)) {
            query.put("ConflictPolicy", request.conflictPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createDirIfNotExist)) {
            query.put("CreateDirIfNotExist", request.createDirIfNotExist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directory)) {
            query.put("Directory", request.directory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDirectory)) {
            query.put("DstDirectory", request.dstDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryList)) {
            query.put("EntryList", request.entryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includes)) {
            query.put("Includes", request.includes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTaskId)) {
            query.put("SrcTaskId", request.srcTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferFileListPath)) {
            query.put("TransferFileListPath", request.transferFileListPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataFlowTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataFlowTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  CPFS usage notes
     *     *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     *     *   Dataflow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.
     *     *   You can create a dataflow task only for a dataflow that is in the Running state.
     *     *   When you manually run a dataflow task, the automatic data update task for the dataflow is interrupted and enters the pending state.
     *     *   When you create an export task, make sure that the total length of the absolute path of the files to be exported from a CPFS file system does not exceed 1,023 characters.</p>
     * <ul>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Only CPFS for Lingjun V2.4.0 and later support dataflow. You can view the version information on the file system details page in the console.</li>
     * <li>Dataflow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.</li>
     * <li>You can create a dataflow task only for a dataflow that is in the Running state.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the files to be exported from a CPFS for Lingjun file system does not exceed 1,023 characters.</li>
     * <li>CPFS for Lingjun supports two types of tasks: batch tasks and streaming tasks. For more information, see <a href="https://help.aliyun.com/document_detail/2845429.html">Task types</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dataflow task.</p>
     * 
     * @param request CreateDataFlowTaskRequest
     * @return CreateDataFlowTaskResponse
     */
    public CreateDataFlowTaskResponse createDataFlowTask(CreateDataFlowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory in a file system.</p>
     * 
     * @param request CreateDirRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDirResponse
     */
    public CreateDirResponse createDirWithOptions(CreateDirRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerGroupId)) {
            query.put("OwnerGroupId", request.ownerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursion)) {
            query.put("Recursion", request.recursion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDirectory)) {
            query.put("RootDirectory", request.rootDirectory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDir"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDirResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory in a file system.</p>
     * 
     * @param request CreateDirRequest
     * @return CreateDirResponse
     */
    public CreateDirResponse createDir(CreateDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is only available to some users.</p>
     * <ul>
     * <li>This operation supports only General-purpose NAS file systems that use the Server Message Block (SMB) protocol and have Resource Access Management (RAM) enabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory or file.</p>
     * 
     * @param request CreateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileResponse
     */
    public CreateFileResponse createFileWithOptions(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccessInheritable)) {
            query.put("OwnerAccessInheritable", request.ownerAccessInheritable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is only available to some users.</p>
     * <ul>
     * <li>This operation supports only General-purpose NAS file systems that use the Server Message Block (SMB) protocol and have Resource Access Management (RAM) enabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory or file.</p>
     * 
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must understand the billing and pricing of Apsara File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.aliyun.com/price/product?#/nas/detail">Pricing</a>.</p>
     * <ul>
     * <li>Before you create a file system, you must complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you call this operation, a service-linked role of NAS is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked roles of NAS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a file system.</p>
     * 
     * @param request CreateFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystemWithOptions(CreateFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redundancyType)) {
            query.put("RedundancyType", request.redundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redundancyVSwitchIds)) {
            query.put("RedundancyVSwitchIds", request.redundancyVSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must understand the billing and pricing of Apsara File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.aliyun.com/price/product?#/nas/detail">Pricing</a>.</p>
     * <ul>
     * <li>Before you create a file system, you must complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you call this operation, a service-linked role of NAS is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked roles of NAS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a file system.</p>
     * 
     * @param request CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  CPFS usage notes
     *     *   Only CPFS V2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.
     *     *   A maximum of 10 filesets can be created for a CPFS file system.
     *     *   The parent directory must be an existing directory.
     *     *   The maximum depth supported by a fileset path is eight levels. The depth of the root directory / is 0 levels. For example, the fileset path /test/aaa/ccc/ has three levels.
     *     *   Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset.
     *     *   A fileset supports a maximum of one million files. If the number of files exceeds the upper limit, the <code>no space</code> error message is returned when you add new files.</p>
     * <ul>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Only CPFS for Lingjun V2.7.0 and later support this operation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 500 filesets can be created for a CPFS file system.</li>
     * <li>The fileset path must be a new path and cannot be an existing path. Fileset paths cannot be renamed and cannot be symbolic links.</li>
     * <li>The maximum depth supported by a fileset path is eight levels. The depth of the root directory / is 0 levels. For example, the fileset path /test/aaa/ccc/ has three levels.</li>
     * <li>If the fileset path is a multi-level path, the parent directory must be an existing directory.</li>
     * <li>Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset. A fileset path supports only one quota.</li>
     * <li>The minimum capacity quota of a fileset is 10 GiB. The scaling step size is 1 GiB.</li>
     * <li>A fileset supports a minimum of 10,000 files or directories and a maximum of 10 billion files or directories. The scaling step size is 1.</li>
     * <li>When you modify a directory quota, you must set the quota capacity or the number of files to be greater than the capacity or file quantity that has been used.</li>
     * <li>The quota statistics have a 15-minute latency. The actual usage takes effect after 15 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a fileset.</p>
     * 
     * @param request CreateFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFilesetResponse
     */
    public CreateFilesetResponse createFilesetWithOptions(CreateFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemPath)) {
            query.put("FileSystemPath", request.fileSystemPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            query.put("Quota", request.quota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <p>  CPFS usage notes
     *     *   Only CPFS V2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.
     *     *   A maximum of 10 filesets can be created for a CPFS file system.
     *     *   The parent directory must be an existing directory.
     *     *   The maximum depth supported by a fileset path is eight levels. The depth of the root directory / is 0 levels. For example, the fileset path /test/aaa/ccc/ has three levels.
     *     *   Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset.
     *     *   A fileset supports a maximum of one million files. If the number of files exceeds the upper limit, the <code>no space</code> error message is returned when you add new files.</p>
     * <ul>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Only CPFS for Lingjun V2.7.0 and later support this operation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 500 filesets can be created for a CPFS file system.</li>
     * <li>The fileset path must be a new path and cannot be an existing path. Fileset paths cannot be renamed and cannot be symbolic links.</li>
     * <li>The maximum depth supported by a fileset path is eight levels. The depth of the root directory / is 0 levels. For example, the fileset path /test/aaa/ccc/ has three levels.</li>
     * <li>If the fileset path is a multi-level path, the parent directory must be an existing directory.</li>
     * <li>Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset. A fileset path supports only one quota.</li>
     * <li>The minimum capacity quota of a fileset is 10 GiB. The scaling step size is 1 GiB.</li>
     * <li>A fileset supports a minimum of 10,000 files or directories and a maximum of 10 billion files or directories. The scaling step size is 1.</li>
     * <li>When you modify a directory quota, you must set the quota capacity or the number of files to be greater than the capacity or file quantity that has been used.</li>
     * <li>The quota statistics have a 15-minute latency. The actual usage takes effect after 15 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a fileset.</p>
     * 
     * @param request CreateFilesetRequest
     * @return CreateFilesetResponse
     */
    public CreateFilesetResponse createFileset(CreateFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFilesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates LDAP configurations.</p>
     * 
     * @deprecated OpenAPI CreateLDAPConfig is deprecated
     * 
     * @param request CreateLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public CreateLDAPConfigResponse createLDAPConfigWithOptions(CreateLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindDN)) {
            query.put("BindDN", request.bindDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchBase)) {
            query.put("SearchBase", request.searchBase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLDAPConfig"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLDAPConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates LDAP configurations.</p>
     * 
     * @deprecated OpenAPI CreateLDAPConfig is deprecated
     * 
     * @param request CreateLDAPConfigRequest
     * @return CreateLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public CreateLDAPConfigResponse createLDAPConfig(CreateLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLDAPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can create lifecycle policies only for General-purpose NAS file systems.</p>
     * <ul>
     * <li>You can create up to 20 lifecycle policies in each region within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a lifecycle policy.</p>
     * 
     * @param request CreateLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLifecyclePolicyResponse
     */
    public CreateLifecyclePolicyResponse createLifecyclePolicyWithOptions(CreateLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyName)) {
            query.put("LifecyclePolicyName", request.lifecyclePolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleRuleName)) {
            query.put("LifecycleRuleName", request.lifecycleRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLifecyclePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can create lifecycle policies only for General-purpose NAS file systems.</p>
     * <ul>
     * <li>You can create up to 20 lifecycle policies in each region within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a lifecycle policy.</p>
     * 
     * @param request CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     */
    public CreateLifecyclePolicyResponse createLifecyclePolicy(CreateLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can run a maximum of 20 data retrieval tasks in each region within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data retrieval task.</p>
     * 
     * @param request CreateLifecycleRetrieveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLifecycleRetrieveJobResponse
     */
    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJobWithOptions(CreateLifecycleRetrieveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLifecycleRetrieveJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLifecycleRetrieveJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can run a maximum of 20 data retrieval tasks in each region within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data retrieval task.</p>
     * 
     * @param request CreateLifecycleRetrieveJobRequest
     * @return CreateLifecycleRetrieveJobResponse
     */
    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dumps the logs of a General-purpose NAS file system to Simple Log Service.</p>
     * 
     * @param request CreateLogAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogAnalysisResponse
     */
    public CreateLogAnalysisResponse createLogAnalysisWithOptions(CreateLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogAnalysis"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dumps the logs of a General-purpose NAS file system to Simple Log Service.</p>
     * 
     * @param request CreateLogAnalysisRequest
     * @return CreateLogAnalysisResponse
     */
    public CreateLogAnalysisResponse createLogAnalysis(CreateLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you call the CreateMountTarget operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the <strong>Active</strong> state, you can then mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * <ul>
     * <li>When you call this operation, a service-linked role of NAS is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked roles of NAS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTargetWithOptions(CreateMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIpv6)) {
            query.put("EnableIpv6", request.enableIpv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After you call the CreateMountTarget operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the <strong>Active</strong> state, you can then mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * <ul>
     * <li>When you call this operation, a service-linked role of NAS is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked roles of NAS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Prerequisites
     * A protocol service is created.</li>
     * <li>Others<ul>
     * <li>The virtual private cloud (VPC) CIDR block of the export directory for the protocol service cannot overlap with the VPC CIDR block of the file system.</li>
     * <li>The VPC CIDR blocks of multiple export directories of a protocol service cannot overlap.</li>
     * <li>You can create a maximum of 10 export directories for a protocol service.</li>
     * <li>A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an export directory for a protocol service.</p>
     * 
     * @param request CreateProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProtocolMountTargetResponse
     */
    public CreateProtocolMountTargetResponse createProtocolMountTargetWithOptions(CreateProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Prerequisites
     * A protocol service is created.</li>
     * <li>Others<ul>
     * <li>The virtual private cloud (VPC) CIDR block of the export directory for the protocol service cannot overlap with the VPC CIDR block of the file system.</li>
     * <li>The VPC CIDR blocks of multiple export directories of a protocol service cannot overlap.</li>
     * <li>You can create a maximum of 10 export directories for a protocol service.</li>
     * <li>A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an export directory for a protocol service.</p>
     * 
     * @param request CreateProtocolMountTargetRequest
     * @return CreateProtocolMountTargetResponse
     */
    public CreateProtocolMountTargetResponse createProtocolMountTarget(CreateProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.3.0 and later support protocol services. You can query the version information of the file system by calling the <a href="https://help.aliyun.com/document_detail/163314.html">DescribeFileSystems</a> operation.</li>
     * <li>Protocol service types
     * Protocol services are classified into general-purpose protocol services and cache protocol services. Different from general-purpose protocol services, cache protocol services can cache hot data. If data exists in the cache, the bandwidth of the cache protocol service may exceed the bandwidth of the CPFS file system, reaching the maximum bandwidth specified for the protocol service.<ul>
     * <li>General-purpose protocol services: provide NFS access and <a href="https://help.aliyun.com/document_detail/427175.html">directory-level mount targets</a> for CPFS file systems. You do not need to configure a POSIX client to manage clusters. The compliance package check feature is free of charge.</li>
     * <li>Cache protocol services: provide the server memory cache based on the least recently used (LRU) policy. When data is cached in the memory, CPFS provides higher internal bandwidth. Cache protocol services are divided into Cache L1 and Cache L2 specifications. The differences are the internal bandwidth size and memory cache size.
     * **
     * <strong>Note</strong> You are charged for using cache protocol services, which are in invitational preview. For more information about the billing method of cache protocol services, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, you can join the DingTalk group (group number: 31045006299).</li>
     * </ul>
     * </li>
     * <li>Protocol Type
     * Only NFSv3 is supported.</li>
     * <li>Others<ul>
     * <li>Only one protocol service can be created for a CPFS file system.</li>
     * <li>A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a protocol service for a Cloud Parallel File Storage (CPFS) file system. The creation takes about 5 to 10 minutes.</p>
     * 
     * @param request CreateProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProtocolServiceResponse
     */
    public CreateProtocolServiceResponse createProtocolServiceWithOptions(CreateProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolSpec)) {
            query.put("ProtocolSpec", request.protocolSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughput)) {
            query.put("Throughput", request.throughput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.3.0 and later support protocol services. You can query the version information of the file system by calling the <a href="https://help.aliyun.com/document_detail/163314.html">DescribeFileSystems</a> operation.</li>
     * <li>Protocol service types
     * Protocol services are classified into general-purpose protocol services and cache protocol services. Different from general-purpose protocol services, cache protocol services can cache hot data. If data exists in the cache, the bandwidth of the cache protocol service may exceed the bandwidth of the CPFS file system, reaching the maximum bandwidth specified for the protocol service.<ul>
     * <li>General-purpose protocol services: provide NFS access and <a href="https://help.aliyun.com/document_detail/427175.html">directory-level mount targets</a> for CPFS file systems. You do not need to configure a POSIX client to manage clusters. The compliance package check feature is free of charge.</li>
     * <li>Cache protocol services: provide the server memory cache based on the least recently used (LRU) policy. When data is cached in the memory, CPFS provides higher internal bandwidth. Cache protocol services are divided into Cache L1 and Cache L2 specifications. The differences are the internal bandwidth size and memory cache size.
     * **
     * <strong>Note</strong> You are charged for using cache protocol services, which are in invitational preview. For more information about the billing method of cache protocol services, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, you can join the DingTalk group (group number: 31045006299).</li>
     * </ul>
     * </li>
     * <li>Protocol Type
     * Only NFSv3 is supported.</li>
     * <li>Others<ul>
     * <li>Only one protocol service can be created for a CPFS file system.</li>
     * <li>A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a protocol service for a Cloud Parallel File Storage (CPFS) file system. The creation takes about 5 to 10 minutes.</p>
     * 
     * @param request CreateProtocolServiceRequest
     * @return CreateProtocolServiceResponse
     */
    public CreateProtocolServiceResponse createProtocolService(CreateProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you permanently delete a directory, the files in the directory are recursively cleared.</li>
     * <li>You can run only one job at a time for a single file system to permanently delete the files from the file system. You cannot create a restoration or deletion job when a file or directory is being deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a job to permanently delete a file or directory from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinDeleteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecycleBinDeleteJobResponse
     */
    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJobWithOptions(CreateRecycleBinDeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecycleBinDeleteJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecycleBinDeleteJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you permanently delete a directory, the files in the directory are recursively cleared.</li>
     * <li>You can run only one job at a time for a single file system to permanently delete the files from the file system. You cannot create a restoration or deletion job when a file or directory is being deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a job to permanently delete a file or directory from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinDeleteJobRequest
     * @return CreateRecycleBinDeleteJobResponse
     */
    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecycleBinDeleteJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can run only one job at a time for a single file system to restore files to or clear files from the file system. You cannot create a restore or cleanup job when files are being restored from the recycle bin.</li>
     * <li>You can restore only one file or directory in a single restore job. If you restore a specified directory, all files in the directory are recursively restored.</li>
     * <li>After files are restored, the data of the files is defragmented. When the data is being defragmented, the read performance is slightly degraded.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores a file or directory from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinRestoreJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecycleBinRestoreJobResponse
     */
    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJobWithOptions(CreateRecycleBinRestoreJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecycleBinRestoreJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecycleBinRestoreJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can run only one job at a time for a single file system to restore files to or clear files from the file system. You cannot create a restore or cleanup job when files are being restored from the recycle bin.</li>
     * <li>You can restore only one file or directory in a single restore job. If you restore a specified directory, all files in the directory are recursively restored.</li>
     * <li>After files are restored, the data of the files is defragmented. When the data is being defragmented, the read performance is slightly degraded.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores a file or directory from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinRestoreJobRequest
     * @return CreateRecycleBinRestoreJobResponse
     */
    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecycleBinRestoreJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 128 snapshots for a file system.</li>
     * <li>The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.</li>
     * <li>You can create only one snapshot for a file system at a time.</li>
     * <li>If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.</li>
     * <li>When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.</li>
     * <li>A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.</li>
     * <li>Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a snapshot.</p>
     * 
     * @param request CreateSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 128 snapshots for a file system.</li>
     * <li>The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.</li>
     * <li>You can create only one snapshot for a file system at a time.</li>
     * <li>If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.</li>
     * <li>When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.</li>
     * <li>A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.</li>
     * <li>Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a snapshot.</p>
     * 
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission group.</p>
     * 
     * @param request DeleteAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroupWithOptions(DeleteAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessGroup"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission group.</p>
     * 
     * @param request DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroup(DeleteAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose Network File System (NFS) file systems support access points.</p>
     * <ul>
     * <li>After an access point is deleted, all I/O operations that are being performed on the directory accessed over the access point are interrupted immediately. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access point.</p>
     * 
     * @param request DeleteAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessPointResponse
     */
    public DeleteAccessPointResponse deleteAccessPointWithOptions(DeleteAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose Network File System (NFS) file systems support access points.</p>
     * <ul>
     * <li>After an access point is deleted, all I/O operations that are being performed on the directory accessed over the access point are interrupted immediately. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access point.</p>
     * 
     * @param request DeleteAccessPointRequest
     * @return DeleteAccessPointResponse
     */
    public DeleteAccessPointResponse deleteAccessPoint(DeleteAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a rule from a permission group.</p>
     * 
     * @param request DeleteAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessRuleResponse
     */
    public DeleteAccessRuleResponse deleteAccessRuleWithOptions(DeleteAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessRule"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a rule from a permission group.</p>
     * 
     * @param request DeleteAccessRuleRequest
     * @return DeleteAccessRuleResponse
     */
    public DeleteAccessRuleResponse deleteAccessRule(DeleteAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an automatic snapshot policy.</p>
     * 
     * @param request DeleteAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoSnapshotPolicyResponse
     */
    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an automatic snapshot policy.</p>
     * 
     * @param request DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can delete the data flows that are only in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>After a data flow is deleted, the resources related to the data flow are released and cannot be restored. You must create a data flow again if required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataflow.</p>
     * 
     * @param request DeleteDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataFlowResponse
     */
    public DeleteDataFlowResponse deleteDataFlowWithOptions(DeleteDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can delete the data flows that are only in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>After a data flow is deleted, the resources related to the data flow are released and cannot be restored. You must create a data flow again if required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataflow.</p>
     * 
     * @param request DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     */
    public DeleteDataFlowResponse deleteDataFlow(DeleteDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a file system, you must delete all mount targets of the file system.</p>
     * <ul>
     * <li>Before you delete a file system, you must make sure that no lifecycle policy is created for the file system.</li>
     * <li>After a file system is deleted, the data on the file system cannot be restored. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file system.</p>
     * 
     * @param request DeleteFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystemWithOptions(DeleteFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a file system, you must delete all mount targets of the file system.</p>
     * <ul>
     * <li>Before you delete a file system, you must make sure that no lifecycle policy is created for the file system.</li>
     * <li>After a file system is deleted, the data on the file system cannot be restored. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file system.</p>
     * 
     * @param request DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and CPFS for Lingjun V2.7.0 and later support this operation. After you delete a fileset, all data in the fileset is deleted and cannot be restored. Proceed with caution.</p>
     * <ul>
     * <li>If deletion protection is enabled for the fileset, you must disable deletion protection before you delete the fileset.</li>
     * <li>After you delete a fileset of CPFS for Lingjun, the storage space is not immediately released and will be recycled within 24 hours. If you want to release storage space immediately, you can clear the data in the fileset and then delete the fileset. Deleted data cannot be restored. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a fileset.</p>
     * 
     * @param request DeleteFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFilesetResponse
     */
    public DeleteFilesetResponse deleteFilesetWithOptions(DeleteFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and CPFS for Lingjun V2.7.0 and later support this operation. After you delete a fileset, all data in the fileset is deleted and cannot be restored. Proceed with caution.</p>
     * <ul>
     * <li>If deletion protection is enabled for the fileset, you must disable deletion protection before you delete the fileset.</li>
     * <li>After you delete a fileset of CPFS for Lingjun, the storage space is not immediately released and will be recycled within 24 hours. If you want to release storage space immediately, you can clear the data in the fileset and then delete the fileset. Deleted data cannot be restored. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a fileset.</p>
     * 
     * @param request DeleteFilesetRequest
     * @return DeleteFilesetResponse
     */
    public DeleteFilesetResponse deleteFileset(DeleteFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFilesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>{&quot;summary1&quot;:&quot;&quot;}</p>
     * 
     * @deprecated OpenAPI DeleteLDAPConfig is deprecated
     * 
     * @param request DeleteLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public DeleteLDAPConfigResponse deleteLDAPConfigWithOptions(DeleteLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLDAPConfig"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLDAPConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>{&quot;summary1&quot;:&quot;&quot;}</p>
     * 
     * @deprecated OpenAPI DeleteLDAPConfig is deprecated
     * 
     * @param request DeleteLDAPConfigRequest
     * @return DeleteLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public DeleteLDAPConfigResponse deleteLDAPConfig(DeleteLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLDAPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lifecycle policy.</p>
     * 
     * @param request DeleteLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLifecyclePolicyResponse
     */
    public DeleteLifecyclePolicyResponse deleteLifecyclePolicyWithOptions(DeleteLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyName)) {
            query.put("LifecyclePolicyName", request.lifecyclePolicyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLifecyclePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lifecycle policy.</p>
     * 
     * @param request DeleteLifecyclePolicyRequest
     * @return DeleteLifecyclePolicyResponse
     */
    public DeleteLifecyclePolicyResponse deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables log dumping for a General-purpose NAS file system.</p>
     * 
     * @param request DeleteLogAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogAnalysisResponse
     */
    public DeleteLogAnalysisResponse deleteLogAnalysisWithOptions(DeleteLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogAnalysis"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables log dumping for a General-purpose NAS file system.</p>
     * 
     * @param request DeleteLogAnalysisRequest
     * @return DeleteLogAnalysisResponse
     */
    public DeleteLogAnalysisResponse deleteLogAnalysis(DeleteLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you delete a mount target, the mount target cannot be restored. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a mount target.</p>
     * 
     * @param request DeleteMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTargetWithOptions(DeleteMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you delete a mount target, the mount target cannot be restored. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a mount target.</p>
     * 
     * @param request DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an export directory of a protocol service.</p>
     * 
     * @param request DeleteProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProtocolMountTargetResponse
     */
    public DeleteProtocolMountTargetResponse deleteProtocolMountTargetWithOptions(DeleteProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            query.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an export directory of a protocol service.</p>
     * 
     * @param request DeleteProtocolMountTargetRequest
     * @return DeleteProtocolMountTargetResponse
     */
    public DeleteProtocolMountTargetResponse deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>When you delete a protocol service, the export directories in the protocol service are also deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a protocol service of a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request DeleteProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProtocolServiceResponse
     */
    public DeleteProtocolServiceResponse deleteProtocolServiceWithOptions(DeleteProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>When you delete a protocol service, the export directories in the protocol service are also deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a protocol service of a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request DeleteProtocolServiceRequest
     * @return DeleteProtocolServiceResponse
     */
    public DeleteProtocolServiceResponse deleteProtocolService(DeleteProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a snapshot or cancels a snapshot that is being created.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a snapshot or cancels a snapshot that is being created.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries permission groups.</p>
     * 
     * @param request DescribeAccessGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessGroupsResponse
     */
    public DescribeAccessGroupsResponse describeAccessGroupsWithOptions(DescribeAccessGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useUTCDateTime)) {
            query.put("UseUTCDateTime", request.useUTCDateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessGroups"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries permission groups.</p>
     * 
     * @param request DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     */
    public DescribeAccessGroupsResponse describeAccessGroups(DescribeAccessGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an access point.</p>
     * 
     * @param request DescribeAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessPointResponse
     */
    public DescribeAccessPointResponse describeAccessPointWithOptions(DescribeAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an access point.</p>
     * 
     * @param request DescribeAccessPointRequest
     * @return DescribeAccessPointResponse
     */
    public DescribeAccessPointResponse describeAccessPoint(DescribeAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an access point.</p>
     * 
     * @param request DescribeAccessPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessPointsResponse
     */
    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroup)) {
            query.put("AccessGroup", request.accessGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
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
            new TeaPair("action", "DescribeAccessPoints"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessPointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an access point.</p>
     * 
     * @param request DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about rules in a permission group.</p>
     * 
     * @param request DescribeAccessRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessRulesResponse
     */
    public DescribeAccessRulesResponse describeAccessRulesWithOptions(DescribeAccessRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessRules"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about rules in a permission group.</p>
     * 
     * @param request DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     */
    public DescribeAccessRulesResponse describeAccessRules(DescribeAccessRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries automatic snapshot policies.</p>
     * 
     * @param request DescribeAutoSnapshotPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPoliciesWithOptions(DescribeAutoSnapshotPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoSnapshotPolicies"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoSnapshotPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries automatic snapshot policies.</p>
     * 
     * @param request DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries automatic snapshot tasks.</p>
     * 
     * @param request DescribeAutoSnapshotTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoSnapshotTasksResponse
     */
    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasksWithOptions(DescribeAutoSnapshotTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyIds)) {
            query.put("AutoSnapshotPolicyIds", request.autoSnapshotPolicyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemIds)) {
            query.put("FileSystemIds", request.fileSystemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoSnapshotTasks"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoSnapshotTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries automatic snapshot tasks.</p>
     * 
     * @param request DescribeAutoSnapshotTasksRequest
     * @return DescribeAutoSnapshotTasksResponse
     */
    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for CPFS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of clients in the blacklist of a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @deprecated OpenAPI DescribeBlackListClients is deprecated
     * 
     * @param request DescribeBlackListClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeBlackListClientsResponse describeBlackListClientsWithOptions(DescribeBlackListClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlackListClients"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlackListClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for CPFS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of clients in the blacklist of a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @deprecated OpenAPI DescribeBlackListClients is deprecated
     * 
     * @param request DescribeBlackListClientsRequest
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeBlackListClientsResponse describeBlackListClients(DescribeBlackListClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlackListClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data flow subtasks in batches.</p>
     * 
     * @param request DescribeDataFlowSubTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataFlowSubTasksResponse
     */
    public DescribeDataFlowSubTasksResponse describeDataFlowSubTasksWithOptions(DescribeDataFlowSubTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
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
            new TeaPair("action", "DescribeDataFlowSubTasks"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataFlowSubTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data flow subtasks in batches.</p>
     * 
     * @param request DescribeDataFlowSubTasksRequest
     * @return DescribeDataFlowSubTasksResponse
     */
    public DescribeDataFlowSubTasksResponse describeDataFlowSubTasks(DescribeDataFlowSubTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowSubTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of dataflow tasks.</p>
     * 
     * @param request DescribeDataFlowTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataFlowTasksResponse
     */
    public DescribeDataFlowTasksResponse describeDataFlowTasksWithOptions(DescribeDataFlowTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withReports)) {
            query.put("WithReports", request.withReports);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataFlowTasks"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataFlowTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of dataflow tasks.</p>
     * 
     * @param request DescribeDataFlowTasksRequest
     * @return DescribeDataFlowTasksResponse
     */
    public DescribeDataFlowTasksResponse describeDataFlowTasks(DescribeDataFlowTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support dataflows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>In Filters, FsetIds, DataFlowlds, SourceStorage, ThroughputList, and Status support exact match only. FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined query is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the dataflows of a CPFS file system.</p>
     * 
     * @param request DescribeDataFlowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataFlowsResponse
     */
    public DescribeDataFlowsResponse describeDataFlowsWithOptions(DescribeDataFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
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
            new TeaPair("action", "DescribeDataFlows"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataFlowsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support dataflows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>In Filters, FsetIds, DataFlowlds, SourceStorage, ThroughputList, and Status support exact match only. FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined query is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the dataflows of a CPFS file system.</p>
     * 
     * @param request DescribeDataFlowsRequest
     * @return DescribeDataFlowsResponse
     */
    public DescribeDataFlowsResponse describeDataFlows(DescribeDataFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory quotas of a file system.</p>
     * 
     * @param request DescribeDirQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDirQuotasResponse
     */
    public DescribeDirQuotasResponse describeDirQuotasWithOptions(DescribeDirQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDirQuotas"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDirQuotasResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory quotas of a file system.</p>
     * 
     * @param request DescribeDirQuotasRequest
     * @return DescribeDirQuotasResponse
     */
    public DescribeDirQuotasResponse describeDirQuotas(DescribeDirQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirQuotasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of file systems that are owned by the current account.</p>
     * 
     * @deprecated OpenAPI DescribeFileSystemStatistics is deprecated, please use NAS::2017-06-26::DescribeResourceStatistics instead.
     * 
     * @param request DescribeFileSystemStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileSystemStatisticsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeFileSystemStatisticsResponse describeFileSystemStatisticsWithOptions(DescribeFileSystemStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileSystemStatistics"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileSystemStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of file systems that are owned by the current account.</p>
     * 
     * @deprecated OpenAPI DescribeFileSystemStatistics is deprecated, please use NAS::2017-06-26::DescribeResourceStatistics instead.
     * 
     * @param request DescribeFileSystemStatisticsRequest
     * @return DescribeFileSystemStatisticsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeFileSystemStatisticsResponse describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file systems.</p>
     * 
     * @param request DescribeFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystemsWithOptions(DescribeFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileSystems"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file systems.</p>
     * 
     * @param request DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and CPFS for Lingjun V2.7.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>In Filters, FsetIds supports exact match only. FileSystemPath and Description support fuzzy match.</li>
     * <li>Combined query is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about created filesets.</p>
     * 
     * @param request DescribeFilesetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFilesetsResponse
     */
    public DescribeFilesetsResponse describeFilesetsWithOptions(DescribeFilesetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByField)) {
            query.put("OrderByField", request.orderByField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFilesets"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFilesetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and CPFS for Lingjun V2.7.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>In Filters, FsetIds supports exact match only. FileSystemPath and Description support fuzzy match.</li>
     * <li>Combined query is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about created filesets.</p>
     * 
     * @param request DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     */
    public DescribeFilesetsResponse describeFilesets(DescribeFilesetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFilesetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only CPFS for Lingjun supports this operation.</p>
     * <ul>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIDs, meaning the VscId in the ResourceIds must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about virtual storage channels associated with a file system.</p>
     * 
     * @param request DescribeFilesystemsVscAttachInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFilesystemsVscAttachInfoResponse
     */
    public DescribeFilesystemsVscAttachInfoResponse describeFilesystemsVscAttachInfoWithOptions(DescribeFilesystemsVscAttachInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFilesystemsVscAttachInfo"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFilesystemsVscAttachInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only CPFS for Lingjun supports this operation.</p>
     * <ul>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIDs, meaning the VscId in the ResourceIds must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about virtual storage channels associated with a file system.</p>
     * 
     * @param request DescribeFilesystemsVscAttachInfoRequest
     * @return DescribeFilesystemsVscAttachInfoResponse
     */
    public DescribeFilesystemsVscAttachInfoResponse describeFilesystemsVscAttachInfo(DescribeFilesystemsVscAttachInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFilesystemsVscAttachInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries lifecycle policies.</p>
     * 
     * @param request DescribeLifecyclePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLifecyclePoliciesResponse
     */
    public DescribeLifecyclePoliciesResponse describeLifecyclePoliciesWithOptions(DescribeLifecyclePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLifecyclePolicies"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecyclePoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries lifecycle policies.</p>
     * 
     * @param request DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     */
    public DescribeLifecyclePoliciesResponse describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecyclePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log dump information configured in log analysis.</p>
     * 
     * @param request DescribeLogAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogAnalysisResponse
     */
    public DescribeLogAnalysisResponse describeLogAnalysisWithOptions(DescribeLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
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
            new TeaPair("action", "DescribeLogAnalysis"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log dump information configured in log analysis.</p>
     * 
     * @param request DescribeLogAnalysisRequest
     * @return DescribeLogAnalysisResponse
     */
    public DescribeLogAnalysisResponse describeLogAnalysis(DescribeLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries mount targets.</p>
     * 
     * @param request DescribeMountTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargetsWithOptions(DescribeMountTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dualStackMountTargetDomain)) {
            query.put("DualStackMountTargetDomain", request.dualStackMountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMountTargets"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMountTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries mount targets.</p>
     * 
     * @param request DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>This operation returns the clients that have accessed the specified file system within the last minute. If the file system is mounted on a client but the client did not access the file system within the last minute, the client is not included in the returned information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the clients on which a file system is mounted.</p>
     * 
     * @param request DescribeMountedClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMountedClientsResponse
     */
    public DescribeMountedClientsResponse describeMountedClientsWithOptions(DescribeMountedClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
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
            new TeaPair("action", "DescribeMountedClients"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMountedClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>This operation returns the clients that have accessed the specified file system within the last minute. If the file system is mounted on a client but the client did not access the file system within the last minute, the client is not included in the returned information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the clients on which a file system is mounted.</p>
     * 
     * @param request DescribeMountedClientsRequest
     * @return DescribeMountedClientsResponse
     */
    public DescribeMountedClientsResponse describeMountedClients(DescribeMountedClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountedClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the NFS ACL feature is enabled for a file system.</p>
     * 
     * @param request DescribeNfsAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNfsAclResponse
     */
    public DescribeNfsAclResponse describeNfsAclWithOptions(DescribeNfsAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNfsAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNfsAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the NFS ACL feature is enabled for a file system.</p>
     * 
     * @param request DescribeNfsAclRequest
     * @return DescribeNfsAclResponse
     */
    public DescribeNfsAclResponse describeNfsAcl(DescribeNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNfsAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the export directories of a protocol service.</p>
     * 
     * @param request DescribeProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProtocolMountTargetResponse
     */
    public DescribeProtocolMountTargetResponse describeProtocolMountTargetWithOptions(DescribeProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceIds)) {
            query.put("ProtocolServiceIds", request.protocolServiceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the export directories of a protocol service.</p>
     * 
     * @param request DescribeProtocolMountTargetRequest
     * @return DescribeProtocolMountTargetResponse
     */
    public DescribeProtocolMountTargetResponse describeProtocolMountTarget(DescribeProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about protocol services.</p>
     * 
     * @param request DescribeProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProtocolServiceResponse
     */
    public DescribeProtocolServiceResponse describeProtocolServiceWithOptions(DescribeProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceIds)) {
            query.put("ProtocolServiceIds", request.protocolServiceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about protocol services.</p>
     * 
     * @param request DescribeProtocolServiceRequest
     * @return DescribeProtocolServiceResponse
     */
    public DescribeProtocolServiceResponse describeProtocolService(DescribeProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions in which File Storage NAS is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>Queries the regions in which File Storage NAS is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request DescribeSmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmbAclResponse
     */
    public DescribeSmbAclResponse describeSmbAclWithOptions(DescribeSmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmbAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request DescribeSmbAclRequest
     * @return DescribeSmbAclResponse
     */
    public DescribeSmbAclResponse describeSmbAcl(DescribeSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmbAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about one or more snapshots of a file system.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotType)) {
            query.put("SnapshotType", request.snapshotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshots"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about one or more snapshots of a file system.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeStoragePackages operation to query the list of storage plans.</p>
     * 
     * @param request DescribeStoragePackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStoragePackagesResponse
     */
    public DescribeStoragePackagesResponse describeStoragePackagesWithOptions(DescribeStoragePackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.useUTCDateTime)) {
            query.put("UseUTCDateTime", request.useUTCDateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStoragePackages"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStoragePackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeStoragePackages operation to query the list of storage plans.</p>
     * 
     * @param request DescribeStoragePackagesRequest
     * @return DescribeStoragePackagesResponse
     */
    public DescribeStoragePackagesResponse describeStoragePackages(DescribeStoragePackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStoragePackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all zones in a region and the file system types that are supported in each zone.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>summary</b> : 
     * <p>Queries all zones in a region and the file system types that are supported in each zone.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only CPFS for Lingjun supports this operation.</p>
     * <ul>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIDs, meaning the VscId in the ResourceIds must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unassociates a VSC device from a file system.</p>
     * 
     * @param request DetachVscFromFilesystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachVscFromFilesystemsResponse
     */
    public DetachVscFromFilesystemsResponse detachVscFromFilesystemsWithOptions(DetachVscFromFilesystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVscFromFilesystems"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVscFromFilesystemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only CPFS for Lingjun supports this operation.</p>
     * <ul>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIDs, meaning the VscId in the ResourceIds must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unassociates a VSC device from a file system.</p>
     * 
     * @param request DetachVscFromFilesystemsRequest
     * @return DetachVscFromFilesystemsResponse
     */
    public DetachVscFromFilesystemsResponse detachVscFromFilesystems(DetachVscFromFilesystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVscFromFilesystemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you disable the recycle bin, all files in the recycle bin are permanently deleted.</li>
     * <li>If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables and empties the recycle bin of a General-purpose NAS file system.</p>
     * 
     * @param request DisableAndCleanRecycleBinRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAndCleanRecycleBinResponse
     */
    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBinWithOptions(DisableAndCleanRecycleBinRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAndCleanRecycleBin"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAndCleanRecycleBinResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you disable the recycle bin, all files in the recycle bin are permanently deleted.</li>
     * <li>If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables and empties the recycle bin of a General-purpose NAS file system.</p>
     * 
     * @param request DisableAndCleanRecycleBinRequest
     * @return DisableAndCleanRecycleBinResponse
     */
    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAndCleanRecycleBinWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the NFS ACL feature for a file system.</p>
     * 
     * @param request DisableNfsAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableNfsAclResponse
     */
    public DisableNfsAclResponse disableNfsAclWithOptions(DisableNfsAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableNfsAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableNfsAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the NFS ACL feature for a file system.</p>
     * 
     * @param request DisableNfsAclRequest
     * @return DisableNfsAclResponse
     */
    public DisableNfsAclResponse disableNfsAcl(DisableNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableNfsAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request DisableSmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSmbAclResponse
     */
    public DisableSmbAclResponse disableSmbAclWithOptions(DisableSmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSmbAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request DisableSmbAclRequest
     * @return DisableSmbAclResponse
     */
    public DisableSmbAclResponse disableSmbAcl(DisableSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSmbAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the NFS ACL feature for a file system.</p>
     * 
     * @param request EnableNfsAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableNfsAclResponse
     */
    public EnableNfsAclResponse enableNfsAclWithOptions(EnableNfsAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableNfsAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableNfsAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the NFS ACL feature for a file system.</p>
     * 
     * @param request EnableNfsAclRequest
     * @return EnableNfsAclResponse
     */
    public EnableNfsAclResponse enableNfsAcl(EnableNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableNfsAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the recycle bin feature for a file system.</p>
     * 
     * @param request EnableRecycleBinRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRecycleBinResponse
     */
    public EnableRecycleBinResponse enableRecycleBinWithOptions(EnableRecycleBinRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedDays)) {
            query.put("ReservedDays", request.reservedDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRecycleBin"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRecycleBinResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the recycle bin feature for a file system.</p>
     * 
     * @param request EnableRecycleBinRequest
     * @return EnableRecycleBinResponse
     */
    public EnableRecycleBinResponse enableRecycleBin(EnableRecycleBinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRecycleBinWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request EnableSmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSmbAclResponse
     */
    public EnableSmbAclResponse enableSmbAclWithOptions(EnableSmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytab)) {
            query.put("Keytab", request.keytab);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytabMd5)) {
            query.put("KeytabMd5", request.keytabMd5);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSmbAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request EnableSmbAclRequest
     * @return EnableSmbAclResponse
     */
    public EnableSmbAclResponse enableSmbAcl(EnableSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSmbAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a directory contains files that are stored in the Infrequent Access (IA) or Archive storage class, or whether a file is stored in the IA or Archive storage class.</p>
     * 
     * @param request GetDirectoryOrFilePropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDirectoryOrFilePropertiesResponse
     */
    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFilePropertiesWithOptions(GetDirectoryOrFilePropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectoryOrFileProperties"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectoryOrFilePropertiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a directory contains files that are stored in the Infrequent Access (IA) or Archive storage class, or whether a file is stored in the IA or Archive storage class.</p>
     * 
     * @param request GetDirectoryOrFilePropertiesRequest
     * @return GetDirectoryOrFilePropertiesResponse
     */
    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectoryOrFilePropertiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose File Storage NAS (NAS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recycle bin configurations of a General-purpose NAS file system.</p>
     * 
     * @param request GetRecycleBinAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecycleBinAttributeResponse
     */
    public GetRecycleBinAttributeResponse getRecycleBinAttributeWithOptions(GetRecycleBinAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecycleBinAttribute"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecycleBinAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose File Storage NAS (NAS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recycle bin configurations of a General-purpose NAS file system.</p>
     * 
     * @param request GetRecycleBinAttributeRequest
     * @return GetRecycleBinAttributeResponse
     */
    public GetRecycleBinAttributeResponse getRecycleBinAttribute(GetRecycleBinAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecycleBinAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the infrequently-accessed files in a specified directory of a General-purpose NAS file system and the subdirectories that contain the files.</p>
     * 
     * @param request ListDirectoriesAndFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDirectoriesAndFilesResponse
     */
    public ListDirectoriesAndFilesResponse listDirectoriesAndFilesWithOptions(ListDirectoriesAndFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryOnly)) {
            query.put("DirectoryOnly", request.directoryOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectoriesAndFiles"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectoriesAndFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the infrequently-accessed files in a specified directory of a General-purpose NAS file system and the subdirectories that contain the files.</p>
     * 
     * @param request ListDirectoriesAndFilesRequest
     * @return ListDirectoriesAndFilesResponse
     */
    public ListDirectoriesAndFilesResponse listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectoriesAndFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data retrieval tasks.</p>
     * 
     * @param request ListLifecycleRetrieveJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLifecycleRetrieveJobsResponse
     */
    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobsWithOptions(ListLifecycleRetrieveJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLifecycleRetrieveJobs"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLifecycleRetrieveJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data retrieval tasks.</p>
     * 
     * @param request ListLifecycleRetrieveJobsRequest
     * @return ListLifecycleRetrieveJobsResponse
     */
    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLifecycleRetrieveJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the directories that are recently deleted.</p>
     * 
     * @param request ListRecentlyRecycledDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectoriesWithOptions(ListRecentlyRecycledDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentlyRecycledDirectories"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentlyRecycledDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the directories that are recently deleted.</p>
     * 
     * @param request ListRecentlyRecycledDirectoriesRequest
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentlyRecycledDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can query a maximum of 50 jobs that are recently executed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the jobs of the recycle bin.</p>
     * 
     * @param request ListRecycleBinJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecycleBinJobsResponse
     */
    public ListRecycleBinJobsResponse listRecycleBinJobsWithOptions(ListRecycleBinJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecycleBinJobs"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecycleBinJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can query a maximum of 50 jobs that are recently executed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the jobs of the recycle bin.</p>
     * 
     * @param request ListRecycleBinJobsRequest
     * @return ListRecycleBinJobsResponse
     */
    public ListRecycleBinJobsResponse listRecycleBinJobs(ListRecycleBinJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecycleBinJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries deleted files or directories.</p>
     * 
     * @param request ListRecycledDirectoriesAndFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFilesWithOptions(ListRecycledDirectoriesAndFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecycledDirectoriesAndFiles"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecycledDirectoriesAndFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries deleted files or directories.</p>
     * 
     * @param request ListRecycledDirectoriesAndFilesRequest
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecycledDirectoriesAndFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tags.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("version", "2017-06-26"),
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
     * <b>summary</b> : 
     * <p>Queries tags.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission group.</p>
     * 
     * @param request ModifyAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessGroupResponse
     */
    public ModifyAccessGroupResponse modifyAccessGroupWithOptions(ModifyAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessGroup"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccessGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission group.</p>
     * 
     * @param request ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    public ModifyAccessGroupResponse modifyAccessGroup(ModifyAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about an access point.</p>
     * 
     * @param request ModifyAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessPointResponse
     */
    public ModifyAccessPointResponse modifyAccessPointWithOptions(ModifyAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroup)) {
            query.put("AccessGroup", request.accessGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointName)) {
            query.put("AccessPointName", request.accessPointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabledRam)) {
            query.put("EnabledRam", request.enabledRam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about an access point.</p>
     * 
     * @param request ModifyAccessPointRequest
     * @return ModifyAccessPointResponse
     */
    public ModifyAccessPointResponse modifyAccessPoint(ModifyAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a rule in a permission group.</p>
     * 
     * @param request ModifyAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessRuleResponse
     */
    public ModifyAccessRuleResponse modifyAccessRuleWithOptions(ModifyAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6SourceCidrIp)) {
            query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RWAccessType)) {
            query.put("RWAccessType", request.RWAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessType)) {
            query.put("UserAccessType", request.userAccessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessRule"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccessRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a rule in a permission group.</p>
     * 
     * @param request ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    public ModifyAccessRuleResponse modifyAccessRule(ModifyAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>An automatic snapshot policy is modified. After you modify an automatic snapshot policy that is applied to a file system, the modification immediately applies to subsequent snapshots that are created for the file system.</p>
     * 
     * @param request ModifyAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoSnapshotPolicyResponse
     */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyName)) {
            query.put("AutoSnapshotPolicyName", request.autoSnapshotPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatWeekdays)) {
            query.put("RepeatWeekdays", request.repeatWeekdays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoints)) {
            query.put("TimePoints", request.timePoints);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>An automatic snapshot policy is modified. After you modify an automatic snapshot policy that is applied to a file system, the modification immediately applies to subsequent snapshots that are created for the file system.</p>
     * 
     * @param request ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support data flows.</p>
     * <ul>
     * <li>You can modify the attributes only of the data flows that are in the <code>Running</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to modify the attributes of a data flow. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the status of the data flow to be modified.</li>
     * <li>CPFS data flow specifications:<ul>
     * <li>The data flow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data flow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a data flow.</li>
     * <li>Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.</li>
     * </ul>
     * </li>
     * <li>Billing of CPFS file systems
     * Changing the dataflow throughput involves the billing of dataflow bandwidth. We recommend that you understand CPFS billing methods in advance. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing methods and billable items of CPFS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a dataflow.</p>
     * 
     * @param request ModifyDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataFlowResponse
     */
    public ModifyDataFlowResponse modifyDataFlowWithOptions(ModifyDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughput)) {
            query.put("Throughput", request.throughput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for Lingjun V2.4.0 and later support data flows.</p>
     * <ul>
     * <li>You can modify the attributes only of the data flows that are in the <code>Running</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to modify the attributes of a data flow. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the status of the data flow to be modified.</li>
     * <li>CPFS data flow specifications:<ul>
     * <li>The data flow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data flow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a data flow.</li>
     * <li>Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.</li>
     * </ul>
     * </li>
     * <li>Billing of CPFS file systems
     * Changing the dataflow throughput involves the billing of dataflow bandwidth. We recommend that you understand CPFS billing methods in advance. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing methods and billable items of CPFS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a dataflow.</p>
     * 
     * @param request ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     */
    public ModifyDataFlowResponse modifyDataFlow(ModifyDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to CPFS file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the AutoRefresh configurations only for the dataflows that are in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to modify an AutoRefresh configuration. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the task of modifying an AutoRefresh configuration.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AutoRefresh configuration of a dataflow.</p>
     * 
     * @param request ModifyDataFlowAutoRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataFlowAutoRefreshResponse
     */
    public ModifyDataFlowAutoRefreshResponse modifyDataFlowAutoRefreshWithOptions(ModifyDataFlowAutoRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshInterval)) {
            query.put("AutoRefreshInterval", request.autoRefreshInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshPolicy)) {
            query.put("AutoRefreshPolicy", request.autoRefreshPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataFlowAutoRefresh"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataFlowAutoRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to CPFS file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the AutoRefresh configurations only for the dataflows that are in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to modify an AutoRefresh configuration. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the task of modifying an AutoRefresh configuration.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AutoRefresh configuration of a dataflow.</p>
     * 
     * @param request ModifyDataFlowAutoRefreshRequest
     * @return ModifyDataFlowAutoRefreshResponse
     */
    public ModifyDataFlowAutoRefreshResponse modifyDataFlowAutoRefresh(ModifyDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a file system.</p>
     * 
     * @param tmpReq ModifyFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyFileSystemShrinkRequest request = new ModifyFileSystemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "Options", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("Options", request.optionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFileSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a file system.</p>
     * 
     * @param request ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) V2.2.0 and CPFS for Lingjun V2.7.0 and later support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a fileset.</p>
     * 
     * @param request ModifyFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFilesetResponse
     */
    public ModifyFilesetResponse modifyFilesetWithOptions(ModifyFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) V2.2.0 and CPFS for Lingjun V2.7.0 and later support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a fileset.</p>
     * 
     * @param request ModifyFilesetRequest
     * @return ModifyFilesetResponse
     */
    public ModifyFilesetResponse modifyFileset(ModifyFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFilesetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to modify LDAP configuration.</p>
     * 
     * @deprecated OpenAPI ModifyLDAPConfig is deprecated
     * 
     * @param request ModifyLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public ModifyLDAPConfigResponse modifyLDAPConfigWithOptions(ModifyLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindDN)) {
            query.put("BindDN", request.bindDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchBase)) {
            query.put("SearchBase", request.searchBase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLDAPConfig"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLDAPConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to modify LDAP configuration.</p>
     * 
     * @deprecated OpenAPI ModifyLDAPConfig is deprecated
     * 
     * @param request ModifyLDAPConfigRequest
     * @return ModifyLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public ModifyLDAPConfigResponse modifyLDAPConfig(ModifyLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLDAPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a lifecycle policy.</p>
     * 
     * @param request ModifyLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLifecyclePolicyResponse
     */
    public ModifyLifecyclePolicyResponse modifyLifecyclePolicyWithOptions(ModifyLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyName)) {
            query.put("LifecyclePolicyName", request.lifecyclePolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleRuleName)) {
            query.put("LifecycleRuleName", request.lifecycleRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLifecyclePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a lifecycle policy.</p>
     * 
     * @param request ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     */
    public ModifyLifecyclePolicyResponse modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a mount target.</p>
     * 
     * @param request ModifyMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMountTargetResponse
     */
    public ModifyMountTargetResponse modifyMountTargetWithOptions(ModifyMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dualStackMountTargetDomain)) {
            query.put("DualStackMountTargetDomain", request.dualStackMountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMountTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a mount target.</p>
     * 
     * @param request ModifyMountTargetRequest
     * @return ModifyMountTargetResponse
     */
    public ModifyMountTargetResponse modifyMountTarget(ModifyMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the export directory parameters of a protocol service. Only the description can be modified. The virtual private cloud (VPC) ID and vSwitch ID cannot be changed. To change these IDs, you must delete the export directory and create a new one.</p>
     * 
     * @param request ModifyProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyProtocolMountTargetResponse
     */
    public ModifyProtocolMountTargetResponse modifyProtocolMountTargetWithOptions(ModifyProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            query.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the export directory parameters of a protocol service. Only the description can be modified. The virtual private cloud (VPC) ID and vSwitch ID cannot be changed. To change these IDs, you must delete the export directory and create a new one.</p>
     * 
     * @param request ModifyProtocolMountTargetRequest
     * @return ModifyProtocolMountTargetResponse
     */
    public ModifyProtocolMountTargetResponse modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a protocol service. You can modify the description of a protocol service.</p>
     * 
     * @param request ModifyProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyProtocolServiceResponse
     */
    public ModifyProtocolServiceResponse modifyProtocolServiceWithOptions(ModifyProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a protocol service. You can modify the description of a protocol service.</p>
     * 
     * @param request ModifyProtocolServiceRequest
     * @return ModifyProtocolServiceResponse
     */
    public ModifyProtocolServiceResponse modifyProtocolService(ModifyProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request ModifySmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmbAclResponse
     */
    public ModifySmbAclResponse modifySmbAclWithOptions(ModifySmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAnonymousAccess)) {
            query.put("EnableAnonymousAccess", request.enableAnonymousAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptData)) {
            query.put("EncryptData", request.encryptData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.homeDirPath)) {
            query.put("HomeDirPath", request.homeDirPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytab)) {
            query.put("Keytab", request.keytab);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytabMd5)) {
            query.put("KeytabMd5", request.keytabMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rejectUnencryptedAccess)) {
            query.put("RejectUnencryptedAccess", request.rejectUnencryptedAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superAdminSid)) {
            query.put("SuperAdminSid", request.superAdminSid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmbAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.</p>
     * 
     * @param request ModifySmbAclRequest
     * @return ModifySmbAclResponse
     */
    public ModifySmbAclResponse modifySmbAcl(ModifySmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmbAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates File Storage NAS.</p>
     * 
     * @param request OpenNASServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenNASServiceResponse
     */
    public OpenNASServiceResponse openNASServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenNASService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenNASServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates File Storage NAS.</p>
     * @return OpenNASServiceResponse
     */
    public OpenNASServiceResponse openNASService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openNASServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for CPFS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Remove the client from the blacklist.</p>
     * 
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated
     * 
     * @param request RemoveClientFromBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    // Deprecated
    public RemoveClientFromBlackListResponse removeClientFromBlackListWithOptions(RemoveClientFromBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveClientFromBlackList"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClientFromBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API operation is available only for CPFS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Remove the client from the blacklist.</p>
     * 
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated
     * 
     * @param request RemoveClientFromBlackListRequest
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    // Deprecated
    public RemoveClientFromBlackListResponse removeClientFromBlackList(RemoveClientFromBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClientFromBlackListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Running state.</li>
     * <li>To roll back a file system to a snapshot, you must specify the ID of the snapshot that is created from the file system.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a file system to a snapshot of the file system.</p>
     * 
     * @param request ResetFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetFileSystemResponse
     */
    public ResetFileSystemResponse resetFileSystemWithOptions(ResetFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Running state.</li>
     * <li>To roll back a file system to a snapshot, you must specify the ID of the snapshot that is created from the file system.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a file system to a snapshot of the file system.</p>
     * 
     * @param request ResetFileSystemRequest
     * @return ResetFileSystemResponse
     */
    public ResetFileSystemResponse resetFileSystem(ResetFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retries failed a data retrieval task.</p>
     * 
     * @param request RetryLifecycleRetrieveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryLifecycleRetrieveJobResponse
     */
    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJobWithOptions(RetryLifecycleRetrieveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryLifecycleRetrieveJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryLifecycleRetrieveJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retries failed a data retrieval task.</p>
     * 
     * @param request RetryLifecycleRetrieveJobRequest
     * @return RetryLifecycleRetrieveJobResponse
     */
    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose File Storage NAS (NAS) file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory quota for a file system.</p>
     * 
     * @param request SetDirQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDirQuotaResponse
     */
    public SetDirQuotaResponse setDirQuotaWithOptions(SetDirQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileCountLimit)) {
            query.put("FileCountLimit", request.fileCountLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaType)) {
            query.put("QuotaType", request.quotaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeLimit)) {
            query.put("SizeLimit", request.sizeLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDirQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDirQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose File Storage NAS (NAS) file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory quota for a file system.</p>
     * 
     * @param request SetDirQuotaRequest
     * @return SetDirQuotaResponse
     */
    public SetDirQuotaResponse setDirQuota(SetDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDirQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for Lingjun V2.7.0 and later support this operation.</p>
     * <ul>
     * <li>The minimum capacity quota of a fileset is 10 GiB. The scaling step size is 1 GiB.</li>
     * <li>A fileset supports a minimum of 10,000 files or directories and a maximum of 10 billion files or directories. The scaling step size is 1.</li>
     * <li>When modifying a directory quota, you must set the new capacity or file quantity higher than what is currently used.</li>
     * <li>You must configure at least one of the Capacity Limit (GiB) and File Limit parameters.</li>
     * <li>The quota statistics have a 15-minute latency. The actual usage takes effect after 15 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the quota for a fileset.</p>
     * 
     * @param request SetFilesetQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetFilesetQuotaResponse
     */
    public SetFilesetQuotaResponse setFilesetQuotaWithOptions(SetFilesetQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileCountLimit)) {
            query.put("FileCountLimit", request.fileCountLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeLimit)) {
            query.put("SizeLimit", request.sizeLimit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetFilesetQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetFilesetQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for Lingjun V2.7.0 and later support this operation.</p>
     * <ul>
     * <li>The minimum capacity quota of a fileset is 10 GiB. The scaling step size is 1 GiB.</li>
     * <li>A fileset supports a minimum of 10,000 files or directories and a maximum of 10 billion files or directories. The scaling step size is 1.</li>
     * <li>When modifying a directory quota, you must set the new capacity or file quantity higher than what is currently used.</li>
     * <li>You must configure at least one of the Capacity Limit (GiB) and File Limit parameters.</li>
     * <li>The quota statistics have a 15-minute latency. The actual usage takes effect after 15 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the quota for a fileset.</p>
     * 
     * @param request SetFilesetQuotaRequest
     * @return SetFilesetQuotaResponse
     */
    public SetFilesetQuotaResponse setFilesetQuota(SetFilesetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setFilesetQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can enable the data flows that are only in the <code>Stopped</code> state.</li>
     * <li>If the value of DryRun is <code>true</code>, you can check whether sufficient resources are available to enable the specified data flow. If the resources are insufficient, the data flow cannot be enabled.</li>
     * <li>It generally takes 2 to 5 minutes to enable a data flow. You can query the data flow status by calling the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a dataflow.</p>
     * 
     * @param request StartDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDataFlowResponse
     */
    public StartDataFlowResponse startDataFlowWithOptions(StartDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can enable the data flows that are only in the <code>Stopped</code> state.</li>
     * <li>If the value of DryRun is <code>true</code>, you can check whether sufficient resources are available to enable the specified data flow. If the resources are insufficient, the data flow cannot be enabled.</li>
     * <li>It generally takes 2 to 5 minutes to enable a data flow. You can query the data flow status by calling the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a dataflow.</p>
     * 
     * @param request StartDataFlowRequest
     * @return StartDataFlowResponse
     */
    public StartDataFlowResponse startDataFlow(StartDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to CPFS file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can disable only the dataflows that are in the <code>Running</code> state.</li>
     * <li>After a dataflow is disabled, you cannot create a dataflow task for the dataflow. If AutoRefresh is configured, source data updates are not synchronized to CPFS.</li>
     * <li>After a dataflow is disabled, the dataflow throughput is no longer billed because resources are reclaimed. However, the dataflow may fail to be restarted due to insufficient resources.</li>
     * <li>It generally takes 2 to 5 minutes to disable a dataflow. You can call the <a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a> operation to query the dataflow status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a dataflow.</p>
     * 
     * @param request StopDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDataFlowResponse
     */
    public StopDataFlowResponse stopDataFlowWithOptions(StopDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to CPFS file systems.</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can disable only the dataflows that are in the <code>Running</code> state.</li>
     * <li>After a dataflow is disabled, you cannot create a dataflow task for the dataflow. If AutoRefresh is configured, source data updates are not synchronized to CPFS.</li>
     * <li>After a dataflow is disabled, the dataflow throughput is no longer billed because resources are reclaimed. However, the dataflow may fail to be restarted due to insufficient resources.</li>
     * <li>It generally takes 2 to 5 minutes to disable a dataflow. You can call the <a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a> operation to query the dataflow status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a dataflow.</p>
     * 
     * @param request StopDataFlowRequest
     * @return StopDataFlowResponse
     */
    public StopDataFlowResponse stopDataFlow(StopDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates tags and binds the tags to file systems.</p>
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
            new TeaPair("version", "2017-06-26"),
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
     * <b>summary</b> : 
     * <p>Creates tags and binds the tags to file systems.</p>
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
     * <p>Removes tags from a file system.</p>
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
            new TeaPair("version", "2017-06-26"),
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
     * <p>Removes tags from a file system.</p>
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
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the retention period of data in the recycle bin of a file system.</p>
     * 
     * @param request UpdateRecycleBinAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecycleBinAttributeResponse
     */
    public UpdateRecycleBinAttributeResponse updateRecycleBinAttributeWithOptions(UpdateRecycleBinAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecycleBinAttribute"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecycleBinAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the retention period of data in the recycle bin of a file system.</p>
     * 
     * @param request UpdateRecycleBinAttributeRequest
     * @return UpdateRecycleBinAttributeResponse
     */
    public UpdateRecycleBinAttributeResponse updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecycleBinAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Extreme NAS file systems and CPFS file systems can be scaled up. CPFS file systems are available only on the China site (aliyun.com).</p>
     * <ul>
     * <li>A General-purpose NAS file system is automatically scaled up. You do not need to call this operation to scale up a General-purpose NAS file system.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales up an Extreme NAS file system or a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request UpgradeFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeFileSystemResponse
     */
    public UpgradeFileSystemResponse upgradeFileSystemWithOptions(UpgradeFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only Extreme NAS file systems and CPFS file systems can be scaled up. CPFS file systems are available only on the China site (aliyun.com).</p>
     * <ul>
     * <li>A General-purpose NAS file system is automatically scaled up. You do not need to call this operation to scale up a General-purpose NAS file system.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales up an Extreme NAS file system or a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request UpgradeFileSystemRequest
     * @return UpgradeFileSystemResponse
     */
    public UpgradeFileSystemResponse upgradeFileSystem(UpgradeFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFileSystemWithOptions(request, runtime);
    }
}
