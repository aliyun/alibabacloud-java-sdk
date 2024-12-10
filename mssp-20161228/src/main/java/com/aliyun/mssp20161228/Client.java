// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228;

import com.aliyun.tea.*;
import com.aliyun.mssp20161228.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mssp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Create Service Work Order</p>
     * 
     * @param request CreateServiceWorkOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceWorkOrderResponse
     */
    public CreateServiceWorkOrderResponse createServiceWorkOrderWithOptions(CreateServiceWorkOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            body.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            body.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationDay)) {
            body.put("DurationDay", request.durationDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAttachment)) {
            body.put("IsAttachment", request.isAttachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isWorkOrderNotify)) {
            body.put("IsWorkOrderNotify", request.isWorkOrderNotify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyDay)) {
            body.put("NotifyDay", request.notifyDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyId)) {
            body.put("NotifyId", request.notifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateRemark)) {
            body.put("OperateRemark", request.operateRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            body.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderDetail)) {
            body.put("WorkOrderDetail", request.workOrderDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderName)) {
            body.put("WorkOrderName", request.workOrderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderSource)) {
            body.put("WorkOrderSource", request.workOrderSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderStatus)) {
            body.put("WorkOrderStatus", request.workOrderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderType)) {
            body.put("WorkOrderType", request.workOrderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceWorkOrder"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceWorkOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Service Work Order</p>
     * 
     * @param request CreateServiceWorkOrderRequest
     * @return CreateServiceWorkOrderResponse
     */
    public CreateServiceWorkOrderResponse createServiceWorkOrder(CreateServiceWorkOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceWorkOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Process Service Work Order</p>
     * 
     * @param request DisposeServiceWorkOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisposeServiceWorkOrderResponse
     */
    public DisposeServiceWorkOrderResponse disposeServiceWorkOrderWithOptions(DisposeServiceWorkOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentName)) {
            body.put("AttachmentName", request.attachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardOwnerId)) {
            body.put("ForwardOwnerId", request.forwardOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAttachment)) {
            body.put("IsAttachment", request.isAttachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isWorkOrderNotify)) {
            body.put("IsWorkOrderNotify", request.isWorkOrderNotify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyId)) {
            body.put("NotifyId", request.notifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateRemark)) {
            body.put("OperateRemark", request.operateRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            body.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeOwnerId)) {
            body.put("UpgradeOwnerId", request.upgradeOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderDetail)) {
            body.put("WorkOrderDetail", request.workOrderDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderName)) {
            body.put("WorkOrderName", request.workOrderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderStatus)) {
            body.put("WorkOrderStatus", request.workOrderStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisposeServiceWorkOrder"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisposeServiceWorkOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Process Service Work Order</p>
     * 
     * @param request DisposeServiceWorkOrderRequest
     * @return DisposeServiceWorkOrderResponse
     */
    public DisposeServiceWorkOrderResponse disposeServiceWorkOrder(DisposeServiceWorkOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disposeServiceWorkOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Handle Alert Work Order</p>
     * 
     * @param request DisposeWorkTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisposeWorkTaskResponse
     */
    public DisposeWorkTaskResponse disposeWorkTaskWithOptions(DisposeWorkTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optRemark)) {
            body.put("OptRemark", request.optRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            body.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisposeWorkTask"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisposeWorkTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Handle Alert Work Order</p>
     * 
     * @param request DisposeWorkTaskRequest
     * @return DisposeWorkTaskResponse
     */
    public DisposeWorkTaskResponse disposeWorkTask(DisposeWorkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disposeWorkTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Alarm Details</p>
     * 
     * @param request GetAlarmDetailByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlarmDetailByIdResponse
     */
    public GetAlarmDetailByIdResponse getAlarmDetailByIdWithOptions(GetAlarmDetailByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlarmDetailById"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlarmDetailByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Alarm Details</p>
     * 
     * @param request GetAlarmDetailByIdRequest
     * @return GetAlarmDetailByIdResponse
     */
    public GetAlarmDetailByIdResponse getAlarmDetailById(GetAlarmDetailByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlarmDetailByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Trend of Attacked Asset Convergence</p>
     * 
     * @param request GetAttackedAssetDealRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAttackedAssetDealResponse
     */
    public GetAttackedAssetDealResponse getAttackedAssetDealWithOptions(GetAttackedAssetDealRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAttackedAssetDeal"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAttackedAssetDealResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Trend of Attacked Asset Convergence</p>
     * 
     * @param request GetAttackedAssetDealRequest
     * @return GetAttackedAssetDealResponse
     */
    public GetAttackedAssetDealResponse getAttackedAssetDeal(GetAttackedAssetDealRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttackedAssetDealWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Compliance Risk Convergence Trend</p>
     * 
     * @param request GetBaselineSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBaselineSummaryResponse
     */
    public GetBaselineSummaryResponse getBaselineSummaryWithOptions(GetBaselineSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Compliance Risk Convergence Trend</p>
     * 
     * @param request GetBaselineSummaryRequest
     * @return GetBaselineSummaryResponse
     */
    public GetBaselineSummaryResponse getBaselineSummary(GetBaselineSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Console Score</p>
     * 
     * @param request GetConsoleScoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsoleScoreResponse
     */
    public GetConsoleScoreResponse getConsoleScoreWithOptions(GetConsoleScoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsoleScore"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsoleScoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Console Score</p>
     * 
     * @param request GetConsoleScoreRequest
     * @return GetConsoleScoreResponse
     */
    public GetConsoleScoreResponse getConsoleScore(GetConsoleScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsoleScoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Risk Details</p>
     * 
     * @param request GetDetailByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDetailByIdResponse
     */
    public GetDetailByIdResponse getDetailByIdWithOptions(GetDetailByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetailById"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetailByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Risk Details</p>
     * 
     * @param request GetDetailByIdRequest
     * @return GetDetailByIdResponse
     */
    public GetDetailByIdResponse getDetailById(GetDetailByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetailByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Single Service Report Download</p>
     * 
     * @param request GetDocumentDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentDownloadUrlResponse
     */
    public GetDocumentDownloadUrlResponse getDocumentDownloadUrlWithOptions(GetDocumentDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentDownloadUrl"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Single Service Report Download</p>
     * 
     * @param request GetDocumentDownloadUrlRequest
     * @return GetDocumentDownloadUrlResponse
     */
    public GetDocumentDownloadUrlResponse getDocumentDownloadUrl(GetDocumentDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Service Report Query</p>
     * 
     * @param request GetDocumentPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentPageResponse
     */
    public GetDocumentPageResponse getDocumentPageWithOptions(GetDocumentPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveredBy)) {
            body.put("DeliveredBy", request.deliveredBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            body.put("DocumentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            body.put("ReportType", request.reportType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentPage"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Service Report Query</p>
     * 
     * @param request GetDocumentPageRequest
     * @return GetDocumentPageResponse
     */
    public GetDocumentPageResponse getDocumentPage(GetDocumentPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Service Report Home Page Statistics Acquisition</p>
     * 
     * @param request GetDocumentSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentSummaryResponse
     */
    public GetDocumentSummaryResponse getDocumentSummaryWithOptions(GetDocumentSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            body.put("ReportType", request.reportType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Service Report Home Page Statistics Acquisition</p>
     * 
     * @param request GetDocumentSummaryRequest
     * @return GetDocumentSummaryResponse
     */
    public GetDocumentSummaryResponse getDocumentSummary(GetDocumentSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Recently Uploaded Service Reports</p>
     * 
     * @param request GetRecentDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecentDocumentResponse
     */
    public GetRecentDocumentResponse getRecentDocumentWithOptions(GetRecentDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecentDocument"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecentDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Recently Uploaded Service Reports</p>
     * 
     * @param request GetRecentDocumentRequest
     * @return GetRecentDocumentResponse
     */
    public GetRecentDocumentResponse getRecentDocument(GetRecentDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecentDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Safety Coverage</p>
     * 
     * @param request GetSafetyCoverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSafetyCoverResponse
     */
    public GetSafetyCoverResponse getSafetyCoverWithOptions(GetSafetyCoverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSafetyCover"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSafetyCoverResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Safety Coverage</p>
     * 
     * @param request GetSafetyCoverRequest
     * @return GetSafetyCoverResponse
     */
    public GetSafetyCoverResponse getSafetyCover(GetSafetyCoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSafetyCoverWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get SOW List</p>
     * 
     * @param request GetSowListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSowListResponse
     */
    public GetSowListResponse getSowListWithOptions(GetSowListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSowList"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSowListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get SOW List</p>
     * 
     * @param request GetSowListRequest
     * @return GetSowListResponse
     */
    public GetSowListResponse getSowList(GetSowListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSowListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alarm Disposal Query</p>
     * 
     * @param request GetSuspEventPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuspEventPageResponse
     */
    public GetSuspEventPageResponse getSuspEventPageWithOptions(GetSuspEventPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmEndTime)) {
            body.put("AlarmEndTime", request.alarmEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmStartTime)) {
            body.put("AlarmStartTime", request.alarmStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuspEventPage"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuspEventPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alarm Disposal Query</p>
     * 
     * @param request GetSuspEventPageRequest
     * @return GetSuspEventPageResponse
     */
    public GetSuspEventPageResponse getSuspEventPage(GetSuspEventPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuspEventPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Alert Statistics</p>
     * 
     * @param request GetSuspEventSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuspEventSummaryResponse
     */
    public GetSuspEventSummaryResponse getSuspEventSummaryWithOptions(GetSuspEventSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuspEventSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuspEventSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Alert Statistics</p>
     * 
     * @param request GetSuspEventSummaryRequest
     * @return GetSuspEventSummaryResponse
     */
    public GetSuspEventSummaryResponse getSuspEventSummary(GetSuspEventSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuspEventSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alarm Page Statistics</p>
     * 
     * @param request GetSuspPageSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuspPageSummaryResponse
     */
    public GetSuspPageSummaryResponse getSuspPageSummaryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuspPageSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuspPageSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alarm Page Statistics</p>
     * @return GetSuspPageSummaryResponse
     */
    public GetSuspPageSummaryResponse getSuspPageSummary() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuspPageSummaryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query User Activation Status</p>
     * 
     * @param request GetUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserStatusResponse
     */
    public GetUserStatusResponse getUserStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserStatus"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query User Activation Status</p>
     * @return GetUserStatusResponse
     */
    public GetUserStatusResponse getUserStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Risk Query</p>
     * 
     * @param request GetVulItemPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulItemPageResponse
     */
    public GetVulItemPageResponse getVulItemPageWithOptions(GetVulItemPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            body.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            body.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanType)) {
            body.put("ScanType", request.scanType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulItemPage"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulItemPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Risk Query</p>
     * 
     * @param request GetVulItemPageRequest
     * @return GetVulItemPageResponse
     */
    public GetVulItemPageResponse getVulItemPage(GetVulItemPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulItemPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query processed details</p>
     * 
     * @param request GetVulListByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulListByIdResponse
     */
    public GetVulListByIdResponse getVulListByIdWithOptions(GetVulListByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            body.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.necessity)) {
            body.put("Necessity", request.necessity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            body.put("Uuids", request.uuids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulListById"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulListByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query processed details</p>
     * 
     * @param request GetVulListByIdRequest
     * @return GetVulListByIdResponse
     */
    public GetVulListByIdResponse getVulListById(GetVulListByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulListByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Risk Page Statistics</p>
     * 
     * @param request GetVulPageSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulPageSummaryResponse
     */
    public GetVulPageSummaryResponse getVulPageSummaryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulPageSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulPageSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Risk Page Statistics</p>
     * @return GetVulPageSummaryResponse
     */
    public GetVulPageSummaryResponse getVulPageSummary() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulPageSummaryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Risk Statistics</p>
     * 
     * @param request GetVulSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVulSummaryResponse
     */
    public GetVulSummaryResponse getVulSummaryWithOptions(GetVulSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVulSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVulSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Risk Statistics</p>
     * 
     * @param request GetVulSummaryRequest
     * @return GetVulSummaryResponse
     */
    public GetVulSummaryResponse getVulSummary(GetVulSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVulSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the First Line Work Order Statistics</p>
     * 
     * @param request GetWorkTaskSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkTaskSummaryResponse
     */
    public GetWorkTaskSummaryResponse getWorkTaskSummaryWithOptions(GetWorkTaskSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspEventSource)) {
            body.put("SuspEventSource", request.suspEventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkTaskSummary"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkTaskSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the First Line Work Order Statistics</p>
     * 
     * @param request GetWorkTaskSummaryRequest
     * @return GetWorkTaskSummaryResponse
     */
    public GetWorkTaskSummaryResponse getWorkTaskSummary(GetWorkTaskSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkTaskSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Service Customer Information Query</p>
     * 
     * @param request PageServiceCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageServiceCustomerResponse
     */
    public PageServiceCustomerResponse pageServiceCustomerWithOptions(PageServiceCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authStatus)) {
            body.put("AuthStatus", request.authStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmAuthStatus)) {
            body.put("CmAuthStatus", request.cmAuthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorAuthStatus)) {
            body.put("MonitorAuthStatus", request.monitorAuthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageServiceCustomer"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageServiceCustomerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Service Customer Information Query</p>
     * 
     * @param request PageServiceCustomerRequest
     * @return PageServiceCustomerResponse
     */
    public PageServiceCustomerResponse pageServiceCustomer(PageServiceCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageServiceCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Send Custom Alert Event</p>
     * 
     * @param request SendCustomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendCustomEventResponse
     */
    public SendCustomEventResponse sendCustomEventWithOptions(SendCustomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            body.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventDescription)) {
            body.put("EventDescription", request.eventDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventDetails)) {
            body.put("EventDetails", request.eventDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.findTime)) {
            body.put("FindTime", request.findTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSend)) {
            body.put("IsSend", request.isSend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occurrenceTime)) {
            body.put("OccurrenceTime", request.occurrenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            body.put("UniqueId", request.uniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCustomEvent"),
            new TeaPair("version", "2016-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCustomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Send Custom Alert Event</p>
     * 
     * @param request SendCustomEventRequest
     * @return SendCustomEventResponse
     */
    public SendCustomEventResponse sendCustomEvent(SendCustomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCustomEventWithOptions(request, runtime);
    }
}
