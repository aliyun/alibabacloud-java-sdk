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

    public ActivateLicenseResponse activateLicense(ActivateLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateLicenseWithOptions(request, runtime);
    }

    public BusinessLicenseOcrResponse businessLicenseOcrWithOptions(BusinessLicenseOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileInfo)) {
            query.put("FileInfo", request.fileInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileStoreType)) {
            query.put("FileStoreType", request.fileStoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BusinessLicenseOcr"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BusinessLicenseOcrResponse());
    }

    public BusinessLicenseOcrResponse businessLicenseOcr(BusinessLicenseOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.businessLicenseOcrWithOptions(request, runtime);
    }

    public CallbackTaskResponse callbackTaskWithOptions(CallbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
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

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalKey)) {
            query.put("PrincipalKey", request.principalKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public CallbackTaskResponse callbackTask(CallbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.callbackTaskWithOptions(request, runtime);
    }

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

    public DescribeAgreementStatusResponse describeAgreementStatus(DescribeAgreementStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgreementStatusWithOptions(request, runtime);
    }

    public GetNodeByFlowIdResponse getNodeByFlowIdWithOptions(GetNodeByFlowIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public GetNodeByFlowIdResponse getNodeByFlowId(GetNodeByFlowIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeByFlowIdWithOptions(request, runtime);
    }

    public GetNodeByTemplateIdResponse getNodeByTemplateIdWithOptions(GetNodeByTemplateIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public GetNodeByTemplateIdResponse getNodeByTemplateId(GetNodeByTemplateIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeByTemplateIdWithOptions(request, runtime);
    }

    public GetProxyByTypeResponse getProxyByTypeWithOptions(GetProxyByTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public GetProxyByTypeResponse getProxyByType(GetProxyByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProxyByTypeWithOptions(request, runtime);
    }

    public GetRedisValueResponse getRedisValueWithOptions(GetRedisValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public GetRedisValueResponse getRedisValue(GetRedisValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRedisValueWithOptions(request, runtime);
    }

    public GetVariableResponse getVariableWithOptions(GetVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public GetVariableResponse getVariable(GetVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVariableWithOptions(request, runtime);
    }

    public IdentifyCodeResponse identifyCodeWithOptions(IdentifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
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

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public IdentifyCodeResponse identifyCode(IdentifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.identifyCodeWithOptions(request, runtime);
    }

    public IdentityCardOcrResponse identityCardOcrWithOptions(IdentityCardOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileInfo)) {
            query.put("FileInfo", request.fileInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileStoreType)) {
            query.put("FileStoreType", request.fileStoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdentityCardOcr"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdentityCardOcrResponse());
    }

    public IdentityCardOcrResponse identityCardOcr(IdentityCardOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.identityCardOcrWithOptions(request, runtime);
    }

    public PullRpaModelResponse pullRpaModelWithOptions(PullRpaModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public PullRpaModelResponse pullRpaModel(PullRpaModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pullRpaModelWithOptions(request, runtime);
    }

    public PullTaskResponse pullTaskWithOptions(PullTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalKey)) {
            query.put("PrincipalKey", request.principalKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public PullTaskResponse pullTask(PullTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pullTaskWithOptions(request, runtime);
    }

    public PushRpaTaskResponse pushRpaTaskWithOptions(PushRpaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
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

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            query.put("Request", request.request);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.response)) {
            query.put("Response", request.response);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public PushRpaTaskResponse pushRpaTask(PushRpaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushRpaTaskWithOptions(request, runtime);
    }

    public PushRpaTaskDetailResponse pushRpaTaskDetailWithOptions(PushRpaTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
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

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
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

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public PushRpaTaskDetailResponse pushRpaTaskDetail(PushRpaTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushRpaTaskDetailWithOptions(request, runtime);
    }

    public SetRedisValueResponse setRedisValueWithOptions(SetRedisValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            query.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            query.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            query.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            query.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            query.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            query.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            query.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            query.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            query.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            query.put("StsTokenCallerUid", request.stsTokenCallerUid);
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

    public SetRedisValueResponse setRedisValue(SetRedisValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRedisValueWithOptions(request, runtime);
    }

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

    public UpdateAgreementStatusResponse updateAgreementStatus(UpdateAgreementStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgreementStatusWithOptions(request, runtime);
    }
}
