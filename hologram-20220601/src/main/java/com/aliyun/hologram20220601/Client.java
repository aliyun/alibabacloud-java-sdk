// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601;

import com.aliyun.tea.*;
import com.aliyun.hologram20220601.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hologram", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>绑定主实例</p>
     * 
     * @param request BindLeaderInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindLeaderInstanceResponse
     */
    public BindLeaderInstanceResponse bindLeaderInstanceWithOptions(String instanceId, BindLeaderInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.leaderInstanceId)) {
            body.put("leaderInstanceId", request.leaderInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindLeaderInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/bindReadOnly"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindLeaderInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定主实例</p>
     * 
     * @param request BindLeaderInstanceRequest
     * @return BindLeaderInstanceResponse
     */
    public BindLeaderInstanceResponse bindLeaderInstance(String instanceId, BindLeaderInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindLeaderInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a resource group.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("newResourceGroupId", request.newResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tag/changeResourceGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a resource group.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建db</p>
     * 
     * @param request CreateDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabaseWithOptions(String instanceId, CreateDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionModel)) {
            body.put("permissionModel", request.permissionModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabase"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/createDatabase"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建db</p>
     * 
     * @param request CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(String instanceId, CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建外部db</p>
     * 
     * @param request CreateExternalDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExternalDatabaseResponse
     */
    public CreateExternalDatabaseResponse createExternalDatabaseWithOptions(String instanceId, CreateExternalDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultUserMapping)) {
            body.put("defaultUserMapping", request.defaultUserMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalConfig)) {
            body.put("externalConfig", request.externalConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metastoreType)) {
            body.put("metastoreType", request.metastoreType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExternalDatabase"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/createExternalDatabase"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExternalDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建外部db</p>
     * 
     * @param request CreateExternalDatabaseRequest
     * @return CreateExternalDatabaseResponse
     */
    public CreateExternalDatabaseResponse createExternalDatabase(String instanceId, CreateExternalDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExternalDatabaseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual warehouse.</p>
     * 
     * @param request CreateHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHoloWarehouseResponse
     */
    public CreateHoloWarehouseResponse createHoloWarehouseWithOptions(String instanceId, CreateHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterCount)) {
            body.put("clusterCount", request.clusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/createHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual warehouse.</p>
     * 
     * @param request CreateHoloWarehouseRequest
     * @return CreateHoloWarehouseResponse
     */
    public CreateHoloWarehouseResponse createHoloWarehouse(String instanceId, CreateHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing details of Hologres, see <a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-createinstance">Pricing</a>.</li>
     * <li>When you purchase a Hologres instance, you must specify the region and zone in which the Hologres instance resides. A region may correspond to multiple zones. Example:<!---->
     * cn-hangzhou: cn-hangzhou-h, cn-hangzhou-j
     *    cn-shanghai: cn-shanghai-e, cn-shanghai-f
     *    cn-beijing: cn-beijing-i, cn-beijing-g
     *    cn-zhangjiakou: cn-zhangjiakou-b
     *    cn-shenzhen: cn-shenzhen-e
     *    cn-hongkong: cn-hongkong-b
     *    cn-shanghai-finance-1: cn-shanghai-finance-1z
     *    ap-northeast-1: ap-northeast-1a
     *    ap-southeast-1: ap-southeast-1c
     *    ap-southeast-3: ap-southeast-3b
     *    ap-southeast-5: ap-southeast-5b
     *    ap-south-1: ap-south-1b
     *    eu-central-1: eu-central-1a
     *    us-east-1: us-east-1a
     *    us-west-1: us-west-1b</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Hologres instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("autoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("autoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coldStorageSize)) {
            body.put("coldStorageSize", request.coldStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableServerlessComputing)) {
            body.put("enableServerlessComputing", request.enableServerlessComputing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayCount)) {
            body.put("gatewayCount", request.gatewayCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialDatabases)) {
            body.put("initialDatabases", request.initialDatabases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaderInstanceId)) {
            body.put("leaderInstanceId", request.leaderInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("pricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            body.put("storageSize", request.storageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            body.put("storageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("vSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing details of Hologres, see <a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-createinstance">Pricing</a>.</li>
     * <li>When you purchase a Hologres instance, you must specify the region and zone in which the Hologres instance resides. A region may correspond to multiple zones. Example:<!---->
     * cn-hangzhou: cn-hangzhou-h, cn-hangzhou-j
     *    cn-shanghai: cn-shanghai-e, cn-shanghai-f
     *    cn-beijing: cn-beijing-i, cn-beijing-g
     *    cn-zhangjiakou: cn-zhangjiakou-b
     *    cn-shenzhen: cn-shenzhen-e
     *    cn-hongkong: cn-hongkong-b
     *    cn-shanghai-finance-1: cn-shanghai-finance-1z
     *    ap-northeast-1: ap-northeast-1a
     *    ap-southeast-1: ap-southeast-1c
     *    ap-southeast-3: ap-southeast-3b
     *    ap-southeast-5: ap-southeast-5b
     *    ap-south-1: ap-south-1b
     *    eu-central-1: eu-central-1a
     *    us-east-1: us-east-1a
     *    us-west-1: us-west-1b</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Hologres instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建手动备份</p>
     * 
     * @param request CreateManualBackupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackupWithOptions(CreateManualBackupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateManualBackup"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/backups/manual"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateManualBackupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建手动备份</p>
     * 
     * @param request CreateManualBackupRequest
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createManualBackupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型服务</p>
     * 
     * @param request CreateModelServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelServiceResponse
     */
    public CreateModelServiceResponse createModelServiceWithOptions(String instanceId, CreateModelServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("apiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpu)) {
            body.put("gpu", request.gpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuMemory)) {
            body.put("gpuMemory", request.gpuMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelParams)) {
            body.put("modelParams", request.modelParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceName)) {
            body.put("modelServiceName", request.modelServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCount)) {
            body.put("serviceCount", request.serviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelService"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/createModelService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型服务</p>
     * 
     * @param request CreateModelServiceRequest
     * @return CreateModelServiceResponse
     */
    public CreateModelServiceResponse createModelService(String instanceId, CreateModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelServiceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户</p>
     * 
     * @param request CreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(String instanceId, CreateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.superUser)) {
            body.put("superUser", request.superUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/createUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(String instanceId, CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建warehouse</p>
     * 
     * @param request CreateWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWarehouseResponse
     */
    public CreateWarehouseResponse createWarehouseWithOptions(String instanceId, CreateWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseName)) {
            body.put("warehouseName", request.warehouseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/warehouse/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建warehouse</p>
     * 
     * @param request CreateWarehouseRequest
     * @return CreateWarehouseResponse
     */
    public CreateWarehouseResponse createWarehouse(String instanceId, CreateWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建分时弹性计划</p>
     * 
     * @param request CreateWarehouseScheduleTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWarehouseScheduleTaskResponse
     */
    public CreateWarehouseScheduleTaskResponse createWarehouseScheduleTaskWithOptions(String instanceId, CreateWarehouseScheduleTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticCu)) {
            body.put("elasticCu", request.elasticCu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            body.put("warehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWarehouseScheduleTask"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/createWarehouseScheduleTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWarehouseScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建分时弹性计划</p>
     * 
     * @param request CreateWarehouseScheduleTaskRequest
     * @return CreateWarehouseScheduleTaskResponse
     */
    public CreateWarehouseScheduleTaskResponse createWarehouseScheduleTask(String instanceId, CreateWarehouseScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWarehouseScheduleTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除备份</p>
     * 
     * @param request DeleteBackupDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupDataResponse
     */
    public DeleteBackupDataResponse deleteBackupDataWithOptions(String id, DeleteBackupDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackupData"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/backups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除备份</p>
     * 
     * @param request DeleteBackupDataRequest
     * @return DeleteBackupDataResponse
     */
    public DeleteBackupDataResponse deleteBackupData(String id, DeleteBackupDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBackupDataWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual warehouse.</p>
     * 
     * @param request DeleteHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHoloWarehouseResponse
     */
    public DeleteHoloWarehouseResponse deleteHoloWarehouseWithOptions(String instanceId, DeleteHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/deleteHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual warehouse.</p>
     * 
     * @param request DeleteHoloWarehouseRequest
     * @return DeleteHoloWarehouseResponse
     */
    public DeleteHoloWarehouseResponse deleteHoloWarehouse(String instanceId, DeleteHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, read the documentation and make sure that you understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li>After you delete a Hologres instance, data and objects in the instance cannot be restored. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview?spm=a2c63.p38356.0.0.efc33b87i5pDl7">Billing overview</a>.</li>
     * <li>You can delete only pay-as-you-go instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Hologres instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(String instanceId, DeleteInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, read the documentation and make sure that you understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li>After you delete a Hologres instance, data and objects in the instance cannot be restored. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview?spm=a2c63.p38356.0.0.efc33b87i5pDl7">Billing overview</a>.</li>
     * <li>You can delete only pay-as-you-go instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Hologres instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(String instanceId, DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型资源</p>
     * 
     * @param request DeleteModelResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelResourceResponse
     */
    public DeleteModelResourceResponse deleteModelResourceWithOptions(String instanceId, DeleteModelResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiInstanceId)) {
            query.put("aiInstanceId", request.aiInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelResource"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/deleteModelResource"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型资源</p>
     * 
     * @param request DeleteModelResourceRequest
     * @return DeleteModelResourceResponse
     */
    public DeleteModelResourceResponse deleteModelResource(String instanceId, DeleteModelResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelResourceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型服务</p>
     * 
     * @param request DeleteModelServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelServiceResponse
     */
    public DeleteModelServiceResponse deleteModelServiceWithOptions(String instanceId, DeleteModelServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceName)) {
            query.put("modelServiceName", request.modelServiceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelService"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/deleteModelService"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型服务</p>
     * 
     * @param request DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     */
    public DeleteModelServiceResponse deleteModelService(String instanceId, DeleteModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelServiceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算组弹性计划</p>
     * 
     * @param request DeleteWarehouseScheduleTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWarehouseScheduleTaskResponse
     */
    public DeleteWarehouseScheduleTaskResponse deleteWarehouseScheduleTaskWithOptions(String instanceId, DeleteWarehouseScheduleTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            body.put("warehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWarehouseScheduleTask"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/deleteWarehouseScheduleTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWarehouseScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算组弹性计划</p>
     * 
     * @param request DeleteWarehouseScheduleTaskRequest
     * @return DeleteWarehouseScheduleTaskResponse
     */
    public DeleteWarehouseScheduleTaskResponse deleteWarehouseScheduleTask(String instanceId, DeleteWarehouseScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWarehouseScheduleTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停实例</p>
     * 
     * @param request DescribeTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsOnly)) {
            query.put("tagsOnly", request.tagsOnly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停实例</p>
     * 
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭OpenAPI执行SQL功能</p>
     * 
     * @param request DisableExecuteStatementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableExecuteStatementResponse
     */
    public DisableExecuteStatementResponse disableExecuteStatementWithOptions(String instanceId, DisableExecuteStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableExecuteStatement"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/disableExecuteStatement"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableExecuteStatementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭OpenAPI执行SQL功能</p>
     * 
     * @param request DisableExecuteStatementRequest
     * @return DisableExecuteStatementResponse
     */
    public DisableExecuteStatementResponse disableExecuteStatement(String instanceId, DisableExecuteStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableExecuteStatementWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables data lake acceleration.</p>
     * 
     * @param request DisableHiveAccessRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableHiveAccessResponse
     */
    public DisableHiveAccessResponse disableHiveAccessWithOptions(String instanceId, DisableHiveAccessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableHiveAccess"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/disableHiveAccess"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableHiveAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables data lake acceleration.</p>
     * 
     * @param request DisableHiveAccessRequest
     * @return DisableHiveAccessResponse
     */
    public DisableHiveAccessResponse disableHiveAccess(String instanceId, DisableHiveAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableHiveAccessWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消执行计划</p>
     * 
     * @param request DisableOperationEventRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableOperationEventResponse
     */
    public DisableOperationEventResponse disableOperationEventWithOptions(String instanceId, DisableOperationEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableOperationEvent"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/disableOperationEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableOperationEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消执行计划</p>
     * 
     * @param request DisableOperationEventRequest
     * @return DisableOperationEventResponse
     */
    public DisableOperationEventResponse disableOperationEvent(String instanceId, DisableOperationEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableOperationEventWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭SSL</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSSLResponse
     */
    public DisableSSLResponse disableSSLWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSSL"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/disableSSL"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭SSL</p>
     * @return DisableSSLResponse
     */
    public DisableSSLResponse disableSSL(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSSLWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭服务账号</p>
     * 
     * @param request DisableSupportAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSupportAccountResponse
     */
    public DisableSupportAccountResponse disableSupportAccountWithOptions(String instanceId, DisableSupportAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSupportAccount"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/supportAccount/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSupportAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭服务账号</p>
     * 
     * @param request DisableSupportAccountRequest
     * @return DisableSupportAccountResponse
     */
    public DisableSupportAccountResponse disableSupportAccount(String instanceId, DisableSupportAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSupportAccountWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭自动弹性</p>
     * 
     * @param request DisableWarehouseAutoScaleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableWarehouseAutoScaleResponse
     */
    public DisableWarehouseAutoScaleResponse disableWarehouseAutoScaleWithOptions(String instanceId, DisableWarehouseAutoScaleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableWarehouseAutoScale"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/disableWarehouseAutoScale"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableWarehouseAutoScaleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭自动弹性</p>
     * 
     * @param request DisableWarehouseAutoScaleRequest
     * @return DisableWarehouseAutoScaleResponse
     */
    public DisableWarehouseAutoScaleResponse disableWarehouseAutoScale(String instanceId, DisableWarehouseAutoScaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableWarehouseAutoScaleWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消升级</p>
     * 
     * @param request DiscardUpgradeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiscardUpgradeResponse
     */
    public DiscardUpgradeResponse discardUpgradeWithOptions(String instanceId, DiscardUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiscardUpgrade"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/upgrade/discard"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiscardUpgradeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消升级</p>
     * 
     * @param request DiscardUpgradeRequest
     * @return DiscardUpgradeResponse
     */
    public DiscardUpgradeResponse discardUpgrade(String instanceId, DiscardUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.discardUpgradeWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户</p>
     * 
     * @param request DropUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropUserResponse
     */
    public DropUserResponse dropUserWithOptions(String instanceId, DropUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.superUser)) {
            body.put("superUser", request.superUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropUser"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dropUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户</p>
     * 
     * @param request DropUserRequest
     * @return DropUserResponse
     */
    public DropUserResponse dropUser(String instanceId, DropUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dropUserWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启或关闭OpenAPI执行SQL功能</p>
     * 
     * @param request EnableExecuteStatementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableExecuteStatementResponse
     */
    public EnableExecuteStatementResponse enableExecuteStatementWithOptions(String instanceId, EnableExecuteStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableExecuteStatement"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/enableExecuteStatement"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableExecuteStatementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启或关闭OpenAPI执行SQL功能</p>
     * 
     * @param request EnableExecuteStatementRequest
     * @return EnableExecuteStatementResponse
     */
    public EnableExecuteStatementResponse enableExecuteStatement(String instanceId, EnableExecuteStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableExecuteStatementWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables data lake acceleration.</p>
     * 
     * @param request EnableHiveAccessRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableHiveAccessResponse
     */
    public EnableHiveAccessResponse enableHiveAccessWithOptions(String instanceId, EnableHiveAccessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableHiveAccess"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/enableHiveAccess"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableHiveAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables data lake acceleration.</p>
     * 
     * @param request EnableHiveAccessRequest
     * @return EnableHiveAccessResponse
     */
    public EnableHiveAccessResponse enableHiveAccess(String instanceId, EnableHiveAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableHiveAccessWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打开SSL</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSSLResponse
     */
    public EnableSSLResponse enableSSLWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSSL"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/enableSSL"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打开SSL</p>
     * @return EnableSSLResponse
     */
    public EnableSSLResponse enableSSL(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSSLWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打开服务账号</p>
     * 
     * @param request EnableSupportAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSupportAccountResponse
     */
    public EnableSupportAccountResponse enableSupportAccountWithOptions(String instanceId, EnableSupportAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSupportAccount"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/supportAccount/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSupportAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打开服务账号</p>
     * 
     * @param request EnableSupportAccountRequest
     * @return EnableSupportAccountResponse
     */
    public EnableSupportAccountResponse enableSupportAccount(String instanceId, EnableSupportAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSupportAccountWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启自动弹性</p>
     * 
     * @param request EnableWarehouseAutoScaleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableWarehouseAutoScaleResponse
     */
    public EnableWarehouseAutoScaleResponse enableWarehouseAutoScaleWithOptions(String instanceId, EnableWarehouseAutoScaleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxClusterCount)) {
            body.put("maxClusterCount", request.maxClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWarehouseAutoScale"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/enableWarehouseAutoScale"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWarehouseAutoScaleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启自动弹性</p>
     * 
     * @param request EnableWarehouseAutoScaleRequest
     * @return EnableWarehouseAutoScaleResponse
     */
    public EnableWarehouseAutoScaleResponse enableWarehouseAutoScale(String instanceId, EnableWarehouseAutoScaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableWarehouseAutoScaleWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SQL执行</p>
     * 
     * @param request ExecuteStatementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteStatementResponse
     */
    public ExecuteStatementResponse executeStatementWithOptions(String instanceId, ExecuteStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("dbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBytes)) {
            body.put("maxBytes", request.maxBytes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRows)) {
            body.put("maxRows", request.maxRows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTimeout)) {
            body.put("queryTimeout", request.queryTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteStatement"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/executeStatement"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteStatementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SQL执行</p>
     * 
     * @param request ExecuteStatementRequest
     * @return ExecuteStatementResponse
     */
    public ExecuteStatementResponse executeStatement(String instanceId, ExecuteStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeStatementWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得证书信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCertificateAttributeResponse
     */
    public GetCertificateAttributeResponse getCertificateAttributeWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertificateAttribute"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/certificateAttribute"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertificateAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得证书信息</p>
     * @return GetCertificateAttributeResponse
     */
    public GetCertificateAttributeResponse getCertificateAttribute(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCertificateAttributeWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例是否已开启OpenAPI执行SQL功能</p>
     * 
     * @param request GetExecuteStatementEnabledRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecuteStatementEnabledResponse
     */
    public GetExecuteStatementEnabledResponse getExecuteStatementEnabledWithOptions(String instanceId, GetExecuteStatementEnabledRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecuteStatementEnabled"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/executeStatementEnabled"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecuteStatementEnabledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例是否已开启OpenAPI执行SQL功能</p>
     * 
     * @param request GetExecuteStatementEnabledRequest
     * @return GetExecuteStatementEnabledResponse
     */
    public GetExecuteStatementEnabledResponse getExecuteStatementEnabled(String instanceId, GetExecuteStatementEnabledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExecuteStatementEnabledWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取holoweb登陆权限</p>
     * 
     * @param request GetHoloWebLoginSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHoloWebLoginSettingResponse
     */
    public GetHoloWebLoginSettingResponse getHoloWebLoginSettingWithOptions(String instanceId, GetHoloWebLoginSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHoloWebLoginSetting"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/getHoloWebLoginSetting"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHoloWebLoginSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取holoweb登陆权限</p>
     * 
     * @param request GetHoloWebLoginSettingRequest
     * @return GetHoloWebLoginSettingResponse
     */
    public GetHoloWebLoginSettingResponse getHoloWebLoginSetting(String instanceId, GetHoloWebLoginSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHoloWebLoginSettingWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of an instance.</p>
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模型信息</p>
     * 
     * @param request GetInstanceModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceModelResponse
     */
    public GetInstanceModelResponse getInstanceModelWithOptions(String instanceId, GetInstanceModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceModel"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/getInstanceModel"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模型信息</p>
     * 
     * @param request GetInstanceModelRequest
     * @return GetInstanceModelResponse
     */
    public GetInstanceModelResponse getInstanceModel(String instanceId, GetInstanceModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceModelWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取上次升级历史</p>
     * 
     * @param request GetLastUpgradeRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLastUpgradeRecordResponse
     */
    public GetLastUpgradeRecordResponse getLastUpgradeRecordWithOptions(String instanceId, GetLastUpgradeRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLastUpgradeRecord"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/lastUpgradeRecord"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLastUpgradeRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取上次升级历史</p>
     * 
     * @param request GetLastUpgradeRecordRequest
     * @return GetLastUpgradeRecordResponse
     */
    public GetLastUpgradeRecordResponse getLastUpgradeRecord(String instanceId, GetLastUpgradeRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLastUpgradeRecordWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得根证书</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRootCertificateResponse
     */
    public GetRootCertificateResponse getRootCertificateWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRootCertificate"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rootCertificate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRootCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得根证书</p>
     * @return GetRootCertificateResponse
     */
    public GetRootCertificateResponse getRootCertificate(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRootCertificateWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取周期备份配置</p>
     * 
     * @param request GetScheduledBackupConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledBackupConfigResponse
     */
    public GetScheduledBackupConfigResponse getScheduledBackupConfigWithOptions(GetScheduledBackupConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("scheduleType", request.scheduleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledBackupConfig"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/backups/scheduledConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledBackupConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取周期备份配置</p>
     * 
     * @param request GetScheduledBackupConfigRequest
     * @return GetScheduledBackupConfigResponse
     */
    public GetScheduledBackupConfigResponse getScheduledBackupConfig(GetScheduledBackupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledBackupConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取升级状态</p>
     * 
     * @param request GetUpgradeStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUpgradeStatusResponse
     */
    public GetUpgradeStatusResponse getUpgradeStatusWithOptions(String instanceId, GetUpgradeStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUpgradeStatus"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/upgrade/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUpgradeStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取升级状态</p>
     * 
     * @param request GetUpgradeStatusRequest
     * @return GetUpgradeStatusResponse
     */
    public GetUpgradeStatusResponse getUpgradeStatus(String instanceId, GetUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUpgradeStatusWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>是否可升级</p>
     * 
     * @param request GetUpgradeableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUpgradeableResponse
     */
    public GetUpgradeableResponse getUpgradeableWithOptions(String instanceId, GetUpgradeableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUpgradeable"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/upgradeable"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUpgradeableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>是否可升级</p>
     * 
     * @param request GetUpgradeableRequest
     * @return GetUpgradeableResponse
     */
    public GetUpgradeableResponse getUpgradeable(String instanceId, GetUpgradeableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUpgradeableWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details of a virtual warehouse instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWarehouseDetailResponse
     */
    public GetWarehouseDetailResponse getWarehouseDetailWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWarehouseDetail"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/getWarehouseDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWarehouseDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details of a virtual warehouse instance.</p>
     * @return GetWarehouseDetailResponse
     */
    public GetWarehouseDetailResponse getWarehouseDetail(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWarehouseDetailWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DB授权</p>
     * 
     * @param request GrantDatabasePermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantDatabasePermissionResponse
     */
    public GrantDatabasePermissionResponse grantDatabasePermissionWithOptions(String instanceId, GrantDatabasePermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            body.put("privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantDatabasePermission"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/grantDatabasePermission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantDatabasePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DB授权</p>
     * 
     * @param request GrantDatabasePermissionRequest
     * @return GrantDatabasePermissionResponse
     */
    public GrantDatabasePermissionResponse grantDatabasePermission(String instanceId, GrantDatabasePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantDatabasePermissionWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DB授权</p>
     * 
     * @param request GrantSchemaPermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantSchemaPermissionResponse
     */
    public GrantSchemaPermissionResponse grantSchemaPermissionWithOptions(String instanceId, GrantSchemaPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            body.put("privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("schemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantSchemaPermission"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/grantSchemaPermission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantSchemaPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DB授权</p>
     * 
     * @param request GrantSchemaPermissionRequest
     * @return GrantSchemaPermissionResponse
     */
    public GrantSchemaPermissionResponse grantSchemaPermission(String instanceId, GrantSchemaPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantSchemaPermissionWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DB授权</p>
     * 
     * @param request GrantTablePermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantTablePermissionResponse
     */
    public GrantTablePermissionResponse grantTablePermissionWithOptions(String instanceId, GrantTablePermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allTable)) {
            body.put("allTable", request.allTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNames)) {
            body.put("columnNames", request.columnNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            body.put("privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("schemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("tableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantTablePermission"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/grantTablePermission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantTablePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DB授权</p>
     * 
     * @param request GrantTablePermissionRequest
     * @return GrantTablePermissionResponse
     */
    public GrantTablePermissionResponse grantTablePermission(String instanceId, GrantTablePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantTablePermissionWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of backups. A backup is a full data snapshot of an instance at the end of the snapshot time. You can purchase another instance to completely restore the original data.</p>
     * 
     * @param request ListBackupDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBackupDataResponse
     */
    public ListBackupDataResponse listBackupDataWithOptions(ListBackupDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("backupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBackupData"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/backups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBackupDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of backups. A backup is a full data snapshot of an instance at the end of the snapshot time. You can purchase another instance to completely restore the original data.</p>
     * 
     * @param request ListBackupDataRequest
     * @return ListBackupDataResponse
     */
    public ListBackupDataResponse listBackupData(ListBackupDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBackupDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取DB列表</p>
     * 
     * @param request ListDatabasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(String instanceId, ListDatabasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.external)) {
            query.put("external", request.external);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listDatabases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取DB列表</p>
     * 
     * @param request ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(String instanceId, ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabasesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取只读从实例</p>
     * 
     * @param request ListFollowerInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFollowerInstancesResponse
     */
    public ListFollowerInstancesResponse listFollowerInstancesWithOptions(String instanceId, ListFollowerInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFollowerInstances"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listFollowerInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFollowerInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取只读从实例</p>
     * 
     * @param request ListFollowerInstancesRequest
     * @return ListFollowerInstancesResponse
     */
    public ListFollowerInstancesResponse listFollowerInstances(String instanceId, ListFollowerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFollowerInstancesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AI资源列表</p>
     * 
     * @param request ListInstanceModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceModelResponse
     */
    public ListInstanceModelResponse listInstanceModelWithOptions(ListInstanceModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceModel"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/rpc/listInstanceModel"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI资源列表</p>
     * 
     * @param request ListInstanceModelRequest
     * @return ListInstanceModelResponse
     */
    public ListInstanceModelResponse listInstanceModel(ListInstanceModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceModelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cmsInstanceType)) {
            body.put("cmsInstanceType", request.cmsInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主实例</p>
     * 
     * @param request ListLeaderInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLeaderInstancesResponse
     */
    public ListLeaderInstancesResponse listLeaderInstancesWithOptions(String instanceId, ListLeaderInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLeaderInstances"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/primaryInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLeaderInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取主实例</p>
     * 
     * @param request ListLeaderInstancesRequest
     * @return ListLeaderInstancesResponse
     */
    public ListLeaderInstancesResponse listLeaderInstances(String instanceId, ListLeaderInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLeaderInstancesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例可迁移可用区列表</p>
     * 
     * @param request ListMigrationZonesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMigrationZonesResponse
     */
    public ListMigrationZonesResponse listMigrationZonesWithOptions(String instanceId, ListMigrationZonesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMigrationZones"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listMigrationZones"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMigrationZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例可迁移可用区列表</p>
     * 
     * @param request ListMigrationZonesRequest
     * @return ListMigrationZonesResponse
     */
    public ListMigrationZonesResponse listMigrationZones(String instanceId, ListMigrationZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMigrationZonesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出模型列表</p>
     * 
     * @param request ListModelCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelCatalogResponse
     */
    public ListModelCatalogResponse listModelCatalogWithOptions(String instanceId, ListModelCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelCatalog"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listModelCatalog"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出模型列表</p>
     * 
     * @param request ListModelCatalogRequest
     * @return ListModelCatalogResponse
     */
    public ListModelCatalogResponse listModelCatalog(String instanceId, ListModelCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelCatalogWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运维事件列表</p>
     * 
     * @param request ListOperationEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationEventsResponse
     */
    public ListOperationEventsResponse listOperationEventsWithOptions(ListOperationEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventNameDesc)) {
            body.put("eventNameDesc", request.eventNameDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("eventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimeDesc)) {
            body.put("scheduleTimeDesc", request.scheduleTimeDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("state", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationEvents"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/listOperationEvents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运维事件列表</p>
     * 
     * @param request ListOperationEventsRequest
     * @return ListOperationEventsResponse
     */
    public ListOperationEventsResponse listOperationEvents(ListOperationEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperationEventsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>holoapp共有云所有开服的region</p>
     * 
     * @param request ListRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/regions/listRegions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>holoapp共有云所有开服的region</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取版本列表</p>
     * 
     * @param request ListUpgradeReleaseVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpgradeReleaseVersionsResponse
     */
    public ListUpgradeReleaseVersionsResponse listUpgradeReleaseVersionsWithOptions(String instanceId, ListUpgradeReleaseVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpgradeReleaseVersions"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/upgrade/listReleaseVersions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpgradeReleaseVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取版本列表</p>
     * 
     * @param request ListUpgradeReleaseVersionsRequest
     * @return ListUpgradeReleaseVersionsResponse
     */
    public ListUpgradeReleaseVersionsResponse listUpgradeReleaseVersions(String instanceId, ListUpgradeReleaseVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUpgradeReleaseVersionsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分时弹性日志</p>
     * 
     * @param request ListWarehouseScheduleEventRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarehouseScheduleEventResponse
     */
    public ListWarehouseScheduleEventResponse listWarehouseScheduleEventWithOptions(String instanceId, ListWarehouseScheduleEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticType)) {
            body.put("elasticType", request.elasticType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarehouseScheduleEvent"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listWarehouseScheduleEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarehouseScheduleEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分时弹性日志</p>
     * 
     * @param request ListWarehouseScheduleEventRequest
     * @return ListWarehouseScheduleEventResponse
     */
    public ListWarehouseScheduleEventResponse listWarehouseScheduleEvent(String instanceId, ListWarehouseScheduleEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWarehouseScheduleEventWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>计算分时弹性计划列表</p>
     * 
     * @param request ListWarehouseScheduleTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarehouseScheduleTaskResponse
     */
    public ListWarehouseScheduleTaskResponse listWarehouseScheduleTaskWithOptions(String instanceId, ListWarehouseScheduleTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarehouseScheduleTask"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listWarehouseScheduleTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarehouseScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>计算分时弹性计划列表</p>
     * 
     * @param request ListWarehouseScheduleTaskRequest
     * @return ListWarehouseScheduleTaskResponse
     */
    public ListWarehouseScheduleTaskResponse listWarehouseScheduleTask(String instanceId, ListWarehouseScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWarehouseScheduleTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of virtual warehouse instances.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarehousesResponse
     */
    public ListWarehousesResponse listWarehousesWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarehouses"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/listWarehouses"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarehousesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of virtual warehouse instances.</p>
     * @return ListWarehousesResponse
     */
    public ListWarehousesResponse listWarehouses(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWarehousesWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例迁移</p>
     * 
     * @param request MigrateInstanceZoneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateInstanceZoneResponse
     */
    public MigrateInstanceZoneResponse migrateInstanceZoneWithOptions(String instanceId, MigrateInstanceZoneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateInstanceZone"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/migrateInstanceZone"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateInstanceZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例迁移</p>
     * 
     * @param request MigrateInstanceZoneRequest
     * @return MigrateInstanceZoneResponse
     */
    public MigrateInstanceZoneResponse migrateInstanceZone(String instanceId, MigrateInstanceZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateInstanceZoneWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>准备升级</p>
     * 
     * @param request PrepareUpgradeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrepareUpgradeResponse
     */
    public PrepareUpgradeResponse prepareUpgradeWithOptions(String instanceId, PrepareUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrepareUpgrade"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/upgrade/prepare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrepareUpgradeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>准备升级</p>
     * 
     * @param request PrepareUpgradeRequest
     * @return PrepareUpgradeResponse
     */
    public PrepareUpgradeResponse prepareUpgrade(String instanceId, PrepareUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.prepareUpgradeWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers shard rebalancing for a virtual warehouse.</p>
     * 
     * @param request RebalanceHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebalanceHoloWarehouseResponse
     */
    public RebalanceHoloWarehouseResponse rebalanceHoloWarehouseWithOptions(String instanceId, RebalanceHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebalanceHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rebalanceHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebalanceHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers shard rebalancing for a virtual warehouse.</p>
     * 
     * @param request RebalanceHoloWarehouseRequest
     * @return RebalanceHoloWarehouseResponse
     */
    public RebalanceHoloWarehouseResponse rebalanceHoloWarehouse(String instanceId, RebalanceHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebalanceHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a virtual warehouse.</p>
     * 
     * @param request RenameHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameHoloWarehouseResponse
     */
    public RenameHoloWarehouseResponse renameHoloWarehouseWithOptions(String instanceId, RenameHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newWarehouseName)) {
            body.put("newWarehouseName", request.newWarehouseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/renameHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a virtual warehouse.</p>
     * 
     * @param request RenameHoloWarehouseRequest
     * @return RenameHoloWarehouseResponse
     */
    public RenameHoloWarehouseResponse renameHoloWarehouse(String instanceId, RenameHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>For more information about how to renew a Hologres instance, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.38e731c9VAwtDP">Manage renewals</a>.</li>
     * <li>You can renew only subscription instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Manually renews a Hologres instance. You can enable monthly auto-renewal when you renew a Hologres instance.</p>
     * 
     * @param request RenewInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(String instanceId, RenewInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("autoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("duration", request.duration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/renew"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>For more information about how to renew a Hologres instance, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.38e731c9VAwtDP">Manage renewals</a>.</li>
     * <li>You can renew only subscription instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Manually renews a Hologres instance. You can enable monthly auto-renewal when you renew a Hologres instance.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(String instanceId, RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新证书</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewSSLCertificateResponse
     */
    public RenewSSLCertificateResponse renewSSLCertificateWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewSSLCertificate"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/renewSSLCertificate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewSSLCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新证书</p>
     * @return RenewSSLCertificateResponse
     */
    public RenewSSLCertificateResponse renewSSLCertificate(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewSSLCertificateWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a virtual warehouse.</p>
     * 
     * @param request RestartHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartHoloWarehouseResponse
     */
    public RestartHoloWarehouseResponse restartHoloWarehouseWithOptions(String instanceId, RestartHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/restartHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a virtual warehouse.</p>
     * 
     * @param request RestartHoloWarehouseRequest
     * @return RestartHoloWarehouseResponse
     */
    public RestartHoloWarehouseResponse restartHoloWarehouse(String instanceId, RestartHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an instance.</p>
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a virtual warehouse.</p>
     * 
     * @param request ResumeHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeHoloWarehouseResponse
     */
    public ResumeHoloWarehouseResponse resumeHoloWarehouseWithOptions(String instanceId, ResumeHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/resumeHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a virtual warehouse.</p>
     * 
     * @param request ResumeHoloWarehouseRequest
     * @return ResumeHoloWarehouseResponse
     */
    public ResumeHoloWarehouseResponse resumeHoloWarehouse(String instanceId, ResumeHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes an instance.</p>
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消DB授权</p>
     * 
     * @param request RevokeDatabasePermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeDatabasePermissionResponse
     */
    public RevokeDatabasePermissionResponse revokeDatabasePermissionWithOptions(String instanceId, RevokeDatabasePermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            body.put("privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeDatabasePermission"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/revokeDatabasePermission"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeDatabasePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消DB授权</p>
     * 
     * @param request RevokeDatabasePermissionRequest
     * @return RevokeDatabasePermissionResponse
     */
    public RevokeDatabasePermissionResponse revokeDatabasePermission(String instanceId, RevokeDatabasePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeDatabasePermissionWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消Schema授权</p>
     * 
     * @param request RevokeSchemaPermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeSchemaPermissionResponse
     */
    public RevokeSchemaPermissionResponse revokeSchemaPermissionWithOptions(String instanceId, RevokeSchemaPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            body.put("privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("schemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSchemaPermission"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/revokeSchemaPermission"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSchemaPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消Schema授权</p>
     * 
     * @param request RevokeSchemaPermissionRequest
     * @return RevokeSchemaPermissionResponse
     */
    public RevokeSchemaPermissionResponse revokeSchemaPermission(String instanceId, RevokeSchemaPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeSchemaPermissionWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消表授权</p>
     * 
     * @param request RevokeTablePermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeTablePermissionResponse
     */
    public RevokeTablePermissionResponse revokeTablePermissionWithOptions(String instanceId, RevokeTablePermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allTable)) {
            body.put("allTable", request.allTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNames)) {
            body.put("columnNames", request.columnNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("databaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            body.put("privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("schemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("tableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeTablePermission"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/revokeTablePermission"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTablePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消表授权</p>
     * 
     * @param request RevokeTablePermissionRequest
     * @return RevokeTablePermissionResponse
     */
    public RevokeTablePermissionResponse revokeTablePermission(String instanceId, RevokeTablePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeTablePermissionWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scales in or out a virtual warehouse.</p>
     * 
     * @param request ScaleHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleHoloWarehouseResponse
     */
    public ScaleHoloWarehouseResponse scaleHoloWarehouseWithOptions(String instanceId, ScaleHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterCount)) {
            body.put("clusterCount", request.clusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scaleHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Scales in or out a virtual warehouse.</p>
     * 
     * @param request ScaleHoloWarehouseRequest
     * @return ScaleHoloWarehouseResponse
     */
    public ScaleHoloWarehouseResponse scaleHoloWarehouse(String instanceId, ScaleHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>During the change of computing resource specifications of a Hologres instance, the instance is unavailable. During the change of storage resource specifications of a Hologres instance, the instance can work normally. Do not frequently change instance specifications. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the specifications and storage space of a Hologres instance.</p>
     * 
     * @param request ScaleInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleInstanceResponse
     */
    public ScaleInstanceResponse scaleInstanceWithOptions(String instanceId, ScaleInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coldStorageSize)) {
            body.put("coldStorageSize", request.coldStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableServerlessComputing)) {
            body.put("enableServerlessComputing", request.enableServerlessComputing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayCount)) {
            body.put("gatewayCount", request.gatewayCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            body.put("scaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            body.put("storageSize", request.storageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scale"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>During the change of computing resource specifications of a Hologres instance, the instance is unavailable. During the change of storage resource specifications of a Hologres instance, the instance can work normally. Do not frequently change instance specifications. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the specifications and storage space of a Hologres instance.</p>
     * 
     * @param request ScaleInstanceRequest
     * @return ScaleInstanceResponse
     */
    public ScaleInstanceResponse scaleInstance(String instanceId, ScaleInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an instance.</p>
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends a virtual warehouse.</p>
     * 
     * @param request SuspendHoloWarehouseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendHoloWarehouseResponse
     */
    public SuspendHoloWarehouseResponse suspendHoloWarehouseWithOptions(String instanceId, SuspendHoloWarehouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendHoloWarehouse"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/suspendHoloWarehouse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendHoloWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends a virtual warehouse.</p>
     * 
     * @param request SuspendHoloWarehouseRequest
     * @return SuspendHoloWarehouseResponse
     */
    public SuspendHoloWarehouseResponse suspendHoloWarehouse(String instanceId, SuspendHoloWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.suspendHoloWarehouseWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增tag</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerUid)) {
            body.put("tagOwnerUid", request.tagOwnerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tag"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增tag</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解除绑定主实例</p>
     * 
     * @param request UnBindLeaderInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnBindLeaderInstanceResponse
     */
    public UnBindLeaderInstanceResponse unBindLeaderInstanceWithOptions(String instanceId, UnBindLeaderInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnBindLeaderInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/unBindReadOnly"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnBindLeaderInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除绑定主实例</p>
     * 
     * @param request UnBindLeaderInstanceRequest
     * @return UnBindLeaderInstanceResponse
     */
    public UnBindLeaderInstanceResponse unBindLeaderInstance(String instanceId, UnBindLeaderInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unBindLeaderInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除tag</p>
     * 
     * @param request UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            body.put("tagKeys", request.tagKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerUid)) {
            body.put("tagOwnerUid", request.tagOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tag/unTag"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除tag</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改小版本自动升级开关</p>
     * 
     * @param request UpdateAutoUpgradeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoUpgradeResponse
     */
    public UpdateAutoUpgradeResponse updateAutoUpgradeWithOptions(String instanceId, UpdateAutoUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoUpgrade)) {
            body.put("autoUpgrade", request.autoUpgrade);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoUpgrade"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/autoUpgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoUpgradeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改小版本自动升级开关</p>
     * 
     * @param request UpdateAutoUpgradeRequest
     * @return UpdateAutoUpgradeResponse
     */
    public UpdateAutoUpgradeResponse updateAutoUpgrade(String instanceId, UpdateAutoUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAutoUpgradeWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新备份描述</p>
     * 
     * @param request UpdateBackupDataDescRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBackupDataDescResponse
     */
    public UpdateBackupDataDescResponse updateBackupDataDescWithOptions(String id, UpdateBackupDataDescRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBackupDataDesc"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/backups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/desc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBackupDataDescResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新备份描述</p>
     * 
     * @param request UpdateBackupDataDescRequest
     * @return UpdateBackupDataDescResponse
     */
    public UpdateBackupDataDescResponse updateBackupDataDesc(String id, UpdateBackupDataDescRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBackupDataDescWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改holoweb登陆权限</p>
     * 
     * @param request UpdateHoloWebLoginSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHoloWebLoginSettingResponse
     */
    public UpdateHoloWebLoginSettingResponse updateHoloWebLoginSettingWithOptions(String instanceId, UpdateHoloWebLoginSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowExternalAccountsLogin)) {
            body.put("allowExternalAccountsLogin", request.allowExternalAccountsLogin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHoloWebLoginSetting"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/updateHoloWebLoginSetting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHoloWebLoginSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改holoweb登陆权限</p>
     * 
     * @param request UpdateHoloWebLoginSettingRequest
     * @return UpdateHoloWebLoginSettingResponse
     */
    public UpdateHoloWebLoginSettingResponse updateHoloWebLoginSetting(String instanceId, UpdateHoloWebLoginSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHoloWebLoginSettingWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of an instance.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceNameWithOptions(String instanceId, UpdateInstanceNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceName"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/instanceName"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of an instance.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(String instanceId, UpdateInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceNameWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the network configuration of an instance.</p>
     * 
     * @param request UpdateInstanceNetworkTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceNetworkTypeResponse
     */
    public UpdateInstanceNetworkTypeResponse updateInstanceNetworkTypeWithOptions(String instanceId, UpdateInstanceNetworkTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anyTunnelToSingleTunnel)) {
            body.put("anyTunnelToSingleTunnel", request.anyTunnelToSingleTunnel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkTypes)) {
            body.put("networkTypes", request.networkTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("vSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcOwnerId)) {
            body.put("vpcOwnerId", request.vpcOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcRegionId)) {
            body.put("vpcRegionId", request.vpcRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceNetworkType"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/network"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNetworkTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the network configuration of an instance.</p>
     * 
     * @param request UpdateInstanceNetworkTypeRequest
     * @return UpdateInstanceNetworkTypeResponse
     */
    public UpdateInstanceNetworkTypeResponse updateInstanceNetworkType(String instanceId, UpdateInstanceNetworkTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceNetworkTypeWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改端口号</p>
     * 
     * @param request UpdateInstancePortRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstancePortResponse
     */
    public UpdateInstancePortResponse updateInstancePortWithOptions(String instanceId, UpdateInstancePortRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstancePort"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/updatePort"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstancePortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改端口号</p>
     * 
     * @param request UpdateInstancePortRequest
     * @return UpdateInstancePortResponse
     */
    public UpdateInstancePortResponse updateInstancePort(String instanceId, UpdateInstancePortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstancePortWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改可维护时间窗口</p>
     * 
     * @param request UpdateMaintenanceWindowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMaintenanceWindowResponse
     */
    public UpdateMaintenanceWindowResponse updateMaintenanceWindowWithOptions(String instanceId, UpdateMaintenanceWindowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMaintenanceWindow"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/maintenanceWindow"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMaintenanceWindowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改可维护时间窗口</p>
     * 
     * @param request UpdateMaintenanceWindowRequest
     * @return UpdateMaintenanceWindowResponse
     */
    public UpdateMaintenanceWindowResponse updateMaintenanceWindow(String instanceId, UpdateMaintenanceWindowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMaintenanceWindowWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型服务</p>
     * 
     * @param request UpdateModelServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelServiceResponse
     */
    public UpdateModelServiceResponse updateModelServiceWithOptions(String instanceId, UpdateModelServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpu)) {
            body.put("gpu", request.gpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceName)) {
            body.put("modelServiceName", request.modelServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCount)) {
            body.put("serviceCount", request.serviceCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelService"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/updateModelService"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型服务</p>
     * 
     * @param request UpdateModelServiceRequest
     * @return UpdateModelServiceResponse
     */
    public UpdateModelServiceResponse updateModelService(String instanceId, UpdateModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelServiceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改运维事件执行时间</p>
     * 
     * @param request UpdateOperationEventScheduleTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOperationEventScheduleTimeResponse
     */
    public UpdateOperationEventScheduleTimeResponse updateOperationEventScheduleTimeWithOptions(String instanceId, UpdateOperationEventScheduleTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            body.put("scheduleTime", request.scheduleTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOperationEventScheduleTime"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/updateOperationEventScheduleTime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOperationEventScheduleTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改运维事件执行时间</p>
     * 
     * @param request UpdateOperationEventScheduleTimeRequest
     * @return UpdateOperationEventScheduleTimeResponse
     */
    public UpdateOperationEventScheduleTimeResponse updateOperationEventScheduleTime(String instanceId, UpdateOperationEventScheduleTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOperationEventScheduleTimeWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置周期备份</p>
     * 
     * @param request UpdateScheduledBackupConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduledBackupConfigResponse
     */
    public UpdateScheduledBackupConfigResponse updateScheduledBackupConfigWithOptions(UpdateScheduledBackupConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataKeepQuantity)) {
            body.put("dataKeepQuantity", request.dataKeepQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstRegion)) {
            body.put("dstRegion", request.dstRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hour)) {
            body.put("hour", request.hour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manualDataKeepQuantity)) {
            body.put("manualDataKeepQuantity", request.manualDataKeepQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("scheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.week)) {
            body.put("week", request.week);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduledBackupConfig"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/backups/scheduledConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduledBackupConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置周期备份</p>
     * 
     * @param request UpdateScheduledBackupConfigRequest
     * @return UpdateScheduledBackupConfigResponse
     */
    public UpdateScheduledBackupConfigResponse updateScheduledBackupConfig(UpdateScheduledBackupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateScheduledBackupConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建分时弹性计划</p>
     * 
     * @param request UpdateWarehouseScheduleTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWarehouseScheduleTaskResponse
     */
    public UpdateWarehouseScheduleTaskResponse updateWarehouseScheduleTaskWithOptions(String instanceId, UpdateWarehouseScheduleTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticCu)) {
            body.put("elasticCu", request.elasticCu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            body.put("warehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWarehouseScheduleTask"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/updateWarehouseScheduleTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWarehouseScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建分时弹性计划</p>
     * 
     * @param request UpdateWarehouseScheduleTaskRequest
     * @return UpdateWarehouseScheduleTaskResponse
     */
    public UpdateWarehouseScheduleTaskResponse updateWarehouseScheduleTask(String instanceId, UpdateWarehouseScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWarehouseScheduleTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开始升级</p>
     * 
     * @param request UpgradeInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstanceWithOptions(String instanceId, UpgradeInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeTime)) {
            query.put("upgradeTime", request.upgradeTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeInstance"),
            new TeaPair("version", "2022-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开始升级</p>
     * 
     * @param request UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstance(String instanceId, UpgradeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeInstanceWithOptions(instanceId, request, headers, runtime);
    }
}
