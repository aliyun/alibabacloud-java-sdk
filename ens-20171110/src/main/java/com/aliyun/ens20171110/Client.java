// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110;

import com.aliyun.tea.*;
import com.aliyun.ens20171110.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ens", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeTypeWithOptions(DescribeEpnBandwitdhByInternetChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEpnBandwitdhByInternetChargeType", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEpnBandwitdhByInternetChargeTypeResponse());
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthDataWithOptions(DescribeEpnBandWidthDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEpnBandWidthData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEpnBandWidthDataResponse());
    }

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnBandWidthDataWithOptions(request, runtime);
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementDataWithOptions(DescribeEpnMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEpnMeasurementData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEpnMeasurementDataResponse());
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnMeasurementDataWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkInterfaces", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkInterfacesResponse());
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    public CreateEPInstanceResponse createEPInstanceWithOptions(CreateEPInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEPInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateEPInstanceResponse());
    }

    public CreateEPInstanceResponse createEPInstance(CreateEPInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEPInstanceWithOptions(request, runtime);
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyImageSharePermission", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ModifyImageSharePermissionResponse());
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstanceWithOptions(AddNetworkInterfaceToInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddNetworkInterfaceToInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new AddNetworkInterfaceToInstanceResponse());
    }

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNetworkInterfaceToInstanceWithOptions(request, runtime);
    }

    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImageSharePermission", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImageSharePermissionResponse());
    }

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstanceWithOptions(RemoveVSwitchesFromEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveVSwitchesFromEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RemoveVSwitchesFromEpnInstanceResponse());
    }

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVSwitchesFromEpnInstanceWithOptions(request, runtime);
    }

    public DistApplicationDataResponse distApplicationDataWithOptions(DistApplicationDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DistApplicationData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DistApplicationDataResponse());
    }

    public DistApplicationDataResponse distApplicationData(DistApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.distApplicationDataWithOptions(request, runtime);
    }

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstanceWithOptions(JoinVSwitchesToEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinVSwitchesToEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new JoinVSwitchesToEpnInstanceResponse());
    }

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinVSwitchesToEpnInstanceWithOptions(request, runtime);
    }

    public DescribeApplicationResponse describeApplicationWithOptions(DescribeApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeApplication", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeApplicationResponse());
    }

    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationWithOptions(request, runtime);
    }

    public DescribeDataPushResultResponse describeDataPushResultWithOptions(DescribeDataPushResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataPushResult", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataPushResultResponse());
    }

    public DescribeDataPushResultResponse describeDataPushResult(DescribeDataPushResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataPushResultWithOptions(request, runtime);
    }

    public PushApplicationDataResponse pushApplicationDataWithOptions(PushApplicationDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PushApplicationData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new PushApplicationDataResponse());
    }

    public PushApplicationDataResponse pushApplicationData(PushApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushApplicationDataWithOptions(request, runtime);
    }

    public UpgradeApplicationResponse upgradeApplicationWithOptions(UpgradeApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeApplication", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeApplicationResponse());
    }

    public UpgradeApplicationResponse upgradeApplication(UpgradeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeApplicationWithOptions(request, runtime);
    }

    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RescaleApplication", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RescaleApplicationResponse());
    }

    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleApplicationWithOptions(request, runtime);
    }

    public DeleteEpnInstanceResponse deleteEpnInstanceWithOptions(DeleteEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEpnInstanceResponse());
    }

    public DeleteEpnInstanceResponse deleteEpnInstance(DeleteEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEpnInstanceWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListApplications", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ListApplicationsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    public DescribeServcieScheduleResponse describeServcieScheduleWithOptions(DescribeServcieScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeServcieSchedule", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeServcieScheduleResponse());
    }

    public DescribeServcieScheduleResponse describeServcieSchedule(DescribeServcieScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServcieScheduleWithOptions(request, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApplication", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    public ModifyEpnInstanceResponse modifyEpnInstanceWithOptions(ModifyEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ModifyEpnInstanceResponse());
    }

    public ModifyEpnInstanceResponse modifyEpnInstance(ModifyEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEpnInstanceWithOptions(request, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RollbackApplication", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RollbackApplicationResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackApplicationWithOptions(request, runtime);
    }

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttributeWithOptions(DescribeEpnInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEpnInstanceAttribute", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEpnInstanceAttributeResponse());
    }

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnInstanceAttributeWithOptions(request, runtime);
    }

    public RunServiceScheduleResponse runServiceScheduleWithOptions(RunServiceScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RunServiceSchedule", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RunServiceScheduleResponse());
    }

    public RunServiceScheduleResponse runServiceSchedule(RunServiceScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runServiceScheduleWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateApplication", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateEpnInstanceResponse createEpnInstanceWithOptions(CreateEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateEpnInstanceResponse());
    }

    public CreateEpnInstanceResponse createEpnInstance(CreateEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEpnInstanceWithOptions(request, runtime);
    }

    public StopEpnInstanceResponse stopEpnInstanceWithOptions(StopEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new StopEpnInstanceResponse());
    }

    public StopEpnInstanceResponse stopEpnInstance(StopEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopEpnInstanceWithOptions(request, runtime);
    }

    public DescribeDataDistResultResponse describeDataDistResultWithOptions(DescribeDataDistResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataDistResult", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataDistResultResponse());
    }

    public DescribeDataDistResultResponse describeDataDistResult(DescribeDataDistResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataDistResultWithOptions(request, runtime);
    }

    public DescribeEpnInstancesResponse describeEpnInstancesWithOptions(DescribeEpnInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEpnInstances", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEpnInstancesResponse());
    }

    public DescribeEpnInstancesResponse describeEpnInstances(DescribeEpnInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnInstancesWithOptions(request, runtime);
    }

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstanceWithOptions(RemovePublicIpsFromEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemovePublicIpsFromEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RemovePublicIpsFromEpnInstanceResponse());
    }

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePublicIpsFromEpnInstanceWithOptions(request, runtime);
    }

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstanceWithOptions(JoinPublicIpsToEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinPublicIpsToEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new JoinPublicIpsToEpnInstanceResponse());
    }

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinPublicIpsToEpnInstanceWithOptions(request, runtime);
    }

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummaryWithOptions(DescribeApplicationResourceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeApplicationResourceSummary", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeApplicationResourceSummaryResponse());
    }

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummary(DescribeApplicationResourceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationResourceSummaryWithOptions(request, runtime);
    }

    public StartEpnInstanceResponse startEpnInstanceWithOptions(StartEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartEpnInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new StartEpnInstanceResponse());
    }

    public StartEpnInstanceResponse startEpnInstance(StartEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEpnInstanceWithOptions(request, runtime);
    }

    public DescribeExportImageInfoResponse describeExportImageInfoWithOptions(DescribeExportImageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExportImageInfo", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExportImageInfoResponse());
    }

    public DescribeExportImageInfoResponse describeExportImageInfo(DescribeExportImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportImageInfoWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVSwitches", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVSwitch", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVSwitch", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public DescribeExportImageStatusResponse describeExportImageStatusWithOptions(DescribeExportImageStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExportImageStatus", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExportImageStatusResponse());
    }

    public DescribeExportImageStatusResponse describeExportImageStatus(DescribeExportImageStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportImageStatusWithOptions(request, runtime);
    }

    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExportImage", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ExportImageResponse());
    }

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportKeyPair", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ImportKeyPairResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeKeyPairs", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeKeyPairsResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteKeyPairs", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteKeyPairsResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateKeyPair", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateKeyPairResponse());
    }

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    public ExportBillDetailDataResponse exportBillDetailDataWithOptions(ExportBillDetailDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExportBillDetailData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ExportBillDetailDataResponse());
    }

    public ExportBillDetailDataResponse exportBillDetailData(ExportBillDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportBillDetailDataWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResourceWithOptions(DescribeEnsRegionIdResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEnsRegionIdResource", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEnsRegionIdResourceResponse());
    }

    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionIdResourceWithOptions(request, runtime);
    }

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeTypeWithOptions(DescribeBandwitdhByInternetChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBandwitdhByInternetChargeType", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBandwitdhByInternetChargeTypeResponse());
    }

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AuthorizeSecurityGroup", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeSecurityGroup", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RevokeSecurityGroupResponse());
    }

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSecurityGroup", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityGroupAttribute", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LeaveSecurityGroup", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new LeaveSecurityGroupResponse());
    }

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinSecurityGroup", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new JoinSecurityGroupResponse());
    }

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AuthorizeSecurityGroupEgress", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeSecurityGroupEgress", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RevokeSecurityGroupEgressResponse());
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityGroups", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSecurityGroup", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateSecurityGroupResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6InfoWithOptions(DescribeEnsRegionIdIpv6InfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEnsRegionIdIpv6Info", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEnsRegionIdIpv6InfoResponse());
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionIdIpv6InfoWithOptions(request, runtime);
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResultWithOptions(DescribeCreatePrePaidInstanceResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCreatePrePaidInstanceResult", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCreatePrePaidInstanceResultResponse());
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreatePrePaidInstanceResultWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePrice", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public ExportMeasurementDataResponse exportMeasurementDataWithOptions(ExportMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExportMeasurementData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ExportMeasurementDataResponse());
    }

    public ExportMeasurementDataResponse exportMeasurementData(ExportMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportMeasurementDataWithOptions(request, runtime);
    }

    public DescribeMeasurementDataResponse describeMeasurementDataWithOptions(DescribeMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMeasurementData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMeasurementDataResponse());
    }

    public DescribeMeasurementDataResponse describeMeasurementData(DescribeMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeasurementDataWithOptions(request, runtime);
    }

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfoWithOptions(DescribeAvailableResourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableResourceInfo", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableResourceInfoResponse());
    }

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfo(DescribeAvailableResourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceInfoWithOptions(request, runtime);
    }

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStockWithOptions(DescribePrePaidInstanceStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePrePaidInstanceStock", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribePrePaidInstanceStockResponse());
    }

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrePaidInstanceStockWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateEipAddress", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseEipAddress", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipAddresses", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateEipAddress", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateEipAddress", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public ReleasePostPaidInstanceResponse releasePostPaidInstanceWithOptions(ReleasePostPaidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleasePostPaidInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ReleasePostPaidInstanceResponse());
    }

    public ReleasePostPaidInstanceResponse releasePostPaidInstance(ReleasePostPaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePostPaidInstanceWithOptions(request, runtime);
    }

    public ReleasePrePaidInstanceResponse releasePrePaidInstanceWithOptions(ReleasePrePaidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleasePrePaidInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ReleasePrePaidInstanceResponse());
    }

    public ReleasePrePaidInstanceResponse releasePrePaidInstance(ReleasePrePaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePrePaidInstanceWithOptions(request, runtime);
    }

    public AttachEnsInstancesResponse attachEnsInstancesWithOptions(AttachEnsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachEnsInstances", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new AttachEnsInstancesResponse());
    }

    public AttachEnsInstancesResponse attachEnsInstances(AttachEnsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEnsInstancesWithOptions(request, runtime);
    }

    public DescribeReservedResourceResponse describeReservedResourceWithOptions(DescribeReservedResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeReservedResource", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeReservedResourceResponse());
    }

    public DescribeReservedResourceResponse describeReservedResource(DescribeReservedResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReservedResourceWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceTypes", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateImage", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrictWithOptions(DescribeEnsNetSaleDistrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEnsNetSaleDistrict", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEnsNetSaleDistrictResponse());
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetSaleDistrictWithOptions(request, runtime);
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrictWithOptions(DescribeEnsNetDistrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEnsNetDistrict", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEnsNetDistrictResponse());
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrict(DescribeEnsNetDistrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetDistrictWithOptions(request, runtime);
    }

    public PreCreateEnsServiceResponse preCreateEnsServiceWithOptions(PreCreateEnsServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PreCreateEnsService", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new PreCreateEnsServiceResponse());
    }

    public PreCreateEnsServiceResponse preCreateEnsService(PreCreateEnsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preCreateEnsServiceWithOptions(request, runtime);
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeTypeWithOptions(DescribeBandWithdChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBandWithdChargeType", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBandWithdChargeTypeResponse());
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeType(DescribeBandWithdChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandWithdChargeTypeWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyImageAttribute", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public CreateEnsServiceResponse createEnsServiceWithOptions(CreateEnsServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEnsService", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateEnsServiceResponse());
    }

    public CreateEnsServiceResponse createEnsService(CreateEnsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsServiceWithOptions(request, runtime);
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevelWithOptions(DescribeEnsNetLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEnsNetLevel", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEnsNetLevelResponse());
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevel(DescribeEnsNetLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetLevelWithOptions(request, runtime);
    }

    public DescribeInstanceSpecResponse describeInstanceSpecWithOptions(DescribeInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceSpec", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceSpecResponse());
    }

    public DescribeInstanceSpecResponse describeInstanceSpec(DescribeInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSpecWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAutoRenewAttribute", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAvailableResource", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReInitDisk", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ReInitDiskResponse());
    }

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    public DescribeImageInfosResponse describeImageInfosWithOptions(DescribeImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImageInfos", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImageInfosResponse());
    }

    public DescribeImageInfosResponse describeImageInfos(DescribeImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageInfosWithOptions(request, runtime);
    }

    public DescribeUserBandWidthDataResponse describeUserBandWidthDataWithOptions(DescribeUserBandWidthDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserBandWidthData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUserBandWidthDataResponse());
    }

    public DescribeUserBandWidthDataResponse describeUserBandWidthData(DescribeUserBandWidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserBandWidthDataWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebootInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public DescribeEnsRegionsResponse describeEnsRegionsWithOptions(DescribeEnsRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEnsRegions", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEnsRegionsResponse());
    }

    public DescribeEnsRegionsResponse describeEnsRegions(DescribeEnsRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionsWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceMonitorData", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceMonitorDataResponse());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstances", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImages", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInstance", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAttribute", "HTTPS", "POST", "2017-11-10", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
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
