// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dypnsapi20170525.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dypnsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetAuthorizationUrlResponse getAuthorizationUrlWithOptions(GetAuthorizationUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthorizationUrl", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthorizationUrlResponse());
    }

    public GetAuthorizationUrlResponse getAuthorizationUrl(GetAuthorizationUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthorizationUrlWithOptions(request, runtime);
    }

    public GetSmsAuthTokensResponse getSmsAuthTokensWithOptions(GetSmsAuthTokensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSmsAuthTokens", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetSmsAuthTokensResponse());
    }

    public GetSmsAuthTokensResponse getSmsAuthTokens(GetSmsAuthTokensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSmsAuthTokensWithOptions(request, runtime);
    }

    public CreateVerifySchemeResponse createVerifySchemeWithOptions(CreateVerifySchemeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVerifyScheme", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVerifySchemeResponse());
    }

    public CreateVerifySchemeResponse createVerifyScheme(CreateVerifySchemeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVerifySchemeWithOptions(request, runtime);
    }

    public VerifySmsCodeResponse verifySmsCodeWithOptions(VerifySmsCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifySmsCode", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new VerifySmsCodeResponse());
    }

    public VerifySmsCodeResponse verifySmsCode(VerifySmsCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifySmsCodeWithOptions(request, runtime);
    }

    public DeleteVerifySchemeResponse deleteVerifySchemeWithOptions(DeleteVerifySchemeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVerifyScheme", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVerifySchemeResponse());
    }

    public DeleteVerifySchemeResponse deleteVerifyScheme(DeleteVerifySchemeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVerifySchemeWithOptions(request, runtime);
    }

    public VerifyPhoneWithTokenResponse verifyPhoneWithTokenWithOptions(VerifyPhoneWithTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyPhoneWithToken", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyPhoneWithTokenResponse());
    }

    public VerifyPhoneWithTokenResponse verifyPhoneWithToken(VerifyPhoneWithTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyPhoneWithTokenWithOptions(request, runtime);
    }

    public GetMobileResponse getMobileWithOptions(GetMobileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMobile", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetMobileResponse());
    }

    public GetMobileResponse getMobile(GetMobileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMobileWithOptions(request, runtime);
    }

    public TwiceTelVerifyResponse twiceTelVerifyWithOptions(TwiceTelVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TwiceTelVerify", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new TwiceTelVerifyResponse());
    }

    public TwiceTelVerifyResponse twiceTelVerify(TwiceTelVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.twiceTelVerifyWithOptions(request, runtime);
    }

    public GetCertifyResultResponse getCertifyResultWithOptions(GetCertifyResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCertifyResult", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetCertifyResultResponse());
    }

    public GetCertifyResultResponse getCertifyResult(GetCertifyResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCertifyResultWithOptions(request, runtime);
    }

    public DescribeVerifySchemeResponse describeVerifySchemeWithOptions(DescribeVerifySchemeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifyScheme", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifySchemeResponse());
    }

    public DescribeVerifySchemeResponse describeVerifyScheme(DescribeVerifySchemeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVerifySchemeWithOptions(request, runtime);
    }

    public GetAuthTokenResponse getAuthTokenWithOptions(GetAuthTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthToken", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthTokenResponse());
    }

    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthTokenWithOptions(request, runtime);
    }

    public VerifyMobileResponse verifyMobileWithOptions(VerifyMobileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyMobile", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyMobileResponse());
    }

    public VerifyMobileResponse verifyMobile(VerifyMobileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyMobileWithOptions(request, runtime);
    }
}
