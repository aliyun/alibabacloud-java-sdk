// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320;

import com.aliyun.tea.*;
import com.aliyun.cddc20200320.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cddc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ModifyDBInstanceSwitchWeightResponse modifyDBInstanceSwitchWeightWithOptions(ModifyDBInstanceSwitchWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSwitchWeight", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSwitchWeightResponse());
    }

    public ModifyDBInstanceSwitchWeightResponse modifyDBInstanceSwitchWeight(ModifyDBInstanceSwitchWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSwitchWeightWithOptions(request, runtime);
    }

    public DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZonesWithOptions(DescribeAvailableDedicatedHostZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableDedicatedHostZones", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableDedicatedHostZonesResponse());
    }

    public DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZones(DescribeAvailableDedicatedHostZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableDedicatedHostZonesWithOptions(request, runtime);
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroupsWithOptions(DescribeDedicatedHostGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostGroups", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostGroupsResponse());
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostGroupsWithOptions(request, runtime);
    }

    public DescribeMyBaseHostOverViewResponse describeMyBaseHostOverViewWithOptions(DescribeMyBaseHostOverViewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMyBaseHostOverView", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMyBaseHostOverViewResponse());
    }

    public DescribeMyBaseHostOverViewResponse describeMyBaseHostOverView(DescribeMyBaseHostOverViewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMyBaseHostOverViewWithOptions(request, runtime);
    }

    public DescribeBriefDedicatedHostsResponse describeBriefDedicatedHostsWithOptions(DescribeBriefDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBriefDedicatedHosts", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBriefDedicatedHostsResponse());
    }

    public DescribeBriefDedicatedHostsResponse describeBriefDedicatedHosts(DescribeBriefDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBriefDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDedicatedResourceAdvisorResponse describeDedicatedResourceAdvisorWithOptions(DescribeDedicatedResourceAdvisorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedResourceAdvisor", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedResourceAdvisorResponse());
    }

    public DescribeDedicatedResourceAdvisorResponse describeDedicatedResourceAdvisor(DescribeDedicatedResourceAdvisorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedResourceAdvisorWithOptions(request, runtime);
    }

    public DescribeListUserBackupFileRecordResponse describeListUserBackupFileRecordWithOptions(DescribeListUserBackupFileRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeListUserBackupFileRecord", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeListUserBackupFileRecordResponse());
    }

    public DescribeListUserBackupFileRecordResponse describeListUserBackupFileRecord(DescribeListUserBackupFileRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeListUserBackupFileRecordWithOptions(request, runtime);
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccountWithOptions(CreateDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHostAccount", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostAccountResponse());
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccount(CreateDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostAccountWithOptions(request, runtime);
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccountWithOptions(DeleteDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDedicatedHostAccount", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDedicatedHostAccountResponse());
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccount(DeleteDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostAccountWithOptions(request, runtime);
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroupWithOptions(DeleteDedicatedHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDedicatedHostGroup", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDedicatedHostGroupResponse());
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroup(DeleteDedicatedHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostGroupWithOptions(request, runtime);
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponse checkUserIfAuthoriseMyBaseSystemRoleWithOptions(CheckUserIfAuthoriseMyBaseSystemRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckUserIfAuthoriseMyBaseSystemRole", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CheckUserIfAuthoriseMyBaseSystemRoleResponse());
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponse checkUserIfAuthoriseMyBaseSystemRole(CheckUserIfAuthoriseMyBaseSystemRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUserIfAuthoriseMyBaseSystemRoleWithOptions(request, runtime);
    }

    public DescribeScheduleInstanceResponse describeScheduleInstanceWithOptions(DescribeScheduleInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScheduleInstance", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScheduleInstanceResponse());
    }

    public DescribeScheduleInstanceResponse describeScheduleInstance(DescribeScheduleInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScheduleInstanceWithOptions(request, runtime);
    }

    public ExcuteScheduleResponse excuteScheduleWithOptions(ExcuteScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExcuteSchedule", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ExcuteScheduleResponse());
    }

    public ExcuteScheduleResponse excuteSchedule(ExcuteScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.excuteScheduleWithOptions(request, runtime);
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHostWithOptions(ReplaceDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceDedicatedHost", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceDedicatedHostResponse());
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHost(ReplaceDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceDedicatedHostWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccountWithOptions(ModifyDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAccount", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAccountResponse());
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccount(ModifyDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAccountWithOptions(request, runtime);
    }

    public DescribeHostEcsLevelInfoResponse describeHostEcsLevelInfoWithOptions(DescribeHostEcsLevelInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHostEcsLevelInfo", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHostEcsLevelInfoResponse());
    }

    public DescribeHostEcsLevelInfoResponse describeHostEcsLevelInfo(DescribeHostEcsLevelInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostEcsLevelInfoWithOptions(request, runtime);
    }

    public AllocateHostInstanceCrossVpcVipResponse allocateHostInstanceCrossVpcVipWithOptions(AllocateHostInstanceCrossVpcVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateHostInstanceCrossVpcVip", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateHostInstanceCrossVpcVipResponse());
    }

    public AllocateHostInstanceCrossVpcVipResponse allocateHostInstanceCrossVpcVip(AllocateHostInstanceCrossVpcVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateHostInstanceCrossVpcVipWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHosts", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostDisksResponse describeDedicatedHostDisksWithOptions(DescribeDedicatedHostDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostDisks", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostDisksResponse());
    }

    public DescribeDedicatedHostDisksResponse describeDedicatedHostDisks(DescribeDedicatedHostDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostDisksWithOptions(request, runtime);
    }

    public DescribeMyBaseInstanceOverViewResponse describeMyBaseInstanceOverViewWithOptions(DescribeMyBaseInstanceOverViewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMyBaseInstanceOverView", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMyBaseInstanceOverViewResponse());
    }

    public DescribeMyBaseInstanceOverViewResponse describeMyBaseInstanceOverView(DescribeMyBaseInstanceOverViewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMyBaseInstanceOverViewWithOptions(request, runtime);
    }

    public ModifyScheduleMethodResponse modifyScheduleMethodWithOptions(ModifyScheduleMethodRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScheduleMethod", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScheduleMethodResponse());
    }

    public ModifyScheduleMethodResponse modifyScheduleMethod(ModifyScheduleMethodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScheduleMethodWithOptions(request, runtime);
    }

    public DescribeAvailableDedicatedHostClassesResponse describeAvailableDedicatedHostClassesWithOptions(DescribeAvailableDedicatedHostClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableDedicatedHostClasses", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableDedicatedHostClassesResponse());
    }

    public DescribeAvailableDedicatedHostClassesResponse describeAvailableDedicatedHostClasses(DescribeAvailableDedicatedHostClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableDedicatedHostClassesWithOptions(request, runtime);
    }

    public DescribeCheckUserBackupFileResponse describeCheckUserBackupFileWithOptions(DescribeCheckUserBackupFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCheckUserBackupFile", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCheckUserBackupFileResponse());
    }

    public DescribeCheckUserBackupFileResponse describeCheckUserBackupFile(DescribeCheckUserBackupFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCheckUserBackupFileWithOptions(request, runtime);
    }

    public ModifyDedicatedHostPasswordResponse modifyDedicatedHostPasswordWithOptions(ModifyDedicatedHostPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostPassword", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostPasswordResponse());
    }

    public ModifyDedicatedHostPasswordResponse modifyDedicatedHostPassword(ModifyDedicatedHostPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostPasswordWithOptions(request, runtime);
    }

    public DescribeScheduleMethodsResponse describeScheduleMethodsWithOptions(DescribeScheduleMethodsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScheduleMethods", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScheduleMethodsResponse());
    }

    public DescribeScheduleMethodsResponse describeScheduleMethods(DescribeScheduleMethodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScheduleMethodsWithOptions(request, runtime);
    }

    public ClearDedicatedHostResponse clearDedicatedHostWithOptions(ClearDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearDedicatedHost", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ClearDedicatedHostResponse());
    }

    public ClearDedicatedHostResponse clearDedicatedHost(ClearDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearDedicatedHostWithOptions(request, runtime);
    }

    public DeleteUserBackupFileRecordResponse deleteUserBackupFileRecordWithOptions(DeleteUserBackupFileRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserBackupFileRecord", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserBackupFileRecordResponse());
    }

    public DeleteUserBackupFileRecordResponse deleteUserBackupFileRecord(DeleteUserBackupFileRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserBackupFileRecordWithOptions(request, runtime);
    }

    public DescribeEvaluateDedicatedHostsResponse describeEvaluateDedicatedHostsWithOptions(DescribeEvaluateDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEvaluateDedicatedHosts", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEvaluateDedicatedHostsResponse());
    }

    public DescribeEvaluateDedicatedHostsResponse describeEvaluateDedicatedHosts(DescribeEvaluateDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEvaluateDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeHostInstanceMonitorInfoResponse describeHostInstanceMonitorInfoWithOptions(DescribeHostInstanceMonitorInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHostInstanceMonitorInfo", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHostInstanceMonitorInfoResponse());
    }

    public DescribeHostInstanceMonitorInfoResponse describeHostInstanceMonitorInfo(DescribeHostInstanceMonitorInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostInstanceMonitorInfoWithOptions(request, runtime);
    }

    public DescribeDedicatedHostMetricResponse describeDedicatedHostMetricWithOptions(DescribeDedicatedHostMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostMetric", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostMetricResponse());
    }

    public DescribeDedicatedHostMetricResponse describeDedicatedHostMetric(DescribeDedicatedHostMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostMetricWithOptions(request, runtime);
    }

    public CreateDedicatedHostResponse createDedicatedHostWithOptions(CreateDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHost", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostResponse());
    }

    public CreateDedicatedHostResponse createDedicatedHost(CreateDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostWithOptions(request, runtime);
    }

    public DescribeDedicatedInstanceMetricResponse describeDedicatedInstanceMetricWithOptions(DescribeDedicatedInstanceMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedInstanceMetric", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedInstanceMetricResponse());
    }

    public DescribeDedicatedInstanceMetricResponse describeDedicatedInstanceMetric(DescribeDedicatedInstanceMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedInstanceMetricWithOptions(request, runtime);
    }

    public DescribeCrossVpcInstanceResponse describeCrossVpcInstanceWithOptions(DescribeCrossVpcInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrossVpcInstance", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrossVpcInstanceResponse());
    }

    public DescribeCrossVpcInstanceResponse describeCrossVpcInstance(DescribeCrossVpcInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrossVpcInstanceWithOptions(request, runtime);
    }

    public ModifyDedicatedHostClassResponse modifyDedicatedHostClassWithOptions(ModifyDedicatedHostClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostClass", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostClassResponse());
    }

    public ModifyDedicatedHostClassResponse modifyDedicatedHostClass(ModifyDedicatedHostClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostClassWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsCheckInBastionResponse describeDedicatedHostsCheckInBastionWithOptions(DescribeDedicatedHostsCheckInBastionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostsCheckInBastion", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostsCheckInBastionResponse());
    }

    public DescribeDedicatedHostsCheckInBastionResponse describeDedicatedHostsCheckInBastion(DescribeDedicatedHostsCheckInBastionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsCheckInBastionWithOptions(request, runtime);
    }

    public DropDedicatedHostUserResponse dropDedicatedHostUserWithOptions(DropDedicatedHostUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropDedicatedHostUser", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DropDedicatedHostUserResponse());
    }

    public DropDedicatedHostUserResponse dropDedicatedHostUser(DropDedicatedHostUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropDedicatedHostUserWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsInBastionResponse describeDedicatedHostsInBastionWithOptions(DescribeDedicatedHostsInBastionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostsInBastion", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostsInBastionResponse());
    }

    public DescribeDedicatedHostsInBastionResponse describeDedicatedHostsInBastion(DescribeDedicatedHostsInBastionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsInBastionWithOptions(request, runtime);
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttributeWithOptions(ModifyDedicatedHostGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostGroupAttribute", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostGroupAttributeResponse());
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttribute(ModifyDedicatedHostGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostGroupAttributeWithOptions(request, runtime);
    }

    public QueryHostInstanceConsoleInfoResponse queryHostInstanceConsoleInfoWithOptions(QueryHostInstanceConsoleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryHostInstanceConsoleInfo", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryHostInstanceConsoleInfoResponse());
    }

    public QueryHostInstanceConsoleInfoResponse queryHostInstanceConsoleInfo(QueryHostInstanceConsoleInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHostInstanceConsoleInfoWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public QueryHostBaseInfoByInstanceResponse queryHostBaseInfoByInstanceWithOptions(QueryHostBaseInfoByInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryHostBaseInfoByInstance", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryHostBaseInfoByInstanceResponse());
    }

    public QueryHostBaseInfoByInstanceResponse queryHostBaseInfoByInstance(QueryHostBaseInfoByInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHostBaseInfoByInstanceWithOptions(request, runtime);
    }

    public DescribeDedicatedInstanceDistributionResponse describeDedicatedInstanceDistributionWithOptions(DescribeDedicatedInstanceDistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedInstanceDistribution", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedInstanceDistributionResponse());
    }

    public DescribeDedicatedInstanceDistributionResponse describeDedicatedInstanceDistribution(DescribeDedicatedInstanceDistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedInstanceDistributionWithOptions(request, runtime);
    }

    public DescribeScheduleHostResponse describeScheduleHostWithOptions(DescribeScheduleHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScheduleHost", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScheduleHostResponse());
    }

    public DescribeScheduleHostResponse describeScheduleHost(DescribeScheduleHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScheduleHostWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAttribute", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroupWithOptions(CreateDedicatedHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHostGroup", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostGroupResponse());
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroup(CreateDedicatedHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostGroupWithOptions(request, runtime);
    }

    public AddHostsToBastionResponse addHostsToBastionWithOptions(AddHostsToBastionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddHostsToBastion", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new AddHostsToBastionResponse());
    }

    public AddHostsToBastionResponse addHostsToBastion(AddHostsToBastionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addHostsToBastionWithOptions(request, runtime);
    }

    public AttachHostsToBastionUserResponse attachHostsToBastionUserWithOptions(AttachHostsToBastionUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachHostsToBastionUser", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new AttachHostsToBastionUserResponse());
    }

    public AttachHostsToBastionUserResponse attachHostsToBastionUser(AttachHostsToBastionUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachHostsToBastionUserWithOptions(request, runtime);
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponse describeEvaluateDedicatedHostsForInstanceWithOptions(DescribeEvaluateDedicatedHostsForInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEvaluateDedicatedHostsForInstance", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEvaluateDedicatedHostsForInstanceResponse());
    }

    public DescribeEvaluateDedicatedHostsForInstanceResponse describeEvaluateDedicatedHostsForInstance(DescribeEvaluateDedicatedHostsForInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEvaluateDedicatedHostsForInstanceWithOptions(request, runtime);
    }

    public RestartDedicatedHostResponse restartDedicatedHostWithOptions(RestartDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDedicatedHost", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDedicatedHostResponse());
    }

    public RestartDedicatedHostResponse restartDedicatedHost(RestartDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDedicatedHostWithOptions(request, runtime);
    }

    public DescribeDedicatedHostHealthResponse describeDedicatedHostHealthWithOptions(DescribeDedicatedHostHealthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostHealth", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostHealthResponse());
    }

    public DescribeDedicatedHostHealthResponse describeDedicatedHostHealth(DescribeDedicatedHostHealthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostHealthWithOptions(request, runtime);
    }

    public DescribeHostWebShellResponse describeHostWebShellWithOptions(DescribeHostWebShellRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHostWebShell", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHostWebShellResponse());
    }

    public DescribeHostWebShellResponse describeHostWebShell(DescribeHostWebShellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostWebShellWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttributeWithOptions(DescribeDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostAttribute", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostAttributeResponse());
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttribute(DescribeDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostAttributeWithOptions(request, runtime);
    }
}
