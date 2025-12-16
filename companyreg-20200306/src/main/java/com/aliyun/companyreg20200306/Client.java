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

    /**
     * <b>summary</b> : 
     * <p>服务单授权</p>
     * 
     * @param request BindProduceAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindProduceAuthorizationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>服务单授权</p>
     * 
     * @param request BindProduceAuthorizationRequest
     * @return BindProduceAuthorizationResponse
     */
    public BindProduceAuthorizationResponse bindProduceAuthorization(BindProduceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindProduceAuthorizationWithOptions(request, runtime);
    }

    /**
     * @param request CloseIntentionForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseIntentionForPartnerResponse
     */
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

    /**
     * @param request CloseIntentionForPartnerRequest
     * @return CloseIntentionForPartnerResponse
     */
    public CloseIntentionForPartnerResponse closeIntentionForPartner(CloseIntentionForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeIntentionForPartnerWithOptions(request, runtime);
    }

    /**
     * @param request CloseUserIntentionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseUserIntentionResponse
     */
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

    /**
     * @param request CloseUserIntentionRequest
     * @return CloseUserIntentionResponse
     */
    public CloseUserIntentionResponse closeUserIntention(CloseUserIntentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeUserIntentionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateBusinessOpportunity</p>
     * 
     * @param request CreateBusinessOpportunityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBusinessOpportunityResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>CreateBusinessOpportunity</p>
     * 
     * @param request CreateBusinessOpportunityRequest
     * @return CreateBusinessOpportunityResponse
     */
    public CreateBusinessOpportunityResponse createBusinessOpportunity(CreateBusinessOpportunityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBusinessOpportunityWithOptions(request, runtime);
    }

    /**
     * @param request CreateProduceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProduceForPartnerResponse
     */
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

    /**
     * @param request CreateProduceForPartnerRequest
     * @return CreateProduceForPartnerResponse
     */
    public CreateProduceForPartnerResponse createProduceForPartner(CreateProduceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProduceForPartnerWithOptions(request, runtime);
    }

    /**
     * @param request DescribePartnerConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePartnerConfigResponse
     */
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

    /**
     * @param request DescribePartnerConfigRequest
     * @return DescribePartnerConfigResponse
     */
    public DescribePartnerConfigResponse describePartnerConfig(DescribePartnerConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePartnerConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GenerateUploadFilePolicy</p>
     * 
     * @param request GenerateUploadFilePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUploadFilePolicyResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>GenerateUploadFilePolicy</p>
     * 
     * @param request GenerateUploadFilePolicyRequest
     * @return GenerateUploadFilePolicyResponse
     */
    public GenerateUploadFilePolicyResponse generateUploadFilePolicy(GenerateUploadFilePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadFilePolicyWithOptions(request, runtime);
    }

    /**
     * @param request GetAlipayUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlipayUrlResponse
     */
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

    /**
     * @param request GetAlipayUrlRequest
     * @return GetAlipayUrlResponse
     */
    public GetAlipayUrlResponse getAlipayUrl(GetAlipayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlipayUrlWithOptions(request, runtime);
    }

    /**
     * @param request ListIntentionNoteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntentionNoteResponse
     */
    public ListIntentionNoteResponse listIntentionNoteWithOptions(ListIntentionNoteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
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

    /**
     * @param request ListIntentionNoteRequest
     * @return ListIntentionNoteResponse
     */
    public ListIntentionNoteResponse listIntentionNote(ListIntentionNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntentionNoteWithOptions(request, runtime);
    }

    /**
     * @param request ListProduceAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProduceAuthorizationResponse
     */
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

    /**
     * @param request ListProduceAuthorizationRequest
     * @return ListProduceAuthorizationResponse
     */
    public ListProduceAuthorizationResponse listProduceAuthorization(ListProduceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProduceAuthorizationWithOptions(request, runtime);
    }

    /**
     * @param request ListUserDetailSolutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDetailSolutionsResponse
     */
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

    /**
     * @param request ListUserDetailSolutionsRequest
     * @return ListUserDetailSolutionsResponse
     */
    public ListUserDetailSolutionsResponse listUserDetailSolutions(ListUserDetailSolutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDetailSolutionsWithOptions(request, runtime);
    }

    /**
     * @param request ListUserIntentionNotesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserIntentionNotesResponse
     */
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

    /**
     * @param request ListUserIntentionNotesRequest
     * @return ListUserIntentionNotesResponse
     */
    public ListUserIntentionNotesResponse listUserIntentionNotes(ListUserIntentionNotesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserIntentionNotesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户控制天需求列表查询</p>
     * 
     * @param request ListUserIntentionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserIntentionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>用户控制天需求列表查询</p>
     * 
     * @param request ListUserIntentionsRequest
     * @return ListUserIntentionsResponse
     */
    public ListUserIntentionsResponse listUserIntentions(ListUserIntentionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserIntentionsWithOptions(request, runtime);
    }

    /**
     * @param request ListUserProduceOperateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserProduceOperateLogsResponse
     */
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

    /**
     * @param request ListUserProduceOperateLogsRequest
     * @return ListUserProduceOperateLogsResponse
     */
    public ListUserProduceOperateLogsResponse listUserProduceOperateLogs(ListUserProduceOperateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserProduceOperateLogsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ListUserSolutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserSolutionsResponse
     */
    public ListUserSolutionsResponse listUserSolutionsWithOptions(ListUserSolutionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUserSolutionsShrinkRequest request = new ListUserSolutionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.existStatus)) {
            request.existStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.existStatus, "ExistStatus", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

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

    /**
     * @param request ListUserSolutionsRequest
     * @return ListUserSolutionsResponse
     */
    public ListUserSolutionsResponse listUserSolutions(ListUserSolutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserSolutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务商玄坛呼叫中心操作</p>
     * 
     * @param request OperateCallCenterForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateCallCenterForPartnerResponse
     */
    public OperateCallCenterForPartnerResponse operateCallCenterForPartnerWithOptions(OperateCallCenterForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callAction)) {
            query.put("CallAction", request.callAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.employeeCode)) {
            query.put("EmployeeCode", request.employeeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            query.put("Request", request.request);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateCallCenterForPartner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateCallCenterForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>服务商玄坛呼叫中心操作</p>
     * 
     * @param request OperateCallCenterForPartnerRequest
     * @return OperateCallCenterForPartnerResponse
     */
    public OperateCallCenterForPartnerResponse operateCallCenterForPartner(OperateCallCenterForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateCallCenterForPartnerWithOptions(request, runtime);
    }

    /**
     * @param request OperateProduceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateProduceForPartnerResponse
     */
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

    /**
     * @param request OperateProduceForPartnerRequest
     * @return OperateProduceForPartnerResponse
     */
    public OperateProduceForPartnerResponse operateProduceForPartner(OperateProduceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateProduceForPartnerWithOptions(request, runtime);
    }

    /**
     * @param request PutMeasureDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutMeasureDataResponse
     */
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

    /**
     * @param request PutMeasureDataRequest
     * @return PutMeasureDataResponse
     */
    public PutMeasureDataResponse putMeasureData(PutMeasureDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMeasureDataWithOptions(request, runtime);
    }

    /**
     * @param request PutMeasureReadyFlagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutMeasureReadyFlagResponse
     */
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

    /**
     * @param request PutMeasureReadyFlagRequest
     * @return PutMeasureReadyFlagResponse
     */
    public PutMeasureReadyFlagResponse putMeasureReadyFlag(PutMeasureReadyFlagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMeasureReadyFlagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取玄坛合作伙伴双呼时可用外呼号码</p>
     * 
     * @param request QueryAvailableNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvailableNumbersResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>获取玄坛合作伙伴双呼时可用外呼号码</p>
     * 
     * @param request QueryAvailableNumbersRequest
     * @return QueryAvailableNumbersResponse
     */
    public QueryAvailableNumbersResponse queryAvailableNumbers(QueryAvailableNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvailableNumbersWithOptions(request, runtime);
    }

    /**
     * @param request QueryBagRemainingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBagRemainingResponse
     */
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

    /**
     * @param request QueryBagRemainingRequest
     * @return QueryBagRemainingResponse
     */
    public QueryBagRemainingResponse queryBagRemaining(QueryBagRemainingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBagRemainingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询玄坛外呼语音文件</p>
     * 
     * @param request QueryCallRecordListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallRecordListResponse
     */
    public QueryCallRecordListResponse queryCallRecordListWithOptions(QueryCallRecordListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillType)) {
            query.put("SkillType", request.skillType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallRecordList"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallRecordListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询玄坛外呼语音文件</p>
     * 
     * @param request QueryCallRecordListRequest
     * @return QueryCallRecordListResponse
     */
    public QueryCallRecordListResponse queryCallRecordList(QueryCallRecordListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallRecordListWithOptions(request, runtime);
    }

    /**
     * @param request QueryInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstanceResponse
     */
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

    /**
     * @param request QueryInstanceRequest
     * @return QueryInstanceResponse
     */
    public QueryInstanceResponse queryInstance(QueryInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>QueryPartnerIntentionList</p>
     * 
     * @param request QueryPartnerIntentionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPartnerIntentionListResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>QueryPartnerIntentionList</p>
     * 
     * @param request QueryPartnerIntentionListRequest
     * @return QueryPartnerIntentionListResponse
     */
    public QueryPartnerIntentionListResponse queryPartnerIntentionList(QueryPartnerIntentionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPartnerIntentionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>QueryPartnerProduceList</p>
     * 
     * @param request QueryPartnerProduceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPartnerProduceListResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>QueryPartnerProduceList</p>
     * 
     * @param request QueryPartnerProduceListRequest
     * @return QueryPartnerProduceListResponse
     */
    public QueryPartnerProduceListResponse queryPartnerProduceList(QueryPartnerProduceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPartnerProduceListWithOptions(request, runtime);
    }

    /**
     * @param request QueryUserNeedAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserNeedAuthResponse
     */
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

    /**
     * @return QueryUserNeedAuthResponse
     */
    public QueryUserNeedAuthResponse queryUserNeedAuth() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserNeedAuthWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务商玄坛外呼呼叫中心事件回传</p>
     * 
     * @param request RecordCallCenterEventForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecordCallCenterEventForPartnerResponse
     */
    public RecordCallCenterEventForPartnerResponse recordCallCenterEventForPartnerWithOptions(RecordCallCenterEventForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callAction)) {
            query.put("CallAction", request.callAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connId)) {
            query.put("ConnId", request.connId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.employeeCode)) {
            query.put("EmployeeCode", request.employeeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedId)) {
            query.put("RelatedId", request.relatedId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretMobile)) {
            query.put("SecretMobile", request.secretMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillType)) {
            query.put("SkillType", request.skillType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecordCallCenterEventForPartner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecordCallCenterEventForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>服务商玄坛外呼呼叫中心事件回传</p>
     * 
     * @param request RecordCallCenterEventForPartnerRequest
     * @return RecordCallCenterEventForPartnerResponse
     */
    public RecordCallCenterEventForPartnerResponse recordCallCenterEventForPartner(RecordCallCenterEventForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordCallCenterEventForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>RecordPostBack</p>
     * 
     * @param request RecordPostBackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecordPostBackResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>RecordPostBack</p>
     * 
     * @param request RecordPostBackRequest
     * @return RecordPostBackResponse
     */
    public RecordPostBackResponse recordPostBack(RecordPostBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordPostBackWithOptions(request, runtime);
    }

    /**
     * @param request RejectSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectSolutionResponse
     */
    public RejectSolutionResponse rejectSolutionWithOptions(RejectSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    /**
     * @param request RejectSolutionRequest
     * @return RejectSolutionResponse
     */
    public RejectSolutionResponse rejectSolution(RejectSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectSolutionWithOptions(request, runtime);
    }

    /**
     * @param request RejectUserSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectUserSolutionResponse
     */
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

    /**
     * @param request RejectUserSolutionRequest
     * @return RejectUserSolutionResponse
     */
    public RejectUserSolutionResponse rejectUserSolution(RejectUserSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectUserSolutionWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseProduceAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseProduceAuthorizationResponse
     */
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

    /**
     * @param request ReleaseProduceAuthorizationRequest
     * @return ReleaseProduceAuthorizationResponse
     */
    public ReleaseProduceAuthorizationResponse releaseProduceAuthorization(ReleaseProduceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseProduceAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>玄坛双呼外呼发起</p>
     * 
     * @param request StartBackToBackCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartBackToBackCallResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>玄坛双呼外呼发起</p>
     * 
     * @param request StartBackToBackCallRequest
     * @return StartBackToBackCallResponse
     */
    public StartBackToBackCallResponse startBackToBackCall(StartBackToBackCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBackToBackCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴提交需求单</p>
     * 
     * @param request SubmitIntentionForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIntentionForPartnerResponse
     */
    public SubmitIntentionForPartnerResponse submitIntentionForPartnerWithOptions(SubmitIntentionForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityType)) {
            query.put("CommodityType", request.commodityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            query.put("Grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIntentionForPartner"),
            new TeaPair("version", "2020-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIntentionForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴提交需求单</p>
     * 
     * @param request SubmitIntentionForPartnerRequest
     * @return SubmitIntentionForPartnerResponse
     */
    public SubmitIntentionForPartnerResponse submitIntentionForPartner(SubmitIntentionForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIntentionForPartnerWithOptions(request, runtime);
    }

    /**
     * @param request SubmitIntentionNoteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIntentionNoteResponse
     */
    public SubmitIntentionNoteResponse submitIntentionNoteWithOptions(SubmitIntentionNoteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    /**
     * @param request SubmitIntentionNoteRequest
     * @return SubmitIntentionNoteResponse
     */
    public SubmitIntentionNoteResponse submitIntentionNote(SubmitIntentionNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIntentionNoteWithOptions(request, runtime);
    }

    /**
     * @param request SubmitSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSolutionResponse
     */
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

    /**
     * @param request SubmitSolutionRequest
     * @return SubmitSolutionResponse
     */
    public SubmitSolutionResponse submitSolution(SubmitSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSolutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>玄坛需求单转派小二</p>
     * 
     * @param request TransferIntentionOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferIntentionOwnerResponse
     */
    public TransferIntentionOwnerResponse transferIntentionOwnerWithOptions(TransferIntentionOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.employeeCode)) {
            query.put("EmployeeCode", request.employeeCode);
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

    /**
     * <b>summary</b> : 
     * <p>玄坛需求单转派小二</p>
     * 
     * @param request TransferIntentionOwnerRequest
     * @return TransferIntentionOwnerResponse
     */
    public TransferIntentionOwnerResponse transferIntentionOwner(TransferIntentionOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferIntentionOwnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>玄坛服务单转派小二</p>
     * 
     * @param request TransferProduceOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferProduceOwnerResponse
     */
    public TransferProduceOwnerResponse transferProduceOwnerWithOptions(TransferProduceOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.employeeCode)) {
            query.put("EmployeeCode", request.employeeCode);
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

    /**
     * <b>summary</b> : 
     * <p>玄坛服务单转派小二</p>
     * 
     * @param request TransferProduceOwnerRequest
     * @return TransferProduceOwnerResponse
     */
    public TransferProduceOwnerResponse transferProduceOwner(TransferProduceOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferProduceOwnerWithOptions(request, runtime);
    }
}
