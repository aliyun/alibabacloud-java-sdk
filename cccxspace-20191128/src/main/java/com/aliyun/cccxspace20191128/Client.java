// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128;

import com.aliyun.tea.*;
import com.aliyun.cccxspace20191128.models.*;
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
        this._endpoint = this.getEndpoint("cccxspace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public RemoveSkillGroupResponse removeSkillGroupWithOptions(RemoveSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveSkillGroup", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveSkillGroupResponse());
    }

    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    public UpGradeInstanceResponse upGradeInstanceWithOptions(UpGradeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpGradeInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpGradeInstanceResponse());
    }

    public UpGradeInstanceResponse upGradeInstance(UpGradeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upGradeInstanceWithOptions(request, runtime);
    }

    public CheckOpenXspaceResponse checkOpenXspaceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CheckOpenXspace", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CheckOpenXspaceResponse());
    }

    public CheckOpenXspaceResponse checkOpenXspace() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOpenXspaceWithOptions(runtime);
    }

    public ListXsInstancesResponse listXsInstancesWithOptions(ListXsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListXsInstances", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListXsInstancesResponse());
    }

    public ListXsInstancesResponse listXsInstances(ListXsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listXsInstancesWithOptions(request, runtime);
    }

    public ModifyXsInstanceResponse modifyXsInstanceWithOptions(ModifyXsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyXsInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyXsInstanceResponse());
    }

    public ModifyXsInstanceResponse modifyXsInstance(ModifyXsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyXsInstanceWithOptions(request, runtime);
    }

    public ResumeCommodityInstanceResponse resumeCommodityInstanceWithOptions(ResumeCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeCommodityInstanceResponse());
    }

    public ResumeCommodityInstanceResponse resumeCommodityInstance(ResumeCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeCommodityInstanceWithOptions(request, runtime);
    }

    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceList", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceListResponse());
    }

    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    public QueryCommodityInstanceListResponse queryCommodityInstanceListWithOptions(QueryCommodityInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCommodityInstanceList", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCommodityInstanceListResponse());
    }

    public QueryCommodityInstanceListResponse queryCommodityInstanceList(QueryCommodityInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCommodityInstanceListWithOptions(request, runtime);
    }

    public GetInstanceListSaleResponse getInstanceListSaleWithOptions(GetInstanceListSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceListSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceListSaleResponse());
    }

    public GetInstanceListSaleResponse getInstanceListSale(GetInstanceListSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListSaleWithOptions(request, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    public GetAliyunInstanceRouteSaleResponse getAliyunInstanceRouteSaleWithOptions(GetAliyunInstanceRouteSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAliyunInstanceRouteSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetAliyunInstanceRouteSaleResponse());
    }

    public GetAliyunInstanceRouteSaleResponse getAliyunInstanceRouteSale(GetAliyunInstanceRouteSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunInstanceRouteSaleWithOptions(request, runtime);
    }

    public RenewAliyunCommodityInstanceResponse renewAliyunCommodityInstanceWithOptions(RenewAliyunCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewAliyunCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new RenewAliyunCommodityInstanceResponse());
    }

    public RenewAliyunCommodityInstanceResponse renewAliyunCommodityInstance(RenewAliyunCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewAliyunCommodityInstanceWithOptions(request, runtime);
    }

    public DescribeXsInstanceResponse describeXsInstanceWithOptions(DescribeXsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeXsInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeXsInstanceResponse());
    }

    public DescribeXsInstanceResponse describeXsInstance(DescribeXsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeXsInstanceWithOptions(request, runtime);
    }

    public AddAccountAsInstanceResponse addAccountAsInstanceWithOptions(AddAccountAsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAccountAsInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddAccountAsInstanceResponse());
    }

    public AddAccountAsInstanceResponse addAccountAsInstance(AddAccountAsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAccountAsInstanceWithOptions(request, runtime);
    }

    public AddUserResponse addUserWithOptions(AddUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUser", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserResponse());
    }

    public AddUserResponse addUser(AddUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserWithOptions(request, runtime);
    }

    public ChangeGradeAliyunInstanceSaleResponse changeGradeAliyunInstanceSaleWithOptions(ChangeGradeAliyunInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeGradeAliyunInstanceSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeGradeAliyunInstanceSaleResponse());
    }

    public ChangeGradeAliyunInstanceSaleResponse changeGradeAliyunInstanceSale(ChangeGradeAliyunInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeGradeAliyunInstanceSaleWithOptions(request, runtime);
    }

    public CreateAliyunInstanceNewResponse createAliyunInstanceNewWithOptions(CreateAliyunInstanceNewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAliyunInstanceNew", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAliyunInstanceNewResponse());
    }

    public CreateAliyunInstanceNewResponse createAliyunInstanceNew(CreateAliyunInstanceNewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliyunInstanceNewWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceResponse());
    }

    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    public ReleaseAliyunCommodityInstanceSaleResponse releaseAliyunCommodityInstanceSaleWithOptions(ReleaseAliyunCommodityInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseAliyunCommodityInstanceSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseAliyunCommodityInstanceSaleResponse());
    }

    public ReleaseAliyunCommodityInstanceSaleResponse releaseAliyunCommodityInstanceSale(ReleaseAliyunCommodityInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseAliyunCommodityInstanceSaleWithOptions(request, runtime);
    }

    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUser", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserResponse());
    }

    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    public UpdateSkillGroupResponse updateSkillGroupWithOptions(UpdateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSkillGroup", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSkillGroupResponse());
    }

    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }

    public DescribeInstanceSaleResponse describeInstanceSaleWithOptions(DescribeInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSaleResponse());
    }

    public DescribeInstanceSaleResponse describeInstanceSale(DescribeInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSaleWithOptions(request, runtime);
    }

    public CheckOpenSaleResponse checkOpenSaleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CheckOpenSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CheckOpenSaleResponse());
    }

    public CheckOpenSaleResponse checkOpenSale() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOpenSaleWithOptions(runtime);
    }

    public DisplayInstanceUserResponse displayInstanceUserWithOptions(DisplayInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisplayInstanceUser", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisplayInstanceUserResponse());
    }

    public DisplayInstanceUserResponse displayInstanceUser(DisplayInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.displayInstanceUserWithOptions(request, runtime);
    }

    public RenewAliyunCommodityInstanceSaleResponse renewAliyunCommodityInstanceSaleWithOptions(RenewAliyunCommodityInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewAliyunCommodityInstanceSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new RenewAliyunCommodityInstanceSaleResponse());
    }

    public RenewAliyunCommodityInstanceSaleResponse renewAliyunCommodityInstanceSale(RenewAliyunCommodityInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewAliyunCommodityInstanceSaleWithOptions(request, runtime);
    }

    public QuerySkillGroupsResponse querySkillGroupsWithOptions(QuerySkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySkillGroups", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySkillGroupsResponse());
    }

    public QuerySkillGroupsResponse querySkillGroups(QuerySkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySkillGroupsWithOptions(request, runtime);
    }

    public ReleaseCommodityInstanceResponse releaseCommodityInstanceWithOptions(ReleaseCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseCommodityInstanceResponse());
    }

    public ReleaseCommodityInstanceResponse releaseCommodityInstance(ReleaseCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseCommodityInstanceWithOptions(request, runtime);
    }

    public GetInstanceSaleResponse getInstanceSaleWithOptions(GetInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceSaleResponse());
    }

    public GetInstanceSaleResponse getInstanceSale(GetInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceSaleWithOptions(request, runtime);
    }

    public DeleteXsInstanceResponse deleteXsInstanceWithOptions(DeleteXsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteXsInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteXsInstanceResponse());
    }

    public DeleteXsInstanceResponse deleteXsInstance(DeleteXsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteXsInstanceWithOptions(request, runtime);
    }

    public CheckOpenResponse checkOpenWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CheckOpen", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CheckOpenResponse());
    }

    public CheckOpenResponse checkOpen() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOpenWithOptions(runtime);
    }

    public AddInstanceUserSaleResponse addInstanceUserSaleWithOptions(AddInstanceUserSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddInstanceUserSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddInstanceUserSaleResponse());
    }

    public AddInstanceUserSaleResponse addInstanceUserSale(AddInstanceUserSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInstanceUserSaleWithOptions(request, runtime);
    }

    public PhysicalDeleteInstanceResponse physicalDeleteInstanceWithOptions(PhysicalDeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PhysicalDeleteInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new PhysicalDeleteInstanceResponse());
    }

    public PhysicalDeleteInstanceResponse physicalDeleteInstance(PhysicalDeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.physicalDeleteInstanceWithOptions(request, runtime);
    }

    public CreateSubTicketResponse createSubTicketWithOptions(CreateSubTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubTicket", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubTicketResponse());
    }

    public CreateSubTicketResponse createSubTicket(CreateSubTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubTicketWithOptions(request, runtime);
    }

    public DisplayInstanceUserSaleResponse displayInstanceUserSaleWithOptions(DisplayInstanceUserSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisplayInstanceUserSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisplayInstanceUserSaleResponse());
    }

    public DisplayInstanceUserSaleResponse displayInstanceUserSale(DisplayInstanceUserSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.displayInstanceUserSaleWithOptions(request, runtime);
    }

    public UpdateInstanceSaleResponse updateInstanceSaleWithOptions(UpdateInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceSaleResponse());
    }

    public UpdateInstanceSaleResponse updateInstanceSale(UpdateInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceSaleWithOptions(request, runtime);
    }

    public RenewInstanceCommodityInstanceResponse renewInstanceCommodityInstanceWithOptions(RenewInstanceCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstanceCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceCommodityInstanceResponse());
    }

    public RenewInstanceCommodityInstanceResponse renewInstanceCommodityInstance(RenewInstanceCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceCommodityInstanceWithOptions(request, runtime);
    }

    public GetUsersResponse getUsersWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUsers", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetUsersResponse());
    }

    public GetUsersResponse getUsers() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUsersWithOptions(runtime);
    }

    public UpdateInstanceUserResponse updateInstanceUserWithOptions(UpdateInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceUser", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceUserResponse());
    }

    public UpdateInstanceUserResponse updateInstanceUser(UpdateInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceUserWithOptions(request, runtime);
    }

    public CreateAliyunInstanceNewSaleResponse createAliyunInstanceNewSaleWithOptions(CreateAliyunInstanceNewSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAliyunInstanceNewSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAliyunInstanceNewSaleResponse());
    }

    public CreateAliyunInstanceNewSaleResponse createAliyunInstanceNewSale(CreateAliyunInstanceNewSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliyunInstanceNewSaleWithOptions(request, runtime);
    }

    public ChangeGradeAliyunInstanceResponse changeGradeAliyunInstanceWithOptions(ChangeGradeAliyunInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeGradeAliyunInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeGradeAliyunInstanceResponse());
    }

    public ChangeGradeAliyunInstanceResponse changeGradeAliyunInstance(ChangeGradeAliyunInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeGradeAliyunInstanceWithOptions(request, runtime);
    }

    public GetByForeignIdResponse getByForeignIdWithOptions(GetByForeignIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetByForeignId", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetByForeignIdResponse());
    }

    public GetByForeignIdResponse getByForeignId(GetByForeignIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getByForeignIdWithOptions(request, runtime);
    }

    public ReleaseAliyunCommodityInstanceResponse releaseAliyunCommodityInstanceWithOptions(ReleaseAliyunCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseAliyunCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseAliyunCommodityInstanceResponse());
    }

    public ReleaseAliyunCommodityInstanceResponse releaseAliyunCommodityInstance(ReleaseAliyunCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseAliyunCommodityInstanceWithOptions(request, runtime);
    }

    public DoLogicalDeleteInstanceResponse doLogicalDeleteInstanceWithOptions(DoLogicalDeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoLogicalDeleteInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new DoLogicalDeleteInstanceResponse());
    }

    public DoLogicalDeleteInstanceResponse doLogicalDeleteInstance(DoLogicalDeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doLogicalDeleteInstanceWithOptions(request, runtime);
    }

    public AddInstanceUserResponse addInstanceUserWithOptions(AddInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddInstanceUser", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddInstanceUserResponse());
    }

    public AddInstanceUserResponse addInstanceUser(AddInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInstanceUserWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSkillGroup", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public CreateXspaceCommodityInstanceResponse createXspaceCommodityInstanceWithOptions(CreateXspaceCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateXspaceCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateXspaceCommodityInstanceResponse());
    }

    public CreateXspaceCommodityInstanceResponse createXspaceCommodityInstance(CreateXspaceCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createXspaceCommodityInstanceWithOptions(request, runtime);
    }

    public UpdateInstanceUserSaleResponse updateInstanceUserSaleWithOptions(UpdateInstanceUserSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceUserSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceUserSaleResponse());
    }

    public UpdateInstanceUserSaleResponse updateInstanceUserSale(UpdateInstanceUserSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceUserSaleWithOptions(request, runtime);
    }

    public CheckAliyunInstanceStatusSaleResponse checkAliyunInstanceStatusSaleWithOptions(CheckAliyunInstanceStatusSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckAliyunInstanceStatusSale", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new CheckAliyunInstanceStatusSaleResponse());
    }

    public CheckAliyunInstanceStatusSaleResponse checkAliyunInstanceStatusSale(CheckAliyunInstanceStatusSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAliyunInstanceStatusSaleWithOptions(request, runtime);
    }

    public SuspendCommodityInstanceResponse suspendCommodityInstanceWithOptions(SuspendCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendCommodityInstance", "2019-11-28", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendCommodityInstanceResponse());
    }

    public SuspendCommodityInstanceResponse suspendCommodityInstance(SuspendCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendCommodityInstanceWithOptions(request, runtime);
    }
}
