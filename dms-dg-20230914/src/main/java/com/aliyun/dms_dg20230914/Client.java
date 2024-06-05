// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914;

import com.aliyun.tea.*;
import com.aliyun.dms_dg20230914.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dms-dg", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDatabaseResponse
     */
    public AddDatabaseResponse addDatabaseWithOptions(AddDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbDescription)) {
            body.put("DbDescription", request.dbDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPassword)) {
            body.put("DbPassword", request.dbPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            body.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbUserName)) {
            body.put("DbUserName", request.dbUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDatabase"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDatabaseResponse());
    }

    /**
     * @param request AddDatabaseRequest
     * @return AddDatabaseResponse
     */
    public AddDatabaseResponse addDatabase(AddDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDatabaseWithOptions(request, runtime);
    }

    /**
     * @param request AddDatabaseListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDatabaseListResponse
     */
    public AddDatabaseListResponse addDatabaseListWithOptions(AddDatabaseListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseString)) {
            body.put("DatabaseString", request.databaseString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDatabaseList"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDatabaseListResponse());
    }

    /**
     * @param request AddDatabaseListRequest
     * @return AddDatabaseListResponse
     */
    public AddDatabaseListResponse addDatabaseList(AddDatabaseListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDatabaseListWithOptions(request, runtime);
    }

    /**
     * @param request CheckDGEnabledRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDGEnabledResponse
     */
    public CheckDGEnabledResponse checkDGEnabledWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDGEnabled"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDGEnabledResponse());
    }

    /**
     * @return CheckDGEnabledResponse
     */
    public CheckDGEnabledResponse checkDGEnabled() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDGEnabledWithOptions(runtime);
    }

    /**
     * @param request ConnectDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConnectDatabaseResponse
     */
    public ConnectDatabaseResponse connectDatabaseWithOptions(ConnectDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPassword)) {
            body.put("DbPassword", request.dbPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            body.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbUserName)) {
            body.put("DbUserName", request.dbUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConnectDatabase"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConnectDatabaseResponse());
    }

    /**
     * @param request ConnectDatabaseRequest
     * @return ConnectDatabaseResponse
     */
    public ConnectDatabaseResponse connectDatabase(ConnectDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.connectDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary 创建网关
     *
     * @param request CreateGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayResponse
     */
    public CreateGatewayResponse createGatewayWithOptions(CreateGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayDesc)) {
            body.put("GatewayDesc", request.gatewayDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayName)) {
            body.put("GatewayName", request.gatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGateway"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayResponse());
    }

    /**
     * @summary 创建网关
     *
     * @param request CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    public CreateGatewayResponse createGateway(CreateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewayWithOptions(request, runtime);
    }

    /**
     * @summary 创建网关的随机验证码
     *
     * @param request CreateGatewayVerifyCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayVerifyCodeResponse
     */
    public CreateGatewayVerifyCodeResponse createGatewayVerifyCodeWithOptions(CreateGatewayVerifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayVerifyCode"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayVerifyCodeResponse());
    }

    /**
     * @summary 创建网关的随机验证码
     *
     * @param request CreateGatewayVerifyCodeRequest
     * @return CreateGatewayVerifyCodeResponse
     */
    public CreateGatewayVerifyCodeResponse createGatewayVerifyCode(CreateGatewayVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewayVerifyCodeWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabase"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabaseResponse());
    }

    /**
     * @param request DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary 删除网关
     *
     * @param request DeleteGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGatewayWithOptions(DeleteGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    /**
     * @summary 删除网关
     *
     * @param request DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayWithOptions(request, runtime);
    }

    /**
     * @param request DeleteGatewayInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayInstanceResponse
     */
    public DeleteGatewayInstanceResponse deleteGatewayInstanceWithOptions(DeleteGatewayInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayInstanceId)) {
            body.put("GatewayInstanceId", request.gatewayInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayInstance"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayInstanceResponse());
    }

    /**
     * @param request DeleteGatewayInstanceRequest
     * @return DeleteGatewayInstanceResponse
     */
    public DeleteGatewayInstanceResponse deleteGatewayInstance(DeleteGatewayInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayInstanceWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2023-09-14"),
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
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @param request DownloadGatewayProgramRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadGatewayProgramResponse
     */
    public DownloadGatewayProgramResponse downloadGatewayProgramWithOptions(DownloadGatewayProgramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dgVersion)) {
            body.put("DgVersion", request.dgVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userOS)) {
            body.put("UserOS", request.userOS);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadGatewayProgram"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadGatewayProgramResponse());
    }

    /**
     * @param request DownloadGatewayProgramRequest
     * @return DownloadGatewayProgramResponse
     */
    public DownloadGatewayProgramResponse downloadGatewayProgram(DownloadGatewayProgramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadGatewayProgramWithOptions(request, runtime);
    }

    /**
     * @summary 根据GatewayId查找网关详情
     *
     * @param request FindUserGatewayByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindUserGatewayByIdResponse
     */
    public FindUserGatewayByIdResponse findUserGatewayByIdWithOptions(FindUserGatewayByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindUserGatewayById"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindUserGatewayByIdResponse());
    }

    /**
     * @summary 根据GatewayId查找网关详情
     *
     * @param request FindUserGatewayByIdRequest
     * @return FindUserGatewayByIdResponse
     */
    public FindUserGatewayByIdResponse findUserGatewayById(FindUserGatewayByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findUserGatewayByIdWithOptions(request, runtime);
    }

    /**
     * @param request GetUserDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserDatabasesResponse
     */
    public GetUserDatabasesResponse getUserDatabasesWithOptions(GetUserDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            body.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDatabases"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDatabasesResponse());
    }

    /**
     * @param request GetUserDatabasesRequest
     * @return GetUserDatabasesResponse
     */
    public GetUserDatabasesResponse getUserDatabases(GetUserDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDatabasesWithOptions(request, runtime);
    }

    /**
     * @param request GetUserGatewayInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGatewayInstancesResponse
     */
    public GetUserGatewayInstancesResponse getUserGatewayInstancesWithOptions(GetUserGatewayInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGatewayInstances"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGatewayInstancesResponse());
    }

    /**
     * @param request GetUserGatewayInstancesRequest
     * @return GetUserGatewayInstancesResponse
     */
    public GetUserGatewayInstancesResponse getUserGatewayInstances(GetUserGatewayInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGatewayInstancesWithOptions(request, runtime);
    }

    /**
     * @summary 获取用户DG网关列表
     *
     * @param request GetUserGatewaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGatewaysResponse
     */
    public GetUserGatewaysResponse getUserGatewaysWithOptions(GetUserGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGateways"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGatewaysResponse());
    }

    /**
     * @summary 获取用户DG网关列表
     *
     * @param request GetUserGatewaysRequest
     * @return GetUserGatewaysResponse
     */
    public GetUserGatewaysResponse getUserGateways(GetUserGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGatewaysWithOptions(request, runtime);
    }

    /**
     * @param request ListDatabaseAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabaseAccessPointResponse
     */
    public ListDatabaseAccessPointResponse listDatabaseAccessPointWithOptions(ListDatabaseAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceId)) {
            body.put("DbInstanceId", request.dbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseAccessPoint"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseAccessPointResponse());
    }

    /**
     * @param request ListDatabaseAccessPointRequest
     * @return ListDatabaseAccessPointResponse
     */
    public ListDatabaseAccessPointResponse listDatabaseAccessPoint(ListDatabaseAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabaseAccessPointWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseResponse
     */
    public ModifyDatabaseResponse modifyDatabaseWithOptions(ModifyDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbDescription)) {
            body.put("DbDescription", request.dbDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPassword)) {
            body.put("DbPassword", request.dbPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            body.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbUserName)) {
            body.put("DbUserName", request.dbUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabase"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseResponse());
    }

    /**
     * @param request ModifyDatabaseRequest
     * @return ModifyDatabaseResponse
     */
    public ModifyDatabaseResponse modifyDatabase(ModifyDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary 修改网关信息
     *
     * @param request ModifyGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGatewayResponse
     */
    public ModifyGatewayResponse modifyGatewayWithOptions(ModifyGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayDesc)) {
            body.put("GatewayDesc", request.gatewayDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayName)) {
            body.put("GatewayName", request.gatewayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGateway"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGatewayResponse());
    }

    /**
     * @summary 修改网关信息
     *
     * @param request ModifyGatewayRequest
     * @return ModifyGatewayResponse
     */
    public ModifyGatewayResponse modifyGateway(ModifyGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGatewayWithOptions(request, runtime);
    }

    /**
     * @param request RetryDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryDatabaseResponse
     */
    public RetryDatabaseResponse retryDatabaseWithOptions(RetryDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbDescription)) {
            body.put("DbDescription", request.dbDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPassword)) {
            body.put("DbPassword", request.dbPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            body.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbUserName)) {
            body.put("DbUserName", request.dbUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryDatabase"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryDatabaseResponse());
    }

    /**
     * @param request RetryDatabaseRequest
     * @return RetryDatabaseResponse
     */
    public RetryDatabaseResponse retryDatabase(RetryDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary 停止网关实例
     *
     * @param request StopGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopGatewayResponse
     */
    public StopGatewayResponse stopGatewayWithOptions(StopGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayInstanceId)) {
            body.put("GatewayInstanceId", request.gatewayInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopGateway"),
            new TeaPair("version", "2023-09-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopGatewayResponse());
    }

    /**
     * @summary 停止网关实例
     *
     * @param request StopGatewayRequest
     * @return StopGatewayResponse
     */
    public StopGatewayResponse stopGateway(StopGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopGatewayWithOptions(request, runtime);
    }
}
