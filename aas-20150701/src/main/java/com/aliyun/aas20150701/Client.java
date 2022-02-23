// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701;

import com.aliyun.tea.*;
import com.aliyun.aas20150701.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "aas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "aas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "aas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "aas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "aas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "aas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "aas.aliyuncs.com"),
            new TeaPair("cn-fujian", "aas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "aas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "aas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "aas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "aas.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "aas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "aas.aliyuncs.com"),
            new TeaPair("cn-shanghai", "aas-vpc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "aas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "aas.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "aas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "aas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "aas.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "aas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "aas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "aas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "aas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "aas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "aas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "aas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "aas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "aas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "aas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "aas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "aas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "aas.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ChangePreferredLanguageResponse changePreferredLanguageWithOptions(ChangePreferredLanguageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preferredLanguage)) {
            query.put("PreferredLanguage", request.preferredLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangePreferredLanguage"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangePreferredLanguageResponse());
    }

    public ChangePreferredLanguageResponse changePreferredLanguage(ChangePreferredLanguageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changePreferredLanguageWithOptions(request, runtime);
    }

    public CheckMfaBindResponse checkMfaBindWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMfaBind"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMfaBindResponse());
    }

    public CheckMfaBindResponse checkMfaBind() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMfaBindWithOptions(runtime);
    }

    public CreateAccessKeyForAccountResponse createAccessKeyForAccountWithOptions(CreateAccessKeyForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AKSecret)) {
            query.put("AKSecret", request.AKSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessKeyForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessKeyForAccountResponse());
    }

    public CreateAccessKeyForAccountResponse createAccessKeyForAccount(CreateAccessKeyForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccessKeyForAccountWithOptions(request, runtime);
    }

    public CreateAliyunAccountResponse createAliyunAccountWithOptions(CreateAliyunAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunId)) {
            query.put("AliyunId", request.aliyunId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAliyunAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliyunAccountResponse());
    }

    public CreateAliyunAccountResponse createAliyunAccount(CreateAliyunAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliyunAccountWithOptions(request, runtime);
    }

    public CreateAliyunAccountWithBindHidResponse createAliyunAccountWithBindHidWithOptions(CreateAliyunAccountWithBindHidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.innerAccountHid)) {
            query.put("InnerAccountHid", request.innerAccountHid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAliyunAccountWithBindHid"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliyunAccountWithBindHidResponse());
    }

    public CreateAliyunAccountWithBindHidResponse createAliyunAccountWithBindHid(CreateAliyunAccountWithBindHidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliyunAccountWithBindHidWithOptions(request, runtime);
    }

    public CreateIntlAliyunAccountResponse createIntlAliyunAccountWithOptions(CreateIntlAliyunAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nationalityCode)) {
            query.put("NationalityCode", request.nationalityCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntlAliyunAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntlAliyunAccountResponse());
    }

    public CreateIntlAliyunAccountResponse createIntlAliyunAccount(CreateIntlAliyunAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntlAliyunAccountWithOptions(request, runtime);
    }

    public CreateShortTermAccessKeyForAccountResponse createShortTermAccessKeyForAccountWithOptions(CreateShortTermAccessKeyForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMfaPresent)) {
            query.put("IsMfaPresent", request.isMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShortTermAccessKeyForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShortTermAccessKeyForAccountResponse());
    }

    public CreateShortTermAccessKeyForAccountResponse createShortTermAccessKeyForAccount(CreateShortTermAccessKeyForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createShortTermAccessKeyForAccountWithOptions(request, runtime);
    }

    public DeleteAccessKeyForAccountResponse deleteAccessKeyForAccountWithOptions(DeleteAccessKeyForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AKId)) {
            query.put("AKId", request.AKId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessKeyForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessKeyForAccountResponse());
    }

    public DeleteAccessKeyForAccountResponse deleteAccessKeyForAccount(DeleteAccessKeyForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccessKeyForAccountWithOptions(request, runtime);
    }

    public GenerateAccountLoginTokenResponse generateAccountLoginTokenWithOptions(GenerateAccountLoginTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetPk)) {
            query.put("TargetPk", request.targetPk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAccountLoginToken"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAccountLoginTokenResponse());
    }

    public GenerateAccountLoginTokenResponse generateAccountLoginToken(GenerateAccountLoginTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAccountLoginTokenWithOptions(request, runtime);
    }

    public GenerateAliyunBidCertWaysUrlResponse generateAliyunBidCertWaysUrlWithOptions(GenerateAliyunBidCertWaysUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPk)) {
            query.put("AliyunPk", request.aliyunPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bidType)) {
            query.put("BidType", request.bidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMobile)) {
            query.put("IsMobile", request.isMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpenApp)) {
            query.put("IsOpenApp", request.isOpenApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subjectType)) {
            query.put("SubjectType", request.subjectType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAliyunBidCertWaysUrl"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAliyunBidCertWaysUrlResponse());
    }

    public GenerateAliyunBidCertWaysUrlResponse generateAliyunBidCertWaysUrl(GenerateAliyunBidCertWaysUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAliyunBidCertWaysUrlWithOptions(request, runtime);
    }

    public GetAliyunAccountWithBindHidResponse getAliyunAccountWithBindHidWithOptions(GetAliyunAccountWithBindHidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.innerAccountHid)) {
            query.put("InnerAccountHid", request.innerAccountHid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliyunAccountWithBindHid"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliyunAccountWithBindHidResponse());
    }

    public GetAliyunAccountWithBindHidResponse getAliyunAccountWithBindHid(GetAliyunAccountWithBindHidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunAccountWithBindHidWithOptions(request, runtime);
    }

    public GetAliyunAccountWithBindTaobaoHidResponse getAliyunAccountWithBindTaobaoHidWithOptions(GetAliyunAccountWithBindTaobaoHidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliyunAccountWithBindTaobaoHid"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliyunAccountWithBindTaobaoHidResponse());
    }

    public GetAliyunAccountWithBindTaobaoHidResponse getAliyunAccountWithBindTaobaoHid(GetAliyunAccountWithBindTaobaoHidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunAccountWithBindTaobaoHidWithOptions(request, runtime);
    }

    public GetBasicInfoForAccountResponse getBasicInfoForAccountWithOptions(GetBasicInfoForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunId)) {
            query.put("AliyunId", request.aliyunId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBasicInfoForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBasicInfoForAccountResponse());
    }

    public GetBasicInfoForAccountResponse getBasicInfoForAccount(GetBasicInfoForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBasicInfoForAccountWithOptions(request, runtime);
    }

    public GetShortTermAccessKeyForAccountResponse getShortTermAccessKeyForAccountWithOptions(GetShortTermAccessKeyForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMfaPresent)) {
            query.put("IsMfaPresent", request.isMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShortTermAccessKeyForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetShortTermAccessKeyForAccountResponse());
    }

    public GetShortTermAccessKeyForAccountResponse getShortTermAccessKeyForAccount(GetShortTermAccessKeyForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getShortTermAccessKeyForAccountWithOptions(request, runtime);
    }

    public ListAccessKeysForAccountResponse listAccessKeysForAccountWithOptions(ListAccessKeysForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AKStatus)) {
            query.put("AKStatus", request.AKStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.AKType)) {
            query.put("AKType", request.AKType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessKeysForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessKeysForAccountResponse());
    }

    public ListAccessKeysForAccountResponse listAccessKeysForAccount(ListAccessKeysForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccessKeysForAccountWithOptions(request, runtime);
    }

    public ListAliyunAccountResponse listAliyunAccountWithOptions(ListAliyunAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliyunAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliyunAccountResponse());
    }

    public ListAliyunAccountResponse listAliyunAccount(ListAliyunAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAliyunAccountWithOptions(request, runtime);
    }

    public UpdateAccessKeyStatusForAccountResponse updateAccessKeyStatusForAccountWithOptions(UpdateAccessKeyStatusForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.AKId)) {
            query.put("AKId", request.AKId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.AKStatus)) {
            query.put("AKStatus", request.AKStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccessKeyStatusForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccessKeyStatusForAccountResponse());
    }

    public UpdateAccessKeyStatusForAccountResponse updateAccessKeyStatusForAccount(UpdateAccessKeyStatusForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccessKeyStatusForAccountWithOptions(request, runtime);
    }

    public UpdatePasswordForAccountResponse updatePasswordForAccountWithOptions(UpdatePasswordForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newPassword)) {
            query.put("NewPassword", request.newPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePasswordForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePasswordForAccountResponse());
    }

    public UpdatePasswordForAccountResponse updatePasswordForAccount(UpdatePasswordForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePasswordForAccountWithOptions(request, runtime);
    }

    public UpdateStatusForAccountResponse updateStatusForAccountWithOptions(UpdateStatusForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountStatus)) {
            query.put("AccountStatus", request.accountStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeReason)) {
            query.put("ChangeReason", request.changeReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStatusForAccount"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStatusForAccountResponse());
    }

    public UpdateStatusForAccountResponse updateStatusForAccount(UpdateStatusForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStatusForAccountWithOptions(request, runtime);
    }

    public VerifyAccountLoginTokenResponse verifyAccountLoginTokenWithOptions(VerifyAccountLoginTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            query.put("LoginToken", request.loginToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAccountLoginToken"),
            new TeaPair("version", "2015-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyAccountLoginTokenResponse());
    }

    public VerifyAccountLoginTokenResponse verifyAccountLoginToken(VerifyAccountLoginTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyAccountLoginTokenWithOptions(request, runtime);
    }
}
