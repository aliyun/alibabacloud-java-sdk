// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101;

import com.aliyun.tea.*;
import com.aliyun.clickhouse20220101.models.*;

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
            new TeaPair("us-west-1", "clickhouse.aliyuncs.com")
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
     * <p>申请计算组公网SLB</p>
     * 
     * @param request AllocateVirtualWareHousePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateVirtualWareHousePublicConnectionResponse
     */
    public AllocateVirtualWareHousePublicConnectionResponse allocateVirtualWareHousePublicConnectionWithOptions(AllocateVirtualWareHousePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateVirtualWareHousePublicConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateVirtualWareHousePublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请计算组公网SLB</p>
     * 
     * @param request AllocateVirtualWareHousePublicConnectionRequest
     * @return AllocateVirtualWareHousePublicConnectionResponse
     */
    public AllocateVirtualWareHousePublicConnectionResponse allocateVirtualWareHousePublicConnection(AllocateVirtualWareHousePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateVirtualWareHousePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例检查</p>
     * 
     * @param request CheckCreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCreateClusterResponse
     */
    public CheckCreateClusterResponse checkCreateClusterWithOptions(CheckCreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
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

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseCacheStorage)) {
            query.put("VirtualWareHouseCacheStorage", request.virtualWareHouseCacheStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseClass)) {
            query.put("VirtualWareHouseClass", request.virtualWareHouseClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseDescription)) {
            query.put("VirtualWareHouseDescription", request.virtualWareHouseDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCreateCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCreateClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例检查</p>
     * 
     * @param request CheckCreateClusterRequest
     * @return CheckCreateClusterResponse
     */
    public CheckCreateClusterResponse checkCreateCluster(CheckCreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCreateClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建计算组检查</p>
     * 
     * @param request CheckCreateVirtualWareHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCreateVirtualWareHouseResponse
     */
    public CheckCreateVirtualWareHouseResponse checkCreateVirtualWareHouseWithOptions(CheckCreateVirtualWareHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseCacheStorage)) {
            query.put("VirtualWareHouseCacheStorage", request.virtualWareHouseCacheStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseClass)) {
            query.put("VirtualWareHouseClass", request.virtualWareHouseClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseDescription)) {
            query.put("VirtualWareHouseDescription", request.virtualWareHouseDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCreateVirtualWareHouse"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCreateVirtualWareHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建计算组检查</p>
     * 
     * @param request CheckCreateVirtualWareHouseRequest
     * @return CheckCreateVirtualWareHouseResponse
     */
    public CheckCreateVirtualWareHouseResponse checkCreateVirtualWareHouse(CheckCreateVirtualWareHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCreateVirtualWareHouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算组检查</p>
     * 
     * @param request CheckDeleteVirtualWareHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDeleteVirtualWareHouseResponse
     */
    public CheckDeleteVirtualWareHouseResponse checkDeleteVirtualWareHouseWithOptions(CheckDeleteVirtualWareHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDeleteVirtualWareHouse"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDeleteVirtualWareHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算组检查</p>
     * 
     * @param request CheckDeleteVirtualWareHouseRequest
     * @return CheckDeleteVirtualWareHouseResponse
     */
    public CheckDeleteVirtualWareHouseResponse checkDeleteVirtualWareHouse(CheckDeleteVirtualWareHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDeleteVirtualWareHouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>计算组变配检查</p>
     * 
     * @param request CheckModifyVirtualWareHouseResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckModifyVirtualWareHouseResourceResponse
     */
    public CheckModifyVirtualWareHouseResourceResponse checkModifyVirtualWareHouseResourceWithOptions(CheckModifyVirtualWareHouseResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseCacheStorage)) {
            query.put("VirtualWareHouseCacheStorage", request.virtualWareHouseCacheStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseClass)) {
            query.put("VirtualWareHouseClass", request.virtualWareHouseClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckModifyVirtualWareHouseResource"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckModifyVirtualWareHouseResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>计算组变配检查</p>
     * 
     * @param request CheckModifyVirtualWareHouseResourceRequest
     * @return CheckModifyVirtualWareHouseResourceResponse
     */
    public CheckModifyVirtualWareHouseResourceResponse checkModifyVirtualWareHouseResource(CheckModifyVirtualWareHouseResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkModifyVirtualWareHouseResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例账户</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordSha256Hex)) {
            query.put("PasswordSha256Hex", request.passwordSha256Hex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2022-01-01"),
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
     * <p>创建实例账户</p>
     * 
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
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

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseCacheStorage)) {
            query.put("VirtualWareHouseCacheStorage", request.virtualWareHouseCacheStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseClass)) {
            query.put("VirtualWareHouseClass", request.virtualWareHouseClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseDescription)) {
            query.put("VirtualWareHouseDescription", request.virtualWareHouseDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建计算组</p>
     * 
     * @param request CreateVirtualWareHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualWareHouseResponse
     */
    public CreateVirtualWareHouseResponse createVirtualWareHouseWithOptions(CreateVirtualWareHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseCacheStorage)) {
            query.put("VirtualWareHouseCacheStorage", request.virtualWareHouseCacheStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseClass)) {
            query.put("VirtualWareHouseClass", request.virtualWareHouseClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseDescription)) {
            query.put("VirtualWareHouseDescription", request.virtualWareHouseDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualWareHouse"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualWareHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建计算组</p>
     * 
     * @param request CreateVirtualWareHouseRequest
     * @return CreateVirtualWareHouseResponse
     */
    public CreateVirtualWareHouseResponse createVirtualWareHouse(CreateVirtualWareHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualWareHouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例账户</p>
     * 
     * @param request DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

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
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2022-01-01"),
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
     * <b>summary</b> : 
     * <p>删除实例账户</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例</p>
     * 
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例</p>
     * 
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例IP白名单组</p>
     * 
     * @param request DeleteClusterSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterSecurityIPGroupResponse
     */
    public DeleteClusterSecurityIPGroupResponse deleteClusterSecurityIPGroupWithOptions(DeleteClusterSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
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
            new TeaPair("action", "DeleteClusterSecurityIPGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例IP白名单组</p>
     * 
     * @param request DeleteClusterSecurityIPGroupRequest
     * @return DeleteClusterSecurityIPGroupResponse
     */
    public DeleteClusterSecurityIPGroupResponse deleteClusterSecurityIPGroup(DeleteClusterSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算组</p>
     * 
     * @param request DeleteVirtualWareHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualWareHouseResponse
     */
    public DeleteVirtualWareHouseResponse deleteVirtualWareHouseWithOptions(DeleteVirtualWareHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualWareHouse"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualWareHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算组</p>
     * 
     * @param request DeleteVirtualWareHouseRequest
     * @return DeleteVirtualWareHouseResponse
     */
    public DeleteVirtualWareHouseResponse deleteVirtualWareHouse(DeleteVirtualWareHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualWareHouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例账户详情</p>
     * 
     * @param request DescribeAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountResponse
     */
    public DescribeAccountResponse describeAccountWithOptions(DescribeAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

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
            new TeaPair("action", "DescribeAccount"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例账户详情</p>
     * 
     * @param request DescribeAccountRequest
     * @return DescribeAccountResponse
     */
    public DescribeAccountResponse describeAccount(DescribeAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例详情</p>
     * 
     * @param request DescribeClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResponse
     */
    public DescribeClusterResponse describeClusterWithOptions(DescribeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例详情</p>
     * 
     * @param request DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    public DescribeClusterResponse describeCluster(DescribeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例白名单配置</p>
     * 
     * @param request DescribeClusterSecurityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterSecurityInfoResponse
     */
    public DescribeClusterSecurityInfoResponse describeClusterSecurityInfoWithOptions(DescribeClusterSecurityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeClusterSecurityInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterSecurityInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例白名单配置</p>
     * 
     * @param request DescribeClusterSecurityInfoRequest
     * @return DescribeClusterSecurityInfoResponse
     */
    public DescribeClusterSecurityInfoResponse describeClusterSecurityInfo(DescribeClusterSecurityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterSecurityInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例状态集合</p>
     * 
     * @param request DescribeClusterStatusSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterStatusSetResponse
     */
    public DescribeClusterStatusSetResponse describeClusterStatusSetWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterStatusSet"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterStatusSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例状态集合</p>
     * @return DescribeClusterStatusSetResponse
     */
    public DescribeClusterStatusSetResponse describeClusterStatusSet() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterStatusSetWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看可服务Region和Zone</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2022-01-01"),
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
     * <p>查看可服务Region和Zone</p>
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
     * <p>查看计算组正在运行查询列表</p>
     * 
     * @param request DescribeRunningQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRunningQueryResponse
     */
    public DescribeRunningQueryResponse describeRunningQueryWithOptions(DescribeRunningQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeyWord)) {
            query.put("QueryKeyWord", request.queryKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUser)) {
            query.put("QueryUser", request.queryUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRunningQuery"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRunningQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组正在运行查询列表</p>
     * 
     * @param request DescribeRunningQueryRequest
     * @return DescribeRunningQueryResponse
     */
    public DescribeRunningQueryResponse describeRunningQuery(DescribeRunningQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRunningQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组慢查询详情</p>
     * 
     * @param request DescribeSlowQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowQueryResponse
     */
    public DescribeSlowQueryResponse describeSlowQueryWithOptions(DescribeSlowQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowQuery"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组慢查询详情</p>
     * 
     * @param request DescribeSlowQueryRequest
     * @return DescribeSlowQueryResponse
     */
    public DescribeSlowQueryResponse describeSlowQuery(DescribeSlowQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组慢查询趋势 以1分钟为间隔统计</p>
     * 
     * @param request DescribeSlowQueryTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowQueryTrendResponse
     */
    public DescribeSlowQueryTrendResponse describeSlowQueryTrendWithOptions(DescribeSlowQueryTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDurationMs)) {
            query.put("QueryDurationMs", request.queryDurationMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowQueryTrend"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowQueryTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组慢查询趋势 以1分钟为间隔统计</p>
     * 
     * @param request DescribeSlowQueryTrendRequest
     * @return DescribeSlowQueryTrendResponse
     */
    public DescribeSlowQueryTrendResponse describeSlowQueryTrend(DescribeSlowQueryTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowQueryTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组详情</p>
     * 
     * @param request DescribeVirtualWareHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualWareHouseResponse
     */
    public DescribeVirtualWareHouseResponse describeVirtualWareHouseWithOptions(DescribeVirtualWareHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualWareHouse"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualWareHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组详情</p>
     * 
     * @param request DescribeVirtualWareHouseRequest
     * @return DescribeVirtualWareHouseResponse
     */
    public DescribeVirtualWareHouseResponse describeVirtualWareHouse(DescribeVirtualWareHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualWareHouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组规格码集合</p>
     * 
     * @param request DescribeVirtualWareHouseClassSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualWareHouseClassSetResponse
     */
    public DescribeVirtualWareHouseClassSetResponse describeVirtualWareHouseClassSetWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualWareHouseClassSet"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualWareHouseClassSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组规格码集合</p>
     * @return DescribeVirtualWareHouseClassSetResponse
     */
    public DescribeVirtualWareHouseClassSetResponse describeVirtualWareHouseClassSet() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualWareHouseClassSetWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组链接信息</p>
     * 
     * @param request DescribeVirtualWareHouseEndpointInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualWareHouseEndpointInfoResponse
     */
    public DescribeVirtualWareHouseEndpointInfoResponse describeVirtualWareHouseEndpointInfoWithOptions(DescribeVirtualWareHouseEndpointInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualWareHouseEndpointInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualWareHouseEndpointInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组链接信息</p>
     * 
     * @param request DescribeVirtualWareHouseEndpointInfoRequest
     * @return DescribeVirtualWareHouseEndpointInfoResponse
     */
    public DescribeVirtualWareHouseEndpointInfoResponse describeVirtualWareHouseEndpointInfo(DescribeVirtualWareHouseEndpointInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualWareHouseEndpointInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组状态集合</p>
     * 
     * @param request DescribeVirtualWareHouseStatusSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualWareHouseStatusSetResponse
     */
    public DescribeVirtualWareHouseStatusSetResponse describeVirtualWareHouseStatusSetWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualWareHouseStatusSet"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualWareHouseStatusSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组状态集合</p>
     * @return DescribeVirtualWareHouseStatusSetResponse
     */
    public DescribeVirtualWareHouseStatusSetResponse describeVirtualWareHouseStatusSet() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualWareHouseStatusSetWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询分布式表缓存大小</p>
     * 
     * @param request GetDistributedTablesBufferSizeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDistributedTablesBufferSizeResponse
     */
    public GetDistributedTablesBufferSizeResponse getDistributedTablesBufferSizeWithOptions(GetDistributedTablesBufferSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDistributedTablesBufferSize"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDistributedTablesBufferSizeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询分布式表缓存大小</p>
     * 
     * @param request GetDistributedTablesBufferSizeRequest
     * @return GetDistributedTablesBufferSizeResponse
     */
    public GetDistributedTablesBufferSizeResponse getDistributedTablesBufferSize(GetDistributedTablesBufferSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDistributedTablesBufferSizeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Kill计算组查询</p>
     * 
     * @param request KillQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillQueryResponse
     */
    public KillQueryResponse killQueryWithOptions(KillQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryIds)) {
            query.put("QueryIds", request.queryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillQuery"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Kill计算组查询</p>
     * 
     * @param request KillQueryRequest
     * @return KillQueryResponse
     */
    public KillQueryResponse killQuery(KillQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例账户详情列表</p>
     * 
     * @param request ListAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccountsWithOptions(ListAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAccounts"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例账户详情列表</p>
     * 
     * @param request ListAccountsRequest
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例详情列表</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterStatus)) {
            query.put("DBClusterStatus", request.DBClusterStatus);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例详情列表</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组参数配置列表</p>
     * 
     * @param request ListVirtualWareHouseConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirtualWareHouseConfigsResponse
     */
    public ListVirtualWareHouseConfigsResponse listVirtualWareHouseConfigsWithOptions(ListVirtualWareHouseConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirtualWareHouseConfigs"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualWareHouseConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组参数配置列表</p>
     * 
     * @param request ListVirtualWareHouseConfigsRequest
     * @return ListVirtualWareHouseConfigsResponse
     */
    public ListVirtualWareHouseConfigsResponse listVirtualWareHouseConfigs(ListVirtualWareHouseConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirtualWareHouseConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组详情列表</p>
     * 
     * @param request ListVirtualWareHousesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirtualWareHousesResponse
     */
    public ListVirtualWareHousesResponse listVirtualWareHousesWithOptions(ListVirtualWareHousesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListVirtualWareHouses"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualWareHousesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看计算组详情列表</p>
     * 
     * @param request ListVirtualWareHousesRequest
     * @return ListVirtualWareHousesResponse
     */
    public ListVirtualWareHousesResponse listVirtualWareHouses(ListVirtualWareHousesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirtualWareHousesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例账户备注</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

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
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2022-01-01"),
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
     * <p>修改实例账户备注</p>
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
     * <p>修改实例账户权限级别</p>
     * 
     * @param request ModifyAccountPrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountPrivilegeResponse
     */
    public ModifyAccountPrivilegeResponse modifyAccountPrivilegeWithOptions(ModifyAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountPrivilege"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例账户权限级别</p>
     * 
     * @param request ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     */
    public ModifyAccountPrivilegeResponse modifyAccountPrivilege(ModifyAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例描述信息</p>
     * 
     * @param request ModifyClusterDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterDescriptionResponse
     */
    public ModifyClusterDescriptionResponse modifyClusterDescriptionWithOptions(ModifyClusterDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

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
            new TeaPair("action", "ModifyClusterDescription"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例描述信息</p>
     * 
     * @param request ModifyClusterDescriptionRequest
     * @return ModifyClusterDescriptionResponse
     */
    public ModifyClusterDescriptionResponse modifyClusterDescription(ModifyClusterDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改计算组参数配置</p>
     * 
     * @param tmpReq ModifyVirtualWareHouseConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVirtualWareHouseConfigResponse
     */
    public ModifyVirtualWareHouseConfigResponse modifyVirtualWareHouseConfigWithOptions(ModifyVirtualWareHouseConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyVirtualWareHouseConfigShrinkRequest request = new ModifyVirtualWareHouseConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configChanges)) {
            request.configChangesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configChanges, "ConfigChanges", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configChangesShrink)) {
            query.put("ConfigChanges", request.configChangesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVirtualWareHouseConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVirtualWareHouseConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改计算组参数配置</p>
     * 
     * @param request ModifyVirtualWareHouseConfigRequest
     * @return ModifyVirtualWareHouseConfigResponse
     */
    public ModifyVirtualWareHouseConfigResponse modifyVirtualWareHouseConfig(ModifyVirtualWareHouseConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVirtualWareHouseConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改计算组描述信息</p>
     * 
     * @param request ModifyVirtualWareHouseDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVirtualWareHouseDescriptionResponse
     */
    public ModifyVirtualWareHouseDescriptionResponse modifyVirtualWareHouseDescriptionWithOptions(ModifyVirtualWareHouseDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseDescription)) {
            query.put("VirtualWareHouseDescription", request.virtualWareHouseDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVirtualWareHouseDescription"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVirtualWareHouseDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改计算组描述信息</p>
     * 
     * @param request ModifyVirtualWareHouseDescriptionRequest
     * @return ModifyVirtualWareHouseDescriptionResponse
     */
    public ModifyVirtualWareHouseDescriptionResponse modifyVirtualWareHouseDescription(ModifyVirtualWareHouseDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVirtualWareHouseDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>计算组变配</p>
     * 
     * @param request ModifyVirtualWareHouseResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVirtualWareHouseResourceResponse
     */
    public ModifyVirtualWareHouseResourceResponse modifyVirtualWareHouseResourceWithOptions(ModifyVirtualWareHouseResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseCacheStorage)) {
            query.put("VirtualWareHouseCacheStorage", request.virtualWareHouseCacheStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseClass)) {
            query.put("VirtualWareHouseClass", request.virtualWareHouseClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVirtualWareHouseResource"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVirtualWareHouseResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>计算组变配</p>
     * 
     * @param request ModifyVirtualWareHouseResourceRequest
     * @return ModifyVirtualWareHouseResourceResponse
     */
    public ModifyVirtualWareHouseResourceResponse modifyVirtualWareHouseResource(ModifyVirtualWareHouseResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVirtualWareHouseResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例IP白名单组添加IP</p>
     * 
     * @param request PatchClusterSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PatchClusterSecurityIPGroupResponse
     */
    public PatchClusterSecurityIPGroupResponse patchClusterSecurityIPGroupWithOptions(PatchClusterSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchClusterSecurityIPGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PatchClusterSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例IP白名单组添加IP</p>
     * 
     * @param request PatchClusterSecurityIPGroupRequest
     * @return PatchClusterSecurityIPGroupResponse
     */
    public PatchClusterSecurityIPGroupResponse patchClusterSecurityIPGroup(PatchClusterSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.patchClusterSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放计算组公网SLB</p>
     * 
     * @param request ReleaseVirtualWareHousePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseVirtualWareHousePublicConnectionResponse
     */
    public ReleaseVirtualWareHousePublicConnectionResponse releaseVirtualWareHousePublicConnectionWithOptions(ReleaseVirtualWareHousePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseVirtualWareHousePublicConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseVirtualWareHousePublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放计算组公网SLB</p>
     * 
     * @param request ReleaseVirtualWareHousePublicConnectionRequest
     * @return ReleaseVirtualWareHousePublicConnectionResponse
     */
    public ReleaseVirtualWareHousePublicConnectionResponse releaseVirtualWareHousePublicConnection(ReleaseVirtualWareHousePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseVirtualWareHousePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置实例账户密码</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordSha256Hex)) {
            query.put("PasswordSha256Hex", request.passwordSha256Hex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2022-01-01"),
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
     * <p>重置实例账户密码</p>
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
     * <p>重启计算组</p>
     * 
     * @param request RestartVirtualWareHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartVirtualWareHouseResponse
     */
    public RestartVirtualWareHouseResponse restartVirtualWareHouseWithOptions(RestartVirtualWareHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualWareHouseId)) {
            query.put("VirtualWareHouseId", request.virtualWareHouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartVirtualWareHouse"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartVirtualWareHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重启计算组</p>
     * 
     * @param request RestartVirtualWareHouseRequest
     * @return RestartVirtualWareHouseResponse
     */
    public RestartVirtualWareHouseResponse restartVirtualWareHouse(RestartVirtualWareHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartVirtualWareHouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例小版本升级(内核向前兼容)</p>
     * 
     * @param request UpgradeClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeClusterWithOptions(UpgradeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpgradeCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例小版本升级(内核向前兼容)</p>
     * 
     * @param request UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置实例IP白名单组IP列表</p>
     * 
     * @param request UpsertClusterSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertClusterSecurityIPGroupResponse
     */
    public UpsertClusterSecurityIPGroupResponse upsertClusterSecurityIPGroupWithOptions(UpsertClusterSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertClusterSecurityIPGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertClusterSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置实例IP白名单组IP列表</p>
     * 
     * @param request UpsertClusterSecurityIPGroupRequest
     * @return UpsertClusterSecurityIPGroupResponse
     */
    public UpsertClusterSecurityIPGroupResponse upsertClusterSecurityIPGroup(UpsertClusterSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertClusterSecurityIPGroupWithOptions(request, runtime);
    }
}
