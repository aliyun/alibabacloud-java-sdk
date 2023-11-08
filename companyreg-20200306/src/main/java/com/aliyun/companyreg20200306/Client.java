// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306;

import com.aliyun.tea.*;
import com.aliyun.companyreg20200306.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "companyreg.aliyuncs.com"),
            new TeaPair("ap-south-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-chengdu", "companyreg.aliyuncs.com"),
            new TeaPair("cn-edge-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-fujian", "companyreg.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hongkong", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "companyreg.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "companyreg.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-qingdao", "companyreg.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-wuhan", "companyreg.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "companyreg.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-central-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-west-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "companyreg.aliyuncs.com"),
            new TeaPair("me-east-1", "companyreg.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "companyreg.aliyuncs.com"),
            new TeaPair("us-east-1", "companyreg.aliyuncs.com"),
            new TeaPair("us-west-1", "companyreg.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("companyreg", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BindProduceAuthorizationResponse bindProduceAuthorizationWithOptions(BindProduceAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedUserIds)) {
            body.put("AuthorizedUserIds", request.authorizedUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindProduceAuthorization"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindProduceAuthorizationResponse());
    }

    public BindProduceAuthorizationResponse bindProduceAuthorization(BindProduceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindProduceAuthorizationWithOptions(request, runtime);
    }

    public CloseIntentionForPartnerResponse closeIntentionForPartnerWithOptions(CloseIntentionForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseIntentionForPartner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseIntentionForPartnerResponse());
    }

    public CloseIntentionForPartnerResponse closeIntentionForPartner(CloseIntentionForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeIntentionForPartnerWithOptions(request, runtime);
    }

    public CloseUserIntentionResponse closeUserIntentionWithOptions(CloseUserIntentionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseUserIntention"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseUserIntentionResponse());
    }

    public CloseUserIntentionResponse closeUserIntention(CloseUserIntentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeUserIntentionWithOptions(request, runtime);
    }

    public CreateBusinessOpportunityResponse createBusinessOpportunityWithOptions(CreateBusinessOpportunityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VCode)) {
            query.put("VCode", request.VCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBusinessOpportunity"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBusinessOpportunityResponse());
    }

    public CreateBusinessOpportunityResponse createBusinessOpportunity(CreateBusinessOpportunityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBusinessOpportunityWithOptions(request, runtime);
    }

    public CreateProduceForPartnerResponse createProduceForPartnerWithOptions(CreateProduceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduceForPartner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProduceForPartnerResponse());
    }

    public CreateProduceForPartnerResponse createProduceForPartner(CreateProduceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProduceForPartnerWithOptions(request, runtime);
    }

    public DescribePartnerConfigResponse describePartnerConfigWithOptions(DescribePartnerConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerCode)) {
            query.put("PartnerCode", request.partnerCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePartnerConfig"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePartnerConfigResponse());
    }

    public DescribePartnerConfigResponse describePartnerConfig(DescribePartnerConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePartnerConfigWithOptions(request, runtime);
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicyWithOptions(GenerateUploadFilePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadFilePolicy"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadFilePolicyResponse());
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicy(GenerateUploadFilePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadFilePolicyWithOptions(request, runtime);
    }

    public GetAlipayUrlResponse getAlipayUrlWithOptions(GetAlipayUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlipayUrl"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlipayUrlResponse());
    }

    public GetAlipayUrlResponse getAlipayUrl(GetAlipayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlipayUrlWithOptions(request, runtime);
    }

    public ListIntentionNoteResponse listIntentionNoteWithOptions(ListIntentionNoteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntentionNote"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntentionNoteResponse());
    }

    public ListIntentionNoteResponse listIntentionNote(ListIntentionNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntentionNoteWithOptions(request, runtime);
    }

    public ListProduceAuthorizationResponse listProduceAuthorizationWithOptions(ListProduceAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProduceAuthorization"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProduceAuthorizationResponse());
    }

    public ListProduceAuthorizationResponse listProduceAuthorization(ListProduceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProduceAuthorizationWithOptions(request, runtime);
    }

    public ListUserDetailSolutionsResponse listUserDetailSolutionsWithOptions(ListUserDetailSolutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDetailSolutions"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDetailSolutionsResponse());
    }

    public ListUserDetailSolutionsResponse listUserDetailSolutions(ListUserDetailSolutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDetailSolutionsWithOptions(request, runtime);
    }

    public ListUserIntentionNotesResponse listUserIntentionNotesWithOptions(ListUserIntentionNotesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserIntentionNotes"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserIntentionNotesResponse());
    }

    public ListUserIntentionNotesResponse listUserIntentionNotes(ListUserIntentionNotesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserIntentionNotesWithOptions(request, runtime);
    }

    public ListUserIntentionsResponse listUserIntentionsWithOptions(ListUserIntentionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypes)) {
            query.put("BizTypes", request.bizTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFiled)) {
            query.put("SortFiled", request.sortFiled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withExtInfo)) {
            query.put("WithExtInfo", request.withExtInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserIntentions"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserIntentionsResponse());
    }

    public ListUserIntentionsResponse listUserIntentions(ListUserIntentionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserIntentionsWithOptions(request, runtime);
    }

    public ListUserProduceOperateLogsResponse listUserProduceOperateLogsWithOptions(ListUserProduceOperateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserProduceOperateLogs"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserProduceOperateLogsResponse());
    }

    public ListUserProduceOperateLogsResponse listUserProduceOperateLogs(ListUserProduceOperateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserProduceOperateLogsWithOptions(request, runtime);
    }

    public ListUserSolutionsResponse listUserSolutionsWithOptions(ListUserSolutionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUserSolutionsShrinkRequest request = new ListUserSolutionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.existStatus)) {
            request.existStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.existStatus, "ExistStatus", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.existStatusShrink)) {
            query.put("ExistStatus", request.existStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserSolutions"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserSolutionsResponse());
    }

    public ListUserSolutionsResponse listUserSolutions(ListUserSolutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserSolutionsWithOptions(request, runtime);
    }

    public OperateProduceForPartnerResponse operateProduceForPartnerWithOptions(OperateProduceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateProduceForPartner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateProduceForPartnerResponse());
    }

    public OperateProduceForPartnerResponse operateProduceForPartner(OperateProduceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateProduceForPartnerWithOptions(request, runtime);
    }

    public PutMeasureDataResponse putMeasureDataWithOptions(PutMeasureDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMeasureData"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMeasureDataResponse());
    }

    public PutMeasureDataResponse putMeasureData(PutMeasureDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMeasureDataWithOptions(request, runtime);
    }

    public PutMeasureReadyFlagResponse putMeasureReadyFlagWithOptions(PutMeasureReadyFlagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readyFlag)) {
            query.put("ReadyFlag", request.readyFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMeasureReadyFlag"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMeasureReadyFlagResponse());
    }

    public PutMeasureReadyFlagResponse putMeasureReadyFlag(PutMeasureReadyFlagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMeasureReadyFlagWithOptions(request, runtime);
    }

    public QueryAvailableNumbersResponse queryAvailableNumbersWithOptions(QueryAvailableNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvailableNumbers"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvailableNumbersResponse());
    }

    public QueryAvailableNumbersResponse queryAvailableNumbers(QueryAvailableNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvailableNumbersWithOptions(request, runtime);
    }

    public QueryBagRemainingResponse queryBagRemainingWithOptions(QueryBagRemainingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBagRemaining"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBagRemainingResponse());
    }

    public QueryBagRemainingResponse queryBagRemaining(QueryBagRemainingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBagRemainingWithOptions(request, runtime);
    }

    public QueryCommodityConfigResponse queryCommodityConfigWithOptions(QueryCommodityConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryModule)) {
            query.put("QueryModule", request.queryModule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommodityConfig"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommodityConfigResponse());
    }

    public QueryCommodityConfigResponse queryCommodityConfig(QueryCommodityConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommodityConfigWithOptions(request, runtime);
    }

    public QueryInstanceResponse queryInstanceWithOptions(QueryInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstance"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceResponse());
    }

    public QueryInstanceResponse queryInstance(QueryInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceWithOptions(request, runtime);
    }

    public QueryPartnerIntentionListResponse queryPartnerIntentionListWithOptions(QueryPartnerIntentionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPartnerIntentionList"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPartnerIntentionListResponse());
    }

    public QueryPartnerIntentionListResponse queryPartnerIntentionList(QueryPartnerIntentionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPartnerIntentionListWithOptions(request, runtime);
    }

    public QueryPartnerProduceListResponse queryPartnerProduceListWithOptions(QueryPartnerProduceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPartnerProduceList"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPartnerProduceListResponse());
    }

    public QueryPartnerProduceListResponse queryPartnerProduceList(QueryPartnerProduceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPartnerProduceListWithOptions(request, runtime);
    }

    public QueryUserNeedAuthResponse queryUserNeedAuthWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserNeedAuth"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserNeedAuthResponse());
    }

    public QueryUserNeedAuthResponse queryUserNeedAuth() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserNeedAuthWithOptions(runtime);
    }

    public RecordPostBackResponse recordPostBackWithOptions(RecordPostBackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("bizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactor)) {
            query.put("contactor", request.contactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityKey)) {
            query.put("entityKey", request.entityKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecordPostBack"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecordPostBackResponse());
    }

    public RecordPostBackResponse recordPostBack(RecordPostBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordPostBackWithOptions(request, runtime);
    }

    public RejectSolutionResponse rejectSolutionWithOptions(RejectSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionBizId)) {
            query.put("SolutionBizId", request.solutionBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectSolution"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectSolutionResponse());
    }

    public RejectSolutionResponse rejectSolution(RejectSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectSolutionWithOptions(request, runtime);
    }

    public RejectUserSolutionResponse rejectUserSolutionWithOptions(RejectUserSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionBizId)) {
            query.put("SolutionBizId", request.solutionBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectUserSolution"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectUserSolutionResponse());
    }

    public RejectUserSolutionResponse rejectUserSolution(RejectUserSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectUserSolutionWithOptions(request, runtime);
    }

    public ReleaseProduceAuthorizationResponse releaseProduceAuthorizationWithOptions(ReleaseProduceAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedUserId)) {
            body.put("AuthorizedUserId", request.authorizedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseProduceAuthorization"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseProduceAuthorizationResponse());
    }

    public ReleaseProduceAuthorizationResponse releaseProduceAuthorization(ReleaseProduceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseProduceAuthorizationWithOptions(request, runtime);
    }

    public StartBackToBackCallResponse startBackToBackCallWithOptions(StartBackToBackCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callCenterNumber)) {
            query.put("CallCenterNumber", request.callCenterNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileKey)) {
            query.put("MobileKey", request.mobileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillType)) {
            query.put("SkillType", request.skillType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartBackToBackCall"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartBackToBackCallResponse());
    }

    public StartBackToBackCallResponse startBackToBackCall(StartBackToBackCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBackToBackCallWithOptions(request, runtime);
    }

    public SubmitIntentionNoteResponse submitIntentionNoteWithOptions(SubmitIntentionNoteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIntentionNote"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIntentionNoteResponse());
    }

    public SubmitIntentionNoteResponse submitIntentionNote(SubmitIntentionNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIntentionNoteWithOptions(request, runtime);
    }

    public SubmitSolutionResponse submitSolutionWithOptions(SubmitSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solution)) {
            query.put("Solution", request.solution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSolution"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSolutionResponse());
    }

    public SubmitSolutionResponse submitSolution(SubmitSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSolutionWithOptions(request, runtime);
    }

    public TransferIntentionOwnerResponse transferIntentionOwnerWithOptions(TransferIntentionOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            query.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferIntentionOwner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferIntentionOwnerResponse());
    }

    public TransferIntentionOwnerResponse transferIntentionOwner(TransferIntentionOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferIntentionOwnerWithOptions(request, runtime);
    }

    public TransferProduceOwnerResponse transferProduceOwnerWithOptions(TransferProduceOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            query.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferProduceOwner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferProduceOwnerResponse());
    }

    public TransferProduceOwnerResponse transferProduceOwner(TransferProduceOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferProduceOwnerWithOptions(request, runtime);
    }
}
