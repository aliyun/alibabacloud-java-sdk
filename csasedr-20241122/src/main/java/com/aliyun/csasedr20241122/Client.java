// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122;

import com.aliyun.tea.*;
import com.aliyun.csasedr20241122.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("csasedr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Queries security alert types.</p>
     * 
     * @param request DescribeNsasSuspEventTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNsasSuspEventTypeResponse
     */
    public DescribeNsasSuspEventTypeResponse describeNsasSuspEventTypeWithOptions(DescribeNsasSuspEventTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldName)) {
            query.put("ContainerFieldName", request.containerFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldValue)) {
            query.put("ContainerFieldValue", request.containerFieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            query.put("Uuids", request.uuids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNsasSuspEventType"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNsasSuspEventTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries security alert types.</p>
     * 
     * @param request DescribeNsasSuspEventTypeRequest
     * @return DescribeNsasSuspEventTypeResponse
     */
    public DescribeNsasSuspEventTypeResponse describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNsasSuspEventTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the handling operations that can be displayed for a specified endpoint alert. When initiating a subsequent response, you must select the operation items returned in this response where UserCanOperate is true, and submit parameters as required by the response operation. The query result does not guarantee that the subsequent response will succeed.
     * The actual returned results are affected by feature switches, canary releases, dynamic allowlists, alert templates, alert statuses, and filter conditions. The list may be empty. The examples are used to illustrate field formats or rule combinations and do not represent that a specific alert will definitely return these values. MappingMarkFields and its subfields are generic compatibility structures. The current query pipeline does not populate their elements, and you should not infer that this operation supports the corresponding capabilities based on them.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the handling operations, operability, and whitelist rule configurations for a specified endpoint alert in its current state.</p>
     * 
     * @param request DescribeSecurityEventOperationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventOperationsResponse
     */
    public DescribeSecurityEventOperationsResponse describeSecurityEventOperationsWithOptions(DescribeSecurityEventOperationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityEventId)) {
            query.put("SecurityEventId", request.securityEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventOperations"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventOperationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the handling operations that can be displayed for a specified endpoint alert. When initiating a subsequent response, you must select the operation items returned in this response where UserCanOperate is true, and submit parameters as required by the response operation. The query result does not guarantee that the subsequent response will succeed.
     * The actual returned results are affected by feature switches, canary releases, dynamic allowlists, alert templates, alert statuses, and filter conditions. The list may be empty. The examples are used to illustrate field formats or rule combinations and do not represent that a specific alert will definitely return these values. MappingMarkFields and its subfields are generic compatibility structures. The current query pipeline does not populate their elements, and you should not infer that this operation supports the corresponding capabilities based on them.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the handling operations, operability, and whitelist rule configurations for a specified endpoint alert in its current state.</p>
     * 
     * @param request DescribeSecurityEventOperationsRequest
     * @return DescribeSecurityEventOperationsResponse
     */
    public DescribeSecurityEventOperationsResponse describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventOperationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries endpoint security alerts and supports filtering by alert, endpoint, and processing status.</p>
     * 
     * @param request DescribeSuspEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSuspEventsResponse
     */
    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmEventName)) {
            query.put("AlarmEventName", request.alarmEventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmUniqueInfo)) {
            query.put("AlarmUniqueInfo", request.alarmUniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsTypeList)) {
            query.put("AssetsTypeList", request.assetsTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldName)) {
            query.put("ContainerFieldName", request.containerFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldValue)) {
            query.put("ContainerFieldValue", request.containerFieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            query.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventNames)) {
            query.put("EventNames", request.eventNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerIp)) {
            query.put("InnerIp", request.innerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levels)) {
            query.put("Levels", request.levels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateErrorCodeList)) {
            query.put("OperateErrorCodeList", request.operateErrorCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTimeEnd)) {
            query.put("OperateTimeEnd", request.operateTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTimeStart)) {
            query.put("OperateTimeStart", request.operateTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentEventTypes)) {
            query.put("ParentEventTypes", request.parentEventTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortColumn)) {
            query.put("SortColumn", request.sortColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIp)) {
            query.put("SrcIp", request.srcIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictMode)) {
            query.put("StrictMode", request.strictMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeEnd)) {
            query.put("TimeEnd", request.timeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStart)) {
            query.put("TimeStart", request.timeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueInfo)) {
            query.put("UniqueInfo", request.uniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            query.put("Uuids", request.uuids);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tacticId)) {
            body.put("TacticId", request.tacticId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSuspEvents"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSuspEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries endpoint security alerts and supports filtering by alert, endpoint, and processing status.</p>
     * 
     * @param request DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Handles security alert events.</p>
     * 
     * @param request HandleSecurityEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HandleSecurityEventsResponse
     */
    public HandleSecurityEventsResponse handleSecurityEventsWithOptions(HandleSecurityEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.markBatch)) {
            query.put("MarkBatch", request.markBatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.markMissParam)) {
            query.put("MarkMissParam", request.markMissParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationCode)) {
            query.put("OperationCode", request.operationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationParams)) {
            query.put("OperationParams", request.operationParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEventIds)) {
            query.put("SecurityEventIds", request.securityEventIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HandleSecurityEvents"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HandleSecurityEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Handles security alert events.</p>
     * 
     * @param request HandleSecurityEventsRequest
     * @return HandleSecurityEventsResponse
     */
    public HandleSecurityEventsResponse handleSecurityEvents(HandleSecurityEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleSecurityEventsWithOptions(request, runtime);
    }
}
