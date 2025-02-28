// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201;

import com.aliyun.tea.*;
import com.aliyun.adb_inc20211201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adb-inc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>给实例开启VPC连接</p>
     * 
     * @param request AllocateClusterVpcConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateClusterVpcConnectionResponse
     */
    public AllocateClusterVpcConnectionResponse allocateClusterVpcConnectionWithOptions(AllocateClusterVpcConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
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
            new TeaPair("action", "AllocateClusterVpcConnection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateClusterVpcConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AllocateClusterVpcConnectionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>给实例开启VPC连接</p>
     * 
     * @param request AllocateClusterVpcConnectionRequest
     * @return AllocateClusterVpcConnectionResponse
     */
    public AllocateClusterVpcConnectionResponse allocateClusterVpcConnection(AllocateClusterVpcConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateClusterVpcConnectionWithOptions(request, runtime);
    }

    /**
     * @param request AuthorizeInstanceEgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeInstanceEgressResponse
     */
    public AuthorizeInstanceEgressResponse authorizeInstanceEgressWithOptions(AuthorizeInstanceEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeInstanceEgress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeInstanceEgressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AuthorizeInstanceEgressResponse());
        }

    }

    /**
     * @param request AuthorizeInstanceEgressRequest
     * @return AuthorizeInstanceEgressResponse
     */
    public AuthorizeInstanceEgressResponse authorizeInstanceEgress(AuthorizeInstanceEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeInstanceEgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查OSS的两个文件或文件前缀下的文件内容是否一致</p>
     * 
     * @param request CheckOssObjectContentConsistencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckOssObjectContentConsistencyResponse
     */
    public CheckOssObjectContentConsistencyResponse checkOssObjectContentConsistencyWithOptions(CheckOssObjectContentConsistencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBucketName)) {
            query.put("SourceBucketName", request.sourceBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDbClusterId)) {
            query.put("SourceDbClusterId", request.sourceDbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegionId)) {
            query.put("SourceRegionId", request.sourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBucketName)) {
            query.put("TargetBucketName", request.targetBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetEndpoint)) {
            query.put("TargetEndpoint", request.targetEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckOssObjectContentConsistency"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOssObjectContentConsistencyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckOssObjectContentConsistencyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>检查OSS的两个文件或文件前缀下的文件内容是否一致</p>
     * 
     * @param request CheckOssObjectContentConsistencyRequest
     * @return CheckOssObjectContentConsistencyResponse
     */
    public CheckOssObjectContentConsistencyResponse checkOssObjectContentConsistency(CheckOssObjectContentConsistencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkOssObjectContentConsistencyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增重点客户</p>
     * 
     * @param request CreateMajorCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMajorCustomerResponse
     */
    public CreateMajorCustomerResponse createMajorCustomerWithOptions(CreateMajorCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerName)) {
            query.put("CustomerName", request.customerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pd)) {
            query.put("Pd", request.pd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pdsa)) {
            query.put("Pdsa", request.pdsa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ranking)) {
            query.put("Ranking", request.ranking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rd)) {
            query.put("Rd", request.rd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sa)) {
            query.put("Sa", request.sa);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMajorCustomer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMajorCustomerResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateMajorCustomerResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>新增重点客户</p>
     * 
     * @param request CreateMajorCustomerRequest
     * @return CreateMajorCustomerResponse
     */
    public CreateMajorCustomerResponse createMajorCustomer(CreateMajorCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMajorCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除OSS跨区域复制任务</p>
     * 
     * @param request DeleteBucketReplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBucketReplicationResponse
     */
    public DeleteBucketReplicationResponse deleteBucketReplicationWithOptions(DeleteBucketReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBucketName)) {
            query.put("SourceBucketName", request.sourceBucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketReplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBucketReplicationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketReplicationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除OSS跨区域复制任务</p>
     * 
     * @param request DeleteBucketReplicationRequest
     * @return DeleteBucketReplicationResponse
     */
    public DeleteBucketReplicationResponse deleteBucketReplication(DeleteBucketReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBucketReplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除集群</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDBClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除集群</p>
     * 
     * @param request DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除重点客户</p>
     * 
     * @param request DeleteMajorCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMajorCustomerResponse
     */
    public DeleteMajorCustomerResponse deleteMajorCustomerWithOptions(DeleteMajorCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMajorCustomer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMajorCustomerResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMajorCustomerResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除重点客户</p>
     * 
     * @param request DeleteMajorCustomerRequest
     * @return DeleteMajorCustomerResponse
     */
    public DeleteMajorCustomerResponse deleteMajorCustomer(DeleteMajorCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMajorCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询帐号列表</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAccountsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询帐号列表</p>
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
     * <p>获取ADB值班人员信息</p>
     * 
     * @param request DescribeAdbDutyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbDutyRuleResponse
     */
    public DescribeAdbDutyRuleResponse describeAdbDutyRuleWithOptions(DescribeAdbDutyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbDutyRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbDutyRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdbDutyRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取ADB值班人员信息</p>
     * 
     * @param request DescribeAdbDutyRuleRequest
     * @return DescribeAdbDutyRuleResponse
     */
    public DescribeAdbDutyRuleResponse describeAdbDutyRule(DescribeAdbDutyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbDutyRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的备份策略</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliuid)) {
            query.put("Aliuid", request.aliuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupPolicyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的备份策略</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的备份详细信息</p>
     * 
     * @param request DescribeBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupID)) {
            query.put("BackupID", request.backupID);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的备份详细信息</p>
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
     * <p>获取集群的实例信息</p>
     * 
     * @param request DescribeClusterInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterInstanceResponse
     */
    public DescribeClusterInstanceResponse describeClusterInstanceWithOptions(DescribeClusterInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterInstance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeClusterInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取集群的实例信息</p>
     * 
     * @param request DescribeClusterInstanceRequest
     * @return DescribeClusterInstanceResponse
     */
    public DescribeClusterInstanceResponse describeClusterInstance(DescribeClusterInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>描述集群网络信息</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterNetInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeClusterNetInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>描述集群网络信息</p>
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
     * <p>查看客户信息</p>
     * 
     * @param request DescribeCustomersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomersResponse
     */
    public DescribeCustomersResponse describeCustomersWithOptions(DescribeCustomersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomers"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCustomersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查看客户信息</p>
     * 
     * @param request DescribeCustomersRequest
     * @return DescribeCustomersResponse
     */
    public DescribeCustomersResponse describeCustomers(DescribeCustomersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>性能指标查询接口</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterPerformanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDBClusterPerformanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>性能指标查询接口</p>
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
     * <p>查询资源组</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroupWithOptions(DescribeDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerUid)) {
            query.put("CustomerUid", request.customerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeAINode)) {
            query.put("ExcludeAINode", request.excludeAINode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBResourceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDBResourceGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询资源组</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroup(DescribeDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeDbClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDbClusterResponse
     */
    public DescribeDbClusterResponse describeDbClusterWithOptions(DescribeDbClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("aliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDbClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeDbClusterRequest
     * @return DescribeDbClusterResponse
     */
    public DescribeDbClusterResponse describeDbCluster(DescribeDbClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的参数信息</p>
     * 
     * @param request DescribeDbClusterParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDbClusterParamResponse
     */
    public DescribeDbClusterParamResponse describeDbClusterParamWithOptions(DescribeDbClusterParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramName)) {
            query.put("ParamName", request.paramName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("aliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbClusterParam"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbClusterParamResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDbClusterParamResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的参数信息</p>
     * 
     * @param request DescribeDbClusterParamRequest
     * @return DescribeDbClusterParamResponse
     */
    public DescribeDbClusterParamResponse describeDbClusterParam(DescribeDbClusterParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbClusterParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeDbClusterV5Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDbClusterV5Response
     */
    public DescribeDbClusterV5Response describeDbClusterV5WithOptions(DescribeDbClusterV5Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("aliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbClusterV5"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbClusterV5Response());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDbClusterV5Response());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeDbClusterV5Request
     * @return DescribeDbClusterV5Response
     */
    public DescribeDbClusterV5Response describeDbClusterV5(DescribeDbClusterV5Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbClusterV5WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的版本信息</p>
     * 
     * @param request DescribeInstanceReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceReleaseResponse
     */
    public DescribeInstanceReleaseResponse describeInstanceReleaseWithOptions(DescribeInstanceReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceRelease"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceReleaseResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceReleaseResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的版本信息</p>
     * 
     * @param request DescribeInstanceReleaseRequest
     * @return DescribeInstanceReleaseResponse
     */
    public DescribeInstanceReleaseResponse describeInstanceRelease(DescribeInstanceReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceReleaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看重点客户实例列表</p>
     * 
     * @param request DescribeMajorCustomerInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMajorCustomerInstancesResponse
     */
    public DescribeMajorCustomerInstancesResponse describeMajorCustomerInstancesWithOptions(DescribeMajorCustomerInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerIds)) {
            query.put("CustomerIds", request.customerIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMajorCustomerInstances"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMajorCustomerInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeMajorCustomerInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查看重点客户实例列表</p>
     * 
     * @param request DescribeMajorCustomerInstancesRequest
     * @return DescribeMajorCustomerInstancesResponse
     */
    public DescribeMajorCustomerInstancesResponse describeMajorCustomerInstances(DescribeMajorCustomerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMajorCustomerInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看重点客户信息</p>
     * 
     * @param request DescribeMajorCustomersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMajorCustomersResponse
     */
    public DescribeMajorCustomersResponse describeMajorCustomersWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMajorCustomers"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMajorCustomersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeMajorCustomersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查看重点客户信息</p>
     * @return DescribeMajorCustomersResponse
     */
    public DescribeMajorCustomersResponse describeMajorCustomers() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMajorCustomersWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS跨区域复制任务进度</p>
     * 
     * @param request DescribeOssBucketReplicationProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssBucketReplicationProgressResponse
     */
    public DescribeOssBucketReplicationProgressResponse describeOssBucketReplicationProgressWithOptions(DescribeOssBucketReplicationProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssBucketReplicationProgress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssBucketReplicationProgressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeOssBucketReplicationProgressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS跨区域复制任务进度</p>
     * 
     * @param request DescribeOssBucketReplicationProgressRequest
     * @return DescribeOssBucketReplicationProgressResponse
     */
    public DescribeOssBucketReplicationProgressResponse describeOssBucketReplicationProgress(DescribeOssBucketReplicationProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssBucketReplicationProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS跨区域复制任务进度</p>
     * 
     * @param request DescribeOssBucketReplicationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssBucketReplicationRulesResponse
     */
    public DescribeOssBucketReplicationRulesResponse describeOssBucketReplicationRulesWithOptions(DescribeOssBucketReplicationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssBucketReplicationRules"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssBucketReplicationRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeOssBucketReplicationRulesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS跨区域复制任务进度</p>
     * 
     * @param request DescribeOssBucketReplicationRulesRequest
     * @return DescribeOssBucketReplicationRulesResponse
     */
    public DescribeOssBucketReplicationRulesResponse describeOssBucketReplicationRules(DescribeOssBucketReplicationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssBucketReplicationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的OSS信息</p>
     * 
     * @param request DescribeOssInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssInfoResponse
     */
    public DescribeOssInfoResponse describeOssInfoWithOptions(DescribeOssInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeOssInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的OSS信息</p>
     * 
     * @param request DescribeOssInfoRequest
     * @return DescribeOssInfoResponse
     */
    public DescribeOssInfoResponse describeOssInfo(DescribeOssInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的OSS信息</p>
     * 
     * @param request DescribeOssInfoV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssInfoV2Response
     */
    public DescribeOssInfoV2Response describeOssInfoV2WithOptions(DescribeOssInfoV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("aliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssInfoV2"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssInfoV2Response());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeOssInfoV2Response());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的OSS信息</p>
     * 
     * @param request DescribeOssInfoV2Request
     * @return DescribeOssInfoV2Response
     */
    public DescribeOssInfoV2Response describeOssInfoV2(DescribeOssInfoV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssInfoV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步任务状态</p>
     * 
     * @param request DescribeTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskStatusResponse
     */
    public DescribeTaskStatusResponse describeTaskStatusWithOptions(DescribeTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTaskStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询异步任务状态</p>
     * 
     * @param request DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     */
    public DescribeTaskStatusResponse describeTaskStatus(DescribeTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>弹性导入生成鉴权token接口。</p>
     * 
     * @param request GenerateZeroEtlTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateZeroEtlTokenResponse
     */
    public GenerateZeroEtlTokenResponse generateZeroEtlTokenWithOptions(GenerateZeroEtlTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarDBInstanceId)) {
            body.put("PolarDBInstanceId", request.polarDBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.UID)) {
            body.put("UID", request.UID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateZeroEtlToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateZeroEtlTokenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenerateZeroEtlTokenResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>弹性导入生成鉴权token接口。</p>
     * 
     * @param request GenerateZeroEtlTokenRequest
     * @return GenerateZeroEtlTokenResponse
     */
    public GenerateZeroEtlTokenResponse generateZeroEtlToken(GenerateZeroEtlTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateZeroEtlTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取aat表oss信息。</p>
     * 
     * @param request GetAATOssInfoForADBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAATOssInfoForADBResponse
     */
    public GetAATOssInfoForADBResponse getAATOssInfoForADBWithOptions(GetAATOssInfoForADBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarDBInstanceId)) {
            body.put("PolarDBInstanceId", request.polarDBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAATOssInfoForADB"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAATOssInfoForADBResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAATOssInfoForADBResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取aat表oss信息。</p>
     * 
     * @param request GetAATOssInfoForADBRequest
     * @return GetAATOssInfoForADBResponse
     */
    public GetAATOssInfoForADBResponse getAATOssInfoForADB(GetAATOssInfoForADBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAATOssInfoForADBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询OSS Bucket传输加速功能</p>
     * 
     * @param request GetBucketTransferAccelerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBucketTransferAccelerationResponse
     */
    public GetBucketTransferAccelerationResponse getBucketTransferAccelerationWithOptions(GetBucketTransferAccelerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketTransferAcceleration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBucketTransferAccelerationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketTransferAccelerationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询OSS Bucket传输加速功能</p>
     * 
     * @param request GetBucketTransferAccelerationRequest
     * @return GetBucketTransferAccelerationResponse
     */
    public GetBucketTransferAccelerationResponse getBucketTransferAcceleration(GetBucketTransferAccelerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBucketTransferAccelerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例资源组</p>
     * 
     * @param request GetDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDBResourceGroupResponse
     */
    public GetDBResourceGroupResponse getDBResourceGroupWithOptions(GetDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDBResourceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDBResourceGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例资源组</p>
     * 
     * @param request GetDBResourceGroupRequest
     * @return GetDBResourceGroupResponse
     */
    public GetDBResourceGroupResponse getDBResourceGroup(GetDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取打通DMS AI Service的pvl并初始化K8s环境任务的结果</p>
     * 
     * @param request GetInitDmsAIServiceK8sEnvInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInitDmsAIServiceK8sEnvInfoResponse
     */
    public GetInitDmsAIServiceK8sEnvInfoResponse getInitDmsAIServiceK8sEnvInfoWithOptions(GetInitDmsAIServiceK8sEnvInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInitDmsAIServiceK8sEnvInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetInitDmsAIServiceK8sEnvInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetInitDmsAIServiceK8sEnvInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取打通DMS AI Service的pvl并初始化K8s环境任务的结果</p>
     * 
     * @param request GetInitDmsAIServiceK8sEnvInfoRequest
     * @return GetInitDmsAIServiceK8sEnvInfoResponse
     */
    public GetInitDmsAIServiceK8sEnvInfoResponse getInitDmsAIServiceK8sEnvInfo(GetInitDmsAIServiceK8sEnvInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInitDmsAIServiceK8sEnvInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用指标信息</p>
     * 
     * @param request GetSparkAppMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppMetricsResponse
     */
    public GetSparkAppMetricsResponse getSparkAppMetricsWithOptions(GetSparkAppMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppMetricsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSparkAppMetricsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用指标信息</p>
     * 
     * @param request GetSparkAppMetricsRequest
     * @return GetSparkAppMetricsResponse
     */
    public GetSparkAppMetricsResponse getSparkAppMetrics(GetSparkAppMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取提交Spark需要的必要信息</p>
     * 
     * @param request GetSparkSubmitInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkSubmitInfoResponse
     */
    public GetSparkSubmitInfoResponse getSparkSubmitInfoWithOptions(GetSparkSubmitInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conf)) {
            body.put("Conf", request.conf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkSubmitInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkSubmitInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSparkSubmitInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取提交Spark需要的必要信息</p>
     * 
     * @param request GetSparkSubmitInfoRequest
     * @return GetSparkSubmitInfoResponse
     */
    public GetSparkSubmitInfoResponse getSparkSubmitInfo(GetSparkSubmitInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkSubmitInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打通DMS AI Service的pvl并初始化K8s环境</p>
     * 
     * @param request InitDmsAIServiceK8sEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitDmsAIServiceK8sEnvResponse
     */
    public InitDmsAIServiceK8sEnvResponse initDmsAIServiceK8sEnvWithOptions(InitDmsAIServiceK8sEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
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
            new TeaPair("action", "InitDmsAIServiceK8sEnv"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InitDmsAIServiceK8sEnvResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InitDmsAIServiceK8sEnvResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>打通DMS AI Service的pvl并初始化K8s环境</p>
     * 
     * @param request InitDmsAIServiceK8sEnvRequest
     * @return InitDmsAIServiceK8sEnvResponse
     */
    public InitDmsAIServiceK8sEnvResponse initDmsAIServiceK8sEnv(InitDmsAIServiceK8sEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initDmsAIServiceK8sEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用的详细信息</p>
     * 
     * @param request InnerGetSparkAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerGetSparkAppInfoResponse
     */
    public InnerGetSparkAppInfoResponse innerGetSparkAppInfoWithOptions(InnerGetSparkAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerGetSparkAppInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InnerGetSparkAppInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InnerGetSparkAppInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用的详细信息</p>
     * 
     * @param request InnerGetSparkAppInfoRequest
     * @return InnerGetSparkAppInfoResponse
     */
    public InnerGetSparkAppInfoResponse innerGetSparkAppInfo(InnerGetSparkAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerGetSparkAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark App的部分日志</p>
     * 
     * @param request InnerGetSparkAppLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerGetSparkAppLogResponse
     */
    public InnerGetSparkAppLogResponse innerGetSparkAppLogWithOptions(InnerGetSparkAppLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLength)) {
            body.put("LogLength", request.logLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerGetSparkAppLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InnerGetSparkAppLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InnerGetSparkAppLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark App的部分日志</p>
     * 
     * @param request InnerGetSparkAppLogRequest
     * @return InnerGetSparkAppLogResponse
     */
    public InnerGetSparkAppLogResponse innerGetSparkAppLog(InnerGetSparkAppLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerGetSparkAppLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用的状态</p>
     * 
     * @param request InnerGetSparkAppStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerGetSparkAppStateResponse
     */
    public InnerGetSparkAppStateResponse innerGetSparkAppStateWithOptions(InnerGetSparkAppStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerGetSparkAppState"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InnerGetSparkAppStateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InnerGetSparkAppStateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用的状态</p>
     * 
     * @param request InnerGetSparkAppStateRequest
     * @return InnerGetSparkAppStateResponse
     */
    public InnerGetSparkAppStateResponse innerGetSparkAppState(InnerGetSparkAppStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerGetSparkAppStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用的详细信息</p>
     * 
     * @param request InnerGetSparkAppWebUiAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerGetSparkAppWebUiAddressResponse
     */
    public InnerGetSparkAppWebUiAddressResponse innerGetSparkAppWebUiAddressWithOptions(InnerGetSparkAppWebUiAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerGetSparkAppWebUiAddress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InnerGetSparkAppWebUiAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InnerGetSparkAppWebUiAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取Spark应用的详细信息</p>
     * 
     * @param request InnerGetSparkAppWebUiAddressRequest
     * @return InnerGetSparkAppWebUiAddressResponse
     */
    public InnerGetSparkAppWebUiAddressResponse innerGetSparkAppWebUiAddress(InnerGetSparkAppWebUiAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerGetSparkAppWebUiAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>终止一个Spark Application的运行</p>
     * 
     * @param request InnerKillSparkAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerKillSparkAppResponse
     */
    public InnerKillSparkAppResponse innerKillSparkAppWithOptions(InnerKillSparkAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerKillSparkApp"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InnerKillSparkAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InnerKillSparkAppResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>终止一个Spark Application的运行</p>
     * 
     * @param request InnerKillSparkAppRequest
     * @return InnerKillSparkAppResponse
     */
    public InnerKillSparkAppResponse innerKillSparkApp(InnerKillSparkAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerKillSparkAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>内部用提交一个Spark Application</p>
     * 
     * @param request InnerSubmitSparkAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerSubmitSparkAppResponse
     */
    public InnerSubmitSparkAppResponse innerSubmitSparkAppWithOptions(InnerSubmitSparkAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerParentId)) {
            body.put("TrustedCallerParentId", request.trustedCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerType)) {
            body.put("TrustedCallerType", request.trustedCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedCallerUid)) {
            body.put("TrustedCallerUid", request.trustedCallerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerSubmitSparkApp"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InnerSubmitSparkAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InnerSubmitSparkAppResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>内部用提交一个Spark Application</p>
     * 
     * @param request InnerSubmitSparkAppRequest
     * @return InnerSubmitSparkAppResponse
     */
    public InnerSubmitSparkAppResponse innerSubmitSparkApp(InnerSubmitSparkAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerSubmitSparkAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询API配额信息</p>
     * 
     * @param request ListServiceQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceQuotasResponse
     */
    public ListServiceQuotasResponse listServiceQuotasWithOptions(ListServiceQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            body.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryEnum)) {
            body.put("CategoryEnum", request.categoryEnum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionGroupKey)) {
            body.put("DimensionGroupKey", request.dimensionGroupKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            body.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            body.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCache)) {
            body.put("UseCache", request.useCache);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceQuotas"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceQuotasResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListServiceQuotasResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询API配额信息</p>
     * 
     * @param request ListServiceQuotasRequest
     * @return ListServiceQuotasResponse
     */
    public ListServiceQuotasResponse listServiceQuotas(ListServiceQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceQuotasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>迁移集群</p>
     * 
     * @param request MigrateDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateDBClusterResponse
     */
    public MigrateDBClusterResponse migrateDBClusterWithOptions(MigrateDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkSwitchMode)) {
            query.put("LinkSwitchMode", request.linkSwitchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newShardNumber)) {
            query.put("NewShardNumber", request.newShardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTimeMode)) {
            query.put("SwitchTimeMode", request.switchTimeMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateDBCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateDBClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new MigrateDBClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>迁移集群</p>
     * 
     * @param request MigrateDBClusterRequest
     * @return MigrateDBClusterResponse
     */
    public MigrateDBClusterResponse migrateDBCluster(MigrateDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例配置</p>
     * 
     * @param tmpReq ModifyDBClusterConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterConfigResponse
     */
    public ModifyDBClusterConfigResponse modifyDBClusterConfigWithOptions(ModifyDBClusterConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDBClusterConfigShrinkRequest request = new ModifyDBClusterConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            query.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterConfigResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyDBClusterConfigResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改实例配置</p>
     * 
     * @param request ModifyDBClusterConfigRequest
     * @return ModifyDBClusterConfigResponse
     */
    public ModifyDBClusterConfigResponse modifyDBClusterConfig(ModifyDBClusterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改重点客户信息</p>
     * 
     * @param request ModifyMajorCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMajorCustomerResponse
     */
    public ModifyMajorCustomerResponse modifyMajorCustomerWithOptions(ModifyMajorCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerName)) {
            query.put("CustomerName", request.customerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pd)) {
            query.put("Pd", request.pd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pdsa)) {
            query.put("Pdsa", request.pdsa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ranking)) {
            query.put("Ranking", request.ranking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rd)) {
            query.put("Rd", request.rd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sa)) {
            query.put("Sa", request.sa);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMajorCustomer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMajorCustomerResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyMajorCustomerResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改重点客户信息</p>
     * 
     * @param request ModifyMajorCustomerRequest
     * @return ModifyMajorCustomerResponse
     */
    public ModifyMajorCustomerResponse modifyMajorCustomer(ModifyMajorCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMajorCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户申请审批通过后通知云产品调整quota</p>
     * 
     * @param tmpReq ModifyServiceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyServiceQuotaResponse
     */
    public ModifyServiceQuotaResponse modifyServiceQuotaWithOptions(ModifyServiceQuotaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyServiceQuotaShrinkRequest request = new ModifyServiceQuotaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dimensions)) {
            request.dimensionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dimensions, "Dimensions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionsShrink)) {
            query.put("Dimensions", request.dimensionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaActionCode)) {
            query.put("QuotaActionCode", request.quotaActionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaCategory)) {
            query.put("QuotaCategory", request.quotaCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyServiceQuota"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyServiceQuotaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyServiceQuotaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>用户申请审批通过后通知云产品调整quota</p>
     * 
     * @param request ModifyServiceQuotaRequest
     * @return ModifyServiceQuotaResponse
     */
    public ModifyServiceQuotaResponse modifyServiceQuota(ModifyServiceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyServiceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预加载Spark应用指标信息</p>
     * 
     * @param request PreloadSparkAppMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadSparkAppMetricsResponse
     */
    public PreloadSparkAppMetricsResponse preloadSparkAppMetricsWithOptions(PreloadSparkAppMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadSparkAppMetricsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PreloadSparkAppMetricsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>预加载Spark应用指标信息</p>
     * 
     * @param request PreloadSparkAppMetricsRequest
     * @return PreloadSparkAppMetricsResponse
     */
    public PreloadSparkAppMetricsResponse preloadSparkAppMetrics(PreloadSparkAppMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadSparkAppMetricsWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseClusterVpcConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseClusterVpcConnectionResponse
     */
    public ReleaseClusterVpcConnectionResponse releaseClusterVpcConnectionWithOptions(ReleaseClusterVpcConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseClusterVpcConnection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseClusterVpcConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReleaseClusterVpcConnectionResponse());
        }

    }

    /**
     * @param request ReleaseClusterVpcConnectionRequest
     * @return ReleaseClusterVpcConnectionResponse
     */
    public ReleaseClusterVpcConnectionResponse releaseClusterVpcConnection(ReleaseClusterVpcConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseClusterVpcConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给实例开启VPC连接</p>
     * 
     * @param request RestartDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDBClusterResponse
     */
    public RestartDBClusterResponse restartDBClusterWithOptions(RestartDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDBCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDBClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RestartDBClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>给实例开启VPC连接</p>
     * 
     * @param request RestartDBClusterRequest
     * @return RestartDBClusterResponse
     */
    public RestartDBClusterResponse restartDBCluster(RestartDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBClusterWithOptions(request, runtime);
    }

    /**
     * @param request RevokeInstanceEgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeInstanceEgressResponse
     */
    public RevokeInstanceEgressResponse revokeInstanceEgressWithOptions(RevokeInstanceEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insType)) {
            query.put("InsType", request.insType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeInstanceEgress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceEgressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RevokeInstanceEgressResponse());
        }

    }

    /**
     * @param request RevokeInstanceEgressRequest
     * @return RevokeInstanceEgressResponse
     */
    public RevokeInstanceEgressResponse revokeInstanceEgress(RevokeInstanceEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceEgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启/关闭指定OSSBucket的传输加速功能</p>
     * 
     * @param request SetBucketTransferAccelerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetBucketTransferAccelerationResponse
     */
    public SetBucketTransferAccelerationResponse setBucketTransferAccelerationWithOptions(SetBucketTransferAccelerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerationEnabled)) {
            query.put("AccelerationEnabled", request.accelerationEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetBucketTransferAcceleration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetBucketTransferAccelerationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetBucketTransferAccelerationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>开启/关闭指定OSSBucket的传输加速功能</p>
     * 
     * @param request SetBucketTransferAccelerationRequest
     * @return SetBucketTransferAccelerationResponse
     */
    public SetBucketTransferAccelerationResponse setBucketTransferAcceleration(SetBucketTransferAccelerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBucketTransferAccelerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建并执行OSS跨区域复制任务</p>
     * 
     * @param tmpReq StartOssBucketReplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartOssBucketReplicationResponse
     */
    public StartOssBucketReplicationResponse startOssBucketReplicationWithOptions(StartOssBucketReplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartOssBucketReplicationShrinkRequest request = new StartOssBucketReplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.prefixList)) {
            request.prefixListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.prefixList, "PrefixList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ak)) {
            query.put("Ak", request.ak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedSk)) {
            query.put("EncryptedSk", request.encryptedSk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixListShrink)) {
            query.put("PrefixList", request.prefixListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaKmsKeyId)) {
            query.put("ReplicaKmsKeyId", request.replicaKmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBucketName)) {
            query.put("SourceBucketName", request.sourceBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseKmsEncryptedObjectsStatus)) {
            query.put("SseKmsEncryptedObjectsStatus", request.sseKmsEncryptedObjectsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBucketName)) {
            query.put("TargetBucketName", request.targetBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionCode)) {
            query.put("TargetRegionCode", request.targetRegionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartOssBucketReplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartOssBucketReplicationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartOssBucketReplicationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建并执行OSS跨区域复制任务</p>
     * 
     * @param request StartOssBucketReplicationRequest
     * @return StartOssBucketReplicationResponse
     */
    public StartOssBucketReplicationResponse startOssBucketReplication(StartOssBucketReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startOssBucketReplicationWithOptions(request, runtime);
    }
}
