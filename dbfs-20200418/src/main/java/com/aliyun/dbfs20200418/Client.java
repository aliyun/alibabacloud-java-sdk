// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418;

import com.aliyun.tea.*;
import com.aliyun.dbfs20200418.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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

    public CreateConstantsResponse createConstantsWithOptions(CreateConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConstantsResponse());
    }

    public CreateConstantsResponse createConstants(CreateConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConstantsWithOptions(request, runtime);
    }

    public DeleteDbfsResponse deleteDbfsWithOptions(DeleteDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDbfsResponse());
    }

    public DeleteDbfsResponse deleteDbfs(DeleteDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDbfsWithOptions(request, runtime);
    }

    public DeleteConstantsResponse deleteConstantsWithOptions(DeleteConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConstantsResponse());
    }

    public DeleteConstantsResponse deleteConstants(DeleteConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConstantsWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public ResizeDbfsResponse resizeDbfsWithOptions(ResizeDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeDbfsResponse());
    }

    public ResizeDbfsResponse resizeDbfs(ResizeDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeDbfsWithOptions(request, runtime);
    }

    public PublishUpgradeTaskResponse publishUpgradeTaskWithOptions(PublishUpgradeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishUpgradeTask", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new PublishUpgradeTaskResponse());
    }

    public PublishUpgradeTaskResponse publishUpgradeTask(PublishUpgradeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishUpgradeTaskWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnapshot", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DetachDbfsResponse detachDbfsWithOptions(DetachDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DetachDbfsResponse());
    }

    public DetachDbfsResponse detachDbfs(DetachDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDbfsWithOptions(request, runtime);
    }

    public GenerateUpgradeRecordResponse generateUpgradeRecordWithOptions(GenerateUpgradeRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateUpgradeRecord", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateUpgradeRecordResponse());
    }

    public GenerateUpgradeRecordResponse generateUpgradeRecord(GenerateUpgradeRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateUpgradeRecordWithOptions(request, runtime);
    }

    public ResetDbfsResponse resetDbfsWithOptions(ResetDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ResetDbfsResponse());
    }

    public ResetDbfsResponse resetDbfs(ResetDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDbfsWithOptions(request, runtime);
    }

    public GetDbfsResponse getDbfsWithOptions(GetDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetDbfsResponse());
    }

    public GetDbfsResponse getDbfs(GetDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDbfsWithOptions(request, runtime);
    }

    public DbfsRecordResponse dbfsRecordWithOptions(DbfsRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DbfsRecord", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DbfsRecordResponse());
    }

    public DbfsRecordResponse dbfsRecord(DbfsRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dbfsRecordWithOptions(request, runtime);
    }

    public StopUpgradeTaskResponse stopUpgradeTaskWithOptions(StopUpgradeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopUpgradeTask", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new StopUpgradeTaskResponse());
    }

    public StopUpgradeTaskResponse stopUpgradeTask(StopUpgradeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopUpgradeTaskWithOptions(request, runtime);
    }

    public CreateDbfsResponse createDbfsWithOptions(CreateDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDbfsResponse());
    }

    public CreateDbfsResponse createDbfs(CreateDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDbfsWithOptions(request, runtime);
    }

    public UpdateTaskResponse updateTaskWithOptions(UpdateTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTask", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTaskResponse());
    }

    public UpdateTaskResponse updateTask(UpdateTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTaskWithOptions(request, runtime);
    }

    public DeleteTagsBatchResponse deleteTagsBatchWithOptions(DeleteTagsBatchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTagsBatch", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagsBatchResponse());
    }

    public DeleteTagsBatchResponse deleteTagsBatch(DeleteTagsBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagsBatchWithOptions(request, runtime);
    }

    public GetServiceLinkedRoleResponse getServiceLinkedRoleWithOptions(GetServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceLinkedRole", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceLinkedRoleResponse());
    }

    public GetServiceLinkedRoleResponse getServiceLinkedRole(GetServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceLinkedRoleWithOptions(request, runtime);
    }

    public UpdateConstantsResponse updateConstantsWithOptions(UpdateConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConstantsResponse());
    }

    public UpdateConstantsResponse updateConstants(UpdateConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConstantsWithOptions(request, runtime);
    }

    public InsertSynchronizConstantsResponse insertSynchronizConstantsWithOptions(InsertSynchronizConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertSynchronizConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new InsertSynchronizConstantsResponse());
    }

    public InsertSynchronizConstantsResponse insertSynchronizConstants(InsertSynchronizConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertSynchronizConstantsWithOptions(request, runtime);
    }

    public AttachDbfsResponse attachDbfsWithOptions(AttachDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new AttachDbfsResponse());
    }

    public AttachDbfsResponse attachDbfs(AttachDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDbfsWithOptions(request, runtime);
    }

    public ListTaskResponse listTaskWithOptions(ListTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTask", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskResponse());
    }

    public ListTaskResponse listTask(ListTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskWithOptions(request, runtime);
    }

    public ListDbfsResponse listDbfsWithOptions(ListDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListDbfsResponse());
    }

    public ListDbfsResponse listDbfs(ListDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDbfsWithOptions(request, runtime);
    }

    public AddTagsBatchResponse addTagsBatchWithOptions(AddTagsBatchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTagsBatch", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddTagsBatchResponse());
    }

    public AddTagsBatchResponse addTagsBatch(AddTagsBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsBatchWithOptions(request, runtime);
    }

    public TagDbfsResponse tagDbfsWithOptions(TagDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new TagDbfsResponse());
    }

    public TagDbfsResponse tagDbfs(TagDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagDbfsWithOptions(request, runtime);
    }

    public GetSynchronizConstantsResponse getSynchronizConstantsWithOptions(GetSynchronizConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSynchronizConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetSynchronizConstantsResponse());
    }

    public GetSynchronizConstantsResponse getSynchronizConstants(GetSynchronizConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSynchronizConstantsWithOptions(request, runtime);
    }

    public OpreateConstantsResponse opreateConstantsWithOptions(OpreateConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpreateConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new OpreateConstantsResponse());
    }

    public OpreateConstantsResponse opreateConstants(OpreateConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.opreateConstantsWithOptions(request, runtime);
    }

    public RenameDbfsResponse renameDbfsWithOptions(RenameDbfsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenameDbfs", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new RenameDbfsResponse());
    }

    public RenameDbfsResponse renameDbfs(RenameDbfsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameDbfsWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListConstantsResponse listConstantsWithOptions(ListConstantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConstants", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListConstantsResponse());
    }

    public ListConstantsResponse listConstants(ListConstantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConstantsWithOptions(request, runtime);
    }

    public ListSnapshotResponse listSnapshotWithOptions(ListSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSnapshot", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListSnapshotResponse());
    }

    public ListSnapshotResponse listSnapshot(ListSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSnapshotWithOptions(request, runtime);
    }

    public DescribeDbfsSpecificationsResponse describeDbfsSpecificationsWithOptions(DescribeDbfsSpecificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDbfsSpecifications", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDbfsSpecificationsResponse());
    }

    public DescribeDbfsSpecificationsResponse describeDbfsSpecifications(DescribeDbfsSpecificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDbfsSpecificationsWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnapshot", "2020-04-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }
}
