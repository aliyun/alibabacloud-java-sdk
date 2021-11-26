// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113;

import com.aliyun.tea.*;
import com.aliyun.cmpinc20210113.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cmpinc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateOXSDeliveryTaskResponse createOXSDeliveryTaskWithOptions(CreateOXSDeliveryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AzoneId", request.azoneId);
        query.put("DeliveryApp", request.deliveryApp);
        query.put("DeliveryProduct", request.deliveryProduct);
        query.put("Domestic", request.domestic);
        query.put("EmpIds", request.empIds);
        query.put("IdcName", request.idcName);
        query.put("IdcNameForExpansion", request.idcNameForExpansion);
        query.put("InstanceType", request.instanceType);
        query.put("IpCidrBlocks", request.ipCidrBlocks);
        query.put("IsDisabled", request.isDisabled);
        query.put("Latitude", request.latitude);
        query.put("Longitude", request.longitude);
        query.put("RegionId", request.regionId);
        query.put("RegionName", request.regionName);
        query.put("SecurityGroupType", request.securityGroupType);
        query.put("SkipCreateEcs", request.skipCreateEcs);
        query.put("SkipQuotaApply", request.skipQuotaApply);
        query.put("SupportVpc", request.supportVpc);
        query.put("SystemDiskCategory", request.systemDiskCategory);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOXSDeliveryTask"),
            new TeaPair("version", "2021-01-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOXSDeliveryTaskResponse());
    }

    public CreateOXSDeliveryTaskResponse createOXSDeliveryTask(CreateOXSDeliveryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOXSDeliveryTaskWithOptions(request, runtime);
    }

    public DeleteOXSDeliveryWhiteListResponse deleteOXSDeliveryWhiteListWithOptions(DeleteOXSDeliveryWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IdcName", request.idcName);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOXSDeliveryWhiteList"),
            new TeaPair("version", "2021-01-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOXSDeliveryWhiteListResponse());
    }

    public DeleteOXSDeliveryWhiteListResponse deleteOXSDeliveryWhiteList(DeleteOXSDeliveryWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOXSDeliveryWhiteListWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-01-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    public ListTasksResponse listTasksWithOptions(ListTasksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appName)) {
            request.appNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appName, "AppName", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appNameShrink);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Status", request.status);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2021-01-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }
}
