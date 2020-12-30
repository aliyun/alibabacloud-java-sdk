// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101;

import com.aliyun.tea.*;
import com.aliyun.hbase20190101.models.*;
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
            new TeaPair("ap-northeast-2-pop", "hbase.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-beijing", "hbase.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "hbase.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "hbase.aliyuncs.com"),
            new TeaPair("cn-edge-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-fujian", "hbase.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "hbase.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "hbase.aliyuncs.com"),
            new TeaPair("cn-hongkong", "hbase.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "hbase.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-qingdao", "hbase.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "hbase.aliyuncs.com"),
            new TeaPair("cn-shanghai", "hbase.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "hbase.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "hbase.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "hbase.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "hbase.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "hbase.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "hbase.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "hbase.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "hbase.aliyuncs.com"),
            new TeaPair("cn-wuhan", "hbase.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "hbase.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "hbase.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "hbase.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "hbase.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "hbase.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "hbase.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "hbase.aliyuncs.com"),
            new TeaPair("us-west-1", "hbase.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hbase", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddUserHdfsInfoResponse addUserHdfsInfoWithOptions(AddUserHdfsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUserHdfsInfo", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserHdfsInfoResponse());
    }

    public AddUserHdfsInfoResponse addUserHdfsInfo(AddUserHdfsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserHdfsInfoWithOptions(request, runtime);
    }

    public AllocatePublicNetworkAddressResponse allocatePublicNetworkAddressWithOptions(AllocatePublicNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocatePublicNetworkAddress", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllocatePublicNetworkAddressResponse());
    }

    public AllocatePublicNetworkAddressResponse allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocatePublicNetworkAddressWithOptions(request, runtime);
    }

    public CheckComponentsVersionResponse checkComponentsVersionWithOptions(CheckComponentsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckComponentsVersion", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckComponentsVersionResponse());
    }

    public CheckComponentsVersionResponse checkComponentsVersion(CheckComponentsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkComponentsVersionWithOptions(request, runtime);
    }

    public CloseBackupResponse closeBackupWithOptions(CloseBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseBackup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CloseBackupResponse());
    }

    public CloseBackupResponse closeBackup(CloseBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeBackupWithOptions(request, runtime);
    }

    public ConvertInstanceResponse convertInstanceWithOptions(ConvertInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertInstance", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertInstanceResponse());
    }

    public ConvertInstanceResponse convertInstance(ConvertInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertInstanceWithOptions(request, runtime);
    }

    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackupPlan", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupPlanResponse());
    }

    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateGlobalResourceResponse createGlobalResourceWithOptions(CreateGlobalResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGlobalResource", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGlobalResourceResponse());
    }

    public CreateGlobalResourceResponse createGlobalResource(CreateGlobalResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGlobalResourceWithOptions(request, runtime);
    }

    public CreateHbaseHaSlbResponse createHbaseHaSlbWithOptions(CreateHbaseHaSlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHbaseHaSlb", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHbaseHaSlbResponse());
    }

    public CreateHbaseHaSlbResponse createHbaseHaSlb(CreateHbaseHaSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHbaseHaSlbWithOptions(request, runtime);
    }

    public CreateHBaseSlbServerResponse createHBaseSlbServerWithOptions(CreateHBaseSlbServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHBaseSlbServer", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHBaseSlbServerResponse());
    }

    public CreateHBaseSlbServerResponse createHBaseSlbServer(CreateHBaseSlbServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHBaseSlbServerWithOptions(request, runtime);
    }

    public CreateMultiZoneClusterResponse createMultiZoneClusterWithOptions(CreateMultiZoneClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMultiZoneCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMultiZoneClusterResponse());
    }

    public CreateMultiZoneClusterResponse createMultiZoneCluster(CreateMultiZoneClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMultiZoneClusterWithOptions(request, runtime);
    }

    public CreateRestorePlanResponse createRestorePlanWithOptions(CreateRestorePlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRestorePlan", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRestorePlanResponse());
    }

    public CreateRestorePlanResponse createRestorePlan(CreateRestorePlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRestorePlanWithOptions(request, runtime);
    }

    public CreateServerlessClusterResponse createServerlessClusterWithOptions(CreateServerlessClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServerlessCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServerlessClusterResponse());
    }

    public CreateServerlessClusterResponse createServerlessCluster(CreateServerlessClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServerlessClusterWithOptions(request, runtime);
    }

    public DeleteGlobalResourceResponse deleteGlobalResourceWithOptions(DeleteGlobalResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGlobalResource", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGlobalResourceResponse());
    }

    public DeleteGlobalResourceResponse deleteGlobalResource(DeleteGlobalResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGlobalResourceWithOptions(request, runtime);
    }

    public DeleteHBaseHaDBResponse deleteHBaseHaDBWithOptions(DeleteHBaseHaDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHBaseHaDB", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHBaseHaDBResponse());
    }

    public DeleteHBaseHaDBResponse deleteHBaseHaDB(DeleteHBaseHaDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHBaseHaDBWithOptions(request, runtime);
    }

    public DeleteHbaseHaSlbResponse deleteHbaseHaSlbWithOptions(DeleteHbaseHaSlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHbaseHaSlb", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHbaseHaSlbResponse());
    }

    public DeleteHbaseHaSlbResponse deleteHbaseHaSlb(DeleteHbaseHaSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHbaseHaSlbWithOptions(request, runtime);
    }

    public DeleteHBaseSlbServerResponse deleteHBaseSlbServerWithOptions(DeleteHBaseSlbServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHBaseSlbServer", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHBaseSlbServerResponse());
    }

    public DeleteHBaseSlbServerResponse deleteHBaseSlbServer(DeleteHBaseSlbServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHBaseSlbServerWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteMultiZoneClusterResponse deleteMultiZoneClusterWithOptions(DeleteMultiZoneClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMultiZoneCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMultiZoneClusterResponse());
    }

    public DeleteMultiZoneClusterResponse deleteMultiZoneCluster(DeleteMultiZoneClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMultiZoneClusterWithOptions(request, runtime);
    }

    public DeleteServerlessClusterResponse deleteServerlessClusterWithOptions(DeleteServerlessClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServerlessCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServerlessClusterResponse());
    }

    public DeleteServerlessClusterResponse deleteServerlessCluster(DeleteServerlessClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServerlessClusterWithOptions(request, runtime);
    }

    public DeleteUserHdfsInfoResponse deleteUserHdfsInfoWithOptions(DeleteUserHdfsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserHdfsInfo", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserHdfsInfoResponse());
    }

    public DeleteUserHdfsInfoResponse deleteUserHdfsInfo(DeleteUserHdfsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserHdfsInfoWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeBackupPlanConfigResponse describeBackupPlanConfigWithOptions(DescribeBackupPlanConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPlanConfig", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPlanConfigResponse());
    }

    public DescribeBackupPlanConfigResponse describeBackupPlanConfig(DescribeBackupPlanConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlanConfigWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeBackupStatusResponse describeBackupStatusWithOptions(DescribeBackupStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupStatus", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupStatusResponse());
    }

    public DescribeBackupStatusResponse describeBackupStatus(DescribeBackupStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupStatusWithOptions(request, runtime);
    }

    public DescribeBackupSummaryResponse describeBackupSummaryWithOptions(DescribeBackupSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupSummary", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupSummaryResponse());
    }

    public DescribeBackupSummaryResponse describeBackupSummary(DescribeBackupSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupSummaryWithOptions(request, runtime);
    }

    public DescribeBackupTablesResponse describeBackupTablesWithOptions(DescribeBackupTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupTables", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupTablesResponse());
    }

    public DescribeBackupTablesResponse describeBackupTables(DescribeBackupTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupTablesWithOptions(request, runtime);
    }

    public DescribeClusterConnectionResponse describeClusterConnectionWithOptions(DescribeClusterConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterConnection", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterConnectionResponse());
    }

    public DescribeClusterConnectionResponse describeClusterConnection(DescribeClusterConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterConnectionWithOptions(request, runtime);
    }

    public DescribeColdStorageResponse describeColdStorageWithOptions(DescribeColdStorageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeColdStorage", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeColdStorageResponse());
    }

    public DescribeColdStorageResponse describeColdStorage(DescribeColdStorageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeColdStorageWithOptions(request, runtime);
    }

    public DescribeDBInstanceUsageResponse describeDBInstanceUsageWithOptions(DescribeDBInstanceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceUsage", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceUsageResponse());
    }

    public DescribeDBInstanceUsageResponse describeDBInstanceUsage(DescribeDBInstanceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceUsageWithOptions(request, runtime);
    }

    public DescribeDeletedInstancesResponse describeDeletedInstancesWithOptions(DescribeDeletedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeletedInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeletedInstancesResponse());
    }

    public DescribeDeletedInstancesResponse describeDeletedInstances(DescribeDeletedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeletedInstancesWithOptions(request, runtime);
    }

    public DescribeDiskWarningLineResponse describeDiskWarningLineWithOptions(DescribeDiskWarningLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDiskWarningLine", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDiskWarningLineResponse());
    }

    public DescribeDiskWarningLineResponse describeDiskWarningLine(DescribeDiskWarningLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiskWarningLineWithOptions(request, runtime);
    }

    public DescribeEndpointsResponse describeEndpointsWithOptions(DescribeEndpointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEndpoints", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEndpointsResponse());
    }

    public DescribeEndpointsResponse describeEndpoints(DescribeEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointsWithOptions(request, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstance", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceResponse());
    }

    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeInstanceTypeResponse describeInstanceTypeWithOptions(DescribeInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceType", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceTypeResponse());
    }

    public DescribeInstanceTypeResponse describeInstanceType(DescribeInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypeWithOptions(request, runtime);
    }

    public DescribeIpWhitelistResponse describeIpWhitelistWithOptions(DescribeIpWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpWhitelist", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpWhitelistResponse());
    }

    public DescribeIpWhitelistResponse describeIpWhitelist(DescribeIpWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpWhitelistWithOptions(request, runtime);
    }

    public DescribeMultiZoneAvailableRegionsResponse describeMultiZoneAvailableRegionsWithOptions(DescribeMultiZoneAvailableRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMultiZoneAvailableRegions", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMultiZoneAvailableRegionsResponse());
    }

    public DescribeMultiZoneAvailableRegionsResponse describeMultiZoneAvailableRegions(DescribeMultiZoneAvailableRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMultiZoneAvailableRegionsWithOptions(request, runtime);
    }

    public DescribeMultiZoneAvailableResourceResponse describeMultiZoneAvailableResourceWithOptions(DescribeMultiZoneAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMultiZoneAvailableResource", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMultiZoneAvailableResourceResponse());
    }

    public DescribeMultiZoneAvailableResourceResponse describeMultiZoneAvailableResource(DescribeMultiZoneAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMultiZoneAvailableResourceWithOptions(request, runtime);
    }

    public DescribeMultiZoneClusterResponse describeMultiZoneClusterWithOptions(DescribeMultiZoneClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMultiZoneCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMultiZoneClusterResponse());
    }

    public DescribeMultiZoneClusterResponse describeMultiZoneCluster(DescribeMultiZoneClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMultiZoneClusterWithOptions(request, runtime);
    }

    public DescribeRecoverableTimeRangeResponse describeRecoverableTimeRangeWithOptions(DescribeRecoverableTimeRangeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecoverableTimeRange", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecoverableTimeRangeResponse());
    }

    public DescribeRecoverableTimeRangeResponse describeRecoverableTimeRange(DescribeRecoverableTimeRangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoverableTimeRangeWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRestoreFullDetailsResponse describeRestoreFullDetailsWithOptions(DescribeRestoreFullDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreFullDetails", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreFullDetailsResponse());
    }

    public DescribeRestoreFullDetailsResponse describeRestoreFullDetails(DescribeRestoreFullDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreFullDetailsWithOptions(request, runtime);
    }

    public DescribeRestoreIncrDetailResponse describeRestoreIncrDetailWithOptions(DescribeRestoreIncrDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreIncrDetail", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreIncrDetailResponse());
    }

    public DescribeRestoreIncrDetailResponse describeRestoreIncrDetail(DescribeRestoreIncrDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreIncrDetailWithOptions(request, runtime);
    }

    public DescribeRestoreSchemaDetailsResponse describeRestoreSchemaDetailsWithOptions(DescribeRestoreSchemaDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreSchemaDetails", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreSchemaDetailsResponse());
    }

    public DescribeRestoreSchemaDetailsResponse describeRestoreSchemaDetails(DescribeRestoreSchemaDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreSchemaDetailsWithOptions(request, runtime);
    }

    public DescribeRestoreSummaryResponse describeRestoreSummaryWithOptions(DescribeRestoreSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreSummary", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreSummaryResponse());
    }

    public DescribeRestoreSummaryResponse describeRestoreSummary(DescribeRestoreSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreSummaryWithOptions(request, runtime);
    }

    public DescribeRestoreTablesResponse describeRestoreTablesWithOptions(DescribeRestoreTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreTables", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreTablesResponse());
    }

    public DescribeRestoreTablesResponse describeRestoreTables(DescribeRestoreTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreTablesWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public DescribeSubDomainResponse describeSubDomainWithOptions(DescribeSubDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubDomain", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubDomainResponse());
    }

    public DescribeSubDomainResponse describeSubDomain(DescribeSubDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubDomainWithOptions(request, runtime);
    }

    public EnableHBaseueBackupResponse enableHBaseueBackupWithOptions(EnableHBaseueBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableHBaseueBackup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableHBaseueBackupResponse());
    }

    public EnableHBaseueBackupResponse enableHBaseueBackup(EnableHBaseueBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableHBaseueBackupWithOptions(request, runtime);
    }

    public EnableHBaseueModuleResponse enableHBaseueModuleWithOptions(EnableHBaseueModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableHBaseueModule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableHBaseueModuleResponse());
    }

    public EnableHBaseueModuleResponse enableHBaseueModule(EnableHBaseueModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableHBaseueModuleWithOptions(request, runtime);
    }

    public EvaluateMultiZoneResourceResponse evaluateMultiZoneResourceWithOptions(EvaluateMultiZoneResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EvaluateMultiZoneResource", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EvaluateMultiZoneResourceResponse());
    }

    public EvaluateMultiZoneResourceResponse evaluateMultiZoneResource(EvaluateMultiZoneResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.evaluateMultiZoneResourceWithOptions(request, runtime);
    }

    public GetMultimodeCmsUrlResponse getMultimodeCmsUrlWithOptions(GetMultimodeCmsUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMultimodeCmsUrl", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMultimodeCmsUrlResponse());
    }

    public GetMultimodeCmsUrlResponse getMultimodeCmsUrl(GetMultimodeCmsUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMultimodeCmsUrlWithOptions(request, runtime);
    }

    public ListHBaseInstancesResponse listHBaseInstancesWithOptions(ListHBaseInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHBaseInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListHBaseInstancesResponse());
    }

    public ListHBaseInstancesResponse listHBaseInstances(ListHBaseInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHBaseInstancesWithOptions(request, runtime);
    }

    public ListInstanceServiceConfigHistoriesResponse listInstanceServiceConfigHistoriesWithOptions(ListInstanceServiceConfigHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstanceServiceConfigHistories", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstanceServiceConfigHistoriesResponse());
    }

    public ListInstanceServiceConfigHistoriesResponse listInstanceServiceConfigHistories(ListInstanceServiceConfigHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceServiceConfigHistoriesWithOptions(request, runtime);
    }

    public ListInstanceServiceConfigurationsResponse listInstanceServiceConfigurationsWithOptions(ListInstanceServiceConfigurationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstanceServiceConfigurations", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstanceServiceConfigurationsResponse());
    }

    public ListInstanceServiceConfigurationsResponse listInstanceServiceConfigurations(ListInstanceServiceConfigurationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceServiceConfigurationsWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTags", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagsResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    public ModifyBackupPlanConfigResponse modifyBackupPlanConfigWithOptions(ModifyBackupPlanConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPlanConfig", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPlanConfigResponse());
    }

    public ModifyBackupPlanConfigResponse modifyBackupPlanConfig(ModifyBackupPlanConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPlanConfigWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyClusterDeletionProtectionResponse modifyClusterDeletionProtectionWithOptions(ModifyClusterDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterDeletionProtection", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterDeletionProtectionResponse());
    }

    public ModifyClusterDeletionProtectionResponse modifyClusterDeletionProtection(ModifyClusterDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterDeletionProtectionWithOptions(request, runtime);
    }

    public ModifyDiskWarningLineResponse modifyDiskWarningLineWithOptions(ModifyDiskWarningLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDiskWarningLine", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDiskWarningLineResponse());
    }

    public ModifyDiskWarningLineResponse modifyDiskWarningLine(ModifyDiskWarningLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskWarningLineWithOptions(request, runtime);
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTimeWithOptions(ModifyInstanceMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMaintainTime", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMaintainTimeResponse());
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyInstanceNameResponse modifyInstanceNameWithOptions(ModifyInstanceNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceName", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceNameResponse());
    }

    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceNameWithOptions(request, runtime);
    }

    public ModifyInstanceServiceConfigResponse modifyInstanceServiceConfigWithOptions(ModifyInstanceServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceServiceConfig", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceServiceConfigResponse());
    }

    public ModifyInstanceServiceConfigResponse modifyInstanceServiceConfig(ModifyInstanceServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceServiceConfigWithOptions(request, runtime);
    }

    public ModifyInstanceTypeResponse modifyInstanceTypeWithOptions(ModifyInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceType", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceTypeResponse());
    }

    public ModifyInstanceTypeResponse modifyInstanceType(ModifyInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceTypeWithOptions(request, runtime);
    }

    public ModifyIpWhitelistResponse modifyIpWhitelistWithOptions(ModifyIpWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpWhitelist", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpWhitelistResponse());
    }

    public ModifyIpWhitelistResponse modifyIpWhitelist(ModifyIpWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpWhitelistWithOptions(request, runtime);
    }

    public ModifyMultiZoneClusterNodeTypeResponse modifyMultiZoneClusterNodeTypeWithOptions(ModifyMultiZoneClusterNodeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMultiZoneClusterNodeType", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMultiZoneClusterNodeTypeResponse());
    }

    public ModifyMultiZoneClusterNodeTypeResponse modifyMultiZoneClusterNodeType(ModifyMultiZoneClusterNodeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMultiZoneClusterNodeTypeWithOptions(request, runtime);
    }

    public ModifySecurityGroupsResponse modifySecurityGroupsWithOptions(ModifySecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupsResponse());
    }

    public ModifySecurityGroupsResponse modifySecurityGroups(ModifySecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupsWithOptions(request, runtime);
    }

    public ModifyUIAccountPasswordResponse modifyUIAccountPasswordWithOptions(ModifyUIAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUIAccountPassword", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUIAccountPasswordResponse());
    }

    public ModifyUIAccountPasswordResponse modifyUIAccountPassword(ModifyUIAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUIAccountPasswordWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public OpenBackupResponse openBackupWithOptions(OpenBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenBackup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new OpenBackupResponse());
    }

    public OpenBackupResponse openBackup(OpenBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openBackupWithOptions(request, runtime);
    }

    public PurgeInstanceResponse purgeInstanceWithOptions(PurgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PurgeInstance", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PurgeInstanceResponse());
    }

    public PurgeInstanceResponse purgeInstance(PurgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purgeInstanceWithOptions(request, runtime);
    }

    public QueryHBaseHaDBResponse queryHBaseHaDBWithOptions(QueryHBaseHaDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryHBaseHaDB", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryHBaseHaDBResponse());
    }

    public QueryHBaseHaDBResponse queryHBaseHaDB(QueryHBaseHaDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHBaseHaDBWithOptions(request, runtime);
    }

    public QueryXpackRelateDBResponse queryXpackRelateDBWithOptions(QueryXpackRelateDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryXpackRelateDB", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryXpackRelateDBResponse());
    }

    public QueryXpackRelateDBResponse queryXpackRelateDB(QueryXpackRelateDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryXpackRelateDBWithOptions(request, runtime);
    }

    public RelateDbForHBaseHaResponse relateDbForHBaseHaWithOptions(RelateDbForHBaseHaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RelateDbForHBaseHa", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RelateDbForHBaseHaResponse());
    }

    public RelateDbForHBaseHaResponse relateDbForHBaseHa(RelateDbForHBaseHaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.relateDbForHBaseHaWithOptions(request, runtime);
    }

    public ReleasePublicNetworkAddressResponse releasePublicNetworkAddressWithOptions(ReleasePublicNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleasePublicNetworkAddress", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleasePublicNetworkAddressResponse());
    }

    public ReleasePublicNetworkAddressResponse releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePublicNetworkAddressWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ResizeColdStorageSizeResponse resizeColdStorageSizeWithOptions(ResizeColdStorageSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeColdStorageSize", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeColdStorageSizeResponse());
    }

    public ResizeColdStorageSizeResponse resizeColdStorageSize(ResizeColdStorageSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeColdStorageSizeWithOptions(request, runtime);
    }

    public ResizeDiskSizeResponse resizeDiskSizeWithOptions(ResizeDiskSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeDiskSize", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeDiskSizeResponse());
    }

    public ResizeDiskSizeResponse resizeDiskSize(ResizeDiskSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeDiskSizeWithOptions(request, runtime);
    }

    public ResizeMultiZoneClusterDiskSizeResponse resizeMultiZoneClusterDiskSizeWithOptions(ResizeMultiZoneClusterDiskSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeMultiZoneClusterDiskSize", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeMultiZoneClusterDiskSizeResponse());
    }

    public ResizeMultiZoneClusterDiskSizeResponse resizeMultiZoneClusterDiskSize(ResizeMultiZoneClusterDiskSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeMultiZoneClusterDiskSizeWithOptions(request, runtime);
    }

    public ResizeMultiZoneClusterNodeCountResponse resizeMultiZoneClusterNodeCountWithOptions(ResizeMultiZoneClusterNodeCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeMultiZoneClusterNodeCount", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeMultiZoneClusterNodeCountResponse());
    }

    public ResizeMultiZoneClusterNodeCountResponse resizeMultiZoneClusterNodeCount(ResizeMultiZoneClusterNodeCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeMultiZoneClusterNodeCountWithOptions(request, runtime);
    }

    public ResizeNodeCountResponse resizeNodeCountWithOptions(ResizeNodeCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeNodeCount", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeNodeCountResponse());
    }

    public ResizeNodeCountResponse resizeNodeCount(ResizeNodeCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeNodeCountWithOptions(request, runtime);
    }

    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartInstance", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestartInstanceResponse());
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    public SwitchHbaseHaSlbResponse switchHbaseHaSlbWithOptions(SwitchHbaseHaSlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchHbaseHaSlb", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchHbaseHaSlbResponse());
    }

    public SwitchHbaseHaSlbResponse switchHbaseHaSlb(SwitchHbaseHaSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchHbaseHaSlbWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnTagResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    public UpgradeMinorVersionResponse upgradeMinorVersionWithOptions(UpgradeMinorVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeMinorVersion", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeMinorVersionResponse());
    }

    public UpgradeMinorVersionResponse upgradeMinorVersion(UpgradeMinorVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeMinorVersionWithOptions(request, runtime);
    }

    public UpgradeMultiZoneClusterResponse upgradeMultiZoneClusterWithOptions(UpgradeMultiZoneClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeMultiZoneCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeMultiZoneClusterResponse());
    }

    public UpgradeMultiZoneClusterResponse upgradeMultiZoneCluster(UpgradeMultiZoneClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeMultiZoneClusterWithOptions(request, runtime);
    }

    public XpackRelateDBResponse xpackRelateDBWithOptions(XpackRelateDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("XpackRelateDB", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new XpackRelateDBResponse());
    }

    public XpackRelateDBResponse xpackRelateDB(XpackRelateDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xpackRelateDBWithOptions(request, runtime);
    }
}
