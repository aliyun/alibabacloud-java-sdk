// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118;

import com.aliyun.tea.*;
import com.aliyun.mseap20210118.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mseap", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>商品授权码激活</p>
     * 
     * @param request ActivateLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateLicenseResponse
     */
    public ActivateLicenseResponse activateLicenseWithOptions(ActivateLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseCode)) {
            query.put("LicenseCode", request.licenseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNo)) {
            query.put("LicenseNo", request.licenseNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licensePublisher)) {
            query.put("LicensePublisher", request.licensePublisher);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateLicense"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商品授权码激活</p>
     * 
     * @param request ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    public ActivateLicenseResponse activateLicense(ActivateLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务回调</p>
     * 
     * @param request CallbackTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CallbackTaskResponse
     */
    public CallbackTaskResponse callbackTaskWithOptions(CallbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTaskId)) {
            query.put("OutTaskId", request.outTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalKey)) {
            query.put("PrincipalKey", request.principalKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskData)) {
            query.put("TaskData", request.taskData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CallbackTask"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CallbackTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务回调</p>
     * 
     * @param request CallbackTaskRequest
     * @return CallbackTaskResponse
     */
    public CallbackTaskResponse callbackTask(CallbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.callbackTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询协议状态</p>
     * 
     * @param request DescribeAgreementStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAgreementStatusResponse
     */
    public DescribeAgreementStatusResponse describeAgreementStatusWithOptions(DescribeAgreementStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementCode)) {
            query.put("AgreementCode", request.agreementCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAgreementStatus"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAgreementStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询协议状态</p>
     * 
     * @param request DescribeAgreementStatusRequest
     * @return DescribeAgreementStatusResponse
     */
    public DescribeAgreementStatusResponse describeAgreementStatus(DescribeAgreementStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgreementStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴生成上传文件策略</p>
     * 
     * @param request GenerateUploadFilePolicyForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUploadFilePolicyForPartnerResponse
     */
    public GenerateUploadFilePolicyForPartnerResponse generateUploadFilePolicyForPartnerWithOptions(GenerateUploadFilePolicyForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GenerateUploadFilePolicyForPartner"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadFilePolicyForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴生成上传文件策略</p>
     * 
     * @param request GenerateUploadFilePolicyForPartnerRequest
     * @return GenerateUploadFilePolicyForPartnerResponse
     */
    public GenerateUploadFilePolicyForPartnerResponse generateUploadFilePolicyForPartner(GenerateUploadFilePolicyForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadFilePolicyForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取node节点通过流程id</p>
     * 
     * @param request GetNodeByFlowIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeByFlowIdResponse
     */
    public GetNodeByFlowIdResponse getNodeByFlowIdWithOptions(GetNodeByFlowIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeByFlowId"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeByFlowIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取node节点通过流程id</p>
     * 
     * @param request GetNodeByFlowIdRequest
     * @return GetNodeByFlowIdResponse
     */
    public GetNodeByFlowIdResponse getNodeByFlowId(GetNodeByFlowIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeByFlowIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取node节点通过模版id</p>
     * 
     * @param request GetNodeByTemplateIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeByTemplateIdResponse
     */
    public GetNodeByTemplateIdResponse getNodeByTemplateIdWithOptions(GetNodeByTemplateIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeByTemplateId"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeByTemplateIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取node节点通过模版id</p>
     * 
     * @param request GetNodeByTemplateIdRequest
     * @return GetNodeByTemplateIdResponse
     */
    public GetNodeByTemplateIdResponse getNodeByTemplateId(GetNodeByTemplateIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeByTemplateIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取订单概要信息</p>
     * 
     * @param request GetOrderSummaryForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrderSummaryForPartnerResponse
     */
    public GetOrderSummaryForPartnerResponse getOrderSummaryForPartnerWithOptions(GetOrderSummaryForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderSummaryForPartner"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderSummaryForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取订单概要信息</p>
     * 
     * @param request GetOrderSummaryForPartnerRequest
     * @return GetOrderSummaryForPartnerResponse
     */
    public GetOrderSummaryForPartnerResponse getOrderSummaryForPartner(GetOrderSummaryForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderSummaryForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取用户跨平台信息</p>
     * 
     * @param request GetPlatformUserInfoForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPlatformUserInfoForPartnerResponse
     */
    public GetPlatformUserInfoForPartnerResponse getPlatformUserInfoForPartnerWithOptions(GetPlatformUserInfoForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            query.put("PlatformType", request.platformType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlatformUserInfoForPartner"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPlatformUserInfoForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取用户跨平台信息</p>
     * 
     * @param request GetPlatformUserInfoForPartnerRequest
     * @return GetPlatformUserInfoForPartnerResponse
     */
    public GetPlatformUserInfoForPartnerResponse getPlatformUserInfoForPartner(GetPlatformUserInfoForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlatformUserInfoForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取代理</p>
     * 
     * @param request GetProxyByTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProxyByTypeResponse
     */
    public GetProxyByTypeResponse getProxyByTypeWithOptions(GetProxyByTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProxyByType"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProxyByTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取代理</p>
     * 
     * @param request GetProxyByTypeRequest
     * @return GetProxyByTypeResponse
     */
    public GetProxyByTypeResponse getProxyByType(GetProxyByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProxyByTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取redis值</p>
     * 
     * @param request GetRedisValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRedisValueResponse
     */
    public GetRedisValueResponse getRedisValueWithOptions(GetRedisValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRedisValue"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRedisValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取redis值</p>
     * 
     * @param request GetRedisValueRequest
     * @return GetRedisValueResponse
     */
    public GetRedisValueResponse getRedisValue(GetRedisValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRedisValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取变量</p>
     * 
     * @param request GetVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVariableResponse
     */
    public GetVariableResponse getVariableWithOptions(GetVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVariable"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取变量</p>
     * 
     * @param request GetVariableRequest
     * @return GetVariableResponse
     */
    public GetVariableResponse getVariable(GetVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>识别验证码</p>
     * 
     * @param request IdentifyCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IdentifyCodeResponse
     */
    public IdentifyCodeResponse identifyCodeWithOptions(IdentifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdentifyCode"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdentifyCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>识别验证码</p>
     * 
     * @param request IdentifyCodeRequest
     * @return IdentifyCodeResponse
     */
    public IdentifyCodeResponse identifyCode(IdentifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.identifyCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拉取协议变更识别模型</p>
     * 
     * @param request PullRpaModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PullRpaModelResponse
     */
    public PullRpaModelResponse pullRpaModelWithOptions(PullRpaModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PullRpaModel"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PullRpaModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>拉取协议变更识别模型</p>
     * 
     * @param request PullRpaModelRequest
     * @return PullRpaModelResponse
     */
    public PullRpaModelResponse pullRpaModel(PullRpaModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pullRpaModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>RPA拉取任务</p>
     * 
     * @param request PullTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PullTaskResponse
     */
    public PullTaskResponse pullTaskWithOptions(PullTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalKey)) {
            query.put("PrincipalKey", request.principalKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            query.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PullTask"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PullTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>RPA拉取任务</p>
     * 
     * @param request PullTaskRequest
     * @return PullTaskResponse
     */
    public PullTaskResponse pullTask(PullTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pullTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送RPA运行时任务</p>
     * 
     * @param request PushRpaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushRpaTaskResponse
     */
    public PushRpaTaskResponse pushRpaTaskWithOptions(PushRpaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            query.put("Request", request.request);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushRpaTask"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushRpaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送RPA运行时任务</p>
     * 
     * @param request PushRpaTaskRequest
     * @return PushRpaTaskResponse
     */
    public PushRpaTaskResponse pushRpaTask(PushRpaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushRpaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送运行时任务明细</p>
     * 
     * @param request PushRpaTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushRpaTaskDetailResponse
     */
    public PushRpaTaskDetailResponse pushRpaTaskDetailWithOptions(PushRpaTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputData)) {
            query.put("InputData", request.inputData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputHtml)) {
            query.put("InputHtml", request.inputHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputScreenshot)) {
            query.put("InputScreenshot", request.inputScreenshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelDetailId)) {
            query.put("ModelDetailId", request.modelDetailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputData)) {
            query.put("OutputData", request.outputData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputHtml)) {
            query.put("OutputHtml", request.outputHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputScreenshot)) {
            query.put("OutputScreenshot", request.outputScreenshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDetailId)) {
            query.put("TaskDetailId", request.taskDetailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushRpaTaskDetail"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushRpaTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送运行时任务明细</p>
     * 
     * @param request PushRpaTaskDetailRequest
     * @return PushRpaTaskDetailResponse
     */
    public PushRpaTaskDetailResponse pushRpaTaskDetail(PushRpaTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushRpaTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴发送消息通知</p>
     * 
     * @param tmpReq SendNotificationForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendNotificationForPartnerResponse
     */
    public SendNotificationForPartnerResponse sendNotificationForPartnerWithOptions(SendNotificationForPartnerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendNotificationForPartnerShrinkRequest request = new SendNotificationForPartnerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.paramMap)) {
            request.paramMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.paramMap, "ParamMap", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.smartSubChannels)) {
            request.smartSubChannelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.smartSubChannels, "SmartSubChannels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            query.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifycationEventType)) {
            query.put("NotifycationEventType", request.notifycationEventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramMapShrink)) {
            query.put("ParamMap", request.paramMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendTarget)) {
            query.put("SendTarget", request.sendTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartSubChannelsShrink)) {
            query.put("SmartSubChannels", request.smartSubChannelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trackId)) {
            query.put("TrackId", request.trackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendNotificationForPartner"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendNotificationForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴发送消息通知</p>
     * 
     * @param request SendNotificationForPartnerRequest
     * @return SendNotificationForPartnerResponse
     */
    public SendNotificationForPartnerResponse sendNotificationForPartner(SendNotificationForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendNotificationForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>redis设置</p>
     * 
     * @param request SetRedisValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRedisValueResponse
     */
    public SetRedisValueResponse setRedisValueWithOptions(SetRedisValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            query.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            query.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            query.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            query.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            query.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            query.put("UserSecurityToken", request.userSecurityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRedisValue"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRedisValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>redis设置</p>
     * 
     * @param request SetRedisValueRequest
     * @return SetRedisValueResponse
     */
    public SetRedisValueResponse setRedisValue(SetRedisValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRedisValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新协议状态</p>
     * 
     * @param request UpdateAgreementStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgreementStatusResponse
     */
    public UpdateAgreementStatusResponse updateAgreementStatusWithOptions(UpdateAgreementStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementCode)) {
            query.put("AgreementCode", request.agreementCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgreementStatus"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgreementStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新协议状态</p>
     * 
     * @param request UpdateAgreementStatusRequest
     * @return UpdateAgreementStatusResponse
     */
    public UpdateAgreementStatusResponse updateAgreementStatus(UpdateAgreementStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgreementStatusWithOptions(request, runtime);
    }
}
