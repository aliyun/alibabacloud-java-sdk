// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123;

import com.aliyun.tea.*;
import com.aliyun.copyright20190123.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("copyright", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BatchCheckPatentAddResponse batchCheckPatentAddWithOptions(BatchCheckPatentAddRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchCheckPatentAdd", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new BatchCheckPatentAddResponse());
    }

    public BatchCheckPatentAddResponse batchCheckPatentAdd(BatchCheckPatentAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCheckPatentAddWithOptions(request, runtime);
    }

    public BatchPatentAddResponse batchPatentAddWithOptions(BatchPatentAddRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchPatentAdd", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new BatchPatentAddResponse());
    }

    public BatchPatentAddResponse batchPatentAdd(BatchPatentAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchPatentAddWithOptions(request, runtime);
    }

    public CheckPatentSellStatusResponse checkPatentSellStatusWithOptions(CheckPatentSellStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckPatentSellStatus", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new CheckPatentSellStatusResponse());
    }

    public CheckPatentSellStatusResponse checkPatentSellStatus(CheckPatentSellStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkPatentSellStatusWithOptions(request, runtime);
    }

    public DeleteCopyrightPersonResponse deleteCopyrightPersonWithOptions(DeleteCopyrightPersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCopyrightPerson", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCopyrightPersonResponse());
    }

    public DeleteCopyrightPersonResponse deleteCopyrightPerson(DeleteCopyrightPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCopyrightPersonWithOptions(request, runtime);
    }

    public DeletePatentContactResponse deletePatentContactWithOptions(DeletePatentContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePatentContact", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePatentContactResponse());
    }

    public DeletePatentContactResponse deletePatentContact(DeletePatentContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePatentContactWithOptions(request, runtime);
    }

    public DeletePatentPlanResponse deletePatentPlanWithOptions(DeletePatentPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePatentPlan", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePatentPlanResponse());
    }

    public DeletePatentPlanResponse deletePatentPlan(DeletePatentPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePatentPlanWithOptions(request, runtime);
    }

    public DeletePatentPlanDetailResponse deletePatentPlanDetailWithOptions(DeletePatentPlanDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePatentPlanDetail", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePatentPlanDetailResponse());
    }

    public DeletePatentPlanDetailResponse deletePatentPlanDetail(DeletePatentPlanDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePatentPlanDetailWithOptions(request, runtime);
    }

    public DeleteUserSearchCompanyResponse deleteUserSearchCompanyWithOptions(DeleteUserSearchCompanyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserSearchCompany", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserSearchCompanyResponse());
    }

    public DeleteUserSearchCompanyResponse deleteUserSearchCompany(DeleteUserSearchCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserSearchCompanyWithOptions(request, runtime);
    }

    public DescribePolicyResponse describePolicyWithOptions(DescribePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePolicy", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePolicyResponse());
    }

    public DescribePolicyResponse describePolicy(DescribePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyWithOptions(request, runtime);
    }

    public DescribeUserProduceResponse describeUserProduceWithOptions(DescribeUserProduceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserProduce", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserProduceResponse());
    }

    public DescribeUserProduceResponse describeUserProduce(DescribeUserProduceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserProduceWithOptions(request, runtime);
    }

    public ExportPatentPlanDetailResponse exportPatentPlanDetailWithOptions(ExportPatentPlanDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportPatentPlanDetail", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new ExportPatentPlanDetailResponse());
    }

    public ExportPatentPlanDetailResponse exportPatentPlanDetail(ExportPatentPlanDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportPatentPlanDetailWithOptions(request, runtime);
    }

    public GetCacheCheckAddParamResponse getCacheCheckAddParamWithOptions(GetCacheCheckAddParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCacheCheckAddParam", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetCacheCheckAddParamResponse());
    }

    public GetCacheCheckAddParamResponse getCacheCheckAddParam(GetCacheCheckAddParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCacheCheckAddParamWithOptions(request, runtime);
    }

    public GetCopyrightPersonDetailResponse getCopyrightPersonDetailWithOptions(GetCopyrightPersonDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCopyrightPersonDetail", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetCopyrightPersonDetailResponse());
    }

    public GetCopyrightPersonDetailResponse getCopyrightPersonDetail(GetCopyrightPersonDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCopyrightPersonDetailWithOptions(request, runtime);
    }

    public GetCopyrightPersonListResponse getCopyrightPersonListWithOptions(GetCopyrightPersonListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCopyrightPersonList", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetCopyrightPersonListResponse());
    }

    public GetCopyrightPersonListResponse getCopyrightPersonList(GetCopyrightPersonListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCopyrightPersonListWithOptions(request, runtime);
    }

    public GetPatentFeeStatisticsInfoResponse getPatentFeeStatisticsInfoWithOptions(GetPatentFeeStatisticsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPatentFeeStatisticsInfo", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new GetPatentFeeStatisticsInfoResponse());
    }

    public GetPatentFeeStatisticsInfoResponse getPatentFeeStatisticsInfo(GetPatentFeeStatisticsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPatentFeeStatisticsInfoWithOptions(request, runtime);
    }

    public GetPatentOverviewInfoResponse getPatentOverviewInfoWithOptions(GetPatentOverviewInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPatentOverviewInfo", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new GetPatentOverviewInfoResponse());
    }

    public GetPatentOverviewInfoResponse getPatentOverviewInfo(GetPatentOverviewInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPatentOverviewInfoWithOptions(request, runtime);
    }

    public GetPatentPlanDetailListResponse getPatentPlanDetailListWithOptions(GetPatentPlanDetailListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPatentPlanDetailList", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetPatentPlanDetailListResponse());
    }

    public GetPatentPlanDetailListResponse getPatentPlanDetailList(GetPatentPlanDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPatentPlanDetailListWithOptions(request, runtime);
    }

    public GetPatentPlanInfoResponse getPatentPlanInfoWithOptions(GetPatentPlanInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPatentPlanInfo", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetPatentPlanInfoResponse());
    }

    public GetPatentPlanInfoResponse getPatentPlanInfo(GetPatentPlanInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPatentPlanInfoWithOptions(request, runtime);
    }

    public GetPatentPlanListResponse getPatentPlanListWithOptions(GetPatentPlanListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPatentPlanList", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetPatentPlanListResponse());
    }

    public GetPatentPlanListResponse getPatentPlanList(GetPatentPlanListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPatentPlanListWithOptions(request, runtime);
    }

    public GetPatentStatisticsDetailListResponse getPatentStatisticsDetailListWithOptions(GetPatentStatisticsDetailListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPatentStatisticsDetailList", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new GetPatentStatisticsDetailListResponse());
    }

    public GetPatentStatisticsDetailListResponse getPatentStatisticsDetailList(GetPatentStatisticsDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPatentStatisticsDetailListWithOptions(request, runtime);
    }

    public GetTicketsInfoResponse getTicketsInfoWithOptions(GetTicketsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTicketsInfo", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetTicketsInfoResponse());
    }

    public GetTicketsInfoResponse getTicketsInfo(GetTicketsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTicketsInfoWithOptions(request, runtime);
    }

    public GetUserPatentStatisticsStatusResponse getUserPatentStatisticsStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUserPatentStatisticsStatus", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new GetUserPatentStatisticsStatusResponse());
    }

    public GetUserPatentStatisticsStatusResponse getUserPatentStatisticsStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserPatentStatisticsStatusWithOptions(runtime);
    }

    public ListPatentContactResponse listPatentContactWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListPatentContact", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new ListPatentContactResponse());
    }

    public ListPatentContactResponse listPatentContact() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPatentContactWithOptions(runtime);
    }

    public ListPatentUserSearchCompanyResponse listPatentUserSearchCompanyWithOptions(ListPatentUserSearchCompanyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPatentUserSearchCompany", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new ListPatentUserSearchCompanyResponse());
    }

    public ListPatentUserSearchCompanyResponse listPatentUserSearchCompany(ListPatentUserSearchCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPatentUserSearchCompanyWithOptions(request, runtime);
    }

    public ListUserHistoryProducesResponse listUserHistoryProducesWithOptions(ListUserHistoryProducesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserHistoryProduces", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserHistoryProducesResponse());
    }

    public ListUserHistoryProducesResponse listUserHistoryProduces(ListUserHistoryProducesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserHistoryProducesWithOptions(request, runtime);
    }

    public ListUserProduceOperateLogsResponse listUserProduceOperateLogsWithOptions(ListUserProduceOperateLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserProduceOperateLogs", "2019-01-23", "HTTPS", "GET", "AK", "json", req, runtime), new ListUserProduceOperateLogsResponse());
    }

    public ListUserProduceOperateLogsResponse listUserProduceOperateLogs(ListUserProduceOperateLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserProduceOperateLogsWithOptions(request, runtime);
    }

    public ListUserProducesResponse listUserProducesWithOptions(ListUserProducesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserProduces", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserProducesResponse());
    }

    public ListUserProducesResponse listUserProduces(ListUserProducesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserProducesWithOptions(request, runtime);
    }

    public OpenPatentStatisticsResponse openPatentStatisticsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenPatentStatistics", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new OpenPatentStatisticsResponse());
    }

    public OpenPatentStatisticsResponse openPatentStatistics() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openPatentStatisticsWithOptions(runtime);
    }

    public OperateFeeOrderResponse operateFeeOrderWithOptions(OperateFeeOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateFeeOrder", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new OperateFeeOrderResponse());
    }

    public OperateFeeOrderResponse operateFeeOrder(OperateFeeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateFeeOrderWithOptions(request, runtime);
    }

    public OperateProduceForPartnerResponse operateProduceForPartnerWithOptions(OperateProduceForPartnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateProduceForPartner", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new OperateProduceForPartnerResponse());
    }

    public OperateProduceForPartnerResponse operateProduceForPartner(OperateProduceForPartnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateProduceForPartnerWithOptions(request, runtime);
    }

    public OperateProduceForUserResponse operateProduceForUserWithOptions(OperateProduceForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateProduceForUser", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new OperateProduceForUserResponse());
    }

    public OperateProduceForUserResponse operateProduceForUser(OperateProduceForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateProduceForUserWithOptions(request, runtime);
    }

    public SaveCopyrightPersonResponse saveCopyrightPersonWithOptions(SaveCopyrightPersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveCopyrightPerson", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new SaveCopyrightPersonResponse());
    }

    public SaveCopyrightPersonResponse saveCopyrightPerson(SaveCopyrightPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveCopyrightPersonWithOptions(request, runtime);
    }

    public SaveOrUpdatePatentPlanResponse saveOrUpdatePatentPlanWithOptions(SaveOrUpdatePatentPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveOrUpdatePatentPlan", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new SaveOrUpdatePatentPlanResponse());
    }

    public SaveOrUpdatePatentPlanResponse saveOrUpdatePatentPlan(SaveOrUpdatePatentPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveOrUpdatePatentPlanWithOptions(request, runtime);
    }

    public SaveOrUpdateUserSearchCompanyResponse saveOrUpdateUserSearchCompanyWithOptions(SaveOrUpdateUserSearchCompanyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveOrUpdateUserSearchCompany", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new SaveOrUpdateUserSearchCompanyResponse());
    }

    public SaveOrUpdateUserSearchCompanyResponse saveOrUpdateUserSearchCompany(SaveOrUpdateUserSearchCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveOrUpdateUserSearchCompanyWithOptions(request, runtime);
    }

    public SavePatentContactResponse savePatentContactWithOptions(SavePatentContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SavePatentContact", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new SavePatentContactResponse());
    }

    public SavePatentContactResponse savePatentContact(SavePatentContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.savePatentContactWithOptions(request, runtime);
    }

    public VerifyOwnerInfoResponse verifyOwnerInfoWithOptions(VerifyOwnerInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyOwnerInfo", "2019-01-23", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyOwnerInfoResponse());
    }

    public VerifyOwnerInfoResponse verifyOwnerInfo(VerifyOwnerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyOwnerInfoWithOptions(request, runtime);
    }
}
