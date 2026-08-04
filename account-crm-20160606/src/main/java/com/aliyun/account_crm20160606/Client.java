// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606;

import com.aliyun.tea.*;
import com.aliyun.account_crm20160606.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("account-crm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AccountOneKeyDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AccountOneKeyDeleteResponse
     */
    public AccountOneKeyDeleteResponse accountOneKeyDeleteWithOptions(AccountOneKeyDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccountOneKeyDelete"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccountOneKeyDeleteResponse());
    }

    /**
     * @param request AccountOneKeyDeleteRequest
     * @return AccountOneKeyDeleteResponse
     */
    public AccountOneKeyDeleteResponse accountOneKeyDelete(AccountOneKeyDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.accountOneKeyDeleteWithOptions(request, runtime);
    }

    /**
     * @param request AddCustomerLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomerLabelResponse
     */
    public AddCustomerLabelResponse addCustomerLabelWithOptions(AddCustomerLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endtime)) {
            query.put("Endtime", request.endtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTypes)) {
            query.put("LabelTypes", request.labelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomerLabel"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomerLabelResponse());
    }

    /**
     * @param request AddCustomerLabelRequest
     * @return AddCustomerLabelResponse
     */
    public AddCustomerLabelResponse addCustomerLabel(AddCustomerLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomerLabelWithOptions(request, runtime);
    }

    /**
     * @param request AllowAgAccountLoginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllowAgAccountLoginResponse
     */
    public AllowAgAccountLoginResponse allowAgAccountLoginWithOptions(AllowAgAccountLoginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllowAgAccountLogin"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllowAgAccountLoginResponse());
    }

    /**
     * @param request AllowAgAccountLoginRequest
     * @return AllowAgAccountLoginResponse
     */
    public AllowAgAccountLoginResponse allowAgAccountLogin(AllowAgAccountLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allowAgAccountLoginWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request ApplyAgOneKeyDeleteTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAgOneKeyDeleteTaskResponse
     */
    public ApplyAgOneKeyDeleteTaskResponse applyAgOneKeyDeleteTaskWithOptions(ApplyAgOneKeyDeleteTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abandonedDependency)) {
            query.put("AbandonedDependency", request.abandonedDependency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAgOneKeyDeleteTask"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAgOneKeyDeleteTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request ApplyAgOneKeyDeleteTaskRequest
     * @return ApplyAgOneKeyDeleteTaskResponse
     */
    public ApplyAgOneKeyDeleteTaskResponse applyAgOneKeyDeleteTask(ApplyAgOneKeyDeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAgOneKeyDeleteTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request ApplyAgOneKeyOnlyCheckerTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAgOneKeyOnlyCheckerTaskResponse
     */
    public ApplyAgOneKeyOnlyCheckerTaskResponse applyAgOneKeyOnlyCheckerTaskWithOptions(ApplyAgOneKeyOnlyCheckerTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAgOneKeyOnlyCheckerTask"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAgOneKeyOnlyCheckerTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request ApplyAgOneKeyOnlyCheckerTaskRequest
     * @return ApplyAgOneKeyOnlyCheckerTaskResponse
     */
    public ApplyAgOneKeyOnlyCheckerTaskResponse applyAgOneKeyOnlyCheckerTask(ApplyAgOneKeyOnlyCheckerTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAgOneKeyOnlyCheckerTaskWithOptions(request, runtime);
    }

    /**
     * @param request ApplyIdentityRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyIdentityRegistrationResponse
     */
    public ApplyIdentityRegistrationResponse applyIdentityRegistrationWithOptions(ApplyIdentityRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docBackPic)) {
            query.put("DocBackPic", request.docBackPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docFrontPic)) {
            query.put("DocFrontPic", request.docFrontPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docNum)) {
            query.put("DocNum", request.docNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullName)) {
            query.put("FullName", request.fullName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registeredAddress)) {
            query.put("RegisteredAddress", request.registeredAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registeredCountry)) {
            query.put("RegisteredCountry", request.registeredCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registeredNum)) {
            query.put("RegisteredNum", request.registeredNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            query.put("Tel", request.tel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyIdentityRegistration"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyIdentityRegistrationResponse());
    }

    /**
     * @param request ApplyIdentityRegistrationRequest
     * @return ApplyIdentityRegistrationResponse
     */
    public ApplyIdentityRegistrationResponse applyIdentityRegistration(ApplyIdentityRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyIdentityRegistrationWithOptions(request, runtime);
    }

    /**
     * @param request AsyncCreateAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AsyncCreateAgAccountResponse
     */
    public AsyncCreateAgAccountResponse asyncCreateAgAccountWithOptions(AsyncCreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginEmail)) {
            query.put("LoginEmail", request.loginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maserAccountInfo)) {
            query.put("MaserAccountInfo", request.maserAccountInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsyncCreateAgAccount"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsyncCreateAgAccountResponse());
    }

    /**
     * @param request AsyncCreateAgAccountRequest
     * @return AsyncCreateAgAccountResponse
     */
    public AsyncCreateAgAccountResponse asyncCreateAgAccount(AsyncCreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asyncCreateAgAccountWithOptions(request, runtime);
    }

    /**
     * @param request AsyncModifyAgLoginEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AsyncModifyAgLoginEmailResponse
     */
    public AsyncModifyAgLoginEmailResponse asyncModifyAgLoginEmailWithOptions(AsyncModifyAgLoginEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newLoginEmail)) {
            query.put("NewLoginEmail", request.newLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsyncModifyAgLoginEmail"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsyncModifyAgLoginEmailResponse());
    }

    /**
     * @param request AsyncModifyAgLoginEmailRequest
     * @return AsyncModifyAgLoginEmailResponse
     */
    public AsyncModifyAgLoginEmailResponse asyncModifyAgLoginEmail(AsyncModifyAgLoginEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asyncModifyAgLoginEmailWithOptions(request, runtime);
    }

    /**
     * @param request AuthAndActiveWithHidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthAndActiveWithHidResponse
     */
    public AuthAndActiveWithHidResponse authAndActiveWithHidWithOptions(AuthAndActiveWithHidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthAndActiveWithHid"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthAndActiveWithHidResponse());
    }

    /**
     * @param request AuthAndActiveWithHidRequest
     * @return AuthAndActiveWithHidResponse
     */
    public AuthAndActiveWithHidResponse authAndActiveWithHid(AuthAndActiveWithHidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authAndActiveWithHidWithOptions(request, runtime);
    }

    /**
     * @param request AuthAndRefreshLoginTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthAndRefreshLoginTicketResponse
     */
    public AuthAndRefreshLoginTicketResponse authAndRefreshLoginTicketWithOptions(AuthAndRefreshLoginTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthAndRefreshLoginTicket"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthAndRefreshLoginTicketResponse());
    }

    /**
     * @param request AuthAndRefreshLoginTicketRequest
     * @return AuthAndRefreshLoginTicketResponse
     */
    public AuthAndRefreshLoginTicketResponse authAndRefreshLoginTicket(AuthAndRefreshLoginTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authAndRefreshLoginTicketWithOptions(request, runtime);
    }

    /**
     * @param request AuthLoginTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthLoginTicketResponse
     */
    public AuthLoginTicketResponse authLoginTicketWithOptions(AuthLoginTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorAuthCode)) {
            query.put("MinorAuthCode", request.minorAuthCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthLoginTicket"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthLoginTicketResponse());
    }

    /**
     * @param request AuthLoginTicketRequest
     * @return AuthLoginTicketResponse
     */
    public AuthLoginTicketResponse authLoginTicket(AuthLoginTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authLoginTicketWithOptions(request, runtime);
    }

    /**
     * @param request BatchQueryAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryAgAccountResponse
     */
    public BatchQueryAgAccountResponse batchQueryAgAccountWithOptions(BatchQueryAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkList)) {
            query.put("PkList", request.pkList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryAgAccount"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryAgAccountResponse());
    }

    /**
     * @param request BatchQueryAgAccountRequest
     * @return BatchQueryAgAccountResponse
     */
    public BatchQueryAgAccountResponse batchQueryAgAccount(BatchQueryAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQueryAgAccountWithOptions(request, runtime);
    }

    /**
     * @param request BatchQueryCreateAccountTraceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryCreateAccountTraceResponse
     */
    public BatchQueryCreateAccountTraceResponse batchQueryCreateAccountTraceWithOptions(BatchQueryCreateAccountTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNoList)) {
            query.put("TraceNoList", request.traceNoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryCreateAccountTrace"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryCreateAccountTraceResponse());
    }

    /**
     * @param request BatchQueryCreateAccountTraceRequest
     * @return BatchQueryCreateAccountTraceResponse
     */
    public BatchQueryCreateAccountTraceResponse batchQueryCreateAccountTrace(BatchQueryCreateAccountTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQueryCreateAccountTraceWithOptions(request, runtime);
    }

    /**
     * @param request BatchQueryModifyLoginEmailTraceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryModifyLoginEmailTraceResponse
     */
    public BatchQueryModifyLoginEmailTraceResponse batchQueryModifyLoginEmailTraceWithOptions(BatchQueryModifyLoginEmailTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNoList)) {
            query.put("TraceNoList", request.traceNoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryModifyLoginEmailTrace"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryModifyLoginEmailTraceResponse());
    }

    /**
     * @param request BatchQueryModifyLoginEmailTraceRequest
     * @return BatchQueryModifyLoginEmailTraceResponse
     */
    public BatchQueryModifyLoginEmailTraceResponse batchQueryModifyLoginEmailTrace(BatchQueryModifyLoginEmailTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQueryModifyLoginEmailTraceWithOptions(request, runtime);
    }

    /**
     * @param request CancelAsyncCreateAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAsyncCreateAgAccountResponse
     */
    public CancelAsyncCreateAgAccountResponse cancelAsyncCreateAgAccountWithOptions(CancelAsyncCreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAsyncCreateAgAccount"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAsyncCreateAgAccountResponse());
    }

    /**
     * @param request CancelAsyncCreateAgAccountRequest
     * @return CancelAsyncCreateAgAccountResponse
     */
    public CancelAsyncCreateAgAccountResponse cancelAsyncCreateAgAccount(CancelAsyncCreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAsyncCreateAgAccountWithOptions(request, runtime);
    }

    /**
     * @param request CancelAsyncModifyLoginEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAsyncModifyLoginEmailResponse
     */
    public CancelAsyncModifyLoginEmailResponse cancelAsyncModifyLoginEmailWithOptions(CancelAsyncModifyLoginEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAsyncModifyLoginEmail"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAsyncModifyLoginEmailResponse());
    }

    /**
     * @param request CancelAsyncModifyLoginEmailRequest
     * @return CancelAsyncModifyLoginEmailResponse
     */
    public CancelAsyncModifyLoginEmailResponse cancelAsyncModifyLoginEmail(CancelAsyncModifyLoginEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAsyncModifyLoginEmailWithOptions(request, runtime);
    }

    /**
     * @param request ChangeAgAccountNationalityCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAgAccountNationalityCodeResponse
     */
    public ChangeAgAccountNationalityCodeResponse changeAgAccountNationalityCodeWithOptions(ChangeAgAccountNationalityCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nationalityCode)) {
            query.put("NationalityCode", request.nationalityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAgAccountNationalityCode"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAgAccountNationalityCodeResponse());
    }

    /**
     * @param request ChangeAgAccountNationalityCodeRequest
     * @return ChangeAgAccountNationalityCodeResponse
     */
    public ChangeAgAccountNationalityCodeResponse changeAgAccountNationalityCode(ChangeAgAccountNationalityCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAgAccountNationalityCodeWithOptions(request, runtime);
    }

    /**
     * @param request ChangeAgSecurityEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAgSecurityEmailResponse
     */
    public ChangeAgSecurityEmailResponse changeAgSecurityEmailWithOptions(ChangeAgSecurityEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEmail)) {
            query.put("SecurityEmail", request.securityEmail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAgSecurityEmail"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAgSecurityEmailResponse());
    }

    /**
     * @param request ChangeAgSecurityEmailRequest
     * @return ChangeAgSecurityEmailResponse
     */
    public ChangeAgSecurityEmailResponse changeAgSecurityEmail(ChangeAgSecurityEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAgSecurityEmailWithOptions(request, runtime);
    }

    /**
     * @param request ChangeAgSecurityMobileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAgSecurityMobileResponse
     */
    public ChangeAgSecurityMobileResponse changeAgSecurityMobileWithOptions(ChangeAgSecurityMobileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityMobile)) {
            query.put("SecurityMobile", request.securityMobile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAgSecurityMobile"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAgSecurityMobileResponse());
    }

    /**
     * @param request ChangeAgSecurityMobileRequest
     * @return ChangeAgSecurityMobileResponse
     */
    public ChangeAgSecurityMobileResponse changeAgSecurityMobile(ChangeAgSecurityMobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAgSecurityMobileWithOptions(request, runtime);
    }

    /**
     * @param request CreateAccountProfileInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountProfileInfoResponse
     */
    public CreateAccountProfileInfoResponse createAccountProfileInfoWithOptions(CreateAccountProfileInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountJson)) {
            query.put("AccountJson", request.accountJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccountProfileInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountProfileInfoResponse());
    }

    /**
     * @param request CreateAccountProfileInfoRequest
     * @return CreateAccountProfileInfoResponse
     */
    public CreateAccountProfileInfoResponse createAccountProfileInfo(CreateAccountProfileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountProfileInfoWithOptions(request, runtime);
    }

    /**
     * @param request CreateAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgAccountResponse
     */
    public CreateAgAccountResponse createAgAccountWithOptions(CreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginEmail)) {
            query.put("LoginEmail", request.loginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nationCode)) {
            query.put("NationCode", request.nationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.own)) {
            query.put("Own", request.own);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realParentPk)) {
            query.put("RealParentPk", request.realParentPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityMobile)) {
            query.put("SecurityMobile", request.securityMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showNickName)) {
            query.put("ShowNickName", request.showNickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteNick)) {
            query.put("SiteNick", request.siteNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcAccountInfo)) {
            query.put("srcAccountInfo", request.srcAccountInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgAccount"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgAccountResponse());
    }

    /**
     * @param request CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgAccountWithOptions(request, runtime);
    }

    /**
     * @param request CreateContacterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContacterResponse
     */
    public CreateContacterResponse createContacterWithOptions(CreateContacterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contacterAddress)) {
            query.put("ContacterAddress", request.contacterAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterDingding)) {
            query.put("ContacterDingding", request.contacterDingding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterEmail)) {
            query.put("ContacterEmail", request.contacterEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterMobile)) {
            query.put("ContacterMobile", request.contacterMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterName)) {
            query.put("ContacterName", request.contacterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterPosition)) {
            query.put("ContacterPosition", request.contacterPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterStaffNo)) {
            query.put("ContacterStaffNo", request.contacterStaffNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterType)) {
            query.put("ContacterType", request.contacterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterWangwang)) {
            query.put("ContacterWangwang", request.contacterWangwang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailConfirmed)) {
            query.put("EmailConfirmed", request.emailConfirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileConfirmed)) {
            query.put("MobileConfirmed", request.mobileConfirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContacter"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContacterResponse());
    }

    /**
     * @param request CreateContacterRequest
     * @return CreateContacterResponse
     */
    public CreateContacterResponse createContacter(CreateContacterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContacterWithOptions(request, runtime);
    }

    /**
     * @param request CreateRealNameCertificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRealNameCertificationResponse
     */
    public CreateRealNameCertificationResponse createRealNameCertificationWithOptions(CreateRealNameCertificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountCertifyType)) {
            query.put("AccountCertifyType", request.accountCertifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corporateLicenseNumber)) {
            query.put("CorporateLicenseNumber", request.corporateLicenseNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corporateName)) {
            query.put("CorporateName", request.corporateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNumber)) {
            query.put("LicenseNumber", request.licenseNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            query.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRealNameCertification"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRealNameCertificationResponse());
    }

    /**
     * @param request CreateRealNameCertificationRequest
     * @return CreateRealNameCertificationResponse
     */
    public CreateRealNameCertificationResponse createRealNameCertification(CreateRealNameCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRealNameCertificationWithOptions(request, runtime);
    }

    /**
     * @param request CustomerSensitiveInfoLogicalDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CustomerSensitiveInfoLogicalDeleteResponse
     */
    public CustomerSensitiveInfoLogicalDeleteResponse customerSensitiveInfoLogicalDeleteWithOptions(CustomerSensitiveInfoLogicalDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomerSensitiveInfoLogicalDelete"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomerSensitiveInfoLogicalDeleteResponse());
    }

    /**
     * @param request CustomerSensitiveInfoLogicalDeleteRequest
     * @return CustomerSensitiveInfoLogicalDeleteResponse
     */
    public CustomerSensitiveInfoLogicalDeleteResponse customerSensitiveInfoLogicalDelete(CustomerSensitiveInfoLogicalDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.customerSensitiveInfoLogicalDeleteWithOptions(request, runtime);
    }

    /**
     * @param request CustomerSensitiveInfoPhysicalDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CustomerSensitiveInfoPhysicalDeleteResponse
     */
    public CustomerSensitiveInfoPhysicalDeleteResponse customerSensitiveInfoPhysicalDeleteWithOptions(CustomerSensitiveInfoPhysicalDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomerSensitiveInfoPhysicalDelete"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomerSensitiveInfoPhysicalDeleteResponse());
    }

    /**
     * @param request CustomerSensitiveInfoPhysicalDeleteRequest
     * @return CustomerSensitiveInfoPhysicalDeleteResponse
     */
    public CustomerSensitiveInfoPhysicalDeleteResponse customerSensitiveInfoPhysicalDelete(CustomerSensitiveInfoPhysicalDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.customerSensitiveInfoPhysicalDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步Del缓存操作</p>
     * 
     * @param request DelCacheOperateSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelCacheOperateSyncResponse
     */
    public DelCacheOperateSyncResponse delCacheOperateSyncWithOptions(DelCacheOperateSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelCacheOperateSync"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelCacheOperateSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步Del缓存操作</p>
     * 
     * @param request DelCacheOperateSyncRequest
     * @return DelCacheOperateSyncResponse
     */
    public DelCacheOperateSyncResponse delCacheOperateSync(DelCacheOperateSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delCacheOperateSyncWithOptions(request, runtime);
    }

    /**
     * @param request DeleteContacterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContacterResponse
     */
    public DeleteContacterResponse deleteContacterWithOptions(DeleteContacterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contacterId)) {
            query.put("ContacterId", request.contacterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContacter"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContacterResponse());
    }

    /**
     * @param request DeleteContacterRequest
     * @return DeleteContacterResponse
     */
    public DeleteContacterResponse deleteContacter(DeleteContacterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContacterWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCustomerLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomerLabelResponse
     */
    public DeleteCustomerLabelResponse deleteCustomerLabelWithOptions(DeleteCustomerLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTypes)) {
            query.put("LabelTypes", request.labelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomerLabel"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomerLabelResponse());
    }

    /**
     * @param request DeleteCustomerLabelRequest
     * @return DeleteCustomerLabelResponse
     */
    public DeleteCustomerLabelResponse deleteCustomerLabel(DeleteCustomerLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomerLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据outerId查询是否存在绑定关系</p>
     * 
     * @param request ExistBindsByOuterIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExistBindsByOuterIdResponse
     */
    public ExistBindsByOuterIdResponse existBindsByOuterIdWithOptions(ExistBindsByOuterIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExistBindsByOuterId"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExistBindsByOuterIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据outerId查询是否存在绑定关系</p>
     * 
     * @param request ExistBindsByOuterIdRequest
     * @return ExistBindsByOuterIdResponse
     */
    public ExistBindsByOuterIdResponse existBindsByOuterId(ExistBindsByOuterIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.existBindsByOuterIdWithOptions(request, runtime);
    }

    /**
     * @param request FindAllContacterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindAllContacterResponse
     */
    public FindAllContacterResponse findAllContacterWithOptions(FindAllContacterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindAllContacter"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindAllContacterResponse());
    }

    /**
     * @param request FindAllContacterRequest
     * @return FindAllContacterResponse
     */
    public FindAllContacterResponse findAllContacter(FindAllContacterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findAllContacterWithOptions(request, runtime);
    }

    /**
     * @param request FindBizCategoryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindBizCategoryConfigResponse
     */
    public FindBizCategoryConfigResponse findBizCategoryConfigWithOptions(FindBizCategoryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindBizCategoryConfig"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindBizCategoryConfigResponse());
    }

    /**
     * @param request FindBizCategoryConfigRequest
     * @return FindBizCategoryConfigResponse
     */
    public FindBizCategoryConfigResponse findBizCategoryConfig(FindBizCategoryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findBizCategoryConfigWithOptions(request, runtime);
    }

    /**
     * @param request FindContacterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindContacterResponse
     */
    public FindContacterResponse findContacterWithOptions(FindContacterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contacterId)) {
            query.put("ContacterId", request.contacterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindContacter"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindContacterResponse());
    }

    /**
     * @param request FindContacterRequest
     * @return FindContacterResponse
     */
    public FindContacterResponse findContacter(FindContacterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findContacterWithOptions(request, runtime);
    }

    /**
     * @param request FindCustomerInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindCustomerInfoResponse
     */
    public FindCustomerInfoResponse findCustomerInfoWithOptions(FindCustomerInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindCustomerInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindCustomerInfoResponse());
    }

    /**
     * @param request FindCustomerInfoRequest
     * @return FindCustomerInfoResponse
     */
    public FindCustomerInfoResponse findCustomerInfo(FindCustomerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findCustomerInfoWithOptions(request, runtime);
    }

    /**
     * @param request FindCustomerSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindCustomerSnapshotResponse
     */
    public FindCustomerSnapshotResponse findCustomerSnapshotWithOptions(FindCustomerSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.infoType)) {
            query.put("InfoType", request.infoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindCustomerSnapshot"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindCustomerSnapshotResponse());
    }

    /**
     * @param request FindCustomerSnapshotRequest
     * @return FindCustomerSnapshotResponse
     */
    public FindCustomerSnapshotResponse findCustomerSnapshot(FindCustomerSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findCustomerSnapshotWithOptions(request, runtime);
    }

    /**
     * @param request FindFinanceTaxRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindFinanceTaxResponse
     */
    public FindFinanceTaxResponse findFinanceTaxWithOptions(FindFinanceTaxRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.HId)) {
            query.put("HId", request.HId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxVersion)) {
            query.put("TaxVersion", request.taxVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindFinanceTax"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindFinanceTaxResponse());
    }

    /**
     * @param request FindFinanceTaxRequest
     * @return FindFinanceTaxResponse
     */
    public FindFinanceTaxResponse findFinanceTax(FindFinanceTaxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findFinanceTaxWithOptions(request, runtime);
    }

    /**
     * @param request FindFinanceTaxDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindFinanceTaxDetailResponse
     */
    public FindFinanceTaxDetailResponse findFinanceTaxDetailWithOptions(FindFinanceTaxDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kpId)) {
            query.put("KpId", request.kpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindFinanceTaxDetail"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindFinanceTaxDetailResponse());
    }

    /**
     * @param request FindFinanceTaxDetailRequest
     * @return FindFinanceTaxDetailResponse
     */
    public FindFinanceTaxDetailResponse findFinanceTaxDetail(FindFinanceTaxDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findFinanceTaxDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>登录过程中根据HID匹配Pk的历史逻辑</p>
     * 
     * @param request FindPkByHidForLoginWithLegacyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindPkByHidForLoginWithLegacyResponse
     */
    public FindPkByHidForLoginWithLegacyResponse findPkByHidForLoginWithLegacyWithOptions(FindPkByHidForLoginWithLegacyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindPkByHidForLoginWithLegacy"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindPkByHidForLoginWithLegacyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>登录过程中根据HID匹配Pk的历史逻辑</p>
     * 
     * @param request FindPkByHidForLoginWithLegacyRequest
     * @return FindPkByHidForLoginWithLegacyResponse
     */
    public FindPkByHidForLoginWithLegacyResponse findPkByHidForLoginWithLegacy(FindPkByHidForLoginWithLegacyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findPkByHidForLoginWithLegacyWithOptions(request, runtime);
    }

    /**
     * @param request ForbiddenAgAccountLoginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ForbiddenAgAccountLoginResponse
     */
    public ForbiddenAgAccountLoginResponse forbiddenAgAccountLoginWithOptions(ForbiddenAgAccountLoginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForbiddenAgAccountLogin"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForbiddenAgAccountLoginResponse());
    }

    /**
     * @param request ForbiddenAgAccountLoginRequest
     * @return ForbiddenAgAccountLoginResponse
     */
    public ForbiddenAgAccountLoginResponse forbiddenAgAccountLogin(ForbiddenAgAccountLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forbiddenAgAccountLoginWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实名认证url</p>
     * 
     * @param request GenerateAliyunCertUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateAliyunCertUrlResponse
     */
    public GenerateAliyunCertUrlResponse generateAliyunCertUrlWithOptions(GenerateAliyunCertUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPk)) {
            query.put("AliyunPk", request.aliyunPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyChannel)) {
            query.put("ApplyChannel", request.applyChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyType)) {
            query.put("ApplyType", request.applyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certWay)) {
            query.put("CertWay", request.certWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreAlreadyCert)) {
            query.put("IgnoreAlreadyCert", request.ignoreAlreadyCert);
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

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subjectType)) {
            query.put("SubjectType", request.subjectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAliyunCertUrl"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAliyunCertUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实名认证url</p>
     * 
     * @param request GenerateAliyunCertUrlRequest
     * @return GenerateAliyunCertUrlResponse
     */
    public GenerateAliyunCertUrlResponse generateAliyunCertUrl(GenerateAliyunCertUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAliyunCertUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetAgAccountAkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgAccountAkResponse
     */
    public GetAgAccountAkResponse getAgAccountAkWithOptions(GetAgAccountAkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgAccountAk"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgAccountAkResponse());
    }

    /**
     * @param request GetAgAccountAkRequest
     * @return GetAgAccountAkResponse
     */
    public GetAgAccountAkResponse getAgAccountAk(GetAgAccountAkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgAccountAkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request GetAgOneKeyDeleteTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgOneKeyDeleteTaskResponse
     */
    public GetAgOneKeyDeleteTaskResponse getAgOneKeyDeleteTaskWithOptions(GetAgOneKeyDeleteTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgOneKeyDeleteTask"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgOneKeyDeleteTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request GetAgOneKeyDeleteTaskRequest
     * @return GetAgOneKeyDeleteTaskResponse
     */
    public GetAgOneKeyDeleteTaskResponse getAgOneKeyDeleteTask(GetAgOneKeyDeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgOneKeyDeleteTaskWithOptions(request, runtime);
    }

    /**
     * @param request GetAgRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgRelationResponse
     */
    public GetAgRelationResponse getAgRelationWithOptions(GetAgRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgRelation"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgRelationResponse());
    }

    /**
     * @param request GetAgRelationRequest
     * @return GetAgRelationResponse
     */
    public GetAgRelationResponse getAgRelation(GetAgRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgRelationWithOptions(request, runtime);
    }

    /**
     * @param request GetAliyunIdByPkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAliyunIdByPkResponse
     */
    public GetAliyunIdByPkResponse getAliyunIdByPkWithOptions(GetAliyunIdByPkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliyunIdByPk"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliyunIdByPkResponse());
    }

    /**
     * @param request GetAliyunIdByPkRequest
     * @return GetAliyunIdByPkResponse
     */
    public GetAliyunIdByPkResponse getAliyunIdByPk(GetAliyunIdByPkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAliyunIdByPkWithOptions(request, runtime);
    }

    /**
     * @param request GetAliyunPKByAliyunIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAliyunPKByAliyunIDResponse
     */
    public GetAliyunPKByAliyunIDResponse getAliyunPKByAliyunIDWithOptions(GetAliyunPKByAliyunIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunId)) {
            query.put("AliyunId", request.aliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliyunPKByAliyunID"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliyunPKByAliyunIDResponse());
    }

    /**
     * @param request GetAliyunPKByAliyunIDRequest
     * @return GetAliyunPKByAliyunIDResponse
     */
    public GetAliyunPKByAliyunIDResponse getAliyunPKByAliyunID(GetAliyunPKByAliyunIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAliyunPKByAliyunIDWithOptions(request, runtime);
    }

    /**
     * @param request GetCustomerCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerCategoryResponse
     */
    public GetCustomerCategoryResponse getCustomerCategoryWithOptions(GetCustomerCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerCategory"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerCategoryResponse());
    }

    /**
     * @param request GetCustomerCategoryRequest
     * @return GetCustomerCategoryResponse
     */
    public GetCustomerCategoryResponse getCustomerCategory(GetCustomerCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerCategoryWithOptions(request, runtime);
    }

    /**
     * @param request GetCustomerCategoryDictionaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerCategoryDictionaryResponse
     */
    public GetCustomerCategoryDictionaryResponse getCustomerCategoryDictionaryWithOptions(GetCustomerCategoryDictionaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerCategoryDictionary"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerCategoryDictionaryResponse());
    }

    /**
     * @param request GetCustomerCategoryDictionaryRequest
     * @return GetCustomerCategoryDictionaryResponse
     */
    public GetCustomerCategoryDictionaryResponse getCustomerCategoryDictionary(GetCustomerCategoryDictionaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerCategoryDictionaryWithOptions(request, runtime);
    }

    /**
     * @param request GetCustomerInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerInformationResponse
     */
    public GetCustomerInformationResponse getCustomerInformationWithOptions(GetCustomerInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerInformation"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerInformationResponse());
    }

    /**
     * @param request GetCustomerInformationRequest
     * @return GetCustomerInformationResponse
     */
    public GetCustomerInformationResponse getCustomerInformation(GetCustomerInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerInformationWithOptions(request, runtime);
    }

    /**
     * @param request GetDingTalkUserOrgByAliyunTmpCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDingTalkUserOrgByAliyunTmpCodeResponse
     */
    public GetDingTalkUserOrgByAliyunTmpCodeResponse getDingTalkUserOrgByAliyunTmpCodeWithOptions(GetDingTalkUserOrgByAliyunTmpCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDingTalkUserOrgByAliyunTmpCode"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDingTalkUserOrgByAliyunTmpCodeResponse());
    }

    /**
     * @param request GetDingTalkUserOrgByAliyunTmpCodeRequest
     * @return GetDingTalkUserOrgByAliyunTmpCodeResponse
     */
    public GetDingTalkUserOrgByAliyunTmpCodeResponse getDingTalkUserOrgByAliyunTmpCode(GetDingTalkUserOrgByAliyunTmpCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDingTalkUserOrgByAliyunTmpCodeWithOptions(request, runtime);
    }

    /**
     * @param request GetIdentityRegistrationByCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityRegistrationByCustomerResponse
     */
    public GetIdentityRegistrationByCustomerResponse getIdentityRegistrationByCustomerWithOptions(GetIdentityRegistrationByCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityRegistrationByCustomer"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityRegistrationByCustomerResponse());
    }

    /**
     * @param request GetIdentityRegistrationByCustomerRequest
     * @return GetIdentityRegistrationByCustomerResponse
     */
    public GetIdentityRegistrationByCustomerResponse getIdentityRegistrationByCustomer(GetIdentityRegistrationByCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityRegistrationByCustomerWithOptions(request, runtime);
    }

    /**
     * @param request GetProfileTypeByPkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProfileTypeByPkResponse
     */
    public GetProfileTypeByPkResponse getProfileTypeByPkWithOptions(GetProfileTypeByPkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProfileTypeByPk"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProfileTypeByPkResponse());
    }

    /**
     * @param request GetProfileTypeByPkRequest
     * @return GetProfileTypeByPkResponse
     */
    public GetProfileTypeByPkResponse getProfileTypeByPk(GetProfileTypeByPkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProfileTypeByPkWithOptions(request, runtime);
    }

    /**
     * @param request GetUploadIdentityRegistrationDocConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadIdentityRegistrationDocConfigResponse
     */
    public GetUploadIdentityRegistrationDocConfigResponse getUploadIdentityRegistrationDocConfigWithOptions(GetUploadIdentityRegistrationDocConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadIdentityRegistrationDocConfig"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadIdentityRegistrationDocConfigResponse());
    }

    /**
     * @param request GetUploadIdentityRegistrationDocConfigRequest
     * @return GetUploadIdentityRegistrationDocConfigResponse
     */
    public GetUploadIdentityRegistrationDocConfigResponse getUploadIdentityRegistrationDocConfig(GetUploadIdentityRegistrationDocConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadIdentityRegistrationDocConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>IncrBy缓存操作</p>
     * 
     * @param request IncrByCacheOperateSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IncrByCacheOperateSyncResponse
     */
    public IncrByCacheOperateSyncResponse incrByCacheOperateSyncWithOptions(IncrByCacheOperateSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultValue)) {
            query.put("DefaultValue", request.defaultValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSeconds)) {
            query.put("ExpireSeconds", request.expireSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.step)) {
            query.put("Step", request.step);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncrByCacheOperateSync"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncrByCacheOperateSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>IncrBy缓存操作</p>
     * 
     * @param request IncrByCacheOperateSyncRequest
     * @return IncrByCacheOperateSyncResponse
     */
    public IncrByCacheOperateSyncResponse incrByCacheOperateSync(IncrByCacheOperateSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.incrByCacheOperateSyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request JudgeAgExistQuietPeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JudgeAgExistQuietPeriodResponse
     */
    public JudgeAgExistQuietPeriodResponse judgeAgExistQuietPeriodWithOptions(JudgeAgExistQuietPeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JudgeAgExistQuietPeriod"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JudgeAgExistQuietPeriodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请ag注销</p>
     * 
     * @param request JudgeAgExistQuietPeriodRequest
     * @return JudgeAgExistQuietPeriodResponse
     */
    public JudgeAgExistQuietPeriodResponse judgeAgExistQuietPeriod(JudgeAgExistQuietPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.judgeAgExistQuietPeriodWithOptions(request, runtime);
    }

    /**
     * @param request LoadRealNameInfoByPkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoadRealNameInfoByPkResponse
     */
    public LoadRealNameInfoByPkResponse loadRealNameInfoByPkWithOptions(LoadRealNameInfoByPkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoadRealNameInfoByPk"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoadRealNameInfoByPkResponse());
    }

    /**
     * @param request LoadRealNameInfoByPkRequest
     * @return LoadRealNameInfoByPkResponse
     */
    public LoadRealNameInfoByPkResponse loadRealNameInfoByPk(LoadRealNameInfoByPkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loadRealNameInfoByPkWithOptions(request, runtime);
    }

    /**
     * @param tmpReq MapFromHavanaBindIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MapFromHavanaBindIdResponse
     */
    public MapFromHavanaBindIdResponse mapFromHavanaBindIdWithOptions(MapFromHavanaBindIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MapFromHavanaBindIdShrinkRequest request = new MapFromHavanaBindIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.havanaBindStations)) {
            request.havanaBindStationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.havanaBindStations, "HavanaBindStations", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaBindId)) {
            query.put("HavanaBindId", request.havanaBindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaBindStationsShrink)) {
            query.put("HavanaBindStations", request.havanaBindStationsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MapFromHavanaBindId"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MapFromHavanaBindIdResponse());
    }

    /**
     * @param request MapFromHavanaBindIdRequest
     * @return MapFromHavanaBindIdResponse
     */
    public MapFromHavanaBindIdResponse mapFromHavanaBindId(MapFromHavanaBindIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mapFromHavanaBindIdWithOptions(request, runtime);
    }

    /**
     * @param request MapPkFromHidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MapPkFromHidResponse
     */
    public MapPkFromHidResponse mapPkFromHidWithOptions(MapPkFromHidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hid)) {
            query.put("Hid", request.hid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingScenes)) {
            query.put("MappingScenes", request.mappingScenes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MapPkFromHid"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MapPkFromHidResponse());
    }

    /**
     * @param request MapPkFromHidRequest
     * @return MapPkFromHidResponse
     */
    public MapPkFromHidResponse mapPkFromHid(MapPkFromHidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mapPkFromHidWithOptions(request, runtime);
    }

    /**
     * @param request MapPkToHidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MapPkToHidResponse
     */
    public MapPkToHidResponse mapPkToHidWithOptions(MapPkToHidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingScenes)) {
            query.put("MappingScenes", request.mappingScenes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MapPkToHid"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MapPkToHidResponse());
    }

    /**
     * @param request MapPkToHidRequest
     * @return MapPkToHidResponse
     */
    public MapPkToHidResponse mapPkToHid(MapPkToHidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mapPkToHidWithOptions(request, runtime);
    }

    /**
     * @param tmpReq MapToHavanaBindIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MapToHavanaBindIdResponse
     */
    public MapToHavanaBindIdResponse mapToHavanaBindIdWithOptions(MapToHavanaBindIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MapToHavanaBindIdShrinkRequest request = new MapToHavanaBindIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.havanaBindStations)) {
            request.havanaBindStationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.havanaBindStations, "HavanaBindStations", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaBindStationsShrink)) {
            query.put("HavanaBindStations", request.havanaBindStationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MapToHavanaBindId"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MapToHavanaBindIdResponse());
    }

    /**
     * @param request MapToHavanaBindIdRequest
     * @return MapToHavanaBindIdResponse
     */
    public MapToHavanaBindIdResponse mapToHavanaBindId(MapToHavanaBindIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mapToHavanaBindIdWithOptions(request, runtime);
    }

    /**
     * @param request ModifyBizCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBizCategoryResponse
     */
    public ModifyBizCategoryResponse modifyBizCategoryWithOptions(ModifyBizCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramList)) {
            query.put("ParamList", request.paramList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBizCategory"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBizCategoryResponse());
    }

    /**
     * @param request ModifyBizCategoryRequest
     * @return ModifyBizCategoryResponse
     */
    public ModifyBizCategoryResponse modifyBizCategory(ModifyBizCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBizCategoryWithOptions(request, runtime);
    }

    /**
     * @param request ModifyContacterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyContacterResponse
     */
    public ModifyContacterResponse modifyContacterWithOptions(ModifyContacterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contacterAddress)) {
            query.put("ContacterAddress", request.contacterAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterDingding)) {
            query.put("ContacterDingding", request.contacterDingding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterEmail)) {
            query.put("ContacterEmail", request.contacterEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterId)) {
            query.put("ContacterId", request.contacterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterMobile)) {
            query.put("ContacterMobile", request.contacterMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterName)) {
            query.put("ContacterName", request.contacterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterPosition)) {
            query.put("ContacterPosition", request.contacterPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterStaffNo)) {
            query.put("ContacterStaffNo", request.contacterStaffNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterType)) {
            query.put("ContacterType", request.contacterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacterWangwang)) {
            query.put("ContacterWangwang", request.contacterWangwang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailConfirmed)) {
            query.put("EmailConfirmed", request.emailConfirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileConfirmed)) {
            query.put("MobileConfirmed", request.mobileConfirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyContacter"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyContacterResponse());
    }

    /**
     * @param request ModifyContacterRequest
     * @return ModifyContacterResponse
     */
    public ModifyContacterResponse modifyContacter(ModifyContacterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyContacterWithOptions(request, runtime);
    }

    /**
     * @param request ModifyCustomerInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomerInfoResponse
     */
    public ModifyCustomerInfoResponse modifyCustomerInfoWithOptions(ModifyCustomerInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerCategory)) {
            query.put("CustomerCategory", request.customerCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerSubCategory)) {
            query.put("CustomerSubCategory", request.customerSubCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.website)) {
            query.put("Website", request.website);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomerInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomerInfoResponse());
    }

    /**
     * @param request ModifyCustomerInfoRequest
     * @return ModifyCustomerInfoResponse
     */
    public ModifyCustomerInfoResponse modifyCustomerInfo(ModifyCustomerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomerInfoWithOptions(request, runtime);
    }

    /**
     * @param request OperateFinanceTaxRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateFinanceTaxResponse
     */
    public OperateFinanceTaxResponse operateFinanceTaxWithOptions(OperateFinanceTaxRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.financeTax)) {
            query.put("FinanceTax", request.financeTax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.financeTaxCertificateImgName)) {
            query.put("FinanceTaxCertificateImgName", request.financeTaxCertificateImgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HId)) {
            query.put("HId", request.HId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondFinanceTax)) {
            query.put("SecondFinanceTax", request.secondFinanceTax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondFinanceTaxCertificateImgName)) {
            query.put("SecondFinanceTaxCertificateImgName", request.secondFinanceTaxCertificateImgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondFinanceTaxCertificateImgUrl)) {
            query.put("SecondFinanceTaxCertificateImgUrl", request.secondFinanceTaxCertificateImgUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.financeTaxCertificateImgUrl)) {
            query.put("financeTaxCertificateImgUrl", request.financeTaxCertificateImgUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateFinanceTax"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateFinanceTaxResponse());
    }

    /**
     * @param request OperateFinanceTaxRequest
     * @return OperateFinanceTaxResponse
     */
    public OperateFinanceTaxResponse operateFinanceTax(OperateFinanceTaxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateFinanceTaxWithOptions(request, runtime);
    }

    /**
     * @param request QueryAccountAddressInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountAddressInfoResponse
     */
    public QueryAccountAddressInfoResponse queryAccountAddressInfoWithOptions(QueryAccountAddressInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressVersion)) {
            query.put("AddressVersion", request.addressVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountAddressInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountAddressInfoResponse());
    }

    /**
     * @param request QueryAccountAddressInfoRequest
     * @return QueryAccountAddressInfoResponse
     */
    public QueryAccountAddressInfoResponse queryAccountAddressInfo(QueryAccountAddressInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountAddressInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryAccountAddressInfoWithoutHavanaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountAddressInfoWithoutHavanaResponse
     */
    public QueryAccountAddressInfoWithoutHavanaResponse queryAccountAddressInfoWithoutHavanaWithOptions(QueryAccountAddressInfoWithoutHavanaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressVersion)) {
            query.put("AddressVersion", request.addressVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountAddressInfoWithoutHavana"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountAddressInfoWithoutHavanaResponse());
    }

    /**
     * @param request QueryAccountAddressInfoWithoutHavanaRequest
     * @return QueryAccountAddressInfoWithoutHavanaResponse
     */
    public QueryAccountAddressInfoWithoutHavanaResponse queryAccountAddressInfoWithoutHavana(QueryAccountAddressInfoWithoutHavanaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountAddressInfoWithoutHavanaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账号收货地址</p>
     * 
     * @param request QueryAccountDeliveryAddressInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountDeliveryAddressInfoResponse
     */
    public QueryAccountDeliveryAddressInfoResponse queryAccountDeliveryAddressInfoWithOptions(QueryAccountDeliveryAddressInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountDeliveryAddressInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountDeliveryAddressInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账号收货地址</p>
     * 
     * @param request QueryAccountDeliveryAddressInfoRequest
     * @return QueryAccountDeliveryAddressInfoResponse
     */
    public QueryAccountDeliveryAddressInfoResponse queryAccountDeliveryAddressInfo(QueryAccountDeliveryAddressInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountDeliveryAddressInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryAccountProfileInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountProfileInfoResponse
     */
    public QueryAccountProfileInfoResponse queryAccountProfileInfoWithOptions(QueryAccountProfileInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountProfileInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountProfileInfoResponse());
    }

    /**
     * @param request QueryAccountProfileInfoRequest
     * @return QueryAccountProfileInfoResponse
     */
    public QueryAccountProfileInfoResponse queryAccountProfileInfo(QueryAccountProfileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountProfileInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryAccountRealNameInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountRealNameInfoResponse
     */
    public QueryAccountRealNameInfoResponse queryAccountRealNameInfoWithOptions(QueryAccountRealNameInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountRealNameInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountRealNameInfoResponse());
    }

    /**
     * @param request QueryAccountRealNameInfoRequest
     * @return QueryAccountRealNameInfoResponse
     */
    public QueryAccountRealNameInfoResponse queryAccountRealNameInfo(QueryAccountRealNameInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountRealNameInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryAccountSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountSiteResponse
     */
    public QueryAccountSiteResponse queryAccountSiteWithOptions(QueryAccountSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountSite"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountSiteResponse());
    }

    /**
     * @param request QueryAccountSiteRequest
     * @return QueryAccountSiteResponse
     */
    public QueryAccountSiteResponse queryAccountSite(QueryAccountSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountSiteWithOptions(request, runtime);
    }

    /**
     * @param request QueryAccountTrueNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountTrueNameResponse
     */
    public QueryAccountTrueNameResponse queryAccountTrueNameWithOptions(QueryAccountTrueNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountTrueName"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountTrueNameResponse());
    }

    /**
     * @param request QueryAccountTrueNameRequest
     * @return QueryAccountTrueNameResponse
     */
    public QueryAccountTrueNameResponse queryAccountTrueName(QueryAccountTrueNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountTrueNameWithOptions(request, runtime);
    }

    /**
     * @param request QueryAgAccountLoginPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAgAccountLoginPermissionResponse
     */
    public QueryAgAccountLoginPermissionResponse queryAgAccountLoginPermissionWithOptions(QueryAgAccountLoginPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAgAccountLoginPermission"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAgAccountLoginPermissionResponse());
    }

    /**
     * @param request QueryAgAccountLoginPermissionRequest
     * @return QueryAgAccountLoginPermissionResponse
     */
    public QueryAgAccountLoginPermissionResponse queryAgAccountLoginPermission(QueryAgAccountLoginPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAgAccountLoginPermissionWithOptions(request, runtime);
    }

    /**
     * @param request QueryAgRelationCountAndQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAgRelationCountAndQuotaResponse
     */
    public QueryAgRelationCountAndQuotaResponse queryAgRelationCountAndQuotaWithOptions(QueryAgRelationCountAndQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerBid)) {
            body.put("CallerBid", request.callerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("CallerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            body.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullObject)) {
            body.put("NullObject", request.nullObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            body.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            body.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            body.put("StsTokenCallerUid", request.stsTokenCallerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenRoleId)) {
            body.put("StsTokenRoleId", request.stsTokenRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAgRelationCountAndQuota"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAgRelationCountAndQuotaResponse());
    }

    /**
     * @param request QueryAgRelationCountAndQuotaRequest
     * @return QueryAgRelationCountAndQuotaResponse
     */
    public QueryAgRelationCountAndQuotaResponse queryAgRelationCountAndQuota(QueryAgRelationCountAndQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAgRelationCountAndQuotaWithOptions(request, runtime);
    }

    /**
     * @param request QueryAgSecurityMobileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAgSecurityMobileResponse
     */
    public QueryAgSecurityMobileResponse queryAgSecurityMobileWithOptions(QueryAgSecurityMobileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAgSecurityMobile"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAgSecurityMobileResponse());
    }

    /**
     * @param request QueryAgSecurityMobileRequest
     * @return QueryAgSecurityMobileResponse
     */
    public QueryAgSecurityMobileResponse queryAgSecurityMobile(QueryAgSecurityMobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAgSecurityMobileWithOptions(request, runtime);
    }

    /**
     * @param request QueryBindsByOuterIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBindsByOuterIdResponse
     */
    public QueryBindsByOuterIdResponse queryBindsByOuterIdWithOptions(QueryBindsByOuterIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorOuterId)) {
            query.put("MinorOuterId", request.minorOuterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerId)) {
            query.put("OuterId", request.outerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBindsByOuterId"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBindsByOuterIdResponse());
    }

    /**
     * @param request QueryBindsByOuterIdRequest
     * @return QueryBindsByOuterIdResponse
     */
    public QueryBindsByOuterIdResponse queryBindsByOuterId(QueryBindsByOuterIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBindsByOuterIdWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryBindsByPkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBindsByPkResponse
     */
    public QueryBindsByPkResponse queryBindsByPkWithOptions(QueryBindsByPkRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBindsByPkShrinkRequest request = new QueryBindsByPkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantIds)) {
            request.tenantIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantIds, "TenantIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantIdsShrink)) {
            query.put("TenantIds", request.tenantIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBindsByPk"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBindsByPkResponse());
    }

    /**
     * @param request QueryBindsByPkRequest
     * @return QueryBindsByPkResponse
     */
    public QueryBindsByPkResponse queryBindsByPk(QueryBindsByPkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBindsByPkWithOptions(request, runtime);
    }

    /**
     * @param request QueryCustomerLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomerLabelResponse
     */
    public QueryCustomerLabelResponse queryCustomerLabelWithOptions(QueryCustomerLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomerLabel"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomerLabelResponse());
    }

    /**
     * @param request QueryCustomerLabelRequest
     * @return QueryCustomerLabelResponse
     */
    public QueryCustomerLabelResponse queryCustomerLabel(QueryCustomerLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerLabelWithOptions(request, runtime);
    }

    /**
     * @param request QueryDeleteTaskCheckDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeleteTaskCheckDataResponse
     */
    public QueryDeleteTaskCheckDataResponse queryDeleteTaskCheckDataWithOptions(QueryDeleteTaskCheckDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longLang)) {
            query.put("LongLang", request.longLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeleteTaskCheckData"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeleteTaskCheckDataResponse());
    }

    /**
     * @param request QueryDeleteTaskCheckDataRequest
     * @return QueryDeleteTaskCheckDataResponse
     */
    public QueryDeleteTaskCheckDataResponse queryDeleteTaskCheckData(QueryDeleteTaskCheckDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeleteTaskCheckDataWithOptions(request, runtime);
    }

    /**
     * @param request QueryEncryptedAccountProfileInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEncryptedAccountProfileInfoResponse
     */
    public QueryEncryptedAccountProfileInfoResponse queryEncryptedAccountProfileInfoWithOptions(QueryEncryptedAccountProfileInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEncryptedAccountProfileInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEncryptedAccountProfileInfoResponse());
    }

    /**
     * @param request QueryEncryptedAccountProfileInfoRequest
     * @return QueryEncryptedAccountProfileInfoResponse
     */
    public QueryEncryptedAccountProfileInfoResponse queryEncryptedAccountProfileInfo(QueryEncryptedAccountProfileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEncryptedAccountProfileInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryEnterpriseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEnterpriseInfoResponse
     */
    public QueryEnterpriseInfoResponse queryEnterpriseInfoWithOptions(QueryEnterpriseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseVersion)) {
            query.put("EnterpriseVersion", request.enterpriseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEnterpriseInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEnterpriseInfoResponse());
    }

    /**
     * @param request QueryEnterpriseInfoRequest
     * @return QueryEnterpriseInfoResponse
     */
    public QueryEnterpriseInfoResponse queryEnterpriseInfo(QueryEnterpriseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEnterpriseInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryEnumConfigByTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEnumConfigByTypeResponse
     */
    public QueryEnumConfigByTypeResponse queryEnumConfigByTypeWithOptions(QueryEnumConfigByTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEnumConfigByType"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEnumConfigByTypeResponse());
    }

    /**
     * @param request QueryEnumConfigByTypeRequest
     * @return QueryEnumConfigByTypeResponse
     */
    public QueryEnumConfigByTypeResponse queryEnumConfigByType(QueryEnumConfigByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEnumConfigByTypeWithOptions(request, runtime);
    }

    /**
     * @param request QueryOneKeyDeleteBlockListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOneKeyDeleteBlockListResponse
     */
    public QueryOneKeyDeleteBlockListResponse queryOneKeyDeleteBlockListWithOptions(QueryOneKeyDeleteBlockListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOneKeyDeleteBlockList"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOneKeyDeleteBlockListResponse());
    }

    /**
     * @param request QueryOneKeyDeleteBlockListRequest
     * @return QueryOneKeyDeleteBlockListResponse
     */
    public QueryOneKeyDeleteBlockListResponse queryOneKeyDeleteBlockList(QueryOneKeyDeleteBlockListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOneKeyDeleteBlockListWithOptions(request, runtime);
    }

    /**
     * @param request QuerySecurityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySecurityInfoResponse
     */
    public QuerySecurityInfoResponse querySecurityInfoWithOptions(QuerySecurityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecurityInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecurityInfoResponse());
    }

    /**
     * @param request QuerySecurityInfoRequest
     * @return QuerySecurityInfoResponse
     */
    public QuerySecurityInfoResponse querySecurityInfo(QuerySecurityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecurityInfoWithOptions(request, runtime);
    }

    /**
     * @param request RegisterInternalAccountForBucRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterInternalAccountForBucResponse
     */
    public RegisterInternalAccountForBucResponse registerInternalAccountForBucWithOptions(RegisterInternalAccountForBucRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEmailConfirmed)) {
            query.put("IsEmailConfirmed", request.isEmailConfirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMobileConfirmed)) {
            query.put("IsMobileConfirmed", request.isMobileConfirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMobileLogin)) {
            query.put("IsMobileLogin", request.isMobileLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nationalityCode)) {
            query.put("NationalityCode", request.nationalityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plainPassword)) {
            query.put("PlainPassword", request.plainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredLanguage)) {
            query.put("PreferredLanguage", request.preferredLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountTypeCode)) {
            query.put("accountTypeCode", request.accountTypeCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterInternalAccountForBuc"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterInternalAccountForBucResponse());
    }

    /**
     * @param request RegisterInternalAccountForBucRequest
     * @return RegisterInternalAccountForBucResponse
     */
    public RegisterInternalAccountForBucResponse registerInternalAccountForBuc(RegisterInternalAccountForBucRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerInternalAccountForBucWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseAgAccountResponse
     */
    public ReleaseAgAccountResponse releaseAgAccountWithOptions(ReleaseAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseReason)) {
            query.put("ReleaseReason", request.releaseReason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseAgAccount"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseAgAccountResponse());
    }

    /**
     * @param request ReleaseAgAccountRequest
     * @return ReleaseAgAccountResponse
     */
    public ReleaseAgAccountResponse releaseAgAccount(ReleaseAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseAgAccountWithOptions(request, runtime);
    }

    /**
     * @param request ResendAsyncCreateAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResendAsyncCreateAgAccountResponse
     */
    public ResendAsyncCreateAgAccountResponse resendAsyncCreateAgAccountWithOptions(ResendAsyncCreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResendAsyncCreateAgAccount"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResendAsyncCreateAgAccountResponse());
    }

    /**
     * @param request ResendAsyncCreateAgAccountRequest
     * @return ResendAsyncCreateAgAccountResponse
     */
    public ResendAsyncCreateAgAccountResponse resendAsyncCreateAgAccount(ResendAsyncCreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendAsyncCreateAgAccountWithOptions(request, runtime);
    }

    /**
     * @param request ResendAsyncModifyLoginEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResendAsyncModifyLoginEmailResponse
     */
    public ResendAsyncModifyLoginEmailResponse resendAsyncModifyLoginEmailWithOptions(ResendAsyncModifyLoginEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResendAsyncModifyLoginEmail"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResendAsyncModifyLoginEmailResponse());
    }

    /**
     * @param request ResendAsyncModifyLoginEmailRequest
     * @return ResendAsyncModifyLoginEmailResponse
     */
    public ResendAsyncModifyLoginEmailResponse resendAsyncModifyLoginEmail(ResendAsyncModifyLoginEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendAsyncModifyLoginEmailWithOptions(request, runtime);
    }

    /**
     * @param request SeparateAgRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SeparateAgRelationResponse
     */
    public SeparateAgRelationResponse separateAgRelationWithOptions(SeparateAgRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SeparateAgRelation"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SeparateAgRelationResponse());
    }

    /**
     * @param request SeparateAgRelationRequest
     * @return SeparateAgRelationResponse
     */
    public SeparateAgRelationResponse separateAgRelation(SeparateAgRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.separateAgRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步set操作</p>
     * 
     * @param request SetCacheOperateSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCacheOperateSyncResponse
     */
    public SetCacheOperateSyncResponse setCacheOperateSyncWithOptions(SetCacheOperateSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exceptVersion)) {
            query.put("ExceptVersion", request.exceptVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSeconds)) {
            query.put("ExpireSeconds", request.expireSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setType)) {
            query.put("SetType", request.setType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueClazz)) {
            query.put("ValueClazz", request.valueClazz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueString)) {
            query.put("ValueString", request.valueString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCacheOperateSync"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCacheOperateSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步set操作</p>
     * 
     * @param request SetCacheOperateSyncRequest
     * @return SetCacheOperateSyncResponse
     */
    public SetCacheOperateSyncResponse setCacheOperateSync(SetCacheOperateSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCacheOperateSyncWithOptions(request, runtime);
    }

    /**
     * @param tmpReq UpdateAccountAddressInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccountAddressInfoResponse
     */
    public UpdateAccountAddressInfoResponse updateAccountAddressInfoWithOptions(UpdateAccountAddressInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAccountAddressInfoShrinkRequest request = new UpdateAccountAddressInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cityJsonString)) {
            request.cityJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cityJsonString, "CityJsonString", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.districtJsonString)) {
            request.districtJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.districtJsonString, "DistrictJsonString", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.provinceJsonString)) {
            request.provinceJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.provinceJsonString, "ProvinceJsonString", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address2)) {
            query.put("Address2", request.address2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityJsonStringShrink)) {
            query.put("CityJsonString", request.cityJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtJsonStringShrink)) {
            query.put("DistrictJsonString", request.districtJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postCode)) {
            query.put("PostCode", request.postCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceJsonStringShrink)) {
            query.put("ProvinceJsonString", request.provinceJsonStringShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccountAddressInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountAddressInfoResponse());
    }

    /**
     * @param request UpdateAccountAddressInfoRequest
     * @return UpdateAccountAddressInfoResponse
     */
    public UpdateAccountAddressInfoResponse updateAccountAddressInfo(UpdateAccountAddressInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountAddressInfoWithOptions(request, runtime);
    }

    /**
     * @param tmpReq UpdateAccountProfileInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccountProfileInfoResponse
     */
    public UpdateAccountProfileInfoResponse updateAccountProfileInfoWithOptions(UpdateAccountProfileInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAccountProfileInfoShrinkRequest request = new UpdateAccountProfileInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cityJsonString)) {
            request.cityJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cityJsonString, "CityJsonString", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.districtJsonString)) {
            request.districtJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.districtJsonString, "DistrictJsonString", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.provinceJsonString)) {
            request.provinceJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.provinceJsonString, "ProvinceJsonString", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountAttribute)) {
            query.put("AccountAttribute", request.accountAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address2)) {
            query.put("Address2", request.address2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindAlipayNo)) {
            query.put("BindAlipayNo", request.bindAlipayNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityJsonStringShrink)) {
            query.put("CityJsonString", request.cityJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactMethod)) {
            query.put("ContactMethod", request.contactMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtJsonStringShrink)) {
            query.put("DistrictJsonString", request.districtJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fax)) {
            query.put("Fax", request.fax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstName)) {
            query.put("FirstName", request.firstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.head)) {
            query.put("Head", request.head);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headColor)) {
            query.put("HeadColor", request.headColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastName)) {
            query.put("LastName", request.lastName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postCode)) {
            query.put("PostCode", request.postCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceJsonStringShrink)) {
            query.put("ProvinceJsonString", request.provinceJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfServicingBusinessRegNum)) {
            query.put("SelfServicingBusinessRegNum", request.selfServicingBusinessRegNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfServicingIdentificationNum)) {
            query.put("SelfServicingIdentificationNum", request.selfServicingIdentificationNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trueName)) {
            query.put("TrueName", request.trueName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccountProfileInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountProfileInfoResponse());
    }

    /**
     * @param request UpdateAccountProfileInfoRequest
     * @return UpdateAccountProfileInfoResponse
     */
    public UpdateAccountProfileInfoResponse updateAccountProfileInfo(UpdateAccountProfileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountProfileInfoWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAgAccountAddressInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgAccountAddressInfoResponse
     */
    public UpdateAgAccountAddressInfoResponse updateAgAccountAddressInfoWithOptions(UpdateAgAccountAddressInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address2)) {
            query.put("Address2", request.address2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postCode)) {
            query.put("PostCode", request.postCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgAccountAddressInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgAccountAddressInfoResponse());
    }

    /**
     * @param request UpdateAgAccountAddressInfoRequest
     * @return UpdateAgAccountAddressInfoResponse
     */
    public UpdateAgAccountAddressInfoResponse updateAgAccountAddressInfo(UpdateAgAccountAddressInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgAccountAddressInfoWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAgServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgServiceStatusResponse
     */
    public UpdateAgServiceStatusResponse updateAgServiceStatusWithOptions(UpdateAgServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgServiceStatus"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgServiceStatusResponse());
    }

    /**
     * @param request UpdateAgServiceStatusRequest
     * @return UpdateAgServiceStatusResponse
     */
    public UpdateAgServiceStatusResponse updateAgServiceStatus(UpdateAgServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgServiceStatusWithOptions(request, runtime);
    }

    /**
     * @param request UpdateCustomerCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomerCategoryResponse
     */
    public UpdateCustomerCategoryResponse updateCustomerCategoryWithOptions(UpdateCustomerCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramList)) {
            query.put("ParamList", request.paramList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomerCategory"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomerCategoryResponse());
    }

    /**
     * @param request UpdateCustomerCategoryRequest
     * @return UpdateCustomerCategoryResponse
     */
    public UpdateCustomerCategoryResponse updateCustomerCategory(UpdateCustomerCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomerCategoryWithOptions(request, runtime);
    }

    /**
     * @param request UpdateCustomerInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomerInformationResponse
     */
    public UpdateCustomerInformationResponse updateCustomerInformationWithOptions(UpdateCustomerInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerCategory)) {
            query.put("CustomerCategory", request.customerCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerSubCategory)) {
            query.put("CustomerSubCategory", request.customerSubCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.website)) {
            query.put("Website", request.website);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomerInformation"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomerInformationResponse());
    }

    /**
     * @param request UpdateCustomerInformationRequest
     * @return UpdateCustomerInformationResponse
     */
    public UpdateCustomerInformationResponse updateCustomerInformation(UpdateCustomerInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomerInformationWithOptions(request, runtime);
    }

    /**
     * @param tmpReq UpdateOrInsertEnterpriseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrInsertEnterpriseInfoResponse
     */
    public UpdateOrInsertEnterpriseInfoResponse updateOrInsertEnterpriseInfoWithOptions(UpdateOrInsertEnterpriseInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOrInsertEnterpriseInfoShrinkRequest request = new UpdateOrInsertEnterpriseInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cityJsonString)) {
            request.cityJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cityJsonString, "CityJsonString", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.provinceJsonString)) {
            request.provinceJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.provinceJsonString, "ProvinceJsonString", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityJsonStringShrink)) {
            query.put("CityJsonString", request.cityJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseSize)) {
            query.put("EnterpriseSize", request.enterpriseSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fax)) {
            query.put("Fax", request.fax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceJsonStringShrink)) {
            query.put("ProvinceJsonString", request.provinceJsonStringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrInsertEnterpriseInfo"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrInsertEnterpriseInfoResponse());
    }

    /**
     * @param request UpdateOrInsertEnterpriseInfoRequest
     * @return UpdateOrInsertEnterpriseInfoResponse
     */
    public UpdateOrInsertEnterpriseInfoResponse updateOrInsertEnterpriseInfo(UpdateOrInsertEnterpriseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrInsertEnterpriseInfoWithOptions(request, runtime);
    }

    /**
     * @param request DoLogicalDeleteResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DoLogicalDeleteResourceResponse
     */
    public DoLogicalDeleteResourceResponse doLogicalDeleteResourceWithOptions(DoLogicalDeleteResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtWakeup)) {
            query.put("GmtWakeup", request.gmtWakeup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hid)) {
            query.put("Hid", request.hid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interrupt)) {
            query.put("Interrupt", request.interrupt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoker)) {
            query.put("Invoker", request.invoker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.success)) {
            query.put("Success", request.success);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExtraData)) {
            query.put("TaskExtraData", request.taskExtraData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdentifier)) {
            query.put("TaskIdentifier", request.taskIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "doLogicalDeleteResource"),
            new TeaPair("version", "2016-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DoLogicalDeleteResourceResponse());
    }

    /**
     * @param request DoLogicalDeleteResourceRequest
     * @return DoLogicalDeleteResourceResponse
     */
    public DoLogicalDeleteResourceResponse doLogicalDeleteResource(DoLogicalDeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.doLogicalDeleteResourceWithOptions(request, runtime);
    }
}
