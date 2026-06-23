// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111;

import com.aliyun.tea.*;
import com.aliyun.clickhouse20191111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-edge-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-fujian", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hongkong", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-qingdao", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-wuhan", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "clickhouse.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "clickhouse.aliyuncs.com"),
            new TeaPair("me-east-1", "clickhouse.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("us-east-1", "clickhouse.aliyuncs.com"),
            new TeaPair("us-west-1", "clickhouse.aliyuncs.com"),
            new TeaPair("me-central-1", "clickhouse.me-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "clickhouse.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "clickhouse.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "clickhouse.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "clickhouse.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "clickhouse.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "clickhouse.cn-chengdu.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "clickhouse.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "clickhouse.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "clickhouse.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "clickhouse.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("clickhouse", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Allocates a public endpoint for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request AllocateClusterPublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateClusterPublicConnectionResponse
     */
    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnectionWithOptions(AllocateClusterPublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateClusterPublicConnection"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateClusterPublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Allocates a public endpoint for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request AllocateClusterPublicConnectionRequest
     * @return AllocateClusterPublicConnectionResponse
     */
    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateClusterPublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels tasks for O&amp;M events.</p>
     * 
     * @param request CancelActiveOperationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelActiveOperationTasksResponse
     */
    public CancelActiveOperationTasksResponse cancelActiveOperationTasksWithOptions(CancelActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelActiveOperationTasks"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelActiveOperationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels tasks for O&amp;M events.</p>
     * 
     * @param request CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    public CancelActiveOperationTasksResponse cancelActiveOperationTasks(CancelActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelActiveOperationTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a scheduled ZooKeeper leader switchover on a community-compatible ClickHouse instance.</p>
     * 
     * @param request CancelAppointmentElectZookeeperLeaderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAppointmentElectZookeeperLeaderResponse
     */
    public CancelAppointmentElectZookeeperLeaderResponse cancelAppointmentElectZookeeperLeaderWithOptions(CancelAppointmentElectZookeeperLeaderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAppointmentElectZookeeperLeader"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAppointmentElectZookeeperLeaderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a scheduled ZooKeeper leader switchover on a community-compatible ClickHouse instance.</p>
     * 
     * @param request CancelAppointmentElectZookeeperLeaderRequest
     * @return CancelAppointmentElectZookeeperLeaderResponse
     */
    public CancelAppointmentElectZookeeperLeaderResponse cancelAppointmentElectZookeeperLeader(CancelAppointmentElectZookeeperLeaderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAppointmentElectZookeeperLeaderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the scheduled restart on the specified ClickHouse nodes.</p>
     * 
     * @param request CancelAppointmentRestartInstanceNodeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAppointmentRestartInstanceNodeListResponse
     */
    public CancelAppointmentRestartInstanceNodeListResponse cancelAppointmentRestartInstanceNodeListWithOptions(CancelAppointmentRestartInstanceNodeListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAppointmentRestartInstanceNodeList"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAppointmentRestartInstanceNodeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the scheduled restart on the specified ClickHouse nodes.</p>
     * 
     * @param request CancelAppointmentRestartInstanceNodeListRequest
     * @return CancelAppointmentRestartInstanceNodeListResponse
     */
    public CancelAppointmentRestartInstanceNodeListResponse cancelAppointmentRestartInstanceNodeList(CancelAppointmentRestartInstanceNodeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAppointmentRestartInstanceNodeListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a scheduled restart for a specific community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CancelRestartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRestartInstanceResponse
     */
    public CancelRestartInstanceResponse cancelRestartInstanceWithOptions(CancelRestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartTime)) {
            query.put("RestartTime", request.restartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRestartInstance"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRestartInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a scheduled restart for a specific community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CancelRestartInstanceRequest
     * @return CancelRestartInstanceResponse
     */
    public CancelRestartInstanceResponse cancelRestartInstance(CancelRestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRestartInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group of a community-edition compatible ClickHouse cluster.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-11-11"),
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
     * <p>Changes the resource group of a community-edition compatible ClickHouse cluster.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the CheckClickhouseToRDS operation to verify the connectivity between a community-compatible ApsaraDB for ClickHouse cluster and an ApsaraDB RDS for MySQL instance.</p>
     * 
     * @param request CheckClickhouseToRDSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckClickhouseToRDSResponse
     */
    public CheckClickhouseToRDSResponse checkClickhouseToRDSWithOptions(CheckClickhouseToRDSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ckPassword)) {
            query.put("CkPassword", request.ckPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ckUserName)) {
            query.put("CkUserName", request.ckUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clickhousePort)) {
            query.put("ClickhousePort", request.clickhousePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsId)) {
            query.put("RdsId", request.rdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsPassword)) {
            query.put("RdsPassword", request.rdsPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsPort)) {
            query.put("RdsPort", request.rdsPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsUserName)) {
            query.put("RdsUserName", request.rdsUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsVpcId)) {
            query.put("RdsVpcId", request.rdsVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsVpcUrl)) {
            query.put("RdsVpcUrl", request.rdsVpcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckClickhouseToRDS"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckClickhouseToRDSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the CheckClickhouseToRDS operation to verify the connectivity between a community-compatible ApsaraDB for ClickHouse cluster and an ApsaraDB RDS for MySQL instance.</p>
     * 
     * @param request CheckClickhouseToRDSRequest
     * @return CheckClickhouseToRDSResponse
     */
    public CheckClickhouseToRDSResponse checkClickhouseToRDS(CheckClickhouseToRDSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkClickhouseToRDSWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>该接口仅支持 2021 年 12 月 01 日之后创建的社区兼容版集群。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether changing the configuration parameters of an ApsaraDB for ClickHouse community-compatible cluster in XML mode requires a restart.</p>
     * 
     * @param request CheckModifyConfigNeedRestartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckModifyConfigNeedRestartResponse
     */
    public CheckModifyConfigNeedRestartResponse checkModifyConfigNeedRestartWithOptions(CheckModifyConfigNeedRestartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckModifyConfigNeedRestart"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckModifyConfigNeedRestartResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>该接口仅支持 2021 年 12 月 01 日之后创建的社区兼容版集群。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether changing the configuration parameters of an ApsaraDB for ClickHouse community-compatible cluster in XML mode requires a restart.</p>
     * 
     * @param request CheckModifyConfigNeedRestartRequest
     * @return CheckModifyConfigNeedRestartResponse
     */
    public CheckModifyConfigNeedRestartResponse checkModifyConfigNeedRestart(CheckModifyConfigNeedRestartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkModifyConfigNeedRestartWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible clusters of version 20.8 or later that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the CheckMonitorAlert operation to check whether the alert monitoring feature of Application Real-Time Monitoring Service (ARMS) is enabled for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CheckMonitorAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMonitorAlertResponse
     */
    public CheckMonitorAlertResponse checkMonitorAlertWithOptions(CheckMonitorAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMonitorAlert"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMonitorAlertResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible clusters of version 20.8 or later that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the CheckMonitorAlert operation to check whether the alert monitoring feature of Application Real-Time Monitoring Service (ARMS) is enabled for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CheckMonitorAlertRequest
     * @return CheckMonitorAlertResponse
     */
    public CheckMonitorAlertResponse checkMonitorAlert(CheckMonitorAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMonitorAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a migration scale-out check on a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CheckScaleOutBalancedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckScaleOutBalancedResponse
     */
    public CheckScaleOutBalancedResponse checkScaleOutBalancedWithOptions(CheckScaleOutBalancedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingType)) {
            query.put("ScalingType", request.scalingType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckScaleOutBalanced"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckScaleOutBalancedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a migration scale-out check on a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CheckScaleOutBalancedRequest
     * @return CheckScaleOutBalancedResponse
     */
    public CheckScaleOutBalancedResponse checkScaleOutBalanced(CheckScaleOutBalancedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkScaleOutBalancedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service-linked role for ApsaraDB for ClickHouse.</p>
     * 
     * @param request CheckServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRoleWithOptions(CheckServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceLinkedRole"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service-linked role for ApsaraDB for ClickHouse.</p>
     * 
     * @param request CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database account for an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database account for an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is available only for cluster versions 21.8 and earlier. For newer versions, use a high-privilege account and SQL statements to modify user permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a database account and grants permissions.</p>
     * 
     * @param request CreateAccountAndAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountAndAuthorityResponse
     */
    public CreateAccountAndAuthorityResponse createAccountAndAuthorityWithOptions(CreateAccountAndAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowDatabases)) {
            query.put("AllowDatabases", request.allowDatabases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowDictionaries)) {
            query.put("AllowDictionaries", request.allowDictionaries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddlAuthority)) {
            query.put("DdlAuthority", request.ddlAuthority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmlAuthority)) {
            query.put("DmlAuthority", request.dmlAuthority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalDatabases)) {
            query.put("TotalDatabases", request.totalDatabases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalDictionaries)) {
            query.put("TotalDictionaries", request.totalDictionaries);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccountAndAuthority"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountAndAuthorityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is available only for cluster versions 21.8 and earlier. For newer versions, use a high-privilege account and SQL statements to modify user permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a database account and grants permissions.</p>
     * 
     * @param request CreateAccountAndAuthorityRequest
     * @return CreateAccountAndAuthorityResponse
     */
    public CreateAccountAndAuthorityResponse createAccountAndAuthority(CreateAccountAndAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountAndAuthorityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>ApsaraDB for ClickHouse supports data backup for clusters that run version 20.3, 20.8, or 21.8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup policy.</p>
     * 
     * @param request CreateBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupPolicyResponse
     */
    public CreateBackupPolicyResponse createBackupPolicyWithOptions(CreateBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackupPolicy"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>ApsaraDB for ClickHouse supports data backup for clusters that run version 20.3, 20.8, or 21.8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup policy.</p>
     * 
     * @param request CreateBackupPolicyRequest
     * @return CreateBackupPolicyResponse
     */
    public CreateBackupPolicyResponse createBackupPolicy(CreateBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you understand the billing method and <a href="https://help.aliyun.com/document_detail/167450.html">price</a> of ApsaraDB for ClickHouse.</p>
     * 
     * <b>summary</b> : 
     * <p>Create an Alibaba Cloud ClickHouse cluster.</p>
     * 
     * @param request CreateDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetID)) {
            query.put("BackupSetID", request.backupSetID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterCategory)) {
            query.put("DBClusterCategory", request.DBClusterCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterClass)) {
            query.put("DBClusterClass", request.DBClusterClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterNetworkType)) {
            query.put("DBClusterNetworkType", request.DBClusterNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterVersion)) {
            query.put("DBClusterVersion", request.DBClusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeGroupCount)) {
            query.put("DBNodeGroupCount", request.DBNodeGroupCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeStorage)) {
            query.put("DBNodeStorage", request.DBNodeStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbNodeStorageType)) {
            query.put("DbNodeStorageType", request.dbNodeStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            query.put("EncryptionType", request.encryptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBClusterId)) {
            query.put("SourceDBClusterId", request.sourceDBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchBak)) {
            query.put("VSwitchBak", request.vSwitchBak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchBak2)) {
            query.put("VSwitchBak2", request.vSwitchBak2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zondIdBak2)) {
            query.put("ZondIdBak2", request.zondIdBak2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIdBak)) {
            query.put("ZoneIdBak", request.zoneIdBak);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBInstance"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you understand the billing method and <a href="https://help.aliyun.com/document_detail/167450.html">price</a> of ApsaraDB for ClickHouse.</p>
     * 
     * <b>summary</b> : 
     * <p>Create an Alibaba Cloud ClickHouse cluster.</p>
     * 
     * @param request CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitoring data report.</p>
     * 
     * @param request CreateMonitorDataReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorDataReportResponse
     */
    public CreateMonitorDataReportResponse createMonitorDataReportWithOptions(CreateMonitorDataReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorDataReport"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorDataReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitoring data report.</p>
     * 
     * @param request CreateMonitorDataReportRequest
     * @return CreateMonitorDataReportResponse
     */
    public CreateMonitorDataReportResponse createMonitorDataReport(CreateMonitorDataReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorDataReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The tiered storage of hot and cold data feature is supported only by community-compatible clusters that run version 20.8 or later. For clusters that run an earlier version, you must migrate data to a cluster that runs version 20.8 or later before you can configure tiered storage. For more information about data migration, see <a href="https://help.aliyun.com/document_detail/276926.html">Data migration between ApsaraDB for ClickHouse instances</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cold storage space.</p>
     * 
     * @param request CreateOSSStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOSSStorageResponse
     */
    public CreateOSSStorageResponse createOSSStorageWithOptions(CreateOSSStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOSSStorage"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOSSStorageResponse());
    }

    /**
     * <b>description</b> :
     * <p>The tiered storage of hot and cold data feature is supported only by community-compatible clusters that run version 20.8 or later. For clusters that run an earlier version, you must migrate data to a cluster that runs version 20.8 or later before you can configure tiered storage. For more information about data migration, see <a href="https://help.aliyun.com/document_detail/276926.html">Data migration between ApsaraDB for ClickHouse instances</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cold storage space.</p>
     * 
     * @param request CreateOSSStorageRequest
     * @return CreateOSSStorageResponse
     */
    public CreateOSSStorageResponse createOSSStorage(CreateOSSStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOSSStorageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must manually enable the MySQL port for community-compatible clusters of version 20.8 or later that were created before December 1, 2021. For clusters created on or after this date, the MySQL port is enabled automatically.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables the MySQL or HTTPS port for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CreatePortsForClickHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePortsForClickHouseResponse
     */
    public CreatePortsForClickHouseResponse createPortsForClickHouseWithOptions(CreatePortsForClickHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portType)) {
            query.put("PortType", request.portType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePortsForClickHouse"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePortsForClickHouseResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must manually enable the MySQL port for community-compatible clusters of version 20.8 or later that were created before December 1, 2021. For clusters created on or after this date, the MySQL port is enabled automatically.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables the MySQL or HTTPS port for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CreatePortsForClickHouseRequest
     * @return CreatePortsForClickHouseResponse
     */
    public CreatePortsForClickHouseResponse createPortsForClickHouse(CreatePortsForClickHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPortsForClickHouseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to ApsaraDB for ClickHouse Community-Compatible Edition clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateRDSToClickhouseDb operation to create a sync task for an ApsaraDB for ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request CreateRDSToClickhouseDbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRDSToClickhouseDbResponse
     */
    public CreateRDSToClickhouseDbResponse createRDSToClickhouseDbWithOptions(CreateRDSToClickhouseDbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ckPassword)) {
            query.put("CkPassword", request.ckPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ckUserName)) {
            query.put("CkUserName", request.ckUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clickhousePort)) {
            query.put("ClickhousePort", request.clickhousePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitUpper)) {
            query.put("LimitUpper", request.limitUpper);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsId)) {
            query.put("RdsId", request.rdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsPassword)) {
            query.put("RdsPassword", request.rdsPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsPort)) {
            query.put("RdsPort", request.rdsPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsUserName)) {
            query.put("RdsUserName", request.rdsUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsVpcId)) {
            query.put("RdsVpcId", request.rdsVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsVpcUrl)) {
            query.put("RdsVpcUrl", request.rdsVpcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipUnsupported)) {
            query.put("SkipUnsupported", request.skipUnsupported);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synDbTables)) {
            query.put("SynDbTables", request.synDbTables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRDSToClickhouseDb"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRDSToClickhouseDbResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to ApsaraDB for ClickHouse Community-Compatible Edition clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateRDSToClickhouseDb operation to create a sync task for an ApsaraDB for ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request CreateRDSToClickhouseDbRequest
     * @return CreateRDSToClickhouseDbResponse
     */
    public CreateRDSToClickhouseDbResponse createRDSToClickhouseDb(CreateRDSToClickhouseDbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRDSToClickhouseDbWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>An SLB instance is a network-layer dependency that provides services for external connections and supports failover. It attaches a domain name to the IP addresses of ClickHouse nodes. The SLB instance balances and forwards cluster requests to internal nodes to distribute traffic in a multi-node deployment. It also performs health checks on backend nodes. If a node becomes unavailable, the SLB instance checks its health status and automatically isolates it. This ensures that request traffic is distributed to active nodes.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateSLB operation to attach a Server Load Balancer (SLB) instance to a specified ApsaraDB for ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request CreateSLBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSLBResponse
     */
    public CreateSLBResponse createSLBWithOptions(CreateSLBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSLB"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSLBResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>An SLB instance is a network-layer dependency that provides services for external connections and supports failover. It attaches a domain name to the IP addresses of ClickHouse nodes. The SLB instance balances and forwards cluster requests to internal nodes to distribute traffic in a multi-node deployment. It also performs health checks on backend nodes. If a node becomes unavailable, the SLB instance checks its health status and automatically isolates it. This ensures that request traffic is distributed to active nodes.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateSLB operation to attach a Server Load Balancer (SLB) instance to a specified ApsaraDB for ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request CreateSLBRequest
     * @return CreateSLBResponse
     */
    public CreateSLBResponse createSLB(CreateSLBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSLBWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible clusters that run version 20.8 or later and were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the CreateSQLAccount operation to create a privileged or standard account for an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CreateSQLAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSQLAccountResponse
     */
    public CreateSQLAccountResponse createSQLAccountWithOptions(CreateSQLAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSQLAccount"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSQLAccountResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible clusters that run version 20.8 or later and were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the CreateSQLAccount operation to create a privileged or standard account for an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request CreateSQLAccountRequest
     * @return CreateSQLAccountResponse
     */
    public CreateSQLAccountResponse createSQLAccount(CreateSQLAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSQLAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role.</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role.</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a database account is deleted, you cannot use it to connect to ApsaraDB for ClickHouse. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account from an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a database account is deleted, you cannot use it to connect to ApsaraDB for ClickHouse. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account from an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The data backup feature is available only for ApsaraDB for ClickHouse clusters running version 21.8 or later.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the backup policy for a community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DeleteBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupPolicyResponse
     */
    public DeleteBackupPolicyResponse deleteBackupPolicyWithOptions(DeleteBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackupPolicy"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The data backup feature is available only for ApsaraDB for ClickHouse clusters running version 21.8 or later.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the backup policy for a community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    public DeleteBackupPolicyResponse deleteBackupPolicy(DeleteBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * After a cluster is deleted, all data in the cluster is deleted and cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified pay-as-you-go ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DeleteDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBClusterWithOptions(DeleteDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBCluster"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBClusterResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * After a cluster is deleted, all data in the cluster is deleted and cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified pay-as-you-go ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>After you release the SLB instance, the system performs simple load balancing based on the domain name. Health checks are no longer performed on nodes at the request routing layer. This may cause normal requests to be routed to unavailable nodes, which can result in read and write failures.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a Server Load Balancer (SLB) instance for a specified ApsaraDB for ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request DeleteSLBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSLBResponse
     */
    public DeleteSLBResponse deleteSLBWithOptions(DeleteSLBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSLB"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSLBResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>After you release the SLB instance, the system performs simple load balancing based on the domain name. Health checks are no longer performed on nodes at the request routing layer. This may cause normal requests to be routed to unavailable nodes, which can result in read and write failures.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a Server Load Balancer (SLB) instance for a specified ApsaraDB for ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request DeleteSLBRequest
     * @return DeleteSLBResponse
     */
    public DeleteSLBResponse deleteSLB(DeleteSLBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSLBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database synchronization task.</p>
     * 
     * @param request DeleteSyndbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSyndbResponse
     */
    public DeleteSyndbResponse deleteSyndbWithOptions(DeleteSyndbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synDb)) {
            query.put("SynDb", request.synDb);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSyndb"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSyndbResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database synchronization task.</p>
     * 
     * @param request DeleteSyndbRequest
     * @return DeleteSyndbResponse
     */
    public DeleteSyndbResponse deleteSyndb(DeleteSyndbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSyndbWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API applies only to clusters of v21.8 or earlier. For clusters running a later version, you must use a privileged account and execute SQL statements to modify the permissions of a regular user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions of a database account.</p>
     * 
     * @param request DescribeAccountAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountAuthorityResponse
     */
    public DescribeAccountAuthorityResponse describeAccountAuthorityWithOptions(DescribeAccountAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountAuthority"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountAuthorityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API applies only to clusters of v21.8 or earlier. For clusters running a later version, you must use a privileged account and execute SQL statements to modify the permissions of a regular user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions of a database account.</p>
     * 
     * @param request DescribeAccountAuthorityRequest
     * @return DescribeAccountAuthorityResponse
     */
    public DescribeAccountAuthorityResponse describeAccountAuthority(DescribeAccountAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountAuthorityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the database accounts of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccounts"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the database accounts of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the active Operations and Maintenance (O&amp;M) configuration of a ClickHouse instance.</p>
     * 
     * @param request DescribeActiveOperationMaintainConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveOperationMaintainConfResponse
     */
    public DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConfWithOptions(DescribeActiveOperationMaintainConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationMaintainConf"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationMaintainConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the active Operations and Maintenance (O&amp;M) configuration of a ClickHouse instance.</p>
     * 
     * @param request DescribeActiveOperationMaintainConfRequest
     * @return DescribeActiveOperationMaintainConfResponse
     */
    public DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationMaintainConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the active operation tasks of a ClickHouse instance.</p>
     * 
     * @param request DescribeActiveOperationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveOperationTasksResponse
     */
    public DescribeActiveOperationTasksResponse describeActiveOperationTasksWithOptions(DescribeActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowCancel)) {
            query.put("AllowCancel", request.allowCancel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowChange)) {
            query.put("AllowChange", request.allowChange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeLevel)) {
            query.put("ChangeLevel", request.changeLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insName)) {
            query.put("InsName", request.insName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationTasks"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the active operation tasks of a ClickHouse instance.</p>
     * 
     * @param request DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    public DescribeActiveOperationTasksResponse describeActiveOperationTasks(DescribeActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes all databases, tables, and columns in an instance.</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSourceWithOptions(DescribeAllDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllDataSource"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes all databases, tables, and columns in an instance.</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSource(DescribeAllDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all data sources.</p>
     * 
     * @param request DescribeAllDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllDataSourcesResponse
     */
    public DescribeAllDataSourcesResponse describeAllDataSourcesWithOptions(DescribeAllDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllDataSources"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all data sources.</p>
     * 
     * @param request DescribeAllDataSourcesRequest
     * @return DescribeAllDataSourcesResponse
     */
    public DescribeAllDataSourcesResponse describeAllDataSources(DescribeAllDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal status of a ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request DescribeAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoRenewAttributeResponse
     */
    public DescribeAutoRenewAttributeResponse describeAutoRenewAttributeWithOptions(DescribeAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoRenewAttribute"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoRenewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal status of a ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request DescribeAutoRenewAttributeRequest
     * @return DescribeAutoRenewAttributeResponse
     */
    public DescribeAutoRenewAttributeResponse describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Data backup is supported for ApsaraDB for ClickHouse clusters running version 20.3, 20.8, or 21.8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup settings for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Data backup is supported for ApsaraDB for ClickHouse clusters running version 20.3, 20.8, or 21.8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup settings for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The data backup feature is available only on ApsaraDB for ClickHouse clusters running version 21.8 or later.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup sets of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackups"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The data backup feature is available only on ApsaraDB for ClickHouse clusters running version 21.8 or later.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup sets of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can view columns.</p>
     * 
     * @param request DescribeColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumns"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can view columns.</p>
     * 
     * @param request DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only community-compatible clusters that are created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeConfigHistory operation to view the configuration parameter change history of a community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeConfigHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigHistoryResponse
     */
    public DescribeConfigHistoryResponse describeConfigHistoryWithOptions(DescribeConfigHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigHistory"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only community-compatible clusters that are created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeConfigHistory operation to view the configuration parameter change history of a community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeConfigHistoryRequest
     * @return DescribeConfigHistoryResponse
     */
    public DescribeConfigHistoryResponse describeConfigHistory(DescribeConfigHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeConfigVersionDifference operation to compare the parameter values of an ApsaraDB for ClickHouse community-compatible cluster before and after a configuration change.</p>
     * 
     * @param request DescribeConfigVersionDifferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigVersionDifferenceResponse
     */
    public DescribeConfigVersionDifferenceResponse describeConfigVersionDifferenceWithOptions(DescribeConfigVersionDifferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigVersionDifference"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigVersionDifferenceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeConfigVersionDifference operation to compare the parameter values of an ApsaraDB for ClickHouse community-compatible cluster before and after a configuration change.</p>
     * 
     * @param request DescribeConfigVersionDifferenceRequest
     * @return DescribeConfigVersionDifferenceResponse
     */
    public DescribeConfigVersionDifferenceResponse describeConfigVersionDifference(DescribeConfigVersionDifferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigVersionDifferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP address whitelist of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterAccessWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAccessWhiteListResponse
     */
    public DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteListWithOptions(DescribeDBClusterAccessWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAccessWhiteList"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAccessWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP address whitelist of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterAccessWhiteListRequest
     * @return DescribeDBClusterAccessWhiteListResponse
     */
    public DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAccessWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specific ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttributeWithOptions(DescribeDBClusterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAttribute"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specific ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The DescribeDBClusterConfig operation queries the parameter configuration of a community-compatible ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterConfigResponse
     */
    public DescribeDBClusterConfigResponse describeDBClusterConfigWithOptions(DescribeDBClusterConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterConfig"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The DescribeDBClusterConfig operation queries the parameter configuration of a community-compatible ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterConfigRequest
     * @return DescribeDBClusterConfigResponse
     */
    public DescribeDBClusterConfigResponse describeDBClusterConfig(DescribeDBClusterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only Community-Compatible Edition clusters that are created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the DescribeDBClusterConfigInXML operation to query the configuration parameters of an ApsaraDB for ClickHouse Community-Compatible Edition cluster in XML format.</p>
     * 
     * @param request DescribeDBClusterConfigInXMLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterConfigInXMLResponse
     */
    public DescribeDBClusterConfigInXMLResponse describeDBClusterConfigInXMLWithOptions(DescribeDBClusterConfigInXMLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterConfigInXML"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterConfigInXMLResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only Community-Compatible Edition clusters that are created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the DescribeDBClusterConfigInXML operation to query the configuration parameters of an ApsaraDB for ClickHouse Community-Compatible Edition cluster in XML format.</p>
     * 
     * @param request DescribeDBClusterConfigInXMLRequest
     * @return DescribeDBClusterConfigInXMLResponse
     */
    public DescribeDBClusterConfigInXMLResponse describeDBClusterConfigInXML(DescribeDBClusterConfigInXMLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterConfigInXMLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network information for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterNetInfoItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterNetInfoItemsResponse
     */
    public DescribeDBClusterNetInfoItemsResponse describeDBClusterNetInfoItemsWithOptions(DescribeDBClusterNetInfoItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterNetInfoItems"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterNetInfoItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network information for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request DescribeDBClusterNetInfoItemsRequest
     * @return DescribeDBClusterNetInfoItemsResponse
     */
    public DescribeDBClusterNetInfoItemsResponse describeDBClusterNetInfoItems(DescribeDBClusterNetInfoItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterNetInfoItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries node information for a ClickHouse Community-Compatible instance.</p>
     * 
     * @param request DescribeDBClusterNodeInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterNodeInfosResponse
     */
    public DescribeDBClusterNodeInfosResponse describeDBClusterNodeInfosWithOptions(DescribeDBClusterNodeInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterNodeInfos"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterNodeInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries node information for a ClickHouse Community-Compatible instance.</p>
     * 
     * @param request DescribeDBClusterNodeInfosRequest
     * @return DescribeDBClusterNodeInfosResponse
     */
    public DescribeDBClusterNodeInfosResponse describeDBClusterNodeInfos(DescribeDBClusterNodeInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterNodeInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can view the performance monitoring data for a specified cluster within a time range based on performance metrics. The data is collected every 30 seconds.</p>
     * <blockquote>
     * <p>This operation supports only ApsaraDB for ClickHouse Community-Compatible Edition clusters that were created before December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Views the performance data of an ApsaraDB for ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterPerformance"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can view the performance monitoring data for a specified cluster within a time range based on performance metrics. The data is collected every 30 seconds.</p>
     * <blockquote>
     * <p>This operation supports only ApsaraDB for ClickHouse Community-Compatible Edition clusters that were created before December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Views the performance data of an ApsaraDB for ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation queries the status set of a ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request DescribeDBClusterStatusSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterStatusSetResponse
     */
    public DescribeDBClusterStatusSetResponse describeDBClusterStatusSetWithOptions(DescribeDBClusterStatusSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterStatusSet"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterStatusSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation queries the status set of a ClickHouse Community-Compatible Edition cluster.</p>
     * 
     * @param request DescribeDBClusterStatusSetRequest
     * @return DescribeDBClusterStatusSetResponse
     */
    public DescribeDBClusterStatusSetResponse describeDBClusterStatusSet(DescribeDBClusterStatusSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterStatusSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes ApsaraDB for ClickHouse clusters in a specified region.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClustersWithOptions(DescribeDBClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterStatus)) {
            query.put("DBClusterStatus", request.DBClusterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusters"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes ApsaraDB for ClickHouse clusters in a specified region.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The DescribeDBConfig operation queries the configuration of a community-compatible cluster.</p>
     * 
     * @param request DescribeDBConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBConfigResponse
     */
    public DescribeDBConfigResponse describeDBConfigWithOptions(DescribeDBConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBConfig"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The DescribeDBConfig operation queries the configuration of a community-compatible cluster.</p>
     * 
     * @param request DescribeDBConfigRequest
     * @return DescribeDBConfigResponse
     */
    public DescribeDBConfigResponse describeDBConfig(DescribeDBConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata of Operations and Maintenance (O&amp;M) events for a ClickHouse-compatible cluster.</p>
     * 
     * @param request DescribeEventMetaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventMetaInfoResponse
     */
    public DescribeEventMetaInfoResponse describeEventMetaInfoWithOptions(DescribeEventMetaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventMetaInfo"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventMetaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata of Operations and Maintenance (O&amp;M) events for a ClickHouse-compatible cluster.</p>
     * 
     * @param request DescribeEventMetaInfoRequest
     * @return DescribeEventMetaInfoResponse
     */
    public DescribeEventMetaInfoResponse describeEventMetaInfo(DescribeEventMetaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventMetaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cold storage information.</p>
     * 
     * @param request DescribeOSSStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOSSStorageResponse
     */
    public DescribeOSSStorageResponse describeOSSStorageWithOptions(DescribeOSSStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOSSStorage"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOSSStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cold storage information.</p>
     * 
     * @param request DescribeOSSStorageRequest
     * @return DescribeOSSStorageResponse
     */
    public DescribeOSSStorageResponse describeOSSStorage(DescribeOSSStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOSSStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeProcessList operation to retrieve running queries on an ApsaraDB for ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request DescribeProcessListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProcessListResponse
     */
    public DescribeProcessListResponse describeProcessListWithOptions(DescribeProcessListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialQueryId)) {
            query.put("InitialQueryId", request.initialQueryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialUser)) {
            query.put("InitialUser", request.initialUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDurationMs)) {
            query.put("QueryDurationMs", request.queryDurationMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProcessList"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProcessListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeProcessList operation to retrieve running queries on an ApsaraDB for ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request DescribeProcessListRequest
     * @return DescribeProcessListResponse
     */
    public DescribeProcessListResponse describeProcessList(DescribeProcessListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProcessListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available regions and zones for ApsaraDB for ClickHouse.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-11-11"),
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
     * <b>summary</b> : 
     * <p>Queries the available regions and zones for ApsaraDB for ClickHouse.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all databases in an instance.</p>
     * 
     * @param request DescribeSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSchemasResponse
     */
    public DescribeSchemasResponse describeSchemasWithOptions(DescribeSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSchemas"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all databases in an instance.</p>
     * 
     * @param request DescribeSchemasRequest
     * @return DescribeSchemasResponse
     */
    public DescribeSchemasResponse describeSchemas(DescribeSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of slow query logs.</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDurationMs)) {
            query.put("QueryDurationMs", request.queryDurationMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogRecords"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of slow query logs.</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics about the slow log trends for a cluster.</p>
     * 
     * @param request DescribeSlowLogTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogTrendResponse
     */
    public DescribeSlowLogTrendResponse describeSlowLogTrendWithOptions(DescribeSlowLogTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDurationMs)) {
            query.put("QueryDurationMs", request.queryDurationMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogTrend"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics about the slow log trends for a cluster.</p>
     * 
     * @param request DescribeSlowLogTrendRequest
     * @return DescribeSlowLogTrendResponse
     */
    public DescribeSlowLogTrendResponse describeSlowLogTrend(DescribeSlowLogTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries synchronized databases and tables.</p>
     * 
     * @param request DescribeSynDbTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynDbTablesResponse
     */
    public DescribeSynDbTablesResponse describeSynDbTablesWithOptions(DescribeSynDbTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synDb)) {
            query.put("SynDb", request.synDb);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynDbTables"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynDbTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries synchronized databases and tables.</p>
     * 
     * @param request DescribeSynDbTablesRequest
     * @return DescribeSynDbTablesResponse
     */
    public DescribeSynDbTablesResponse describeSynDbTables(DescribeSynDbTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynDbTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about synchronized databases.</p>
     * 
     * @param request DescribeSynDbsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynDbsResponse
     */
    public DescribeSynDbsResponse describeSynDbsWithOptions(DescribeSynDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynDbs"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynDbsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about synchronized databases.</p>
     * 
     * @param request DescribeSynDbsRequest
     * @return DescribeSynDbsResponse
     */
    public DescribeSynDbsResponse describeSynDbs(DescribeSynDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynDbsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeTables operation to query tables in a community-compatible cluster.</p>
     * 
     * @param request DescribeTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTables"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeTables operation to query tables in a community-compatible cluster.</p>
     * 
     * @param request DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is used only to query data migrations between Alibaba Cloud ClickHouse clusters during version upgrades.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>View migration history.</p>
     * 
     * @param request DescribeTransferHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransferHistoryResponse
     */
    public DescribeTransferHistoryResponse describeTransferHistoryWithOptions(DescribeTransferHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransferHistory"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransferHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is used only to query data migrations between Alibaba Cloud ClickHouse clusters during version upgrades.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>View migration history.</p>
     * 
     * @param request DescribeTransferHistoryRequest
     * @return DescribeTransferHistoryResponse
     */
    public DescribeTransferHistoryResponse describeTransferHistory(DescribeTransferHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransferHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of your KMS keys.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserEncryptionKeyList"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of your KMS keys.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Switches the ZooKeeper leader for a community-compatible ClickHouse instance.</p>
     * 
     * @param request ElectZookeeperLeaderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ElectZookeeperLeaderResponse
     */
    public ElectZookeeperLeaderResponse electZookeeperLeaderWithOptions(ElectZookeeperLeaderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableWrite)) {
            query.put("DisableWrite", request.disableWrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.electTime)) {
            query.put("ElectTime", request.electTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ElectZookeeperLeader"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ElectZookeeperLeaderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Switches the ZooKeeper leader for a community-compatible ClickHouse instance.</p>
     * 
     * @param request ElectZookeeperLeaderRequest
     * @return ElectZookeeperLeaderResponse
     */
    public ElectZookeeperLeaderResponse electZookeeperLeader(ElectZookeeperLeaderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.electZookeeperLeaderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops ongoing tasks.</p>
     * 
     * @param request KillProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillProcessResponse
     */
    public KillProcessResponse killProcessWithOptions(KillProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialQueryId)) {
            query.put("InitialQueryId", request.initialQueryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillProcess"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops ongoing tasks.</p>
     * 
     * @param request KillProcessRequest
     * @return KillProcessResponse
     */
    public KillProcessResponse killProcess(KillProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tags that are attached to ApsaraDB for ClickHouse clusters.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2019-11-11"),
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
     * <b>summary</b> : 
     * <p>Lists the tags that are attached to ApsaraDB for ClickHouse clusters.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation applies only to cluster versions 21.8 and earlier. For cluster versions later than 21.8, you must use a high-privilege account to run SQL statements to modify the permissions of standard users.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the permissions of a database account.</p>
     * 
     * @param request ModifyAccountAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountAuthorityResponse
     */
    public ModifyAccountAuthorityResponse modifyAccountAuthorityWithOptions(ModifyAccountAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowDatabases)) {
            query.put("AllowDatabases", request.allowDatabases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowDictionaries)) {
            query.put("AllowDictionaries", request.allowDictionaries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddlAuthority)) {
            query.put("DdlAuthority", request.ddlAuthority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmlAuthority)) {
            query.put("DmlAuthority", request.dmlAuthority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalDatabases)) {
            query.put("TotalDatabases", request.totalDatabases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalDictionaries)) {
            query.put("TotalDictionaries", request.totalDictionaries);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountAuthority"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountAuthorityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation applies only to cluster versions 21.8 and earlier. For cluster versions later than 21.8, you must use a high-privilege account to run SQL statements to modify the permissions of standard users.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the permissions of a database account.</p>
     * 
     * @param request ModifyAccountAuthorityRequest
     * @return ModifyAccountAuthorityResponse
     */
    public ModifyAccountAuthorityResponse modifyAccountAuthority(ModifyAccountAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountAuthorityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database account in an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database account in an ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of active O&amp;M tasks on a community-compatible ClickHouse cluster.</p>
     * 
     * @param request ModifyActiveOperationMaintainConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyActiveOperationMaintainConfResponse
     */
    public ModifyActiveOperationMaintainConfResponse modifyActiveOperationMaintainConfWithOptions(ModifyActiveOperationMaintainConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cycleTime)) {
            query.put("CycleTime", request.cycleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            query.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainEndTime)) {
            query.put("MaintainEndTime", request.maintainEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainStartTime)) {
            query.put("MaintainStartTime", request.maintainStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyActiveOperationMaintainConf"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyActiveOperationMaintainConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of active O&amp;M tasks on a community-compatible ClickHouse cluster.</p>
     * 
     * @param request ModifyActiveOperationMaintainConfRequest
     * @return ModifyActiveOperationMaintainConfResponse
     */
    public ModifyActiveOperationMaintainConfResponse modifyActiveOperationMaintainConf(ModifyActiveOperationMaintainConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyActiveOperationMaintainConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the switch time for operations and maintenance (O&amp;M) events on a ClickHouse Community-compatible cluster.</p>
     * 
     * @param request ModifyActiveOperationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyActiveOperationTasksResponse
     */
    public ModifyActiveOperationTasksResponse modifyActiveOperationTasksWithOptions(ModifyActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediateStart)) {
            query.put("ImmediateStart", request.immediateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyActiveOperationTasks"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyActiveOperationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the switch time for operations and maintenance (O&amp;M) events on a ClickHouse Community-compatible cluster.</p>
     * 
     * @param request ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    public ModifyActiveOperationTasksResponse modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyActiveOperationTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the auto-renewal status of a ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request ModifyAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoRenewAttributeResponse
     */
    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttributeWithOptions(ModifyAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoRenewAttribute"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoRenewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the auto-renewal status of a ClickHouse Community-Compatible cluster.</p>
     * 
     * @param request ModifyAutoRenewAttributeRequest
     * @return ModifyAutoRenewAttributeResponse
     */
    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Data backup is supported for ApsaraDB for ClickHouse clusters that run version 20.3, 20.8, or 21.8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup settings of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPolicy"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Data backup is supported for ApsaraDB for ClickHouse clusters that run version 20.3, 20.8, or 21.8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup settings of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the specifications of a cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBClusterWithOptions(ModifyDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterClass)) {
            query.put("DBClusterClass", request.DBClusterClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeGroupCount)) {
            query.put("DBNodeGroupCount", request.DBNodeGroupCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeStorage)) {
            query.put("DBNodeStorage", request.DBNodeStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbNodeStorageType)) {
            query.put("DbNodeStorageType", request.dbNodeStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableWriteWindows)) {
            query.put("DisableWriteWindows", request.disableWriteWindows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBCluster"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the specifications of a cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBCluster(ModifyDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterAccessWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterAccessWhiteListResponse
     */
    public ModifyDBClusterAccessWhiteListResponse modifyDBClusterAccessWhiteListWithOptions(ModifyDBClusterAccessWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIPArrayAttribute)) {
            query.put("DBClusterIPArrayAttribute", request.DBClusterIPArrayAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIPArrayName)) {
            query.put("DBClusterIPArrayName", request.DBClusterIPArrayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterAccessWhiteList"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterAccessWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterAccessWhiteListRequest
     * @return ModifyDBClusterAccessWhiteListResponse
     */
    public ModifyDBClusterAccessWhiteListResponse modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterAccessWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a cluster.</p>
     * 
     * @param request ModifyDBClusterConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterConfigResponse
     */
    public ModifyDBClusterConfigResponse modifyDBClusterConfigWithOptions(ModifyDBClusterConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConfig)) {
            query.put("UserConfig", request.userConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterConfig"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a cluster.</p>
     * 
     * @param request ModifyDBClusterConfigRequest
     * @return ModifyDBClusterConfigResponse
     */
    public ModifyDBClusterConfigResponse modifyDBClusterConfig(ModifyDBClusterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only community-compatible clusters created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration parameters of a specified community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterConfigInXMLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterConfigInXMLResponse
     */
    public ModifyDBClusterConfigInXMLResponse modifyDBClusterConfigInXMLWithOptions(ModifyDBClusterConfigInXMLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterConfigInXML"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterConfigInXMLResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only community-compatible clusters created after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration parameters of a specified community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterConfigInXMLRequest
     * @return ModifyDBClusterConfigInXMLResponse
     */
    public ModifyDBClusterConfigInXMLResponse modifyDBClusterConfigInXML(ModifyDBClusterConfigInXMLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterConfigInXMLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the description of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescriptionWithOptions(ModifyDBClusterDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterDescription"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the description of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maintenance window for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterMaintainTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterMaintainTimeResponse
     */
    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTimeWithOptions(ModifyDBClusterMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainTime)) {
            query.put("MaintainTime", request.maintainTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterMaintainTime"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterMaintainTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maintenance window for a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterMaintainTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This API applies only to clusters with a kernel version of 20.8 or earlier.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ModifyDBConfig operation modifies the dictionary configuration of a community-compatible cluster.</p>
     * 
     * @param request ModifyDBConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBConfigResponse
     */
    public ModifyDBConfigResponse modifyDBConfigWithOptions(ModifyDBConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBConfig"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This API applies only to clusters with a kernel version of 20.8 or earlier.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ModifyDBConfig operation modifies the dictionary configuration of a community-compatible cluster.</p>
     * 
     * @param request ModifyDBConfigRequest
     * @return ModifyDBConfigResponse
     */
    public ModifyDBConfigResponse modifyDBConfig(ModifyDBConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the upgrade type for a ClickHouse minor version to automatic or manual.</p>
     * 
     * @param request ModifyMinorVersionGreadeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMinorVersionGreadeTypeResponse
     */
    public ModifyMinorVersionGreadeTypeResponse modifyMinorVersionGreadeTypeWithOptions(ModifyMinorVersionGreadeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainAutoType)) {
            query.put("MaintainAutoType", request.maintainAutoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMinorVersionGreadeType"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMinorVersionGreadeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the upgrade type for a ClickHouse minor version to automatic or manual.</p>
     * 
     * @param request ModifyMinorVersionGreadeTypeRequest
     * @return ModifyMinorVersionGreadeTypeResponse
     */
    public ModifyMinorVersionGreadeTypeResponse modifyMinorVersionGreadeType(ModifyMinorVersionGreadeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMinorVersionGreadeTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible ApsaraDB for ClickHouse clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the sync task of a community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyRDSToClickhouseDbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRDSToClickhouseDbResponse
     */
    public ModifyRDSToClickhouseDbResponse modifyRDSToClickhouseDbWithOptions(ModifyRDSToClickhouseDbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ckPassword)) {
            query.put("CkPassword", request.ckPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ckUserName)) {
            query.put("CkUserName", request.ckUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clickhousePort)) {
            query.put("ClickhousePort", request.clickhousePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitUpper)) {
            query.put("LimitUpper", request.limitUpper);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsId)) {
            query.put("RdsId", request.rdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsPassword)) {
            query.put("RdsPassword", request.rdsPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsPort)) {
            query.put("RdsPort", request.rdsPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsSynDb)) {
            query.put("RdsSynDb", request.rdsSynDb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsSynTables)) {
            query.put("RdsSynTables", request.rdsSynTables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsUserName)) {
            query.put("RdsUserName", request.rdsUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsVpcId)) {
            query.put("RdsVpcId", request.rdsVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipUnsupported)) {
            query.put("SkipUnsupported", request.skipUnsupported);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRDSToClickhouseDb"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRDSToClickhouseDbResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to community-compatible ApsaraDB for ClickHouse clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the sync task of a community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ModifyRDSToClickhouseDbRequest
     * @return ModifyRDSToClickhouseDbResponse
     */
    public ModifyRDSToClickhouseDbResponse modifyRDSToClickhouseDb(ModifyRDSToClickhouseDbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRDSToClickhouseDbWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the public endpoint of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ReleaseClusterPublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseClusterPublicConnectionResponse
     */
    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnectionWithOptions(ReleaseClusterPublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseClusterPublicConnection"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseClusterPublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the public endpoint of a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ReleaseClusterPublicConnectionRequest
     * @return ReleaseClusterPublicConnectionResponse
     */
    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseClusterPublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of a database account in a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of a database account in a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request RestartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartTime)) {
            query.put("RestartTime", request.restartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a specified ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch restart nodes of a ClickHouse Community-compatible Edition instance.</p>
     * 
     * @param tmpReq RestartInstanceNodeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceNodeListResponse
     */
    public RestartInstanceNodeListResponse restartInstanceNodeListWithOptions(RestartInstanceNodeListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RestartInstanceNodeListShrinkRequest request = new RestartInstanceNodeListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeList)) {
            request.nodeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeList, "NodeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeListShrink)) {
            query.put("NodeList", request.nodeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartTime)) {
            query.put("RestartTime", request.restartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstanceNodeList"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceNodeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch restart nodes of a ClickHouse Community-compatible Edition instance.</p>
     * 
     * @param request RestartInstanceNodeListRequest
     * @return RestartInstanceNodeListResponse
     */
    public RestartInstanceNodeListResponse restartInstanceNodeList(RestartInstanceNodeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceNodeListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to one or more ApsaraDB for ClickHouse clusters.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2019-11-11"),
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
     * <p>Creates and attaches tags to one or more ApsaraDB for ClickHouse clusters.</p>
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
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>Add the IP addresses of the source cluster to the whitelist of the destination cluster.</li>
     * <li>Add the IP addresses of the destination cluster to the whitelist of the source cluster.<blockquote>
     * <p>You can execute the <code>select * from system.clusters;</code> statement to retrieve the IP addresses of an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Migration between versions.</p>
     * 
     * @param request TransferVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferVersionResponse
     */
    public TransferVersionResponse transferVersionWithOptions(TransferVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableWriteWindows)) {
            query.put("DisableWriteWindows", request.disableWriteWindows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceAccount)) {
            query.put("SourceAccount", request.sourceAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceClusterName)) {
            query.put("SourceClusterName", request.sourceClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePassword)) {
            query.put("SourcePassword", request.sourcePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceShards)) {
            query.put("SourceShards", request.sourceShards);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAccount)) {
            query.put("TargetAccount", request.targetAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDbClusterId)) {
            query.put("TargetDbClusterId", request.targetDbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPassword)) {
            query.put("TargetPassword", request.targetPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferVersion"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>Add the IP addresses of the source cluster to the whitelist of the destination cluster.</li>
     * <li>Add the IP addresses of the destination cluster to the whitelist of the source cluster.<blockquote>
     * <p>You can execute the <code>select * from system.clusters;</code> statement to retrieve the IP addresses of an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Migration between versions.</p>
     * 
     * @param request TransferVersionRequest
     * @return TransferVersionResponse
     */
    public TransferVersionResponse transferVersion(TransferVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from ApsaraDB for ClickHouse clusters.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2019-11-11"),
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
     * <p>Removes tags from ApsaraDB for ClickHouse clusters.</p>
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
     * <blockquote>
     * <p>Minor engine version upgrades are supported only for community-compatible clusters that are purchased after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The UpgradeMinorVersion operation upgrades the minor engine version of a specified community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request UpgradeMinorVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeMinorVersionResponse
     */
    public UpgradeMinorVersionResponse upgradeMinorVersionWithOptions(UpgradeMinorVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeImmediately)) {
            query.put("UpgradeImmediately", request.upgradeImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeTime)) {
            query.put("UpgradeTime", request.upgradeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeVersion)) {
            query.put("UpgradeVersion", request.upgradeVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeMinorVersion"),
            new TeaPair("version", "2019-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeMinorVersionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Minor engine version upgrades are supported only for community-compatible clusters that are purchased after December 1, 2021.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The UpgradeMinorVersion operation upgrades the minor engine version of a specified community-compatible ApsaraDB for ClickHouse cluster.</p>
     * 
     * @param request UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    public UpgradeMinorVersionResponse upgradeMinorVersion(UpgradeMinorVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeMinorVersionWithOptions(request, runtime);
    }
}
