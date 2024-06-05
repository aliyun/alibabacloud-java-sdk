// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626;

import com.aliyun.tea.*;
import com.aliyun.nas20170626.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-chengdu", "nas.aliyuncs.com"),
            new TeaPair("me-east-1", "nas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "nas.aliyuncs.com")
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
     * @description The API operation is available only for CPFS file systems.
     *
     * @param request AddClientToBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddClientToBlackListResponse
     */
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
     * @description The API operation is available only for CPFS file systems.
     *
     * @param request AddClientToBlackListRequest
     * @return AddClientToBlackListResponse
     */
    public AddClientToBlackListResponse addClientToBlackList(AddClientToBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClientToBlackListWithOptions(request, runtime);
    }

    /**
     * @description ## Limits
     * *   Each tag includes a TagKey and a TagValue.
     * *   Placeholders at the start and end of each TagKey and TagValue are automatically removed. These placeholders include the spacebar ( ), tab (\\t), line break (\\n), and carriage return (\\r).
     * *   You must specify a TagKey. You can leave a TagValue empty.
     * *   A TagKey and TagValue are not case-sensitive.
     * *   A TagKey can be a maximum of 64 characters in length. A TagValue can be a maximum of 128 characters in length.
     * *   You can add a maximum of 10 tags to a file system at a time. If you add two tags with the same TagKey, the new tag added will overwrite the existing tag.
     * *   If you remove a tag from all linked file systems, the tag is automatically deleted.
     *
     * @param request AddTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTagsResponse
     */
    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTags"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagsResponse());
    }

    /**
     * @description ## Limits
     * *   Each tag includes a TagKey and a TagValue.
     * *   Placeholders at the start and end of each TagKey and TagValue are automatically removed. These placeholders include the spacebar ( ), tab (\\t), line break (\\n), and carriage return (\\r).
     * *   You must specify a TagKey. You can leave a TagValue empty.
     * *   A TagKey and TagValue are not case-sensitive.
     * *   A TagKey can be a maximum of 64 characters in length. A TagValue can be a maximum of 128 characters in length.
     * *   You can add a maximum of 10 tags to a file system at a time. If you add two tags with the same TagKey, the new tag added will overwrite the existing tag.
     * *   If you remove a tag from all linked file systems, the tag is automatically deleted.
     *
     * @param request AddTagsRequest
     * @return AddTagsResponse
     */
    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    /**
     * @summary Applies an automatic snapshot policy to one or more file systems.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     * *   You can apply only one automatic snapshot policy to each file system.
     * *   Each automatic snapshot policy can be applied to multiple file systems.
     * *   If an automatic snapshot policy is applied to a file system, you can call the ApplyAutoSnapshotPolicy operation to change the automatic snapshot policy.
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
     * @summary Applies an automatic snapshot policy to one or more file systems.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     * *   You can apply only one automatic snapshot policy to each file system.
     * *   Each automatic snapshot policy can be applied to multiple file systems.
     * *   If an automatic snapshot policy is applied to a file system, you can call the ApplyAutoSnapshotPolicy operation to change the automatic snapshot policy.
     *
     * @param request ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Adds AutoRefresh configurations to a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can add AutoRefresh configurations only to the dataflows that are in the `Running` state.
     * *   You can add a maximum of five AutoRefresh configurations to a dataflow.
     * *   It generally takes 2 to 5 minutes to create an AutoRefresh configuration. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/336901.html) operation to query the dataflow status.
     * *   AutoRefresh depends on the object modification events collected by EventBridge from the source Object Storage Service (OSS) bucket. You must first [activate EventBridge](https://help.aliyun.com/document_detail/182246.html).
     *     **
     *     **Note** The event buses and event rules created for CPFS in the EventBridge console contain the `Create for cpfs auto refresh` description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.
     * *   The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.
     * *   After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.
     * *   AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes Misconfigured. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.
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
     * @summary Adds AutoRefresh configurations to a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can add AutoRefresh configurations only to the dataflows that are in the `Running` state.
     * *   You can add a maximum of five AutoRefresh configurations to a dataflow.
     * *   It generally takes 2 to 5 minutes to create an AutoRefresh configuration. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/336901.html) operation to query the dataflow status.
     * *   AutoRefresh depends on the object modification events collected by EventBridge from the source Object Storage Service (OSS) bucket. You must first [activate EventBridge](https://help.aliyun.com/document_detail/182246.html).
     *     **
     *     **Note** The event buses and event rules created for CPFS in the EventBridge console contain the `Create for cpfs auto refresh` description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.
     * *   The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.
     * *   After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.
     * *   AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes Misconfigured. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.
     *
     * @param request ApplyDataFlowAutoRefreshRequest
     * @return ApplyDataFlowAutoRefreshResponse
     */
    public ApplyDataFlowAutoRefreshResponse applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * @summary Removes automatic snapshot policies from one or more file systems.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
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
     * @summary Removes automatic snapshot policies from one or more file systems.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     *
     * @param request CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Cancels the AutoRefresh configuration for a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can cancel AutoRefresh configurations only for the dataflows that are in the `Running` or `Stopped` state.
     * *   It generally takes 2 to 5 minutes to cancel the AutoRefresh configurations. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/336901.html) operation to query the status of the AutoRefresh tasks.
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
     * @summary Cancels the AutoRefresh configuration for a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can cancel AutoRefresh configurations only for the dataflows that are in the `Running` or `Stopped` state.
     * *   It generally takes 2 to 5 minutes to cancel the AutoRefresh configurations. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/336901.html) operation to query the status of the AutoRefresh tasks.
     *
     * @param request CancelDataFlowAutoRefreshRequest
     * @return CancelDataFlowAutoRefreshResponse
     */
    public CancelDataFlowAutoRefreshResponse cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * @summary Cancels a dataflow task that is not running.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflow tasks. You can view the version information on the file system details page in the console.
     * *   You can cancel only the dataflow tasks that are in the `Pending` and `Executing` states.
     * *   It generally takes 5 to 10 minutes to cancel a dataflow task. You can query the task execution status by calling the [DescribeDataFlowTasks](https://help.aliyun.com/document_detail/2402275.html) operation.
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
     * @summary Cancels a dataflow task that is not running.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflow tasks. You can view the version information on the file system details page in the console.
     * *   You can cancel only the dataflow tasks that are in the `Pending` and `Executing` states.
     * *   It generally takes 5 to 10 minutes to cancel a dataflow task. You can query the task execution status by calling the [DescribeDataFlowTasks](https://help.aliyun.com/document_detail/2402275.html) operation.
     *
     * @param request CancelDataFlowTaskRequest
     * @return CancelDataFlowTaskResponse
     */
    public CancelDataFlowTaskResponse cancelDataFlowTask(CancelDataFlowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowTaskWithOptions(request, runtime);
    }

    /**
     * @summary Cancels the directory quota of a file system.
     *
     * @description Only General-purpose file systems support the directory quota feature.
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
     * @summary Cancels the directory quota of a file system.
     *
     * @description Only General-purpose file systems support the directory quota feature.
     *
     * @param request CancelDirQuotaRequest
     * @return CancelDirQuotaResponse
     */
    public CancelDirQuotaResponse cancelDirQuota(CancelDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDirQuotaWithOptions(request, runtime);
    }

    /**
     * @summary Cancels a running data retrieval task.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Cancels a running data retrieval task.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request CancelLifecycleRetrieveJobRequest
     * @return CancelLifecycleRetrieveJobResponse
     */
    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * @summary Cancels a running job of the recycle bin.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.
     * *   If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.
     * *   If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.
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
     * @summary Cancels a running job of the recycle bin.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.
     * *   If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.
     * *   If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.
     *
     * @param request CancelRecycleBinJobRequest
     * @return CancelRecycleBinJobResponse
     */
    public CancelRecycleBinJobResponse cancelRecycleBinJob(CancelRecycleBinJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRecycleBinJobWithOptions(request, runtime);
    }

    /**
     * @summary 资源转组
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
     * @summary 资源转组
     *
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a permission group.
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
     * @summary Creates a permission group.
     *
     * @param request CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    public CreateAccessGroupResponse createAccessGroup(CreateAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessGroupWithOptions(request, runtime);
    }

    /**
     * @summary 创建接入点
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
     * @summary 创建接入点
     *
     * @param request CreateAccessPointRequest
     * @return CreateAccessPointResponse
     */
    public CreateAccessPointResponse createAccessPoint(CreateAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessPointWithOptions(request, runtime);
    }

    /**
     * @summary Creates a rule for a permission group.
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
     * @summary Creates a rule for a permission group.
     *
     * @param request CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createAccessRule(CreateAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessRuleWithOptions(request, runtime);
    }

    /**
     * @summary Creates an automatic snapshot policy.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     * *   You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account.
     * *   If an auto snapshot is being created when the scheduled time for a new auto snapshot arrives, the creation of the new snapshot is skipped. This occurs if the file system stores a large volume of data. For example, you have scheduled auto snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a file system. The system starts to create an auto snapshot at 09:00:00 and does not complete the process until 10:20:00. The process takes 80 minutes because the file system has a large volume of data. In this case, the system does not create an auto snapshot at 10:00:00, but creates an auto snapshot at 11:00:00.
     * *   A maximum of 128 auto snapshots can be created for a file system. If the upper limit is reached, the earliest auto snapshot is deleted. This rule does not apply to manual snapshots.
     * *   If you modify the retention period of an automatic snapshot policy, the modification applies only to subsequent snapshots, but not to the existing snapshots.
     * *   If an auto snapshot is being created for a file system, you cannot create a manual snapshot for the file system. You must wait after the auto snapshot is created.
     * *   You can only apply automatic snapshot policies to a file system that is in the Running state.
     * *   All auto snapshots are named in the `auto_yyyyMMdd_X` format, where: `auto` indicates that the snapshot is created based on an automatic snapshot policy. `yyyyMMdd` indicates the date on which the snapshot is created. `y` indicates the year. `M` indicates the month. `d` indicates the day. `X` indicates the ordinal number of the snapshot on the current day. For example, `auto_20201018_1` indicates the first auto snapshot that was created on October 18, 2020.
     * *   After an automatic snapshot policy is created, you can call the ApplyAutoSnapshotPolicy operation to apply the policy to a file system and call the ModifyAutoSnapshotPolicy operation to modify the policy.
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
     * @summary Creates an automatic snapshot policy.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     * *   You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account.
     * *   If an auto snapshot is being created when the scheduled time for a new auto snapshot arrives, the creation of the new snapshot is skipped. This occurs if the file system stores a large volume of data. For example, you have scheduled auto snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a file system. The system starts to create an auto snapshot at 09:00:00 and does not complete the process until 10:20:00. The process takes 80 minutes because the file system has a large volume of data. In this case, the system does not create an auto snapshot at 10:00:00, but creates an auto snapshot at 11:00:00.
     * *   A maximum of 128 auto snapshots can be created for a file system. If the upper limit is reached, the earliest auto snapshot is deleted. This rule does not apply to manual snapshots.
     * *   If you modify the retention period of an automatic snapshot policy, the modification applies only to subsequent snapshots, but not to the existing snapshots.
     * *   If an auto snapshot is being created for a file system, you cannot create a manual snapshot for the file system. You must wait after the auto snapshot is created.
     * *   You can only apply automatic snapshot policies to a file system that is in the Running state.
     * *   All auto snapshots are named in the `auto_yyyyMMdd_X` format, where: `auto` indicates that the snapshot is created based on an automatic snapshot policy. `yyyyMMdd` indicates the date on which the snapshot is created. `y` indicates the year. `M` indicates the month. `d` indicates the day. `X` indicates the ordinal number of the snapshot on the current day. For example, `auto_20201018_1` indicates the first auto snapshot that was created on October 18, 2020.
     * *   After an automatic snapshot policy is created, you can call the ApplyAutoSnapshotPolicy operation to apply the policy to a file system and call the ModifyAutoSnapshotPolicy operation to modify the policy.
     *
     * @param request CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Creates a dataflow for a Cloud Parallel File Storage (CPFS) file system and source storage.
     *
     * @description *   Billing
     *     *   If you create a dataflow, you are charged for using the dataflow throughput. For more information, see [Billing methods and billable items of CPFS](https://help.aliyun.com/document_detail/111858.html).
     *     *   When you configure the AutoRefresh feature for a dataflow, CPFS must use EventBridge to collect object modification events from the source Object Storage Service (OSS) bucket. Event fees are incurred. For more information, see [Billing of EventBridge](https://help.aliyun.com/document_detail/163752.html).
     * *   Dataflow specifications
     *     *   The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.
     *     *   When you create a dataflow, the vSwitch IP addresses used by a CPFS mount target are consumed. Make sure that the vSwitch can provide sufficient IP addresses.
     *     *   Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.
     * *   Fileset
     *     *   The destination for a dataflow is a fileset in the CPFS file system. A fileset is a new directory tree structure (a small file directory) in a CPFS file system. Each fileset independently manages an inode space.
     *     *   When you create a dataflow, the related fileset must already exist and cannot be nested with other filesets. Only one dataflow can be created in a fileset, which corresponds to one source storage.
     *     *   A fileset supports a maximum of one million files. If the number of files imported from an OSS bucket into the fileset exceeds the upper limit, the `no space` error message is returned when you add new files.
     *     **
     *     **Note** If data already exists in the fileset, after you create a dataflow, the existing data in the fileset is cleared and replaced with the data synchronized from the OSS bucket.
     * *   Source storage
     *     *   The source storage is an OSS bucket. SourceStorage for a dataflow must be an OSS bucket. The prefix of an OSS bucket is not supported.
     *     *   CPFS dataflows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.
     *     *   If dataflows for multiple CPFS file systems or multiple dataflows for the same CPFS file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS file systems to one OSS bucket.
     *     *   Dataflows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.
     *         **
     *         **Note** Before you create a dataflow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created dataflow can access the data in the OSS bucket. When a dataflow is being used, do not delete or modify the tag. Otherwise, the dataflow for CPFS cannot access the data in the OSS bucket.
     * *   AutoRefresh
     *     *   After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.
     *     *   AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first [activate EventBridge](https://help.aliyun.com/document_detail/182246.html).
     *     *   The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. You can configure a maximum of five AutoRefresh directories for a dataflow.
     *     *   AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes `Misconfigured`. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.
     *     *   When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.
     *     **
     *     **Note** The event buses and event rules created for CPFS in the EventBridge console contain the `Create for cpfs auto refresh` description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly
     * *   Permissions
     *     When you create a dataflow, CPFS obtains two service-linked roles: `AliyunServiceRoleForNasOssDataflow` and `AliyunServiceRoleForNasEventNotification`. For more information, see [CPFS service-linked roles](https://help.aliyun.com/document_detail/185138.html).
     * *   Basic operations
     *     *   Only CPFS V2.2.0 and later support dataflows.
     *     *   You can create a dataflow only if the CPFS file system is in the Running state.
     *     *   A maximum of 10 dataflows can be created for a CPFS file system.
     *     *   It generally takes 2 to 5 minutes to create a dataflow. You can call the DescribeDataFlows operation to check whether the dataflow has been created.
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
     * @summary Creates a dataflow for a Cloud Parallel File Storage (CPFS) file system and source storage.
     *
     * @description *   Billing
     *     *   If you create a dataflow, you are charged for using the dataflow throughput. For more information, see [Billing methods and billable items of CPFS](https://help.aliyun.com/document_detail/111858.html).
     *     *   When you configure the AutoRefresh feature for a dataflow, CPFS must use EventBridge to collect object modification events from the source Object Storage Service (OSS) bucket. Event fees are incurred. For more information, see [Billing of EventBridge](https://help.aliyun.com/document_detail/163752.html).
     * *   Dataflow specifications
     *     *   The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.
     *     *   When you create a dataflow, the vSwitch IP addresses used by a CPFS mount target are consumed. Make sure that the vSwitch can provide sufficient IP addresses.
     *     *   Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.
     * *   Fileset
     *     *   The destination for a dataflow is a fileset in the CPFS file system. A fileset is a new directory tree structure (a small file directory) in a CPFS file system. Each fileset independently manages an inode space.
     *     *   When you create a dataflow, the related fileset must already exist and cannot be nested with other filesets. Only one dataflow can be created in a fileset, which corresponds to one source storage.
     *     *   A fileset supports a maximum of one million files. If the number of files imported from an OSS bucket into the fileset exceeds the upper limit, the `no space` error message is returned when you add new files.
     *     **
     *     **Note** If data already exists in the fileset, after you create a dataflow, the existing data in the fileset is cleared and replaced with the data synchronized from the OSS bucket.
     * *   Source storage
     *     *   The source storage is an OSS bucket. SourceStorage for a dataflow must be an OSS bucket. The prefix of an OSS bucket is not supported.
     *     *   CPFS dataflows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.
     *     *   If dataflows for multiple CPFS file systems or multiple dataflows for the same CPFS file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS file systems to one OSS bucket.
     *     *   Dataflows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.
     *         **
     *         **Note** Before you create a dataflow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created dataflow can access the data in the OSS bucket. When a dataflow is being used, do not delete or modify the tag. Otherwise, the dataflow for CPFS cannot access the data in the OSS bucket.
     * *   AutoRefresh
     *     *   After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.
     *     *   AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first [activate EventBridge](https://help.aliyun.com/document_detail/182246.html).
     *     *   The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. You can configure a maximum of five AutoRefresh directories for a dataflow.
     *     *   AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes `Misconfigured`. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.
     *     *   When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.
     *     **
     *     **Note** The event buses and event rules created for CPFS in the EventBridge console contain the `Create for cpfs auto refresh` description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly
     * *   Permissions
     *     When you create a dataflow, CPFS obtains two service-linked roles: `AliyunServiceRoleForNasOssDataflow` and `AliyunServiceRoleForNasEventNotification`. For more information, see [CPFS service-linked roles](https://help.aliyun.com/document_detail/185138.html).
     * *   Basic operations
     *     *   Only CPFS V2.2.0 and later support dataflows.
     *     *   You can create a dataflow only if the CPFS file system is in the Running state.
     *     *   A maximum of 10 dataflows can be created for a CPFS file system.
     *     *   It generally takes 2 to 5 minutes to create a dataflow. You can call the DescribeDataFlows operation to check whether the dataflow has been created.
     *
     * @param request CreateDataFlowRequest
     * @return CreateDataFlowResponse
     */
    public CreateDataFlowResponse createDataFlow(CreateDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowWithOptions(request, runtime);
    }

    /**
     * @summary Creates a dataflow task.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Dataflow tasks can be created only in CPFS V2.2.0 and later. You can view the version information on the file system details page in the console.
     * *   You can create a dataflow task only for a dataflow that is in the Running state.
     * *   Dataflow tasks are executed asynchronously. You can call the [DescribeDataFlowTasks](https://help.aliyun.com/document_detail/336914.html) operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.
     * *   When you manually run a dataflow task, the automatic data update task for the dataflow is interrupted and enters the pending state.
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

        if (!com.aliyun.teautil.Common.isUnset(request.entryList)) {
            query.put("EntryList", request.entryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTaskId)) {
            query.put("SrcTaskId", request.srcTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
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
     * @summary Creates a dataflow task.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Dataflow tasks can be created only in CPFS V2.2.0 and later. You can view the version information on the file system details page in the console.
     * *   You can create a dataflow task only for a dataflow that is in the Running state.
     * *   Dataflow tasks are executed asynchronously. You can call the [DescribeDataFlowTasks](https://help.aliyun.com/document_detail/336914.html) operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.
     * *   When you manually run a dataflow task, the automatic data update task for the dataflow is interrupted and enters the pending state.
     *
     * @param request CreateDataFlowTaskRequest
     * @return CreateDataFlowTaskResponse
     */
    public CreateDataFlowTaskResponse createDataFlowTask(CreateDataFlowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowTaskWithOptions(request, runtime);
    }

    /**
     * @summary 创建目录
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
     * @summary 创建目录
     *
     * @param request CreateDirRequest
     * @return CreateDirResponse
     */
    public CreateDirResponse createDir(CreateDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirWithOptions(request, runtime);
    }

    /**
     * @summary Creates a directory or file.
     *
     * @description *   This operation is only available to some users.
     * *   This operation supports only General-purpose NAS file systems that use the Server Message Block (SMB) protocol and have Resource Access Management (RAM) enabled.
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
     * @summary Creates a directory or file.
     *
     * @description *   This operation is only available to some users.
     * *   This operation supports only General-purpose NAS file systems that use the Server Message Block (SMB) protocol and have Resource Access Management (RAM) enabled.
     *
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    /**
     * @summary Creates a file system.
     *
     * @description *   Before you call this operation, you must understand the billing and pricing of Apsara File Storage NAS. For more information, see [Billing](https://help.aliyun.com/document_detail/178365.html) and [Pricing](https://www.alibabacloud.com/product/nas/pricing).
     * *   Before you create a file system, you must complete real-name verification.
     * *   When you call this operation, a service-linked role of NAS is automatically created. For more information, see [Manage the service-linked roles of NAS](https://help.aliyun.com/document_detail/208530.html).
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
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
     * @summary Creates a file system.
     *
     * @description *   Before you call this operation, you must understand the billing and pricing of Apsara File Storage NAS. For more information, see [Billing](https://help.aliyun.com/document_detail/178365.html) and [Pricing](https://www.alibabacloud.com/product/nas/pricing).
     * *   Before you create a file system, you must complete real-name verification.
     * *   When you call this operation, a service-linked role of NAS is automatically created. For more information, see [Manage the service-linked roles of NAS](https://help.aliyun.com/document_detail/208530.html).
     *
     * @param request CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

    /**
     * @summary Creates a fileset.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.
     * *   A maximum of 10 filesets can be created for a CPFS file system.
     * *   The maximum depth supported by a fileset is eight levels. The depth of the root directory / is 0 levels. For example, the /test/aaa/ccc/ fileset has three levels.
     * *   Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset.
     * *   A fileset supports a maximum of one million files. If the number of files exceeds the upper limit, the `no space` error message is returned when you add new files.
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
     * @summary Creates a fileset.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.
     * *   A maximum of 10 filesets can be created for a CPFS file system.
     * *   The maximum depth supported by a fileset is eight levels. The depth of the root directory / is 0 levels. For example, the /test/aaa/ccc/ fileset has three levels.
     * *   Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset.
     * *   A fileset supports a maximum of one million files. If the number of files exceeds the upper limit, the `no space` error message is returned when you add new files.
     *
     * @param request CreateFilesetRequest
     * @return CreateFilesetResponse
     */
    public CreateFilesetResponse createFileset(CreateFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFilesetWithOptions(request, runtime);
    }

    /**
     * @summary Creates LDAP configurations.
     *
     * @param request CreateLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLDAPConfigResponse
     */
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
     * @summary Creates LDAP configurations.
     *
     * @param request CreateLDAPConfigRequest
     * @return CreateLDAPConfigResponse
     */
    public CreateLDAPConfigResponse createLDAPConfig(CreateLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLDAPConfigWithOptions(request, runtime);
    }

    /**
     * @summary Creates a lifecycle policy.
     *
     * @description *   You can create lifecycle policies only for General-purpose NAS file systems.
     * *   You can create up to 20 lifecycle policies in each region within an Alibaba Cloud account.
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
     * @summary Creates a lifecycle policy.
     *
     * @description *   You can create lifecycle policies only for General-purpose NAS file systems.
     * *   You can create up to 20 lifecycle policies in each region within an Alibaba Cloud account.
     *
     * @param request CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     */
    public CreateLifecyclePolicyResponse createLifecyclePolicy(CreateLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * @summary Creates a data retrieval task.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   You can run a maximum of 20 data retrieval tasks in each region within an Alibaba Cloud account.
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
     * @summary Creates a data retrieval task.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   You can run a maximum of 20 data retrieval tasks in each region within an Alibaba Cloud account.
     *
     * @param request CreateLifecycleRetrieveJobRequest
     * @return CreateLifecycleRetrieveJobResponse
     */
    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * @summary Dumps the logs of a General-purpose NAS file system to Simple Log Service.
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
     * @summary Dumps the logs of a General-purpose NAS file system to Simple Log Service.
     *
     * @param request CreateLogAnalysisRequest
     * @return CreateLogAnalysisResponse
     */
    public CreateLogAnalysisResponse createLogAnalysis(CreateLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogAnalysisWithOptions(request, runtime);
    }

    /**
     * @summary Creates a mount target.
     *
     * @description *   After you call the CreateMountTarget operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the **Active** state, you can then mount the file system. Otherwise, the file system may fail to be mounted.
     * *   When you call this operation, a service-linked role of NAS is automatically created. For more information, see [Manage the service-linked roles of NAS](https://help.aliyun.com/document_detail/208530.html).
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
     * @summary Creates a mount target.
     *
     * @description *   After you call the CreateMountTarget operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the **Active** state, you can then mount the file system. Otherwise, the file system may fail to be mounted.
     * *   When you call this operation, a service-linked role of NAS is automatically created. For more information, see [Manage the service-linked roles of NAS](https://help.aliyun.com/document_detail/208530.html).
     *
     * @param request CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Creates an export directory for a protocol service.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Prerequisites
     *     A protocol service is created.
     * *   Others
     *     *   The virtual private cloud (VPC) CIDR block of the export directory for the protocol service cannot overlap with the VPC CIDR block of the file system.
     *     *   The VPC CIDR blocks of multiple export directories of a protocol service cannot overlap.
     *     *   You can create a maximum of 10 export directories for a protocol service.
     *     *   When you create export directories for a protocol service, a maximum of 32 IP addresses that are allocated by the specified vSwitch are used. Make sure that the vSwitch can provide sufficient IP addresses.
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
     * @summary Creates an export directory for a protocol service.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Prerequisites
     *     A protocol service is created.
     * *   Others
     *     *   The virtual private cloud (VPC) CIDR block of the export directory for the protocol service cannot overlap with the VPC CIDR block of the file system.
     *     *   The VPC CIDR blocks of multiple export directories of a protocol service cannot overlap.
     *     *   You can create a maximum of 10 export directories for a protocol service.
     *     *   When you create export directories for a protocol service, a maximum of 32 IP addresses that are allocated by the specified vSwitch are used. Make sure that the vSwitch can provide sufficient IP addresses.
     *
     * @param request CreateProtocolMountTargetRequest
     * @return CreateProtocolMountTargetResponse
     */
    public CreateProtocolMountTargetResponse createProtocolMountTarget(CreateProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Creates a protocol service for a Cloud Parallel File Storage (CPFS) file system. The creation takes about 5 to 10 minutes.
     *
     * @description *   This operation is available only to CPFS file systems on the China site (aliyun.com).
     * *   Only CPFS V2.3.0 and later support protocol services. You can query the version information of the file system by calling the [DescribeFileSystems](~~2402188.~~) operation.
     * *   Protocol service types
     *     Protocol services are classified into general-purpose protocol services and cache protocol services. Different from general-purpose protocol services, cache protocol services can cache hot data. If data exists in the cache, the bandwidth of the cache protocol service may exceed the bandwidth of the CPFS file system, reaching the maximum bandwidth specified for the protocol service.
     *     *   General-purpose protocol services: provide NFS access and [directory-level mount targets](https://help.aliyun.com/document_detail/427175.html) for CPFS file systems. You do not need to configure a POSIX client to manage clusters. General-purpose protocol services are provided free of charge.
     *     *   Cache protocol services: provide the server memory cache based on the least recently used (LRU) policy. When data is cached in the memory, CPFS provides higher internal bandwidth. Cache protocol services are divided into Cache L1 and Cache L2 specifications. The differences are the internal bandwidth size and memory cache size.
     *        >   Note You are charged for using cache protocol services, which are in invitational preview. For more information about the billing method of cache protocol services, see [Billable items](https://help.aliyun.com/document_detail/111858.html). If you have any feedback or questions, you can join the DingTalk group (group number: 31045006299).
     * *   Protocol type
     *     Only NFSv3 is supported.
     * *   Others
     *     *   Only one protocol service can be created for a CPFS file system.
     *     *   A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.
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
     * @summary Creates a protocol service for a Cloud Parallel File Storage (CPFS) file system. The creation takes about 5 to 10 minutes.
     *
     * @description *   This operation is available only to CPFS file systems on the China site (aliyun.com).
     * *   Only CPFS V2.3.0 and later support protocol services. You can query the version information of the file system by calling the [DescribeFileSystems](~~2402188.~~) operation.
     * *   Protocol service types
     *     Protocol services are classified into general-purpose protocol services and cache protocol services. Different from general-purpose protocol services, cache protocol services can cache hot data. If data exists in the cache, the bandwidth of the cache protocol service may exceed the bandwidth of the CPFS file system, reaching the maximum bandwidth specified for the protocol service.
     *     *   General-purpose protocol services: provide NFS access and [directory-level mount targets](https://help.aliyun.com/document_detail/427175.html) for CPFS file systems. You do not need to configure a POSIX client to manage clusters. General-purpose protocol services are provided free of charge.
     *     *   Cache protocol services: provide the server memory cache based on the least recently used (LRU) policy. When data is cached in the memory, CPFS provides higher internal bandwidth. Cache protocol services are divided into Cache L1 and Cache L2 specifications. The differences are the internal bandwidth size and memory cache size.
     *        >   Note You are charged for using cache protocol services, which are in invitational preview. For more information about the billing method of cache protocol services, see [Billable items](https://help.aliyun.com/document_detail/111858.html). If you have any feedback or questions, you can join the DingTalk group (group number: 31045006299).
     * *   Protocol type
     *     Only NFSv3 is supported.
     * *   Others
     *     *   Only one protocol service can be created for a CPFS file system.
     *     *   A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.
     *
     * @param request CreateProtocolServiceRequest
     * @return CreateProtocolServiceResponse
     */
    public CreateProtocolServiceResponse createProtocolService(CreateProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProtocolServiceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a job to permanently delete a file or directory from the recycle bin.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   If you permanently delete a directory, the files in the directory are recursively cleared.
     * *   You can run only one job at a time for a single file system to permanently delete the files from the file system. You cannot create a restoration or deletion job when a file or directory is being deleted.
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
     * @summary Creates a job to permanently delete a file or directory from the recycle bin.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   If you permanently delete a directory, the files in the directory are recursively cleared.
     * *   You can run only one job at a time for a single file system to permanently delete the files from the file system. You cannot create a restoration or deletion job when a file or directory is being deleted.
     *
     * @param request CreateRecycleBinDeleteJobRequest
     * @return CreateRecycleBinDeleteJobResponse
     */
    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecycleBinDeleteJobWithOptions(request, runtime);
    }

    /**
     * @summary Restores a file or directory from the recycle bin.
     *
     * @description ### Usage notes
     * *   Only General-purpose NAS file systems support this operation.
     * *   You can run only one job at a time for a single file system to restore files to or clear files from the file system. You cannot create a restore or cleanup job when files are being restored from the recycle bin.
     * *   You can restore only one file or directory in a single restore job. If you restore a specified directory, all files in the directory are recursively restored.
     * *   After files are restored, the data of the files is defragmented. When the data is being defragmented, the read performance is slightly degraded.
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
     * @summary Restores a file or directory from the recycle bin.
     *
     * @description ### Usage notes
     * *   Only General-purpose NAS file systems support this operation.
     * *   You can run only one job at a time for a single file system to restore files to or clear files from the file system. You cannot create a restore or cleanup job when files are being restored from the recycle bin.
     * *   You can restore only one file or directory in a single restore job. If you restore a specified directory, all files in the directory are recursively restored.
     * *   After files are restored, the data of the files is defragmented. When the data is being defragmented, the read performance is slightly degraded.
     *
     * @param request CreateRecycleBinRestoreJobRequest
     * @return CreateRecycleBinRestoreJobResponse
     */
    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecycleBinRestoreJobWithOptions(request, runtime);
    }

    /**
     * @summary Creates a snapshot.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/zh/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     * *   You can create a maximum of 128 snapshots for a file system.
     * *   The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.
     * *   You can create only one snapshot for a file system at a time.
     * *   If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.
     * *   When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.
     * *   A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.
     * *   Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.
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
     * @summary Creates a snapshot.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/zh/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     * *   You can create a maximum of 128 snapshots for a file system.
     * *   The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.
     * *   You can create only one snapshot for a file system at a time.
     * *   If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.
     * *   When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.
     * *   A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.
     * *   Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.
     *
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a permission group.
     *
     * @description The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.
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
     * @summary Deletes a permission group.
     *
     * @description The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.
     *
     * @param request DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroup(DeleteAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessGroupWithOptions(request, runtime);
    }

    /**
     * @summary 删除接入点
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
     * @summary 删除接入点
     *
     * @param request DeleteAccessPointRequest
     * @return DeleteAccessPointResponse
     */
    public DeleteAccessPointResponse deleteAccessPoint(DeleteAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessPointWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a rule from a permission group.
     *
     * @description Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.
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
     * @summary Deletes a rule from a permission group.
     *
     * @description Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.
     *
     * @param request DeleteAccessRuleRequest
     * @return DeleteAccessRuleResponse
     */
    public DeleteAccessRuleResponse deleteAccessRule(DeleteAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessRuleWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an automatic snapshot policy.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     * *   If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.
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
     * @summary Deletes an automatic snapshot policy.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     * *   If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.
     *
     * @param request DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   You can create filesets only in CPFS V2.2.0 and later. You can view the version information on the file system details page in the console.
     * *   You can delete the dataflows that are only in the `Running` or `Stopped` state.
     * *   After a dataflow is deleted, the resources related to the dataflow are released and cannot be restored. You must create a dataflow again if required.
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
     * @summary Deletes a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   You can create filesets only in CPFS V2.2.0 and later. You can view the version information on the file system details page in the console.
     * *   You can delete the dataflows that are only in the `Running` or `Stopped` state.
     * *   After a dataflow is deleted, the resources related to the dataflow are released and cannot be restored. You must create a dataflow again if required.
     *
     * @param request DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     */
    public DeleteDataFlowResponse deleteDataFlow(DeleteDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataFlowWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a file system.
     *
     * @description *   Before you delete a file system, you must delete all mount targets of the file system.
     * *   Before you delete a file system, you must make sure that no lifecycle policy is created for the file system.
     * *   After a file system is deleted, the data on the file system cannot be restored. Proceed with caution.
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
     * @summary Deletes a file system.
     *
     * @description *   Before you delete a file system, you must delete all mount targets of the file system.
     * *   Before you delete a file system, you must make sure that no lifecycle policy is created for the file system.
     * *   After a file system is deleted, the data on the file system cannot be restored. Proceed with caution.
     *
     * @param request DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a fileset.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support fileset deletion. After you delete a fileset, all data in the fileset is deleted and cannot be restored. Proceed with caution.
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
     * @summary Deletes a fileset.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support fileset deletion. After you delete a fileset, all data in the fileset is deleted and cannot be restored. Proceed with caution.
     *
     * @param request DeleteFilesetRequest
     * @return DeleteFilesetResponse
     */
    public DeleteFilesetResponse deleteFileset(DeleteFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFilesetWithOptions(request, runtime);
    }

    /**
     * @param request DeleteLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLDAPConfigResponse
     */
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
     * @param request DeleteLDAPConfigRequest
     * @return DeleteLDAPConfigResponse
     */
    public DeleteLDAPConfigResponse deleteLDAPConfig(DeleteLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLDAPConfigWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a lifecycle policy.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Deletes a lifecycle policy.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request DeleteLifecyclePolicyRequest
     * @return DeleteLifecyclePolicyResponse
     */
    public DeleteLifecyclePolicyResponse deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * @summary Disables log dumping for a General-purpose NAS file system.
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
     * @summary Disables log dumping for a General-purpose NAS file system.
     *
     * @param request DeleteLogAnalysisRequest
     * @return DeleteLogAnalysisResponse
     */
    public DeleteLogAnalysisResponse deleteLogAnalysis(DeleteLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogAnalysisWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a mount target.
     *
     * @description After you delete a mount target, the mount target cannot be restored. Proceed with caution.
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
     * @summary Deletes a mount target.
     *
     * @description After you delete a mount target, the mount target cannot be restored. Proceed with caution.
     *
     * @param request DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an export directory of a protocol service.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
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
     * @summary Deletes an export directory of a protocol service.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     *
     * @param request DeleteProtocolMountTargetRequest
     * @return DeleteProtocolMountTargetResponse
     */
    public DeleteProtocolMountTargetResponse deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a protocol service of a Cloud Parallel File Storage (CPFS) file system.
     *
     * @description *   This operation is available only to CPFS file systems on the China site (aliyun.com).
     * *   When you delete a protocol service, the export directories in the protocol service are also deleted.
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
     * @summary Deletes a protocol service of a Cloud Parallel File Storage (CPFS) file system.
     *
     * @description *   This operation is available only to CPFS file systems on the China site (aliyun.com).
     * *   When you delete a protocol service, the export directories in the protocol service are also deleted.
     *
     * @param request DeleteProtocolServiceRequest
     * @return DeleteProtocolServiceResponse
     */
    public DeleteProtocolServiceResponse deleteProtocolService(DeleteProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProtocolServiceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a snapshot or cancels a snapshot that is being created.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
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
     * @summary Deletes a snapshot or cancels a snapshot that is being created.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     *
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * @summary Queries permission groups.
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
     * @summary Queries permission groups.
     *
     * @param request DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     */
    public DescribeAccessGroupsResponse describeAccessGroups(DescribeAccessGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessGroupsWithOptions(request, runtime);
    }

    /**
     * @summary 接入点详情页
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
     * @summary 接入点详情页
     *
     * @param request DescribeAccessPointRequest
     * @return DescribeAccessPointResponse
     */
    public DescribeAccessPointResponse describeAccessPoint(DescribeAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointWithOptions(request, runtime);
    }

    /**
     * @summary 查询接入点信息
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
     * @summary 查询接入点信息
     *
     * @param request DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about rules in a permission group.
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
     * @summary Queries the information about rules in a permission group.
     *
     * @param request DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     */
    public DescribeAccessRulesResponse describeAccessRules(DescribeAccessRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries automatic snapshot policies.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
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
     * @summary Queries automatic snapshot policies.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     *
     * @param request DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotPoliciesWithOptions(request, runtime);
    }

    /**
     * @summary Queries automatic snapshot tasks.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
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
     * @summary Queries automatic snapshot tasks.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support the snapshot feature.
     *
     * @param request DescribeAutoSnapshotTasksRequest
     * @return DescribeAutoSnapshotTasksResponse
     */
    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotTasksWithOptions(request, runtime);
    }

    /**
     * @description The API operation is available only for CPFS file systems.
     *
     * @param request DescribeBlackListClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlackListClientsResponse
     */
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
     * @description The API operation is available only for CPFS file systems.
     *
     * @param request DescribeBlackListClientsRequest
     * @return DescribeBlackListClientsResponse
     */
    public DescribeBlackListClientsResponse describeBlackListClients(DescribeBlackListClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlackListClientsWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据流动任务
     *
     * @description ###
     * *
     * *
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
     * @summary 查询数据流动任务
     *
     * @description ###
     * *
     * *
     *
     * @param request DescribeDataFlowTasksRequest
     * @return DescribeDataFlowTasksResponse
     */
    public DescribeDataFlowTasksResponse describeDataFlowTasks(DescribeDataFlowTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowTasksWithOptions(request, runtime);
    }

    /**
     * @summary Queries the dataflows of a CPFS file system.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   In Filters, FsetIds, DataFlowlds, SourceStorage, ThroughputList, and Status support exact match only. FileSystemPath and Description support fuzzy match.
     * *   Combined query is supported.
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
     * @summary Queries the dataflows of a CPFS file system.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   In Filters, FsetIds, DataFlowlds, SourceStorage, ThroughputList, and Status support exact match only. FileSystemPath and Description support fuzzy match.
     * *   Combined query is supported.
     *
     * @param request DescribeDataFlowsRequest
     * @return DescribeDataFlowsResponse
     */
    public DescribeDataFlowsResponse describeDataFlows(DescribeDataFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the directory quotas of a file system.
     *
     * @description Only General-purpose NAS file systems support the directory quota feature.
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
     * @summary Queries the directory quotas of a file system.
     *
     * @description Only General-purpose NAS file systems support the directory quota feature.
     *
     * @param request DescribeDirQuotasRequest
     * @return DescribeDirQuotasResponse
     */
    public DescribeDirQuotasResponse describeDirQuotas(DescribeDirQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirQuotasWithOptions(request, runtime);
    }

    /**
     * @summary Queries the statistics of file systems that are owned by the current account.
     *
     * @param request DescribeFileSystemStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileSystemStatisticsResponse
     */
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
     * @summary Queries the statistics of file systems that are owned by the current account.
     *
     * @param request DescribeFileSystemStatisticsRequest
     * @return DescribeFileSystemStatisticsResponse
     */
    public DescribeFileSystemStatisticsResponse describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemStatisticsWithOptions(request, runtime);
    }

    /**
     * @summary Queries file systems.
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
     * @summary Queries file systems.
     *
     * @param request DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about created filesets.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support filesets. You can view the version information on the file system details page in the console.
     * *   In Filters, FsetIds supports exact match only. FileSystemPath and Description support fuzzy match.
     * *   Combined query is supported.
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
     * @summary Queries the information about created filesets.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support filesets. You can view the version information on the file system details page in the console.
     * *   In Filters, FsetIds supports exact match only. FileSystemPath and Description support fuzzy match.
     * *   Combined query is supported.
     *
     * @param request DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     */
    public DescribeFilesetsResponse describeFilesets(DescribeFilesetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFilesetsWithOptions(request, runtime);
    }

    /**
     * @summary Queries lifecycle policies.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Queries lifecycle policies.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     */
    public DescribeLifecyclePoliciesResponse describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecyclePoliciesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the log dump information configured in log analysis.
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
     * @summary Queries the log dump information configured in log analysis.
     *
     * @param request DescribeLogAnalysisRequest
     * @return DescribeLogAnalysisResponse
     */
    public DescribeLogAnalysisResponse describeLogAnalysis(DescribeLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogAnalysisWithOptions(request, runtime);
    }

    /**
     * @summary Queries mount targets.
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
     * @summary Queries mount targets.
     *
     * @param request DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the clients on which a file system is mounted.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   This operation returns the clients that have accessed the specified file system within the last minute. If the file system is mounted on a client but the client did not access the file system within the last minute, the client is not included in the returned information.
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
     * @summary Queries the clients on which a file system is mounted.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   This operation returns the clients that have accessed the specified file system within the last minute. If the file system is mounted on a client but the client did not access the file system within the last minute, the client is not included in the returned information.
     *
     * @param request DescribeMountedClientsRequest
     * @return DescribeMountedClientsResponse
     */
    public DescribeMountedClientsResponse describeMountedClients(DescribeMountedClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountedClientsWithOptions(request, runtime);
    }

    /**
     * @summary Queries whether the NFS ACL feature is enabled for a file system.
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
     * @summary Queries whether the NFS ACL feature is enabled for a file system.
     *
     * @param request DescribeNfsAclRequest
     * @return DescribeNfsAclResponse
     */
    public DescribeNfsAclResponse describeNfsAcl(DescribeNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNfsAclWithOptions(request, runtime);
    }

    /**
     * @summary Queries the export directories of a protocol service.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
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
     * @summary Queries the export directories of a protocol service.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     *
     * @param request DescribeProtocolMountTargetRequest
     * @return DescribeProtocolMountTargetResponse
     */
    public DescribeProtocolMountTargetResponse describeProtocolMountTarget(DescribeProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about protocol services.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
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
     * @summary Queries the information about protocol services.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     *
     * @param request DescribeProtocolServiceRequest
     * @return DescribeProtocolServiceResponse
     */
    public DescribeProtocolServiceResponse describeProtocolService(DescribeProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProtocolServiceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the regions in which Apsara File Storage NAS is available.
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
     * @summary Queries the regions in which Apsara File Storage NAS is available.
     *
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
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
     * @summary Queries the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
     *
     * @param request DescribeSmbAclRequest
     * @return DescribeSmbAclResponse
     */
    public DescribeSmbAclResponse describeSmbAcl(DescribeSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmbAclWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about one or more snapshots of a file system.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
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
     * @summary Queries the information about one or more snapshots of a file system.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     *
     * @param request DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    /**
     * @summary You can call the DescribeStoragePackages operation to query the list of storage plans.
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
     * @summary You can call the DescribeStoragePackages operation to query the list of storage plans.
     *
     * @param request DescribeStoragePackagesRequest
     * @return DescribeStoragePackagesResponse
     */
    public DescribeStoragePackagesResponse describeStoragePackages(DescribeStoragePackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStoragePackagesWithOptions(request, runtime);
    }

    /**
     * @summary Queries all zones in a region and the file system types that are supported in each zone.
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
     * @summary Queries all zones in a region and the file system types that are supported in each zone.
     *
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * @summary Disables and empties the recycle bin of a General-purpose NAS file system.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   If you disable the recycle bin, all files in the recycle bin are permanently deleted.
     * *   If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.
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
     * @summary Disables and empties the recycle bin of a General-purpose NAS file system.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   If you disable the recycle bin, all files in the recycle bin are permanently deleted.
     * *   If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.
     *
     * @param request DisableAndCleanRecycleBinRequest
     * @return DisableAndCleanRecycleBinResponse
     */
    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAndCleanRecycleBinWithOptions(request, runtime);
    }

    /**
     * @summary Disables the NFS ACL feature for a file system.
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
     * @summary Disables the NFS ACL feature for a file system.
     *
     * @param request DisableNfsAclRequest
     * @return DisableNfsAclResponse
     */
    public DisableNfsAclResponse disableNfsAcl(DisableNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableNfsAclWithOptions(request, runtime);
    }

    /**
     * @summary Disables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
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
     * @summary Disables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
     *
     * @param request DisableSmbAclRequest
     * @return DisableSmbAclResponse
     */
    public DisableSmbAclResponse disableSmbAcl(DisableSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSmbAclWithOptions(request, runtime);
    }

    /**
     * @summary Enables the NFS ACL feature for a file system.
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
     * @summary Enables the NFS ACL feature for a file system.
     *
     * @param request EnableNfsAclRequest
     * @return EnableNfsAclResponse
     */
    public EnableNfsAclResponse enableNfsAcl(EnableNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableNfsAclWithOptions(request, runtime);
    }

    /**
     * @summary Enables the recycle bin feature for a file system.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Enables the recycle bin feature for a file system.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request EnableRecycleBinRequest
     * @return EnableRecycleBinResponse
     */
    public EnableRecycleBinResponse enableRecycleBin(EnableRecycleBinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRecycleBinWithOptions(request, runtime);
    }

    /**
     * @summary Enables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
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
     * @summary Enables the access control list (ACL) feature for a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
     *
     * @param request EnableSmbAclRequest
     * @return EnableSmbAclResponse
     */
    public EnableSmbAclResponse enableSmbAcl(EnableSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSmbAclWithOptions(request, runtime);
    }

    /**
     * @summary Queries whether a specified directory contains files stored in the IA storage medium or whether a specified file is stored in the IA storage medium.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Queries whether a specified directory contains files stored in the IA storage medium or whether a specified file is stored in the IA storage medium.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request GetDirectoryOrFilePropertiesRequest
     * @return GetDirectoryOrFilePropertiesResponse
     */
    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectoryOrFilePropertiesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the recycle bin configurations of a General-purpose NAS file system.
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
     * @summary Queries the recycle bin configurations of a General-purpose NAS file system.
     *
     * @param request GetRecycleBinAttributeRequest
     * @return GetRecycleBinAttributeResponse
     */
    public GetRecycleBinAttributeResponse getRecycleBinAttribute(GetRecycleBinAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecycleBinAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the infrequently-accessed files in a specified directory of a General-purpose NAS file system and the subdirectories that contain the files.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Queries the infrequently-accessed files in a specified directory of a General-purpose NAS file system and the subdirectories that contain the files.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request ListDirectoriesAndFilesRequest
     * @return ListDirectoriesAndFilesResponse
     */
    public ListDirectoriesAndFilesResponse listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectoriesAndFilesWithOptions(request, runtime);
    }

    /**
     * @summary Queries data retrieval tasks.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Queries data retrieval tasks.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request ListLifecycleRetrieveJobsRequest
     * @return ListLifecycleRetrieveJobsResponse
     */
    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLifecycleRetrieveJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the directories that are recently deleted.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Queries the directories that are recently deleted.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request ListRecentlyRecycledDirectoriesRequest
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentlyRecycledDirectoriesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the jobs of the recycle bin.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   You can query a maximum of 50 jobs that are recently executed.
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
     * @summary Queries the jobs of the recycle bin.
     *
     * @description *   Only General-purpose NAS file systems support this operation.
     * *   You can query a maximum of 50 jobs that are recently executed.
     *
     * @param request ListRecycleBinJobsRequest
     * @return ListRecycleBinJobsResponse
     */
    public ListRecycleBinJobsResponse listRecycleBinJobs(ListRecycleBinJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecycleBinJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries deleted files or directories.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Queries deleted files or directories.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request ListRecycledDirectoriesAndFilesRequest
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecycledDirectoriesAndFilesWithOptions(request, runtime);
    }

    /**
     * @summary Queries tags.
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
     * @summary Queries tags.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a permission group.
     *
     * @description The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.
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
     * @summary Modifies a permission group.
     *
     * @description The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.
     *
     * @param request ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    public ModifyAccessGroupResponse modifyAccessGroup(ModifyAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessGroupWithOptions(request, runtime);
    }

    /**
     * @summary 修改接入点信息
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
     * @summary 修改接入点信息
     *
     * @param request ModifyAccessPointRequest
     * @return ModifyAccessPointResponse
     */
    public ModifyAccessPointResponse modifyAccessPoint(ModifyAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessPointWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a rule in a permission group.
     *
     * @description The rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.
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
     * @summary Modifies a rule in a permission group.
     *
     * @description The rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.
     *
     * @param request ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    public ModifyAccessRuleResponse modifyAccessRule(ModifyAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessRuleWithOptions(request, runtime);
    }

    /**
     * @summary An automatic snapshot policy is modified. After you modify an automatic snapshot policy that is applied to a file system, the modification immediately applies to subsequent snapshots that are created for the file system.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
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
     * @summary An automatic snapshot policy is modified. After you modify an automatic snapshot policy that is applied to a file system, the modification immediately applies to subsequent snapshots that are created for the file system.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     *
     * @param request ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the attributes of a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows.
     * *   You can modify the attributes only of the dataflows that are in the `Running` state.
     * *   It generally takes 2 to 5 minutes to modify the attributes of a dataflow. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/336901.html) operation to query the status of the dataflow to be modified.
     * *   Data flow specifications:
     *     *   The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.
     *     *   Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.
     * *   Billing
     *     Changing the dataflow throughput involves the billing of dataflow bandwidth. We recommend that you understand CPFS billing methods in advance. For more information, see [Billing methods and billable items of CPFS](https://help.aliyun.com/document_detail/111858.html).
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
     * @summary Modifies the attributes of a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows.
     * *   You can modify the attributes only of the dataflows that are in the `Running` state.
     * *   It generally takes 2 to 5 minutes to modify the attributes of a dataflow. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/336901.html) operation to query the status of the dataflow to be modified.
     * *   Data flow specifications:
     *     *   The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.
     *     *   Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.
     * *   Billing
     *     Changing the dataflow throughput involves the billing of dataflow bandwidth. We recommend that you understand CPFS billing methods in advance. For more information, see [Billing methods and billable items of CPFS](https://help.aliyun.com/document_detail/111858.html).
     *
     * @param request ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     */
    public ModifyDataFlowResponse modifyDataFlow(ModifyDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataFlowWithOptions(request, runtime);
    }

    /**
     * @summary 修改数据流动中的自动更新配置
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
     * @summary 修改数据流动中的自动更新配置
     *
     * @param request ModifyDataFlowAutoRefreshRequest
     * @return ModifyDataFlowAutoRefreshResponse
     */
    public ModifyDataFlowAutoRefreshResponse modifyDataFlowAutoRefresh(ModifyDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the description of a file system.
     *
     * @param request ModifyFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
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
     * @summary Modifies the description of a file system.
     *
     * @param request ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a fileset.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support fileset modification.
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
     * @summary Modifies a fileset.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support fileset modification.
     *
     * @param request ModifyFilesetRequest
     * @return ModifyFilesetResponse
     */
    public ModifyFilesetResponse modifyFileset(ModifyFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFilesetWithOptions(request, runtime);
    }

    /**
     * @description #
     *
     * @param request ModifyLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLDAPConfigResponse
     */
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
     * @description #
     *
     * @param request ModifyLDAPConfigRequest
     * @return ModifyLDAPConfigResponse
     */
    public ModifyLDAPConfigResponse modifyLDAPConfig(ModifyLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLDAPConfigWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a lifecycle policy.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Modifies a lifecycle policy.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     */
    public ModifyLifecyclePolicyResponse modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a mount target.
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
     * @summary Modifies a mount target.
     *
     * @param request ModifyMountTargetRequest
     * @return ModifyMountTargetResponse
     */
    public ModifyMountTargetResponse modifyMountTarget(ModifyMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the export directory parameters of a protocol service. Only the description can be modified. The virtual private cloud (VPC) ID and vSwitch ID cannot be changed. To change these IDs, you must delete the export directory and create a new one.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
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
     * @summary Modifies the export directory parameters of a protocol service. Only the description can be modified. The virtual private cloud (VPC) ID and vSwitch ID cannot be changed. To change these IDs, you must delete the export directory and create a new one.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     *
     * @param request ModifyProtocolMountTargetRequest
     * @return ModifyProtocolMountTargetResponse
     */
    public ModifyProtocolMountTargetResponse modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a protocol service. You can modify the description of a protocol service.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
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
     * @summary Modifies a protocol service. You can modify the description of a protocol service.
     *
     * @description This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     *
     * @param request ModifyProtocolServiceRequest
     * @return ModifyProtocolServiceResponse
     */
    public ModifyProtocolServiceResponse modifyProtocolService(ModifyProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProtocolServiceWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
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
     * @summary Updates the information about the access control list (ACL) feature of a Server Message Block (SMB) file system that resides in an Active Directory (AD) domain.
     *
     * @param request ModifySmbAclRequest
     * @return ModifySmbAclResponse
     */
    public ModifySmbAclResponse modifySmbAcl(ModifySmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmbAclWithOptions(request, runtime);
    }

    /**
     * @summary Activates Apsara File Storage NAS.
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
     * @summary Activates Apsara File Storage NAS.
     *
     * @return OpenNASServiceResponse
     */
    public OpenNASServiceResponse openNASService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openNASServiceWithOptions(runtime);
    }

    /**
     * @description The IP address of a client to remove from the blacklist.
     *
     * @param request RemoveClientFromBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClientFromBlackListResponse
     */
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
     * @description The IP address of a client to remove from the blacklist.
     *
     * @param request RemoveClientFromBlackListRequest
     * @return RemoveClientFromBlackListResponse
     */
    public RemoveClientFromBlackListResponse removeClientFromBlackList(RemoveClientFromBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClientFromBlackListWithOptions(request, runtime);
    }

    /**
     * @description A request ID is returned even if the tag that you want to remove or the associated file system does not exist. For example, if the associated file system does not exist, or the TagKey and TagValue cannot be found, a request ID is returned.
     *
     * @param request RemoveTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTagsResponse
     */
    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTags"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTagsResponse());
    }

    /**
     * @description A request ID is returned even if the tag that you want to remove or the associated file system does not exist. For example, if the associated file system does not exist, or the TagKey and TagValue cannot be found, a request ID is returned.
     *
     * @param request RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    /**
     * @summary Rolls back a file system to a snapshot of the file system.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     * *   The file system must be in the Running state.
     * *   To roll back a file system to a snapshot, you must specify the ID of the snapshot that is created from the file system.
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
     * @summary Rolls back a file system to a snapshot of the file system.
     *
     * @description *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
     * *   Only advanced Extreme NAS file systems support this feature.
     * *   The file system must be in the Running state.
     * *   To roll back a file system to a snapshot, you must specify the ID of the snapshot that is created from the file system.
     *
     * @param request ResetFileSystemRequest
     * @return ResetFileSystemResponse
     */
    public ResetFileSystemResponse resetFileSystem(ResetFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetFileSystemWithOptions(request, runtime);
    }

    /**
     * @summary Retries failed a data retrieval task.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Retries failed a data retrieval task.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request RetryLifecycleRetrieveJobRequest
     * @return RetryLifecycleRetrieveJobResponse
     */
    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * @summary Creates a directory quota for a file system.
     *
     * @description Only General-purpose NFS file systems support the directory quota feature.
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
     * @summary Creates a directory quota for a file system.
     *
     * @description Only General-purpose NFS file systems support the directory quota feature.
     *
     * @param request SetDirQuotaRequest
     * @return SetDirQuotaResponse
     */
    public SetDirQuotaResponse setDirQuota(SetDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDirQuotaWithOptions(request, runtime);
    }

    /**
     * @summary Enables a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can enable the dataflows that are only in the `Stopped` state.
     * *   If the value of DryRun is `true`, you can check whether sufficient resources are available to enable the specified dataflow. If the resources are insufficient, the dataflow cannot be enabled.
     * *   It generally takes 2 to 5 minutes to enable a dataflow. You can query the dataflow status by calling the [DescribeDataFlows](https://help.aliyun.com/document_detail/2402270.html) operation.
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
     * @summary Enables a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can enable the dataflows that are only in the `Stopped` state.
     * *   If the value of DryRun is `true`, you can check whether sufficient resources are available to enable the specified dataflow. If the resources are insufficient, the dataflow cannot be enabled.
     * *   It generally takes 2 to 5 minutes to enable a dataflow. You can query the dataflow status by calling the [DescribeDataFlows](https://help.aliyun.com/document_detail/2402270.html) operation.
     *
     * @param request StartDataFlowRequest
     * @return StartDataFlowResponse
     */
    public StartDataFlowResponse startDataFlow(StartDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDataFlowWithOptions(request, runtime);
    }

    /**
     * @summary Disables a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can disable only the dataflows that are in the `Running` state.
     * *   After a dataflow is disabled, you cannot create a dataflow task for the dataflow. If AutoRefresh is configured, source data updates are not synchronized to CPFS.
     * *   After a dataflow is disabled, the dataflow throughput is no longer billed because resources are reclaimed. However, the dataflow may fail to be restarted due to insufficient resources.
     * *   It generally takes 2 to 5 minutes to disable a dataflow. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/2402271.html) operation to query the dataflow status.
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
     * @summary Disables a dataflow.
     *
     * @description *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
     * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
     * *   You can disable only the dataflows that are in the `Running` state.
     * *   After a dataflow is disabled, you cannot create a dataflow task for the dataflow. If AutoRefresh is configured, source data updates are not synchronized to CPFS.
     * *   After a dataflow is disabled, the dataflow throughput is no longer billed because resources are reclaimed. However, the dataflow may fail to be restarted due to insufficient resources.
     * *   It generally takes 2 to 5 minutes to disable a dataflow. You can call the [DescribeDataFlows](https://help.aliyun.com/document_detail/2402271.html) operation to query the dataflow status.
     *
     * @param request StopDataFlowRequest
     * @return StopDataFlowResponse
     */
    public StopDataFlowResponse stopDataFlow(StopDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDataFlowWithOptions(request, runtime);
    }

    /**
     * @summary Creates tags and binds the tags to file systems.
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
     * @summary Creates tags and binds the tags to file systems.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Removes tags from a file system.
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
     * @summary Removes tags from a file system.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the retention period of data in the recycle bin of a file system.
     *
     * @description Only General-purpose NAS file systems support this operation.
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
     * @summary Modifies the retention period of data in the recycle bin of a file system.
     *
     * @description Only General-purpose NAS file systems support this operation.
     *
     * @param request UpdateRecycleBinAttributeRequest
     * @return UpdateRecycleBinAttributeResponse
     */
    public UpdateRecycleBinAttributeResponse updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecycleBinAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Scales up an Extreme NAS file system or a Cloud Parallel File Storage (CPFS) file system.
     *
     * @description *   Only Extreme NAS file systems and CPFS file systems can be scaled up. CPFS file systems are available only on the China site (aliyun.com).
     * *   A General-purpose NAS file system is automatically scaled up. You do not need to call this operation to scale up a General-purpose NAS file system.
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
     * @summary Scales up an Extreme NAS file system or a Cloud Parallel File Storage (CPFS) file system.
     *
     * @description *   Only Extreme NAS file systems and CPFS file systems can be scaled up. CPFS file systems are available only on the China site (aliyun.com).
     * *   A General-purpose NAS file system is automatically scaled up. You do not need to call this operation to scale up a General-purpose NAS file system.
     *
     * @param request UpgradeFileSystemRequest
     * @return UpgradeFileSystemResponse
     */
    public UpgradeFileSystemResponse upgradeFileSystem(UpgradeFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFileSystemWithOptions(request, runtime);
    }
}
