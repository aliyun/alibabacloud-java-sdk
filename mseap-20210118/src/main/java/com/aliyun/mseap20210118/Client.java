// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118;

import com.aliyun.tea.*;
import com.aliyun.mseap20210118.models.*;
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

    public ActivateLicenseResponse activateLicenseWithOptions(ActivateLicenseRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateLicenseWithOptions(request, runtime);
    }

    public BusinessLicenseOcrResponse businessLicenseOcrWithOptions(BusinessLicenseOcrRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.businessLicenseOcrWithOptions(request, runtime);
    }

    public DescribeAgreementStatusResponse describeAgreementStatusWithOptions(DescribeAgreementStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementCode)) {
            query.put("AgreementCode", request.agreementCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAgreementStatusWithOptions(request, runtime);
    }

    public GetNodeByFlowIdResponse getNodeByFlowIdWithOptions(GetNodeByFlowIdRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNodeByFlowIdWithOptions(request, runtime);
    }

    public GetRedisValueResponse getRedisValueWithOptions(GetRedisValueRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRedisValueWithOptions(request, runtime);
    }

    public GetVariableResponse getVariableWithOptions(GetVariableRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVariableWithOptions(request, runtime);
    }

    public IdentifyCodeResponse identifyCodeWithOptions(IdentifyCodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.identifyCodeWithOptions(request, runtime);
    }

    public QueryTrademarkDetailByApplyNumberResponse queryTrademarkDetailByApplyNumberWithOptions(QueryTrademarkDetailByApplyNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            body.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            body.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyNumber)) {
            body.put("ApplyNumber", request.applyNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            body.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            body.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            body.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            body.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            body.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            body.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            body.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            body.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            body.put("StsTokenCallerUid", request.stsTokenCallerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            body.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            body.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            body.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            body.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            body.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            body.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            body.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            body.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            body.put("UserSecurityToken", request.userSecurityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkDetailByApplyNumber"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkDetailByApplyNumberResponse());
    }

    public QueryTrademarkDetailByApplyNumberResponse queryTrademarkDetailByApplyNumber(QueryTrademarkDetailByApplyNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkDetailByApplyNumberWithOptions(request, runtime);
    }

    public QueryTrademarkDetailByApplyNumber1Response queryTrademarkDetailByApplyNumber1WithOptions(QueryTrademarkDetailByApplyNumber1Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            body.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKpLong)) {
            body.put("AliyunKpLong", request.aliyunKpLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyNumber)) {
            body.put("ApplyNumber", request.applyNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerSecurityTransport)) {
            body.put("CallerSecurityTransport", request.callerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            body.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalRequest)) {
            body.put("OriginalRequest", request.originalRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popAction)) {
            body.put("PopAction", request.popAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerIp)) {
            body.put("ProxyCallerIp", request.proxyCallerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyCallerSecurityTransport)) {
            body.put("ProxyCallerSecurityTransport", request.proxyCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            body.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            body.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            body.put("StsTokenCallerUid", request.stsTokenCallerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            body.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBid)) {
            body.put("UserBid", request.userBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerParentId)) {
            body.put("UserCallerParentId", request.userCallerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerSecurityTransport)) {
            body.put("UserCallerSecurityTransport", request.userCallerSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCallerType)) {
            body.put("UserCallerType", request.userCallerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            body.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKp)) {
            body.put("UserKp", request.userKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMfaPresent)) {
            body.put("UserMfaPresent", request.userMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSecurityToken)) {
            body.put("UserSecurityToken", request.userSecurityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkDetailByApplyNumber1"),
            new TeaPair("version", "2021-01-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkDetailByApplyNumber1Response());
    }

    public QueryTrademarkDetailByApplyNumber1Response queryTrademarkDetailByApplyNumber1(QueryTrademarkDetailByApplyNumber1Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkDetailByApplyNumber1WithOptions(request, runtime);
    }

    public SetRedisValueResponse setRedisValueWithOptions(SetRedisValueRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRedisValueWithOptions(request, runtime);
    }

    public UpdateAgreementStatusResponse updateAgreementStatusWithOptions(UpdateAgreementStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementCode)) {
            query.put("AgreementCode", request.agreementCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgreementStatusWithOptions(request, runtime);
    }
}
