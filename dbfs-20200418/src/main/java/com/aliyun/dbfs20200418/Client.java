// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418;

import com.aliyun.tea.*;
import com.aliyun.dbfs20200418.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-fujian", "dbfs.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dbfs.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dbfs.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dbfs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dbfs.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dbfs.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dbfs.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dbfs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddTagsBatchResponse addTagsBatchWithOptions(AddTagsBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbfsList)) {
            query.put("DbfsList", request.dbfsList);
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
            new TeaPair("action", "AddTagsBatch"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagsBatchResponse());
    }

    public AddTagsBatchResponse addTagsBatch(AddTagsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsBatchWithOptions(request, runtime);
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyAutoSnapshotPolicyShrinkRequest request = new ApplyAutoSnapshotPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbfsIds)) {
            request.dbfsIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbfsIds, "DbfsIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbfsIdsShrink)) {
            query.put("DbfsIds", request.dbfsIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAutoSnapshotPolicy"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public AttachDbfsResponse attachDbfsWithOptions(AttachDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachMode)) {
            query.put("AttachMode", request.attachMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachPoint)) {
            query.put("AttachPoint", request.attachPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ECSInstanceId)) {
            query.put("ECSInstanceId", request.ECSInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverUrl)) {
            query.put("ServerUrl", request.serverUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDbfsResponse());
    }

    public AttachDbfsResponse attachDbfs(AttachDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDbfsWithOptions(request, runtime);
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelAutoSnapshotPolicyShrinkRequest request = new CancelAutoSnapshotPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbfsIds)) {
            request.dbfsIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbfsIds, "DbfsIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbfsIdsShrink)) {
            query.put("DbfsIds", request.dbfsIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAutoSnapshotPolicy"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAutoSnapshotPolicyResponse());
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAutoSnapshotPolicyShrinkRequest request = new CreateAutoSnapshotPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repeatWeekdays)) {
            request.repeatWeekdaysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repeatWeekdays, "RepeatWeekdays", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timePoints)) {
            request.timePointsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timePoints, "TimePoints", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatWeekdaysShrink)) {
            query.put("RepeatWeekdays", request.repeatWeekdaysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePointsShrink)) {
            query.put("TimePoints", request.timePointsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoSnapshotPolicy"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoSnapshotPolicyResponse());
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CreateDbfsResponse createDbfsWithOptions(CreateDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedFeatures)) {
            query.put("AdvancedFeatures", request.advancedFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteSnapshot)) {
            query.put("DeleteSnapshot", request.deleteSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRaid)) {
            query.put("EnableRaid", request.enableRaid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryption)) {
            query.put("Encryption", request.encryption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsName)) {
            query.put("FsName", request.fsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.KMSKeyId)) {
            query.put("KMSKeyId", request.KMSKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.performanceLevel)) {
            query.put("PerformanceLevel", request.performanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.raidStripeUnitNumber)) {
            query.put("RaidStripeUnitNumber", request.raidStripeUnitNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeG)) {
            query.put("SizeG", request.sizeG);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedScene)) {
            query.put("UsedScene", request.usedScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDbfsResponse());
    }

    public CreateDbfsResponse createDbfs(CreateDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDbfsWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2020-04-18"),
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

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoSnapshotPolicy"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DeleteDbfsResponse deleteDbfsWithOptions(DeleteDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDbfsResponse());
    }

    public DeleteDbfsResponse deleteDbfs(DeleteDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDbfsWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteTagsBatchResponse deleteTagsBatchWithOptions(DeleteTagsBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbfsList)) {
            query.put("DbfsList", request.dbfsList);
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
            new TeaPair("action", "DeleteTagsBatch"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagsBatchResponse());
    }

    public DeleteTagsBatchResponse deleteTagsBatch(DeleteTagsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagsBatchWithOptions(request, runtime);
    }

    public DescribeDbfsSpecificationsResponse describeDbfsSpecificationsWithOptions(DescribeDbfsSpecificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceType)) {
            query.put("EcsInstanceType", request.ecsInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbfsSpecifications"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbfsSpecificationsResponse());
    }

    public DescribeDbfsSpecificationsResponse describeDbfsSpecifications(DescribeDbfsSpecificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbfsSpecificationsWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTypes"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public DetachDbfsResponse detachDbfsWithOptions(DetachDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ECSInstanceId)) {
            query.put("ECSInstanceId", request.ECSInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDbfsResponse());
    }

    public DetachDbfsResponse detachDbfs(DetachDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDbfsWithOptions(request, runtime);
    }

    public GetAutoSnapshotPolicyResponse getAutoSnapshotPolicyWithOptions(GetAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoSnapshotPolicy"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoSnapshotPolicyResponse());
    }

    public GetAutoSnapshotPolicyResponse getAutoSnapshotPolicy(GetAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public GetDbfsResponse getDbfsWithOptions(GetDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDbfsResponse());
    }

    public GetDbfsResponse getDbfs(GetDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDbfsWithOptions(request, runtime);
    }

    public GetServiceLinkedRoleResponse getServiceLinkedRoleWithOptions(GetServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceLinkedRole"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceLinkedRoleResponse());
    }

    public GetServiceLinkedRoleResponse getServiceLinkedRole(GetServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceLinkedRoleWithOptions(request, runtime);
    }

    public GetSnapshotLinkResponse getSnapshotLinkWithOptions(GetSnapshotLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSnapshotLink"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSnapshotLinkResponse());
    }

    public GetSnapshotLinkResponse getSnapshotLink(GetSnapshotLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSnapshotLinkWithOptions(request, runtime);
    }

    public ListAutoSnapshotPoliciesResponse listAutoSnapshotPoliciesWithOptions(ListAutoSnapshotPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
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
            new TeaPair("action", "ListAutoSnapshotPolicies"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoSnapshotPoliciesResponse());
    }

    public ListAutoSnapshotPoliciesResponse listAutoSnapshotPolicies(ListAutoSnapshotPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoSnapshotPoliciesWithOptions(request, runtime);
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponse listAutoSnapshotPolicyAppliedDbfsWithOptions(ListAutoSnapshotPolicyAppliedDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoSnapshotPolicyAppliedDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoSnapshotPolicyAppliedDbfsResponse());
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponse listAutoSnapshotPolicyAppliedDbfs(ListAutoSnapshotPolicyAppliedDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoSnapshotPolicyAppliedDbfsWithOptions(request, runtime);
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponse listAutoSnapshotPolicyUnappliedDbfsWithOptions(ListAutoSnapshotPolicyUnappliedDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
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
            new TeaPair("action", "ListAutoSnapshotPolicyUnappliedDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoSnapshotPolicyUnappliedDbfsResponse());
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponse listAutoSnapshotPolicyUnappliedDbfs(ListAutoSnapshotPolicyUnappliedDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoSnapshotPolicyUnappliedDbfsWithOptions(request, runtime);
    }

    public ListDbfsResponse listDbfsWithOptions(ListDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("SortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDbfsResponse());
    }

    public ListDbfsResponse listDbfs(ListDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDbfsWithOptions(request, runtime);
    }

    public ListDbfsAttachableEcsInstancesResponse listDbfsAttachableEcsInstancesWithOptions(ListDbfsAttachableEcsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
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
            new TeaPair("action", "ListDbfsAttachableEcsInstances"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDbfsAttachableEcsInstancesResponse());
    }

    public ListDbfsAttachableEcsInstancesResponse listDbfsAttachableEcsInstances(ListDbfsAttachableEcsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDbfsAttachableEcsInstancesWithOptions(request, runtime);
    }

    public ListDbfsAttachedEcsInstancesResponse listDbfsAttachedEcsInstancesWithOptions(ListDbfsAttachedEcsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDbfsAttachedEcsInstances"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDbfsAttachedEcsInstancesResponse());
    }

    public ListDbfsAttachedEcsInstancesResponse listDbfsAttachedEcsInstances(ListDbfsAttachedEcsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDbfsAttachedEcsInstancesWithOptions(request, runtime);
    }

    public ListSnapshotResponse listSnapshotWithOptions(ListSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotType)) {
            query.put("SnapshotType", request.snapshotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("SortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshot"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotResponse());
    }

    public ListSnapshotResponse listSnapshot(ListSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotWithOptions(request, runtime);
    }

    public ListSnapshotLinksResponse listSnapshotLinksWithOptions(ListSnapshotLinksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterKey)) {
            query.put("FilterKey", request.filterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsIds)) {
            query.put("FsIds", request.fsIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkIds)) {
            query.put("LinkIds", request.linkIds);
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
            new TeaPair("action", "ListSnapshotLinks"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotLinksResponse());
    }

    public ListSnapshotLinksResponse listSnapshotLinks(ListSnapshotLinksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotLinksWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAutoSnapshotPolicyShrinkRequest request = new ModifyAutoSnapshotPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repeatWeekdays)) {
            request.repeatWeekdaysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repeatWeekdays, "RepeatWeekdays", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timePoints)) {
            request.timePointsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timePoints, "TimePoints", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatWeekdaysShrink)) {
            query.put("RepeatWeekdays", request.repeatWeekdaysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePointsShrink)) {
            query.put("TimePoints", request.timePointsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoSnapshotPolicy"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttributeWithOptions(ModifySnapshotAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySnapshotAttribute"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySnapshotAttributeResponse());
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttribute(ModifySnapshotAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySnapshotAttributeWithOptions(request, runtime);
    }

    public RenameDbfsResponse renameDbfsWithOptions(RenameDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsName)) {
            query.put("FsName", request.fsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameDbfsResponse());
    }

    public RenameDbfsResponse renameDbfs(RenameDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameDbfsWithOptions(request, runtime);
    }

    public ResizeDbfsResponse resizeDbfsWithOptions(ResizeDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSizeG)) {
            query.put("NewSizeG", request.newSizeG);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResizeDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResizeDbfsResponse());
    }

    public ResizeDbfsResponse resizeDbfs(ResizeDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resizeDbfsWithOptions(request, runtime);
    }

    public TagDbfsResponse tagDbfsWithOptions(TagDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbfsId)) {
            query.put("DbfsId", request.dbfsId);
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
            new TeaPair("action", "TagDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagDbfsResponse());
    }

    public TagDbfsResponse tagDbfs(TagDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagDbfsWithOptions(request, runtime);
    }

    public UpdateDbfsResponse updateDbfsWithOptions(UpdateDbfsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedFeatures)) {
            query.put("AdvancedFeatures", request.advancedFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsId)) {
            query.put("FsId", request.fsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedScene)) {
            query.put("UsedScene", request.usedScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDbfsResponse());
    }

    public UpdateDbfsResponse updateDbfs(UpdateDbfsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDbfsWithOptions(request, runtime);
    }
}
