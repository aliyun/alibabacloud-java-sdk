// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104;

import com.aliyun.tea.*;
import com.aliyun.maxcompute20220104.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-south-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-chengdu", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-edge-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-fujian", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hongkong", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-qingdao", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-wuhan", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-central-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-west-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "maxcompute.aliyuncs.com"),
            new TeaPair("me-east-1", "maxcompute.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("us-east-1", "maxcompute.aliyuncs.com"),
            new TeaPair("us-west-1", "maxcompute.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("maxcompute", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyComputeQuotaPlanResponse
     */
    public ApplyComputeQuotaPlanResponse applyComputeQuotaPlanWithOptions(String nickname, String planName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyComputeQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaPlan/" + com.aliyun.openapiutil.Client.getEncodeParam(planName) + "/apply"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyComputeQuotaPlanResponse());
    }

    /**
     * @return ApplyComputeQuotaPlanResponse
     */
    public ApplyComputeQuotaPlanResponse applyComputeQuotaPlan(String nickname, String planName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyComputeQuotaPlanWithOptions(nickname, planName, headers, runtime);
    }

    /**
     * @param request CreateComputeQuotaPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeQuotaPlanResponse
     */
    public CreateComputeQuotaPlanResponse createComputeQuotaPlanWithOptions(String nickname, CreateComputeQuotaPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("quota", request.quota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeQuotaPlanResponse());
    }

    /**
     * @param request CreateComputeQuotaPlanRequest
     * @return CreateComputeQuotaPlanResponse
     */
    public CreateComputeQuotaPlanResponse createComputeQuotaPlan(String nickname, CreateComputeQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeQuotaPlanWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data source to migrate data to MaxCompute using MaxCompute Migration Assist (MMA).</p>
     * 
     * @param request CreateMmsDataSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMmsDataSourceResponse
     */
    public CreateMmsDataSourceResponse createMmsDataSourceWithOptions(CreateMmsDataSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networklink)) {
            body.put("networklink", request.networklink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMmsDataSource"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmsDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data source to migrate data to MaxCompute using MaxCompute Migration Assist (MMA).</p>
     * 
     * @param request CreateMmsDataSourceRequest
     * @return CreateMmsDataSourceResponse
     */
    public CreateMmsDataSourceResponse createMmsDataSource(CreateMmsDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMmsDataSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a job to pull metadata from a data source.</p>
     * 
     * @param request CreateMmsFetchMetadataJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMmsFetchMetadataJobResponse
     */
    public CreateMmsFetchMetadataJobResponse createMmsFetchMetadataJobWithOptions(String sourceId, CreateMmsFetchMetadataJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("dbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            body.put("tableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMmsFetchMetadataJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/scans"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmsFetchMetadataJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a job to pull metadata from a data source.</p>
     * 
     * @param request CreateMmsFetchMetadataJobRequest
     * @return CreateMmsFetchMetadataJobResponse
     */
    public CreateMmsFetchMetadataJobResponse createMmsFetchMetadataJob(String sourceId, CreateMmsFetchMetadataJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMmsFetchMetadataJobWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data migration task.</p>
     * 
     * @param request CreateMmsJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMmsJobResponse
     */
    public CreateMmsJobResponse createMmsJobWithOptions(String sourceId, CreateMmsJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnMapping)) {
            body.put("columnMapping", request.columnMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDbName)) {
            body.put("dstDbName", request.dstDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstSchemaName)) {
            body.put("dstSchemaName", request.dstSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDataMigration)) {
            body.put("enableDataMigration", request.enableDataMigration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSchemaMigration)) {
            body.put("enableSchemaMigration", request.enableSchemaMigration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableVerification)) {
            body.put("enableVerification", request.enableVerification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eta)) {
            body.put("eta", request.eta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.increment)) {
            body.put("increment", request.increment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.others)) {
            body.put("others", request.others);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionFilters)) {
            body.put("partitionFilters", request.partitionFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitions)) {
            body.put("partitions", request.partitions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaOnly)) {
            body.put("schemaOnly", request.schemaOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceName)) {
            body.put("sourceName", request.sourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDbName)) {
            body.put("srcDbName", request.srcDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcSchemaName)) {
            body.put("srcSchemaName", request.srcSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableBlackList)) {
            body.put("tableBlackList", request.tableBlackList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMapping)) {
            body.put("tableMapping", request.tableMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableWhiteList)) {
            body.put("tableWhiteList", request.tableWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tables)) {
            body.put("tables", request.tables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMmsJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data migration task.</p>
     * 
     * @param request CreateMmsJobRequest
     * @return CreateMmsJobResponse
     */
    public CreateMmsJobResponse createMmsJob(String sourceId, CreateMmsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMmsJobWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * @param request CreatePackageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePackageResponse
     */
    public CreatePackageResponse createPackageWithOptions(String projectName, CreatePackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isInstall)) {
            query.put("isInstall", request.isInstall);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePackage"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePackageResponse());
    }

    /**
     * @param request CreatePackageRequest
     * @return CreatePackageResponse
     */
    public CreatePackageResponse createPackage(String projectName, CreatePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPackageWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, review the MaxCompute billing model and <a href="https://www.aliyun.com/product/maxcompute/pricing?spm=5176.30275541.J_ZGek9Blx07Hclc3Ddt9dg.2.19502f3dPPfezu%5C&scm=20140722.S_card@@%E4%BA%A7%E5%93%81@@143540.S_new~UND~card.ID_card@@%E4%BA%A7%E5%93%81@@143540-RL_MaxCompute-LOC_2024SPSearchCard-OR_ser-PAR1_213c994b17738148516424527d0d07-V_4-RE_new9-P0_0-P1_0">pricing</a>.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota. When you enable MaxCompute for the first time, a pay-as-you-go quota must be created. If you create a subscription quota, your Alibaba Cloud account is automatically charged.</p>
     * 
     * @param request CreateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQuotaResponse
     */
    public CreateQuotaResponse createQuotaWithOptions(CreateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("commodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityData)) {
            query.put("commodityData", request.commodityData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partNickName)) {
            query.put("partNickName", request.partNickName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, review the MaxCompute billing model and <a href="https://www.aliyun.com/product/maxcompute/pricing?spm=5176.30275541.J_ZGek9Blx07Hclc3Ddt9dg.2.19502f3dPPfezu%5C&scm=20140722.S_card@@%E4%BA%A7%E5%93%81@@143540.S_new~UND~card.ID_card@@%E4%BA%A7%E5%93%81@@143540-RL_MaxCompute-LOC_2024SPSearchCard-OR_ser-PAR1_213c994b17738148516424527d0d07-V_4-RE_new9-P0_0-P1_0">pricing</a>.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quota. When you enable MaxCompute for the first time, a pay-as-you-go quota must be created. If you create a subscription quota, your Alibaba Cloud account is automatically charged.</p>
     * 
     * @param request CreateQuotaRequest
     * @return CreateQuotaResponse
     */
    public CreateQuotaResponse createQuota(CreateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQuotaWithOptions(request, headers, runtime);
    }

    /**
     * @param request CreateQuotaPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQuotaPlanResponse
     */
    public CreateQuotaPlanResponse createQuotaPlanWithOptions(String nickname, CreateQuotaPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/plans"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaPlanResponse());
    }

    /**
     * @param request CreateQuotaPlanRequest
     * @return CreateQuotaPlanResponse
     */
    public CreateQuotaPlanResponse createQuotaPlan(String nickname, CreateQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQuotaPlanWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param request CreateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRoleWithOptions(String projectName, CreateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    /**
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(String projectName, CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(projectName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComputeQuotaPlanResponse
     */
    public DeleteComputeQuotaPlanResponse deleteComputeQuotaPlanWithOptions(String nickname, String planName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComputeQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaPlan/" + com.aliyun.openapiutil.Client.getEncodeParam(planName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComputeQuotaPlanResponse());
    }

    /**
     * @return DeleteComputeQuotaPlanResponse
     */
    public DeleteComputeQuotaPlanResponse deleteComputeQuotaPlan(String nickname, String planName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComputeQuotaPlanWithOptions(nickname, planName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute Migration Assist (MMA) data source and its associated migration plans and metadata.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMmsDataSourceResponse
     */
    public DeleteMmsDataSourceResponse deleteMmsDataSourceWithOptions(String sourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMmsDataSource"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMmsDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute Migration Assist (MMA) data source and its associated migration plans and metadata.</p>
     * @return DeleteMmsDataSourceResponse
     */
    public DeleteMmsDataSourceResponse deleteMmsDataSource(String sourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMmsDataSourceWithOptions(sourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute Migration Assist (MMA) data migration plan.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMmsJobResponse
     */
    public DeleteMmsJobResponse deleteMmsJobWithOptions(String sourceId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMmsJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMmsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute Migration Assist (MMA) data migration plan.</p>
     * @return DeleteMmsJobResponse
     */
    public DeleteMmsJobResponse deleteMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute project. This operation is irreversible. Use this API with caution.</p>
     * 
     * @param request DeleteProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String projectName, DeleteProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isLogical)) {
            query.put("isLogical", request.isLogical);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute project. This operation is irreversible. Use this API with caution.</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String projectName, DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(projectName, request, headers, runtime);
    }

    /**
     * @param request DeleteQuotaPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQuotaPlanResponse
     */
    public DeleteQuotaPlanResponse deleteQuotaPlanWithOptions(String nickname, String planName, DeleteQuotaPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaPlanResponse());
    }

    /**
     * @param request DeleteQuotaPlanRequest
     * @return DeleteQuotaPlanResponse
     */
    public DeleteQuotaPlanResponse deleteQuotaPlan(String nickname, String planName, DeleteQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaPlanWithOptions(nickname, planName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeEffectivePlanResponse
     */
    public GetComputeEffectivePlanResponse getComputeEffectivePlanWithOptions(String nickname, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeEffectivePlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeEffectivePlan/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeEffectivePlanResponse());
    }

    /**
     * @return GetComputeEffectivePlanResponse
     */
    public GetComputeEffectivePlanResponse getComputeEffectivePlan(String nickname) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeEffectivePlanWithOptions(nickname, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeQuotaPlanResponse
     */
    public GetComputeQuotaPlanResponse getComputeQuotaPlanWithOptions(String nickname, String planName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaPlan/" + com.aliyun.openapiutil.Client.getEncodeParam(planName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeQuotaPlanResponse());
    }

    /**
     * @return GetComputeQuotaPlanResponse
     */
    public GetComputeQuotaPlanResponse getComputeQuotaPlan(String nickname, String planName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeQuotaPlanWithOptions(nickname, planName, headers, runtime);
    }

    /**
     * @param request GetComputeQuotaScheduleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeQuotaScheduleResponse
     */
    public GetComputeQuotaScheduleResponse getComputeQuotaScheduleWithOptions(String nickname, GetComputeQuotaScheduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayTimezone)) {
            query.put("displayTimezone", request.displayTimezone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeQuotaSchedule"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaSchedule"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeQuotaScheduleResponse());
    }

    /**
     * @param request GetComputeQuotaScheduleRequest
     * @return GetComputeQuotaScheduleResponse
     */
    public GetComputeQuotaScheduleResponse getComputeQuotaSchedule(String nickname, GetComputeQuotaScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeQuotaScheduleWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobInfoResponse
     */
    public GetJobInfoResponse getJobInfoWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobInfo"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobInfoResponse());
    }

    /**
     * @return GetJobInfoResponse
     */
    public GetJobInfoResponse getJobInfo(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobInfoWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param tmpReq GetJobResourceUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResourceUsageResponse
     */
    public GetJobResourceUsageResponse getJobResourceUsageWithOptions(GetJobResourceUsageRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetJobResourceUsageShrinkRequest request = new GetJobResourceUsageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobOwnerList)) {
            request.jobOwnerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobOwnerList, "jobOwnerList", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.quotaNicknameList)) {
            request.quotaNicknameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.quotaNicknameList, "quotaNicknameList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobOwnerListShrink)) {
            query.put("jobOwnerList", request.jobOwnerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNicknameListShrink)) {
            query.put("quotaNicknameList", request.quotaNicknameListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobResourceUsage"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/resourceUsage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResourceUsageResponse());
    }

    /**
     * @param request GetJobResourceUsageRequest
     * @return GetJobResourceUsageResponse
     */
    public GetJobResourceUsageResponse getJobResourceUsage(GetJobResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobResourceUsageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a single asynchronous task from MaxCompute Migration Assist (MMA).</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsAsyncTaskResponse
     */
    public GetMmsAsyncTaskResponse getMmsAsyncTaskWithOptions(String sourceId, String asyncTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsAsyncTask"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/asyncTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(asyncTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a single asynchronous task from MaxCompute Migration Assist (MMA).</p>
     * @return GetMmsAsyncTaskResponse
     */
    public GetMmsAsyncTaskResponse getMmsAsyncTask(String sourceId, String asyncTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsAsyncTaskWithOptions(sourceId, asyncTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a single MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param request GetMmsDataSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsDataSourceResponse
     */
    public GetMmsDataSourceResponse getMmsDataSourceWithOptions(String sourceId, GetMmsDataSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withConfig)) {
            query.put("withConfig", request.withConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsDataSource"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a single MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param request GetMmsDataSourceRequest
     * @return GetMmsDataSourceResponse
     */
    public GetMmsDataSourceResponse getMmsDataSource(String sourceId, GetMmsDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsDataSourceWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a database from a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsDbResponse
     */
    public GetMmsDbResponse getMmsDbWithOptions(String sourceId, String dbId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsDb"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/dbs/" + com.aliyun.openapiutil.Client.getEncodeParam(dbId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsDbResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a database from a MaxCompute Migration Assist (MMA) data source.</p>
     * @return GetMmsDbResponse
     */
    public GetMmsDbResponse getMmsDb(String sourceId, String dbId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsDbWithOptions(sourceId, dbId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a MaxCompute Migration Assist (MMA) job that fetches metadata.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsFetchMetadataJobResponse
     */
    public GetMmsFetchMetadataJobResponse getMmsFetchMetadataJobWithOptions(String sourceId, String scanId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsFetchMetadataJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/scans/" + com.aliyun.openapiutil.Client.getEncodeParam(scanId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsFetchMetadataJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a MaxCompute Migration Assist (MMA) job that fetches metadata.</p>
     * @return GetMmsFetchMetadataJobResponse
     */
    public GetMmsFetchMetadataJobResponse getMmsFetchMetadataJob(String sourceId, String scanId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsFetchMetadataJobWithOptions(sourceId, scanId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a single MaxCompute Migration Assist (MMA) migration plan.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsJobResponse
     */
    public GetMmsJobResponse getMmsJobWithOptions(String sourceId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a single MaxCompute Migration Assist (MMA) migration plan.</p>
     * @return GetMmsJobResponse
     */
    public GetMmsJobResponse getMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a partition from a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsPartitionResponse
     */
    public GetMmsPartitionResponse getMmsPartitionWithOptions(String sourceId, String partitionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsPartition"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/partitions/" + com.aliyun.openapiutil.Client.getEncodeParam(partitionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsPartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a partition from a MaxCompute Migration Assist (MMA) data source.</p>
     * @return GetMmsPartitionResponse
     */
    public GetMmsPartitionResponse getMmsPartition(String sourceId, String partitionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsPartitionWithOptions(sourceId, partitionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a table from a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsTableResponse
     */
    public GetMmsTableResponse getMmsTableWithOptions(String sourceId, String tableId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsTable"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a table from a MaxCompute Migration Assist (MMA) data source.</p>
     * @return GetMmsTableResponse
     */
    public GetMmsTableResponse getMmsTable(String sourceId, String tableId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsTableWithOptions(sourceId, tableId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific migration task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMmsTaskResponse
     */
    public GetMmsTaskResponse getMmsTaskWithOptions(String sourceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMmsTask"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific migration task.</p>
     * @return GetMmsTaskResponse
     */
    public GetMmsTaskResponse getMmsTask(String sourceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsTaskWithOptions(sourceId, taskId, headers, runtime);
    }

    /**
     * @param request GetPackageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPackageResponse
     */
    public GetPackageResponse getPackageWithOptions(String projectName, String packageName, GetPackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceProject)) {
            query.put("sourceProject", request.sourceProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPackage"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages/" + com.aliyun.openapiutil.Client.getEncodeParam(packageName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackageResponse());
    }

    /**
     * @param request GetPackageRequest
     * @return GetPackageResponse
     */
    public GetPackageResponse getPackage(String projectName, String packageName, GetPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPackageWithOptions(projectName, packageName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about a MaxCompute project.</p>
     * 
     * @param request GetProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String projectName, GetProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withQuotaProductType)) {
            query.put("withQuotaProductType", request.withQuotaProductType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withStorageTierInfo)) {
            query.put("withStorageTierInfo", request.withStorageTierInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about a MaxCompute project.</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String projectName, GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve information for the specified level-1 quota group. Warning: This operation will be decommissioned on July 31, 2024. It will be replaced by the <code>QueryQuota</code> operation. The request parameters, response parameters, and features of the two operations are the same.</p>
     * 
     * @param request GetQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuotaWithOptions(String nickname, GetQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.akProven)) {
            query.put("AkProven", request.akProven);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("mock", request.mock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve information for the specified level-1 quota group. Warning: This operation will be decommissioned on July 31, 2024. It will be replaced by the <code>QueryQuota</code> operation. The request parameters, response parameters, and features of the two operations are the same.</p>
     * 
     * @param request GetQuotaRequest
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuota(String nickname, GetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param request GetQuotaPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaPlanResponse
     */
    public GetQuotaPlanResponse getQuotaPlanWithOptions(String nickname, String planName, GetQuotaPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaPlanResponse());
    }

    /**
     * @param request GetQuotaPlanRequest
     * @return GetQuotaPlanResponse
     */
    public GetQuotaPlanResponse getQuotaPlan(String nickname, String planName, GetQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaPlanWithOptions(nickname, planName, request, headers, runtime);
    }

    /**
     * @param request GetQuotaScheduleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaScheduleResponse
     */
    public GetQuotaScheduleResponse getQuotaScheduleWithOptions(String nickname, GetQuotaScheduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayTimezone)) {
            query.put("displayTimezone", request.displayTimezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaSchedule"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/schedule"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaScheduleResponse());
    }

    /**
     * @param request GetQuotaScheduleRequest
     * @return GetQuotaScheduleResponse
     */
    public GetQuotaScheduleResponse getQuotaSchedule(String nickname, GetQuotaScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaScheduleWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param tmpReq GetQuotaUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaUsageResponse
     */
    public GetQuotaUsageResponse getQuotaUsageWithOptions(String nickname, GetQuotaUsageRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetQuotaUsageShrinkRequest request = new GetQuotaUsageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.plotTypes)) {
            request.plotTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.plotTypes, "plotTypes", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.yAxisTypes)) {
            request.yAxisTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.yAxisTypes, "yAxisTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggMethod)) {
            query.put("aggMethod", request.aggMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plotTypesShrink)) {
            query.put("plotTypes", request.plotTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subQuotaNickname)) {
            query.put("subQuotaNickname", request.subQuotaNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yAxisTypesShrink)) {
            query.put("yAxisTypes", request.yAxisTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaUsage"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/usage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaUsageResponse());
    }

    /**
     * @param request GetQuotaUsageRequest
     * @return GetQuotaUsageResponse
     */
    public GetQuotaUsageResponse getQuotaUsage(String nickname, GetQuotaUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaUsageWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleAclResponse
     */
    public GetRoleAclResponse getRoleAclWithOptions(String projectName, String roleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoleAcl"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleName) + "/roleAcl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleAclResponse());
    }

    /**
     * @return GetRoleAclResponse
     */
    public GetRoleAclResponse getRoleAcl(String projectName, String roleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleAclWithOptions(projectName, roleName, headers, runtime);
    }

    /**
     * @param request GetRoleAclOnObjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleAclOnObjectResponse
     */
    public GetRoleAclOnObjectResponse getRoleAclOnObjectWithOptions(String projectName, String roleName, GetRoleAclOnObjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectName)) {
            query.put("objectName", request.objectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("objectType", request.objectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoleAclOnObject"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleName) + "/acl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleAclOnObjectResponse());
    }

    /**
     * @param request GetRoleAclOnObjectRequest
     * @return GetRoleAclOnObjectResponse
     */
    public GetRoleAclOnObjectResponse getRoleAclOnObject(String projectName, String roleName, GetRoleAclOnObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleAclOnObjectWithOptions(projectName, roleName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRolePolicyResponse
     */
    public GetRolePolicyResponse getRolePolicyWithOptions(String projectName, String roleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRolePolicy"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleName) + "/policy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRolePolicyResponse());
    }

    /**
     * @return GetRolePolicyResponse
     */
    public GetRolePolicyResponse getRolePolicy(String projectName, String roleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRolePolicyWithOptions(projectName, roleName, headers, runtime);
    }

    /**
     * @param tmpReq GetRunningJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRunningJobsResponse
     */
    public GetRunningJobsResponse getRunningJobsWithOptions(GetRunningJobsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetRunningJobsShrinkRequest request = new GetRunningJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobOwnerList)) {
            request.jobOwnerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobOwnerList, "jobOwnerList", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.quotaNicknameList)) {
            request.quotaNicknameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.quotaNicknameList, "quotaNicknameList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobOwnerListShrink)) {
            query.put("jobOwnerList", request.jobOwnerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNicknameListShrink)) {
            query.put("quotaNicknameList", request.quotaNicknameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRunningJobs"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/runningJobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunningJobsResponse());
    }

    /**
     * @param request GetRunningJobsRequest
     * @return GetRunningJobsResponse
     */
    public GetRunningJobsResponse getRunningJobs(GetRunningJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRunningJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a summary of the total storage amount.</p>
     * 
     * @param request GetStorageAmountSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageAmountSummaryResponse
     */
    public GetStorageAmountSummaryResponse getStorageAmountSummaryWithOptions(GetStorageAmountSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageAmountSummary"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/analysis/storage/amount"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageAmountSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a summary of the total storage amount.</p>
     * 
     * @param request GetStorageAmountSummaryRequest
     * @return GetStorageAmountSummaryResponse
     */
    public GetStorageAmountSummaryResponse getStorageAmountSummary(GetStorageAmountSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStorageAmountSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a summary of storage usage.</p>
     * 
     * @param request GetStorageSizeSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageSizeSummaryResponse
     */
    public GetStorageSizeSummaryResponse getStorageSizeSummaryWithOptions(GetStorageSizeSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageSizeSummary"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/analysis/storage/size"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageSizeSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a summary of storage usage.</p>
     * 
     * @param request GetStorageSizeSummaryRequest
     * @return GetStorageSizeSummaryResponse
     */
    public GetStorageSizeSummaryResponse getStorageSizeSummary(GetStorageSizeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStorageSizeSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the year-on-year (YoY) change in storage usage.</p>
     * 
     * @param tmpReq GetStorageSummaryComparedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageSummaryComparedResponse
     */
    public GetStorageSummaryComparedResponse getStorageSummaryComparedWithOptions(String type, GetStorageSummaryComparedRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetStorageSummaryComparedShrinkRequest request = new GetStorageSummaryComparedShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.projects)) {
            request.projectsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.projects, "projects", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            query.put("beginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectsShrink)) {
            query.put("projects", request.projectsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageSummaryCompared"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/analysis/storage/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/compared"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageSummaryComparedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the year-on-year (YoY) change in storage usage.</p>
     * 
     * @param request GetStorageSummaryComparedRequest
     * @return GetStorageSummaryComparedResponse
     */
    public GetStorageSummaryComparedResponse getStorageSummaryCompared(String type, GetStorageSummaryComparedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStorageSummaryComparedWithOptions(type, request, headers, runtime);
    }

    /**
     * @param request GetTableInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableInfoResponse
     */
    public GetTableInfoResponse getTableInfoWithOptions(String projectName, String tableName, GetTableInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("schemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableInfo"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableInfoResponse());
    }

    /**
     * @param request GetTableInfoRequest
     * @return GetTableInfoResponse
     */
    public GetTableInfoResponse getTableInfo(String projectName, String tableName, GetTableInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableInfoWithOptions(projectName, tableName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrustedProjectsResponse
     */
    public GetTrustedProjectsResponse getTrustedProjectsWithOptions(String projectName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrustedProjects"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/trustedProjects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustedProjectsResponse());
    }

    /**
     * @return GetTrustedProjectsResponse
     */
    public GetTrustedProjectsResponse getTrustedProjects(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrustedProjectsWithOptions(projectName, headers, runtime);
    }

    /**
     * @param request KillJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillJobsResponse
     */
    public KillJobsResponse killJobsWithOptions(KillJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillJobs"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/kill"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillJobsResponse());
    }

    /**
     * @param request KillJobsRequest
     * @return KillJobsResponse
     */
    public KillJobsResponse killJobs(KillJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.killJobsWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListComputeMetricsByInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeMetricsByInstanceResponse
     */
    public ListComputeMetricsByInstanceResponse listComputeMetricsByInstanceWithOptions(ListComputeMetricsByInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobOwner)) {
            body.put("jobOwner", request.jobOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectNames)) {
            body.put("projectNames", request.projectNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            body.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specCodes)) {
            body.put("specCodes", request.specCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            body.put("types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeMetricsByInstance"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/computeMetrics/listByInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeMetricsByInstanceResponse());
    }

    /**
     * @param request ListComputeMetricsByInstanceRequest
     * @return ListComputeMetricsByInstanceResponse
     */
    public ListComputeMetricsByInstanceResponse listComputeMetricsByInstance(ListComputeMetricsByInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComputeMetricsByInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists compute quota plans.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeQuotaPlanResponse
     */
    public ListComputeQuotaPlanResponse listComputeQuotaPlanWithOptions(String nickname, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaPlan"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeQuotaPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists compute quota plans.</p>
     * @return ListComputeQuotaPlanResponse
     */
    public ListComputeQuotaPlanResponse listComputeQuotaPlan(String nickname) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComputeQuotaPlanWithOptions(nickname, headers, runtime);
    }

    /**
     * @param request ListFunctionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctionsWithOptions(String projectName, ListFunctionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("maxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("schemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/functions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    /**
     * @param request ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(String projectName, ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionsWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of jobs.</p>
     * 
     * @param request ListJobInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobInfosResponse
     */
    public ListJobInfosResponse listJobInfosWithOptions(ListJobInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascOrder)) {
            query.put("ascOrder", request.ascOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("orderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extNodeIdList)) {
            body.put("extNodeIdList", request.extNodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extNodeNameList)) {
            body.put("extNodeNameList", request.extNodeNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            body.put("instanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobOwnerList)) {
            body.put("jobOwnerList", request.jobOwnerList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priorityList)) {
            body.put("priorityList", request.priorityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectList)) {
            body.put("projectList", request.projectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNickname)) {
            body.put("quotaNickname", request.quotaNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneTagList)) {
            body.put("sceneTagList", request.sceneTagList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureList)) {
            body.put("signatureList", request.signatureList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortByList)) {
            body.put("sortByList", request.sortByList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrderList)) {
            body.put("sortOrderList", request.sortOrderList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("statusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNameList)) {
            body.put("taskNameList", request.taskNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeList)) {
            body.put("typeList", request.typeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobInfos"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of jobs.</p>
     * 
     * @param request ListJobInfosRequest
     * @return ListJobInfosResponse
     */
    public ListJobInfosResponse listJobInfos(ListJobInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobInfosWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListJobMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobMetricResponse
     */
    public ListJobMetricResponse listJobMetricWithOptions(ListJobMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            body.put("project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("quota", request.quota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobMetric"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/metric"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobMetricResponse());
    }

    /**
     * @param request ListJobMetricRequest
     * @return ListJobMetricResponse
     */
    public ListJobMetricResponse listJobMetric(ListJobMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobMetricWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves job snapshot data at a specific point in time.</p>
     * 
     * @param request ListJobSnapshotInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobSnapshotInfosResponse
     */
    public ListJobSnapshotInfosResponse listJobSnapshotInfosWithOptions(ListJobSnapshotInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascOrder)) {
            query.put("ascOrder", request.ascOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("orderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extNodeIdList)) {
            body.put("extNodeIdList", request.extNodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            body.put("instanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobOwnerList)) {
            body.put("jobOwnerList", request.jobOwnerList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priorityList)) {
            body.put("priorityList", request.priorityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectList)) {
            body.put("projectList", request.projectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNickname)) {
            body.put("quotaNickname", request.quotaNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureList)) {
            body.put("signatureList", request.signatureList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortByList)) {
            body.put("sortByList", request.sortByList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrderList)) {
            body.put("sortOrderList", request.sortOrderList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("statusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeList)) {
            body.put("typeList", request.typeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobSnapshotInfos"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/snapshot"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobSnapshotInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves job snapshot data at a specific point in time.</p>
     * 
     * @param request ListJobSnapshotInfosRequest
     * @return ListJobSnapshotInfosResponse
     */
    public ListJobSnapshotInfosResponse listJobSnapshotInfos(ListJobSnapshotInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobSnapshotInfosWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the MaxCompute Migration Assist (MMA) data sources.</p>
     * 
     * @param request ListMmsDataSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsDataSourcesResponse
     */
    public ListMmsDataSourcesResponse listMmsDataSourcesWithOptions(ListMmsDataSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsDataSources"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the MaxCompute Migration Assist (MMA) data sources.</p>
     * 
     * @param request ListMmsDataSourcesRequest
     * @return ListMmsDataSourcesResponse
     */
    public ListMmsDataSourcesResponse listMmsDataSources(ListMmsDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsDataSourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List databases in the MMA data source.</p>
     * 
     * @param tmpReq ListMmsDbsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsDbsResponse
     */
    public ListMmsDbsResponse listMmsDbsWithOptions(String sourceId, ListMmsDbsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMmsDbsShrinkRequest request = new ListMmsDbsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sorter)) {
            request.sorterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sorter, "sorter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorterShrink)) {
            query.put("sorter", request.sorterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsDbs"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/dbs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsDbsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List databases in the MMA data source.</p>
     * 
     * @param request ListMmsDbsRequest
     * @return ListMmsDbsResponse
     */
    public ListMmsDbsResponse listMmsDbs(String sourceId, ListMmsDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsDbsWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists migration jobs.</p>
     * 
     * @param request ListMmsJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsJobsResponse
     */
    public ListMmsJobsResponse listMmsJobsWithOptions(String sourceId, ListMmsJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstDbName)) {
            query.put("dstDbName", request.dstDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstTableName)) {
            query.put("dstTableName", request.dstTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDbName)) {
            query.put("srcDbName", request.srcDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTableName)) {
            query.put("srcTableName", request.srcTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopped)) {
            query.put("stopped", request.stopped);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timerId)) {
            query.put("timerId", request.timerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorter)) {
            query.put("sorter", request.sorter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsJobs"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists migration jobs.</p>
     * 
     * @param request ListMmsJobsRequest
     * @return ListMmsJobsResponse
     */
    public ListMmsJobsResponse listMmsJobs(String sourceId, ListMmsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsJobsWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the partitions in a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param tmpReq ListMmsPartitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsPartitionsResponse
     */
    public ListMmsPartitionsResponse listMmsPartitionsWithOptions(String sourceId, ListMmsPartitionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMmsPartitionsShrinkRequest request = new ListMmsPartitionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "status", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("dbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("dbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastDdlTimeEnd)) {
            query.put("lastDdlTimeEnd", request.lastDdlTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastDdlTimeStart)) {
            query.put("lastDdlTimeStart", request.lastDdlTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("status", request.statusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("tableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("tableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updated)) {
            query.put("updated", request.updated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorter)) {
            query.put("sorter", request.sorter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsPartitions"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/partitions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsPartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the partitions in a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param request ListMmsPartitionsRequest
     * @return ListMmsPartitionsResponse
     */
    public ListMmsPartitionsResponse listMmsPartitions(String sourceId, ListMmsPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsPartitionsWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tables in a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param tmpReq ListMmsTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsTablesResponse
     */
    public ListMmsTablesResponse listMmsTablesWithOptions(String sourceId, ListMmsTablesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMmsTablesShrinkRequest request = new ListMmsTablesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "status", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("dbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("dbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstName)) {
            query.put("dstName", request.dstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstProjectName)) {
            query.put("dstProjectName", request.dstProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstSchemaName)) {
            query.put("dstSchemaName", request.dstSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasPartitions)) {
            query.put("hasPartitions", request.hasPartitions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastDdlTimeEnd)) {
            query.put("lastDdlTimeEnd", request.lastDdlTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastDdlTimeStart)) {
            query.put("lastDdlTimeStart", request.lastDdlTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyName)) {
            query.put("onlyName", request.onlyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("status", request.statusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorter)) {
            query.put("sorter", request.sorter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsTables"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tables in a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param request ListMmsTablesRequest
     * @return ListMmsTablesResponse
     */
    public ListMmsTablesResponse listMmsTables(String sourceId, ListMmsTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsTablesWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the execution logs for a specific migration task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsTaskLogsResponse
     */
    public ListMmsTaskLogsResponse listMmsTaskLogsWithOptions(String sourceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsTaskLogs"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsTaskLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the execution logs for a specific migration task.</p>
     * @return ListMmsTaskLogsResponse
     */
    public ListMmsTaskLogsResponse listMmsTaskLogs(String sourceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsTaskLogsWithOptions(sourceId, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of migration tasks.</p>
     * 
     * @param request ListMmsTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmsTasksResponse
     */
    public ListMmsTasksResponse listMmsTasksWithOptions(String sourceId, ListMmsTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstDbName)) {
            query.put("dstDbName", request.dstDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstTableName)) {
            query.put("dstTableName", request.dstTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("jobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            query.put("partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDbName)) {
            query.put("srcDbName", request.srcDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTableName)) {
            query.put("srcTableName", request.srcTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorter)) {
            query.put("sorter", request.sorter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMmsTasks"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of migration tasks.</p>
     * 
     * @param request ListMmsTasksRequest
     * @return ListMmsTasksResponse
     */
    public ListMmsTasksResponse listMmsTasks(String sourceId, ListMmsTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsTasksWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPackagesResponse
     */
    public ListPackagesResponse listPackagesWithOptions(String projectName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPackages"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPackagesResponse());
    }

    /**
     * @return ListPackagesResponse
     */
    public ListPackagesResponse listPackages(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPackagesWithOptions(projectName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListProjectUsers</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectUsersResponse
     */
    public ListProjectUsersResponse listProjectUsersWithOptions(String projectName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectUsers"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListProjectUsers</p>
     * @return ListProjectUsersResponse
     */
    public ListProjectUsersResponse listProjectUsers(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectUsersWithOptions(projectName, headers, runtime);
    }

    /**
     * @param request ListProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listSystemCatalog)) {
            query.put("listSystemCatalog", request.listSystemCatalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("maxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            query.put("quotaName", request.quotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNickName)) {
            query.put("quotaNickName", request.quotaNickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleTags)) {
            query.put("saleTags", request.saleTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of quotas.</p>
     * 
     * @param request ListQuotasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotasWithOptions(ListQuotasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingType)) {
            query.put("billingType", request.billingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("maxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleTags)) {
            query.put("saleTags", request.saleTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotas"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of quotas.</p>
     * 
     * @param request ListQuotasRequest
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListQuotasPlansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotasPlansResponse
     */
    public ListQuotasPlansResponse listQuotasPlansWithOptions(String nickname, ListQuotasPlansRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotasPlans"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/plans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasPlansResponse());
    }

    /**
     * @param request ListQuotasPlansRequest
     * @return ListQuotasPlansResponse
     */
    public ListQuotasPlansResponse listQuotasPlans(String nickname, ListQuotasPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasPlansWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param request ListResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(String projectName, ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("maxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("schemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(String projectName, ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(projectName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(String projectName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(projectName, headers, runtime);
    }

    /**
     * @param tmpReq ListStoragePartitionsInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStoragePartitionsInfoResponse
     */
    public ListStoragePartitionsInfoResponse listStoragePartitionsInfoWithOptions(String project, String table, ListStoragePartitionsInfoRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListStoragePartitionsInfoShrinkRequest request = new ListStoragePartitionsInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "types", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascOrder)) {
            query.put("ascOrder", request.ascOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("orderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionPrefix)) {
            query.put("partitionPrefix", request.partitionPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            query.put("types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStoragePartitionsInfo"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/analysis/storage/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(project) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/partitionsInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStoragePartitionsInfoResponse());
    }

    /**
     * @param request ListStoragePartitionsInfoRequest
     * @return ListStoragePartitionsInfoResponse
     */
    public ListStoragePartitionsInfoResponse listStoragePartitionsInfo(String project, String table, ListStoragePartitionsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStoragePartitionsInfoWithOptions(project, table, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the storage details of projects.</p>
     * 
     * @param request ListStorageProjectsInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStorageProjectsInfoResponse
     */
    public ListStorageProjectsInfoResponse listStorageProjectsInfoWithOptions(ListStorageProjectsInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascOrder)) {
            query.put("ascOrder", request.ascOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("orderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectPrefix)) {
            query.put("projectPrefix", request.projectPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentDays)) {
            query.put("recentDays", request.recentDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStorageProjectsInfo"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/analysis/storage/projectsInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStorageProjectsInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the storage details of projects.</p>
     * 
     * @param request ListStorageProjectsInfoRequest
     * @return ListStorageProjectsInfoResponse
     */
    public ListStorageProjectsInfoResponse listStorageProjectsInfo(ListStorageProjectsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStorageProjectsInfoWithOptions(request, headers, runtime);
    }

    /**
     * @param tmpReq ListStorageTablesInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStorageTablesInfoResponse
     */
    public ListStorageTablesInfoResponse listStorageTablesInfoWithOptions(String project, ListStorageTablesInfoRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListStorageTablesInfoShrinkRequest request = new ListStorageTablesInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "types", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascOrder)) {
            query.put("ascOrder", request.ascOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("orderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentDays)) {
            query.put("recentDays", request.recentDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tablePrefix)) {
            query.put("tablePrefix", request.tablePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            query.put("types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStorageTablesInfo"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/analysis/storage/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(project) + "/tablesInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStorageTablesInfoResponse());
    }

    /**
     * @param request ListStorageTablesInfoRequest
     * @return ListStorageTablesInfoResponse
     */
    public ListStorageTablesInfoResponse listStorageTablesInfo(String project, ListStorageTablesInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStorageTablesInfoWithOptions(project, request, headers, runtime);
    }

    /**
     * @param request ListTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(String projectName, ListTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("maxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("schemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(String projectName, ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTablesWithOptions(projectName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTunnelQuotaTimerResponse
     */
    public ListTunnelQuotaTimerResponse listTunnelQuotaTimerWithOptions(String nickname, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTunnelQuotaTimer"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tunnel/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/timers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTunnelQuotaTimerResponse());
    }

    /**
     * @return ListTunnelQuotaTimerResponse
     */
    public ListTunnelQuotaTimerResponse listTunnelQuotaTimer(String nickname) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTunnelQuotaTimerWithOptions(nickname, headers, runtime);
    }

    /**
     * @param request ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersByRoleResponse
     */
    public ListUsersByRoleResponse listUsersByRoleWithOptions(String projectName, String roleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersByRole"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleName) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersByRoleResponse());
    }

    /**
     * @return ListUsersByRoleResponse
     */
    public ListUsersByRoleResponse listUsersByRole(String projectName, String roleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersByRoleWithOptions(projectName, roleName, headers, runtime);
    }

    /**
     * @param request QueryQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryQuotaResponse
     */
    public QueryQuotaResponse queryQuotaWithOptions(String nickname, QueryQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.akProven)) {
            query.put("AkProven", request.akProven);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("mock", request.mock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQuotaResponse());
    }

    /**
     * @param request QueryQuotaRequest
     * @return QueryQuotaResponse
     */
    public QueryQuotaResponse queryQuota(String nickname, QueryQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQuotaWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the time series data of resource consumption for a quota.</p>
     * 
     * @param request QueryQuotaMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryQuotaMetricResponse
     */
    public QueryQuotaMetricResponse queryQuotaMetricWithOptions(String metric, QueryQuotaMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("strategy", request.strategy);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            body.put("interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            body.put("nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subMetric)) {
            body.put("subMetric", request.subMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subQuotaNickname)) {
            body.put("subQuotaNickname", request.subQuotaNickname);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQuotaMetric"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/quota/" + com.aliyun.openapiutil.Client.getEncodeParam(metric) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQuotaMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the time series data of resource consumption for a quota.</p>
     * 
     * @param request QueryQuotaMetricRequest
     * @return QueryQuotaMetricResponse
     */
    public QueryQuotaMetricResponse queryQuotaMetric(String metric, QueryQuotaMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQuotaMetricWithOptions(metric, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries time-series metrics of data storage.</p>
     * 
     * @param request QueryStorageMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryStorageMetricResponse
     */
    public QueryStorageMetricResponse queryStorageMetricWithOptions(String metric, QueryStorageMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectList)) {
            body.put("projectList", request.projectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeList)) {
            body.put("typeList", request.typeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStorageMetric"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/storage/" + com.aliyun.openapiutil.Client.getEncodeParam(metric) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStorageMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries time-series metrics of data storage.</p>
     * 
     * @param request QueryStorageMetricRequest
     * @return QueryStorageMetricResponse
     */
    public QueryStorageMetricResponse queryStorageMetric(String metric, QueryStorageMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStorageMetricWithOptions(metric, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to query various Tunnel metrics, such as slot usage (<code>slot_usage</code>), slot usage limit (<code>slot_max</code>), throughput (<code>throughput</code>), throughput rate (<code>throughput_speed</code>), and number of requests (<code>request</code>).</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are required. They specify the start and end of the time range for the query. The values are UNIX timestamps in seconds.</li>
     * <li>The <code>metric</code> parameter is also required. It specifies the type of metric to query.</li>
     * <li>Depending on the value of <code>metric</code>, you may need to specify additional parameters for filtering to refine your query. These parameters include <code>quotaNickname</code>, <code>project</code>, <code>tableList</code>, <code>operationList</code>, <code>codeList</code>, <code>groupList</code>, and <code>topN</code>.</li>
     * <li>For some <code>metric</code> values, you must specify other parameters. For example, if <code>groupList</code> contains <code>table</code> or <code>ip</code>, you must specify the <code>project</code> parameter and other required parameters. In this case, the system returns only the top N results.</li>
     * <li>The <code>strategy</code> parameter defines the data aggregation logic. This logic is used when the automatic step size exceeds 60 seconds over a long time range. The default value is <code>max</code>.</li>
     * <li>Ensure all parameters meet the requirements in this document to prevent request failures.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metric data for the Tunnel Data Transmission Service within a specified time range.</p>
     * 
     * @param request QueryTunnelMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTunnelMetricResponse
     */
    public QueryTunnelMetricResponse queryTunnelMetricWithOptions(String metric, QueryTunnelMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("strategy", request.strategy);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeList)) {
            body.put("codeList", request.codeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupList)) {
            body.put("groupList", request.groupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationList)) {
            body.put("operationList", request.operationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            body.put("project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNickname)) {
            body.put("quotaNickname", request.quotaNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableList)) {
            body.put("tableList", request.tableList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            body.put("topN", request.topN);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTunnelMetric"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/tunnel/" + com.aliyun.openapiutil.Client.getEncodeParam(metric) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTunnelMetricResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to query various Tunnel metrics, such as slot usage (<code>slot_usage</code>), slot usage limit (<code>slot_max</code>), throughput (<code>throughput</code>), throughput rate (<code>throughput_speed</code>), and number of requests (<code>request</code>).</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are required. They specify the start and end of the time range for the query. The values are UNIX timestamps in seconds.</li>
     * <li>The <code>metric</code> parameter is also required. It specifies the type of metric to query.</li>
     * <li>Depending on the value of <code>metric</code>, you may need to specify additional parameters for filtering to refine your query. These parameters include <code>quotaNickname</code>, <code>project</code>, <code>tableList</code>, <code>operationList</code>, <code>codeList</code>, <code>groupList</code>, and <code>topN</code>.</li>
     * <li>For some <code>metric</code> values, you must specify other parameters. For example, if <code>groupList</code> contains <code>table</code> or <code>ip</code>, you must specify the <code>project</code> parameter and other required parameters. In this case, the system returns only the top N results.</li>
     * <li>The <code>strategy</code> parameter defines the data aggregation logic. This logic is used when the automatic step size exceeds 60 seconds over a long time range. The default value is <code>max</code>.</li>
     * <li>Ensure all parameters meet the requirements in this document to prevent request failures.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metric data for the Tunnel Data Transmission Service within a specified time range.</p>
     * 
     * @param request QueryTunnelMetricRequest
     * @return QueryTunnelMetricResponse
     */
    public QueryTunnelMetricResponse queryTunnelMetric(String metric, QueryTunnelMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTunnelMetricWithOptions(metric, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation queries various Tunnel metrics, such as slot usage details (<code>slot_usage_detail</code>), throughput details (<code>throughput_detail</code>), and a throughput summary (<code>throughput_summary</code>).</li>
     * <li>The <code>quotaNickname</code> and <code>project</code> parameters cannot both be empty.</li>
     * <li>If the groupList parameter contains <code>table</code> or <code>ip</code>, you must specify the <code>project</code> parameter. If the <code>groupList</code> parameter contains <code>ip</code>, you must also specify the <code>tableList</code> parameter.</li>
     * <li>The orderColumn parameter can be set to <code>maxValue</code>, <code>minValue</code>, <code>avgValue</code>, or <code>sumValue</code>. The <code>sumValue</code> option is valid only for <code>throughput_summary</code>. By default, this parameter is empty, which means that no sorting is performed.</li>
     * <li>The default value of the <code>ascOrder</code> parameter is <code>false</code>, which indicates that the results are sorted in descending order.</li>
     * <li>The <code>limit</code> parameter specifies the maximum number of entries to return. The default value is 10, and the maximum value is 100.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries detailed data for the Tunnel Data Transmission Service within a specified time range.</p>
     * 
     * @param request QueryTunnelMetricDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTunnelMetricDetailResponse
     */
    public QueryTunnelMetricDetailResponse queryTunnelMetricDetailWithOptions(String metric, QueryTunnelMetricDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascOrder)) {
            body.put("ascOrder", request.ascOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupList)) {
            body.put("groupList", request.groupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationList)) {
            body.put("operationList", request.operationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            body.put("orderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            body.put("project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaNickname)) {
            body.put("quotaNickname", request.quotaNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableList)) {
            body.put("tableList", request.tableList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTunnelMetricDetail"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/observations/tunnel/" + com.aliyun.openapiutil.Client.getEncodeParam(metric) + "/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTunnelMetricDetailResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation queries various Tunnel metrics, such as slot usage details (<code>slot_usage_detail</code>), throughput details (<code>throughput_detail</code>), and a throughput summary (<code>throughput_summary</code>).</li>
     * <li>The <code>quotaNickname</code> and <code>project</code> parameters cannot both be empty.</li>
     * <li>If the groupList parameter contains <code>table</code> or <code>ip</code>, you must specify the <code>project</code> parameter. If the <code>groupList</code> parameter contains <code>ip</code>, you must also specify the <code>tableList</code> parameter.</li>
     * <li>The orderColumn parameter can be set to <code>maxValue</code>, <code>minValue</code>, <code>avgValue</code>, or <code>sumValue</code>. The <code>sumValue</code> option is valid only for <code>throughput_summary</code>. By default, this parameter is empty, which means that no sorting is performed.</li>
     * <li>The default value of the <code>ascOrder</code> parameter is <code>false</code>, which indicates that the results are sorted in descending order.</li>
     * <li>The <code>limit</code> parameter specifies the maximum number of entries to return. The default value is 10, and the maximum value is 100.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries detailed data for the Tunnel Data Transmission Service within a specified time range.</p>
     * 
     * @param request QueryTunnelMetricDetailRequest
     * @return QueryTunnelMetricDetailResponse
     */
    public QueryTunnelMetricDetailResponse queryTunnelMetricDetail(String metric, QueryTunnelMetricDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTunnelMetricDetailWithOptions(metric, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a data migration job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryMmsJobResponse
     */
    public RetryMmsJobResponse retryMmsJobWithOptions(String sourceId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryMmsJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/retry"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryMmsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a data migration job.</p>
     * @return RetryMmsJobResponse
     */
    public RetryMmsJobResponse retryMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data migration job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMmsJobResponse
     */
    public StartMmsJobResponse startMmsJobWithOptions(String sourceId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMmsJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMmsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data migration job.</p>
     * @return StartMmsJobResponse
     */
    public StartMmsJobResponse startMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data migration job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMmsJobResponse
     */
    public StopMmsJobResponse stopMmsJobWithOptions(String sourceId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMmsJob"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMmsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data migration job.</p>
     * @return StopMmsJobResponse
     */
    public StopMmsJobResponse stopMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the storage information for each category or project on a specified date.</p>
     * 
     * @param request SumStorageMetricsByDateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SumStorageMetricsByDateResponse
     */
    public SumStorageMetricsByDateResponse sumStorageMetricsByDateWithOptions(SumStorageMetricsByDateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectNames)) {
            body.put("projectNames", request.projectNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statsType)) {
            body.put("statsType", request.statsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SumStorageMetricsByDate"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/storageMetrics/sumByDate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SumStorageMetricsByDateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the storage information for each category or project on a specified date.</p>
     * 
     * @param request SumStorageMetricsByDateRequest
     * @return SumStorageMetricsByDateResponse
     */
    public SumStorageMetricsByDateResponse sumStorageMetricsByDate(SumStorageMetricsByDateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sumStorageMetricsByDateWithOptions(request, headers, runtime);
    }

    /**
     * @param request UpdateComputeQuotaPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeQuotaPlanResponse
     */
    public UpdateComputeQuotaPlanResponse updateComputeQuotaPlanWithOptions(String nickname, UpdateComputeQuotaPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("quota", request.quota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaPlan"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeQuotaPlanResponse());
    }

    /**
     * @param request UpdateComputeQuotaPlanRequest
     * @return UpdateComputeQuotaPlanResponse
     */
    public UpdateComputeQuotaPlanResponse updateComputeQuotaPlan(String nickname, UpdateComputeQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComputeQuotaPlanWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">billing methods and pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">billing methods and pricing</a> of reserved compute units (CUs) in MaxCompute.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the time-based schedule for a computing quota.</p>
     * 
     * @param request UpdateComputeQuotaScheduleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeQuotaScheduleResponse
     */
    public UpdateComputeQuotaScheduleResponse updateComputeQuotaScheduleWithOptions(String nickname, UpdateComputeQuotaScheduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimezone)) {
            query.put("scheduleTimezone", request.scheduleTimezone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeQuotaSchedule"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeQuotaSchedule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeQuotaScheduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">billing methods and pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">billing methods and pricing</a> of reserved compute units (CUs) in MaxCompute.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the time-based schedule for a computing quota.</p>
     * 
     * @param request UpdateComputeQuotaScheduleRequest
     * @return UpdateComputeQuotaScheduleResponse
     */
    public UpdateComputeQuotaScheduleResponse updateComputeQuotaSchedule(String nickname, UpdateComputeQuotaScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComputeQuotaScheduleWithOptions(nickname, request, headers, runtime);
    }

    /**
     * @param request UpdateComputeSubQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeSubQuotaResponse
     */
    public UpdateComputeSubQuotaResponse updateComputeSubQuotaWithOptions(String nickname, UpdateComputeSubQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subQuotaInfoList)) {
            body.put("subQuotaInfoList", request.subQuotaInfoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeSubQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/computeSubQuota"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeSubQuotaResponse());
    }

    /**
     * @param request UpdateComputeSubQuotaRequest
     * @return UpdateComputeSubQuotaResponse
     */
    public UpdateComputeSubQuotaResponse updateComputeSubQuota(String nickname, UpdateComputeSubQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComputeSubQuotaWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes the metadata of a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param request UpdateMmsDataSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMmsDataSourceResponse
     */
    public UpdateMmsDataSourceResponse updateMmsDataSourceWithOptions(String sourceId, UpdateMmsDataSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.test)) {
            body.put("test", request.test);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMmsDataSource"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/mms/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMmsDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes the metadata of a MaxCompute Migration Assist (MMA) data source.</p>
     * 
     * @param request UpdateMmsDataSourceRequest
     * @return UpdateMmsDataSourceResponse
     */
    public UpdateMmsDataSourceResponse updateMmsDataSource(String sourceId, UpdateMmsDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMmsDataSourceWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * @param request UpdatePackageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePackageResponse
     */
    public UpdatePackageResponse updatePackageWithOptions(String projectName, String packageName, UpdatePackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePackage"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages/" + com.aliyun.openapiutil.Client.getEncodeParam(packageName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePackageResponse());
    }

    /**
     * @param request UpdatePackageRequest
     * @return UpdatePackageResponse
     */
    public UpdatePackageResponse updatePackage(String projectName, String packageName, UpdatePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePackageWithOptions(projectName, packageName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information of a project.</p>
     * 
     * @param request UpdateProjectBasicMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectBasicMetaResponse
     */
    public UpdateProjectBasicMetaResponse updateProjectBasicMetaWithOptions(String projectName, UpdateProjectBasicMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            body.put("properties", request.properties);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectBasicMeta"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/meta"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectBasicMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information of a project.</p>
     * 
     * @param request UpdateProjectBasicMetaRequest
     * @return UpdateProjectBasicMetaResponse
     */
    public UpdateProjectBasicMetaResponse updateProjectBasicMeta(String projectName, UpdateProjectBasicMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectBasicMetaWithOptions(projectName, request, headers, runtime);
    }

    /**
     * @param request UpdateProjectDefaultQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectDefaultQuotaResponse
     */
    public UpdateProjectDefaultQuotaResponse updateProjectDefaultQuotaWithOptions(String projectName, UpdateProjectDefaultQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("quota", request.quota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectDefaultQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/quota"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectDefaultQuotaResponse());
    }

    /**
     * @param request UpdateProjectDefaultQuotaRequest
     * @return UpdateProjectDefaultQuotaResponse
     */
    public UpdateProjectDefaultQuotaResponse updateProjectDefaultQuota(String projectName, UpdateProjectDefaultQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectDefaultQuotaWithOptions(projectName, request, headers, runtime);
    }

    /**
     * @param request UpdateProjectIpWhiteListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectIpWhiteListResponse
     */
    public UpdateProjectIpWhiteListResponse updateProjectIpWhiteListWithOptions(String projectName, UpdateProjectIpWhiteListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectIpWhiteList"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/ipWhiteList"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectIpWhiteListResponse());
    }

    /**
     * @param request UpdateProjectIpWhiteListRequest
     * @return UpdateProjectIpWhiteListResponse
     */
    public UpdateProjectIpWhiteListResponse updateProjectIpWhiteList(String projectName, UpdateProjectIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectIpWhiteListWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a project\&quot;s Layer 2 model to a Layer 3 model.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectModelTierResponse
     */
    public UpdateProjectModelTierResponse updateProjectModelTierWithOptions(String projectName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectModelTier"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/modelTier"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectModelTierResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a project\&quot;s Layer 2 model to a Layer 3 model.</p>
     * @return UpdateProjectModelTierResponse
     */
    public UpdateProjectModelTierResponse updateProjectModelTier(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectModelTierWithOptions(projectName, headers, runtime);
    }

    /**
     * @param request UpdateQuotaPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaPlanResponse
     */
    public UpdateQuotaPlanResponse updateQuotaPlanWithOptions(String nickname, String planName, UpdateQuotaPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuotaPlan"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaPlanResponse());
    }

    /**
     * @param request UpdateQuotaPlanRequest
     * @return UpdateQuotaPlanResponse
     */
    public UpdateQuotaPlanResponse updateQuotaPlan(String nickname, String planName, UpdateQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaPlanWithOptions(nickname, planName, request, headers, runtime);
    }

    /**
     * @param request UpdateQuotaScheduleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaScheduleResponse
     */
    public UpdateQuotaScheduleResponse updateQuotaScheduleWithOptions(String nickname, UpdateQuotaScheduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuotaSchedule"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/schedule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaScheduleResponse());
    }

    /**
     * @param request UpdateQuotaScheduleRequest
     * @return UpdateQuotaScheduleResponse
     */
    public UpdateQuotaScheduleResponse updateQuotaSchedule(String nickname, UpdateQuotaScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaScheduleWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you fully understand the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing methods and pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing methods and pricing</a> for exclusive Data Transmission Service resource groups and elastic reserved computing resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the time-based auto-scaling configuration for an exclusive resource group for Data Transmission Service (Tunnel Quota).</p>
     * 
     * @param request UpdateTunnelQuotaTimerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTunnelQuotaTimerResponse
     */
    public UpdateTunnelQuotaTimerResponse updateTunnelQuotaTimerWithOptions(String nickname, UpdateTunnelQuotaTimerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            query.put("timezone", request.timezone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTunnelQuotaTimer"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tunnel/" + com.aliyun.openapiutil.Client.getEncodeParam(nickname) + "/timers"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTunnelQuotaTimerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you fully understand the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing methods and pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing methods and pricing</a> for exclusive Data Transmission Service resource groups and elastic reserved computing resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the time-based auto-scaling configuration for an exclusive resource group for Data Transmission Service (Tunnel Quota).</p>
     * 
     * @param request UpdateTunnelQuotaTimerRequest
     * @return UpdateTunnelQuotaTimerResponse
     */
    public UpdateTunnelQuotaTimerResponse updateTunnelQuotaTimer(String nickname, UpdateTunnelQuotaTimerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTunnelQuotaTimerWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or removes users from a project role.</p>
     * 
     * @param request UpdateUsersToRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUsersToRoleResponse
     */
    public UpdateUsersToRoleResponse updateUsersToRoleWithOptions(String projectName, String roleName, UpdateUsersToRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.add)) {
            body.put("add", request.add);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remove)) {
            body.put("remove", request.remove);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUsersToRole"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleName) + "/users"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUsersToRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or removes users from a project role.</p>
     * 
     * @param request UpdateUsersToRoleRequest
     * @return UpdateUsersToRoleResponse
     */
    public UpdateUsersToRoleResponse updateUsersToRole(String projectName, String roleName, UpdateUsersToRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUsersToRoleWithOptions(projectName, roleName, request, headers, runtime);
    }
}
