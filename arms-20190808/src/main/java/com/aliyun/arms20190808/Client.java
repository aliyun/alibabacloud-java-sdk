// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808;

import com.aliyun.tea.*;
import com.aliyun.arms20190808.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-edge-1", "arms.aliyuncs.com"),
            new TeaPair("cn-fujian", "arms.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "arms.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "arms.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "arms.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-wuhan", "arms.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "arms.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "arms.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "arms.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "arms.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "arms.aliyuncs.com"),
            new TeaPair("me-east-1", "arms.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "arms.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("arms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Adds data sources to a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request AddAliClusterIdsToPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAliClusterIdsToPrometheusGlobalViewResponse
     */
    public AddAliClusterIdsToPrometheusGlobalViewResponse addAliClusterIdsToPrometheusGlobalViewWithOptions(AddAliClusterIdsToPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            query.put("ClusterIds", request.clusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalViewClusterId)) {
            query.put("GlobalViewClusterId", request.globalViewClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAliClusterIdsToPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAliClusterIdsToPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds data sources to a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request AddAliClusterIdsToPrometheusGlobalViewRequest
     * @return AddAliClusterIdsToPrometheusGlobalViewResponse
     */
    public AddAliClusterIdsToPrometheusGlobalViewResponse addAliClusterIdsToPrometheusGlobalView(AddAliClusterIdsToPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAliClusterIdsToPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Integrates the dashboard of Prometheus Service.</p>
     * 
     * @param request AddGrafanaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGrafanaResponse
     */
    public AddGrafanaResponse addGrafanaWithOptions(AddGrafanaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integration)) {
            query.put("Integration", request.integration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGrafana"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGrafanaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Integrates the dashboard of Prometheus Service.</p>
     * 
     * @param request AddGrafanaRequest
     * @return AddGrafanaResponse
     */
    public AddGrafanaResponse addGrafana(AddGrafanaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGrafanaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>接入integration</p>
     * 
     * @deprecated OpenAPI AddIntegration is deprecated, please use ARMS::2019-08-08::InstallAddon instead.
     * 
     * @param request AddIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIntegrationResponse
     */
    @Deprecated
    // Deprecated
    public AddIntegrationResponse addIntegrationWithOptions(AddIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integration)) {
            query.put("Integration", request.integration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>接入integration</p>
     * 
     * @deprecated OpenAPI AddIntegration is deprecated, please use ARMS::2019-08-08::InstallAddon instead.
     * 
     * @param request AddIntegrationRequest
     * @return AddIntegrationResponse
     */
    @Deprecated
    // Deprecated
    public AddIntegrationResponse addIntegration(AddIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request AddPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrometheusGlobalViewResponse
     */
    public AddPrometheusGlobalViewResponse addPrometheusGlobalViewWithOptions(AddPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusters)) {
            query.put("Clusters", request.clusters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request AddPrometheusGlobalViewRequest
     * @return AddPrometheusGlobalViewResponse
     */
    public AddPrometheusGlobalViewResponse addPrometheusGlobalView(AddPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request AddPrometheusGlobalViewByAliClusterIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrometheusGlobalViewByAliClusterIdsResponse
     */
    public AddPrometheusGlobalViewByAliClusterIdsResponse addPrometheusGlobalViewByAliClusterIdsWithOptions(AddPrometheusGlobalViewByAliClusterIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            query.put("ClusterIds", request.clusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrometheusGlobalViewByAliClusterIds"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrometheusGlobalViewByAliClusterIdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request AddPrometheusGlobalViewByAliClusterIdsRequest
     * @return AddPrometheusGlobalViewByAliClusterIdsResponse
     */
    public AddPrometheusGlobalViewByAliClusterIdsResponse addPrometheusGlobalViewByAliClusterIds(AddPrometheusGlobalViewByAliClusterIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrometheusGlobalViewByAliClusterIdsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Prometheus instance for Remote Write.</p>
     * 
     * @param request AddPrometheusInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrometheusInstanceResponse
     */
    public AddPrometheusInstanceResponse addPrometheusInstanceWithOptions(AddPrometheusInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrometheusInstance"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrometheusInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Prometheus instance for Remote Write.</p>
     * 
     * @param request AddPrometheusInstanceRequest
     * @return AddPrometheusInstanceResponse
     */
    public AddPrometheusInstanceResponse addPrometheusInstance(AddPrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrometheusInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an exporter to a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request AddPrometheusIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrometheusIntegrationResponse
     */
    public AddPrometheusIntegrationResponse addPrometheusIntegrationWithOptions(AddPrometheusIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            query.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrometheusIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrometheusIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an exporter to a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request AddPrometheusIntegrationRequest
     * @return AddPrometheusIntegrationResponse
     */
    public AddPrometheusIntegrationResponse addPrometheusIntegration(AddPrometheusIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrometheusIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a remote write configuration item to a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request AddPrometheusRemoteWriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrometheusRemoteWriteResponse
     */
    public AddPrometheusRemoteWriteResponse addPrometheusRemoteWriteWithOptions(AddPrometheusRemoteWriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remoteWriteYaml)) {
            body.put("RemoteWriteYaml", request.remoteWriteYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrometheusRemoteWrite"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrometheusRemoteWriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a remote write configuration item to a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request AddPrometheusRemoteWriteRequest
     * @return AddPrometheusRemoteWriteResponse
     */
    public AddPrometheusRemoteWriteResponse addPrometheusRemoteWrite(AddPrometheusRemoteWriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrometheusRemoteWriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a recording rule.</p>
     * 
     * @param request AddRecordingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRecordingRuleResponse
     */
    public AddRecordingRuleResponse addRecordingRuleWithOptions(AddRecordingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleYaml)) {
            query.put("RuleYaml", request.ruleYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecordingRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRecordingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a recording rule.</p>
     * 
     * @param request AddRecordingRuleRequest
     * @return AddRecordingRuleResponse
     */
    public AddRecordingRuleResponse addRecordingRule(AddRecordingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecordingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Flink集群打标</p>
     * 
     * @param request AddTagToFlinkClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTagToFlinkClusterResponse
     */
    public AddTagToFlinkClusterResponse addTagToFlinkClusterWithOptions(AddTagToFlinkClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flinkWorkSpaceId)) {
            query.put("FlinkWorkSpaceId", request.flinkWorkSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flinkWorkSpaceName)) {
            query.put("FlinkWorkSpaceName", request.flinkWorkSpaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTagToFlinkCluster"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagToFlinkClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Flink集群打标</p>
     * 
     * @param request AddTagToFlinkClusterRequest
     * @return AddTagToFlinkClusterResponse
     */
    public AddTagToFlinkClusterResponse addTagToFlinkCluster(AddTagToFlinkClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagToFlinkClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a data source to a global aggregation instance.</p>
     * 
     * @param request AppendInstancesToPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AppendInstancesToPrometheusGlobalViewResponse
     */
    public AppendInstancesToPrometheusGlobalViewResponse appendInstancesToPrometheusGlobalViewWithOptions(AppendInstancesToPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusters)) {
            query.put("Clusters", request.clusters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalViewClusterId)) {
            query.put("GlobalViewClusterId", request.globalViewClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppendInstancesToPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppendInstancesToPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a data source to a global aggregation instance.</p>
     * 
     * @param request AppendInstancesToPrometheusGlobalViewRequest
     * @return AppendInstancesToPrometheusGlobalViewResponse
     */
    public AppendInstancesToPrometheusGlobalViewResponse appendInstancesToPrometheusGlobalView(AppendInstancesToPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.appendInstancesToPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ApplyScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyScenarioResponse
     */
    public ApplyScenarioResponse applyScenarioWithOptions(ApplyScenarioRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyScenarioShrinkRequest request = new ApplyScenarioShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            query.put("Config", request.configShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            query.put("Scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snDump)) {
            query.put("SnDump", request.snDump);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snForce)) {
            query.put("SnForce", request.snForce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snStat)) {
            query.put("SnStat", request.snStat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snTransfer)) {
            query.put("SnTransfer", request.snTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateOption)) {
            query.put("UpdateOption", request.updateOption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyScenario"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyScenarioResponse());
    }

    /**
     * @param request ApplyScenarioRequest
     * @return ApplyScenarioResponse
     */
    public ApplyScenarioResponse applyScenario(ApplyScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyScenarioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a Grafana workspace to a Prometheus instance.</p>
     * 
     * @param request BindPrometheusGrafanaInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindPrometheusGrafanaInstanceResponse
     */
    public BindPrometheusGrafanaInstanceResponse bindPrometheusGrafanaInstanceWithOptions(BindPrometheusGrafanaInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaInstanceId)) {
            query.put("GrafanaInstanceId", request.grafanaInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPrometheusGrafanaInstance"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPrometheusGrafanaInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a Grafana workspace to a Prometheus instance.</p>
     * 
     * @param request BindPrometheusGrafanaInstanceRequest
     * @return BindPrometheusGrafanaInstanceResponse
     */
    public BindPrometheusGrafanaInstanceResponse bindPrometheusGrafanaInstance(BindPrometheusGrafanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPrometheusGrafanaInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>屏蔽告警通知</p>
     * 
     * @param request BlockAlarmNotificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BlockAlarmNotificationResponse
     */
    public BlockAlarmNotificationResponse blockAlarmNotificationWithOptions(BlockAlarmNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            query.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handlerId)) {
            query.put("HandlerId", request.handlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BlockAlarmNotification"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BlockAlarmNotificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>屏蔽告警通知</p>
     * 
     * @param request BlockAlarmNotificationRequest
     * @return BlockAlarmNotificationResponse
     */
    public BlockAlarmNotificationResponse blockAlarmNotification(BlockAlarmNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.blockAlarmNotificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改告警等级</p>
     * 
     * @param request ChangeAlarmSeverityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAlarmSeverityResponse
     */
    public ChangeAlarmSeverityResponse changeAlarmSeverityWithOptions(ChangeAlarmSeverityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            query.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handlerId)) {
            query.put("HandlerId", request.handlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAlarmSeverity"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAlarmSeverityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改告警等级</p>
     * 
     * @param request ChangeAlarmSeverityRequest
     * @return ChangeAlarmSeverityResponse
     */
    public ChangeAlarmSeverityResponse changeAlarmSeverity(ChangeAlarmSeverityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAlarmSeverityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
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
            new TeaPair("version", "2019-08-08"),
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
     * <p>Changes the resource group to which a resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to check whether ARMS is available for commercial use in a region.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether Application Real-Time Monitoring Service (ARMS) is available for commercial use in a region.</p>
     * 
     * @param request CheckCommercialStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCommercialStatusResponse
     */
    public CheckCommercialStatusResponse checkCommercialStatusWithOptions(CheckCommercialStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCommercialStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCommercialStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to check whether ARMS is available for commercial use in a region.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether Application Real-Time Monitoring Service (ARMS) is available for commercial use in a region.</p>
     * 
     * @param request CheckCommercialStatusRequest
     * @return CheckCommercialStatusResponse
     */
    public CheckCommercialStatusResponse checkCommercialStatus(CheckCommercialStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCommercialStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of a service in the current cluster, such as whether the service is activated and whether the payment is overdue.</p>
     * 
     * @param request CheckServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckServiceStatusResponse
     */
    public CheckServiceStatusResponse checkServiceStatusWithOptions(CheckServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.svcCode)) {
            query.put("SvcCode", request.svcCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of a service in the current cluster, such as whether the service is activated and whether the payment is overdue.</p>
     * 
     * @param request CheckServiceStatusRequest
     * @return CheckServiceStatusResponse
     */
    public CheckServiceStatusResponse checkServiceStatus(CheckServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>认领告警</p>
     * 
     * @param request ClaimAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClaimAlarmResponse
     */
    public ClaimAlarmResponse claimAlarmWithOptions(ClaimAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            query.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handlerId)) {
            query.put("HandlerId", request.handlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClaimAlarm"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClaimAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>认领告警</p>
     * 
     * @param request ClaimAlarmRequest
     * @return ClaimAlarmResponse
     */
    public ClaimAlarmResponse claimAlarm(ClaimAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.claimAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭告警</p>
     * 
     * @param request CloseAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseAlarmResponse
     */
    public CloseAlarmResponse closeAlarmWithOptions(CloseAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            query.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handlerId)) {
            query.put("HandlerId", request.handlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solution)) {
            query.put("Solution", request.solution);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseAlarm"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭告警</p>
     * 
     * @param request CloseAlarmRequest
     * @return CloseAlarmResponse
     */
    public CloseAlarmResponse closeAlarm(CloseAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeAlarmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Turns on or off the main switch of an ARMS agent, or queries the status of the main switch.</p>
     * 
     * @param request ConfigAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigAppResponse
     */
    public ConfigAppResponse configAppWithOptions(ConfigAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigAppResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Turns on or off the main switch of an ARMS agent, or queries the status of the main switch.</p>
     * 
     * @param request ConfigAppRequest
     * @return ConfigAppResponse
     */
    public ConfigAppResponse configApp(ConfigAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of the Alert Management module.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert contact.</p>
     * 
     * @param request CreateAlertContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertContactResponse
     */
    public CreateAlertContactResponse createAlertContactWithOptions(CreateAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingRobotWebhookUrl)) {
            query.put("DingRobotWebhookUrl", request.dingRobotWebhookUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemNoc)) {
            query.put("SystemNoc", request.systemNoc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlertContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlertContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of the Alert Management module.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert contact.</p>
     * 
     * @param request CreateAlertContactRequest
     * @return CreateAlertContactResponse
     */
    public CreateAlertContactResponse createAlertContact(CreateAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlertContactWithOptions(request, runtime);
    }

    /**
     * @param request CreateAlertContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertContactGroupResponse
     */
    public CreateAlertContactGroupResponse createAlertContactGroupWithOptions(CreateAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlertContactGroup"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlertContactGroupResponse());
    }

    /**
     * @param request CreateAlertContactGroupRequest
     * @return CreateAlertContactGroupResponse
     */
    public CreateAlertContactGroupResponse createAlertContactGroup(CreateAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlertContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The operation that you want to perform. Set the value to CreateDispatchRule.</p>
     * 
     * @param request CreateDispatchRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDispatchRuleResponse
     */
    public CreateDispatchRuleResponse createDispatchRuleWithOptions(CreateDispatchRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dispatchRule)) {
            query.put("DispatchRule", request.dispatchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDispatchRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDispatchRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The operation that you want to perform. Set the value to CreateDispatchRule.</p>
     * 
     * @param request CreateDispatchRuleRequest
     * @return CreateDispatchRuleResponse
     */
    public CreateDispatchRuleResponse createDispatchRule(CreateDispatchRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDispatchRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom job for an environment.</p>
     * 
     * @param request CreateEnvCustomJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvCustomJobResponse
     */
    public CreateEnvCustomJobResponse createEnvCustomJobWithOptions(CreateEnvCustomJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customJobName)) {
            query.put("CustomJobName", request.customJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvCustomJob"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvCustomJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom job for an environment.</p>
     * 
     * @param request CreateEnvCustomJobRequest
     * @return CreateEnvCustomJobResponse
     */
    public CreateEnvCustomJobResponse createEnvCustomJob(CreateEnvCustomJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnvCustomJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a PodMonitor for an environment.</p>
     * 
     * @param request CreateEnvPodMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvPodMonitorResponse
     */
    public CreateEnvPodMonitorResponse createEnvPodMonitorWithOptions(CreateEnvPodMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvPodMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvPodMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a PodMonitor for an environment.</p>
     * 
     * @param request CreateEnvPodMonitorRequest
     * @return CreateEnvPodMonitorResponse
     */
    public CreateEnvPodMonitorResponse createEnvPodMonitor(CreateEnvPodMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnvPodMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a ServiceMonitor for an environment.</p>
     * 
     * @param request CreateEnvServiceMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvServiceMonitorResponse
     */
    public CreateEnvServiceMonitorResponse createEnvServiceMonitorWithOptions(CreateEnvServiceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvServiceMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvServiceMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a ServiceMonitor for an environment.</p>
     * 
     * @param request CreateEnvServiceMonitorRequest
     * @return CreateEnvServiceMonitorResponse
     */
    public CreateEnvServiceMonitorResponse createEnvServiceMonitor(CreateEnvServiceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnvServiceMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an environment instance.</p>
     * 
     * @param request CreateEnvironmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindResourceId)) {
            query.put("BindResourceId", request.bindResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentName)) {
            query.put("EnvironmentName", request.environmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentSubType)) {
            query.put("EnvironmentSubType", request.environmentSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentType)) {
            query.put("EnvironmentType", request.environmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feePackage)) {
            query.put("FeePackage", request.feePackage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceId)) {
            query.put("GrafanaWorkspaceId", request.grafanaWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initEnvironment)) {
            query.put("InitEnvironment", request.initEnvironment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managedType)) {
            query.put("ManagedType", request.managedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceId)) {
            query.put("PrometheusInstanceId", request.prometheusInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvironment"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an environment instance.</p>
     * 
     * @param request CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnvironmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作区</p>
     * 
     * @param tmpReq CreateGrafanaWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGrafanaWorkspaceResponse
     */
    public CreateGrafanaWorkspaceResponse createGrafanaWorkspaceWithOptions(CreateGrafanaWorkspaceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateGrafanaWorkspaceShrinkRequest request = new CreateGrafanaWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaVersion)) {
            query.put("GrafanaVersion", request.grafanaVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceEdition)) {
            query.put("GrafanaWorkspaceEdition", request.grafanaWorkspaceEdition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceName)) {
            query.put("GrafanaWorkspaceName", request.grafanaWorkspaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGrafanaWorkspace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGrafanaWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作区</p>
     * 
     * @param request CreateGrafanaWorkspaceRequest
     * @return CreateGrafanaWorkspaceResponse
     */
    public CreateGrafanaWorkspaceResponse createGrafanaWorkspace(CreateGrafanaWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGrafanaWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert integration.</p>
     * 
     * @param request CreateIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntegrationResponse
     */
    public CreateIntegrationResponse createIntegrationWithOptions(CreateIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRecover)) {
            body.put("AutoRecover", request.autoRecover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationName)) {
            body.put("IntegrationName", request.integrationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationProductType)) {
            body.put("IntegrationProductType", request.integrationProductType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoverTime)) {
            body.put("RecoverTime", request.recoverTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert integration.</p>
     * 
     * @param request CreateIntegrationRequest
     * @return CreateIntegrationResponse
     */
    public CreateIntegrationResponse createIntegration(CreateIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule.</p>
     * 
     * @param request CreateOrUpdateAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateAlertRuleResponse
     */
    public CreateOrUpdateAlertRuleResponse createOrUpdateAlertRuleWithOptions(CreateOrUpdateAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertCheckType)) {
            body.put("AlertCheckType", request.alertCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertGroup)) {
            body.put("AlertGroup", request.alertGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            body.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertPiplines)) {
            body.put("AlertPiplines", request.alertPiplines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleContent)) {
            body.put("AlertRuleContent", request.alertRuleContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertStatus)) {
            body.put("AlertStatus", request.alertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoAddNewApplication)) {
            body.put("AutoAddNewApplication", request.autoAddNewApplication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoAddTargetConfig)) {
            body.put("AutoAddTargetConfig", request.autoAddTargetConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConfig)) {
            body.put("DataConfig", request.dataConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.markTags)) {
            body.put("MarkTags", request.markTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricsKey)) {
            body.put("MetricsKey", request.metricsKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricsType)) {
            body.put("MetricsType", request.metricsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notice)) {
            body.put("Notice", request.notice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyMode)) {
            body.put("NotifyMode", request.notifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStrategy)) {
            body.put("NotifyStrategy", request.notifyStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pids)) {
            body.put("Pids", request.pids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promQL)) {
            body.put("PromQL", request.promQL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule.</p>
     * 
     * @param request CreateOrUpdateAlertRuleRequest
     * @return CreateOrUpdateAlertRuleResponse
     */
    public CreateOrUpdateAlertRuleResponse createOrUpdateAlertRule(CreateOrUpdateAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert contact.</p>
     * 
     * @param request CreateOrUpdateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateContactResponse
     */
    public CreateOrUpdateContactResponse createOrUpdateContactWithOptions(CreateOrUpdateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingRobotUrl)) {
            query.put("DingRobotUrl", request.dingRobotUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpUserId)) {
            body.put("CorpUserId", request.corpUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEmailVerify)) {
            body.put("IsEmailVerify", request.isEmailVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reissueSendNotice)) {
            body.put("ReissueSendNotice", request.reissueSendNotice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert contact.</p>
     * 
     * @param request CreateOrUpdateContactRequest
     * @return CreateOrUpdateContactResponse
     */
    public CreateOrUpdateContactResponse createOrUpdateContact(CreateOrUpdateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert contact group.</p>
     * 
     * @param request CreateOrUpdateContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateContactGroupResponse
     */
    public CreateOrUpdateContactGroupResponse createOrUpdateContactGroupWithOptions(CreateOrUpdateContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupId)) {
            body.put("ContactGroupId", request.contactGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            body.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            body.put("ContactIds", request.contactIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateContactGroup"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert contact group.</p>
     * 
     * @param request CreateOrUpdateContactGroupRequest
     * @return CreateOrUpdateContactGroupResponse
     */
    public CreateOrUpdateContactGroupResponse createOrUpdateContactGroup(CreateOrUpdateContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an EventBridge integration that is used to push notifications.</p>
     * 
     * @param request CreateOrUpdateEventBridgeIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateEventBridgeIntegrationResponse
     */
    public CreateOrUpdateEventBridgeIntegrationResponse createOrUpdateEventBridgeIntegrationWithOptions(CreateOrUpdateEventBridgeIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            body.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessSecret)) {
            body.put("AccessSecret", request.accessSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            body.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            body.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusRegionId)) {
            body.put("EventBusRegionId", request.eventBusRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateEventBridgeIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateEventBridgeIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an EventBridge integration that is used to push notifications.</p>
     * 
     * @param request CreateOrUpdateEventBridgeIntegrationRequest
     * @return CreateOrUpdateEventBridgeIntegrationResponse
     */
    public CreateOrUpdateEventBridgeIntegrationResponse createOrUpdateEventBridgeIntegration(CreateOrUpdateEventBridgeIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateEventBridgeIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates an IM chatbot.</p>
     * 
     * @param request CreateOrUpdateIMRobotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateIMRobotResponse
     */
    public CreateOrUpdateIMRobotResponse createOrUpdateIMRobotWithOptions(CreateOrUpdateIMRobotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplate)) {
            body.put("CardTemplate", request.cardTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dailyNoc)) {
            body.put("DailyNoc", request.dailyNoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dailyNocTime)) {
            body.put("DailyNocTime", request.dailyNocTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSignKey)) {
            body.put("DingSignKey", request.dingSignKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOutgoing)) {
            body.put("EnableOutgoing", request.enableOutgoing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotAddress)) {
            body.put("RobotAddress", request.robotAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            body.put("RobotId", request.robotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotName)) {
            body.put("RobotName", request.robotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateIMRobot"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateIMRobotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates an IM chatbot.</p>
     * 
     * @param request CreateOrUpdateIMRobotRequest
     * @return CreateOrUpdateIMRobotResponse
     */
    public CreateOrUpdateIMRobotResponse createOrUpdateIMRobot(CreateOrUpdateIMRobotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateIMRobotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a notification policy.</p>
     * 
     * @param request CreateOrUpdateNotificationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateNotificationPolicyResponse
     */
    public CreateOrUpdateNotificationPolicyResponse createOrUpdateNotificationPolicyWithOptions(CreateOrUpdateNotificationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directedMode)) {
            body.put("DirectedMode", request.directedMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPolicyId)) {
            body.put("EscalationPolicyId", request.escalationPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupRule)) {
            body.put("GroupRule", request.groupRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationId)) {
            body.put("IntegrationId", request.integrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchingRules)) {
            body.put("MatchingRules", request.matchingRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyRule)) {
            body.put("NotifyRule", request.notifyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTemplate)) {
            body.put("NotifyTemplate", request.notifyTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeat)) {
            body.put("Repeat", request.repeat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatInterval)) {
            body.put("RepeatInterval", request.repeatInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendRecoverMessage)) {
            body.put("SendRecoverMessage", request.sendRecoverMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateNotificationPolicy"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateNotificationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a notification policy.</p>
     * 
     * @param request CreateOrUpdateNotificationPolicyRequest
     * @return CreateOrUpdateNotificationPolicyResponse
     */
    public CreateOrUpdateNotificationPolicyResponse createOrUpdateNotificationPolicy(CreateOrUpdateNotificationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateNotificationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a silence policy.</p>
     * 
     * @param request CreateOrUpdateSilencePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateSilencePolicyResponse
     */
    public CreateOrUpdateSilencePolicyResponse createOrUpdateSilencePolicyWithOptions(CreateOrUpdateSilencePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchingRules)) {
            body.put("MatchingRules", request.matchingRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateSilencePolicy"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateSilencePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a silence policy.</p>
     * 
     * @param request CreateOrUpdateSilencePolicyRequest
     * @return CreateOrUpdateSilencePolicyResponse
     */
    public CreateOrUpdateSilencePolicyResponse createOrUpdateSilencePolicy(CreateOrUpdateSilencePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateSilencePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a webhook alert contact.</p>
     * 
     * @param request CreateOrUpdateWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateWebhookContactResponse
     */
    public CreateOrUpdateWebhookContactResponse createOrUpdateWebhookContactWithOptions(CreateOrUpdateWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizHeaders)) {
            body.put("BizHeaders", request.bizHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizParams)) {
            body.put("BizParams", request.bizParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoverBody)) {
            body.put("RecoverBody", request.recoverBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookId)) {
            body.put("WebhookId", request.webhookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookName)) {
            body.put("WebhookName", request.webhookName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateWebhookContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a webhook alert contact.</p>
     * 
     * @param request CreateOrUpdateWebhookContactRequest
     * @return CreateOrUpdateWebhookContactResponse
     */
    public CreateOrUpdateWebhookContactResponse createOrUpdateWebhookContact(CreateOrUpdateWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateWebhookContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Prometheus告警规则</p>
     * 
     * @param request CreatePrometheusAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusAlertRuleResponse
     */
    public CreatePrometheusAlertRuleResponse createPrometheusAlertRuleWithOptions(CreatePrometheusAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            query.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatchRuleId)) {
            query.put("DispatchRuleId", request.dispatchRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            query.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrometheusAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Prometheus告警规则</p>
     * 
     * @param request CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     */
    public CreatePrometheusAlertRuleResponse createPrometheusAlertRule(CreatePrometheusAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrometheusAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Prometheus instance.</p>
     * 
     * @param request CreatePrometheusInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusInstanceResponse
     */
    public CreatePrometheusInstanceResponse createPrometheusInstanceWithOptions(CreatePrometheusInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allSubClustersSuccess)) {
            query.put("AllSubClustersSuccess", request.allSubClustersSuccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archiveDuration)) {
            query.put("ArchiveDuration", request.archiveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaInstanceId)) {
            query.put("GrafanaInstanceId", request.grafanaInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subClustersJson)) {
            query.put("SubClustersJson", request.subClustersJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
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
            new TeaPair("action", "CreatePrometheusInstance"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Prometheus instance.</p>
     * 
     * @param request CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    public CreatePrometheusInstanceResponse createPrometheusInstance(CreatePrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrometheusInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitoring configuration for a Prometheus instance.</p>
     * 
     * @param request CreatePrometheusMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusMonitoringResponse
     */
    public CreatePrometheusMonitoringResponse createPrometheusMonitoringWithOptions(CreatePrometheusMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrometheusMonitoring"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitoring configuration for a Prometheus instance.</p>
     * 
     * @param request CreatePrometheusMonitoringRequest
     * @return CreatePrometheusMonitoringResponse
     */
    public CreatePrometheusMonitoringResponse createPrometheusMonitoring(CreatePrometheusMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrometheusMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Browser Monitoring task for an application.</p>
     * 
     * @param request CreateRetcodeAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRetcodeAppResponse
     */
    public CreateRetcodeAppResponse createRetcodeAppWithOptions(CreateRetcodeAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retcodeAppName)) {
            query.put("RetcodeAppName", request.retcodeAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retcodeAppType)) {
            query.put("RetcodeAppType", request.retcodeAppType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRetcodeApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRetcodeAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Browser Monitoring task for an application.</p>
     * 
     * @param request CreateRetcodeAppRequest
     * @return CreateRetcodeAppResponse
     */
    public CreateRetcodeAppResponse createRetcodeApp(CreateRetcodeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRetcodeAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建前端监控应用</p>
     * 
     * @param request CreateRumAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRumAppResponse
     */
    public CreateRumAppResponse createRumAppWithOptions(CreateRumAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroup)) {
            query.put("AppGroup", request.appGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("PackageName", request.packageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteType)) {
            query.put("SiteType", request.siteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRumApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRumAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建前端监控应用</p>
     * 
     * @param request CreateRumAppRequest
     * @return CreateRumAppResponse
     */
    public CreateRumAppResponse createRumApp(CreateRumAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRumAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建前端监控上传oss的URL</p>
     * 
     * @param request CreateRumUploadFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRumUploadFileUrlResponse
     */
    public CreateRumUploadFileUrlResponse createRumUploadFileUrlWithOptions(CreateRumUploadFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcemapType)) {
            query.put("SourcemapType", request.sourcemapType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRumUploadFileUrl"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRumUploadFileUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建前端监控上传oss的URL</p>
     * 
     * @param request CreateRumUploadFileUrlRequest
     * @return CreateRumUploadFileUrlResponse
     */
    public CreateRumUploadFileUrlResponse createRumUploadFileUrl(CreateRumUploadFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRumUploadFileUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新云拨测定时监控任务</p>
     * 
     * @param tmpReq CreateSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSyntheticTaskResponse
     */
    public CreateSyntheticTaskResponse createSyntheticTaskWithOptions(CreateSyntheticTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSyntheticTaskShrinkRequest request = new CreateSyntheticTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commonParam)) {
            request.commonParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commonParam, "CommonParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.download)) {
            request.downloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.download, "Download", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendInterval)) {
            request.extendIntervalShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendInterval, "ExtendInterval", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitorList)) {
            request.monitorListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitorList, "MonitorList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.navigation)) {
            request.navigationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.navigation, "Navigation", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.net)) {
            request.netShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.net, "Net", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocol)) {
            request.protocolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocol, "Protocol", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commonParamShrink)) {
            query.put("CommonParam", request.commonParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadShrink)) {
            query.put("Download", request.downloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendIntervalShrink)) {
            query.put("ExtendInterval", request.extendIntervalShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalTime)) {
            query.put("IntervalTime", request.intervalTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalType)) {
            query.put("IntervalType", request.intervalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorListShrink)) {
            query.put("MonitorList", request.monitorListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.navigationShrink)) {
            query.put("Navigation", request.navigationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netShrink)) {
            query.put("Net", request.netShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolShrink)) {
            query.put("Protocol", request.protocolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTask)) {
            query.put("UpdateTask", request.updateTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新云拨测定时监控任务</p>
     * 
     * @param request CreateSyntheticTaskRequest
     * @return CreateSyntheticTaskResponse
     */
    public CreateSyntheticTaskResponse createSyntheticTask(CreateSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建云拨测定时任务</p>
     * 
     * @param tmpReq CreateTimingSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTimingSyntheticTaskResponse
     */
    public CreateTimingSyntheticTaskResponse createTimingSyntheticTaskWithOptions(CreateTimingSyntheticTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTimingSyntheticTaskShrinkRequest request = new CreateTimingSyntheticTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.availableAssertions)) {
            request.availableAssertionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.availableAssertions, "AvailableAssertions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commonSetting)) {
            request.commonSettingShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commonSetting, "CommonSetting", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customPeriod)) {
            request.customPeriodShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customPeriod, "CustomPeriod", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitorConf)) {
            request.monitorConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitorConf, "MonitorConf", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitors)) {
            request.monitorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitors, "Monitors", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.availableAssertionsShrink)) {
            query.put("AvailableAssertions", request.availableAssertionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonSettingShrink)) {
            query.put("CommonSetting", request.commonSettingShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPeriodShrink)) {
            query.put("CustomPeriod", request.customPeriodShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorCategory)) {
            query.put("MonitorCategory", request.monitorCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfShrink)) {
            query.put("MonitorConf", request.monitorConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorsShrink)) {
            query.put("Monitors", request.monitorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTimingSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTimingSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建云拨测定时任务</p>
     * 
     * @param request CreateTimingSyntheticTaskRequest
     * @return CreateTimingSyntheticTaskResponse
     */
    public CreateTimingSyntheticTaskResponse createTimingSyntheticTask(CreateTimingSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTimingSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a contact for webhook alerts.</p>
     * 
     * @param request CreateWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebhookResponse
     */
    public CreateWebhookResponse createWebhookWithOptions(CreateWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpHeaders)) {
            query.put("HttpHeaders", request.httpHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpParams)) {
            query.put("HttpParams", request.httpParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoverBody)) {
            query.put("RecoverBody", request.recoverBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebhook"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a contact for webhook alerts.</p>
     * 
     * @param request CreateWebhookRequest
     * @return CreateWebhookResponse
     */
    public CreateWebhookResponse createWebhook(CreateWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an authentication token.</p>
     * 
     * @param request DelAuthTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelAuthTokenResponse
     */
    public DelAuthTokenResponse delAuthTokenWithOptions(DelAuthTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelAuthToken"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelAuthTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an authentication token.</p>
     * 
     * @param request DelAuthTokenRequest
     * @return DelAuthTokenResponse
     */
    public DelAuthTokenResponse delAuthToken(DelAuthTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delAuthTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete AddonRelease data by AddonRelease name.</p>
     * 
     * @param request DeleteAddonReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAddonReleaseResponse
     */
    public DeleteAddonReleaseResponse deleteAddonReleaseWithOptions(DeleteAddonReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("AddonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            query.put("ReleaseName", request.releaseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAddonRelease"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAddonReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete AddonRelease data by AddonRelease name.</p>
     * 
     * @param request DeleteAddonReleaseRequest
     * @return DeleteAddonReleaseResponse
     */
    public DeleteAddonReleaseResponse deleteAddonRelease(DeleteAddonReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAddonReleaseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Deletes an DeleteAlertContact contact.</p>
     * 
     * @param request DeleteAlertContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertContactResponse
     */
    public DeleteAlertContactResponse deleteAlertContactWithOptions(DeleteAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertContactResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Deletes an DeleteAlertContact contact.</p>
     * 
     * @param request DeleteAlertContactRequest
     * @return DeleteAlertContactResponse
     */
    public DeleteAlertContactResponse deleteAlertContact(DeleteAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an DeleteAlertContactGroup contact group.</p>
     * 
     * @param request DeleteAlertContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertContactGroupResponse
     */
    public DeleteAlertContactGroupResponse deleteAlertContactGroupWithOptions(DeleteAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupId)) {
            query.put("ContactGroupId", request.contactGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertContactGroup"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an DeleteAlertContactGroup contact group.</p>
     * 
     * @param request DeleteAlertContactGroupRequest
     * @return DeleteAlertContactGroupResponse
     */
    public DeleteAlertContactGroupResponse deleteAlertContactGroup(DeleteAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule.</p>
     * 
     * @param request DeleteAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRuleWithOptions(DeleteAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule.</p>
     * 
     * @param request DeleteAlertRuleRequest
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertRulesResponse
     */
    public DeleteAlertRulesResponse deleteAlertRulesWithOptions(DeleteAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertIds)) {
            query.put("AlertIds", request.alertIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertRules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertRulesResponse());
    }

    /**
     * @param request DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     */
    public DeleteAlertRulesResponse deleteAlertRules(DeleteAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple applications at a time based on the process IDs (PIDs).</p>
     * 
     * @param request DeleteAppListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppListResponse
     */
    public DeleteAppListResponse deleteAppListWithOptions(DeleteAppListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pids)) {
            query.put("Pids", request.pids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppList"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple applications at a time based on the process IDs (PIDs).</p>
     * 
     * @param request DeleteAppListRequest
     * @return DeleteAppListResponse
     */
    public DeleteAppListResponse deleteAppList(DeleteAppListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Prometheus instance for Alibaba Cloud services.</p>
     * 
     * @deprecated OpenAPI DeleteCmsExporter is deprecated, please use ARMS::2019-08-08::DeleteAddonRelease instead.
     * 
     * @param request DeleteCmsExporterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCmsExporterResponse
     */
    @Deprecated
    // Deprecated
    public DeleteCmsExporterResponse deleteCmsExporterWithOptions(DeleteCmsExporterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCmsExporter"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCmsExporterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Prometheus instance for Alibaba Cloud services.</p>
     * 
     * @deprecated OpenAPI DeleteCmsExporter is deprecated, please use ARMS::2019-08-08::DeleteAddonRelease instead.
     * 
     * @param request DeleteCmsExporterRequest
     * @return DeleteCmsExporterResponse
     */
    @Deprecated
    // Deprecated
    public DeleteCmsExporterResponse deleteCmsExporter(DeleteCmsExporterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCmsExporterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DeleteContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DeleteContactRequest
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert contact group.</p>
     * 
     * @param request DeleteContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactGroupResponse
     */
    public DeleteContactGroupResponse deleteContactGroupWithOptions(DeleteContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupId)) {
            query.put("ContactGroupId", request.contactGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactGroup"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert contact group.</p>
     * 
     * @param request DeleteContactGroupRequest
     * @return DeleteContactGroupResponse
     */
    public DeleteContactGroupResponse deleteContactGroup(DeleteContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactGroupWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDispatchRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDispatchRuleResponse
     */
    public DeleteDispatchRuleResponse deleteDispatchRuleWithOptions(DeleteDispatchRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDispatchRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDispatchRuleResponse());
    }

    /**
     * @param request DeleteDispatchRuleRequest
     * @return DeleteDispatchRuleResponse
     */
    public DeleteDispatchRuleResponse deleteDispatchRule(DeleteDispatchRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDispatchRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete custom jobs for the environment.</p>
     * 
     * @param request DeleteEnvCustomJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvCustomJobResponse
     */
    public DeleteEnvCustomJobResponse deleteEnvCustomJobWithOptions(DeleteEnvCustomJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customJobName)) {
            query.put("CustomJobName", request.customJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvCustomJob"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvCustomJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete custom jobs for the environment.</p>
     * 
     * @param request DeleteEnvCustomJobRequest
     * @return DeleteEnvCustomJobResponse
     */
    public DeleteEnvCustomJobResponse deleteEnvCustomJob(DeleteEnvCustomJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnvCustomJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the environment PodMonitor.</p>
     * 
     * @param request DeleteEnvPodMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvPodMonitorResponse
     */
    public DeleteEnvPodMonitorResponse deleteEnvPodMonitorWithOptions(DeleteEnvPodMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podMonitorName)) {
            query.put("PodMonitorName", request.podMonitorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvPodMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvPodMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the environment PodMonitor.</p>
     * 
     * @param request DeleteEnvPodMonitorRequest
     * @return DeleteEnvPodMonitorResponse
     */
    public DeleteEnvPodMonitorResponse deleteEnvPodMonitor(DeleteEnvPodMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnvPodMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the environment ServiceMonitor.</p>
     * 
     * @param request DeleteEnvServiceMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvServiceMonitorResponse
     */
    public DeleteEnvServiceMonitorResponse deleteEnvServiceMonitorWithOptions(DeleteEnvServiceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMonitorName)) {
            query.put("ServiceMonitorName", request.serviceMonitorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvServiceMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvServiceMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the environment ServiceMonitor.</p>
     * 
     * @param request DeleteEnvServiceMonitorRequest
     * @return DeleteEnvServiceMonitorResponse
     */
    public DeleteEnvServiceMonitorResponse deleteEnvServiceMonitor(DeleteEnvServiceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnvServiceMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an environment instance.</p>
     * 
     * @param request DeleteEnvironmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironmentWithOptions(DeleteEnvironmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletePromInstance)) {
            query.put("DeletePromInstance", request.deletePromInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironment"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an environment instance.</p>
     * 
     * @param request DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnvironmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除feature信息</p>
     * 
     * @param request DeleteEnvironmentFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvironmentFeatureResponse
     */
    public DeleteEnvironmentFeatureResponse deleteEnvironmentFeatureWithOptions(DeleteEnvironmentFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironmentFeature"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除feature信息</p>
     * 
     * @param request DeleteEnvironmentFeatureRequest
     * @return DeleteEnvironmentFeatureResponse
     */
    public DeleteEnvironmentFeatureResponse deleteEnvironmentFeature(DeleteEnvironmentFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnvironmentFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an EventBridge integration that is used to push notifications.</p>
     * 
     * @param request DeleteEventBridgeIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventBridgeIntegrationResponse
     */
    public DeleteEventBridgeIntegrationResponse deleteEventBridgeIntegrationWithOptions(DeleteEventBridgeIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventBridgeIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventBridgeIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an EventBridge integration that is used to push notifications.</p>
     * 
     * @param request DeleteEventBridgeIntegrationRequest
     * @return DeleteEventBridgeIntegrationResponse
     */
    public DeleteEventBridgeIntegrationResponse deleteEventBridgeIntegration(DeleteEventBridgeIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventBridgeIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes Grafana dashboard resources from a cluster monitored by Prometheus Service.</p>
     * 
     * @param request DeleteGrafanaResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGrafanaResourceResponse
     */
    public DeleteGrafanaResourceResponse deleteGrafanaResourceWithOptions(DeleteGrafanaResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGrafanaResource"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGrafanaResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes Grafana dashboard resources from a cluster monitored by Prometheus Service.</p>
     * 
     * @param request DeleteGrafanaResourceRequest
     * @return DeleteGrafanaResourceResponse
     */
    public DeleteGrafanaResourceResponse deleteGrafanaResource(DeleteGrafanaResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGrafanaResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放工作区</p>
     * 
     * @param request DeleteGrafanaWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGrafanaWorkspaceResponse
     */
    public DeleteGrafanaWorkspaceResponse deleteGrafanaWorkspaceWithOptions(DeleteGrafanaWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceId)) {
            query.put("GrafanaWorkspaceId", request.grafanaWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGrafanaWorkspace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGrafanaWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放工作区</p>
     * 
     * @param request DeleteGrafanaWorkspaceRequest
     * @return DeleteGrafanaWorkspaceResponse
     */
    public DeleteGrafanaWorkspaceResponse deleteGrafanaWorkspace(DeleteGrafanaWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGrafanaWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an instant messaging (IM) chatbot.</p>
     * 
     * @param request DeleteIMRobotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIMRobotResponse
     */
    public DeleteIMRobotResponse deleteIMRobotWithOptions(DeleteIMRobotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            query.put("RobotId", request.robotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIMRobot"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIMRobotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an instant messaging (IM) chatbot.</p>
     * 
     * @param request DeleteIMRobotRequest
     * @return DeleteIMRobotResponse
     */
    public DeleteIMRobotResponse deleteIMRobot(DeleteIMRobotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIMRobotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes collection rules from an integration.</p>
     * 
     * @deprecated OpenAPI DeleteIntegration is deprecated, please use ARMS::2019-08-08::DeleteAddonRelease instead.
     * 
     * @param request DeleteIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIntegrationResponse
     */
    @Deprecated
    // Deprecated
    public DeleteIntegrationResponse deleteIntegrationWithOptions(DeleteIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integration)) {
            query.put("Integration", request.integration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes collection rules from an integration.</p>
     * 
     * @deprecated OpenAPI DeleteIntegration is deprecated, please use ARMS::2019-08-08::DeleteAddonRelease instead.
     * 
     * @param request DeleteIntegrationRequest
     * @return DeleteIntegrationResponse
     */
    @Deprecated
    // Deprecated
    public DeleteIntegrationResponse deleteIntegration(DeleteIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert integration.</p>
     * 
     * @param request DeleteIntegrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIntegrationsResponse
     */
    public DeleteIntegrationsResponse deleteIntegrationsWithOptions(DeleteIntegrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIntegrations"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIntegrationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert integration.</p>
     * 
     * @param request DeleteIntegrationsRequest
     * @return DeleteIntegrationsResponse
     */
    public DeleteIntegrationsResponse deleteIntegrations(DeleteIntegrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIntegrationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the notification policy was deleted successfully. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The notification policy was deleted successfully.</li>
     * <li><code>false</code>: The notification policy failed to be deleted.</li>
     * </ul>
     * 
     * @param request DeleteNotificationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNotificationPolicyResponse
     */
    public DeleteNotificationPolicyResponse deleteNotificationPolicyWithOptions(DeleteNotificationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNotificationPolicy"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNotificationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the notification policy was deleted successfully. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The notification policy was deleted successfully.</li>
     * <li><code>false</code>: The notification policy failed to be deleted.</li>
     * </ul>
     * 
     * @param request DeleteNotificationPolicyRequest
     * @return DeleteNotificationPolicyResponse
     */
    public DeleteNotificationPolicyResponse deleteNotificationPolicy(DeleteNotificationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNotificationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.</p>
     * 
     * @param request DeletePrometheusAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusAlertRuleResponse
     */
    public DeletePrometheusAlertRuleResponse deletePrometheusAlertRuleWithOptions(DeletePrometheusAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.</p>
     * 
     * @param request DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     */
    public DeletePrometheusAlertRuleResponse deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrometheusAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a global aggregation instance from Prometheus Service.</p>
     * 
     * @param request DeletePrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusGlobalViewResponse
     */
    public DeletePrometheusGlobalViewResponse deletePrometheusGlobalViewWithOptions(DeletePrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalViewClusterId)) {
            query.put("GlobalViewClusterId", request.globalViewClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a global aggregation instance from Prometheus Service.</p>
     * 
     * @param request DeletePrometheusGlobalViewRequest
     * @return DeletePrometheusGlobalViewResponse
     */
    public DeletePrometheusGlobalViewResponse deletePrometheusGlobalView(DeletePrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an exporter from a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request DeletePrometheusIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusIntegrationResponse
     */
    public DeletePrometheusIntegrationResponse deletePrometheusIntegrationWithOptions(DeletePrometheusIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            query.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an exporter from a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request DeletePrometheusIntegrationRequest
     * @return DeletePrometheusIntegrationResponse
     */
    public DeletePrometheusIntegrationResponse deletePrometheusIntegration(DeletePrometheusIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrometheusIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request DeletePrometheusMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusMonitoringResponse
     */
    public DeletePrometheusMonitoringResponse deletePrometheusMonitoringWithOptions(DeletePrometheusMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitoringName)) {
            query.put("MonitoringName", request.monitoringName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusMonitoring"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request DeletePrometheusMonitoringRequest
     * @return DeletePrometheusMonitoringResponse
     */
    public DeletePrometheusMonitoringResponse deletePrometheusMonitoring(DeletePrometheusMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrometheusMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more remote write configuration items from a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request DeletePrometheusRemoteWriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusRemoteWriteResponse
     */
    public DeletePrometheusRemoteWriteResponse deletePrometheusRemoteWriteWithOptions(DeletePrometheusRemoteWriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteWriteNames)) {
            query.put("RemoteWriteNames", request.remoteWriteNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusRemoteWrite"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusRemoteWriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more remote write configuration items from a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request DeletePrometheusRemoteWriteRequest
     * @return DeletePrometheusRemoteWriteResponse
     */
    public DeletePrometheusRemoteWriteResponse deletePrometheusRemoteWrite(DeletePrometheusRemoteWriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrometheusRemoteWriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Browser Monitoring task.</p>
     * 
     * @param request DeleteRetcodeAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRetcodeAppResponse
     */
    public DeleteRetcodeAppResponse deleteRetcodeAppWithOptions(DeleteRetcodeAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRetcodeApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRetcodeAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Browser Monitoring task.</p>
     * 
     * @param request DeleteRetcodeAppRequest
     * @return DeleteRetcodeAppResponse
     */
    public DeleteRetcodeAppResponse deleteRetcodeApp(DeleteRetcodeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRetcodeAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除前端监控应用</p>
     * 
     * @param request DeleteRumAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRumAppResponse
     */
    public DeleteRumAppResponse deleteRumAppWithOptions(DeleteRumAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroup)) {
            query.put("AppGroup", request.appGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRumApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRumAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除前端监控应用</p>
     * 
     * @param request DeleteRumAppRequest
     * @return DeleteRumAppResponse
     */
    public DeleteRumAppResponse deleteRumApp(DeleteRumAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRumAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除前端监控在oss中的文件</p>
     * 
     * @param request DeleteRumUploadFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRumUploadFileResponse
     */
    public DeleteRumUploadFileResponse deleteRumUploadFileWithOptions(DeleteRumUploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRumUploadFile"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRumUploadFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除前端监控在oss中的文件</p>
     * 
     * @param request DeleteRumUploadFileRequest
     * @return DeleteRumUploadFileResponse
     */
    public DeleteRumUploadFileResponse deleteRumUploadFile(DeleteRumUploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRumUploadFileWithOptions(request, runtime);
    }

    /**
     * @param request DeleteScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScenarioResponse
     */
    public DeleteScenarioResponse deleteScenarioWithOptions(DeleteScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScenario"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScenarioResponse());
    }

    /**
     * @param request DeleteScenarioRequest
     * @return DeleteScenarioResponse
     */
    public DeleteScenarioResponse deleteScenario(DeleteScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScenarioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the silence policy.</p>
     * 
     * @param request DeleteSilencePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSilencePolicyResponse
     */
    public DeleteSilencePolicyResponse deleteSilencePolicyWithOptions(DeleteSilencePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSilencePolicy"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSilencePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the silence policy.</p>
     * 
     * @param request DeleteSilencePolicyRequest
     * @return DeleteSilencePolicyResponse
     */
    public DeleteSilencePolicyResponse deleteSilencePolicy(DeleteSilencePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSilencePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除SourceMap</p>
     * 
     * @param tmpReq DeleteSourceMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSourceMapResponse
     */
    public DeleteSourceMapResponse deleteSourceMapWithOptions(DeleteSourceMapRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSourceMapShrinkRequest request = new DeleteSourceMapShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fidList)) {
            request.fidListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fidList, "FidList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fidListShrink)) {
            query.put("FidList", request.fidListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSourceMap"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSourceMapResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除SourceMap</p>
     * 
     * @param request DeleteSourceMapRequest
     * @return DeleteSourceMapResponse
     */
    public DeleteSourceMapResponse deleteSourceMap(DeleteSourceMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSourceMapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除云拨测任务</p>
     * 
     * @param request DeleteSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSyntheticTaskResponse
     */
    public DeleteSyntheticTaskResponse deleteSyntheticTaskWithOptions(DeleteSyntheticTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除云拨测任务</p>
     * 
     * @param request DeleteSyntheticTaskRequest
     * @return DeleteSyntheticTaskResponse
     */
    public DeleteSyntheticTaskResponse deleteSyntheticTask(DeleteSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled synthetic monitoring task.</p>
     * 
     * @param request DeleteTimingSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTimingSyntheticTaskResponse
     */
    public DeleteTimingSyntheticTaskResponse deleteTimingSyntheticTaskWithOptions(DeleteTimingSyntheticTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTimingSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTimingSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled synthetic monitoring task.</p>
     * 
     * @param request DeleteTimingSyntheticTaskRequest
     * @return DeleteTimingSyntheticTaskResponse
     */
    public DeleteTimingSyntheticTaskResponse deleteTimingSyntheticTask(DeleteTimingSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTimingSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application based on a specified process identifier (PID) and application type.</p>
     * 
     * @param tmpReq DeleteTraceAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTraceAppResponse
     */
    public DeleteTraceAppResponse deleteTraceAppWithOptions(DeleteTraceAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTraceAppShrinkRequest request = new DeleteTraceAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteReason)) {
            request.deleteReasonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteReason, "DeleteReason", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteReasonShrink)) {
            query.put("DeleteReason", request.deleteReasonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTraceApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTraceAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application based on a specified process identifier (PID) and application type.</p>
     * 
     * @param request DeleteTraceAppRequest
     * @return DeleteTraceAppResponse
     */
    public DeleteTraceAppResponse deleteTraceApp(DeleteTraceAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTraceAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a webhook alert contact.</p>
     * 
     * @param request DeleteWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebhookContactResponse
     */
    public DeleteWebhookContactResponse deleteWebhookContactWithOptions(DeleteWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.webhookId)) {
            query.put("WebhookId", request.webhookId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebhookContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a webhook alert contact.</p>
     * 
     * @param request DeleteWebhookContactRequest
     * @return DeleteWebhookContactResponse
     */
    public DeleteWebhookContactResponse deleteWebhookContact(DeleteWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebhookContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the release information of an add-on by name.</p>
     * 
     * @param request DescribeAddonReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddonReleaseResponse
     */
    public DescribeAddonReleaseResponse describeAddonReleaseWithOptions(DescribeAddonReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            query.put("ReleaseName", request.releaseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddonRelease"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddonReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the release information of an add-on by name.</p>
     * 
     * @param request DescribeAddonReleaseRequest
     * @return DescribeAddonReleaseResponse
     */
    public DescribeAddonReleaseResponse describeAddonRelease(DescribeAddonReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddonReleaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an alert contact group.</p>
     * 
     * @param request DescribeContactGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContactGroupsResponse
     */
    public DescribeContactGroupsResponse describeContactGroupsWithOptions(DescribeContactGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDetail)) {
            query.put("IsDetail", request.isDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContactGroups"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContactGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an alert contact group.</p>
     * 
     * @param request DescribeContactGroupsRequest
     * @return DescribeContactGroupsResponse
     */
    public DescribeContactGroupsResponse describeContactGroups(DescribeContactGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert contacts.</p>
     * 
     * @param request DescribeContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContactsResponse
     */
    public DescribeContactsResponse describeContactsWithOptions(DescribeContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContacts"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert contacts.</p>
     * 
     * @param request DescribeContactsRequest
     * @return DescribeContactsResponse
     */
    public DescribeContactsResponse describeContacts(DescribeContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a dispatch policy.</p>
     * 
     * @param request DescribeDispatchRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDispatchRuleResponse
     */
    public DescribeDispatchRuleResponse describeDispatchRuleWithOptions(DescribeDispatchRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDispatchRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDispatchRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a dispatch policy.</p>
     * 
     * @param request DescribeDispatchRuleRequest
     * @return DescribeDispatchRuleResponse
     */
    public DescribeDispatchRuleResponse describeDispatchRule(DescribeDispatchRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDispatchRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom job for an environment.</p>
     * 
     * @param request DescribeEnvCustomJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnvCustomJobResponse
     */
    public DescribeEnvCustomJobResponse describeEnvCustomJobWithOptions(DescribeEnvCustomJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customJobName)) {
            query.put("CustomJobName", request.customJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptYaml)) {
            query.put("EncryptYaml", request.encryptYaml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnvCustomJob"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnvCustomJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom job for an environment.</p>
     * 
     * @param request DescribeEnvCustomJobRequest
     * @return DescribeEnvCustomJobResponse
     */
    public DescribeEnvCustomJobResponse describeEnvCustomJob(DescribeEnvCustomJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnvCustomJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PodMonitor details of an environment.</p>
     * 
     * @param request DescribeEnvPodMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnvPodMonitorResponse
     */
    public DescribeEnvPodMonitorResponse describeEnvPodMonitorWithOptions(DescribeEnvPodMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podMonitorName)) {
            query.put("PodMonitorName", request.podMonitorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnvPodMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnvPodMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PodMonitor details of an environment.</p>
     * 
     * @param request DescribeEnvPodMonitorRequest
     * @return DescribeEnvPodMonitorResponse
     */
    public DescribeEnvPodMonitorResponse describeEnvPodMonitor(DescribeEnvPodMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnvPodMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ServiceMonitor details of an environment.</p>
     * 
     * @param request DescribeEnvServiceMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnvServiceMonitorResponse
     */
    public DescribeEnvServiceMonitorResponse describeEnvServiceMonitorWithOptions(DescribeEnvServiceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMonitorName)) {
            query.put("ServiceMonitorName", request.serviceMonitorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnvServiceMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnvServiceMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ServiceMonitor details of an environment.</p>
     * 
     * @param request DescribeEnvServiceMonitorRequest
     * @return DescribeEnvServiceMonitorResponse
     */
    public DescribeEnvServiceMonitorResponse describeEnvServiceMonitor(DescribeEnvServiceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnvServiceMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an environment.</p>
     * 
     * @param request DescribeEnvironmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnvironmentResponse
     */
    public DescribeEnvironmentResponse describeEnvironmentWithOptions(DescribeEnvironmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnvironment"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an environment.</p>
     * 
     * @param request DescribeEnvironmentRequest
     * @return DescribeEnvironmentResponse
     */
    public DescribeEnvironmentResponse describeEnvironment(DescribeEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnvironmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a feature.</p>
     * 
     * @param request DescribeEnvironmentFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnvironmentFeatureResponse
     */
    public DescribeEnvironmentFeatureResponse describeEnvironmentFeatureWithOptions(DescribeEnvironmentFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnvironmentFeature"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnvironmentFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a feature.</p>
     * 
     * @param request DescribeEnvironmentFeatureRequest
     * @return DescribeEnvironmentFeatureResponse
     */
    public DescribeEnvironmentFeatureResponse describeEnvironmentFeature(DescribeEnvironmentFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnvironmentFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of IM chatbots.</p>
     * 
     * @param request DescribeIMRobotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIMRobotsResponse
     */
    public DescribeIMRobotsResponse describeIMRobotsWithOptions(DescribeIMRobotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotIds)) {
            query.put("RobotIds", request.robotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotName)) {
            query.put("RobotName", request.robotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIMRobots"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIMRobotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of IM chatbots.</p>
     * 
     * @param request DescribeIMRobotsRequest
     * @return DescribeIMRobotsResponse
     */
    public DescribeIMRobotsResponse describeIMRobots(DescribeIMRobotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIMRobotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an alert rule of Prometheus Service.</p>
     * 
     * @param request DescribePrometheusAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrometheusAlertRuleResponse
     */
    public DescribePrometheusAlertRuleResponse describePrometheusAlertRuleWithOptions(DescribePrometheusAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrometheusAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrometheusAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an alert rule of Prometheus Service.</p>
     * 
     * @param request DescribePrometheusAlertRuleRequest
     * @return DescribePrometheusAlertRuleResponse
     */
    public DescribePrometheusAlertRuleResponse describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrometheusAlertRuleWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTraceLicenseKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTraceLicenseKeyResponse
     */
    public DescribeTraceLicenseKeyResponse describeTraceLicenseKeyWithOptions(DescribeTraceLicenseKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTraceLicenseKey"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTraceLicenseKeyResponse());
    }

    /**
     * @param request DescribeTraceLicenseKeyRequest
     * @return DescribeTraceLicenseKeyResponse
     */
    public DescribeTraceLicenseKeyResponse describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTraceLicenseKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of webhook alert contacts.</p>
     * 
     * @param request DescribeWebhookContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebhookContactsResponse
     */
    public DescribeWebhookContactsResponse describeWebhookContactsWithOptions(DescribeWebhookContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWebhookContacts"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebhookContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of webhook alert contacts.</p>
     * 
     * @param request DescribeWebhookContactsRequest
     * @return DescribeWebhookContactsResponse
     */
    public DescribeWebhookContactsResponse describeWebhookContacts(DescribeWebhookContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWebhookContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启指标</p>
     * 
     * @param request EnableMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableMetricResponse
     */
    public EnableMetricResponse enableMetricWithOptions(EnableMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dropMetric)) {
            query.put("DropMetric", request.dropMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableMetric"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启指标</p>
     * 
     * @param request EnableMetricRequest
     * @return EnableMetricResponse
     */
    public EnableMetricResponse enableMetric(EnableMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the download URL of the Application Real-Time Monitoring Service (ARMS) agent.</p>
     * 
     * @param request GetAgentDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentDownloadUrlResponse
     */
    public GetAgentDownloadUrlResponse getAgentDownloadUrlWithOptions(GetAgentDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentDownloadUrl"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the download URL of the Application Real-Time Monitoring Service (ARMS) agent.</p>
     * 
     * @param request GetAgentDownloadUrlRequest
     * @return GetAgentDownloadUrlResponse
     */
    public GetAgentDownloadUrlResponse getAgentDownloadUrl(GetAgentDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert rules.</p>
     * 
     * @param request GetAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertRulesResponse
     */
    public GetAlertRulesResponse getAlertRulesWithOptions(GetAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertIds)) {
            query.put("AlertIds", request.alertIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertNames)) {
            query.put("AlertNames", request.alertNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertStatus)) {
            query.put("AlertStatus", request.alertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            query.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertRules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert rules.</p>
     * 
     * @param request GetAlertRulesRequest
     * @return GetAlertRulesResponse
     */
    public GetAlertRulesResponse getAlertRules(GetAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the API operations of application monitoring by page.</p>
     * 
     * @param request GetAppApiByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppApiByPageResponse
     */
    public GetAppApiByPageResponse getAppApiByPageWithOptions(GetAppApiByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalMills)) {
            query.put("IntervalMills", request.intervalMills);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PId)) {
            query.put("PId", request.PId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppApiByPage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppApiByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the API operations of application monitoring by page.</p>
     * 
     * @param request GetAppApiByPageRequest
     * @return GetAppApiByPageResponse
     */
    public GetAppApiByPageResponse getAppApiByPage(GetAppApiByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppApiByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用各个实例的JVM配置信息</p>
     * 
     * @param request GetAppJVMConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppJVMConfigResponse
     */
    public GetAppJVMConfigResponse getAppJVMConfigWithOptions(GetAppJVMConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppJVMConfig"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppJVMConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用各个实例的JVM配置信息</p>
     * 
     * @param request GetAppJVMConfigRequest
     * @return GetAppJVMConfigResponse
     */
    public GetAppJVMConfigResponse getAppJVMConfig(GetAppJVMConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppJVMConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the authentication token for remote read and write over the Internet.</p>
     * 
     * @param request GetAuthTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthTokenResponse
     */
    public GetAuthTokenResponse getAuthTokenWithOptions(GetAuthTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthToken"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the authentication token for remote read and write over the Internet.</p>
     * 
     * @param request GetAuthTokenRequest
     * @return GetAuthTokenResponse
     */
    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the read and write URLs of a CloudMonitor instance, such as Pushgateway and Grafana URLs.</p>
     * 
     * @deprecated OpenAPI GetCloudClusterAllUrl is deprecated, please use ARMS::2019-08-08::GetRemoteWriteUrl instead.
     * 
     * @param request GetCloudClusterAllUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudClusterAllUrlResponse
     */
    @Deprecated
    // Deprecated
    public GetCloudClusterAllUrlResponse getCloudClusterAllUrlWithOptions(GetCloudClusterAllUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudClusterAllUrl"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudClusterAllUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the read and write URLs of a CloudMonitor instance, such as Pushgateway and Grafana URLs.</p>
     * 
     * @deprecated OpenAPI GetCloudClusterAllUrl is deprecated, please use ARMS::2019-08-08::GetRemoteWriteUrl instead.
     * 
     * @param request GetCloudClusterAllUrlRequest
     * @return GetCloudClusterAllUrlResponse
     */
    @Deprecated
    // Deprecated
    public GetCloudClusterAllUrlResponse getCloudClusterAllUrl(GetCloudClusterAllUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCloudClusterAllUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains all the URLs of a cluster, including remote read and write URLs, Pushgateway URLs, and Grafana URLs.</p>
     * 
     * @param request GetClusterAllUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterAllUrlResponse
     */
    public GetClusterAllUrlResponse getClusterAllUrlWithOptions(GetClusterAllUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterAllUrl"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterAllUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains all the URLs of a cluster, including remote read and write URLs, Pushgateway URLs, and Grafana URLs.</p>
     * 
     * @param request GetClusterAllUrlRequest
     * @return GetClusterAllUrlResponse
     */
    public GetClusterAllUrlResponse getClusterAllUrl(GetClusterAllUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterAllUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取商业化状态</p>
     * 
     * @param request GetCommercialStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCommercialStatusResponse
     */
    public GetCommercialStatusResponse getCommercialStatusWithOptions(GetCommercialStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommercialStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommercialStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取商业化状态</p>
     * 
     * @param request GetCommercialStatusRequest
     * @return GetCommercialStatusResponse
     */
    public GetCommercialStatusResponse getCommercialStatus(GetCommercialStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommercialStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Explore feature of Grafana.</p>
     * 
     * @param request GetExploreUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExploreUrlResponse
     */
    public GetExploreUrlResponse getExploreUrlWithOptions(GetExploreUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExploreUrl"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExploreUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Explore feature of Grafana.</p>
     * 
     * @param request GetExploreUrlRequest
     * @return GetExploreUrlResponse
     */
    public GetExploreUrlResponse getExploreUrl(GetExploreUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExploreUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定工作区</p>
     * 
     * @param request GetGrafanaWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGrafanaWorkspaceResponse
     */
    public GetGrafanaWorkspaceResponse getGrafanaWorkspaceWithOptions(GetGrafanaWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceId)) {
            query.put("GrafanaWorkspaceId", request.grafanaWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGrafanaWorkspace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGrafanaWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定工作区</p>
     * 
     * @param request GetGrafanaWorkspaceRequest
     * @return GetGrafanaWorkspaceResponse
     */
    public GetGrafanaWorkspaceResponse getGrafanaWorkspace(GetGrafanaWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGrafanaWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Prometheus中是否已接入某种Integration类型</p>
     * 
     * @deprecated OpenAPI GetIntegrationState is deprecated, please use ARMS::2019-08-08::DescribeAddonRelease instead.
     * 
     * @param request GetIntegrationStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntegrationStateResponse
     */
    @Deprecated
    // Deprecated
    public GetIntegrationStateResponse getIntegrationStateWithOptions(GetIntegrationStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integration)) {
            query.put("Integration", request.integration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntegrationState"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntegrationStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Prometheus中是否已接入某种Integration类型</p>
     * 
     * @deprecated OpenAPI GetIntegrationState is deprecated, please use ARMS::2019-08-08::DescribeAddonRelease instead.
     * 
     * @param request GetIntegrationStateRequest
     * @return GetIntegrationStateResponse
     */
    @Deprecated
    // Deprecated
    public GetIntegrationStateResponse getIntegrationState(GetIntegrationStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIntegrationStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a Prometheus instance of a serverless Kubernetes (ASK) cluster or Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request GetManagedPrometheusStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManagedPrometheusStatusResponse
     */
    public GetManagedPrometheusStatusResponse getManagedPrometheusStatusWithOptions(GetManagedPrometheusStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManagedPrometheusStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagedPrometheusStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a Prometheus instance of a serverless Kubernetes (ASK) cluster or Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request GetManagedPrometheusStatusRequest
     * @return GetManagedPrometheusStatusResponse
     */
    public GetManagedPrometheusStatusResponse getManagedPrometheusStatus(GetManagedPrometheusStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManagedPrometheusStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more traces.</p>
     * 
     * @param request GetMultipleTraceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultipleTraceResponse
     */
    public GetMultipleTraceResponse getMultipleTraceWithOptions(GetMultipleTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIDs)) {
            query.put("TraceIDs", request.traceIDs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultipleTrace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultipleTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more traces.</p>
     * 
     * @param request GetMultipleTraceRequest
     * @return GetMultipleTraceResponse
     */
    public GetMultipleTraceResponse getMultipleTrace(GetMultipleTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultipleTraceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a scheduling policy.</p>
     * 
     * @param request GetOnCallSchedulesDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOnCallSchedulesDetailResponse
     */
    public GetOnCallSchedulesDetailResponse getOnCallSchedulesDetailWithOptions(GetOnCallSchedulesDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnCallSchedulesDetail"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnCallSchedulesDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a scheduling policy.</p>
     * 
     * @param request GetOnCallSchedulesDetailRequest
     * @return GetOnCallSchedulesDetailResponse
     */
    public GetOnCallSchedulesDetailResponse getOnCallSchedulesDetail(GetOnCallSchedulesDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOnCallSchedulesDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>None.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token required for integrating Prometheus Service.</p>
     * 
     * @param request GetPrometheusApiTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusApiTokenResponse
     */
    public GetPrometheusApiTokenResponse getPrometheusApiTokenWithOptions(GetPrometheusApiTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusApiToken"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusApiTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>None.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token required for integrating Prometheus Service.</p>
     * 
     * @param request GetPrometheusApiTokenRequest
     * @return GetPrometheusApiTokenResponse
     */
    public GetPrometheusApiTokenResponse getPrometheusApiToken(GetPrometheusApiTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusApiTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a global aggregation instance.</p>
     * 
     * @param request GetPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusGlobalViewResponse
     */
    public GetPrometheusGlobalViewResponse getPrometheusGlobalViewWithOptions(GetPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalViewClusterId)) {
            query.put("GlobalViewClusterId", request.globalViewClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a global aggregation instance.</p>
     * 
     * @param request GetPrometheusGlobalViewRequest
     * @return GetPrometheusGlobalViewResponse
     */
    public GetPrometheusGlobalViewResponse getPrometheusGlobalView(GetPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Prometheus instance.</p>
     * 
     * @param request GetPrometheusInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusInstanceResponse
     */
    public GetPrometheusInstanceResponse getPrometheusInstanceWithOptions(GetPrometheusInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusInstance"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Prometheus instance.</p>
     * 
     * @param request GetPrometheusInstanceRequest
     * @return GetPrometheusInstanceResponse
     */
    public GetPrometheusInstanceResponse getPrometheusInstance(GetPrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an exporter that is integrated into a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request GetPrometheusIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusIntegrationResponse
     */
    public GetPrometheusIntegrationResponse getPrometheusIntegrationWithOptions(GetPrometheusIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            query.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an exporter that is integrated into a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request GetPrometheusIntegrationRequest
     * @return GetPrometheusIntegrationResponse
     */
    public GetPrometheusIntegrationResponse getPrometheusIntegration(GetPrometheusIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request GetPrometheusMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusMonitoringResponse
     */
    public GetPrometheusMonitoringResponse getPrometheusMonitoringWithOptions(GetPrometheusMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitoringName)) {
            query.put("MonitoringName", request.monitoringName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusMonitoring"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request GetPrometheusMonitoringRequest
     * @return GetPrometheusMonitoringResponse
     */
    public GetPrometheusMonitoringResponse getPrometheusMonitoring(GetPrometheusMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a remote write configuration item of a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request GetPrometheusRemoteWriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusRemoteWriteResponse
     */
    public GetPrometheusRemoteWriteResponse getPrometheusRemoteWriteWithOptions(GetPrometheusRemoteWriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteWriteName)) {
            query.put("RemoteWriteName", request.remoteWriteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusRemoteWrite"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusRemoteWriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a remote write configuration item of a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request GetPrometheusRemoteWriteRequest
     * @return GetPrometheusRemoteWriteResponse
     */
    public GetPrometheusRemoteWriteResponse getPrometheusRemoteWrite(GetPrometheusRemoteWriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusRemoteWriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the recording rule of a cluster.</p>
     * 
     * @param request GetRecordingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordingRuleResponse
     */
    public GetRecordingRuleResponse getRecordingRuleWithOptions(GetRecordingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecordingRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the recording rule of a cluster.</p>
     * 
     * @param request GetRecordingRuleRequest
     * @return GetRecordingRuleResponse
     */
    public GetRecordingRuleResponse getRecordingRule(GetRecordingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the objects of a Browser Monitoring application by process identifier (PID).</p>
     * 
     * @param request GetRetcodeAppByPidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRetcodeAppByPidResponse
     */
    public GetRetcodeAppByPidResponse getRetcodeAppByPidWithOptions(GetRetcodeAppByPidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRetcodeAppByPid"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRetcodeAppByPidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the objects of a Browser Monitoring application by process identifier (PID).</p>
     * 
     * @param request GetRetcodeAppByPidRequest
     * @return GetRetcodeAppByPidResponse
     */
    public GetRetcodeAppByPidResponse getRetcodeAppByPid(GetRetcodeAppByPidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRetcodeAppByPidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>传入SLS查询语句，查询出前端监控数据</p>
     * 
     * @param request GetRetcodeDataByQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRetcodeDataByQueryResponse
     */
    public GetRetcodeDataByQueryResponse getRetcodeDataByQueryWithOptions(GetRetcodeDataByQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRetcodeDataByQuery"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRetcodeDataByQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>传入SLS查询语句，查询出前端监控数据</p>
     * 
     * @param request GetRetcodeDataByQueryRequest
     * @return GetRetcodeDataByQueryResponse
     */
    public GetRetcodeDataByQueryResponse getRetcodeDataByQuery(GetRetcodeDataByQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRetcodeDataByQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控应用SLS存储的详细信息</p>
     * 
     * @param request GetRetcodeLogstoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRetcodeLogstoreResponse
     */
    public GetRetcodeLogstoreResponse getRetcodeLogstoreWithOptions(GetRetcodeLogstoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRetcodeLogstore"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRetcodeLogstoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控应用SLS存储的详细信息</p>
     * 
     * @param request GetRetcodeLogstoreRequest
     * @return GetRetcodeLogstoreResponse
     */
    public GetRetcodeLogstoreResponse getRetcodeLogstore(GetRetcodeLogstoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRetcodeLogstoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logon-free URL of a Browser Monitoring application.</p>
     * 
     * @param request GetRetcodeShareUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRetcodeShareUrlResponse
     */
    public GetRetcodeShareUrlResponse getRetcodeShareUrlWithOptions(GetRetcodeShareUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRetcodeShareUrl"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRetcodeShareUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logon-free URL of a Browser Monitoring application.</p>
     * 
     * @param request GetRetcodeShareUrlRequest
     * @return GetRetcodeShareUrlResponse
     */
    public GetRetcodeShareUrlResponse getRetcodeShareUrl(GetRetcodeShareUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRetcodeShareUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控单个应用信息</p>
     * 
     * @param request GetRumAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRumAppInfoResponse
     */
    public GetRumAppInfoResponse getRumAppInfoWithOptions(GetRumAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroup)) {
            query.put("AppGroup", request.appGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRumAppInfo"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRumAppInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控单个应用信息</p>
     * 
     * @param request GetRumAppInfoRequest
     * @return GetRumAppInfoResponse
     */
    public GetRumAppInfoResponse getRumAppInfo(GetRumAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRumAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控应用列表信息</p>
     * 
     * @param request GetRumAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRumAppsResponse
     */
    public GetRumAppsResponse getRumAppsWithOptions(GetRumAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroup)) {
            query.put("AppGroup", request.appGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRumApps"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRumAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控应用列表信息</p>
     * 
     * @param request GetRumAppsRequest
     * @return GetRumAppsResponse
     */
    public GetRumAppsResponse getRumApps(GetRumAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRumAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控应用sql查询分页结果</p>
     * 
     * @param request GetRumDataForPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRumDataForPageResponse
     */
    public GetRumDataForPageResponse getRumDataForPageWithOptions(GetRumDataForPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroup)) {
            query.put("AppGroup", request.appGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRumDataForPage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRumDataForPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控应用sql查询分页结果</p>
     * 
     * @param request GetRumDataForPageRequest
     * @return GetRumDataForPageResponse
     */
    public GetRumDataForPageResponse getRumDataForPage(GetRumDataForPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRumDataForPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RUM异常堆栈</p>
     * 
     * @param request GetRumExceptionStackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRumExceptionStackResponse
     */
    public GetRumExceptionStackResponse getRumExceptionStackWithOptions(GetRumExceptionStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exceptionBinaryImages)) {
            query.put("ExceptionBinaryImages", request.exceptionBinaryImages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exceptionStack)) {
            query.put("ExceptionStack", request.exceptionStack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exceptionThreadId)) {
            query.put("ExceptionThreadId", request.exceptionThreadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcemapType)) {
            query.put("SourcemapType", request.sourcemapType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRumExceptionStack"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRumExceptionStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RUM异常堆栈</p>
     * 
     * @param request GetRumExceptionStackRequest
     * @return GetRumExceptionStackResponse
     */
    public GetRumExceptionStackResponse getRumExceptionStack(GetRumExceptionStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRumExceptionStackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控在oss中文件</p>
     * 
     * @param request GetRumUploadFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRumUploadFilesResponse
     */
    public GetRumUploadFilesResponse getRumUploadFilesWithOptions(GetRumUploadFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRumUploadFiles"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRumUploadFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控在oss中文件</p>
     * 
     * @param request GetRumUploadFilesRequest
     * @return GetRumUploadFilesResponse
     */
    public GetRumUploadFilesResponse getRumUploadFiles(GetRumUploadFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRumUploadFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控上传SourceMap的具体信息</p>
     * 
     * @param request GetSourceMapInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSourceMapInfoResponse
     */
    public GetSourceMapInfoResponse getSourceMapInfoWithOptions(GetSourceMapInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascendingSequence)) {
            query.put("AscendingSequence", request.ascendingSequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ID)) {
            query.put("ID", request.ID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            query.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSourceMapInfo"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSourceMapInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端监控上传SourceMap的具体信息</p>
     * 
     * @param request GetSourceMapInfoRequest
     * @return GetSourceMapInfoResponse
     */
    public GetSourceMapInfoResponse getSourceMapInfo(GetSourceMapInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSourceMapInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a method stack.</p>
     * 
     * @param request GetStackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStackResponse
     */
    public GetStackResponse getStackWithOptions(GetStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpcID)) {
            query.put("RpcID", request.rpcID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceID)) {
            query.put("TraceID", request.traceID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStack"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a method stack.</p>
     * 
     * @param request GetStackRequest
     * @return GetStackResponse
     */
    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains detection points.</p>
     * 
     * @param tmpReq GetSyntheticMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSyntheticMonitorsResponse
     */
    public GetSyntheticMonitorsResponse getSyntheticMonitorsWithOptions(GetSyntheticMonitorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSyntheticMonitorsShrinkRequest request = new GetSyntheticMonitorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSyntheticMonitors"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSyntheticMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains detection points.</p>
     * 
     * @param request GetSyntheticMonitorsRequest
     * @return GetSyntheticMonitorsResponse
     */
    public GetSyntheticMonitorsResponse getSyntheticMonitors(GetSyntheticMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSyntheticMonitorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个拨测任务的详情</p>
     * 
     * @param request GetSyntheticTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSyntheticTaskDetailResponse
     */
    public GetSyntheticTaskDetailResponse getSyntheticTaskDetailWithOptions(GetSyntheticTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSyntheticTaskDetail"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSyntheticTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个拨测任务的详情</p>
     * 
     * @param request GetSyntheticTaskDetailRequest
     * @return GetSyntheticTaskDetailResponse
     */
    public GetSyntheticTaskDetailResponse getSyntheticTaskDetail(GetSyntheticTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSyntheticTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取拨测任务列表</p>
     * 
     * @param request GetSyntheticTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSyntheticTaskListResponse
     */
    public GetSyntheticTaskListResponse getSyntheticTaskListWithOptions(GetSyntheticTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSyntheticTaskList"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSyntheticTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取拨测任务列表</p>
     * 
     * @param request GetSyntheticTaskListRequest
     * @return GetSyntheticTaskListResponse
     */
    public GetSyntheticTaskListResponse getSyntheticTaskList(GetSyntheticTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSyntheticTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取拨测任务的监测点信息</p>
     * 
     * @param request GetSyntheticTaskMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSyntheticTaskMonitorsResponse
     */
    public GetSyntheticTaskMonitorsResponse getSyntheticTaskMonitorsWithOptions(GetSyntheticTaskMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSyntheticTaskMonitors"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSyntheticTaskMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取拨测任务的监测点信息</p>
     * 
     * @param request GetSyntheticTaskMonitorsRequest
     * @return GetSyntheticTaskMonitorsResponse
     */
    public GetSyntheticTaskMonitorsResponse getSyntheticTaskMonitors(GetSyntheticTaskMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSyntheticTaskMonitorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a synthetic monitoring task.</p>
     * 
     * @param request GetTimingSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTimingSyntheticTaskResponse
     */
    public GetTimingSyntheticTaskResponse getTimingSyntheticTaskWithOptions(GetTimingSyntheticTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTimingSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTimingSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a synthetic monitoring task.</p>
     * 
     * @param request GetTimingSyntheticTaskRequest
     * @return GetTimingSyntheticTaskResponse
     */
    public GetTimingSyntheticTaskResponse getTimingSyntheticTask(GetTimingSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTimingSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must use Application Real-Time Monitoring Service (ARMS) SDK for Java V2.7.24.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a trace.</p>
     * 
     * @param request GetTraceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTraceResponse
     */
    public GetTraceResponse getTraceWithOptions(GetTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceID)) {
            query.put("TraceID", request.traceID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTraceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must use Application Real-Time Monitoring Service (ARMS) SDK for Java V2.7.24.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a trace.</p>
     * 
     * @param request GetTraceRequest
     * @return GetTraceResponse
     */
    public GetTraceResponse getTrace(GetTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTraceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application monitoring task.</p>
     * 
     * @param request GetTraceAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTraceAppResponse
     */
    public GetTraceAppResponse getTraceAppWithOptions(GetTraceAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTraceApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTraceAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application monitoring task.</p>
     * 
     * @param request GetTraceAppRequest
     * @return GetTraceAppResponse
     */
    public GetTraceAppResponse getTraceApp(GetTraceAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTraceAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用监控自定义配置</p>
     * 
     * @param request GetTraceAppConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTraceAppConfigResponse
     */
    public GetTraceAppConfigResponse getTraceAppConfigWithOptions(GetTraceAppConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTraceAppConfig"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTraceAppConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用监控自定义配置</p>
     * 
     * @param request GetTraceAppConfigRequest
     * @return GetTraceAppConfigResponse
     */
    public GetTraceAppConfigResponse getTraceAppConfig(GetTraceAppConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTraceAppConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call the <strong>ImportAppAlertRules</strong> operation to import only the alert rules that are generated by Application Real-Time Monitoring Service (ARMS) for application monitoring and browser monitoring. This operation cannot be used to import custom alert rules, alert rules for Prometheus monitoring, or default emergency alert rules.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert rule based on an alert template.</p>
     * 
     * @param request ImportAppAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportAppAlertRulesResponse
     */
    public ImportAppAlertRulesResponse importAppAlertRulesWithOptions(ImportAppAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupIds)) {
            query.put("ContactGroupIds", request.contactGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoStart)) {
            query.put("IsAutoStart", request.isAutoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pids)) {
            query.put("Pids", request.pids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templageAlertConfig)) {
            query.put("TemplageAlertConfig", request.templageAlertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateAlertId)) {
            query.put("TemplateAlertId", request.templateAlertId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportAppAlertRules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportAppAlertRulesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call the <strong>ImportAppAlertRules</strong> operation to import only the alert rules that are generated by Application Real-Time Monitoring Service (ARMS) for application monitoring and browser monitoring. This operation cannot be used to import custom alert rules, alert rules for Prometheus monitoring, or default emergency alert rules.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert rule based on an alert template.</p>
     * 
     * @param request ImportAppAlertRulesRequest
     * @return ImportAppAlertRulesResponse
     */
    public ImportAppAlertRulesResponse importAppAlertRules(ImportAppAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importAppAlertRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initializes an environment instance.</p>
     * 
     * @param request InitEnvironmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitEnvironmentResponse
     */
    public InitEnvironmentResponse initEnvironmentWithOptions(InitEnvironmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createAuthToken)) {
            query.put("CreateAuthToken", request.createAuthToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managedType)) {
            query.put("ManagedType", request.managedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitEnvironment"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initializes an environment instance.</p>
     * 
     * @param request InitEnvironmentRequest
     * @return InitEnvironmentResponse
     */
    public InitEnvironmentResponse initEnvironment(InitEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initEnvironmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs an add-on.</p>
     * 
     * @param request InstallAddonRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAddonResponse
     */
    public InstallAddonResponse installAddonWithOptions(InstallAddonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonVersion)) {
            query.put("AddonVersion", request.addonVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            query.put("ReleaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.values)) {
            query.put("Values", request.values);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAddon"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAddonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Installs an add-on.</p>
     * 
     * @param request InstallAddonRequest
     * @return InstallAddonResponse
     */
    public InstallAddonResponse installAddon(InstallAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installAddonWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs the cms-exporter collector.</p>
     * 
     * @deprecated OpenAPI InstallCmsExporter is deprecated, please use ARMS::2019-08-08::InstallAddon instead.
     * 
     * @param request InstallCmsExporterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallCmsExporterResponse
     */
    @Deprecated
    // Deprecated
    public InstallCmsExporterResponse installCmsExporterWithOptions(InstallCmsExporterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmsArgs)) {
            query.put("CmsArgs", request.cmsArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directArgs)) {
            query.put("DirectArgs", request.directArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTag)) {
            query.put("EnableTag", request.enableTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallCmsExporter"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallCmsExporterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Installs the cms-exporter collector.</p>
     * 
     * @deprecated OpenAPI InstallCmsExporter is deprecated, please use ARMS::2019-08-08::InstallAddon instead.
     * 
     * @param request InstallCmsExporterRequest
     * @return InstallCmsExporterResponse
     */
    @Deprecated
    // Deprecated
    public InstallCmsExporterResponse installCmsExporter(InstallCmsExporterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installCmsExporterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs a feature.</p>
     * 
     * @param request InstallEnvironmentFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallEnvironmentFeatureResponse
     */
    public InstallEnvironmentFeatureResponse installEnvironmentFeatureWithOptions(InstallEnvironmentFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureVersion)) {
            query.put("FeatureVersion", request.featureVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallEnvironmentFeature"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallEnvironmentFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Installs a feature.</p>
     * 
     * @param request InstallEnvironmentFeatureRequest
     * @return InstallEnvironmentFeatureResponse
     */
    public InstallEnvironmentFeatureResponse installEnvironmentFeature(InstallEnvironmentFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installEnvironmentFeatureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you call the operation to monitor an ASK cluster or an ECS instance, a Prometheus agent is installed in the ASK cluster or ECS instance. Make sure that the ASK cluster or ECS instance has no Prometheus agent installed in advance.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Prometheus instance to monitor a serverless Kubernetes (ASK) cluster or an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request InstallManagedPrometheusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallManagedPrometheusResponse
     */
    public InstallManagedPrometheusResponse installManagedPrometheusWithOptions(InstallManagedPrometheusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaInstanceId)) {
            query.put("GrafanaInstanceId", request.grafanaInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubeConfig)) {
            query.put("KubeConfig", request.kubeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("action", "InstallManagedPrometheus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallManagedPrometheusResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you call the operation to monitor an ASK cluster or an ECS instance, a Prometheus agent is installed in the ASK cluster or ECS instance. Make sure that the ASK cluster or ECS instance has no Prometheus agent installed in advance.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Prometheus instance to monitor a serverless Kubernetes (ASK) cluster or an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request InstallManagedPrometheusRequest
     * @return InstallManagedPrometheusResponse
     */
    public InstallManagedPrometheusResponse installManagedPrometheus(InstallManagedPrometheusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installManagedPrometheusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alerts that have been triggered.</p>
     * 
     * @param request ListActivatedAlertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActivatedAlertsResponse
     */
    public ListActivatedAlertsResponse listActivatedAlertsWithOptions(ListActivatedAlertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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
            new TeaPair("action", "ListActivatedAlerts"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActivatedAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alerts that have been triggered.</p>
     * 
     * @param request ListActivatedAlertsRequest
     * @return ListActivatedAlertsResponse
     */
    public ListActivatedAlertsResponse listActivatedAlerts(ListActivatedAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActivatedAlertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the Addons installed in the environment.</p>
     * 
     * @param request ListAddonReleasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonReleasesResponse
     */
    public ListAddonReleasesResponse listAddonReleasesWithOptions(ListAddonReleasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("AddonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddonReleases"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonReleasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the Addons installed in the environment.</p>
     * 
     * @param request ListAddonReleasesRequest
     * @return ListAddonReleasesResponse
     */
    public ListAddonReleasesResponse listAddonReleases(ListAddonReleasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAddonReleasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List of access center products.</p>
     * 
     * @param request ListAddonsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddonsWithOptions(ListAddonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regexp)) {
            query.put("Regexp", request.regexp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddons"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List of access center products.</p>
     * 
     * @param request ListAddonsRequest
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddons(ListAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAddonsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries historical alert events.</p>
     * 
     * @param request ListAlertEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertEventsResponse
     */
    public ListAlertEventsResponse listAlertEventsWithOptions(ListAlertEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            query.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchingConditions)) {
            query.put("MatchingConditions", request.matchingConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showNotificationPolicies)) {
            query.put("ShowNotificationPolicies", request.showNotificationPolicies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertEvents"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries historical alert events.</p>
     * 
     * @param request ListAlertEventsRequest
     * @return ListAlertEventsResponse
     */
    public ListAlertEventsResponse listAlertEvents(ListAlertEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert sending history.</p>
     * 
     * @param request ListAlertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlertsWithOptions(ListAlertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            query.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatchRuleId)) {
            query.put("DispatchRuleId", request.dispatchRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            query.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showActivities)) {
            query.put("ShowActivities", request.showActivities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showEvents)) {
            query.put("ShowEvents", request.showEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlerts"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert sending history.</p>
     * 
     * @param request ListAlertsRequest
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all Grafana dashboards in a specified region.</p>
     * 
     * @param request ListClusterFromGrafanaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterFromGrafanaResponse
     */
    public ListClusterFromGrafanaResponse listClusterFromGrafanaWithOptions(ListClusterFromGrafanaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterFromGrafana"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterFromGrafanaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all Grafana dashboards in a specified region.</p>
     * 
     * @param request ListClusterFromGrafanaRequest
     * @return ListClusterFromGrafanaResponse
     */
    public ListClusterFromGrafanaResponse listClusterFromGrafana(ListClusterFromGrafanaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterFromGrafanaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Cms安装信息</p>
     * 
     * @deprecated OpenAPI ListCmsInstances is deprecated, please use ARMS::2019-08-08::ListEnvironmentAddons instead.
     * 
     * @param request ListCmsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCmsInstancesResponse
     */
    @Deprecated
    // Deprecated
    public ListCmsInstancesResponse listCmsInstancesWithOptions(ListCmsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeFilter)) {
            query.put("TypeFilter", request.typeFilter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCmsInstances"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCmsInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Cms安装信息</p>
     * 
     * @deprecated OpenAPI ListCmsInstances is deprecated, please use ARMS::2019-08-08::ListEnvironmentAddons instead.
     * 
     * @param request ListCmsInstancesRequest
     * @return ListCmsInstancesResponse
     */
    @Deprecated
    // Deprecated
    public ListCmsInstancesResponse listCmsInstances(ListCmsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCmsInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>None.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Grafana dashboards of a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @param request ListDashboardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardsResponse
     */
    public ListDashboardsResponse listDashboardsWithOptions(ListDashboardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardName)) {
            query.put("DashboardName", request.dashboardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recreateSwitch)) {
            query.put("RecreateSwitch", request.recreateSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboards"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDashboardsResponse());
    }

    /**
     * <b>description</b> :
     * <p>None.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Grafana dashboards of a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @param request ListDashboardsRequest
     * @return ListDashboardsResponse
     */
    public ListDashboardsResponse listDashboards(ListDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDashboardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uses Loki data sources and other data sources to create a dashboard in Prometheus Service.</p>
     * 
     * @param request ListDashboardsByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardsByNameResponse
     */
    public ListDashboardsByNameResponse listDashboardsByNameWithOptions(ListDashboardsByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashBoardName)) {
            query.put("DashBoardName", request.dashBoardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashBoardVersion)) {
            query.put("DashBoardVersion", request.dashBoardVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyQuery)) {
            query.put("OnlyQuery", request.onlyQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboardsByName"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDashboardsByNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uses Loki data sources and other data sources to create a dashboard in Prometheus Service.</p>
     * 
     * @param request ListDashboardsByNameRequest
     * @return ListDashboardsByNameResponse
     */
    public ListDashboardsByNameResponse listDashboardsByName(ListDashboardsByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDashboardsByNameWithOptions(request, runtime);
    }

    /**
     * @param request ListDispatchRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDispatchRuleResponse
     */
    public ListDispatchRuleResponse listDispatchRuleWithOptions(ListDispatchRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.system)) {
            query.put("System", request.system);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDispatchRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDispatchRuleResponse());
    }

    /**
     * @param request ListDispatchRuleRequest
     * @return ListDispatchRuleResponse
     */
    public ListDispatchRuleResponse listDispatchRule(ListDispatchRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDispatchRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom jobs of an environment.</p>
     * 
     * @param request ListEnvCustomJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvCustomJobsResponse
     */
    public ListEnvCustomJobsResponse listEnvCustomJobsWithOptions(ListEnvCustomJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptYaml)) {
            query.put("EncryptYaml", request.encryptYaml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvCustomJobs"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvCustomJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom jobs of an environment.</p>
     * 
     * @param request ListEnvCustomJobsRequest
     * @return ListEnvCustomJobsResponse
     */
    public ListEnvCustomJobsResponse listEnvCustomJobs(ListEnvCustomJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvCustomJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PodMonitors of an environment.</p>
     * 
     * @param request ListEnvPodMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvPodMonitorsResponse
     */
    public ListEnvPodMonitorsResponse listEnvPodMonitorsWithOptions(ListEnvPodMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvPodMonitors"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvPodMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PodMonitors of an environment.</p>
     * 
     * @param request ListEnvPodMonitorsRequest
     * @return ListEnvPodMonitorsResponse
     */
    public ListEnvPodMonitorsResponse listEnvPodMonitors(ListEnvPodMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvPodMonitorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ServiceMonitors of an environment.</p>
     * 
     * @param request ListEnvServiceMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvServiceMonitorsResponse
     */
    public ListEnvServiceMonitorsResponse listEnvServiceMonitorsWithOptions(ListEnvServiceMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvServiceMonitors"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvServiceMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ServiceMonitors of an environment.</p>
     * 
     * @param request ListEnvServiceMonitorsRequest
     * @return ListEnvServiceMonitorsResponse
     */
    public ListEnvServiceMonitorsResponse listEnvServiceMonitors(ListEnvServiceMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvServiceMonitorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a dashboard of an environment instance.</p>
     * 
     * @param request ListEnvironmentDashboardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvironmentDashboardsResponse
     */
    public ListEnvironmentDashboardsResponse listEnvironmentDashboardsWithOptions(ListEnvironmentDashboardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("AddonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironmentDashboards"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentDashboardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a dashboard of an environment instance.</p>
     * 
     * @param request ListEnvironmentDashboardsRequest
     * @return ListEnvironmentDashboardsResponse
     */
    public ListEnvironmentDashboardsResponse listEnvironmentDashboards(ListEnvironmentDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvironmentDashboardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>环境的feature列表</p>
     * 
     * @param request ListEnvironmentFeaturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvironmentFeaturesResponse
     */
    public ListEnvironmentFeaturesResponse listEnvironmentFeaturesWithOptions(ListEnvironmentFeaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironmentFeatures"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentFeaturesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>环境的feature列表</p>
     * 
     * @param request ListEnvironmentFeaturesRequest
     * @return ListEnvironmentFeaturesResponse
     */
    public ListEnvironmentFeaturesResponse listEnvironmentFeatures(ListEnvironmentFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvironmentFeaturesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries environments.</p>
     * 
     * @param tmpReq ListEnvironmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironmentsWithOptions(ListEnvironmentsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListEnvironmentsShrinkRequest request = new ListEnvironmentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("AddonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindResourceId)) {
            query.put("BindResourceId", request.bindResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentType)) {
            query.put("EnvironmentType", request.environmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feePackage)) {
            query.put("FeePackage", request.feePackage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironments"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries environments.</p>
     * 
     * @param request ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvironmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an escalation policy.</p>
     * 
     * @param request ListEscalationPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEscalationPoliciesResponse
     */
    public ListEscalationPoliciesResponse listEscalationPoliciesWithOptions(ListEscalationPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEscalationPolicies"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEscalationPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an escalation policy.</p>
     * 
     * @param request ListEscalationPoliciesRequest
     * @return ListEscalationPoliciesResponse
     */
    public ListEscalationPoliciesResponse listEscalationPolicies(ListEscalationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEscalationPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries EventBridge integrations that are used to push notifications.</p>
     * 
     * @param request ListEventBridgeIntegrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventBridgeIntegrationsResponse
     */
    public ListEventBridgeIntegrationsResponse listEventBridgeIntegrationsWithOptions(ListEventBridgeIntegrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventBridgeIntegrations"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventBridgeIntegrationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries EventBridge integrations that are used to push notifications.</p>
     * 
     * @param request ListEventBridgeIntegrationsRequest
     * @return ListEventBridgeIntegrationsResponse
     */
    public ListEventBridgeIntegrationsResponse listEventBridgeIntegrations(ListEventBridgeIntegrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventBridgeIntegrationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定工作区列表</p>
     * 
     * @param tmpReq ListGrafanaWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGrafanaWorkspaceResponse
     */
    public ListGrafanaWorkspaceResponse listGrafanaWorkspaceWithOptions(ListGrafanaWorkspaceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGrafanaWorkspaceShrinkRequest request = new ListGrafanaWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGrafanaWorkspace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrafanaWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定工作区列表</p>
     * 
     * @param request ListGrafanaWorkspaceRequest
     * @return ListGrafanaWorkspaceResponse
     */
    public ListGrafanaWorkspaceResponse listGrafanaWorkspace(ListGrafanaWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGrafanaWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the abnormal Insights events within a specified period of time.</p>
     * 
     * @param request ListInsightsEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInsightsEventsResponse
     */
    public ListInsightsEventsResponse listInsightsEventsWithOptions(ListInsightsEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insightsTypes)) {
            query.put("InsightsTypes", request.insightsTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInsightsEvents"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInsightsEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the abnormal Insights events within a specified period of time.</p>
     * 
     * @param request ListInsightsEventsRequest
     * @return ListInsightsEventsResponse
     */
    public ListInsightsEventsResponse listInsightsEvents(ListInsightsEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInsightsEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListIntegration</p>
     * 
     * @param request ListIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationResponse
     */
    public ListIntegrationResponse listIntegrationWithOptions(ListIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListIntegration</p>
     * 
     * @param request ListIntegrationRequest
     * @return ListIntegrationResponse
     */
    public ListIntegrationResponse listIntegration(ListIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries notification policies based on specified conditions.</p>
     * 
     * @param request ListNotificationPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNotificationPoliciesResponse
     */
    public ListNotificationPoliciesResponse listNotificationPoliciesWithOptions(ListNotificationPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directedMode)) {
            query.put("DirectedMode", request.directedMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDetail)) {
            query.put("IsDetail", request.isDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNotificationPolicies"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNotificationPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries notification policies based on specified conditions.</p>
     * 
     * @param request ListNotificationPoliciesRequest
     * @return ListNotificationPoliciesResponse
     */
    public ListNotificationPoliciesResponse listNotificationPolicies(ListNotificationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNotificationPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a scheduling policy.</p>
     * 
     * @param request ListOnCallSchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOnCallSchedulesResponse
     */
    public ListOnCallSchedulesResponse listOnCallSchedulesWithOptions(ListOnCallSchedulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnCallSchedules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnCallSchedulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a scheduling policy.</p>
     * 
     * @param request ListOnCallSchedulesRequest
     * @return ListOnCallSchedulesResponse
     */
    public ListOnCallSchedulesResponse listOnCallSchedules(ListOnCallSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOnCallSchedulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The value of the annotation.</p>
     * 
     * @param request ListPrometheusAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusAlertRulesResponse
     */
    public ListPrometheusAlertRulesResponse listPrometheusAlertRulesWithOptions(ListPrometheusAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpressions)) {
            query.put("MatchExpressions", request.matchExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusAlertRules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusAlertRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The value of the annotation.</p>
     * 
     * @param request ListPrometheusAlertRulesRequest
     * @return ListPrometheusAlertRulesResponse
     */
    public ListPrometheusAlertRulesResponse listPrometheusAlertRules(ListPrometheusAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusAlertRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The available memory on node {{ $labels.instance }} is less than 10%. Available memory: {{ $value }}%</p>
     * 
     * @param request ListPrometheusAlertTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusAlertTemplatesResponse
     */
    public ListPrometheusAlertTemplatesResponse listPrometheusAlertTemplatesWithOptions(ListPrometheusAlertTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusAlertTemplates"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusAlertTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The available memory on node {{ $labels.instance }} is less than 10%. Available memory: {{ $value }}%</p>
     * 
     * @param request ListPrometheusAlertTemplatesRequest
     * @return ListPrometheusAlertTemplatesResponse
     */
    public ListPrometheusAlertTemplatesResponse listPrometheusAlertTemplates(ListPrometheusAlertTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusAlertTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取账号下聚合实例列表</p>
     * 
     * @param request ListPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusGlobalViewResponse
     */
    public ListPrometheusGlobalViewResponse listPrometheusGlobalViewWithOptions(ListPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取账号下聚合实例列表</p>
     * 
     * @param request ListPrometheusGlobalViewRequest
     * @return ListPrometheusGlobalViewResponse
     */
    public ListPrometheusGlobalViewResponse listPrometheusGlobalView(ListPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Prometheus instances by tag and resource group.</p>
     * 
     * @param request ListPrometheusInstanceByTagAndResourceGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusInstanceByTagAndResourceGroupIdResponse
     */
    public ListPrometheusInstanceByTagAndResourceGroupIdResponse listPrometheusInstanceByTagAndResourceGroupIdWithOptions(ListPrometheusInstanceByTagAndResourceGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusInstanceByTagAndResourceGroupId"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusInstanceByTagAndResourceGroupIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Prometheus instances by tag and resource group.</p>
     * 
     * @param request ListPrometheusInstanceByTagAndResourceGroupIdRequest
     * @return ListPrometheusInstanceByTagAndResourceGroupIdResponse
     */
    public ListPrometheusInstanceByTagAndResourceGroupIdResponse listPrometheusInstanceByTagAndResourceGroupId(ListPrometheusInstanceByTagAndResourceGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusInstanceByTagAndResourceGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all Prometheus instances in a region.</p>
     * 
     * @param request ListPrometheusInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusInstancesResponse
     */
    public ListPrometheusInstancesResponse listPrometheusInstancesWithOptions(ListPrometheusInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showGlobalView)) {
            query.put("ShowGlobalView", request.showGlobalView);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusInstances"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all Prometheus instances in a region.</p>
     * 
     * @param request ListPrometheusInstancesRequest
     * @return ListPrometheusInstancesResponse
     */
    public ListPrometheusInstancesResponse listPrometheusInstances(ListPrometheusInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of exporters that are integrated into a Prometheus instance. Only aliyun-cs and ecs instances are supported.</p>
     * 
     * @param request ListPrometheusIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusIntegrationResponse
     */
    public ListPrometheusIntegrationResponse listPrometheusIntegrationWithOptions(ListPrometheusIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            query.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of exporters that are integrated into a Prometheus instance. Only aliyun-cs and ecs instances are supported.</p>
     * 
     * @param request ListPrometheusIntegrationRequest
     * @return ListPrometheusIntegrationResponse
     */
    public ListPrometheusIntegrationResponse listPrometheusIntegration(ListPrometheusIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request ListPrometheusMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusMonitoringResponse
     */
    public ListPrometheusMonitoringResponse listPrometheusMonitoringWithOptions(ListPrometheusMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusMonitoring"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request ListPrometheusMonitoringRequest
     * @return ListPrometheusMonitoringResponse
     */
    public ListPrometheusMonitoringResponse listPrometheusMonitoring(ListPrometheusMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the remote write configuration items of a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request ListPrometheusRemoteWritesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusRemoteWritesResponse
     */
    public ListPrometheusRemoteWritesResponse listPrometheusRemoteWritesWithOptions(ListPrometheusRemoteWritesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusRemoteWrites"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusRemoteWritesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the remote write configuration items of a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request ListPrometheusRemoteWritesRequest
     * @return ListPrometheusRemoteWritesResponse
     */
    public ListPrometheusRemoteWritesResponse listPrometheusRemoteWrites(ListPrometheusRemoteWritesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrometheusRemoteWritesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the Browser Monitoring tasks in a region.</p>
     * 
     * @param request ListRetcodeAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRetcodeAppsResponse
     */
    public ListRetcodeAppsResponse listRetcodeAppsWithOptions(ListRetcodeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRetcodeApps"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRetcodeAppsResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the Browser Monitoring tasks in a region.</p>
     * 
     * @param request ListRetcodeAppsRequest
     * @return ListRetcodeAppsResponse
     */
    public ListRetcodeAppsResponse listRetcodeApps(ListRetcodeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRetcodeAppsWithOptions(request, runtime);
    }

    /**
     * @param request ListScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScenarioResponse
     */
    public ListScenarioResponse listScenarioWithOptions(ListScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            query.put("Scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScenario"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScenarioResponse());
    }

    /**
     * @param request ListScenarioRequest
     * @return ListScenarioResponse
     */
    public ListScenarioResponse listScenario(ListScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScenarioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a silence policy list.</p>
     * 
     * @param request ListSilencePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSilencePoliciesResponse
     */
    public ListSilencePoliciesResponse listSilencePoliciesWithOptions(ListSilencePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isDetail)) {
            query.put("IsDetail", request.isDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSilencePolicies"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSilencePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a silence policy list.</p>
     * 
     * @param request ListSilencePoliciesRequest
     * @return ListSilencePoliciesResponse
     */
    public ListSilencePoliciesResponse listSilencePolicies(ListSilencePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSilencePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询拨测明细列表</p>
     * 
     * @param tmpReq ListSyntheticDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSyntheticDetailResponse
     */
    public ListSyntheticDetailResponse listSyntheticDetailWithOptions(ListSyntheticDetailRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSyntheticDetailShrinkRequest request = new ListSyntheticDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advancedFilters)) {
            request.advancedFiltersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advancedFilters, "AdvancedFilters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.exactFilters)) {
            request.exactFiltersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.exactFilters, "ExactFilters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSyntheticDetail"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSyntheticDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询拨测明细列表</p>
     * 
     * @param request ListSyntheticDetailRequest
     * @return ListSyntheticDetailResponse
     */
    public ListSyntheticDetailResponse listSyntheticDetail(ListSyntheticDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSyntheticDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scheduled synthetic monitoring tasks.</p>
     * 
     * @param tmpReq ListTimingSyntheticTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTimingSyntheticTasksResponse
     */
    public ListTimingSyntheticTasksResponse listTimingSyntheticTasksWithOptions(ListTimingSyntheticTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTimingSyntheticTasksShrinkRequest request = new ListTimingSyntheticTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.search)) {
            request.searchShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.search, "Search", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTimingSyntheticTasks"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTimingSyntheticTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scheduled synthetic monitoring tasks.</p>
     * 
     * @param request ListTimingSyntheticTasksRequest
     * @return ListTimingSyntheticTasksResponse
     */
    public ListTimingSyntheticTasksResponse listTimingSyntheticTasks(ListTimingSyntheticTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTimingSyntheticTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all Application Monitoring tasks in a specified region.</p>
     * 
     * @param request ListTraceAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTraceAppsResponse
     */
    public ListTraceAppsResponse listTraceAppsWithOptions(ListTraceAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTraceApps"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTraceAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all Application Monitoring tasks in a specified region.</p>
     * 
     * @param request ListTraceAppsRequest
     * @return ListTraceAppsResponse
     */
    public ListTraceAppsResponse listTraceApps(ListTraceAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTraceAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the recording rule of a Prometheus instance.</p>
     * 
     * @param request ManageGetRecordingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageGetRecordingRuleResponse
     */
    public ManageGetRecordingRuleResponse manageGetRecordingRuleWithOptions(ManageGetRecordingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUserId)) {
            query.put("QueryUserId", request.queryUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageGetRecordingRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageGetRecordingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the recording rule of a Prometheus instance.</p>
     * 
     * @param request ManageGetRecordingRuleRequest
     * @return ManageGetRecordingRuleResponse
     */
    public ManageGetRecordingRuleResponse manageGetRecordingRule(ManageGetRecordingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageGetRecordingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the recording rule of a Prometheus instance.</p>
     * 
     * @param request ManageRecordingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageRecordingRuleResponse
     */
    public ManageRecordingRuleResponse manageRecordingRuleWithOptions(ManageRecordingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUserId)) {
            query.put("QueryUserId", request.queryUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleYaml)) {
            query.put("RuleYaml", request.ruleYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageRecordingRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageRecordingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the recording rule of a Prometheus instance.</p>
     * 
     * @param request ManageRecordingRuleRequest
     * @return ManageRecordingRuleResponse
     */
    public ManageRecordingRuleResponse manageRecordingRule(ManageRecordingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageRecordingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns the service-linked role AliyunServiceRoleForARMS to Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request OpenArmsDefaultSLRRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenArmsDefaultSLRResponse
     */
    public OpenArmsDefaultSLRResponse openArmsDefaultSLRWithOptions(OpenArmsDefaultSLRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenArmsDefaultSLR"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenArmsDefaultSLRResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns the service-linked role AliyunServiceRoleForARMS to Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request OpenArmsDefaultSLRRequest
     * @return OpenArmsDefaultSLRResponse
     */
    public OpenArmsDefaultSLRResponse openArmsDefaultSLR(OpenArmsDefaultSLRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openArmsDefaultSLRWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <strong>OpenArmsServiceSecondVersion</strong> operation supports the following sub-service editions:</p>
     * <ul>
     * <li>Application Monitoring: Basic Edition</li>
     * <li>Browser Monitoring: Basic Edition</li>
     * <li>Synthetic Monitoring: Pro Edition (pay-as-you-go)</li>
     * <li>Prometheus Service: Pro Edition</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a specified pay-as-you-go sub-service of Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request OpenArmsServiceSecondVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenArmsServiceSecondVersionResponse
     */
    public OpenArmsServiceSecondVersionResponse openArmsServiceSecondVersionWithOptions(OpenArmsServiceSecondVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenArmsServiceSecondVersion"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenArmsServiceSecondVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <strong>OpenArmsServiceSecondVersion</strong> operation supports the following sub-service editions:</p>
     * <ul>
     * <li>Application Monitoring: Basic Edition</li>
     * <li>Browser Monitoring: Basic Edition</li>
     * <li>Synthetic Monitoring: Pro Edition (pay-as-you-go)</li>
     * <li>Prometheus Service: Pro Edition</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a specified pay-as-you-go sub-service of Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request OpenArmsServiceSecondVersionRequest
     * @return OpenArmsServiceSecondVersionResponse
     */
    public OpenArmsServiceSecondVersionResponse openArmsServiceSecondVersion(OpenArmsServiceSecondVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openArmsServiceSecondVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates a virtual cluster.</p>
     * 
     * @param request OpenVClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenVClusterResponse
     */
    public OpenVClusterResponse openVClusterWithOptions(OpenVClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recreateSwitch)) {
            query.put("RecreateSwitch", request.recreateSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenVCluster"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenVClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates a virtual cluster.</p>
     * 
     * @param request OpenVClusterRequest
     * @return OpenVClusterResponse
     */
    public OpenVClusterResponse openVCluster(OpenVClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openVClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the service-linked role AliyunServiceRoleForXtrace for Tracing Analysis.</p>
     * 
     * @param request OpenXtraceDefaultSLRRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenXtraceDefaultSLRResponse
     */
    public OpenXtraceDefaultSLRResponse openXtraceDefaultSLRWithOptions(OpenXtraceDefaultSLRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenXtraceDefaultSLR"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenXtraceDefaultSLRResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the service-linked role AliyunServiceRoleForXtrace for Tracing Analysis.</p>
     * 
     * @param request OpenXtraceDefaultSLRRequest
     * @return OpenXtraceDefaultSLRResponse
     */
    public OpenXtraceDefaultSLRResponse openXtraceDefaultSLR(OpenXtraceDefaultSLRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openXtraceDefaultSLRWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the encoding mapping content based on the metadata IDs and metadata type.</p>
     * 
     * @param request QueryAppMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAppMetadataResponse
     */
    public QueryAppMetadataResponse queryAppMetadataWithOptions(QueryAppMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppMetadata"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the encoding mapping content based on the metadata IDs and metadata type.</p>
     * 
     * @param request QueryAppMetadataRequest
     * @return QueryAppMetadataResponse
     */
    public QueryAppMetadataResponse queryAppMetadata(QueryAppMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppMetadataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用拓扑</p>
     * 
     * @param tmpReq QueryAppTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAppTopologyResponse
     */
    public QueryAppTopologyResponse queryAppTopologyWithOptions(QueryAppTopologyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryAppTopologyShrinkRequest request = new QueryAppTopologyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.db)) {
            query.put("Db", request.db);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersShrink)) {
            query.put("Filters", request.filtersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpc)) {
            query.put("Rpc", request.rpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppTopology"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppTopologyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用拓扑</p>
     * 
     * @param request QueryAppTopologyRequest
     * @return QueryAppTopologyResponse
     */
    public QueryAppTopologyResponse queryAppTopology(QueryAppTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppTopologyWithOptions(request, runtime);
    }

    /**
     * @param request QueryCommercialUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCommercialUsageResponse
     */
    public QueryCommercialUsageResponse queryCommercialUsageWithOptions(QueryCommercialUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedFilters)) {
            query.put("AdvancedFilters", request.advancedFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalInSec)) {
            query.put("IntervalInSec", request.intervalInSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measures)) {
            query.put("Measures", request.measures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommercialUsage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommercialUsageResponse());
    }

    /**
     * @param request QueryCommercialUsageRequest
     * @return QueryCommercialUsageResponse
     */
    public QueryCommercialUsageResponse queryCommercialUsage(QueryCommercialUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommercialUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an Application Monitoring metric or a Browser Monitoring metric.</p>
     * 
     * @param request QueryMetricByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMetricByPageResponse
     */
    public QueryMetricByPageResponse queryMetricByPageWithOptions(QueryMetricByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFilters)) {
            query.put("CustomFilters", request.customFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalInSec)) {
            query.put("IntervalInSec", request.intervalInSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measures)) {
            query.put("Measures", request.measures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMetricByPage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMetricByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an Application Monitoring metric or a Browser Monitoring metric.</p>
     * 
     * @param request QueryMetricByPageRequest
     * @return QueryMetricByPageResponse
     */
    public QueryMetricByPageResponse queryMetricByPage(QueryMetricByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMetricByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the Prometheus agent is installed on a cluster.</p>
     * 
     * @param request QueryPromInstallStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPromInstallStatusResponse
     */
    public QueryPromInstallStatusResponse queryPromInstallStatusWithOptions(QueryPromInstallStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPromInstallStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPromInstallStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the Prometheus agent is installed on a cluster.</p>
     * 
     * @param request QueryPromInstallStatusRequest
     * @return QueryPromInstallStatusResponse
     */
    public QueryPromInstallStatusResponse queryPromInstallStatus(QueryPromInstallStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPromInstallStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>QueryReleaseMetric </p>
     * 
     * @param request QueryReleaseMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReleaseMetricResponse
     */
    public QueryReleaseMetricResponse queryReleaseMetricWithOptions(QueryReleaseMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyUserId)) {
            query.put("ProxyUserId", request.proxyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseEndTime)) {
            query.put("ReleaseEndTime", request.releaseEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseStartTime)) {
            query.put("ReleaseStartTime", request.releaseStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReleaseMetric"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReleaseMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>QueryReleaseMetric </p>
     * 
     * @param request QueryReleaseMetricRequest
     * @return QueryReleaseMetricResponse
     */
    public QueryReleaseMetricResponse queryReleaseMetric(QueryReleaseMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReleaseMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes data sources from a global aggregation instance.</p>
     * 
     * @param request RemoveAliClusterIdsFromPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAliClusterIdsFromPrometheusGlobalViewResponse
     */
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponse removeAliClusterIdsFromPrometheusGlobalViewWithOptions(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            query.put("ClusterIds", request.clusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalViewClusterId)) {
            query.put("GlobalViewClusterId", request.globalViewClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAliClusterIdsFromPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAliClusterIdsFromPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes data sources from a global aggregation instance.</p>
     * 
     * @param request RemoveAliClusterIdsFromPrometheusGlobalViewRequest
     * @return RemoveAliClusterIdsFromPrometheusGlobalViewResponse
     */
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponse removeAliClusterIdsFromPrometheusGlobalView(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAliClusterIdsFromPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes custom data sources from a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request RemoveSourcesFromPrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSourcesFromPrometheusGlobalViewResponse
     */
    public RemoveSourcesFromPrometheusGlobalViewResponse removeSourcesFromPrometheusGlobalViewWithOptions(RemoveSourcesFromPrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalViewClusterId)) {
            query.put("GlobalViewClusterId", request.globalViewClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceNames)) {
            query.put("SourceNames", request.sourceNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSourcesFromPrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSourcesFromPrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes custom data sources from a global aggregation instance in Prometheus Service.</p>
     * 
     * @param request RemoveSourcesFromPrometheusGlobalViewRequest
     * @return RemoveSourcesFromPrometheusGlobalViewResponse
     */
    public RemoveSourcesFromPrometheusGlobalViewResponse removeSourcesFromPrometheusGlobalView(RemoveSourcesFromPrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSourcesFromPrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新启动 feature信息</p>
     * 
     * @param request RestartEnvironmentFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartEnvironmentFeatureResponse
     */
    public RestartEnvironmentFeatureResponse restartEnvironmentFeatureWithOptions(RestartEnvironmentFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartEnvironmentFeature"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartEnvironmentFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重新启动 feature信息</p>
     * 
     * @param request RestartEnvironmentFeatureRequest
     * @return RestartEnvironmentFeatureResponse
     */
    public RestartEnvironmentFeatureResponse restartEnvironmentFeature(RestartEnvironmentFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartEnvironmentFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the settings of Application Monitoring, such as trace sampling and agent switch settings.</p>
     * 
     * @param request SaveTraceAppConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTraceAppConfigResponse
     */
    public SaveTraceAppConfigResponse saveTraceAppConfigWithOptions(SaveTraceAppConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settings)) {
            query.put("Settings", request.settings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTraceAppConfig"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTraceAppConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the settings of Application Monitoring, such as trace sampling and agent switch settings.</p>
     * 
     * @param request SaveTraceAppConfigRequest
     * @return SaveTraceAppConfigResponse
     */
    public SaveTraceAppConfigResponse saveTraceAppConfig(SaveTraceAppConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTraceAppConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To query alert contacts, call the DescribeContacts operation provided by the new version of Alert Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert contacts.</p>
     * 
     * @param request SearchAlertContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAlertContactResponse
     */
    public SearchAlertContactResponse searchAlertContactWithOptions(SearchAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAlertContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAlertContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To query alert contacts, call the DescribeContacts operation provided by the new version of Alert Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert contacts.</p>
     * 
     * @param request SearchAlertContactRequest
     * @return SearchAlertContactResponse
     */
    public SearchAlertContactResponse searchAlertContact(SearchAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertContactWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The operation is no longer maintained. Call the DescribeContactGroups operation in the alert management module to query alert contact groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert contact groups.</p>
     * 
     * @param request SearchAlertContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAlertContactGroupResponse
     */
    public SearchAlertContactGroupResponse searchAlertContactGroupWithOptions(SearchAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupIds)) {
            query.put("ContactGroupIds", request.contactGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDetail)) {
            query.put("IsDetail", request.isDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAlertContactGroup"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAlertContactGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>The operation is no longer maintained. Call the DescribeContactGroups operation in the alert management module to query alert contact groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert contact groups.</p>
     * 
     * @param request SearchAlertContactGroupRequest
     * @return SearchAlertContactGroupResponse
     */
    public SearchAlertContactGroupResponse searchAlertContactGroup(SearchAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To query alert records, call the ListAlerts operation provided by the new version of Alert Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the alert records of an alert rule.</p>
     * 
     * @param request SearchAlertHistoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAlertHistoriesResponse
     */
    public SearchAlertHistoriesResponse searchAlertHistoriesWithOptions(SearchAlertHistoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            query.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAlertHistories"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAlertHistoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To query alert records, call the ListAlerts operation provided by the new version of Alert Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the alert records of an alert rule.</p>
     * 
     * @param request SearchAlertHistoriesRequest
     * @return SearchAlertHistoriesResponse
     */
    public SearchAlertHistoriesResponse searchAlertHistories(SearchAlertHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertHistoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The current operation is no longer maintained. You can call the GetAlertRules operation of Alert Management (New) to query existing alert rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert rules.</p>
     * 
     * @param request SearchAlertRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAlertRulesResponse
     */
    public SearchAlertRulesResponse searchAlertRulesWithOptions(SearchAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleId)) {
            query.put("AlertRuleId", request.alertRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemRegionId)) {
            query.put("SystemRegionId", request.systemRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAlertRules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAlertRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The current operation is no longer maintained. You can call the GetAlertRules operation of Alert Management (New) to query existing alert rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert rules.</p>
     * 
     * @param request SearchAlertRulesRequest
     * @return SearchAlertRulesResponse
     */
    public SearchAlertRulesResponse searchAlertRules(SearchAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Alert event records are different from alert notification records. Alert events are recorded every minute after an alert rule filters data. Alert events can be classified based on whether they are triggered or not. If a triggered event is not in the silence period, an alert notification is sent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert event records.</p>
     * 
     * @param request SearchEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchEventsResponse
     */
    public SearchEventsResponse searchEventsWithOptions(SearchEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            query.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTrigger)) {
            query.put("IsTrigger", request.isTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchEvents"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Alert event records are different from alert notification records. Alert events are recorded every minute after an alert rule filters data. Alert events can be classified based on whether they are triggered or not. If a triggered event is not in the silence period, an alert notification is sent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert event records.</p>
     * 
     * @param request SearchEventsRequest
     * @return SearchEventsResponse
     */
    public SearchEventsResponse searchEvents(SearchEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Browser Monitoring tasks by page.</p>
     * 
     * @param request SearchRetcodeAppByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchRetcodeAppByPageResponse
     */
    public SearchRetcodeAppByPageResponse searchRetcodeAppByPageWithOptions(SearchRetcodeAppByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retcodeAppId)) {
            query.put("RetcodeAppId", request.retcodeAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retcodeAppName)) {
            query.put("RetcodeAppName", request.retcodeAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchRetcodeAppByPage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchRetcodeAppByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Browser Monitoring tasks by page.</p>
     * 
     * @param request SearchRetcodeAppByPageRequest
     * @return SearchRetcodeAppByPageResponse
     */
    public SearchRetcodeAppByPageResponse searchRetcodeAppByPage(SearchRetcodeAppByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchRetcodeAppByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Application Monitoring tasks by application name.</p>
     * 
     * @param request SearchTraceAppByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTraceAppByNameResponse
     */
    public SearchTraceAppByNameResponse searchTraceAppByNameWithOptions(SearchTraceAppByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceAppName)) {
            query.put("TraceAppName", request.traceAppName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTraceAppByName"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTraceAppByNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Application Monitoring tasks by application name.</p>
     * 
     * @param request SearchTraceAppByNameRequest
     * @return SearchTraceAppByNameResponse
     */
    public SearchTraceAppByNameResponse searchTraceAppByName(SearchTraceAppByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTraceAppByNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Application Monitoring tasks by page.</p>
     * 
     * @param request SearchTraceAppByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTraceAppByPageResponse
     */
    public SearchTraceAppByPageResponse searchTraceAppByPageWithOptions(SearchTraceAppByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceAppName)) {
            query.put("TraceAppName", request.traceAppName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTraceAppByPage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTraceAppByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Application Monitoring tasks by page.</p>
     * 
     * @param request SearchTraceAppByPageRequest
     * @return SearchTraceAppByPageResponse
     */
    public SearchTraceAppByPageResponse searchTraceAppByPage(SearchTraceAppByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTraceAppByPageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>A maximum of 100 data entries can be returned each time this operation is called. If you want to query all existing traces, we recommend that you call the SearchTracesByPage operation. For more information, see <a href="https://help.aliyun.com/document_detail/175866.html">SearchTracesByPage</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries traces by time, application name, IP address, span name, and tag.</p>
     * 
     * @param request SearchTracesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTracesResponse
     */
    public SearchTracesResponse searchTracesWithOptions(SearchTracesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusionFilters)) {
            query.put("ExclusionFilters", request.exclusionFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDuration)) {
            query.put("MinDuration", request.minDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationName)) {
            query.put("OperationName", request.operationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIp)) {
            query.put("ServiceIp", request.serviceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTraces"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTracesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>A maximum of 100 data entries can be returned each time this operation is called. If you want to query all existing traces, we recommend that you call the SearchTracesByPage operation. For more information, see <a href="https://help.aliyun.com/document_detail/175866.html">SearchTracesByPage</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries traces by time, application name, IP address, span name, and tag.</p>
     * 
     * @param request SearchTracesRequest
     * @return SearchTracesResponse
     */
    public SearchTracesResponse searchTraces(SearchTracesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTracesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries traces by page. You can query traces by time range, application name, IP address, span name, or tag.</p>
     * 
     * @param request SearchTracesByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTracesByPageResponse
     */
    public SearchTracesByPageResponse searchTracesByPageWithOptions(SearchTracesByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusionFilters)) {
            query.put("ExclusionFilters", request.exclusionFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isError)) {
            query.put("IsError", request.isError);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDuration)) {
            query.put("MinDuration", request.minDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationName)) {
            query.put("OperationName", request.operationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIp)) {
            query.put("ServiceIp", request.serviceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTracesByPage"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTracesByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries traces by page. You can query traces by time range, application name, IP address, span name, or tag.</p>
     * 
     * @param request SearchTracesByPageRequest
     * @return SearchTracesByPageResponse
     */
    public SearchTracesByPageResponse searchTracesByPage(SearchTracesByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTracesByPageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you receive the text message, verify the mobile number as prompted. Before you can specify a mobile phone number in a notification policy, you must verify the mobile phone number.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a text message to an alert contact to verify the mobile number of the alert contact.</p>
     * 
     * @param request SendTTSVerifyLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendTTSVerifyLinkResponse
     */
    public SendTTSVerifyLinkResponse sendTTSVerifyLinkWithOptions(SendTTSVerifyLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTTSVerifyLink"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTTSVerifyLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you receive the text message, verify the mobile number as prompted. Before you can specify a mobile phone number in a notification policy, you must verify the mobile phone number.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a text message to an alert contact to verify the mobile number of the alert contact.</p>
     * 
     * @param request SendTTSVerifyLinkRequest
     * @return SendTTSVerifyLinkResponse
     */
    public SendTTSVerifyLinkResponse sendTTSVerifyLink(SendTTSVerifyLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendTTSVerifyLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Turns on or turns off logon-free sharing for an application monitored by Browser Monitoring.</p>
     * 
     * @param request SetRetcodeShareStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRetcodeShareStatusResponse
     */
    public SetRetcodeShareStatusResponse setRetcodeShareStatusWithOptions(SetRetcodeShareStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRetcodeShareStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRetcodeShareStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Turns on or turns off logon-free sharing for an application monitored by Browser Monitoring.</p>
     * 
     * @param request SetRetcodeShareStatusRequest
     * @return SetRetcodeShareStatusResponse
     */
    public SetRetcodeShareStatusResponse setRetcodeShareStatus(SetRetcodeShareStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRetcodeShareStatusWithOptions(request, runtime);
    }

    /**
     * @param request StartAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAlertResponse
     */
    public StartAlertResponse startAlertWithOptions(StartAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAlert"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAlertResponse());
    }

    /**
     * @param request StartAlertRequest
     * @return StartAlertResponse
     */
    public StartAlertResponse startAlert(StartAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动定时拨测任务</p>
     * 
     * @param tmpReq StartTimingSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTimingSyntheticTaskResponse
     */
    public StartTimingSyntheticTaskResponse startTimingSyntheticTaskWithOptions(StartTimingSyntheticTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartTimingSyntheticTaskShrinkRequest request = new StartTimingSyntheticTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            query.put("TaskIds", request.taskIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTimingSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTimingSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动定时拨测任务</p>
     * 
     * @param request StartTimingSyntheticTaskRequest
     * @return StartTimingSyntheticTaskResponse
     */
    public StartTimingSyntheticTaskResponse startTimingSyntheticTask(StartTimingSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTimingSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call StartAlert to stop an alert rule.</p>
     * 
     * @param request StopAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAlertResponse
     */
    public StopAlertResponse stopAlertWithOptions(StopAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAlert"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call StartAlert to stop an alert rule.</p>
     * 
     * @param request StopAlertRequest
     * @return StopAlertResponse
     */
    public StopAlertResponse stopAlert(StopAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops scheduled synthetic monitoring tasks.</p>
     * 
     * @param tmpReq StopTimingSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTimingSyntheticTaskResponse
     */
    public StopTimingSyntheticTaskResponse stopTimingSyntheticTaskWithOptions(StopTimingSyntheticTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopTimingSyntheticTaskShrinkRequest request = new StopTimingSyntheticTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            query.put("TaskIds", request.taskIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTimingSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTimingSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops scheduled synthetic monitoring tasks.</p>
     * 
     * @param request StopTimingSyntheticTaskRequest
     * @return StopTimingSyntheticTaskResponse
     */
    public StopTimingSyntheticTaskResponse stopTimingSyntheticTask(StopTimingSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTimingSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动或者禁用云拨测的任务</p>
     * 
     * @param request SwitchSyntheticTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchSyntheticTaskStatusResponse
     */
    public SwitchSyntheticTaskStatusResponse switchSyntheticTaskStatusWithOptions(SwitchSyntheticTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.switchStatus)) {
            query.put("SwitchStatus", request.switchStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSyntheticTaskStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSyntheticTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动或者禁用云拨测的任务</p>
     * 
     * @param request SwitchSyntheticTaskStatusRequest
     * @return SwitchSyntheticTaskStatusResponse
     */
    public SwitchSyntheticTaskStatusResponse switchSyntheticTaskStatus(SwitchSyntheticTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchSyntheticTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes the aggregation rule of a cluster to other clusters in a region.</p>
     * 
     * @param request SyncRecordingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncRecordingRulesResponse
     */
    public SyncRecordingRulesResponse syncRecordingRulesWithOptions(SyncRecordingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusters)) {
            query.put("TargetClusters", request.targetClusters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncRecordingRules"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncRecordingRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes the aggregation rule of a cluster to other clusters in a region.</p>
     * 
     * @param request SyncRecordingRulesRequest
     * @return SyncRecordingRulesResponse
     */
    public SyncRecordingRulesResponse syncRecordingRules(SyncRecordingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncRecordingRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to ARMS resources.</p>
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
            new TeaPair("version", "2019-08-08"),
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
     * <p>Adds tags to ARMS resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the ASK cluster or ECS instance is monitored in Managed Service for Prometheus.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Prometheus instance from a serverless Kubernetes (ASK) cluster or an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request UninstallManagedPrometheusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallManagedPrometheusResponse
     */
    public UninstallManagedPrometheusResponse uninstallManagedPrometheusWithOptions(UninstallManagedPrometheusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallManagedPrometheus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallManagedPrometheusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the ASK cluster or ECS instance is monitored in Managed Service for Prometheus.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Prometheus instance from a serverless Kubernetes (ASK) cluster or an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request UninstallManagedPrometheusRequest
     * @return UninstallManagedPrometheusResponse
     */
    public UninstallManagedPrometheusResponse uninstallManagedPrometheus(UninstallManagedPrometheusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallManagedPrometheusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Prometheus instance.</p>
     * 
     * @param request UninstallPromClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallPromClusterResponse
     */
    public UninstallPromClusterResponse uninstallPromClusterWithOptions(UninstallPromClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallPromCluster"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallPromClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Prometheus instance.</p>
     * 
     * @param request UninstallPromClusterRequest
     * @return UninstallPromClusterResponse
     */
    public UninstallPromClusterResponse uninstallPromCluster(UninstallPromClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallPromClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from ARMS resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-08-08"),
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
     * <p>Removes tags from ARMS resources.</p>
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
     * <p>This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of Alert Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert contact.</p>
     * 
     * @param request UpdateAlertContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertContactResponse
     */
    public UpdateAlertContactResponse updateAlertContactWithOptions(UpdateAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingRobotWebhookUrl)) {
            query.put("DingRobotWebhookUrl", request.dingRobotWebhookUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemNoc)) {
            query.put("SystemNoc", request.systemNoc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertContact"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of Alert Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert contact.</p>
     * 
     * @param request UpdateAlertContactRequest
     * @return UpdateAlertContactResponse
     */
    public UpdateAlertContactResponse updateAlertContact(UpdateAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates UpdateAlertContactGroup alarm contact group.</p>
     * 
     * @param request UpdateAlertContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertContactGroupResponse
     */
    public UpdateAlertContactGroupResponse updateAlertContactGroupWithOptions(UpdateAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupId)) {
            query.put("ContactGroupId", request.contactGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertContactGroup"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates UpdateAlertContactGroup alarm contact group.</p>
     * 
     * @param request UpdateAlertContactGroupRequest
     * @return UpdateAlertContactGroupResponse
     */
    public UpdateAlertContactGroupResponse updateAlertContactGroup(UpdateAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertContactGroupWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRuleWithOptions(UpdateAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupIds)) {
            query.put("ContactGroupIds", request.contactGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoStart)) {
            query.put("IsAutoStart", request.isAutoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templageAlertConfig)) {
            query.put("TemplageAlertConfig", request.templageAlertConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertRuleResponse());
    }

    /**
     * @param request UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UpdateDispatchRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDispatchRuleResponse
     */
    public UpdateDispatchRuleResponse updateDispatchRuleWithOptions(UpdateDispatchRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dispatchRule)) {
            query.put("DispatchRule", request.dispatchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDispatchRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDispatchRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UpdateDispatchRuleRequest
     * @return UpdateDispatchRuleResponse
     */
    public UpdateDispatchRuleResponse updateDispatchRule(UpdateDispatchRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDispatchRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom job for an environment.</p>
     * 
     * @param request UpdateEnvCustomJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvCustomJobResponse
     */
    public UpdateEnvCustomJobResponse updateEnvCustomJobWithOptions(UpdateEnvCustomJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customJobName)) {
            query.put("CustomJobName", request.customJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvCustomJob"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvCustomJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom job for an environment.</p>
     * 
     * @param request UpdateEnvCustomJobRequest
     * @return UpdateEnvCustomJobResponse
     */
    public UpdateEnvCustomJobResponse updateEnvCustomJob(UpdateEnvCustomJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnvCustomJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the PodMonitor of an environment.</p>
     * 
     * @param request UpdateEnvPodMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvPodMonitorResponse
     */
    public UpdateEnvPodMonitorResponse updateEnvPodMonitorWithOptions(UpdateEnvPodMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podMonitorName)) {
            query.put("PodMonitorName", request.podMonitorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvPodMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvPodMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the PodMonitor of an environment.</p>
     * 
     * @param request UpdateEnvPodMonitorRequest
     * @return UpdateEnvPodMonitorResponse
     */
    public UpdateEnvPodMonitorResponse updateEnvPodMonitor(UpdateEnvPodMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnvPodMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the ServiceMonitor of an environment.</p>
     * 
     * @param request UpdateEnvServiceMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvServiceMonitorResponse
     */
    public UpdateEnvServiceMonitorResponse updateEnvServiceMonitorWithOptions(UpdateEnvServiceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMonitorName)) {
            query.put("ServiceMonitorName", request.serviceMonitorName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvServiceMonitor"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvServiceMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the ServiceMonitor of an environment.</p>
     * 
     * @param request UpdateEnvServiceMonitorRequest
     * @return UpdateEnvServiceMonitorResponse
     */
    public UpdateEnvServiceMonitorResponse updateEnvServiceMonitor(UpdateEnvServiceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnvServiceMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an environment.</p>
     * 
     * @param request UpdateEnvironmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvironmentResponse
     */
    public UpdateEnvironmentResponse updateEnvironmentWithOptions(UpdateEnvironmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentName)) {
            query.put("EnvironmentName", request.environmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feePackage)) {
            query.put("FeePackage", request.feePackage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironment"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an environment.</p>
     * 
     * @param request UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    public UpdateEnvironmentResponse updateEnvironment(UpdateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnvironmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑工作区</p>
     * 
     * @param request UpdateGrafanaWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGrafanaWorkspaceResponse
     */
    public UpdateGrafanaWorkspaceResponse updateGrafanaWorkspaceWithOptions(UpdateGrafanaWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceId)) {
            query.put("GrafanaWorkspaceId", request.grafanaWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceName)) {
            query.put("GrafanaWorkspaceName", request.grafanaWorkspaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGrafanaWorkspace"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGrafanaWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑工作区</p>
     * 
     * @param request UpdateGrafanaWorkspaceRequest
     * @return UpdateGrafanaWorkspaceResponse
     */
    public UpdateGrafanaWorkspaceResponse updateGrafanaWorkspace(UpdateGrafanaWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGrafanaWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级指定工作区版本</p>
     * 
     * @param request UpdateGrafanaWorkspaceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGrafanaWorkspaceVersionResponse
     */
    public UpdateGrafanaWorkspaceVersionResponse updateGrafanaWorkspaceVersionWithOptions(UpdateGrafanaWorkspaceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaVersion)) {
            query.put("GrafanaVersion", request.grafanaVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grafanaWorkspaceId)) {
            query.put("GrafanaWorkspaceId", request.grafanaWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGrafanaWorkspaceVersion"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGrafanaWorkspaceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级指定工作区版本</p>
     * 
     * @param request UpdateGrafanaWorkspaceVersionRequest
     * @return UpdateGrafanaWorkspaceVersionResponse
     */
    public UpdateGrafanaWorkspaceVersionResponse updateGrafanaWorkspaceVersion(UpdateGrafanaWorkspaceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGrafanaWorkspaceVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about an integration.</p>
     * 
     * @param request UpdateIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIntegrationResponse
     */
    public UpdateIntegrationResponse updateIntegrationWithOptions(UpdateIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRecover)) {
            body.put("AutoRecover", request.autoRecover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicateKey)) {
            body.put("DuplicateKey", request.duplicateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedFieldRedefineRules)) {
            body.put("ExtendedFieldRedefineRules", request.extendedFieldRedefineRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldRedefineRules)) {
            body.put("FieldRedefineRules", request.fieldRedefineRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiativeRecoverField)) {
            body.put("InitiativeRecoverField", request.initiativeRecoverField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiativeRecoverValue)) {
            body.put("InitiativeRecoverValue", request.initiativeRecoverValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationId)) {
            body.put("IntegrationId", request.integrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationName)) {
            body.put("IntegrationName", request.integrationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationProductType)) {
            body.put("IntegrationProductType", request.integrationProductType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            body.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoverTime)) {
            body.put("RecoverTime", request.recoverTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stat)) {
            body.put("Stat", request.stat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about an integration.</p>
     * 
     * @param request UpdateIntegrationRequest
     * @return UpdateIntegrationResponse
     */
    public UpdateIntegrationResponse updateIntegration(UpdateIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新删除的metric</p>
     * 
     * @param request UpdateMetricDropRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetricDropResponse
     */
    public UpdateMetricDropResponse updateMetricDropWithOptions(UpdateMetricDropRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricDrop)) {
            query.put("MetricDrop", request.metricDrop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetricDrop"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetricDropResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新删除的metric</p>
     * 
     * @param request UpdateMetricDropRequest
     * @return UpdateMetricDropResponse
     */
    public UpdateMetricDropResponse updateMetricDrop(UpdateMetricDropRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetricDropWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Prometheus告警规则</p>
     * 
     * @param request UpdatePrometheusAlertRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusAlertRuleResponse
     */
    public UpdatePrometheusAlertRuleResponse updatePrometheusAlertRuleWithOptions(UpdatePrometheusAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            query.put("AlertId", request.alertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            query.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatchRuleId)) {
            query.put("DispatchRuleId", request.dispatchRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            query.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusAlertRule"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusAlertRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Prometheus告警规则</p>
     * 
     * @param request UpdatePrometheusAlertRuleRequest
     * @return UpdatePrometheusAlertRuleResponse
     */
    public UpdatePrometheusAlertRuleResponse updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusAlertRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the data sources of Prometheus instance for GlobalView.</p>
     * 
     * @param request UpdatePrometheusGlobalViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusGlobalViewResponse
     */
    public UpdatePrometheusGlobalViewResponse updatePrometheusGlobalViewWithOptions(UpdatePrometheusGlobalViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allSubClustersSuccess)) {
            query.put("AllSubClustersSuccess", request.allSubClustersSuccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mostRegionId)) {
            query.put("MostRegionId", request.mostRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subClustersJson)) {
            query.put("SubClustersJson", request.subClustersJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusGlobalView"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusGlobalViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the data sources of Prometheus instance for GlobalView.</p>
     * 
     * @param request UpdatePrometheusGlobalViewRequest
     * @return UpdatePrometheusGlobalViewResponse
     */
    public UpdatePrometheusGlobalViewResponse updatePrometheusGlobalView(UpdatePrometheusGlobalViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusGlobalViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Prometheus instance config.</p>
     * 
     * @param request UpdatePrometheusInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusInstanceResponse
     */
    public UpdatePrometheusInstanceResponse updatePrometheusInstanceWithOptions(UpdatePrometheusInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.archiveDuration)) {
            query.put("ArchiveDuration", request.archiveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageDuration)) {
            query.put("StorageDuration", request.storageDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusInstance"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Prometheus instance config.</p>
     * 
     * @param request UpdatePrometheusInstanceRequest
     * @return UpdatePrometheusInstanceResponse
     */
    public UpdatePrometheusInstanceResponse updatePrometheusInstance(UpdatePrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of an exporter that is integrated into a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request UpdatePrometheusIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusIntegrationResponse
     */
    public UpdatePrometheusIntegrationResponse updatePrometheusIntegrationWithOptions(UpdatePrometheusIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            query.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusIntegration"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusIntegrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of an exporter that is integrated into a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request UpdatePrometheusIntegrationRequest
     * @return UpdatePrometheusIntegrationResponse
     */
    public UpdatePrometheusIntegrationResponse updatePrometheusIntegration(UpdatePrometheusIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusIntegrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request UpdatePrometheusMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusMonitoringResponse
     */
    public UpdatePrometheusMonitoringResponse updatePrometheusMonitoringWithOptions(UpdatePrometheusMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitoringName)) {
            query.put("MonitoringName", request.monitoringName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configYaml)) {
            body.put("ConfigYaml", request.configYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusMonitoring"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request UpdatePrometheusMonitoringRequest
     * @return UpdatePrometheusMonitoringResponse
     */
    public UpdatePrometheusMonitoringResponse updatePrometheusMonitoring(UpdatePrometheusMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request UpdatePrometheusMonitoringStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusMonitoringStatusResponse
     */
    public UpdatePrometheusMonitoringStatusResponse updatePrometheusMonitoringStatusWithOptions(UpdatePrometheusMonitoringStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitoringName)) {
            query.put("MonitoringName", request.monitoringName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusMonitoringStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusMonitoringStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the monitoring configuration of a Prometheus instance.</p>
     * 
     * @param request UpdatePrometheusMonitoringStatusRequest
     * @return UpdatePrometheusMonitoringStatusResponse
     */
    public UpdatePrometheusMonitoringStatusResponse updatePrometheusMonitoringStatus(UpdatePrometheusMonitoringStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusMonitoringStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a remote write configuration item of a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request UpdatePrometheusRemoteWriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusRemoteWriteResponse
     */
    public UpdatePrometheusRemoteWriteResponse updatePrometheusRemoteWriteWithOptions(UpdatePrometheusRemoteWriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteWriteName)) {
            query.put("RemoteWriteName", request.remoteWriteName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remoteWriteYaml)) {
            body.put("RemoteWriteYaml", request.remoteWriteYaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusRemoteWrite"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusRemoteWriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a remote write configuration item of a Prometheus instance for Container Service or a Prometheus instance for ECS.</p>
     * 
     * @param request UpdatePrometheusRemoteWriteRequest
     * @return UpdatePrometheusRemoteWriteResponse
     */
    public UpdatePrometheusRemoteWriteResponse updatePrometheusRemoteWrite(UpdatePrometheusRemoteWriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrometheusRemoteWriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新前端监控应用信息</p>
     * 
     * @param request UpdateRumAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRumAppResponse
     */
    public UpdateRumAppResponse updateRumAppWithOptions(UpdateRumAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRestart)) {
            query.put("AutoRestart", request.autoRestart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSubscribe)) {
            query.put("IsSubscribe", request.isSubscribe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            query.put("Nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restart)) {
            query.put("Restart", request.restart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDomainOperationJson)) {
            query.put("ServiceDomainOperationJson", request.serviceDomainOperationJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            query.put("Stop", request.stop);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRumApp"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRumAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新前端监控应用信息</p>
     * 
     * @param request UpdateRumAppRequest
     * @return UpdateRumAppResponse
     */
    public UpdateRumAppResponse updateRumApp(UpdateRumAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRumAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Sourcemap文件状态</p>
     * 
     * @param request UpdateRumFileStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRumFileStatusResponse
     */
    public UpdateRumFileStatusResponse updateRumFileStatusWithOptions(UpdateRumFileStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRumFileStatus"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRumFileStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Sourcemap文件状态</p>
     * 
     * @param request UpdateRumFileStatusRequest
     * @return UpdateRumFileStatusResponse
     */
    public UpdateRumFileStatusResponse updateRumFileStatus(UpdateRumFileStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRumFileStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新定时拨测任务</p>
     * 
     * @param tmpReq UpdateTimingSyntheticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTimingSyntheticTaskResponse
     */
    public UpdateTimingSyntheticTaskResponse updateTimingSyntheticTaskWithOptions(UpdateTimingSyntheticTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTimingSyntheticTaskShrinkRequest request = new UpdateTimingSyntheticTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.availableAssertions)) {
            request.availableAssertionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.availableAssertions, "AvailableAssertions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commonSetting)) {
            request.commonSettingShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commonSetting, "CommonSetting", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customPeriod)) {
            request.customPeriodShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customPeriod, "CustomPeriod", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitorConf)) {
            request.monitorConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitorConf, "MonitorConf", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitors)) {
            request.monitorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitors, "Monitors", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.availableAssertionsShrink)) {
            query.put("AvailableAssertions", request.availableAssertionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonSettingShrink)) {
            query.put("CommonSetting", request.commonSettingShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPeriodShrink)) {
            query.put("CustomPeriod", request.customPeriodShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfShrink)) {
            query.put("MonitorConf", request.monitorConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorsShrink)) {
            query.put("Monitors", request.monitorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTimingSyntheticTask"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTimingSyntheticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新定时拨测任务</p>
     * 
     * @param request UpdateTimingSyntheticTaskRequest
     * @return UpdateTimingSyntheticTaskResponse
     */
    public UpdateTimingSyntheticTaskResponse updateTimingSyntheticTask(UpdateTimingSyntheticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTimingSyntheticTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. Call the CreateOrUpdateWebhookContact operation in the new alter management module to create or modify a webhook alert contact.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a webhook alert contact.</p>
     * 
     * @param request UpdateWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebhookResponse
     */
    public UpdateWebhookResponse updateWebhookWithOptions(UpdateWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpHeaders)) {
            query.put("HttpHeaders", request.httpHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpParams)) {
            query.put("HttpParams", request.httpParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoverBody)) {
            query.put("RecoverBody", request.recoverBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebhook"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebhookResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. Call the CreateOrUpdateWebhookContact operation in the new alter management module to create or modify a webhook alert contact.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a webhook alert contact.</p>
     * 
     * @param request UpdateWebhookRequest
     * @return UpdateWebhookResponse
     */
    public UpdateWebhookResponse updateWebhook(UpdateWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the AddonRelease information.</p>
     * 
     * @param request UpgradeAddonReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAddonReleaseResponse
     */
    public UpgradeAddonReleaseResponse upgradeAddonReleaseWithOptions(UpgradeAddonReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonVersion)) {
            query.put("AddonVersion", request.addonVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            query.put("ReleaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.values)) {
            query.put("Values", request.values);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAddonRelease"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAddonReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the AddonRelease information.</p>
     * 
     * @param request UpgradeAddonReleaseRequest
     * @return UpgradeAddonReleaseResponse
     */
    public UpgradeAddonReleaseResponse upgradeAddonRelease(UpgradeAddonReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeAddonReleaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 feature信息</p>
     * 
     * @param request UpgradeEnvironmentFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeEnvironmentFeatureResponse
     */
    public UpgradeEnvironmentFeatureResponse upgradeEnvironmentFeatureWithOptions(UpgradeEnvironmentFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("EnvironmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureVersion)) {
            query.put("FeatureVersion", request.featureVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.values)) {
            query.put("Values", request.values);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeEnvironmentFeature"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeEnvironmentFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 feature信息</p>
     * 
     * @param request UpgradeEnvironmentFeatureRequest
     * @return UpgradeEnvironmentFeatureResponse
     */
    public UpgradeEnvironmentFeatureResponse upgradeEnvironmentFeature(UpgradeEnvironmentFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeEnvironmentFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a SourceMap file to ARMS Browser Monitoring.</p>
     * 
     * @param request UploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadResponse
     */
    public UploadResponse uploadWithOptions(UploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            query.put("Pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.file)) {
            body.put("File", request.file);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Upload"),
            new TeaPair("version", "2019-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a SourceMap file to ARMS Browser Monitoring.</p>
     * 
     * @param request UploadRequest
     * @return UploadResponse
     */
    public UploadResponse upload(UploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadWithOptions(request, runtime);
    }
}
