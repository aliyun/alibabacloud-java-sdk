// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526;

import com.aliyun.tea.*;
import com.aliyun.ecs20140526.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-west-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ecs.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-fujian", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ecs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ecs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ecs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ecs.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ecs.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ecs.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ReleaseCapacityReservationResponse releaseCapacityReservationWithOptions(ReleaseCapacityReservationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseCapacityReservation", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseCapacityReservationResponse());
    }

    public ReleaseCapacityReservationResponse releaseCapacityReservation(ReleaseCapacityReservationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseCapacityReservationWithOptions(request, runtime);
    }

    public DescribeCapacityReservationsResponse describeCapacityReservationsWithOptions(DescribeCapacityReservationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCapacityReservations", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCapacityReservationsResponse());
    }

    public DescribeCapacityReservationsResponse describeCapacityReservations(DescribeCapacityReservationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCapacityReservationsWithOptions(request, runtime);
    }

    public DescribeCapacityReservationInstancesResponse describeCapacityReservationInstancesWithOptions(DescribeCapacityReservationInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCapacityReservationInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCapacityReservationInstancesResponse());
    }

    public DescribeCapacityReservationInstancesResponse describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCapacityReservationInstancesWithOptions(request, runtime);
    }

    public CreateCapacityReservationResponse createCapacityReservationWithOptions(CreateCapacityReservationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCapacityReservation", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateCapacityReservationResponse());
    }

    public CreateCapacityReservationResponse createCapacityReservation(CreateCapacityReservationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCapacityReservationWithOptions(request, runtime);
    }

    public StartElasticityAssuranceResponse startElasticityAssuranceWithOptions(StartElasticityAssuranceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartElasticityAssurance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new StartElasticityAssuranceResponse());
    }

    public StartElasticityAssuranceResponse startElasticityAssurance(StartElasticityAssuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startElasticityAssuranceWithOptions(request, runtime);
    }

    public ModifyInstanceAttachmentAttributesResponse modifyInstanceAttachmentAttributesWithOptions(ModifyInstanceAttachmentAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAttachmentAttributes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAttachmentAttributesResponse());
    }

    public ModifyInstanceAttachmentAttributesResponse modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttachmentAttributesWithOptions(request, runtime);
    }

    public DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributesWithOptions(DescribeInstanceAttachmentAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAttachmentAttributes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAttachmentAttributesResponse());
    }

    public DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAttachmentAttributesWithOptions(request, runtime);
    }

    public DescribeElasticityAssurancesResponse describeElasticityAssurancesWithOptions(DescribeElasticityAssurancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeElasticityAssurances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeElasticityAssurancesResponse());
    }

    public DescribeElasticityAssurancesResponse describeElasticityAssurances(DescribeElasticityAssurancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticityAssurancesWithOptions(request, runtime);
    }

    public DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstancesWithOptions(DescribeElasticityAssuranceInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeElasticityAssuranceInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeElasticityAssuranceInstancesResponse());
    }

    public DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticityAssuranceInstancesWithOptions(request, runtime);
    }

    public CreateElasticityAssuranceResponse createElasticityAssuranceWithOptions(CreateElasticityAssuranceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateElasticityAssurance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateElasticityAssuranceResponse());
    }

    public CreateElasticityAssuranceResponse createElasticityAssurance(CreateElasticityAssuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createElasticityAssuranceWithOptions(request, runtime);
    }

    public SendFileResponse sendFileWithOptions(SendFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SendFile", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new SendFileResponse());
    }

    public SendFileResponse sendFile(SendFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendFileWithOptions(request, runtime);
    }

    public DescribeSendFileResultsResponse describeSendFileResultsWithOptions(DescribeSendFileResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSendFileResults", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSendFileResultsResponse());
    }

    public DescribeSendFileResultsResponse describeSendFileResults(DescribeSendFileResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSendFileResultsWithOptions(request, runtime);
    }

    public ModifyDedicatedHostClusterAttributeResponse modifyDedicatedHostClusterAttributeWithOptions(ModifyDedicatedHostClusterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostClusterAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostClusterAttributeResponse());
    }

    public ModifyDedicatedHostClusterAttributeResponse modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostClusterAttributeWithOptions(request, runtime);
    }

    public DescribeDedicatedHostClustersResponse describeDedicatedHostClustersWithOptions(DescribeDedicatedHostClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHostClusters", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostClustersResponse());
    }

    public DescribeDedicatedHostClustersResponse describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostClustersWithOptions(request, runtime);
    }

    public DeleteDedicatedHostClusterResponse deleteDedicatedHostClusterWithOptions(DeleteDedicatedHostClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDedicatedHostCluster", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDedicatedHostClusterResponse());
    }

    public DeleteDedicatedHostClusterResponse deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDedicatedHostClusterWithOptions(request, runtime);
    }

    public CreateDedicatedHostClusterResponse createDedicatedHostClusterWithOptions(CreateDedicatedHostClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDedicatedHostCluster", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateDedicatedHostClusterResponse());
    }

    public CreateDedicatedHostClusterResponse createDedicatedHostCluster(CreateDedicatedHostClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedHostClusterWithOptions(request, runtime);
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse describeDeploymentSetSupportedInstanceTypeFamilyWithOptions(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDeploymentSetSupportedInstanceTypeFamily", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDeploymentSetSupportedInstanceTypeFamilyResponse());
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeploymentSetSupportedInstanceTypeFamilyWithOptions(request, runtime);
    }

    public DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttributeWithOptions(DescribeNetworkInterfaceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkInterfaceAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkInterfaceAttributeResponse());
    }

    public DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInterfaceAttributeWithOptions(request, runtime);
    }

    public CopySnapshotResponse copySnapshotWithOptions(CopySnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopySnapshot", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CopySnapshotResponse());
    }

    public CopySnapshotResponse copySnapshot(CopySnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copySnapshotWithOptions(request, runtime);
    }

    public ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeTypeWithOptions(ModifyDedicatedHostsChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostsChargeType", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostsChargeTypeResponse());
    }

    public ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostsChargeTypeWithOptions(request, runtime);
    }

    public ModifyInstanceMetadataOptionsResponse modifyInstanceMetadataOptionsWithOptions(ModifyInstanceMetadataOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceMetadataOptions", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceMetadataOptionsResponse());
    }

    public ModifyInstanceMetadataOptionsResponse modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceMetadataOptionsWithOptions(request, runtime);
    }

    public DescribeImageFromFamilyResponse describeImageFromFamilyWithOptions(DescribeImageFromFamilyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImageFromFamily", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImageFromFamilyResponse());
    }

    public DescribeImageFromFamilyResponse describeImageFromFamily(DescribeImageFromFamilyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageFromFamilyWithOptions(request, runtime);
    }

    public StopInstancesResponse stopInstancesWithOptions(StopInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new StopInstancesResponse());
    }

    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstancesWithOptions(request, runtime);
    }

    public StartInstancesResponse startInstancesWithOptions(StartInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new StartInstancesResponse());
    }

    public StartInstancesResponse startInstances(StartInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstancesWithOptions(request, runtime);
    }

    public RebootInstancesResponse rebootInstancesWithOptions(RebootInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebootInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RebootInstancesResponse());
    }

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstancesWithOptions(request, runtime);
    }

    public RedeployDedicatedHostResponse redeployDedicatedHostWithOptions(RedeployDedicatedHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RedeployDedicatedHost", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RedeployDedicatedHostResponse());
    }

    public RedeployDedicatedHostResponse redeployDedicatedHost(RedeployDedicatedHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.redeployDedicatedHostWithOptions(request, runtime);
    }

    public ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributesWithOptions(ModifyInstanceMaintenanceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceMaintenanceAttributes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceMaintenanceAttributesResponse());
    }

    public ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceMaintenanceAttributesWithOptions(request, runtime);
    }

    public DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributesWithOptions(DescribeInstanceMaintenanceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceMaintenanceAttributes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceMaintenanceAttributesResponse());
    }

    public DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMaintenanceAttributesWithOptions(request, runtime);
    }

    public ModifyDemandResponse modifyDemandWithOptions(ModifyDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDemand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDemandResponse());
    }

    public ModifyDemandResponse modifyDemand(ModifyDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDemandWithOptions(request, runtime);
    }

    public DeleteDemandResponse deleteDemandWithOptions(DeleteDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDemand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDemandResponse());
    }

    public DeleteDemandResponse deleteDemand(DeleteDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDemandWithOptions(request, runtime);
    }

    public CreateDemandResponse createDemandWithOptions(CreateDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDemand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateDemandResponse());
    }

    public CreateDemandResponse createDemand(CreateDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDemandWithOptions(request, runtime);
    }

    public PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnitWithOptions(PurchaseStorageCapacityUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PurchaseStorageCapacityUnit", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new PurchaseStorageCapacityUnitResponse());
    }

    public PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purchaseStorageCapacityUnitWithOptions(request, runtime);
    }

    public ModifyStorageCapacityUnitAttributeResponse modifyStorageCapacityUnitAttributeWithOptions(ModifyStorageCapacityUnitAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyStorageCapacityUnitAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyStorageCapacityUnitAttributeResponse());
    }

    public ModifyStorageCapacityUnitAttributeResponse modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStorageCapacityUnitAttributeWithOptions(request, runtime);
    }

    public DescribeStorageCapacityUnitsResponse describeStorageCapacityUnitsWithOptions(DescribeStorageCapacityUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeStorageCapacityUnits", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeStorageCapacityUnitsResponse());
    }

    public DescribeStorageCapacityUnitsResponse describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStorageCapacityUnitsWithOptions(request, runtime);
    }

    public RunCommandResponse runCommandWithOptions(RunCommandRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        RunCommandShrinkRequest request = new RunCommandShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.parameters)) {
            request.parametersShrink = com.aliyun.teautil.Common.toJSONString(tmp.parameters);
        }

        return TeaModel.toModel(this.doRequest("RunCommand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public DeleteInstancesResponse deleteInstancesWithOptions(DeleteInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteInstancesResponse());
    }

    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstancesWithOptions(request, runtime);
    }

    public ModifyStorageSetAttributeResponse modifyStorageSetAttributeWithOptions(ModifyStorageSetAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyStorageSetAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyStorageSetAttributeResponse());
    }

    public ModifyStorageSetAttributeResponse modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStorageSetAttributeWithOptions(request, runtime);
    }

    public DescribeStorageSetsResponse describeStorageSetsWithOptions(DescribeStorageSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeStorageSets", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeStorageSetsResponse());
    }

    public DescribeStorageSetsResponse describeStorageSets(DescribeStorageSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStorageSetsWithOptions(request, runtime);
    }

    public DescribeStorageSetDetailsResponse describeStorageSetDetailsWithOptions(DescribeStorageSetDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeStorageSetDetails", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeStorageSetDetailsResponse());
    }

    public DescribeStorageSetDetailsResponse describeStorageSetDetails(DescribeStorageSetDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStorageSetDetailsWithOptions(request, runtime);
    }

    public DeleteStorageSetResponse deleteStorageSetWithOptions(DeleteStorageSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteStorageSet", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteStorageSetResponse());
    }

    public DeleteStorageSetResponse deleteStorageSet(DeleteStorageSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStorageSetWithOptions(request, runtime);
    }

    public CreateStorageSetResponse createStorageSetWithOptions(CreateStorageSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateStorageSet", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateStorageSetResponse());
    }

    public CreateStorageSetResponse createStorageSet(CreateStorageSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStorageSetWithOptions(request, runtime);
    }

    public ModifyDiskSpecResponse modifyDiskSpecWithOptions(ModifyDiskSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDiskSpec", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDiskSpecResponse());
    }

    public ModifyDiskSpecResponse modifyDiskSpec(ModifyDiskSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDiskSpecWithOptions(request, runtime);
    }

    public ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroupWithOptions(ModifyAutoProvisioningGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAutoProvisioningGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAutoProvisioningGroupResponse());
    }

    public ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoProvisioningGroupWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsWithOptions(DescribeAutoProvisioningGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAutoProvisioningGroups", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAutoProvisioningGroupsResponse());
    }

    public DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoProvisioningGroupsWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesWithOptions(DescribeAutoProvisioningGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAutoProvisioningGroupInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAutoProvisioningGroupInstancesResponse());
    }

    public DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoProvisioningGroupInstancesWithOptions(request, runtime);
    }

    public DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroupWithOptions(DeleteAutoProvisioningGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAutoProvisioningGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAutoProvisioningGroupResponse());
    }

    public DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoProvisioningGroupWithOptions(request, runtime);
    }

    public CreateAutoProvisioningGroupResponse createAutoProvisioningGroupWithOptions(CreateAutoProvisioningGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAutoProvisioningGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateAutoProvisioningGroupResponse());
    }

    public CreateAutoProvisioningGroupResponse createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoProvisioningGroupWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistoryWithOptions(DescribeAutoProvisioningGroupHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAutoProvisioningGroupHistory", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAutoProvisioningGroupHistoryResponse());
    }

    public DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoProvisioningGroupHistoryWithOptions(request, runtime);
    }

    public ReportInstancesStatusResponse reportInstancesStatusWithOptions(ReportInstancesStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReportInstancesStatus", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReportInstancesStatusResponse());
    }

    public ReportInstancesStatusResponse reportInstancesStatus(ReportInstancesStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportInstancesStatusWithOptions(request, runtime);
    }

    public ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttributeWithOptions(ModifyReservedInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyReservedInstanceAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyReservedInstanceAttributeResponse());
    }

    public ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyReservedInstanceAttributeWithOptions(request, runtime);
    }

    public PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOfferingWithOptions(PurchaseReservedInstancesOfferingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PurchaseReservedInstancesOffering", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new PurchaseReservedInstancesOfferingResponse());
    }

    public PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purchaseReservedInstancesOfferingWithOptions(request, runtime);
    }

    public ModifyReservedInstancesResponse modifyReservedInstancesWithOptions(ModifyReservedInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyReservedInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyReservedInstancesResponse());
    }

    public ModifyReservedInstancesResponse modifyReservedInstances(ModifyReservedInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyReservedInstancesWithOptions(request, runtime);
    }

    public DescribeReservedInstancesResponse describeReservedInstancesWithOptions(DescribeReservedInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeReservedInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeReservedInstancesResponse());
    }

    public DescribeReservedInstancesResponse describeReservedInstances(DescribeReservedInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReservedInstancesWithOptions(request, runtime);
    }

    public DescribeDemandsResponse describeDemandsWithOptions(DescribeDemandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDemands", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDemandsResponse());
    }

    public DescribeDemandsResponse describeDemands(DescribeDemandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDemandsWithOptions(request, runtime);
    }

    public ImportSnapshotResponse importSnapshotWithOptions(ImportSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportSnapshot", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ImportSnapshotResponse());
    }

    public ImportSnapshotResponse importSnapshot(ImportSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importSnapshotWithOptions(request, runtime);
    }

    public ExportSnapshotResponse exportSnapshotWithOptions(ExportSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExportSnapshot", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ExportSnapshotResponse());
    }

    public ExportSnapshotResponse exportSnapshot(ExportSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportSnapshotWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public AcceptInquiredSystemEventResponse acceptInquiredSystemEventWithOptions(AcceptInquiredSystemEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AcceptInquiredSystemEvent", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AcceptInquiredSystemEventResponse());
    }

    public AcceptInquiredSystemEventResponse acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptInquiredSystemEventWithOptions(request, runtime);
    }

    public RedeployInstanceResponse redeployInstanceWithOptions(RedeployInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RedeployInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RedeployInstanceResponse());
    }

    public RedeployInstanceResponse redeployInstance(RedeployInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.redeployInstanceWithOptions(request, runtime);
    }

    public UnassignIpv6AddressesResponse unassignIpv6AddressesWithOptions(UnassignIpv6AddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassignIpv6Addresses", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new UnassignIpv6AddressesResponse());
    }

    public UnassignIpv6AddressesResponse unassignIpv6Addresses(UnassignIpv6AddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignIpv6AddressesWithOptions(request, runtime);
    }

    public AssignIpv6AddressesResponse assignIpv6AddressesWithOptions(AssignIpv6AddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssignIpv6Addresses", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AssignIpv6AddressesResponse());
    }

    public AssignIpv6AddressesResponse assignIpv6Addresses(AssignIpv6AddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignIpv6AddressesWithOptions(request, runtime);
    }

    public DescribeInstanceTopologyResponse describeInstanceTopologyWithOptions(DescribeInstanceTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceTopology", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceTopologyResponse());
    }

    public DescribeInstanceTopologyResponse describeInstanceTopology(DescribeInstanceTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTopologyWithOptions(request, runtime);
    }

    public RenewDedicatedHostsResponse renewDedicatedHostsWithOptions(RenewDedicatedHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewDedicatedHosts", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RenewDedicatedHostsResponse());
    }

    public RenewDedicatedHostsResponse renewDedicatedHosts(RenewDedicatedHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewDedicatedHostsWithOptions(request, runtime);
    }

    public ReleaseDedicatedHostResponse releaseDedicatedHostWithOptions(ReleaseDedicatedHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseDedicatedHost", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseDedicatedHostResponse());
    }

    public ReleaseDedicatedHostResponse releaseDedicatedHost(ReleaseDedicatedHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseDedicatedHostWithOptions(request, runtime);
    }

    public ModifyInstanceDeploymentResponse modifyInstanceDeploymentWithOptions(ModifyInstanceDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceDeployment", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceDeploymentResponse());
    }

    public ModifyInstanceDeploymentResponse modifyInstanceDeployment(ModifyInstanceDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceDeploymentWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttributeWithOptions(ModifyDedicatedHostAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostAutoRenewAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostAutoRenewAttributeResponse());
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTimeWithOptions(ModifyDedicatedHostAutoReleaseTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostAutoReleaseTime", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostAutoReleaseTimeResponse());
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostAutoReleaseTimeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDedicatedHostAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHosts", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostTypesResponse describeDedicatedHostTypesWithOptions(DescribeDedicatedHostTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHostTypes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostTypesResponse());
    }

    public DescribeDedicatedHostTypesResponse describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostTypesWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewWithOptions(DescribeDedicatedHostAutoRenewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDedicatedHostAutoRenew", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDedicatedHostAutoRenewResponse());
    }

    public DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedHostAutoRenewWithOptions(request, runtime);
    }

    public AllocateDedicatedHostsResponse allocateDedicatedHostsWithOptions(AllocateDedicatedHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateDedicatedHosts", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AllocateDedicatedHostsResponse());
    }

    public AllocateDedicatedHostsResponse allocateDedicatedHosts(AllocateDedicatedHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateDedicatedHostsWithOptions(request, runtime);
    }

    public CreateSimulatedSystemEventsResponse createSimulatedSystemEventsWithOptions(CreateSimulatedSystemEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSimulatedSystemEvents", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateSimulatedSystemEventsResponse());
    }

    public CreateSimulatedSystemEventsResponse createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimulatedSystemEventsWithOptions(request, runtime);
    }

    public CancelSimulatedSystemEventsResponse cancelSimulatedSystemEventsWithOptions(CancelSimulatedSystemEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelSimulatedSystemEvents", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelSimulatedSystemEventsResponse());
    }

    public CancelSimulatedSystemEventsResponse cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelSimulatedSystemEventsWithOptions(request, runtime);
    }

    public DescribeEniMonitorDataResponse describeEniMonitorDataWithOptions(DescribeEniMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEniMonitorData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEniMonitorDataResponse());
    }

    public DescribeEniMonitorDataResponse describeEniMonitorData(DescribeEniMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEniMonitorDataWithOptions(request, runtime);
    }

    public DescribeAccountAttributesResponse describeAccountAttributesWithOptions(DescribeAccountAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAccountAttributes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAccountAttributesResponse());
    }

    public DescribeAccountAttributesResponse describeAccountAttributes(DescribeAccountAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountAttributesWithOptions(request, runtime);
    }

    public ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersionWithOptions(ModifyLaunchTemplateDefaultVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyLaunchTemplateDefaultVersion", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyLaunchTemplateDefaultVersionResponse());
    }

    public ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLaunchTemplateDefaultVersionWithOptions(request, runtime);
    }

    public DescribeLaunchTemplatesResponse describeLaunchTemplatesWithOptions(DescribeLaunchTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLaunchTemplates", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLaunchTemplatesResponse());
    }

    public DescribeLaunchTemplatesResponse describeLaunchTemplates(DescribeLaunchTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLaunchTemplatesWithOptions(request, runtime);
    }

    public DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsWithOptions(DescribeLaunchTemplateVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLaunchTemplateVersions", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLaunchTemplateVersionsResponse());
    }

    public DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLaunchTemplateVersionsWithOptions(request, runtime);
    }

    public DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersionWithOptions(DeleteLaunchTemplateVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLaunchTemplateVersion", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLaunchTemplateVersionResponse());
    }

    public DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLaunchTemplateVersionWithOptions(request, runtime);
    }

    public DeleteLaunchTemplateResponse deleteLaunchTemplateWithOptions(DeleteLaunchTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLaunchTemplate", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLaunchTemplateResponse());
    }

    public DeleteLaunchTemplateResponse deleteLaunchTemplate(DeleteLaunchTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLaunchTemplateWithOptions(request, runtime);
    }

    public CreateLaunchTemplateVersionResponse createLaunchTemplateVersionWithOptions(CreateLaunchTemplateVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLaunchTemplateVersion", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateLaunchTemplateVersionResponse());
    }

    public CreateLaunchTemplateVersionResponse createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLaunchTemplateVersionWithOptions(request, runtime);
    }

    public CreateLaunchTemplateResponse createLaunchTemplateWithOptions(CreateLaunchTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLaunchTemplate", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateLaunchTemplateResponse());
    }

    public CreateLaunchTemplateResponse createLaunchTemplate(CreateLaunchTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLaunchTemplateWithOptions(request, runtime);
    }

    public InstallCloudAssistantResponse installCloudAssistantWithOptions(InstallCloudAssistantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InstallCloudAssistant", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new InstallCloudAssistantResponse());
    }

    public InstallCloudAssistantResponse installCloudAssistant(InstallCloudAssistantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installCloudAssistantWithOptions(request, runtime);
    }

    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatusWithOptions(DescribeCloudAssistantStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCloudAssistantStatus", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCloudAssistantStatusResponse());
    }

    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudAssistantStatusWithOptions(request, runtime);
    }

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddressesWithOptions(UnassignPrivateIpAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassignPrivateIpAddresses", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new UnassignPrivateIpAddressesResponse());
    }

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignPrivateIpAddressesWithOptions(request, runtime);
    }

    public AssignPrivateIpAddressesResponse assignPrivateIpAddressesWithOptions(AssignPrivateIpAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssignPrivateIpAddresses", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AssignPrivateIpAddressesResponse());
    }

    public AssignPrivateIpAddressesResponse assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignPrivateIpAddressesWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissionsWithOptions(DescribeNetworkInterfacePermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkInterfacePermissions", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkInterfacePermissionsResponse());
    }

    public DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInterfacePermissionsWithOptions(request, runtime);
    }

    public DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermissionWithOptions(DeleteNetworkInterfacePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNetworkInterfacePermission", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNetworkInterfacePermissionResponse());
    }

    public DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkInterfacePermissionWithOptions(request, runtime);
    }

    public CreateNetworkInterfacePermissionResponse createNetworkInterfacePermissionWithOptions(CreateNetworkInterfacePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNetworkInterfacePermission", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateNetworkInterfacePermissionResponse());
    }

    public CreateNetworkInterfacePermissionResponse createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkInterfacePermissionWithOptions(request, runtime);
    }

    public GetInstanceScreenshotResponse getInstanceScreenshotWithOptions(GetInstanceScreenshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceScreenshot", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceScreenshotResponse());
    }

    public GetInstanceScreenshotResponse getInstanceScreenshot(GetInstanceScreenshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceScreenshotWithOptions(request, runtime);
    }

    public GetInstanceConsoleOutputResponse getInstanceConsoleOutputWithOptions(GetInstanceConsoleOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceConsoleOutput", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceConsoleOutputResponse());
    }

    public GetInstanceConsoleOutputResponse getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceConsoleOutputWithOptions(request, runtime);
    }

    public DescribeResourcesModificationResponse describeResourcesModificationWithOptions(DescribeResourcesModificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcesModification", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcesModificationResponse());
    }

    public DescribeResourcesModificationResponse describeResourcesModification(DescribeResourcesModificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourcesModificationWithOptions(request, runtime);
    }

    public DescribeBandwidthLimitationResponse describeBandwidthLimitationWithOptions(DescribeBandwidthLimitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBandwidthLimitation", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBandwidthLimitationResponse());
    }

    public DescribeBandwidthLimitationResponse describeBandwidthLimitation(DescribeBandwidthLimitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthLimitationWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableResource", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public ReActivateInstancesResponse reActivateInstancesWithOptions(ReActivateInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReActivateInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReActivateInstancesResponse());
    }

    public ReActivateInstancesResponse reActivateInstances(ReActivateInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reActivateInstancesWithOptions(request, runtime);
    }

    public DescribeInstancesFullStatusResponse describeInstancesFullStatusWithOptions(DescribeInstancesFullStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstancesFullStatus", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstancesFullStatusResponse());
    }

    public DescribeInstancesFullStatusResponse describeInstancesFullStatus(DescribeInstancesFullStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesFullStatusWithOptions(request, runtime);
    }

    public DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsWithOptions(DescribeInstanceHistoryEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceHistoryEvents", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceHistoryEventsResponse());
    }

    public DescribeInstanceHistoryEventsResponse describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceHistoryEventsWithOptions(request, runtime);
    }

    public DescribeDisksFullStatusResponse describeDisksFullStatusWithOptions(DescribeDisksFullStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDisksFullStatus", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDisksFullStatusResponse());
    }

    public DescribeDisksFullStatusResponse describeDisksFullStatus(DescribeDisksFullStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisksFullStatusWithOptions(request, runtime);
    }

    public ModifyUserBusinessBehaviorResponse modifyUserBusinessBehaviorWithOptions(ModifyUserBusinessBehaviorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyUserBusinessBehavior", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyUserBusinessBehaviorResponse());
    }

    public ModifyUserBusinessBehaviorResponse modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserBusinessBehaviorWithOptions(request, runtime);
    }

    public DescribeUserBusinessBehaviorResponse describeUserBusinessBehaviorWithOptions(DescribeUserBusinessBehaviorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserBusinessBehavior", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUserBusinessBehaviorResponse());
    }

    public DescribeUserBusinessBehaviorResponse describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserBusinessBehaviorWithOptions(request, runtime);
    }

    public RunInstancesResponse runInstancesWithOptions(RunInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RunInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RunInstancesResponse());
    }

    public RunInstancesResponse runInstances(RunInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runInstancesWithOptions(request, runtime);
    }

    public ConvertNatPublicIpToEipResponse convertNatPublicIpToEipWithOptions(ConvertNatPublicIpToEipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConvertNatPublicIpToEip", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ConvertNatPublicIpToEipResponse());
    }

    public ConvertNatPublicIpToEipResponse convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertNatPublicIpToEipWithOptions(request, runtime);
    }

    public ModifyHpcClusterAttributeResponse modifyHpcClusterAttributeWithOptions(ModifyHpcClusterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyHpcClusterAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyHpcClusterAttributeResponse());
    }

    public ModifyHpcClusterAttributeResponse modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHpcClusterAttributeWithOptions(request, runtime);
    }

    public DescribeHpcClustersResponse describeHpcClustersWithOptions(DescribeHpcClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHpcClusters", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHpcClustersResponse());
    }

    public DescribeHpcClustersResponse describeHpcClusters(DescribeHpcClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHpcClustersWithOptions(request, runtime);
    }

    public DeleteHpcClusterResponse deleteHpcClusterWithOptions(DeleteHpcClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteHpcCluster", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteHpcClusterResponse());
    }

    public DeleteHpcClusterResponse deleteHpcCluster(DeleteHpcClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHpcClusterWithOptions(request, runtime);
    }

    public CreateHpcClusterResponse createHpcClusterWithOptions(CreateHpcClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateHpcCluster", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateHpcClusterResponse());
    }

    public CreateHpcClusterResponse createHpcCluster(CreateHpcClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHpcClusterWithOptions(request, runtime);
    }

    public DescribeSnapshotsUsageResponse describeSnapshotsUsageWithOptions(DescribeSnapshotsUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshotsUsage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotsUsageResponse());
    }

    public DescribeSnapshotsUsageResponse describeSnapshotsUsage(DescribeSnapshotsUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsUsageWithOptions(request, runtime);
    }

    public DescribeSpotPriceHistoryResponse describeSpotPriceHistoryWithOptions(DescribeSpotPriceHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSpotPriceHistory", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSpotPriceHistoryResponse());
    }

    public DescribeSpotPriceHistoryResponse describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSpotPriceHistoryWithOptions(request, runtime);
    }

    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInvocation", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new StopInvocationResponse());
    }

    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    public ModifyCommandResponse modifyCommandWithOptions(ModifyCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCommand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCommandResponse());
    }

    public ModifyCommandResponse modifyCommand(ModifyCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCommandWithOptions(request, runtime);
    }

    public InvokeCommandResponse invokeCommandWithOptions(InvokeCommandRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        InvokeCommandShrinkRequest request = new InvokeCommandShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.parameters)) {
            request.parametersShrink = com.aliyun.teautil.Common.toJSONString(tmp.parameters);
        }

        return TeaModel.toModel(this.doRequest("InvokeCommand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new InvokeCommandResponse());
    }

    public InvokeCommandResponse invokeCommand(InvokeCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeCommandWithOptions(request, runtime);
    }

    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInvocations", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInvocationsResponse());
    }

    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    public DescribeInvocationResultsResponse describeInvocationResultsWithOptions(DescribeInvocationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInvocationResults", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInvocationResultsResponse());
    }

    public DescribeInvocationResultsResponse describeInvocationResults(DescribeInvocationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationResultsWithOptions(request, runtime);
    }

    public DescribeCommandsResponse describeCommandsWithOptions(DescribeCommandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCommands", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCommandsResponse());
    }

    public DescribeCommandsResponse describeCommands(DescribeCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommandsWithOptions(request, runtime);
    }

    public DeleteCommandResponse deleteCommandWithOptions(DeleteCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCommand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCommandResponse());
    }

    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCommandWithOptions(request, runtime);
    }

    public CreateCommandResponse createCommandWithOptions(CreateCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCommand", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateCommandResponse());
    }

    public CreateCommandResponse createCommand(CreateCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCommandWithOptions(request, runtime);
    }

    public ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRuleWithOptions(ModifySecurityGroupEgressRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySecurityGroupEgressRule", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifySecurityGroupEgressRuleResponse());
    }

    public ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupEgressRuleWithOptions(request, runtime);
    }

    public ModifyDiskChargeTypeResponse modifyDiskChargeTypeWithOptions(ModifyDiskChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDiskChargeType", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDiskChargeTypeResponse());
    }

    public ModifyDiskChargeTypeResponse modifyDiskChargeType(ModifyDiskChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDiskChargeTypeWithOptions(request, runtime);
    }

    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttributeWithOptions(ModifyNetworkInterfaceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyNetworkInterfaceAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyNetworkInterfaceAttributeResponse());
    }

    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkInterfaceAttributeWithOptions(request, runtime);
    }

    public DetachNetworkInterfaceResponse detachNetworkInterfaceWithOptions(DetachNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachNetworkInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DetachNetworkInterfaceResponse());
    }

    public DetachNetworkInterfaceResponse detachNetworkInterface(DetachNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachNetworkInterfaceWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkInterfaces", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkInterfacesResponse());
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    public DeleteNetworkInterfaceResponse deleteNetworkInterfaceWithOptions(DeleteNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNetworkInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNetworkInterfaceResponse());
    }

    public DeleteNetworkInterfaceResponse deleteNetworkInterface(DeleteNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkInterfaceWithOptions(request, runtime);
    }

    public CreateNetworkInterfaceResponse createNetworkInterfaceWithOptions(CreateNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNetworkInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateNetworkInterfaceResponse());
    }

    public CreateNetworkInterfaceResponse createNetworkInterface(CreateNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkInterfaceWithOptions(request, runtime);
    }

    public AttachNetworkInterfaceResponse attachNetworkInterfaceWithOptions(AttachNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachNetworkInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AttachNetworkInterfaceResponse());
    }

    public AttachNetworkInterfaceResponse attachNetworkInterface(AttachNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachNetworkInterfaceWithOptions(request, runtime);
    }

    public DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeWithOptions(DescribeRecommendInstanceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecommendInstanceType", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecommendInstanceTypeResponse());
    }

    public DescribeRecommendInstanceTypeResponse describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendInstanceTypeWithOptions(request, runtime);
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecWithOptions(ModifyPrepayInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPrepayInstanceSpec", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPrepayInstanceSpecResponse());
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

    public ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeWithOptions(ModifyInstanceChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceChargeType", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceChargeTypeResponse());
    }

    public ModifyInstanceChargeTypeResponse modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceChargeTypeWithOptions(request, runtime);
    }

    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinResourceGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new JoinResourceGroupResponse());
    }

    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    public ModifySecurityGroupPolicyResponse modifySecurityGroupPolicyWithOptions(ModifySecurityGroupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySecurityGroupPolicy", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifySecurityGroupPolicyResponse());
    }

    public ModifySecurityGroupPolicyResponse modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupPolicyWithOptions(request, runtime);
    }

    public DescribeSecurityGroupReferencesResponse describeSecurityGroupReferencesWithOptions(DescribeSecurityGroupReferencesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityGroupReferences", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityGroupReferencesResponse());
    }

    public DescribeSecurityGroupReferencesResponse describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupReferencesWithOptions(request, runtime);
    }

    public DetachClassicLinkVpcResponse detachClassicLinkVpcWithOptions(DetachClassicLinkVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachClassicLinkVpc", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DetachClassicLinkVpcResponse());
    }

    public DetachClassicLinkVpcResponse detachClassicLinkVpc(DetachClassicLinkVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachClassicLinkVpcWithOptions(request, runtime);
    }

    public DescribeClassicLinkInstancesResponse describeClassicLinkInstancesWithOptions(DescribeClassicLinkInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeClassicLinkInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeClassicLinkInstancesResponse());
    }

    public DescribeClassicLinkInstancesResponse describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClassicLinkInstancesWithOptions(request, runtime);
    }

    public AttachClassicLinkVpcResponse attachClassicLinkVpcWithOptions(AttachClassicLinkVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachClassicLinkVpc", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AttachClassicLinkVpcResponse());
    }

    public AttachClassicLinkVpcResponse attachClassicLinkVpc(AttachClassicLinkVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachClassicLinkVpcWithOptions(request, runtime);
    }

    public DetachInstanceRamRoleResponse detachInstanceRamRoleWithOptions(DetachInstanceRamRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachInstanceRamRole", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DetachInstanceRamRoleResponse());
    }

    public DetachInstanceRamRoleResponse detachInstanceRamRole(DetachInstanceRamRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachInstanceRamRoleWithOptions(request, runtime);
    }

    public DescribeInstanceRamRoleResponse describeInstanceRamRoleWithOptions(DescribeInstanceRamRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceRamRole", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceRamRoleResponse());
    }

    public DescribeInstanceRamRoleResponse describeInstanceRamRole(DescribeInstanceRamRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceRamRoleWithOptions(request, runtime);
    }

    public AttachInstanceRamRoleResponse attachInstanceRamRoleWithOptions(AttachInstanceRamRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachInstanceRamRole", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AttachInstanceRamRoleResponse());
    }

    public AttachInstanceRamRoleResponse attachInstanceRamRole(AttachInstanceRamRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachInstanceRamRoleWithOptions(request, runtime);
    }

    public DescribeSnapshotPackageResponse describeSnapshotPackageWithOptions(DescribeSnapshotPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshotPackage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotPackageResponse());
    }

    public DescribeSnapshotPackageResponse describeSnapshotPackage(DescribeSnapshotPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotPackageWithOptions(request, runtime);
    }

    public ModifySecurityGroupRuleResponse modifySecurityGroupRuleWithOptions(ModifySecurityGroupRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySecurityGroupRule", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifySecurityGroupRuleResponse());
    }

    public ModifySecurityGroupRuleResponse modifySecurityGroupRule(ModifySecurityGroupRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupRuleWithOptions(request, runtime);
    }

    public DescribeSnapshotMonitorDataResponse describeSnapshotMonitorDataWithOptions(DescribeSnapshotMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshotMonitorData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotMonitorDataResponse());
    }

    public DescribeSnapshotMonitorDataResponse describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotMonitorDataWithOptions(request, runtime);
    }

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRenewalPrice", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePrice", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttributeWithOptions(ModifyDeploymentSetAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDeploymentSetAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDeploymentSetAttributeResponse());
    }

    public ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeploymentSetAttributeWithOptions(request, runtime);
    }

    public DescribeDeploymentSetsResponse describeDeploymentSetsWithOptions(DescribeDeploymentSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDeploymentSets", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDeploymentSetsResponse());
    }

    public DescribeDeploymentSetsResponse describeDeploymentSets(DescribeDeploymentSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeploymentSetsWithOptions(request, runtime);
    }

    public DeleteDeploymentSetResponse deleteDeploymentSetWithOptions(DeleteDeploymentSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDeploymentSet", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDeploymentSetResponse());
    }

    public DeleteDeploymentSetResponse deleteDeploymentSet(DeleteDeploymentSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeploymentSetWithOptions(request, runtime);
    }

    public CreateDeploymentSetResponse createDeploymentSetWithOptions(CreateDeploymentSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDeploymentSet", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateDeploymentSetResponse());
    }

    public CreateDeploymentSetResponse createDeploymentSet(CreateDeploymentSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeploymentSetWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportKeyPair", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ImportKeyPairResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    public DetachKeyPairResponse detachKeyPairWithOptions(DetachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachKeyPair", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DetachKeyPairResponse());
    }

    public DetachKeyPairResponse detachKeyPair(DetachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachKeyPairWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeKeyPairs", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeKeyPairsResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteKeyPairs", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteKeyPairsResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateKeyPair", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateKeyPairResponse());
    }

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    public AttachKeyPairResponse attachKeyPairWithOptions(AttachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachKeyPair", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AttachKeyPairResponse());
    }

    public AttachKeyPairResponse attachKeyPair(AttachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachKeyPairWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeWithOptions(ModifyInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAutoRenewAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAutoRenewAttributeResponse());
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAutoRenewAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeSnapshotLinksResponse describeSnapshotLinksWithOptions(DescribeSnapshotLinksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshotLinks", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotLinksResponse());
    }

    public DescribeSnapshotLinksResponse describeSnapshotLinks(DescribeSnapshotLinksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotLinksWithOptions(request, runtime);
    }

    public ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTimeWithOptions(ModifyInstanceAutoReleaseTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAutoReleaseTime", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAutoReleaseTimeResponse());
    }

    public ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoReleaseTimeWithOptions(request, runtime);
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataWithOptions(DescribeNewProjectEipMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNewProjectEipMonitorData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNewProjectEipMonitorDataResponse());
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNewProjectEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeUserDataResponse describeUserDataWithOptions(DescribeUserDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUserDataResponse());
    }

    public DescribeUserDataResponse describeUserData(DescribeUserDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserDataWithOptions(request, runtime);
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIpsWithOptions(RemoveBandwidthPackageIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveBandwidthPackageIps", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RemoveBandwidthPackageIpsResponse());
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBandwidthPackageIpsWithOptions(request, runtime);
    }

    public ModifyForwardEntryResponse modifyForwardEntryWithOptions(ModifyForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyForwardEntry", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyForwardEntryResponse());
    }

    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpecWithOptions(ModifyBandwidthPackageSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBandwidthPackageSpec", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBandwidthPackageSpecResponse());
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBandwidthPackageSpecWithOptions(request, runtime);
    }

    public DescribeNatGatewaysResponse describeNatGatewaysWithOptions(DescribeNatGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNatGateways", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNatGatewaysResponse());
    }

    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntriesWithOptions(DescribeForwardTableEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeForwardTableEntries", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeForwardTableEntriesResponse());
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackagesWithOptions(DescribeBandwidthPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBandwidthPackages", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBandwidthPackagesResponse());
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackages(DescribeBandwidthPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthPackagesWithOptions(request, runtime);
    }

    public DeleteNatGatewayResponse deleteNatGatewayWithOptions(DeleteNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNatGateway", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNatGatewayResponse());
    }

    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

    public DeleteForwardEntryResponse deleteForwardEntryWithOptions(DeleteForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteForwardEntry", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteForwardEntryResponse());
    }

    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBandwidthPackage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBandwidthPackageResponse());
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    public CreateNatGatewayResponse createNatGatewayWithOptions(CreateNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNatGateway", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateNatGatewayResponse());
    }

    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

    public CreateForwardEntryResponse createForwardEntryWithOptions(CreateForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateForwardEntry", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateForwardEntryResponse());
    }

    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIpsWithOptions(AddBandwidthPackageIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddBandwidthPackageIps", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AddBandwidthPackageIpsResponse());
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIps(AddBandwidthPackageIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBandwidthPackageIpsWithOptions(request, runtime);
    }

    public EipFillProductResponse eipFillProductWithOptions(EipFillProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EipFillProduct", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new EipFillProductResponse());
    }

    public EipFillProductResponse eipFillProduct(EipFillProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.eipFillProductWithOptions(request, runtime);
    }

    public EipNotifyPaidResponse eipNotifyPaidWithOptions(EipNotifyPaidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EipNotifyPaid", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new EipNotifyPaidResponse());
    }

    public EipNotifyPaidResponse eipNotifyPaid(EipNotifyPaidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.eipNotifyPaidWithOptions(request, runtime);
    }

    public EipFillParamsResponse eipFillParamsWithOptions(EipFillParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EipFillParams", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new EipFillParamsResponse());
    }

    public EipFillParamsResponse eipFillParams(EipFillParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.eipFillParamsWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyExWithOptions(ModifyAutoSnapshotPolicyExRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAutoSnapshotPolicyEx", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAutoSnapshotPolicyExResponse());
    }

    public ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyExWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExWithOptions(DescribeAutoSnapshotPolicyExRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAutoSnapshotPolicyEx", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAutoSnapshotPolicyExResponse());
    }

    public DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotPolicyExWithOptions(request, runtime);
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAutoSnapshotPolicy", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAutoSnapshotPolicy", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateAutoSnapshotPolicyResponse());
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelAutoSnapshotPolicy", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelAutoSnapshotPolicyResponse());
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyAutoSnapshotPolicy", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesWithOptions(DescribeImageSupportInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImageSupportInstanceTypes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImageSupportInstanceTypesResponse());
    }

    public DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageSupportInstanceTypesWithOptions(request, runtime);
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterWithOptions(TerminateVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TerminateVirtualBorderRouter", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new TerminateVirtualBorderRouterResponse());
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateVirtualBorderRouterWithOptions(request, runtime);
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnectionWithOptions(TerminatePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TerminatePhysicalConnection", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new TerminatePhysicalConnectionResponse());
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminatePhysicalConnectionWithOptions(request, runtime);
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterWithOptions(RecoverVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecoverVirtualBorderRouter", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RecoverVirtualBorderRouterResponse());
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverVirtualBorderRouterWithOptions(request, runtime);
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeWithOptions(ModifyVirtualBorderRouterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVirtualBorderRouterAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVirtualBorderRouterAttributeResponse());
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVirtualBorderRouterAttributeWithOptions(request, runtime);
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttributeWithOptions(ModifyPhysicalConnectionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPhysicalConnectionAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPhysicalConnectionAttributeResponse());
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhysicalConnectionAttributeWithOptions(request, runtime);
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnectionWithOptions(EnablePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnablePhysicalConnection", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new EnablePhysicalConnectionResponse());
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnection(EnablePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enablePhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionWithOptions(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVirtualBorderRoutersForPhysicalConnection", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVirtualBorderRoutersForPhysicalConnectionResponse());
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualBorderRoutersForPhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersWithOptions(DescribeVirtualBorderRoutersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVirtualBorderRouters", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVirtualBorderRoutersResponse());
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualBorderRoutersWithOptions(request, runtime);
    }

    public DescribePhysicalConnectionsResponse describePhysicalConnectionsWithOptions(DescribePhysicalConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePhysicalConnections", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribePhysicalConnectionsResponse());
    }

    public DescribePhysicalConnectionsResponse describePhysicalConnections(DescribePhysicalConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhysicalConnectionsWithOptions(request, runtime);
    }

    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAccessPoints", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAccessPointsResponse());
    }

    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterWithOptions(DeleteVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVirtualBorderRouter", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVirtualBorderRouterResponse());
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualBorderRouterWithOptions(request, runtime);
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnectionWithOptions(DeletePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePhysicalConnection", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeletePhysicalConnectionResponse());
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnection(DeletePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePhysicalConnectionWithOptions(request, runtime);
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouterWithOptions(CreateVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVirtualBorderRouter", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateVirtualBorderRouterResponse());
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouter(CreateVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualBorderRouterWithOptions(request, runtime);
    }

    public CreatePhysicalConnectionResponse createPhysicalConnectionWithOptions(CreatePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePhysicalConnection", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreatePhysicalConnectionResponse());
    }

    public CreatePhysicalConnectionResponse createPhysicalConnection(CreatePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhysicalConnectionWithOptions(request, runtime);
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnectionWithOptions(CancelPhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelPhysicalConnection", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelPhysicalConnectionResponse());
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnection(CancelPhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPhysicalConnectionWithOptions(request, runtime);
    }

    public ImportImageResponse importImageWithOptions(ImportImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportImage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ImportImageResponse());
    }

    public ImportImageResponse importImage(ImportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importImageWithOptions(request, runtime);
    }

    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExportImage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ExportImageResponse());
    }

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTasks", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeTaskAttributeResponse describeTaskAttributeWithOptions(DescribeTaskAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTaskAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTaskAttributeResponse());
    }

    public DescribeTaskAttributeResponse describeTaskAttribute(DescribeTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskAttributeWithOptions(request, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelTask", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelTaskResponse());
    }

    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    public DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesWithOptions(DescribeInstanceTypeFamiliesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceTypeFamilies", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceTypeFamiliesResponse());
    }

    public DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTypeFamiliesWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecWithOptions(ModifyRouterInterfaceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRouterInterfaceSpec", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRouterInterfaceSpecResponse());
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouterInterfaceSpecWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeWithOptions(ModifyRouterInterfaceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRouterInterfaceAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRouterInterfaceAttributeResponse());
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public DescribeRouterInterfacesResponse describeRouterInterfacesWithOptions(DescribeRouterInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouterInterfaces", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouterInterfacesResponse());
    }

    public DescribeRouterInterfacesResponse describeRouterInterfaces(DescribeRouterInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouterInterfacesWithOptions(request, runtime);
    }

    public DeleteRouterInterfaceResponse deleteRouterInterfaceWithOptions(DeleteRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRouterInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRouterInterfaceResponse());
    }

    public DeleteRouterInterfaceResponse deleteRouterInterface(DeleteRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouterInterfaceWithOptions(request, runtime);
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterfaceWithOptions(DeactivateRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeactivateRouterInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeactivateRouterInterfaceResponse());
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterface(DeactivateRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateRouterInterfaceWithOptions(request, runtime);
    }

    public CreateRouterInterfaceResponse createRouterInterfaceWithOptions(CreateRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRouterInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateRouterInterfaceResponse());
    }

    public CreateRouterInterfaceResponse createRouterInterface(CreateRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouterInterfaceWithOptions(request, runtime);
    }

    public ConnectRouterInterfaceResponse connectRouterInterfaceWithOptions(ConnectRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConnectRouterInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ConnectRouterInterfaceResponse());
    }

    public ConnectRouterInterfaceResponse connectRouterInterface(ConnectRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.connectRouterInterfaceWithOptions(request, runtime);
    }

    public ActivateRouterInterfaceResponse activateRouterInterfaceWithOptions(ActivateRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ActivateRouterInterface", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ActivateRouterInterfaceResponse());
    }

    public ActivateRouterInterfaceResponse activateRouterInterface(ActivateRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateRouterInterfaceWithOptions(request, runtime);
    }

    public UnassociateHaVipResponse unassociateHaVipWithOptions(UnassociateHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateHaVip", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateHaVipResponse());
    }

    public UnassociateHaVipResponse unassociateHaVip(UnassociateHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateHaVipWithOptions(request, runtime);
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttributeWithOptions(ModifyHaVipAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyHaVipAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyHaVipAttributeResponse());
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttribute(ModifyHaVipAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHaVipAttributeWithOptions(request, runtime);
    }

    public DescribeHaVipsResponse describeHaVipsWithOptions(DescribeHaVipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHaVips", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHaVipsResponse());
    }

    public DescribeHaVipsResponse describeHaVips(DescribeHaVipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHaVipsWithOptions(request, runtime);
    }

    public DeleteHaVipResponse deleteHaVipWithOptions(DeleteHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteHaVip", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteHaVipResponse());
    }

    public DeleteHaVipResponse deleteHaVip(DeleteHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHaVipWithOptions(request, runtime);
    }

    public CreateHaVipResponse createHaVipWithOptions(CreateHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateHaVip", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateHaVipResponse());
    }

    public CreateHaVipResponse createHaVip(CreateHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHaVipWithOptions(request, runtime);
    }

    public AssociateHaVipResponse associateHaVipWithOptions(AssociateHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateHaVip", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AssociateHaVipResponse());
    }

    public AssociateHaVipResponse associateHaVip(AssociateHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateHaVipWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveTags", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTags", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeResourceByTagsResponse describeResourceByTagsWithOptions(DescribeResourceByTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourceByTags", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourceByTagsResponse());
    }

    public DescribeResourceByTagsResponse describeResourceByTags(DescribeResourceByTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceByTagsWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTags", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateEipAddress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeSecurityGroupEgress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RevokeSecurityGroupEgressResponse());
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeSecurityGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RevokeSecurityGroupResponse());
    }

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    public ResizeDiskResponse resizeDiskWithOptions(ResizeDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResizeDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ResizeDiskResponse());
    }

    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resizeDiskWithOptions(request, runtime);
    }

    public ResetDiskResponse resetDiskWithOptions(ResetDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ResetDiskResponse());
    }

    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

    public ReplaceSystemDiskResponse replaceSystemDiskWithOptions(ReplaceSystemDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReplaceSystemDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReplaceSystemDiskResponse());
    }

    public ReplaceSystemDiskResponse replaceSystemDisk(ReplaceSystemDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceSystemDiskWithOptions(request, runtime);
    }

    public ReleasePublicIpAddressResponse releasePublicIpAddressWithOptions(ReleasePublicIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleasePublicIpAddress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReleasePublicIpAddressResponse());
    }

    public ReleasePublicIpAddressResponse releasePublicIpAddress(ReleasePublicIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePublicIpAddressWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseEipAddress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReInitDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ReInitDiskResponse());
    }

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebootInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVSwitchAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttributeWithOptions(ModifyVRouterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVRouterAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVRouterAttributeResponse());
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttribute(ModifyVRouterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVpcAttributeResponse modifyVpcAttributeWithOptions(ModifyVpcAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVpcAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVpcAttributeResponse());
    }

    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcAttributeWithOptions(request, runtime);
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttributeWithOptions(ModifySnapshotAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySnapshotAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifySnapshotAttributeResponse());
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttribute(ModifySnapshotAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySnapshotAttributeWithOptions(request, runtime);
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeWithOptions(ModifySecurityGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySecurityGroupAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifySecurityGroupAttributeResponse());
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttributeWithOptions(ModifyInstanceVpcAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceVpcAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceVpcAttributeResponse());
    }

    public ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceVpcAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceVncPasswdResponse modifyInstanceVncPasswdWithOptions(ModifyInstanceVncPasswdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceVncPasswd", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceVncPasswdResponse());
    }

    public ModifyInstanceVncPasswdResponse modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceVncPasswdWithOptions(request, runtime);
    }

    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceSpec", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceSpecResponse());
    }

    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    public ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpecWithOptions(ModifyInstanceNetworkSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceNetworkSpec", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceNetworkSpecResponse());
    }

    public ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceNetworkSpecWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyImageSharePermission", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyImageSharePermissionResponse());
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    public ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermissionWithOptions(ModifyImageShareGroupPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyImageShareGroupPermission", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyImageShareGroupPermissionResponse());
    }

    public ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageShareGroupPermissionWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyImageAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttributeWithOptions(ModifyEipAddressAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyEipAddressAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyEipAddressAttributeResponse());
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyDiskAttributeResponse modifyDiskAttributeWithOptions(ModifyDiskAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDiskAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDiskAttributeResponse());
    }

    public ModifyDiskAttributeResponse modifyDiskAttribute(ModifyDiskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDiskAttributeWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAutoSnapshotPolicy", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LeaveSecurityGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new LeaveSecurityGroupResponse());
    }

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinSecurityGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new JoinSecurityGroupResponse());
    }

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    public DetachDiskResponse detachDiskWithOptions(DetachDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DetachDiskResponse());
    }

    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDiskWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeZones", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVSwitches", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeVRoutersResponse describeVRoutersWithOptions(DescribeVRoutersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVRouters", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVRoutersResponse());
    }

    public DescribeVRoutersResponse describeVRouters(DescribeVRoutersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVRoutersWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpcs", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshots", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityGroups", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityGroupAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public DescribeRouteTablesResponse describeRouteTablesWithOptions(DescribeRouteTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouteTables", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouteTablesResponse());
    }

    public DescribeRouteTablesResponse describeRouteTables(DescribeRouteTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteTablesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeLimitationResponse describeLimitationWithOptions(DescribeLimitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLimitation", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLimitationResponse());
    }

    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceVncUrl", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceVncUrlResponse());
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    public DescribeInstanceVncPasswdResponse describeInstanceVncPasswdWithOptions(DescribeInstanceVncPasswdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceVncPasswd", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceVncPasswdResponse());
    }

    public DescribeInstanceVncPasswdResponse describeInstanceVncPasswd(DescribeInstanceVncPasswdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceVncPasswdWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceTypes", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInstanceStatusResponse describeInstanceStatusWithOptions(DescribeInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceStatus", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceStatusResponse());
    }

    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceStatusWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstances", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceMonitorData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceMonitorDataResponse());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAttribute", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAttributeResponse());
    }

    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImageSharePermission", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImageSharePermissionResponse());
    }

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImages", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeEipMonitorDataResponse describeEipMonitorDataWithOptions(DescribeEipMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipMonitorData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipMonitorDataResponse());
    }

    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipAddresses", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public DescribeDisksResponse describeDisksWithOptions(DescribeDisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDisks", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDisksResponse());
    }

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    public DescribeDiskMonitorDataResponse describeDiskMonitorDataWithOptions(DescribeDiskMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDiskMonitorData", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDiskMonitorDataResponse());
    }

    public DescribeDiskMonitorDataResponse describeDiskMonitorData(DescribeDiskMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskMonitorDataWithOptions(request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeClusters", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVSwitch", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public DeleteVpcResponse deleteVpcWithOptions(DeleteVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVpc", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSnapshot", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSecurityGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public DeleteRouteEntryResponse deleteRouteEntryWithOptions(DeleteRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRouteEntry", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRouteEntryResponse());
    }

    public DeleteRouteEntryResponse deleteRouteEntry(DeleteRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteEntryWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteImage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteDiskResponse deleteDiskWithOptions(DeleteDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDiskResponse());
    }

    public DeleteDiskResponse deleteDisk(DeleteDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiskWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVSwitch", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public CreateVpcResponse createVpcWithOptions(CreateVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVpc", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateVpcResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSnapshot", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSecurityGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateSecurityGroupResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    public CreateRouteEntryResponse createRouteEntryWithOptions(CreateRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRouteEntry", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateRouteEntryResponse());
    }

    public CreateRouteEntryResponse createRouteEntry(CreateRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouteEntryWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstance", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateImage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateDiskResponse createDiskWithOptions(CreateDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateDiskResponse());
    }

    public CreateDiskResponse createDisk(CreateDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiskWithOptions(request, runtime);
    }

    public CopyImageResponse copyImageWithOptions(CopyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyImage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CopyImageResponse());
    }

    public CopyImageResponse copyImage(CopyImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyImageWithOptions(request, runtime);
    }

    public CancelCopyImageResponse cancelCopyImageWithOptions(CancelCopyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelCopyImage", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelCopyImageResponse());
    }

    public CancelCopyImageResponse cancelCopyImage(CancelCopyImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCopyImageWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AuthorizeSecurityGroupEgress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AuthorizeSecurityGroup", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public AttachDiskResponse attachDiskWithOptions(AttachDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachDisk", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AttachDiskResponse());
    }

    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDiskWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateEipAddress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AllocatePublicIpAddressResponse allocatePublicIpAddressWithOptions(AllocatePublicIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocatePublicIpAddress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AllocatePublicIpAddressResponse());
    }

    public AllocatePublicIpAddressResponse allocatePublicIpAddress(AllocatePublicIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocatePublicIpAddressWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateEipAddress", "HTTPS", "POST", "2014-05-26", "AK", null, TeaModel.buildMap(request), runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
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
}
