// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401;

import com.aliyun.tea.*;
import com.aliyun.dt_oc_info20200401.models.*;
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
        this._endpoint = this.getEndpoint("dt-oc-info", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetBeneficialInfoResponse getBeneficialInfoWithOptions(GetBeneficialInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.oneCompanyId)) {
            query.put("OneCompanyId", request.oneCompanyId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBeneficialInfo"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBeneficialInfoResponse());
    }

    public GetBeneficialInfoResponse getBeneficialInfo(GetBeneficialInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBeneficialInfoWithOptions(request, runtime);
    }

    public GetBiddingResponse getBiddingWithOptions(GetBiddingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBidding"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBiddingResponse());
    }

    public GetBiddingResponse getBidding(GetBiddingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBiddingWithOptions(request, runtime);
    }

    public GetBranchesThreeResponse getBranchesThreeWithOptions(GetBranchesThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBranchesThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBranchesThreeResponse());
    }

    public GetBranchesThreeResponse getBranchesThree(GetBranchesThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBranchesThreeWithOptions(request, runtime);
    }

    public GetCheckupResponse getCheckupWithOptions(GetCheckupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCheckup"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCheckupResponse());
    }

    public GetCheckupResponse getCheckup(GetCheckupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCheckupWithOptions(request, runtime);
    }

    public GetClearAccountResponse getClearAccountWithOptions(GetClearAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClearAccount"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClearAccountResponse());
    }

    public GetClearAccountResponse getClearAccount(GetClearAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClearAccountWithOptions(request, runtime);
    }

    public GetClearAccountThreeResponse getClearAccountThreeWithOptions(GetClearAccountThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClearAccountThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClearAccountThreeResponse());
    }

    public GetClearAccountThreeResponse getClearAccountThree(GetClearAccountThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClearAccountThreeWithOptions(request, runtime);
    }

    public GetCompanyChangeThreeResponse getCompanyChangeThreeWithOptions(GetCompanyChangeThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyChangeThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyChangeThreeResponse());
    }

    public GetCompanyChangeThreeResponse getCompanyChangeThree(GetCompanyChangeThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyChangeThreeWithOptions(request, runtime);
    }

    public GetCompanyCourtAnnouncementThreeResponse getCompanyCourtAnnouncementThreeWithOptions(GetCompanyCourtAnnouncementThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyCourtAnnouncementThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyCourtAnnouncementThreeResponse());
    }

    public GetCompanyCourtAnnouncementThreeResponse getCompanyCourtAnnouncementThree(GetCompanyCourtAnnouncementThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyCourtAnnouncementThreeWithOptions(request, runtime);
    }

    public GetCompanyEmployeesThreeResponse getCompanyEmployeesThreeWithOptions(GetCompanyEmployeesThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyEmployeesThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyEmployeesThreeResponse());
    }

    public GetCompanyEmployeesThreeResponse getCompanyEmployeesThree(GetCompanyEmployeesThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyEmployeesThreeWithOptions(request, runtime);
    }

    public GetCompanyEquityPledgeResponse getCompanyEquityPledgeWithOptions(GetCompanyEquityPledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyEquityPledge"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyEquityPledgeResponse());
    }

    public GetCompanyEquityPledgeResponse getCompanyEquityPledge(GetCompanyEquityPledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyEquityPledgeWithOptions(request, runtime);
    }

    public GetCompanyInvestmentResponse getCompanyInvestmentWithOptions(GetCompanyInvestmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyInvestment"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyInvestmentResponse());
    }

    public GetCompanyInvestmentResponse getCompanyInvestment(GetCompanyInvestmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyInvestmentWithOptions(request, runtime);
    }

    public GetCompanyJudgmentDocumentResponse getCompanyJudgmentDocumentWithOptions(GetCompanyJudgmentDocumentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countSqlId)) {
            query.put("CountSqlId", request.countSqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyJudgmentDocument"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyJudgmentDocumentResponse());
    }

    public GetCompanyJudgmentDocumentResponse getCompanyJudgmentDocument(GetCompanyJudgmentDocumentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyJudgmentDocumentWithOptions(request, runtime);
    }

    public GetCompanyJudgmentDocumentThreeResponse getCompanyJudgmentDocumentThreeWithOptions(GetCompanyJudgmentDocumentThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyJudgmentDocumentThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyJudgmentDocumentThreeResponse());
    }

    public GetCompanyJudgmentDocumentThreeResponse getCompanyJudgmentDocumentThree(GetCompanyJudgmentDocumentThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyJudgmentDocumentThreeWithOptions(request, runtime);
    }

    public GetCompanyLegalCaseThreeResponse getCompanyLegalCaseThreeWithOptions(GetCompanyLegalCaseThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyLegalCaseThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyLegalCaseThreeResponse());
    }

    public GetCompanyLegalCaseThreeResponse getCompanyLegalCaseThree(GetCompanyLegalCaseThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyLegalCaseThreeWithOptions(request, runtime);
    }

    public GetCompanyLegalExecutedPersonThreeResponse getCompanyLegalExecutedPersonThreeWithOptions(GetCompanyLegalExecutedPersonThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyLegalExecutedPersonThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyLegalExecutedPersonThreeResponse());
    }

    public GetCompanyLegalExecutedPersonThreeResponse getCompanyLegalExecutedPersonThree(GetCompanyLegalExecutedPersonThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyLegalExecutedPersonThreeWithOptions(request, runtime);
    }

    public GetCompanyLegalExecutionsThreeResponse getCompanyLegalExecutionsThreeWithOptions(GetCompanyLegalExecutionsThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyLegalExecutionsThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyLegalExecutionsThreeResponse());
    }

    public GetCompanyLegalExecutionsThreeResponse getCompanyLegalExecutionsThree(GetCompanyLegalExecutionsThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyLegalExecutionsThreeWithOptions(request, runtime);
    }

    public GetCompanyPartnersListResponse getCompanyPartnersListWithOptions(GetCompanyPartnersListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyPartnersList"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyPartnersListResponse());
    }

    public GetCompanyPartnersListResponse getCompanyPartnersList(GetCompanyPartnersListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyPartnersListWithOptions(request, runtime);
    }

    public GetCompanyPartnersListThreeResponse getCompanyPartnersListThreeWithOptions(GetCompanyPartnersListThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyPartnersListThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyPartnersListThreeResponse());
    }

    public GetCompanyPartnersListThreeResponse getCompanyPartnersListThree(GetCompanyPartnersListThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyPartnersListThreeWithOptions(request, runtime);
    }

    public GetCompanyProfileResponse getCompanyProfileWithOptions(GetCompanyProfileRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCompanyProfileShrinkRequest request = new GetCompanyProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyIdKeyParam)) {
            request.companyIdKeyParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyIdKeyParam, "CompanyIdKeyParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyIdKeyParamShrink)) {
            query.put("CompanyIdKeyParam", request.companyIdKeyParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyProfile"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyProfileResponse());
    }

    public GetCompanyProfileResponse getCompanyProfile(GetCompanyProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyProfileWithOptions(request, runtime);
    }

    public GetCompanyProfileCallbackResponse getCompanyProfileCallbackWithOptions(GetCompanyProfileCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyGroupId)) {
            body.put("CompanyGroupId", request.companyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyQueryUrl)) {
            body.put("CompanyQueryUrl", request.companyQueryUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureCallbackUrl)) {
            body.put("FeatureCallbackUrl", request.featureCallbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileCallbackUrl)) {
            body.put("ProfileCallbackUrl", request.profileCallbackUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyProfileCallback"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyProfileCallbackResponse());
    }

    public GetCompanyProfileCallbackResponse getCompanyProfileCallback(GetCompanyProfileCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyProfileCallbackWithOptions(request, runtime);
    }

    public GetCompanyProfileThreeResponse getCompanyProfileThreeWithOptions(GetCompanyProfileThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompanyProfileThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyProfileThreeResponse());
    }

    public GetCompanyProfileThreeResponse getCompanyProfileThree(GetCompanyProfileThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompanyProfileThreeWithOptions(request, runtime);
    }

    public GetCompetitorInfoResponse getCompetitorInfoWithOptions(GetCompetitorInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompetitorInfo"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompetitorInfoResponse());
    }

    public GetCompetitorInfoResponse getCompetitorInfo(GetCompetitorInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompetitorInfoWithOptions(request, runtime);
    }

    public GetContactResponse getContactWithOptions(GetContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContact"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContactResponse());
    }

    public GetContactResponse getContact(GetContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getContactWithOptions(request, runtime);
    }

    public GetCopyrightResponse getCopyrightWithOptions(GetCopyrightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopyright"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopyrightResponse());
    }

    public GetCopyrightResponse getCopyright(GetCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCopyrightWithOptions(request, runtime);
    }

    public GetCoreTeamResponse getCoreTeamWithOptions(GetCoreTeamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCoreTeam"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCoreTeamResponse());
    }

    public GetCoreTeamResponse getCoreTeam(GetCoreTeamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCoreTeamWithOptions(request, runtime);
    }

    public GetCorpFinanceResponse getCorpFinanceWithOptions(GetCorpFinanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCorpFinance"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCorpFinanceResponse());
    }

    public GetCorpFinanceResponse getCorpFinance(GetCorpFinanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCorpFinanceWithOptions(request, runtime);
    }

    public GetCorpNodeInfoResponse getCorpNodeInfoWithOptions(GetCorpNodeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.oneCompanyId)) {
            query.put("OneCompanyId", request.oneCompanyId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCorpNodeInfo"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCorpNodeInfoResponse());
    }

    public GetCorpNodeInfoResponse getCorpNodeInfo(GetCorpNodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCorpNodeInfoWithOptions(request, runtime);
    }

    public GetCorpProductResponse getCorpProductWithOptions(GetCorpProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCorpProduct"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCorpProductResponse());
    }

    public GetCorpProductResponse getCorpProduct(GetCorpProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCorpProductWithOptions(request, runtime);
    }

    public GetCorpThreeKeysVerificationResponse getCorpThreeKeysVerificationWithOptions(GetCorpThreeKeysVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNo)) {
            query.put("RegisterNo", request.registerNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCorpThreeKeysVerification"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCorpThreeKeysVerificationResponse());
    }

    public GetCorpThreeKeysVerificationResponse getCorpThreeKeysVerification(GetCorpThreeKeysVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCorpThreeKeysVerificationWithOptions(request, runtime);
    }

    public GetCustCreditImportExportResponse getCustCreditImportExportWithOptions(GetCustCreditImportExportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustCreditImportExport"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustCreditImportExportResponse());
    }

    public GetCustCreditImportExportResponse getCustCreditImportExport(GetCustCreditImportExportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustCreditImportExportWithOptions(request, runtime);
    }

    public GetCustomPunishThreeResponse getCustomPunishThreeWithOptions(GetCustomPunishThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomPunishThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomPunishThreeResponse());
    }

    public GetCustomPunishThreeResponse getCustomPunishThree(GetCustomPunishThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomPunishThreeWithOptions(request, runtime);
    }

    public GetCustomsCreditResponse getCustomsCreditWithOptions(GetCustomsCreditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomsCredit"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomsCreditResponse());
    }

    public GetCustomsCreditResponse getCustomsCredit(GetCustomsCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomsCreditWithOptions(request, runtime);
    }

    public GetDomianResponse getDomianWithOptions(GetDomianRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomian"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomianResponse());
    }

    public GetDomianResponse getDomian(GetDomianRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomianWithOptions(request, runtime);
    }

    public GetDoubleCheckupResponse getDoubleCheckupWithOptions(GetDoubleCheckupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoubleCheckup"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoubleCheckupResponse());
    }

    public GetDoubleCheckupResponse getDoubleCheckup(GetDoubleCheckupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDoubleCheckupWithOptions(request, runtime);
    }

    public GetFoodDrugAdministrationThreeResponse getFoodDrugAdministrationThreeWithOptions(GetFoodDrugAdministrationThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFoodDrugAdministrationThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFoodDrugAdministrationThreeResponse());
    }

    public GetFoodDrugAdministrationThreeResponse getFoodDrugAdministrationThree(GetFoodDrugAdministrationThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFoodDrugAdministrationThreeWithOptions(request, runtime);
    }

    public GetGeneralTaxpayerResponse getGeneralTaxpayerWithOptions(GetGeneralTaxpayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGeneralTaxpayer"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGeneralTaxpayerResponse());
    }

    public GetGeneralTaxpayerResponse getGeneralTaxpayer(GetGeneralTaxpayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGeneralTaxpayerWithOptions(request, runtime);
    }

    public GetJudicialFreezesResponse getJudicialFreezesWithOptions(GetJudicialFreezesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJudicialFreezes"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJudicialFreezesResponse());
    }

    public GetJudicialFreezesResponse getJudicialFreezes(GetJudicialFreezesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJudicialFreezesWithOptions(request, runtime);
    }

    public GetJudicialReviewFreezingThreeResponse getJudicialReviewFreezingThreeWithOptions(GetJudicialReviewFreezingThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJudicialReviewFreezingThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJudicialReviewFreezingThreeResponse());
    }

    public GetJudicialReviewFreezingThreeResponse getJudicialReviewFreezingThree(GetJudicialReviewFreezingThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJudicialReviewFreezingThreeWithOptions(request, runtime);
    }

    public GetKnowledgePropertiesPledgeResponse getKnowledgePropertiesPledgeWithOptions(GetKnowledgePropertiesPledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledgePropertiesPledge"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgePropertiesPledgeResponse());
    }

    public GetKnowledgePropertiesPledgeResponse getKnowledgePropertiesPledge(GetKnowledgePropertiesPledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getKnowledgePropertiesPledgeWithOptions(request, runtime);
    }

    public GetLcenseInfomationResponse getLcenseInfomationWithOptions(GetLcenseInfomationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLcenseInfomation"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLcenseInfomationResponse());
    }

    public GetLcenseInfomationResponse getLcenseInfomation(GetLcenseInfomationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLcenseInfomationWithOptions(request, runtime);
    }

    public GetLegalAuctionResponse getLegalAuctionWithOptions(GetLegalAuctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLegalAuction"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLegalAuctionResponse());
    }

    public GetLegalAuctionResponse getLegalAuction(GetLegalAuctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLegalAuctionWithOptions(request, runtime);
    }

    public GetLegalNoticesThreeResponse getLegalNoticesThreeWithOptions(GetLegalNoticesThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLegalNoticesThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLegalNoticesThreeResponse());
    }

    public GetLegalNoticesThreeResponse getLegalNoticesThree(GetLegalNoticesThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLegalNoticesThreeWithOptions(request, runtime);
    }

    public GetNearbyCompanyResponse getNearbyCompanyWithOptions(GetNearbyCompanyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpKey)) {
            query.put("CorpKey", request.corpKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distance)) {
            query.put("Distance", request.distance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lat)) {
            query.put("Lat", request.lat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lon)) {
            query.put("Lon", request.lon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNearbyCompany"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNearbyCompanyResponse());
    }

    public GetNearbyCompanyResponse getNearbyCompany(GetNearbyCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNearbyCompanyWithOptions(request, runtime);
    }

    public GetOperateAbnormalResponse getOperateAbnormalWithOptions(GetOperateAbnormalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperateAbnormal"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperateAbnormalResponse());
    }

    public GetOperateAbnormalResponse getOperateAbnormal(GetOperateAbnormalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOperateAbnormalWithOptions(request, runtime);
    }

    public GetOverdueTaxsThreeResponse getOverdueTaxsThreeWithOptions(GetOverdueTaxsThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOverdueTaxsThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOverdueTaxsThreeResponse());
    }

    public GetOverdueTaxsThreeResponse getOverdueTaxsThree(GetOverdueTaxsThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOverdueTaxsThreeWithOptions(request, runtime);
    }

    public GetPurchaseLandInformationResponse getPurchaseLandInformationWithOptions(GetPurchaseLandInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPurchaseLandInformation"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPurchaseLandInformationResponse());
    }

    public GetPurchaseLandInformationResponse getPurchaseLandInformation(GetPurchaseLandInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPurchaseLandInformationWithOptions(request, runtime);
    }

    public GetQualificationCertificateResponse getQualificationCertificateWithOptions(GetQualificationCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualificationCertificate"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualificationCertificateResponse());
    }

    public GetQualificationCertificateResponse getQualificationCertificate(GetQualificationCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualificationCertificateWithOptions(request, runtime);
    }

    public GetQualityPunishmentThreeResponse getQualityPunishmentThreeWithOptions(GetQualityPunishmentThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityPunishmentThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityPunishmentThreeResponse());
    }

    public GetQualityPunishmentThreeResponse getQualityPunishmentThree(GetQualityPunishmentThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityPunishmentThreeWithOptions(request, runtime);
    }

    public GetRecruitInfoResponse getRecruitInfoWithOptions(GetRecruitInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecruitInfo"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecruitInfoResponse());
    }

    public GetRecruitInfoResponse getRecruitInfo(GetRecruitInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRecruitInfoWithOptions(request, runtime);
    }

    public GetRskMortgageResponse getRskMortgageWithOptions(GetRskMortgageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRskMortgage"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRskMortgageResponse());
    }

    public GetRskMortgageResponse getRskMortgage(GetRskMortgageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRskMortgageWithOptions(request, runtime);
    }

    public GetSatpartyPunishThreeResponse getSatpartyPunishThreeWithOptions(GetSatpartyPunishThreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSatpartyPunishThree"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSatpartyPunishThreeResponse());
    }

    public GetSatpartyPunishThreeResponse getSatpartyPunishThree(GetSatpartyPunishThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSatpartyPunishThreeWithOptions(request, runtime);
    }

    public GetSearchConditionResponse getSearchConditionWithOptions(GetSearchConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionType)) {
            body.put("ConditionType", request.conditionType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSearchCondition"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSearchConditionResponse());
    }

    public GetSearchConditionResponse getSearchCondition(GetSearchConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSearchConditionWithOptions(request, runtime);
    }

    public GetSeriousIllegalResponse getSeriousIllegalWithOptions(GetSeriousIllegalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSeriousIllegal"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSeriousIllegalResponse());
    }

    public GetSeriousIllegalResponse getSeriousIllegal(GetSeriousIllegalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSeriousIllegalWithOptions(request, runtime);
    }

    public GetSimpleCancelResponse getSimpleCancelWithOptions(GetSimpleCancelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSimpleCancel"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSimpleCancelResponse());
    }

    public GetSimpleCancelResponse getSimpleCancel(GetSimpleCancelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSimpleCancelWithOptions(request, runtime);
    }

    public GetSoftCopyrightResponse getSoftCopyrightWithOptions(GetSoftCopyrightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSoftCopyright"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSoftCopyrightResponse());
    }

    public GetSoftCopyrightResponse getSoftCopyright(GetSoftCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSoftCopyrightWithOptions(request, runtime);
    }

    public GetStockListResponse getStockListWithOptions(GetStockListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStockList"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStockListResponse());
    }

    public GetStockListResponse getStockList(GetStockListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStockListWithOptions(request, runtime);
    }

    public GetTaxLevelResponse getTaxLevelWithOptions(GetTaxLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaxLevel"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaxLevelResponse());
    }

    public GetTaxLevelResponse getTaxLevel(GetTaxLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaxLevelWithOptions(request, runtime);
    }

    public GetTerminationCaseResponse getTerminationCaseWithOptions(GetTerminationCaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTerminationCase"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTerminationCaseResponse());
    }

    public GetTerminationCaseResponse getTerminationCase(GetTerminationCaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTerminationCaseWithOptions(request, runtime);
    }

    public GetTrademarkResponse getTrademarkWithOptions(GetTrademarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldList)) {
            query.put("FetchFieldList", request.fetchFieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrademark"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrademarkResponse());
    }

    public GetTrademarkResponse getTrademark(GetTrademarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrademarkWithOptions(request, runtime);
    }

    public GetTwoCorpsRelationshipResponse getTwoCorpsRelationshipWithOptions(GetTwoCorpsRelationshipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endCropName)) {
            query.put("EndCropName", request.endCropName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromCorpName)) {
            query.put("FromCorpName", request.fromCorpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPath)) {
            query.put("MaxPath", request.maxPath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTwoCorpsRelationship"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTwoCorpsRelationshipResponse());
    }

    public GetTwoCorpsRelationshipResponse getTwoCorpsRelationship(GetTwoCorpsRelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTwoCorpsRelationshipWithOptions(request, runtime);
    }

    public ListCompaniesResponse listCompaniesWithOptions(ListCompaniesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCompaniesShrinkRequest request = new ListCompaniesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizCategories)) {
            request.bizCategoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizCategories, "BizCategories", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizInfo)) {
            request.bizInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizInfo, "BizInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizScopeKeyword)) {
            request.bizScopeKeywordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizScopeKeyword, "BizScopeKeyword", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizStatus)) {
            request.bizStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizStatus, "BizStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizType)) {
            request.bizTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizType, "BizType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.brandInfo)) {
            request.brandInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.brandInfo, "BrandInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.buildTime)) {
            request.buildTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.buildTime, "BuildTime", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyType)) {
            request.companyTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyType, "CompanyType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lifecycle)) {
            request.lifecycleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lifecycle, "Lifecycle", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderBy)) {
            request.orderByShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderBy, "OrderBy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regions)) {
            request.regionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regions, "Regions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.registerAssert)) {
            request.registerAssertShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.registerAssert, "RegisterAssert", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.spreadInfo)) {
            request.spreadInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.spreadInfo, "SpreadInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.staffSize)) {
            request.staffSizeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.staffSize, "StaffSize", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            query.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNumber)) {
            query.put("LicenseNumber", request.licenseNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgNo)) {
            query.put("OrgNo", request.orgNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productShopMatch)) {
            query.put("ProductShopMatch", request.productShopMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recCap)) {
            query.put("RecCap", request.recCap);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCategoriesShrink)) {
            body.put("BizCategories", request.bizCategoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizInfoShrink)) {
            body.put("BizInfo", request.bizInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScopeKeywordShrink)) {
            body.put("BizScopeKeyword", request.bizScopeKeywordShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizStatusShrink)) {
            body.put("BizStatus", request.bizStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypeShrink)) {
            body.put("BizType", request.bizTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandInfoShrink)) {
            body.put("BrandInfo", request.brandInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildTimeShrink)) {
            body.put("BuildTime", request.buildTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyTypeShrink)) {
            body.put("CompanyType", request.companyTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleShrink)) {
            body.put("Lifecycle", request.lifecycleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newCorp)) {
            body.put("NewCorp", request.newCorp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByShrink)) {
            body.put("OrderBy", request.orderByShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionsShrink)) {
            body.put("Regions", request.regionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerAssertShrink)) {
            body.put("RegisterAssert", request.registerAssertShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spreadInfoShrink)) {
            body.put("SpreadInfo", request.spreadInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffSizeShrink)) {
            body.put("StaffSize", request.staffSizeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCompanies"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCompaniesResponse());
    }

    public ListCompaniesResponse listCompanies(ListCompaniesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCompaniesWithOptions(request, runtime);
    }

    public QueryCompanyResponse queryCompanyWithOptions(QueryCompanyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCompanyShrinkRequest request = new QueryCompanyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizCategory)) {
            request.bizCategoryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizCategory, "BizCategory", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizScope)) {
            request.bizScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizScope, "BizScope", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizStatus)) {
            request.bizStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizStatus, "BizStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizType)) {
            request.bizTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizType, "BizType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.brandInfo)) {
            request.brandInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.brandInfo, "BrandInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.buildTime)) {
            request.buildTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.buildTime, "BuildTime", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyNames)) {
            request.companyNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyNames, "CompanyNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyType)) {
            request.companyTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyType, "CompanyType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataModuleIds)) {
            request.dataModuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataModuleIds, "DataModuleIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fetchFieldList)) {
            request.fetchFieldListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fetchFieldList, "FetchFieldList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lbsParam)) {
            request.lbsParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lbsParam, "LbsParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lifecycle)) {
            request.lifecycleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lifecycle, "Lifecycle", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listedStatus)) {
            request.listedStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listedStatus, "ListedStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.powerTag)) {
            request.powerTagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.powerTag, "PowerTag", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regions)) {
            request.regionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regions, "Regions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.registerCapital)) {
            request.registerCapitalShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.registerCapital, "RegisterCapital", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.registerCapitalType)) {
            request.registerCapitalTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.registerCapitalType, "RegisterCapitalType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.spreadInfo)) {
            request.spreadInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.spreadInfo, "SpreadInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.staffSize)) {
            request.staffSizeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.staffSize, "StaffSize", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transformRate)) {
            request.transformRateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transformRate, "TransformRate", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCategoryShrink)) {
            body.put("BizCategory", request.bizCategoryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScopeShrink)) {
            body.put("BizScope", request.bizScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScopeKeyword)) {
            body.put("BizScopeKeyword", request.bizScopeKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizStatusShrink)) {
            body.put("BizStatus", request.bizStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypeShrink)) {
            body.put("BizType", request.bizTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandInfoShrink)) {
            body.put("BrandInfo", request.brandInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildTimeShrink)) {
            body.put("BuildTime", request.buildTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            body.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyNamesShrink)) {
            body.put("CompanyNames", request.companyNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyTypeShrink)) {
            body.put("CompanyType", request.companyTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpHouseId)) {
            body.put("CorpHouseId", request.corpHouseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpHouseName)) {
            body.put("CorpHouseName", request.corpHouseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataModuleIdsShrink)) {
            body.put("DataModuleIds", request.dataModuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.electronicBusinessYear)) {
            body.put("ElectronicBusinessYear", request.electronicBusinessYear);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.electronicBusinessYearType)) {
            body.put("ElectronicBusinessYearType", request.electronicBusinessYearType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esDateEnd)) {
            body.put("EsDateEnd", request.esDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esDateStart)) {
            body.put("EsDateStart", request.esDateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchFieldListShrink)) {
            body.put("FetchFieldList", request.fetchFieldListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchLbsInfo)) {
            body.put("FetchLbsInfo", request.fetchLbsInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterUnusedCompany)) {
            body.put("FilterUnusedCompany", request.filterUnusedCompany);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasFinance)) {
            body.put("HasFinance", request.hasFinance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAboveScale)) {
            body.put("IsAboveScale", request.isAboveScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAgency)) {
            body.put("IsAgency", request.isAgency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBidding)) {
            body.put("IsBidding", request.isBidding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBranch)) {
            body.put("IsBranch", request.isBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeadNum)) {
            body.put("IsDeadNum", request.isDeadNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isElectronicBusiness)) {
            body.put("IsElectronicBusiness", request.isElectronicBusiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEmail)) {
            body.put("IsEmail", request.isEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isFixedPhone)) {
            body.put("IsFixedPhone", request.isFixedPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHasEShop)) {
            body.put("IsHasEShop", request.isHasEShop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHomeUrl)) {
            body.put("IsHomeUrl", request.isHomeUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isImportOutput)) {
            body.put("IsImportOutput", request.isImportOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isIndividual)) {
            body.put("IsIndividual", request.isIndividual);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isInvestment)) {
            body.put("IsInvestment", request.isInvestment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isIpDomains)) {
            body.put("IsIpDomains", request.isIpDomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isLegalComp)) {
            body.put("IsLegalComp", request.isLegalComp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMobilePhone)) {
            body.put("IsMobilePhone", request.isMobilePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isNormalCopyrights)) {
            body.put("IsNormalCopyrights", request.isNormalCopyrights);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPatents)) {
            body.put("IsPatents", request.isPatents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProductNames)) {
            body.put("IsProductNames", request.isProductNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPublic)) {
            body.put("IsPublic", request.isPublic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecruit)) {
            body.put("IsRecruit", request.isRecruit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRiskLegalExecutions)) {
            body.put("IsRiskLegalExecutions", request.isRiskLegalExecutions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSoftCopyrights)) {
            body.put("IsSoftCopyrights", request.isSoftCopyrights);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTierATaxpayer)) {
            body.put("IsTierATaxpayer", request.isTierATaxpayer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTrademarks)) {
            body.put("IsTrademarks", request.isTrademarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isValidPhone)) {
            body.put("IsValidPhone", request.isValidPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isZone)) {
            body.put("IsZone", request.isZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobTimeLevel)) {
            body.put("JobTimeLevel", request.jobTimeLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lbsParamShrink)) {
            body.put("LbsParam", request.lbsParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleShrink)) {
            body.put("Lifecycle", request.lifecycleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listedStatusShrink)) {
            body.put("ListedStatus", request.listedStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oneCompanyId)) {
            body.put("OneCompanyId", request.oneCompanyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByType)) {
            body.put("OrderByType", request.orderByType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            body.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionName)) {
            body.put("PositionName", request.positionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionRequirement)) {
            body.put("PositionRequirement", request.positionRequirement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionWelfare)) {
            body.put("PositionWelfare", request.positionWelfare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerTagShrink)) {
            body.put("PowerTag", request.powerTagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productShopMatch)) {
            body.put("ProductShopMatch", request.productShopMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushDataLimit)) {
            body.put("PushDataLimit", request.pushDataLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushUrl)) {
            body.put("PushUrl", request.pushUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recruitEducationLevel)) {
            body.put("RecruitEducationLevel", request.recruitEducationLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recruitPayLevel)) {
            body.put("RecruitPayLevel", request.recruitPayLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recruitProvince)) {
            body.put("RecruitProvince", request.recruitProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionsShrink)) {
            body.put("Regions", request.regionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerCapitalShrink)) {
            body.put("RegisterCapital", request.registerCapitalShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerCapitalEnd)) {
            body.put("RegisterCapitalEnd", request.registerCapitalEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerCapitalStart)) {
            body.put("RegisterCapitalStart", request.registerCapitalStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerCapitalTypeShrink)) {
            body.put("RegisterCapitalType", request.registerCapitalTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchNewComp)) {
            body.put("SearchNewComp", request.searchNewComp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spreadInfoShrink)) {
            body.put("SpreadInfo", request.spreadInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffSizeShrink)) {
            body.put("StaffSize", request.staffSizeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformRateShrink)) {
            body.put("TransformRate", request.transformRateShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCompany"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCompanyResponse());
    }

    public QueryCompanyResponse queryCompany(QueryCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCompanyWithOptions(request, runtime);
    }

    public QueryCompanyConditionResponse queryCompanyConditionWithOptions(QueryCompanyConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionType)) {
            query.put("ConditionType", request.conditionType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCompanyCondition"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCompanyConditionResponse());
    }

    public QueryCompanyConditionResponse queryCompanyCondition(QueryCompanyConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCompanyConditionWithOptions(request, runtime);
    }

    public QueryCompanyInfoResponse queryCompanyInfoWithOptions(QueryCompanyInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCompanyInfoShrinkRequest request = new QueryCompanyInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.returnFields)) {
            request.returnFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.returnFields, "ReturnFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            query.put("SQLId", request.SQLId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionsShrink)) {
            body.put("Conditions", request.conditionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFieldsShrink)) {
            body.put("ReturnFields", request.returnFieldsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCompanyInfo"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCompanyInfoResponse());
    }

    public QueryCompanyInfoResponse queryCompanyInfo(QueryCompanyInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCompanyInfoWithOptions(request, runtime);
    }

    public QueryMultiCorpsRelationshipResponse queryMultiCorpsRelationshipWithOptions(QueryMultiCorpsRelationshipRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMultiCorpsRelationshipShrinkRequest request = new QueryMultiCorpsRelationshipShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.corpNames)) {
            request.corpNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.corpNames, "CorpNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxPath)) {
            query.put("MaxPath", request.maxPath);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpNamesShrink)) {
            body.put("CorpNames", request.corpNamesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMultiCorpsRelationship"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMultiCorpsRelationshipResponse());
    }

    public QueryMultiCorpsRelationshipResponse queryMultiCorpsRelationship(QueryMultiCorpsRelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMultiCorpsRelationshipWithOptions(request, runtime);
    }

    public QueryRskStatisticResponse queryRskStatisticWithOptions(QueryRskStatisticRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryRskStatisticShrinkRequest request = new QueryRskStatisticShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.oneCompId)) {
            request.oneCompIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.oneCompId, "OneCompId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rskType)) {
            request.rskTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rskType, "RskType", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oneCompIdShrink)) {
            query.put("OneCompId", request.oneCompIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rskTypeShrink)) {
            query.put("RskType", request.rskTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRskStatistic"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRskStatisticResponse());
    }

    public QueryRskStatisticResponse queryRskStatistic(QueryRskStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRskStatisticWithOptions(request, runtime);
    }

    public SearchCompanyResponse searchCompanyWithOptions(SearchCompanyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchCompanyShrinkRequest request = new SearchCompanyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizCategories)) {
            request.bizCategoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizCategories, "BizCategories", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizInfo)) {
            request.bizInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizInfo, "BizInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizScopeKeyword)) {
            request.bizScopeKeywordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizScopeKeyword, "BizScopeKeyword", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizStatus)) {
            request.bizStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizStatus, "BizStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizType)) {
            request.bizTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizType, "BizType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.brandInfo)) {
            request.brandInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.brandInfo, "BrandInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.buildTime)) {
            request.buildTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.buildTime, "BuildTime", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyType)) {
            request.companyTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyType, "CompanyType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lifecycle)) {
            request.lifecycleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lifecycle, "Lifecycle", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderBy)) {
            request.orderByShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderBy, "OrderBy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.region)) {
            request.regionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.region, "Region", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regions)) {
            request.regionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regions, "Regions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.registerAssert)) {
            request.registerAssertShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.registerAssert, "RegisterAssert", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.spreadInfo)) {
            request.spreadInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.spreadInfo, "SpreadInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.staffSize)) {
            request.staffSizeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.staffSize, "StaffSize", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            query.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsCorpType)) {
            query.put("GoodsCorpType", request.goodsCorpType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsList)) {
            query.put("GoodsList", request.goodsList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNumber)) {
            query.put("LicenseNumber", request.licenseNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newCorp)) {
            query.put("NewCorp", request.newCorp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgNo)) {
            query.put("OrgNo", request.orgNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productShopMatch)) {
            query.put("ProductShopMatch", request.productShopMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recCap)) {
            query.put("RecCap", request.recCap);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCategoriesShrink)) {
            body.put("BizCategories", request.bizCategoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizInfoShrink)) {
            body.put("BizInfo", request.bizInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScopeKeywordShrink)) {
            body.put("BizScopeKeyword", request.bizScopeKeywordShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizStatusShrink)) {
            body.put("BizStatus", request.bizStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypeShrink)) {
            body.put("BizType", request.bizTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandInfoShrink)) {
            body.put("BrandInfo", request.brandInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildTimeShrink)) {
            body.put("BuildTime", request.buildTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyTypeShrink)) {
            body.put("CompanyType", request.companyTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleShrink)) {
            body.put("Lifecycle", request.lifecycleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByShrink)) {
            body.put("OrderBy", request.orderByShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionShrink)) {
            body.put("Region", request.regionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionsShrink)) {
            body.put("Regions", request.regionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerAssertShrink)) {
            body.put("RegisterAssert", request.registerAssertShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spreadInfoShrink)) {
            body.put("SpreadInfo", request.spreadInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffSizeShrink)) {
            body.put("StaffSize", request.staffSizeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCompany"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCompanyResponse());
    }

    public SearchCompanyResponse searchCompany(SearchCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchCompanyWithOptions(request, runtime);
    }

    public SearchCorpByKeywordResponse searchCorpByKeywordWithOptions(SearchCorpByKeywordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCorpByKeyword"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCorpByKeywordResponse());
    }

    public SearchCorpByKeywordResponse searchCorpByKeyword(SearchCorpByKeywordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchCorpByKeywordWithOptions(request, runtime);
    }
}
