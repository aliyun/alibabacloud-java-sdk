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
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Activate a Quota Plan Immediately.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyComputeQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ApplyComputeQuotaPlanResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Activate a Quota Plan Immediately.</p>
     * @return ApplyComputeQuotaPlanResponse
     */
    public ApplyComputeQuotaPlanResponse applyComputeQuotaPlan(String nickname, String planName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyComputeQuotaPlanWithOptions(nickname, planName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Create MaxCompute ComputeQuotaPlan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateComputeQuotaPlanResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Create MaxCompute ComputeQuotaPlan.</p>
     * 
     * @param request CreateComputeQuotaPlanRequest
     * @return CreateComputeQuotaPlanResponse
     */
    public CreateComputeQuotaPlanResponse createComputeQuotaPlan(String nickname, CreateComputeQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeQuotaPlanWithOptions(nickname, request, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmsDataSourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateMmsDataSourceResponse());
        }

    }

    /**
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
     * <p>创建数据源的更新元数据操作</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMmsFetchMetadataJobResponse
     */
    public CreateMmsFetchMetadataJobResponse createMmsFetchMetadataJobWithOptions(String sourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmsFetchMetadataJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateMmsFetchMetadataJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建数据源的更新元数据操作</p>
     * @return CreateMmsFetchMetadataJobResponse
     */
    public CreateMmsFetchMetadataJobResponse createMmsFetchMetadataJob(String sourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMmsFetchMetadataJobWithOptions(sourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建迁移任务</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmsJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateMmsJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建迁移任务</p>
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
     * <b>summary</b> : 
     * <p>Creates a package.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePackageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a package.</p>
     * 
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
     * <p>Creates a MaxCompute project.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a MaxCompute project.</p>
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
     * <b>summary</b> : 
     * <p>Creates a quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a quota plan.</p>
     * 
     * @param request CreateQuotaPlanRequest
     * @return CreateQuotaPlanResponse
     */
    public CreateQuotaPlanResponse createQuotaPlan(String nickname, CreateQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQuotaPlanWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a role at the MaxCompute project level.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateRoleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a role at the MaxCompute project level.</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(String projectName, CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete MaxCompute compute quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComputeQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteComputeQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Delete MaxCompute compute quota plan.</p>
     * @return DeleteComputeQuotaPlanResponse
     */
    public DeleteComputeQuotaPlanResponse deleteComputeQuotaPlan(String nickname, String planName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComputeQuotaPlanWithOptions(nickname, planName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMmsDataSourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMmsDataSourceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * @return DeleteMmsDataSourceResponse
     */
    public DeleteMmsDataSourceResponse deleteMmsDataSource(String sourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMmsDataSourceWithOptions(sourceId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMmsJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMmsJobResponse());
        }

    }

    /**
     * @return DeleteMmsJobResponse
     */
    public DeleteMmsJobResponse deleteMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a quota plan.</p>
     * 
     * @param request DeleteQuotaPlanRequest
     * @return DeleteQuotaPlanResponse
     */
    public DeleteQuotaPlanResponse deleteQuotaPlan(String nickname, String planName, DeleteQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaPlanWithOptions(nickname, planName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetComputeEffectivePlan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeEffectivePlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetComputeEffectivePlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>GetComputeEffectivePlan.</p>
     * @return GetComputeEffectivePlanResponse
     */
    public GetComputeEffectivePlanResponse getComputeEffectivePlan(String nickname) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeEffectivePlanWithOptions(nickname, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get detailed information of a single compute quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetComputeQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Get detailed information of a single compute quota plan.</p>
     * @return GetComputeQuotaPlanResponse
     */
    public GetComputeQuotaPlanResponse getComputeQuotaPlan(String nickname, String planName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeQuotaPlanWithOptions(nickname, planName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Displays the time-specific configuration of compute quota.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeQuotaScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetComputeQuotaScheduleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Displays the time-specific configuration of compute quota.</p>
     * 
     * @param request GetComputeQuotaScheduleRequest
     * @return GetComputeQuotaScheduleResponse
     */
    public GetComputeQuotaScheduleResponse getComputeQuotaSchedule(String nickname, GetComputeQuotaScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeQuotaScheduleWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs statistics on all jobs that are complete on a specified day and obtains the total resource usage of each job executor on a daily basis.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResourceUsageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetJobResourceUsageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Performs statistics on all jobs that are complete on a specified day and obtains the total resource usage of each job executor on a daily basis.</p>
     * 
     * @param request GetJobResourceUsageRequest
     * @return GetJobResourceUsageResponse
     */
    public GetJobResourceUsageResponse getJobResourceUsage(GetJobResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobResourceUsageWithOptions(request, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsAsyncTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsAsyncTaskResponse());
        }

    }

    /**
     * @return GetMmsAsyncTaskResponse
     */
    public GetMmsAsyncTaskResponse getMmsAsyncTask(String sourceId, String asyncTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsAsyncTaskWithOptions(sourceId, asyncTaskId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsDataSourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsDataSourceResponse());
        }

    }

    /**
     * @param request GetMmsDataSourceRequest
     * @return GetMmsDataSourceResponse
     */
    public GetMmsDataSourceResponse getMmsDataSource(String sourceId, GetMmsDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsDataSourceWithOptions(sourceId, request, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsDbResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsDbResponse());
        }

    }

    /**
     * @return GetMmsDbResponse
     */
    public GetMmsDbResponse getMmsDb(String sourceId, String dbId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsDbWithOptions(sourceId, dbId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsFetchMetadataJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsFetchMetadataJobResponse());
        }

    }

    /**
     * @return GetMmsFetchMetadataJobResponse
     */
    public GetMmsFetchMetadataJobResponse getMmsFetchMetadataJob(String sourceId, String scanId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsFetchMetadataJobWithOptions(sourceId, scanId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsJobResponse());
        }

    }

    /**
     * @return GetMmsJobResponse
     */
    public GetMmsJobResponse getMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsPartitionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsPartitionResponse());
        }

    }

    /**
     * @return GetMmsPartitionResponse
     */
    public GetMmsPartitionResponse getMmsPartition(String sourceId, String partitionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsPartitionWithOptions(sourceId, partitionId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsTableResponse());
        }

    }

    /**
     * @return GetMmsTableResponse
     */
    public GetMmsTableResponse getMmsTable(String sourceId, String tableId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsTableWithOptions(sourceId, tableId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMmsTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMmsTaskResponse());
        }

    }

    /**
     * @return GetMmsTaskResponse
     */
    public GetMmsTaskResponse getMmsTask(String sourceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMmsTaskWithOptions(sourceId, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about a package.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPackageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about a package.</p>
     * 
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
     * <p>Queries the information about a MaxCompute project.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a MaxCompute project.</p>
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
     * <p>Obtains the information about a specified level-1 quota.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetQuotaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about a specified level-1 quota.</p>
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
     * <b>summary</b> : 
     * <p>Obtains the information of a quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information of a quota plan.</p>
     * 
     * @param request GetQuotaPlanRequest
     * @return GetQuotaPlanResponse
     */
    public GetQuotaPlanResponse getQuotaPlan(String nickname, String planName, GetQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaPlanWithOptions(nickname, planName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the scheduling plan for a quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetQuotaScheduleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the scheduling plan for a quota plan.</p>
     * 
     * @param request GetQuotaScheduleRequest
     * @return GetQuotaScheduleResponse
     */
    public GetQuotaScheduleResponse getQuotaSchedule(String nickname, GetQuotaScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaScheduleWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quota resource consumption information.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaUsageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetQuotaUsageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries quota resource consumption information.</p>
     * 
     * @param request GetQuotaUsageRequest
     * @return GetQuotaUsageResponse
     */
    public GetQuotaUsageResponse getQuotaUsage(String nickname, GetQuotaUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaUsageWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the ACL-based permissions that is granted to a project-level role.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleAclResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRoleAclResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the ACL-based permissions that is granted to a project-level role.</p>
     * @return GetRoleAclResponse
     */
    public GetRoleAclResponse getRoleAcl(String projectName, String roleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleAclWithOptions(projectName, roleName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains ACL-based permissions on an object that are granted to a project-level role.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleAclOnObjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRoleAclOnObjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains ACL-based permissions on an object that are granted to a project-level role.</p>
     * 
     * @param request GetRoleAclOnObjectRequest
     * @return GetRoleAclOnObjectResponse
     */
    public GetRoleAclOnObjectResponse getRoleAclOnObject(String projectName, String roleName, GetRoleAclOnObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleAclOnObjectWithOptions(projectName, roleName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the policy that is attached to a project-level role.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRolePolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRolePolicyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the policy that is attached to a project-level role.</p>
     * @return GetRolePolicyResponse
     */
    public GetRolePolicyResponse getRolePolicy(String projectName, String roleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRolePolicyWithOptions(projectName, roleName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the running state data of jobs that are in the running state in a specified period of time.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunningJobsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRunningJobsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the running state data of jobs that are in the running state in a specified period of time.</p>
     * 
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
     * <p>Views the information about MaxCompute internal tables, views, external tables, clustered tables, or transactional tables.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTableInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Views the information about MaxCompute internal tables, views, external tables, clustered tables, or transactional tables.</p>
     * 
     * @param request GetTableInfoRequest
     * @return GetTableInfoResponse
     */
    public GetTableInfoResponse getTableInfo(String projectName, String tableName, GetTableInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableInfoWithOptions(projectName, tableName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the trusted projects of the current project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrustedProjectsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTrustedProjectsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the trusted projects of the current project.</p>
     * @return GetTrustedProjectsResponse
     */
    public GetTrustedProjectsResponse getTrustedProjects(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrustedProjectsWithOptions(projectName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates a running job.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new KillJobsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new KillJobsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Terminates a running job.</p>
     * 
     * @param request KillJobsRequest
     * @return KillJobsResponse
     */
    public KillJobsResponse killJobs(KillJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.killJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get compute usage of pay-as-you-go jobs.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeMetricsByInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListComputeMetricsByInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Get compute usage of pay-as-you-go jobs.</p>
     * 
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
     * <p>Get computeQuotaPlan list.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListComputeQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Get computeQuotaPlan list.</p>
     * @return ListComputeQuotaPlanResponse
     */
    public ListComputeQuotaPlanResponse listComputeQuotaPlan(String nickname) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComputeQuotaPlanWithOptions(nickname, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains functions in a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListFunctionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains functions in a MaxCompute project.</p>
     * 
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
     * <p>Views a list of jobs.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobInfosResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListJobInfosResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Views a list of jobs.</p>
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
     * <b>summary</b> : 
     * <p>Retrieve performance metrics for completed jobs.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobMetricResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListJobMetricResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve performance metrics for completed jobs.</p>
     * 
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
     * <p>Views a list of job snapshot data at a specific point in time.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobSnapshotInfosResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListJobSnapshotInfosResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Views a list of job snapshot data at a specific point in time.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsDataSourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsDataSourcesResponse());
        }

    }

    /**
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
     * <p>获取一个数据源内“库”列表</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsDbsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsDbsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取一个数据源内“库”列表</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsJobsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsJobsResponse());
        }

    }

    /**
     * @param request ListMmsJobsRequest
     * @return ListMmsJobsResponse
     */
    public ListMmsJobsResponse listMmsJobs(String sourceId, ListMmsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsJobsWithOptions(sourceId, request, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsPartitionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsPartitionsResponse());
        }

    }

    /**
     * @param request ListMmsPartitionsRequest
     * @return ListMmsPartitionsResponse
     */
    public ListMmsPartitionsResponse listMmsPartitions(String sourceId, ListMmsPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsPartitionsWithOptions(sourceId, request, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsTablesResponse());
        }

    }

    /**
     * @param request ListMmsTablesRequest
     * @return ListMmsTablesResponse
     */
    public ListMmsTablesResponse listMmsTables(String sourceId, ListMmsTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsTablesWithOptions(sourceId, request, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsTaskLogsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsTaskLogsResponse());
        }

    }

    /**
     * @return ListMmsTaskLogsResponse
     */
    public ListMmsTaskLogsResponse listMmsTaskLogs(String sourceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsTaskLogsWithOptions(sourceId, taskId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmsTasksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMmsTasksResponse());
        }

    }

    /**
     * @param request ListMmsTasksRequest
     * @return ListMmsTasksResponse
     */
    public ListMmsTasksResponse listMmsTasks(String sourceId, ListMmsTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMmsTasksWithOptions(sourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the packages in a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPackagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPackagesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the packages in a MaxCompute project.</p>
     * @return ListPackagesResponse
     */
    public ListPackagesResponse listPackages(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPackagesWithOptions(projectName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of users in a project.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of users in a project.</p>
     * @return ListProjectUsersResponse
     */
    public ListProjectUsersResponse listProjectUsers(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectUsersWithOptions(projectName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of MaxCompute projects.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of MaxCompute projects.</p>
     * 
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
     * <p>Queries quotas.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListQuotasResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries quotas.</p>
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
     * <b>summary</b> : 
     * <p>Obtains quota plans.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasPlansResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListQuotasPlansResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains quota plans.</p>
     * 
     * @param request ListQuotasPlansRequest
     * @return ListQuotasPlansResponse
     */
    public ListQuotasPlansResponse listQuotasPlans(String nickname, ListQuotasPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasPlansWithOptions(nickname, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains resources in a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains resources in a MaxCompute project.</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(String projectName, ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains MaxCompute project-level roles.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRolesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains MaxCompute project-level roles.</p>
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(projectName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage details of a specific partition in a partitioned table in a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListStoragePartitionsInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListStoragePartitionsInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage details of a specific partition in a partitioned table in a MaxCompute project.</p>
     * 
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
     * <p>Queries the table storage details of a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListStorageTablesInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListStorageTablesInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the table storage details of a MaxCompute project.</p>
     * 
     * @param request ListStorageTablesInfoRequest
     * @return ListStorageTablesInfoResponse
     */
    public ListStorageTablesInfoResponse listStorageTablesInfo(String project, ListStorageTablesInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStorageTablesInfoWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains tables in a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains tables in a MaxCompute project.</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(String projectName, ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTablesWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Displays the time-specific configuration of an exclusive resource group for Tunnel (referred to as Tunnel quota).</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTunnelQuotaTimerResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTunnelQuotaTimerResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Displays the time-specific configuration of an exclusive resource group for Tunnel (referred to as Tunnel quota).</p>
     * @return ListTunnelQuotaTimerResponse
     */
    public ListTunnelQuotaTimerResponse listTunnelQuotaTimer(String nickname) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTunnelQuotaTimerWithOptions(nickname, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of all users under a tenant.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of all users under a tenant.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains information about the users who are assigned a project-level role.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersByRoleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUsersByRoleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains information about the users who are assigned a project-level role.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQuotaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryQuotaResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RetryMmsJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RetryMmsJobResponse());
        }

    }

    /**
     * @return RetryMmsJobResponse
     */
    public RetryMmsJobResponse retryMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartMmsJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartMmsJobResponse());
        }

    }

    /**
     * @return StartMmsJobResponse
     */
    public StartMmsJobResponse startMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopMmsJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopMmsJobResponse());
        }

    }

    /**
     * @return StopMmsJobResponse
     */
    public StopMmsJobResponse stopMmsJob(String sourceId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMmsJobWithOptions(sourceId, jobId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the ComputeQuotaPlan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateComputeQuotaPlanResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the ComputeQuotaPlan.</p>
     * 
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
     * <p>Please ensure that before using this interface, you have fully understood the&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the time-based plan for computing quota.</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeQuotaScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateComputeQuotaScheduleResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the time-based plan for computing quota.</p>
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
     * <b>summary</b> : 
     * <p>Update the basic configuration of the calculation quota, including adding or deleting the sub quota, modifying the basic properties of the secondary quota, and the CU configuration of the effective quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeSubQuotaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateComputeSubQuotaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Update the basic configuration of the calculation quota, including adding or deleting the sub quota, modifying the basic properties of the secondary quota, and the CU configuration of the effective quota plan.</p>
     * 
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
     * <p>更新数据源配置、名称，启/停数据源实例</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMmsDataSourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMmsDataSourceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新数据源配置、名称，启/停数据源实例</p>
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
     * <b>summary</b> : 
     * <p>Updates the objects in a package and projects in which the package can be installed.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePackageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the objects in a package and projects in which the package can be installed.</p>
     * 
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
     * <p>Update Project Basic Information</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectBasicMetaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectBasicMetaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Update Project Basic Information</p>
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
     * <b>summary</b> : 
     * <p>Modify Default Project Compute Quota</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectDefaultQuotaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectDefaultQuotaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modify Default Project Compute Quota</p>
     * 
     * @param request UpdateProjectDefaultQuotaRequest
     * @return UpdateProjectDefaultQuotaResponse
     */
    public UpdateProjectDefaultQuotaResponse updateProjectDefaultQuota(String projectName, UpdateProjectDefaultQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectDefaultQuotaWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of a MaxCompute project.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectIpWhiteListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectIpWhiteListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of a MaxCompute project.</p>
     * 
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
     * <p>Updates a quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateQuotaPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates a quota plan.</p>
     * 
     * @param request UpdateQuotaPlanRequest
     * @return UpdateQuotaPlanResponse
     */
    public UpdateQuotaPlanResponse updateQuotaPlan(String nickname, String planName, UpdateQuotaPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaPlanWithOptions(nickname, planName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the scheduling plan for a quota plan.</p>
     * 
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateQuotaScheduleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the scheduling plan for a quota plan.</p>
     * 
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
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing and prices</a> of Tunnel quotas and elastically reserved computing resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the time-specific configuration of an exclusive resource group for Tunnel (referred to as Tunnel quota).</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTunnelQuotaTimerResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTunnelQuotaTimerResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing and prices</a> of Tunnel quotas and elastically reserved computing resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the time-specific configuration of an exclusive resource group for Tunnel (referred to as Tunnel quota).</p>
     * 
     * @param request UpdateTunnelQuotaTimerRequest
     * @return UpdateTunnelQuotaTimerResponse
     */
    public UpdateTunnelQuotaTimerResponse updateTunnelQuotaTimer(String nickname, UpdateTunnelQuotaTimerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTunnelQuotaTimerWithOptions(nickname, request, headers, runtime);
    }
}
