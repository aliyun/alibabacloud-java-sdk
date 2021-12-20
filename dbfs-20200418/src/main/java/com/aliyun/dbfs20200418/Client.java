// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418;

import com.aliyun.tea.*;
import com.aliyun.dbfs20200418.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AddTagsBatchResponse addTagsBatchWithOptions(AddTagsBatchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DbfsList", request.dbfsList);
        query.put("RegionId", request.regionId);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsBatchWithOptions(request, runtime);
    }

    public AttachDbfsResponse attachDbfsWithOptions(AttachDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AttachMode", request.attachMode);
        query.put("AttachPoint", request.attachPoint);
        query.put("ECSInstanceId", request.ECSInstanceId);
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        query.put("ServerUrl", request.serverUrl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDbfsWithOptions(request, runtime);
    }

    public CreateDbfsResponse createDbfsWithOptions(CreateDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("ClientToken", request.clientToken);
        query.put("DeleteSnapshot", request.deleteSnapshot);
        query.put("EnableRaid", request.enableRaid);
        query.put("Encryption", request.encryption);
        query.put("FsName", request.fsName);
        query.put("InstanceType", request.instanceType);
        query.put("KMSKeyId", request.KMSKeyId);
        query.put("PerformanceLevel", request.performanceLevel);
        query.put("RaidStripeUnitNumber", request.raidStripeUnitNumber);
        query.put("RegionId", request.regionId);
        query.put("SizeG", request.sizeG);
        query.put("SnapshotId", request.snapshotId);
        query.put("UsedScene", request.usedScene);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDbfsWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        query.put("RetentionDays", request.retentionDays);
        query.put("SnapshotName", request.snapshotName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DeleteDbfsResponse deleteDbfsWithOptions(DeleteDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDbfsWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Force", request.force);
        query.put("RegionId", request.regionId);
        query.put("SnapshotId", request.snapshotId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteTagsBatchResponse deleteTagsBatchWithOptions(DeleteTagsBatchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DbfsList", request.dbfsList);
        query.put("RegionId", request.regionId);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagsBatchWithOptions(request, runtime);
    }

    public DescribeDbfsSpecificationsResponse describeDbfsSpecificationsWithOptions(DescribeDbfsSpecificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("EcsInstanceType", request.ecsInstanceType);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDbfsSpecificationsWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public DetachDbfsResponse detachDbfsWithOptions(DetachDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ECSInstanceId", request.ECSInstanceId);
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDbfsWithOptions(request, runtime);
    }

    public GetDbfsResponse getDbfsWithOptions(GetDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDbfsWithOptions(request, runtime);
    }

    public GetServiceLinkedRoleResponse getServiceLinkedRoleWithOptions(GetServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceLinkedRoleWithOptions(request, runtime);
    }

    public ListDbfsResponse listDbfsWithOptions(ListDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FilterKey", request.filterKey);
        query.put("FilterValue", request.filterValue);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("SortKey", request.sortKey);
        query.put("SortType", request.sortType);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDbfsWithOptions(request, runtime);
    }

    public ListDbfsAttachableEcsInstancesResponse listDbfsAttachableEcsInstancesWithOptions(ListDbfsAttachableEcsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDbfsAttachableEcsInstancesWithOptions(request, runtime);
    }

    public ListDbfsAttachedEcsInstancesResponse listDbfsAttachedEcsInstancesWithOptions(ListDbfsAttachedEcsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDbfsAttachedEcsInstancesWithOptions(request, runtime);
    }

    public ListSnapshotResponse listSnapshotWithOptions(ListSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FilterKey", request.filterKey);
        query.put("FilterValue", request.filterValue);
        query.put("FsId", request.fsId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("SnapshotIds", request.snapshotIds);
        query.put("SnapshotName", request.snapshotName);
        query.put("SnapshotType", request.snapshotType);
        query.put("SortKey", request.sortKey);
        query.put("SortType", request.sortType);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSnapshotWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public RenameDbfsResponse renameDbfsWithOptions(RenameDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FsId", request.fsId);
        query.put("FsName", request.fsName);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameDbfsWithOptions(request, runtime);
    }

    public ResetDbfsResponse resetDbfsWithOptions(ResetDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FsId", request.fsId);
        query.put("RegionId", request.regionId);
        query.put("SnapshotId", request.snapshotId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDbfs"),
            new TeaPair("version", "2020-04-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDbfsResponse());
    }

    public ResetDbfsResponse resetDbfs(ResetDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDbfsWithOptions(request, runtime);
    }

    public ResizeDbfsResponse resizeDbfsWithOptions(ResizeDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FsId", request.fsId);
        query.put("NewSizeG", request.newSizeG);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeDbfsWithOptions(request, runtime);
    }

    public TagDbfsResponse tagDbfsWithOptions(TagDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DbfsId", request.dbfsId);
        query.put("RegionId", request.regionId);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagDbfsWithOptions(request, runtime);
    }
}
