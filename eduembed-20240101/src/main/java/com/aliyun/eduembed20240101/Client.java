// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101;

import com.aliyun.tea.*;
import com.aliyun.eduembed20240101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eduembed", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 创建实验预约
     *
     * @param request CreateLabReservationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLabReservationResponse
     */
    public CreateLabReservationResponse createLabReservationWithOptions(CreateLabReservationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labId)) {
            body.put("LabId", request.labId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberCount)) {
            body.put("MemberCount", request.memberCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLabReservation"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLabReservationResponse());
    }

    /**
     * @summary 创建实验预约
     *
     * @param request CreateLabReservationRequest
     * @return CreateLabReservationResponse
     */
    public CreateLabReservationResponse createLabReservation(CreateLabReservationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLabReservationWithOptions(request, runtime);
    }

    /**
     * @summary 创建实验会话
     *
     * @param request CreateLabSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLabSessionResponse
     */
    public CreateLabSessionResponse createLabSessionWithOptions(CreateLabSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labId)) {
            body.put("LabId", request.labId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramAccountId)) {
            body.put("RamAccountId", request.ramAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLabSession"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLabSessionResponse());
    }

    /**
     * @summary 创建实验会话
     *
     * @param request CreateLabSessionRequest
     * @return CreateLabSessionResponse
     */
    public CreateLabSessionResponse createLabSession(CreateLabSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLabSessionWithOptions(request, runtime);
    }

    /**
     * @summary 查看实验详情
     *
     * @param request DescribeLabRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLabResponse
     */
    public DescribeLabResponse describeLabWithOptions(DescribeLabRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLab"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLabResponse());
    }

    /**
     * @summary 查看实验详情
     *
     * @param request DescribeLabRequest
     * @return DescribeLabResponse
     */
    public DescribeLabResponse describeLab(DescribeLabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLabWithOptions(request, runtime);
    }

    /**
     * @summary 查询实验预约
     *
     * @param request DescribeLabReservationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLabReservationResponse
     */
    public DescribeLabReservationResponse describeLabReservationWithOptions(DescribeLabReservationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLabReservation"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLabReservationResponse());
    }

    /**
     * @summary 查询实验预约
     *
     * @param request DescribeLabReservationRequest
     * @return DescribeLabReservationResponse
     */
    public DescribeLabReservationResponse describeLabReservation(DescribeLabReservationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLabReservationWithOptions(request, runtime);
    }

    /**
     * @summary 查看实验会话信息
     *
     * @param request DescribeLabSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLabSessionResponse
     */
    public DescribeLabSessionResponse describeLabSessionWithOptions(DescribeLabSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLabSession"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLabSessionResponse());
    }

    /**
     * @summary 查看实验会话信息
     *
     * @param request DescribeLabSessionRequest
     * @return DescribeLabSessionResponse
     */
    public DescribeLabSessionResponse describeLabSession(DescribeLabSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLabSessionWithOptions(request, runtime);
    }

    /**
     * @summary 分页查询实验预约
     *
     * @param request PageListLabReservationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageListLabReservationsResponse
     */
    public PageListLabReservationsResponse pageListLabReservationsWithOptions(PageListLabReservationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageListLabReservations"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageListLabReservationsResponse());
    }

    /**
     * @summary 分页查询实验预约
     *
     * @param request PageListLabReservationsRequest
     * @return PageListLabReservationsResponse
     */
    public PageListLabReservationsResponse pageListLabReservations(PageListLabReservationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageListLabReservationsWithOptions(request, runtime);
    }

    /**
     * @summary 分页查询实验会话
     *
     * @param request PageListLabSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageListLabSessionsResponse
     */
    public PageListLabSessionsResponse pageListLabSessionsWithOptions(PageListLabSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageListLabSessions"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageListLabSessionsResponse());
    }

    /**
     * @summary 分页查询实验会话
     *
     * @param request PageListLabSessionsRequest
     * @return PageListLabSessionsResponse
     */
    public PageListLabSessionsResponse pageListLabSessions(PageListLabSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageListLabSessionsWithOptions(request, runtime);
    }

    /**
     * @summary 分页查询实验
     *
     * @param request PageListLabsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageListLabsResponse
     */
    public PageListLabsResponse pageListLabsWithOptions(PageListLabsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageListLabs"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageListLabsResponse());
    }

    /**
     * @summary 分页查询实验
     *
     * @param request PageListLabsRequest
     * @return PageListLabsResponse
     */
    public PageListLabsResponse pageListLabs(PageListLabsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageListLabsWithOptions(request, runtime);
    }

    /**
     * @summary 移除实验预约
     *
     * @param request RemoveLabReservationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveLabReservationResponse
     */
    public RemoveLabReservationResponse removeLabReservationWithOptions(RemoveLabReservationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labReservationId)) {
            body.put("LabReservationId", request.labReservationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveLabReservation"),
            new TeaPair("version", "2024-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveLabReservationResponse());
    }

    /**
     * @summary 移除实验预约
     *
     * @param request RemoveLabReservationRequest
     * @return RemoveLabReservationResponse
     */
    public RemoveLabReservationResponse removeLabReservation(RemoveLabReservationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeLabReservationWithOptions(request, runtime);
    }
}
