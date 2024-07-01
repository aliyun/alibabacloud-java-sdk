// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201;

import com.aliyun.tea.*;
import com.aliyun.adb20211201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "adb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "adb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "adb.aliyuncs.com"),
            new TeaPair("us-west-1", "adb.aliyuncs.com"),
            new TeaPair("us-east-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "adb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "adb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "adb.aliyuncs.com"),
            new TeaPair("cn-fujian", "adb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "adb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "adb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "adb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "adb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "adb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "adb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "adb.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies for a public endpoint for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateClusterPublicConnection"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies for a public endpoint for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request AllocateClusterPublicConnectionRequest
     * @return AllocateClusterPublicConnectionResponse
     */
    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateClusterPublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches an elastic network interface (ENI) to an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request AttachUserENIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachUserENIResponse
     */
    public AttachUserENIResponse attachUserENIWithOptions(AttachUserENIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachUserENI"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachUserENIResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches an elastic network interface (ENI) to an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request AttachUserENIRequest
     * @return AttachUserENIResponse
     */
    public AttachUserENIResponse attachUserENI(AttachUserENIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachUserENIWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a standard database account of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster with a Resource Access Management (RAM) user.</p>
     * 
     * @param request BindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAccountResponse
     */
    public BindAccountResponse bindAccountWithOptions(BindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramUser)) {
            query.put("RamUser", request.ramUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a standard database account of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster with a Resource Access Management (RAM) user.</p>
     * 
     * @param request BindAccountRequest
     * @return BindAccountResponse
     */
    public BindAccountResponse bindAccount(BindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a resource group with a database account.</p>
     * 
     * @param request BindDBResourceGroupWithUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindDBResourceGroupWithUserResponse
     */
    public BindDBResourceGroupWithUserResponse bindDBResourceGroupWithUserWithOptions(BindDBResourceGroupWithUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupUser)) {
            query.put("GroupUser", request.groupUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDBResourceGroupWithUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDBResourceGroupWithUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a resource group with a database account.</p>
     * 
     * @param request BindDBResourceGroupWithUserRequest
     * @return BindDBResourceGroupWithUserResponse
     */
    public BindDBResourceGroupWithUserResponse bindDBResourceGroupWithUser(BindDBResourceGroupWithUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDBResourceGroupWithUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a database account of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster is associated with a Resource Access Management (RAM) user.</p>
     * 
     * @param request CheckBindRamUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckBindRamUserResponse
     */
    public CheckBindRamUserResponse checkBindRamUserWithOptions(CheckBindRamUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CheckBindRamUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckBindRamUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a database account of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster is associated with a Resource Access Management (RAM) user.</p>
     * 
     * @param request CheckBindRamUserRequest
     * @return CheckBindRamUserResponse
     */
    public CheckBindRamUserResponse checkBindRamUser(CheckBindRamUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkBindRamUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request CheckSampleDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSampleDataSetResponse
     */
    public CheckSampleDataSetResponse checkSampleDataSetWithOptions(CheckSampleDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSampleDataSet"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSampleDataSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request CheckSampleDataSetRequest
     * @return CheckSampleDataSetResponse
     */
    public CheckSampleDataSetResponse checkSampleDataSet(CheckSampleDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSampleDataSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a database account for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a database account for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBClusterResponse
     */
    public CreateDBClusterResponse createDBClusterWithOptions(CreateDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeResource)) {
            query.put("ComputeResource", request.computeResource);
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

        if (!com.aliyun.teautil.Common.isUnset(request.diskEncryption)) {
            query.put("DiskEncryption", request.diskEncryption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDefaultResourcePool)) {
            query.put("EnableDefaultResourcePool", request.enableDefaultResourcePool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsId)) {
            query.put("KmsId", request.kmsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productForm)) {
            query.put("ProductForm", request.productForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeCount)) {
            query.put("ReservedNodeCount", request.reservedNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeSize)) {
            query.put("ReservedNodeSize", request.reservedNodeSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreToTime)) {
            query.put("RestoreToTime", request.restoreToTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreType)) {
            query.put("RestoreType", request.restoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDbClusterId)) {
            query.put("SourceDbClusterId", request.sourceDbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageResource)) {
            query.put("StorageResource", request.storageResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    public CreateDBClusterResponse createDBCluster(CreateDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param tmpReq CreateDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBResourceGroupResponse
     */
    public CreateDBResourceGroupResponse createDBResourceGroupWithOptions(CreateDBResourceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDBResourceGroupShrinkRequest request = new CreateDBResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterMode)) {
            query.put("ClusterMode", request.clusterMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSizeResource)) {
            query.put("ClusterSizeResource", request.clusterSizeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSpot)) {
            query.put("EnableSpot", request.enableSpot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxClusterCount)) {
            query.put("MaxClusterCount", request.maxClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeResource)) {
            query.put("MaxComputeResource", request.maxComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minClusterCount)) {
            query.put("MinClusterCount", request.minClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minComputeResource)) {
            query.put("MinComputeResource", request.minComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateDBResourceGroupRequest
     * @return CreateDBResourceGroupResponse
     */
    public CreateDBResourceGroupResponse createDBResourceGroup(CreateDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateElasticPlanResponse
     */
    public CreateElasticPlanResponse createElasticPlanWithOptions(CreateElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScale)) {
            query.put("AutoScale", request.autoScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSize)) {
            query.put("TargetSize", request.targetSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateElasticPlanRequest
     * @return CreateElasticPlanResponse
     */
    public CreateElasticPlanResponse createElasticPlan(CreateElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Object Storage Service (OSS) subdirectory.</p>
     * 
     * @param request CreateOssSubDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssSubDirectoryResponse
     */
    public CreateOssSubDirectoryResponse createOssSubDirectoryWithOptions(CreateOssSubDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssSubDirectory"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOssSubDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Object Storage Service (OSS) subdirectory.</p>
     * 
     * @param request CreateOssSubDirectoryRequest
     * @return CreateOssSubDirectoryResponse
     */
    public CreateOssSubDirectoryResponse createOssSubDirectory(CreateOssSubDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOssSubDirectoryWithOptions(request, runtime);
    }

    /**
     * @param tmpReq CreatePerformanceViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePerformanceViewResponse
     */
    public CreatePerformanceViewResponse createPerformanceViewWithOptions(CreatePerformanceViewRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePerformanceViewShrinkRequest request = new CreatePerformanceViewShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewDetail)) {
            request.viewDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewDetail, "ViewDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createFromViewType)) {
            query.put("CreateFromViewType", request.createFromViewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fillOriginViewKeys)) {
            query.put("FillOriginViewKeys", request.fillOriginViewKeys);
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

        if (!com.aliyun.teautil.Common.isUnset(request.viewDetailShrink)) {
            query.put("ViewDetail", request.viewDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePerformanceView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePerformanceViewResponse());
    }

    /**
     * @param request CreatePerformanceViewRequest
     * @return CreatePerformanceViewResponse
     */
    public CreatePerformanceViewResponse createPerformanceView(CreatePerformanceViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPerformanceViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Spark application template.</p>
     * 
     * @param request CreateSparkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSparkTemplateResponse
     */
    public CreateSparkTemplateResponse createSparkTemplateWithOptions(CreateSparkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSparkTemplate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSparkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Spark application template.</p>
     * 
     * @param request CreateSparkTemplateRequest
     * @return CreateSparkTemplateResponse
     */
    public CreateSparkTemplateResponse createSparkTemplate(CreateSparkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSparkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can call this operation to delete only subscription clusters.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBCluster"),
            new TeaPair("version", "2021-12-01"),
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
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can call this operation to delete only subscription clusters.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource group from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DeleteDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBResourceGroupResponse
     */
    public DeleteDBResourceGroupResponse deleteDBResourceGroupWithOptions(DeleteDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource group from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DeleteDBResourceGroupRequest
     * @return DeleteDBResourceGroupResponse
     */
    public DeleteDBResourceGroupResponse deleteDBResourceGroup(DeleteDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling plan from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DeleteElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteElasticPlanResponse
     */
    public DeleteElasticPlanResponse deleteElasticPlanWithOptions(DeleteElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling plan from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DeleteElasticPlanRequest
     * @return DeleteElasticPlanResponse
     */
    public DeleteElasticPlanResponse deleteElasticPlan(DeleteElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteElasticPlanWithOptions(request, runtime);
    }

    /**
     * @param request DeletePerformanceViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePerformanceViewResponse
     */
    public DeletePerformanceViewResponse deletePerformanceViewWithOptions(DeletePerformanceViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePerformanceView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePerformanceViewResponse());
    }

    /**
     * @param request DeletePerformanceViewRequest
     * @return DeletePerformanceViewResponse
     */
    public DeletePerformanceViewResponse deletePerformanceView(DeletePerformanceViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePerformanceViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a worflow instance from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DeleteProcessInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProcessInstanceResponse
     */
    public DeleteProcessInstanceResponse deleteProcessInstanceWithOptions(DeleteProcessInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            query.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            query.put("ProjectCode", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProcessInstance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProcessInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a worflow instance from an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DeleteProcessInstanceRequest
     * @return DeleteProcessInstanceResponse
     */
    public DeleteProcessInstanceResponse deleteProcessInstance(DeleteProcessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProcessInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSparkTemplateResponse
     */
    public DeleteSparkTemplateResponse deleteSparkTemplateWithOptions(DeleteSparkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSparkTemplate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSparkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateRequest
     * @return DeleteSparkTemplateResponse
     */
    public DeleteSparkTemplateResponse deleteSparkTemplate(DeleteSparkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSparkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSparkTemplateFileResponse
     */
    public DeleteSparkTemplateFileResponse deleteSparkTemplateFileWithOptions(DeleteSparkTemplateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSparkTemplateFile"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSparkTemplateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateFileRequest
     * @return DeleteSparkTemplateFileResponse
     */
    public DeleteSparkTemplateFileResponse deleteSparkTemplateFile(DeleteSparkTemplateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSparkTemplateFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions of a database account on all permission levels.</p>
     * 
     * @param request DescribeAccountAllPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountAllPrivilegesResponse
     */
    public DescribeAccountAllPrivilegesResponse describeAccountAllPrivilegesWithOptions(DescribeAccountAllPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountAllPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountAllPrivilegesResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions of a database account on all permission levels.</p>
     * 
     * @param request DescribeAccountAllPrivilegesRequest
     * @return DescribeAccountAllPrivilegesResponse
     */
    public DescribeAccountAllPrivilegesResponse describeAccountAllPrivileges(DescribeAccountAllPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountAllPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the databases, tables, and columns on which a database account has permissions.</p>
     * 
     * @param request DescribeAccountPrivilegeObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountPrivilegeObjectsResponse
     */
    public DescribeAccountPrivilegeObjectsResponse describeAccountPrivilegeObjectsWithOptions(DescribeAccountPrivilegeObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnPrivilegeObject)) {
            query.put("ColumnPrivilegeObject", request.columnPrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePrivilegeObject)) {
            query.put("DatabasePrivilegeObject", request.databasePrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tablePrivilegeObject)) {
            query.put("TablePrivilegeObject", request.tablePrivilegeObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountPrivilegeObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountPrivilegeObjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the databases, tables, and columns on which a database account has permissions.</p>
     * 
     * @param request DescribeAccountPrivilegeObjectsRequest
     * @return DescribeAccountPrivilegeObjectsResponse
     */
    public DescribeAccountPrivilegeObjectsResponse describeAccountPrivilegeObjects(DescribeAccountPrivilegeObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountPrivilegeObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某一ADB账户的权限</p>
     * 
     * @param request DescribeAccountPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountPrivilegesResponse
     */
    public DescribeAccountPrivilegesResponse describeAccountPrivilegesWithOptions(DescribeAccountPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnPrivilegeObject)) {
            query.put("ColumnPrivilegeObject", request.columnPrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePrivilegeObject)) {
            query.put("DatabasePrivilegeObject", request.databasePrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tablePrivilegeObject)) {
            query.put("TablePrivilegeObject", request.tablePrivilegeObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountPrivilegesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某一ADB账户的权限</p>
     * 
     * @param request DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     */
    public DescribeAccountPrivilegesResponse describeAccountPrivileges(DescribeAccountPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the database accounts of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccounts"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the database accounts of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about table columns for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAdbMySqlColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlColumnsResponse
     */
    public DescribeAdbMySqlColumnsResponse describeAdbMySqlColumnsWithOptions(DescribeAdbMySqlColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlColumns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about table columns for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAdbMySqlColumnsRequest
     * @return DescribeAdbMySqlColumnsResponse
     */
    public DescribeAdbMySqlColumnsResponse describeAdbMySqlColumns(DescribeAdbMySqlColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAdbMySqlSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlSchemasResponse
     */
    public DescribeAdbMySqlSchemasResponse describeAdbMySqlSchemasWithOptions(DescribeAdbMySqlSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAdbMySqlSchemas"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlSchemasResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAdbMySqlSchemasRequest
     * @return DescribeAdbMySqlSchemasResponse
     */
    public DescribeAdbMySqlSchemasResponse describeAdbMySqlSchemas(DescribeAdbMySqlSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlSchemasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAdbMySqlTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlTablesResponse
     */
    public DescribeAdbMySqlTablesResponse describeAdbMySqlTablesWithOptions(DescribeAdbMySqlTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlTables"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAdbMySqlTablesRequest
     * @return DescribeAdbMySqlTablesResponse
     */
    public DescribeAdbMySqlTablesResponse describeAdbMySqlTables(DescribeAdbMySqlTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases, tables, and columns in an AnalyticDB for MySQL cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases, tables, and columns in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSource(DescribeAllDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a real-time data ingestion job for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeApsActionLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsActionLogsResponse
     */
    public DescribeApsActionLogsResponse describeApsActionLogsWithOptions(DescribeApsActionLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stage)) {
            query.put("Stage", request.stage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            query.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsActionLogs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsActionLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a real-time data ingestion job for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeApsActionLogsRequest
     * @return DescribeApsActionLogsResponse
     */
    public DescribeApsActionLogsResponse describeApsActionLogs(DescribeApsActionLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsActionLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeApsResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsResourceGroupsResponse
     */
    public DescribeApsResourceGroupsResponse describeApsResourceGroupsWithOptions(DescribeApsResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsResourceGroups"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsResourceGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeApsResourceGroupsRequest
     * @return DescribeApsResourceGroupsResponse
     */
    public DescribeApsResourceGroupsResponse describeApsResourceGroups(DescribeApsResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried. The following operations are not recorded in SQL audit logs: <strong>INSERT INTO VALUES</strong>, <strong>REPLACE INTO VALUES</strong>, and <strong>UPSERT INTO VALUES</strong>.</p>
     * <ul>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL audit logs of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAuditLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditLogRecordsResponse
     */
    public DescribeAuditLogRecordsResponse describeAuditLogRecordsWithOptions(DescribeAuditLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            query.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.proxyUser)) {
            query.put("ProxyUser", request.proxyUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeyword)) {
            query.put("QueryKeyword", request.queryKeyword);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.succeed)) {
            query.put("Succeed", request.succeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditLogRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried. The following operations are not recorded in SQL audit logs: <strong>INSERT INTO VALUES</strong>, <strong>REPLACE INTO VALUES</strong>, and <strong>UPSERT INTO VALUES</strong>.</p>
     * <ul>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL audit logs of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeAuditLogRecordsRequest
     * @return DescribeAuditLogRecordsResponse
     */
    public DescribeAuditLogRecordsResponse describeAuditLogRecords(DescribeAuditLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
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
            new TeaPair("version", "2021-12-01"),
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
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
            new TeaPair("version", "2021-12-01"),
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP address whitelist of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterAccessWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAccessWhiteListResponse
     */
    public DescribeClusterAccessWhiteListResponse describeClusterAccessWhiteListWithOptions(DescribeClusterAccessWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAccessWhiteList"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAccessWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP address whitelist of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterAccessWhiteListRequest
     * @return DescribeClusterAccessWhiteListResponse
     */
    public DescribeClusterAccessWhiteListResponse describeClusterAccessWhiteList(DescribeClusterAccessWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterAccessWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the network information about an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeClusterNetInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterNetInfoResponse
     */
    public DescribeClusterNetInfoResponse describeClusterNetInfoWithOptions(DescribeClusterNetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterNetInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterNetInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the network information about an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeClusterNetInfoRequest
     * @return DescribeClusterNetInfoResponse
     */
    public DescribeClusterNetInfoResponse describeClusterNetInfo(DescribeClusterNetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterNetInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群资源统计</p>
     * 
     * @param request DescribeClusterResourceDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResourceDetailResponse
     */
    public DescribeClusterResourceDetailResponse describeClusterResourceDetailWithOptions(DescribeClusterResourceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterResourceDetail"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResourceDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群资源统计</p>
     * 
     * @param request DescribeClusterResourceDetailRequest
     * @return DescribeClusterResourceDetailResponse
     */
    public DescribeClusterResourceDetailResponse describeClusterResourceDetail(DescribeClusterResourceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterResourceDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例资源统计</p>
     * 
     * @param request DescribeClusterResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResourceUsageResponse
     */
    public DescribeClusterResourceUsageResponse describeClusterResourceUsageWithOptions(DescribeClusterResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResourceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例资源统计</p>
     * 
     * @param request DescribeClusterResourceUsageRequest
     * @return DescribeClusterResourceUsageResponse
     */
    public DescribeClusterResourceUsageResponse describeClusterResourceUsage(DescribeClusterResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of columns in a table.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of columns in a table.</p>
     * 
     * @param request DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例计算资源使用统计</p>
     * 
     * @param request DescribeComputeResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComputeResourceUsageResponse
     */
    public DescribeComputeResourceUsageResponse describeComputeResourceUsageWithOptions(DescribeComputeResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComputeResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComputeResourceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例计算资源使用统计</p>
     * 
     * @param request DescribeComputeResourceUsageRequest
     * @return DescribeComputeResourceUsageResponse
     */
    public DescribeComputeResourceUsageResponse describeComputeResourceUsage(DescribeComputeResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComputeResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAttribute"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the health status of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDBClusterHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterHealthStatusResponse
     */
    public DescribeDBClusterHealthStatusResponse describeDBClusterHealthStatusWithOptions(DescribeDBClusterHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeDBClusterHealthStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterHealthStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the health status of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDBClusterHealthStatusRequest
     * @return DescribeDBClusterHealthStatusResponse
     */
    public DescribeDBClusterHealthStatusResponse describeDBClusterHealthStatus(DescribeDBClusterHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of an AnalyticDB for MySQL cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePools)) {
            query.put("ResourcePools", request.resourcePools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterPerformance"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage overview information of an AnalyticDB for MySQL cluster, such as the total data size, hot data size, cold data size, and data growth.</p>
     * 
     * @param request DescribeDBClusterSpaceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterSpaceSummaryResponse
     */
    public DescribeDBClusterSpaceSummaryResponse describeDBClusterSpaceSummaryWithOptions(DescribeDBClusterSpaceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeDBClusterSpaceSummary"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterSpaceSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage overview information of an AnalyticDB for MySQL cluster, such as the total data size, hot data size, cold data size, and data growth.</p>
     * 
     * @param request DescribeDBClusterSpaceSummaryRequest
     * @return DescribeDBClusterSpaceSummaryResponse
     */
    public DescribeDBClusterSpaceSummaryResponse describeDBClusterSpaceSummary(DescribeDBClusterSpaceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterSpaceSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of states for AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters.</p>
     * 
     * @param request DescribeDBClusterStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterStatusResponse
     */
    public DescribeDBClusterStatusResponse describeDBClusterStatusWithOptions(DescribeDBClusterStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of states for AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters.</p>
     * 
     * @param request DescribeDBClusterStatusRequest
     * @return DescribeDBClusterStatusResponse
     */
    public DescribeDBClusterStatusResponse describeDBClusterStatus(DescribeDBClusterStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters in a region.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterVersion)) {
            query.put("DBClusterVersion", request.DBClusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            query.put("ProductVersion", request.productVersion);
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
            new TeaPair("action", "DescribeDBClusters"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters in a region.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroupWithOptions(DescribeDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroup(DescribeDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the deduplicated statistics of resource groups, databases, usernames, and source IP addresses about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDiagnosisDimensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisDimensionsResponse
     */
    public DescribeDiagnosisDimensionsResponse describeDiagnosisDimensionsWithOptions(DescribeDiagnosisDimensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
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
            new TeaPair("action", "DescribeDiagnosisDimensions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisDimensionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the deduplicated statistics of resource groups, databases, usernames, and source IP addresses about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    public DescribeDiagnosisDimensionsResponse describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisDimensionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDiagnosisRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisRecordsResponse
     */
    public DescribeDiagnosisRecordsResponse describeDiagnosisRecordsWithOptions(DescribeDiagnosisRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPeakMemory)) {
            query.put("MaxPeakMemory", request.maxPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxScanSize)) {
            query.put("MaxScanSize", request.maxScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPeakMemory)) {
            query.put("MinPeakMemory", request.minPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minScanSize)) {
            query.put("MinScanSize", request.minScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternId)) {
            query.put("PatternId", request.patternId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    public DescribeDiagnosisRecordsResponse describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information about an SQL statement, including the execution plan, execution information, resource usage, and self-diagnostics results.</p>
     * 
     * @param request DescribeDiagnosisSQLInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfoWithOptions(DescribeDiagnosisSQLInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisSQLInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisSQLInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information about an SQL statement, including the execution plan, execution information, resource usage, and self-diagnostics results.</p>
     * 
     * @param request DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisSQLInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the last five SQL query download tasks of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDownloadRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecordsWithOptions(DescribeDownloadRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the last five SQL query download tasks of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecords(DescribeDownloadRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see DescribeElasticPlanAttribute.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlanAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlanAttributeResponse
     */
    public DescribeElasticPlanAttributeResponse describeElasticPlanAttributeWithOptions(DescribeElasticPlanAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlanAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlanAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see DescribeElasticPlanAttribute.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlanAttributeRequest
     * @return DescribeElasticPlanAttributeResponse
     */
    public DescribeElasticPlanAttributeResponse describeElasticPlanAttribute(DescribeElasticPlanAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlanAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of scaling plan jobs for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlanJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlanJobsResponse
     */
    public DescribeElasticPlanJobsResponse describeElasticPlanJobsWithOptions(DescribeElasticPlanJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
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
            new TeaPair("action", "DescribeElasticPlanJobs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlanJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of scaling plan jobs for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlanJobsRequest
     * @return DescribeElasticPlanJobsResponse
     */
    public DescribeElasticPlanJobsResponse describeElasticPlanJobs(DescribeElasticPlanJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlanJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource specifications that are supported by different types of scaling plans of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlanSpecificationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlanSpecificationsResponse
     */
    public DescribeElasticPlanSpecificationsResponse describeElasticPlanSpecificationsWithOptions(DescribeElasticPlanSpecificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlanSpecifications"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlanSpecificationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource specifications that are supported by different types of scaling plans of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlanSpecificationsRequest
     * @return DescribeElasticPlanSpecificationsResponse
     */
    public DescribeElasticPlanSpecificationsResponse describeElasticPlanSpecifications(DescribeElasticPlanSpecificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlanSpecificationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scaling plans of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlansResponse
     */
    public DescribeElasticPlansResponse describeElasticPlansWithOptions(DescribeElasticPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlans"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scaling plans of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeElasticPlansRequest
     * @return DescribeElasticPlansResponse
     */
    public DescribeElasticPlansResponse describeElasticPlans(DescribeElasticPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permission level and permissions supported for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeEnabledPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnabledPrivilegesResponse
     */
    public DescribeEnabledPrivilegesResponse describeEnabledPrivilegesWithOptions(DescribeEnabledPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnabledPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnabledPrivilegesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permission level and permissions supported for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeEnabledPrivilegesRequest
     * @return DescribeEnabledPrivilegesResponse
     */
    public DescribeEnabledPrivilegesResponse describeEnabledPrivileges(DescribeEnabledPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnabledPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about tables that have excessive primary key fields in an AnalyticDB for MySQL Data Lakehouse Edition (V5.0) cluster.</p>
     * 
     * @param request DescribeExcessivePrimaryKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExcessivePrimaryKeysResponse
     */
    public DescribeExcessivePrimaryKeysResponse describeExcessivePrimaryKeysWithOptions(DescribeExcessivePrimaryKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeExcessivePrimaryKeys"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExcessivePrimaryKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about tables that have excessive primary key fields in an AnalyticDB for MySQL Data Lakehouse Edition (V5.0) cluster.</p>
     * 
     * @param request DescribeExcessivePrimaryKeysRequest
     * @return DescribeExcessivePrimaryKeysResponse
     */
    public DescribeExcessivePrimaryKeysResponse describeExcessivePrimaryKeys(DescribeExcessivePrimaryKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExcessivePrimaryKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业资源使用统计</p>
     * 
     * @param request DescribeJobResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobResourceUsageResponse
     */
    public DescribeJobResourceUsageResponse describeJobResourceUsageWithOptions(DescribeJobResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobResourceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业资源使用统计</p>
     * 
     * @param request DescribeJobResourceUsageRequest
     * @return DescribeJobResourceUsageResponse
     */
    public DescribeJobResourceUsageResponse describeJobResourceUsage(DescribeJobResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an SQL pattern such as the query duration and average memory usage for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribePatternPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePatternPerformanceResponse
     */
    public DescribePatternPerformanceResponse describePatternPerformanceWithOptions(DescribePatternPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternId)) {
            query.put("PatternId", request.patternId);
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
            new TeaPair("action", "DescribePatternPerformance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePatternPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an SQL pattern such as the query duration and average memory usage for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribePatternPerformanceRequest
     * @return DescribePatternPerformanceResponse
     */
    public DescribePatternPerformanceResponse describePatternPerformance(DescribePatternPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePatternPerformanceWithOptions(request, runtime);
    }

    /**
     * @param request DescribePerformanceViewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePerformanceViewAttributeResponse
     */
    public DescribePerformanceViewAttributeResponse describePerformanceViewAttributeWithOptions(DescribePerformanceViewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePerformanceViewAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePerformanceViewAttributeResponse());
    }

    /**
     * @param request DescribePerformanceViewAttributeRequest
     * @return DescribePerformanceViewAttributeResponse
     */
    public DescribePerformanceViewAttributeResponse describePerformanceViewAttribute(DescribePerformanceViewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePerformanceViewAttributeWithOptions(request, runtime);
    }

    /**
     * @param request DescribePerformanceViewsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePerformanceViewsResponse
     */
    public DescribePerformanceViewsResponse describePerformanceViewsWithOptions(DescribePerformanceViewsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribePerformanceViews"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePerformanceViewsResponse());
    }

    /**
     * @param request DescribePerformanceViewsRequest
     * @return DescribePerformanceViewsResponse
     */
    public DescribePerformanceViewsResponse describePerformanceViews(DescribePerformanceViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePerformanceViewsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of regions and zones in which AnalyticDB for MySQL Data Lakehouse Edition (V3.0) is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of regions and zones in which AnalyticDB for MySQL Data Lakehouse Edition (V3.0) is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of SQL patterns for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSQLPatternsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLPatternsResponse
     */
    public DescribeSQLPatternsResponse describeSQLPatternsWithOptions(DescribeSQLPatternsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLPatterns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLPatternsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of SQL patterns for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSQLPatternsRequest
     * @return DescribeSQLPatternsResponse
     */
    public DescribeSQLPatternsResponse describeSQLPatterns(DescribeSQLPatternsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLPatternsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases in an AnalyticDB for MySQL cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSchemas"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeSchemasRequest
     * @return DescribeSchemasResponse
     */
    public DescribeSchemasResponse describeSchemas(DescribeSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSchemasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution logs of Spark code.</p>
     * 
     * @param request DescribeSparkCodeLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkCodeLogResponse
     */
    public DescribeSparkCodeLogResponse describeSparkCodeLogWithOptions(DescribeSparkCodeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkCodeLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkCodeLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution logs of Spark code.</p>
     * 
     * @param request DescribeSparkCodeLogRequest
     * @return DescribeSparkCodeLogResponse
     */
    public DescribeSparkCodeLogResponse describeSparkCodeLog(DescribeSparkCodeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkCodeLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of Spark code.</p>
     * 
     * @param request DescribeSparkCodeOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkCodeOutputResponse
     */
    public DescribeSparkCodeOutputResponse describeSparkCodeOutputWithOptions(DescribeSparkCodeOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkCodeOutput"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkCodeOutputResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of Spark code.</p>
     * 
     * @param request DescribeSparkCodeOutputRequest
     * @return DescribeSparkCodeOutputResponse
     */
    public DescribeSparkCodeOutputResponse describeSparkCodeOutput(DescribeSparkCodeOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkCodeOutputWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request DescribeSparkCodeWebUiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkCodeWebUiResponse
     */
    public DescribeSparkCodeWebUiResponse describeSparkCodeWebUiWithOptions(DescribeSparkCodeWebUiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkCodeWebUi"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkCodeWebUiResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request DescribeSparkCodeWebUiRequest
     * @return DescribeSparkCodeWebUiResponse
     */
    public DescribeSparkCodeWebUiResponse describeSparkCodeWebUi(DescribeSparkCodeWebUiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkCodeWebUiWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SQL patterns of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSqlPatternRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlPatternResponse
     */
    public DescribeSqlPatternResponse describeSqlPatternWithOptions(DescribeSqlPatternRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sqlPattern)) {
            query.put("SqlPattern", request.sqlPattern);
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
            new TeaPair("action", "DescribeSqlPattern"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlPatternResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SQL patterns of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSqlPatternRequest
     * @return DescribeSqlPatternResponse
     */
    public DescribeSqlPatternResponse describeSqlPattern(DescribeSqlPatternRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlPatternWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage resource usage of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeStorageResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStorageResourceUsageResponse
     */
    public DescribeStorageResourceUsageResponse describeStorageResourceUsageWithOptions(DescribeStorageResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageResourceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage resource usage of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeStorageResourceUsageRequest
     * @return DescribeStorageResourceUsageResponse
     */
    public DescribeStorageResourceUsageResponse describeStorageResourceUsage(DescribeStorageResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStorageResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of accesses to a table or all tables in an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster on a date.</p>
     * 
     * @param request DescribeTableAccessCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTableAccessCountResponse
     */
    public DescribeTableAccessCountResponse describeTableAccessCountWithOptions(DescribeTableAccessCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTableAccessCount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableAccessCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of accesses to a table or all tables in an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster on a date.</p>
     * 
     * @param request DescribeTableAccessCountRequest
     * @return DescribeTableAccessCountResponse
     */
    public DescribeTableAccessCountResponse describeTableAccessCount(DescribeTableAccessCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableAccessCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables in a database.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTables"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables in a database.</p>
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查询配额</p>
     * 
     * @param request DescribeUserQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuotaWithOptions(DescribeUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserQuota"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查询配额</p>
     * 
     * @param request DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuota(DescribeUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request DetachUserENIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachUserENIResponse
     */
    public DetachUserENIResponse detachUserENIWithOptions(DetachUserENIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachUserENI"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachUserENIResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request DetachUserENIRequest
     * @return DetachUserENIResponse
     */
    public DetachUserENIResponse detachUserENI(DetachUserENIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachUserENIWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DisableElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableElasticPlanResponse
     */
    public DisableElasticPlanResponse disableElasticPlanWithOptions(DisableElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DisableElasticPlanRequest
     * @return DisableElasticPlanResponse
     */
    public DisableElasticPlanResponse disableElasticPlan(DisableElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Downloads the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DownloadDiagnosisRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadDiagnosisRecordsResponse
     */
    public DownloadDiagnosisRecordsResponse downloadDiagnosisRecordsWithOptions(DownloadDiagnosisRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPeakMemory)) {
            query.put("MaxPeakMemory", request.maxPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxScanSize)) {
            query.put("MaxScanSize", request.maxScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPeakMemory)) {
            query.put("MinPeakMemory", request.minPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minScanSize)) {
            query.put("MinScanSize", request.minScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadDiagnosisRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadDiagnosisRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Downloads the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DownloadDiagnosisRecordsRequest
     * @return DownloadDiagnosisRecordsResponse
     */
    public DownloadDiagnosisRecordsResponse downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadDiagnosisRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request EnableElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableElasticPlanResponse
     */
    public EnableElasticPlanResponse enableElasticPlanWithOptions(EnableElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request EnableElasticPlanRequest
     * @return EnableElasticPlanResponse
     */
    public EnableElasticPlanResponse enableElasticPlan(EnableElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a running SQL engine exists.</p>
     * 
     * @param request ExistRunningSQLEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExistRunningSQLEngineResponse
     */
    public ExistRunningSQLEngineResponse existRunningSQLEngineWithOptions(ExistRunningSQLEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExistRunningSQLEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExistRunningSQLEngineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a running SQL engine exists.</p>
     * 
     * @param request ExistRunningSQLEngineRequest
     * @return ExistRunningSQLEngineResponse
     */
    public ExistRunningSQLEngineResponse existRunningSQLEngine(ExistRunningSQLEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.existRunningSQLEngineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about databases.</p>
     * 
     * @param request GetDatabaseObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseObjectsResponse
     */
    public GetDatabaseObjectsResponse getDatabaseObjectsWithOptions(GetDatabaseObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterSchemaName)) {
            query.put("FilterSchemaName", request.filterSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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
            new TeaPair("action", "GetDatabaseObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseObjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about databases.</p>
     * 
     * @param request GetDatabaseObjectsRequest
     * @return GetDatabaseObjectsResponse
     */
    public GetDatabaseObjectsResponse getDatabaseObjects(GetDatabaseObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseObjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the retry log of a Spark application.</p>
     * 
     * @param request GetSparkAppAttemptLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppAttemptLogResponse
     */
    public GetSparkAppAttemptLogResponse getSparkAppAttemptLogWithOptions(GetSparkAppAttemptLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attemptId)) {
            body.put("AttemptId", request.attemptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLength)) {
            body.put("LogLength", request.logLength);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppAttemptLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppAttemptLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the retry log of a Spark application.</p>
     * 
     * @param request GetSparkAppAttemptLogRequest
     * @return GetSparkAppAttemptLogResponse
     */
    public GetSparkAppAttemptLogResponse getSparkAppAttemptLog(GetSparkAppAttemptLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppAttemptLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an Spark application.</p>
     * 
     * @param request GetSparkAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppInfoResponse
     */
    public GetSparkAppInfoResponse getSparkAppInfoWithOptions(GetSparkAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an Spark application.</p>
     * 
     * @param request GetSparkAppInfoRequest
     * @return GetSparkAppInfoResponse
     */
    public GetSparkAppInfoResponse getSparkAppInfo(GetSparkAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a Spark application.</p>
     * 
     * @param request GetSparkAppLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppLogResponse
     */
    public GetSparkAppLogResponse getSparkAppLogWithOptions(GetSparkAppLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLength)) {
            body.put("LogLength", request.logLength);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a Spark application.</p>
     * 
     * @param request GetSparkAppLogRequest
     * @return GetSparkAppLogResponse
     */
    public GetSparkAppLogResponse getSparkAppLog(GetSparkAppLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metrics of a Spark application.</p>
     * 
     * @param request GetSparkAppMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppMetricsResponse
     */
    public GetSparkAppMetricsResponse getSparkAppMetricsWithOptions(GetSparkAppMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppMetrics"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppMetricsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metrics of a Spark application.</p>
     * 
     * @param request GetSparkAppMetricsRequest
     * @return GetSparkAppMetricsResponse
     */
    public GetSparkAppMetricsResponse getSparkAppMetrics(GetSparkAppMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppMetricsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a Spark application.</p>
     * 
     * @param request GetSparkAppStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppStateResponse
     */
    public GetSparkAppStateResponse getSparkAppStateWithOptions(GetSparkAppStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppState"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a Spark application.</p>
     * 
     * @param request GetSparkAppStateRequest
     * @return GetSparkAppStateResponse
     */
    public GetSparkAppStateResponse getSparkAppState(GetSparkAppStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request GetSparkAppWebUiAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppWebUiAddressResponse
     */
    public GetSparkAppWebUiAddressResponse getSparkAppWebUiAddressWithOptions(GetSparkAppWebUiAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppWebUiAddress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppWebUiAddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request GetSparkAppWebUiAddressRequest
     * @return GetSparkAppWebUiAddressResponse
     */
    public GetSparkAppWebUiAddressResponse getSparkAppWebUiAddress(GetSparkAppWebUiAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppWebUiAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the Spark log configuration of an AnalyticDB for MySQL cluster, including the default Spark log path.</p>
     * 
     * @param request GetSparkConfigLogPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkConfigLogPathResponse
     */
    public GetSparkConfigLogPathResponse getSparkConfigLogPathWithOptions(GetSparkConfigLogPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkConfigLogPath"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkConfigLogPathResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the Spark log configuration of an AnalyticDB for MySQL cluster, including the default Spark log path.</p>
     * 
     * @param request GetSparkConfigLogPathRequest
     * @return GetSparkConfigLogPathResponse
     */
    public GetSparkConfigLogPathResponse getSparkConfigLogPath(GetSparkConfigLogPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkConfigLogPathWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the common definitions of Spark applications.</p>
     * 
     * @param request GetSparkDefinitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkDefinitionsResponse
     */
    public GetSparkDefinitionsResponse getSparkDefinitionsWithOptions(GetSparkDefinitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkDefinitions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkDefinitionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the common definitions of Spark applications.</p>
     * 
     * @param request GetSparkDefinitionsRequest
     * @return GetSparkDefinitionsResponse
     */
    public GetSparkDefinitionsResponse getSparkDefinitions(GetSparkDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkDefinitionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a Spark log analysis task.</p>
     * 
     * @param request GetSparkLogAnalyzeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkLogAnalyzeTaskResponse
     */
    public GetSparkLogAnalyzeTaskResponse getSparkLogAnalyzeTaskWithOptions(GetSparkLogAnalyzeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkLogAnalyzeTask"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkLogAnalyzeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a Spark log analysis task.</p>
     * 
     * @param request GetSparkLogAnalyzeTaskRequest
     * @return GetSparkLogAnalyzeTaskResponse
     */
    public GetSparkLogAnalyzeTaskResponse getSparkLogAnalyzeTask(GetSparkLogAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkLogAnalyzeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the state information about the Spark SQL engine.</p>
     * 
     * @param request GetSparkSQLEngineStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkSQLEngineStateResponse
     */
    public GetSparkSQLEngineStateResponse getSparkSQLEngineStateWithOptions(GetSparkSQLEngineStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkSQLEngineState"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkSQLEngineStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the state information about the Spark SQL engine.</p>
     * 
     * @param request GetSparkSQLEngineStateRequest
     * @return GetSparkSQLEngineStateResponse
     */
    public GetSparkSQLEngineStateResponse getSparkSQLEngineState(GetSparkSQLEngineStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkSQLEngineStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of a Spark application template.</p>
     * 
     * @param request GetSparkTemplateFileContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkTemplateFileContentResponse
     */
    public GetSparkTemplateFileContentResponse getSparkTemplateFileContentWithOptions(GetSparkTemplateFileContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkTemplateFileContent"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkTemplateFileContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of a Spark application template.</p>
     * 
     * @param request GetSparkTemplateFileContentRequest
     * @return GetSparkTemplateFileContentResponse
     */
    public GetSparkTemplateFileContentResponse getSparkTemplateFileContent(GetSparkTemplateFileContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkTemplateFileContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the directory structure but not application data in the directory. To query the directory structure that contains application data, call the <a href="https://help.aliyun.com/document_detail/612467.html">GetSparkTemplateFullTree</a> operation.</p>
     * <ul>
     * <li>General endpoint: <code>adb.aliyuncs.com</code>.</li>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFolderTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkTemplateFolderTreeResponse
     */
    public GetSparkTemplateFolderTreeResponse getSparkTemplateFolderTreeWithOptions(GetSparkTemplateFolderTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkTemplateFolderTree"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkTemplateFolderTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the directory structure but not application data in the directory. To query the directory structure that contains application data, call the <a href="https://help.aliyun.com/document_detail/612467.html">GetSparkTemplateFullTree</a> operation.</p>
     * <ul>
     * <li>General endpoint: <code>adb.aliyuncs.com</code>.</li>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFolderTreeRequest
     * @return GetSparkTemplateFolderTreeResponse
     */
    public GetSparkTemplateFolderTreeResponse getSparkTemplateFolderTree(GetSparkTemplateFolderTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkTemplateFolderTreeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFullTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkTemplateFullTreeResponse
     */
    public GetSparkTemplateFullTreeResponse getSparkTemplateFullTreeWithOptions(GetSparkTemplateFullTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkTemplateFullTree"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkTemplateFullTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFullTreeRequest
     * @return GetSparkTemplateFullTreeResponse
     */
    public GetSparkTemplateFullTreeResponse getSparkTemplateFullTree(GetSparkTemplateFullTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkTemplateFullTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取表</p>
     * 
     * @param request GetTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(GetTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取表</p>
     * 
     * @param request GetTableRequest
     * @return GetTableResponse
     */
    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about columns.</p>
     * 
     * @param request GetTableColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumnsWithOptions(GetTableColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
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
            new TeaPair("action", "GetTableColumns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about columns.</p>
     * 
     * @param request GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumns(GetTableColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a table.</p>
     * 
     * @param request GetTableDDLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableDDLResponse
     */
    public GetTableDDLResponse getTableDDLWithOptions(GetTableDDLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "GetTableDDL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableDDLResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a table.</p>
     * 
     * @param request GetTableDDLRequest
     * @return GetTableDDLResponse
     */
    public GetTableDDLResponse getTableDDL(GetTableDDLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableDDLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取table概要信息</p>
     * 
     * @param request GetTableObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableObjectsResponse
     */
    public GetTableObjectsResponse getTableObjectsWithOptions(GetTableObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterDescription)) {
            query.put("FilterDescription", request.filterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTblName)) {
            query.put("FilterTblName", request.filterTblName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTblType)) {
            query.put("FilterTblType", request.filterTblType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取table概要信息</p>
     * 
     * @param request GetTableObjectsRequest
     * @return GetTableObjectsResponse
     */
    public GetTableObjectsResponse getTableObjects(GetTableObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableObjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a view.</p>
     * 
     * @param request GetViewDDLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetViewDDLResponse
     */
    public GetViewDDLResponse getViewDDLWithOptions(GetViewDDLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetViewDDL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetViewDDLResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a view.</p>
     * 
     * @param request GetViewDDLRequest
     * @return GetViewDDLResponse
     */
    public GetViewDDLResponse getViewDDL(GetViewDDLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getViewDDLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about views.</p>
     * 
     * @param request GetViewObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetViewObjectsResponse
     */
    public GetViewObjectsResponse getViewObjectsWithOptions(GetViewObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterViewName)) {
            query.put("FilterViewName", request.filterViewName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterViewType)) {
            query.put("FilterViewType", request.filterViewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetViewObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetViewObjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about views.</p>
     * 
     * @param request GetViewObjectsRequest
     * @return GetViewObjectsResponse
     */
    public GetViewObjectsResponse getViewObjects(GetViewObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getViewObjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark application.</p>
     * 
     * @param request KillSparkAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillSparkAppResponse
     */
    public KillSparkAppResponse killSparkAppWithOptions(KillSparkAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillSparkApp"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillSparkAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark application.</p>
     * 
     * @param request KillSparkAppRequest
     * @return KillSparkAppResponse
     */
    public KillSparkAppResponse killSparkApp(KillSparkAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark log analysis task and queries the information about the analysis task.</p>
     * 
     * @param request KillSparkLogAnalyzeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillSparkLogAnalyzeTaskResponse
     */
    public KillSparkLogAnalyzeTaskResponse killSparkLogAnalyzeTaskWithOptions(KillSparkLogAnalyzeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillSparkLogAnalyzeTask"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillSparkLogAnalyzeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark log analysis task and queries the information about the analysis task.</p>
     * 
     * @param request KillSparkLogAnalyzeTaskRequest
     * @return KillSparkLogAnalyzeTaskResponse
     */
    public KillSparkLogAnalyzeTaskResponse killSparkLogAnalyzeTask(KillSparkLogAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkLogAnalyzeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shuts down a Spark SQL engine.</p>
     * 
     * @param request KillSparkSQLEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillSparkSQLEngineResponse
     */
    public KillSparkSQLEngineResponse killSparkSQLEngineWithOptions(KillSparkSQLEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillSparkSQLEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillSparkSQLEngineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shuts down a Spark SQL engine.</p>
     * 
     * @param request KillSparkSQLEngineRequest
     * @return KillSparkSQLEngineResponse
     */
    public KillSparkSQLEngineResponse killSparkSQLEngine(KillSparkSQLEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkSQLEngineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about retry attempts of a Spark application.</p>
     * 
     * @param request ListSparkAppAttemptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkAppAttemptsResponse
     */
    public ListSparkAppAttemptsResponse listSparkAppAttemptsWithOptions(ListSparkAppAttemptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkAppAttempts"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkAppAttemptsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about retry attempts of a Spark application.</p>
     * 
     * @param request ListSparkAppAttemptsRequest
     * @return ListSparkAppAttemptsResponse
     */
    public ListSparkAppAttemptsResponse listSparkAppAttempts(ListSparkAppAttemptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkAppAttemptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Spark applications that run on an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ListSparkAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkAppsResponse
     */
    public ListSparkAppsResponse listSparkAppsWithOptions(ListSparkAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkApps"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Spark applications that run on an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ListSparkAppsRequest
     * @return ListSparkAppsResponse
     */
    public ListSparkAppsResponse listSparkApps(ListSparkAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Spark log analysis tasks.</p>
     * 
     * @param request ListSparkLogAnalyzeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkLogAnalyzeTasksResponse
     */
    public ListSparkLogAnalyzeTasksResponse listSparkLogAnalyzeTasksWithOptions(ListSparkLogAnalyzeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkLogAnalyzeTasks"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkLogAnalyzeTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Spark log analysis tasks.</p>
     * 
     * @param request ListSparkLogAnalyzeTasksRequest
     * @return ListSparkLogAnalyzeTasksResponse
     */
    public ListSparkLogAnalyzeTasksResponse listSparkLogAnalyzeTasks(ListSparkLogAnalyzeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkLogAnalyzeTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all Spark template file IDs of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ListSparkTemplateFileIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkTemplateFileIdsResponse
     */
    public ListSparkTemplateFileIdsResponse listSparkTemplateFileIdsWithOptions(ListSparkTemplateFileIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkTemplateFileIds"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkTemplateFileIdsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all Spark template file IDs of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ListSparkTemplateFileIdsRequest
     * @return ListSparkTemplateFileIdsResponse
     */
    public ListSparkTemplateFileIdsResponse listSparkTemplateFileIds(ListSparkTemplateFileIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkTemplateFileIdsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Loads a built-in dataset.</p>
     * 
     * @param request LoadSampleDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoadSampleDataSetResponse
     */
    public LoadSampleDataSetResponse loadSampleDataSetWithOptions(LoadSampleDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoadSampleDataSet"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoadSampleDataSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Loads a built-in dataset.</p>
     * 
     * @param request LoadSampleDataSetRequest
     * @return LoadSampleDataSetResponse
     */
    public LoadSampleDataSetResponse loadSampleDataSet(LoadSampleDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loadSampleDataSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a database account for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a database account for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the permissions of a database account.</p>
     * 
     * @param tmpReq ModifyAccountPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountPrivilegesResponse
     */
    public ModifyAccountPrivilegesResponse modifyAccountPrivilegesWithOptions(ModifyAccountPrivilegesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAccountPrivilegesShrinkRequest request = new ModifyAccountPrivilegesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountPrivileges)) {
            request.accountPrivilegesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountPrivileges, "AccountPrivileges", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilegesShrink)) {
            query.put("AccountPrivileges", request.accountPrivilegesShrink);
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
            new TeaPair("action", "ModifyAccountPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPrivilegesResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the permissions of a database account.</p>
     * 
     * @param request ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     */
    public ModifyAccountPrivilegesResponse modifyAccountPrivileges(ModifyAccountPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SQL audit configuration of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyAuditLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAuditLogConfigResponse
     */
    public ModifyAuditLogConfigResponse modifyAuditLogConfigWithOptions(ModifyAuditLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditLogStatus)) {
            query.put("AuditLogStatus", request.auditLogStatus);
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
            new TeaPair("action", "ModifyAuditLogConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAuditLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SQL audit configuration of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyAuditLogConfigRequest
     * @return ModifyAuditLogConfigResponse
     */
    public ModifyAuditLogConfigResponse modifyAuditLogConfig(ModifyAuditLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAuditLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup policy of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableBackupLog)) {
            query.put("EnableBackupLog", request.enableBackupLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupRetentionPeriod)) {
            query.put("LogBackupRetentionPeriod", request.logBackupRetentionPeriod);
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
            new TeaPair("version", "2021-12-01"),
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup policy of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyClusterAccessWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterAccessWhiteListResponse
     */
    public ModifyClusterAccessWhiteListResponse modifyClusterAccessWhiteListWithOptions(ModifyClusterAccessWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterAccessWhiteList"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterAccessWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyClusterAccessWhiteListRequest
     * @return ModifyClusterAccessWhiteListResponse
     */
    public ModifyClusterAccessWhiteListResponse modifyClusterAccessWhiteList(ModifyClusterAccessWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterAccessWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the public endpoint of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyClusterConnectionStringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterConnectionStringResponse
     */
    public ModifyClusterConnectionStringResponse modifyClusterConnectionStringWithOptions(ModifyClusterConnectionStringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterConnectionString"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterConnectionStringResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the public endpoint of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyClusterConnectionStringRequest
     * @return ModifyClusterConnectionStringResponse
     */
    public ModifyClusterConnectionStringResponse modifyClusterConnectionString(ModifyClusterConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterConnectionStringWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>During a scaling event, you are not allowed to execute the <code>SUBMIT JOB</code> statement to submit asynchronous jobs. If your business requires asynchronous jobs, perform scaling during appropriate periods.</li>
     * <li>When you scale a cluster, data in the cluster is migrated for redistribution. The amount of time that is required to migrate data is proportional to the data volume. During a scaling event, the services provided by the cluster are not interrupted. When you downgrade cluster specifications, data migration may require up to dozens of hours to complete. Proceed with caution especially if your cluster contains a large amount of data.</li>
     * <li>If the cluster has a built-in dataset loaded, make sure that the cluster has reserved storage resources of at least 24 AnalyticDB compute units (ACUs). Otherwise, the built-in dataset cannot be used.</li>
     * <li>When the scaling process is about to end, transient connections may occur. We recommend that you scale your cluster during off-peak hours or make sure that your application is configured to automatically reconnect to your cluster.</li>
     * <li>You can change an AnalyticDB for MySQL cluster from Data Warehouse Edition (V3.0) to Data Lakehouse Edition (V3.0), but not the other way around. For more information, see Change a cluster from Data Warehouse Edition to Data Lakehouse Edition. For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBClusterWithOptions(ModifyDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computeResource)) {
            query.put("ComputeResource", request.computeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDefaultResourcePool)) {
            query.put("EnableDefaultResourcePool", request.enableDefaultResourcePool);
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

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeCount)) {
            query.put("ReservedNodeCount", request.reservedNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeSize)) {
            query.put("ReservedNodeSize", request.reservedNodeSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageResource)) {
            query.put("StorageResource", request.storageResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBCluster"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>During a scaling event, you are not allowed to execute the <code>SUBMIT JOB</code> statement to submit asynchronous jobs. If your business requires asynchronous jobs, perform scaling during appropriate periods.</li>
     * <li>When you scale a cluster, data in the cluster is migrated for redistribution. The amount of time that is required to migrate data is proportional to the data volume. During a scaling event, the services provided by the cluster are not interrupted. When you downgrade cluster specifications, data migration may require up to dozens of hours to complete. Proceed with caution especially if your cluster contains a large amount of data.</li>
     * <li>If the cluster has a built-in dataset loaded, make sure that the cluster has reserved storage resources of at least 24 AnalyticDB compute units (ACUs). Otherwise, the built-in dataset cannot be used.</li>
     * <li>When the scaling process is about to end, transient connections may occur. We recommend that you scale your cluster during off-peak hours or make sure that your application is configured to automatically reconnect to your cluster.</li>
     * <li>You can change an AnalyticDB for MySQL cluster from Data Warehouse Edition (V3.0) to Data Lakehouse Edition (V3.0), but not the other way around. For more information, see Change a cluster from Data Warehouse Edition to Data Lakehouse Edition. For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBCluster(ModifyDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster to facilitate the maintenance and management of the cluster.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterDescription"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster to facilitate the maintenance and management of the cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterMaintainTime"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the amount of reserved computing resources for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param tmpReq ModifyDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBResourceGroupResponse
     */
    public ModifyDBResourceGroupResponse modifyDBResourceGroupWithOptions(ModifyDBResourceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDBResourceGroupShrinkRequest request = new ModifyDBResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterMode)) {
            query.put("ClusterMode", request.clusterMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSizeResource)) {
            query.put("ClusterSizeResource", request.clusterSizeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSpot)) {
            query.put("EnableSpot", request.enableSpot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxClusterCount)) {
            query.put("MaxClusterCount", request.maxClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeResource)) {
            query.put("MaxComputeResource", request.maxComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minClusterCount)) {
            query.put("MinClusterCount", request.minClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minComputeResource)) {
            query.put("MinComputeResource", request.minComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the amount of reserved computing resources for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyDBResourceGroupRequest
     * @return ModifyDBResourceGroupResponse
     */
    public ModifyDBResourceGroupResponse modifyDBResourceGroup(ModifyDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElasticPlanResponse
     */
    public ModifyElasticPlanResponse modifyElasticPlanWithOptions(ModifyElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSize)) {
            query.put("TargetSize", request.targetSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling plan for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyElasticPlanRequest
     * @return ModifyElasticPlanResponse
     */
    public ModifyElasticPlanResponse modifyElasticPlan(ModifyElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyElasticPlanWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ModifyPerformanceViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPerformanceViewResponse
     */
    public ModifyPerformanceViewResponse modifyPerformanceViewWithOptions(ModifyPerformanceViewRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPerformanceViewShrinkRequest request = new ModifyPerformanceViewShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewDetail)) {
            request.viewDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewDetail, "ViewDetail", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.viewDetailShrink)) {
            query.put("ViewDetail", request.viewDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPerformanceView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPerformanceViewResponse());
    }

    /**
     * @param request ModifyPerformanceViewRequest
     * @return ModifyPerformanceViewResponse
     */
    public ModifyPerformanceViewResponse modifyPerformanceView(ModifyPerformanceViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPerformanceViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Preloads metrics for a Spark application.</p>
     * 
     * @param request PreloadSparkAppMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadSparkAppMetricsResponse
     */
    public PreloadSparkAppMetricsResponse preloadSparkAppMetricsWithOptions(PreloadSparkAppMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadSparkAppMetrics"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadSparkAppMetricsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Preloads metrics for a Spark application.</p>
     * 
     * @param request PreloadSparkAppMetricsRequest
     * @return PreloadSparkAppMetricsResponse
     */
    public PreloadSparkAppMetricsResponse preloadSparkAppMetrics(PreloadSparkAppMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadSparkAppMetricsWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseClusterPublicConnection"),
            new TeaPair("version", "2021-12-01"),
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
     * @param request ReleaseClusterPublicConnectionRequest
     * @return ReleaseClusterPublicConnectionResponse
     */
    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseClusterPublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renames a Spark template file.</p>
     * 
     * @param request RenameSparkTemplateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameSparkTemplateFileResponse
     */
    public RenameSparkTemplateFileResponse renameSparkTemplateFileWithOptions(RenameSparkTemplateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameSparkTemplateFile"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameSparkTemplateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renames a Spark template file.</p>
     * 
     * @param request RenameSparkTemplateFileRequest
     * @return RenameSparkTemplateFileResponse
     */
    public RenameSparkTemplateFileResponse renameSparkTemplateFile(RenameSparkTemplateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameSparkTemplateFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a database account for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a database account for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Spark log configuration.</p>
     * 
     * @param request SetSparkAppLogRootPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSparkAppLogRootPathResponse
     */
    public SetSparkAppLogRootPathResponse setSparkAppLogRootPathWithOptions(SetSparkAppLogRootPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLogPath)) {
            body.put("OssLogPath", request.ossLogPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDefaultOss)) {
            body.put("UseDefaultOss", request.useDefaultOss);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSparkAppLogRootPath"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSparkAppLogRootPathResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Spark log configuration.</p>
     * 
     * @param request SetSparkAppLogRootPathRequest
     * @return SetSparkAppLogRootPathResponse
     */
    public SetSparkAppLogRootPathResponse setSparkAppLogRootPath(SetSparkAppLogRootPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSparkAppLogRootPathWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts the Spark SQL engine.</p>
     * 
     * @param request StartSparkSQLEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSparkSQLEngineResponse
     */
    public StartSparkSQLEngineResponse startSparkSQLEngineWithOptions(StartSparkSQLEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jars)) {
            body.put("Jars", request.jars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxExecutor)) {
            body.put("MaxExecutor", request.maxExecutor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minExecutor)) {
            body.put("MinExecutor", request.minExecutor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slotNum)) {
            body.put("SlotNum", request.slotNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSparkSQLEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSparkSQLEngineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts the Spark SQL engine.</p>
     * 
     * @param request StartSparkSQLEngineRequest
     * @return StartSparkSQLEngineResponse
     */
    public StartSparkSQLEngineResponse startSparkSQLEngine(StartSparkSQLEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSparkSQLEngineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark application.</p>
     * 
     * @param request SubmitSparkAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSparkAppResponse
     */
    public SubmitSparkAppResponse submitSparkAppWithOptions(SubmitSparkAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSource)) {
            body.put("AgentSource", request.agentSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFileId)) {
            body.put("TemplateFileId", request.templateFileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSparkApp"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSparkAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark application.</p>
     * 
     * @param request SubmitSparkAppRequest
     * @return SubmitSparkAppResponse
     */
    public SubmitSparkAppResponse submitSparkApp(SubmitSparkAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSparkAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark log analysis task and queries the analysis results.</p>
     * 
     * @param request SubmitSparkLogAnalyzeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSparkLogAnalyzeTaskResponse
     */
    public SubmitSparkLogAnalyzeTaskResponse submitSparkLogAnalyzeTaskWithOptions(SubmitSparkLogAnalyzeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSparkLogAnalyzeTask"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSparkLogAnalyzeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark log analysis task and queries the analysis results.</p>
     * 
     * @param request SubmitSparkLogAnalyzeTaskRequest
     * @return SubmitSparkLogAnalyzeTaskResponse
     */
    public SubmitSparkLogAnalyzeTaskResponse submitSparkLogAnalyzeTask(SubmitSparkLogAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSparkLogAnalyzeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a standard database account of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster from a Resource Access Management (RAM) user.</p>
     * 
     * @param request UnbindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAccountResponse
     */
    public UnbindAccountResponse unbindAccountWithOptions(UnbindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a standard database account of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster from a Resource Access Management (RAM) user.</p>
     * 
     * @param request UnbindAccountRequest
     * @return UnbindAccountResponse
     */
    public UnbindAccountResponse unbindAccount(UnbindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates resource groups from database accounts for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request UnbindDBResourceGroupWithUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDBResourceGroupWithUserResponse
     */
    public UnbindDBResourceGroupWithUserResponse unbindDBResourceGroupWithUserWithOptions(UnbindDBResourceGroupWithUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupUser)) {
            query.put("GroupUser", request.groupUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDBResourceGroupWithUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDBResourceGroupWithUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates resource groups from database accounts for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request UnbindDBResourceGroupWithUserRequest
     * @return UnbindDBResourceGroupWithUserResponse
     */
    public UnbindDBResourceGroupWithUserResponse unbindDBResourceGroupWithUser(UnbindDBResourceGroupWithUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDBResourceGroupWithUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a Spark application template.</p>
     * 
     * @param request UpdateSparkTemplateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSparkTemplateFileResponse
     */
    public UpdateSparkTemplateFileResponse updateSparkTemplateFileWithOptions(UpdateSparkTemplateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSparkTemplateFile"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSparkTemplateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a Spark application template.</p>
     * 
     * @param request UpdateSparkTemplateFileRequest
     * @return UpdateSparkTemplateFileResponse
     */
    public UpdateSparkTemplateFileResponse updateSparkTemplateFile(UpdateSparkTemplateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSparkTemplateFileWithOptions(request, runtime);
    }
}
