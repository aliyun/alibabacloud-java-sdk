// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606;

import com.aliyun.tea.*;
import com.aliyun.account_crm20160606.models.*;
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

    public AccountOneKeyDeleteResponse accountOneKeyDeleteWithOptions(AccountOneKeyDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AccountOneKeyDeleteResponse accountOneKeyDelete(AccountOneKeyDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.accountOneKeyDeleteWithOptions(request, runtime);
    }

    public AddCustomerLabelResponse addCustomerLabelWithOptions(AddCustomerLabelRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddCustomerLabelResponse addCustomerLabel(AddCustomerLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCustomerLabelWithOptions(request, runtime);
    }

    public AllowAgAccountLoginResponse allowAgAccountLoginWithOptions(AllowAgAccountLoginRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AllowAgAccountLoginResponse allowAgAccountLogin(AllowAgAccountLoginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allowAgAccountLoginWithOptions(request, runtime);
    }

    public ApplyIdentityRegistrationResponse applyIdentityRegistrationWithOptions(ApplyIdentityRegistrationRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            query.put("Tel", request.tel);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ApplyIdentityRegistrationResponse applyIdentityRegistration(ApplyIdentityRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyIdentityRegistrationWithOptions(request, runtime);
    }

    public AsyncCreateAgAccountResponse asyncCreateAgAccountWithOptions(AsyncCreateAgAccountRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AsyncCreateAgAccountResponse asyncCreateAgAccount(AsyncCreateAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.asyncCreateAgAccountWithOptions(request, runtime);
    }

    public AsyncModifyAgLoginEmailResponse asyncModifyAgLoginEmailWithOptions(AsyncModifyAgLoginEmailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AsyncModifyAgLoginEmailResponse asyncModifyAgLoginEmail(AsyncModifyAgLoginEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.asyncModifyAgLoginEmailWithOptions(request, runtime);
    }

    public AuthAndActiveWithHidResponse authAndActiveWithHidWithOptions(AuthAndActiveWithHidRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AuthAndActiveWithHidResponse authAndActiveWithHid(AuthAndActiveWithHidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authAndActiveWithHidWithOptions(request, runtime);
    }

    public AuthAndRefreshLoginTicketResponse authAndRefreshLoginTicketWithOptions(AuthAndRefreshLoginTicketRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AuthAndRefreshLoginTicketResponse authAndRefreshLoginTicket(AuthAndRefreshLoginTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authAndRefreshLoginTicketWithOptions(request, runtime);
    }

    public AuthLoginTicketResponse authLoginTicketWithOptions(AuthLoginTicketRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AuthLoginTicketResponse authLoginTicket(AuthLoginTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authLoginTicketWithOptions(request, runtime);
    }

    public BatchQueryAgAccountResponse batchQueryAgAccountWithOptions(BatchQueryAgAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkList)) {
            query.put("PkList", request.pkList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchQueryAgAccountResponse batchQueryAgAccount(BatchQueryAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQueryAgAccountWithOptions(request, runtime);
    }

    public BatchQueryCreateAccountTraceResponse batchQueryCreateAccountTraceWithOptions(BatchQueryCreateAccountTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNoList)) {
            query.put("TraceNoList", request.traceNoList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchQueryCreateAccountTraceResponse batchQueryCreateAccountTrace(BatchQueryCreateAccountTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQueryCreateAccountTraceWithOptions(request, runtime);
    }

    public BatchQueryModifyLoginEmailTraceResponse batchQueryModifyLoginEmailTraceWithOptions(BatchQueryModifyLoginEmailTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNoList)) {
            query.put("TraceNoList", request.traceNoList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchQueryModifyLoginEmailTraceResponse batchQueryModifyLoginEmailTrace(BatchQueryModifyLoginEmailTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQueryModifyLoginEmailTraceWithOptions(request, runtime);
    }

    public CancelAsyncCreateAgAccountResponse cancelAsyncCreateAgAccountWithOptions(CancelAsyncCreateAgAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelAsyncCreateAgAccountResponse cancelAsyncCreateAgAccount(CancelAsyncCreateAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelAsyncCreateAgAccountWithOptions(request, runtime);
    }

    public CancelAsyncModifyLoginEmailResponse cancelAsyncModifyLoginEmailWithOptions(CancelAsyncModifyLoginEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelAsyncModifyLoginEmailResponse cancelAsyncModifyLoginEmail(CancelAsyncModifyLoginEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelAsyncModifyLoginEmailWithOptions(request, runtime);
    }

    public ChangeAgSecurityEmailResponse changeAgSecurityEmailWithOptions(ChangeAgSecurityEmailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ChangeAgSecurityEmailResponse changeAgSecurityEmail(ChangeAgSecurityEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeAgSecurityEmailWithOptions(request, runtime);
    }

    public ChangeAgSecurityMobileResponse changeAgSecurityMobileWithOptions(ChangeAgSecurityMobileRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ChangeAgSecurityMobileResponse changeAgSecurityMobile(ChangeAgSecurityMobileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeAgSecurityMobileWithOptions(request, runtime);
    }

    public CreateAccountProfileInfoResponse createAccountProfileInfoWithOptions(CreateAccountProfileInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountJson)) {
            query.put("AccountJson", request.accountJson);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAccountProfileInfoResponse createAccountProfileInfo(CreateAccountProfileInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountProfileInfoWithOptions(request, runtime);
    }

    public CreateAgAccountResponse createAgAccountWithOptions(CreateAgAccountRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityMobile)) {
            query.put("SecurityMobile", request.securityMobile);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgAccountWithOptions(request, runtime);
    }

    public CreateContacterResponse createContacterWithOptions(CreateContacterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateContacterResponse createContacter(CreateContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createContacterWithOptions(request, runtime);
    }

    public CreateRealNameCertificationResponse createRealNameCertificationWithOptions(CreateRealNameCertificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRealNameCertificationResponse createRealNameCertification(CreateRealNameCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRealNameCertificationWithOptions(request, runtime);
    }

    public CustomerSensitiveInfoLogicalDeleteResponse customerSensitiveInfoLogicalDeleteWithOptions(CustomerSensitiveInfoLogicalDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CustomerSensitiveInfoLogicalDeleteResponse customerSensitiveInfoLogicalDelete(CustomerSensitiveInfoLogicalDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customerSensitiveInfoLogicalDeleteWithOptions(request, runtime);
    }

    public CustomerSensitiveInfoPhysicalDeleteResponse customerSensitiveInfoPhysicalDeleteWithOptions(CustomerSensitiveInfoPhysicalDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CustomerSensitiveInfoPhysicalDeleteResponse customerSensitiveInfoPhysicalDelete(CustomerSensitiveInfoPhysicalDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customerSensitiveInfoPhysicalDeleteWithOptions(request, runtime);
    }

    public DeleteContacterResponse deleteContacterWithOptions(DeleteContacterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contacterId)) {
            query.put("ContacterId", request.contacterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteContacterResponse deleteContacter(DeleteContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteContacterWithOptions(request, runtime);
    }

    public DeleteCustomerLabelResponse deleteCustomerLabelWithOptions(DeleteCustomerLabelRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteCustomerLabelResponse deleteCustomerLabel(DeleteCustomerLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomerLabelWithOptions(request, runtime);
    }

    public ExistBindsByOuterIdResponse existBindsByOuterIdWithOptions(ExistBindsByOuterIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ExistBindsByOuterIdResponse existBindsByOuterId(ExistBindsByOuterIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.existBindsByOuterIdWithOptions(request, runtime);
    }

    public FindAllContacterResponse findAllContacterWithOptions(FindAllContacterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindAllContacterResponse findAllContacter(FindAllContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findAllContacterWithOptions(request, runtime);
    }

    public FindBizCategoryConfigResponse findBizCategoryConfigWithOptions(FindBizCategoryConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindBizCategoryConfigResponse findBizCategoryConfig(FindBizCategoryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findBizCategoryConfigWithOptions(request, runtime);
    }

    public FindContacterResponse findContacterWithOptions(FindContacterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindContacterResponse findContacter(FindContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findContacterWithOptions(request, runtime);
    }

    public FindCustomerInfoResponse findCustomerInfoWithOptions(FindCustomerInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindCustomerInfoResponse findCustomerInfo(FindCustomerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findCustomerInfoWithOptions(request, runtime);
    }

    public FindCustomerSnapshotResponse findCustomerSnapshotWithOptions(FindCustomerSnapshotRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindCustomerSnapshotResponse findCustomerSnapshot(FindCustomerSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findCustomerSnapshotWithOptions(request, runtime);
    }

    public FindFinanceTaxResponse findFinanceTaxWithOptions(FindFinanceTaxRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.HId)) {
            query.put("HId", request.HId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxVersion)) {
            query.put("TaxVersion", request.taxVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindFinanceTaxResponse findFinanceTax(FindFinanceTaxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findFinanceTaxWithOptions(request, runtime);
    }

    public FindFinanceTaxDetailResponse findFinanceTaxDetailWithOptions(FindFinanceTaxDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kpId)) {
            query.put("KpId", request.kpId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FindFinanceTaxDetailResponse findFinanceTaxDetail(FindFinanceTaxDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findFinanceTaxDetailWithOptions(request, runtime);
    }

    public ForbiddenAgAccountLoginResponse forbiddenAgAccountLoginWithOptions(ForbiddenAgAccountLoginRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ForbiddenAgAccountLoginResponse forbiddenAgAccountLogin(ForbiddenAgAccountLoginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forbiddenAgAccountLoginWithOptions(request, runtime);
    }

    public GetAgAccountAkResponse getAgAccountAkWithOptions(GetAgAccountAkRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAgAccountAkResponse getAgAccountAk(GetAgAccountAkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgAccountAkWithOptions(request, runtime);
    }

    public GetAgRelationResponse getAgRelationWithOptions(GetAgRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agAccountType)) {
            query.put("AgAccountType", request.agAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAgRelationResponse getAgRelation(GetAgRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgRelationWithOptions(request, runtime);
    }

    public GetAliyunIdByPkResponse getAliyunIdByPkWithOptions(GetAliyunIdByPkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAliyunIdByPkResponse getAliyunIdByPk(GetAliyunIdByPkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunIdByPkWithOptions(request, runtime);
    }

    public GetAliyunPKByAliyunIDResponse getAliyunPKByAliyunIDWithOptions(GetAliyunPKByAliyunIDRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAliyunPKByAliyunIDResponse getAliyunPKByAliyunID(GetAliyunPKByAliyunIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunPKByAliyunIDWithOptions(request, runtime);
    }

    public GetCustomerCategoryResponse getCustomerCategoryWithOptions(GetCustomerCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.localeString)) {
            query.put("LocaleString", request.localeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetCustomerCategoryResponse getCustomerCategory(GetCustomerCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerCategoryWithOptions(request, runtime);
    }

    public GetCustomerCategoryDictionaryResponse getCustomerCategoryDictionaryWithOptions(GetCustomerCategoryDictionaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetCustomerCategoryDictionaryResponse getCustomerCategoryDictionary(GetCustomerCategoryDictionaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerCategoryDictionaryWithOptions(request, runtime);
    }

    public GetCustomerInformationResponse getCustomerInformationWithOptions(GetCustomerInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetCustomerInformationResponse getCustomerInformation(GetCustomerInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerInformationWithOptions(request, runtime);
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponse getDingTalkUserOrgByAliyunTmpCodeWithOptions(GetDingTalkUserOrgByAliyunTmpCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetDingTalkUserOrgByAliyunTmpCodeResponse getDingTalkUserOrgByAliyunTmpCode(GetDingTalkUserOrgByAliyunTmpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDingTalkUserOrgByAliyunTmpCodeWithOptions(request, runtime);
    }

    public GetIdentityRegistrationByCustomerResponse getIdentityRegistrationByCustomerWithOptions(GetIdentityRegistrationByCustomerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetIdentityRegistrationByCustomerResponse getIdentityRegistrationByCustomer(GetIdentityRegistrationByCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIdentityRegistrationByCustomerWithOptions(request, runtime);
    }

    public GetProfileTypeByPkResponse getProfileTypeByPkWithOptions(GetProfileTypeByPkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetProfileTypeByPkResponse getProfileTypeByPk(GetProfileTypeByPkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProfileTypeByPkWithOptions(request, runtime);
    }

    public GetUploadIdentityRegistrationDocConfigResponse getUploadIdentityRegistrationDocConfigWithOptions(GetUploadIdentityRegistrationDocConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetUploadIdentityRegistrationDocConfigResponse getUploadIdentityRegistrationDocConfig(GetUploadIdentityRegistrationDocConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUploadIdentityRegistrationDocConfigWithOptions(request, runtime);
    }

    public LoadRealNameInfoByPkResponse loadRealNameInfoByPkWithOptions(LoadRealNameInfoByPkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public LoadRealNameInfoByPkResponse loadRealNameInfoByPk(LoadRealNameInfoByPkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.loadRealNameInfoByPkWithOptions(request, runtime);
    }

    public MapFromHavanaBindIdResponse mapFromHavanaBindIdWithOptions(MapFromHavanaBindIdRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public MapFromHavanaBindIdResponse mapFromHavanaBindId(MapFromHavanaBindIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mapFromHavanaBindIdWithOptions(request, runtime);
    }

    public MapPkFromHidResponse mapPkFromHidWithOptions(MapPkFromHidRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public MapPkFromHidResponse mapPkFromHid(MapPkFromHidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mapPkFromHidWithOptions(request, runtime);
    }

    public MapPkToHidResponse mapPkToHidWithOptions(MapPkToHidRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public MapPkToHidResponse mapPkToHid(MapPkToHidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mapPkToHidWithOptions(request, runtime);
    }

    public MapToHavanaBindIdResponse mapToHavanaBindIdWithOptions(MapToHavanaBindIdRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public MapToHavanaBindIdResponse mapToHavanaBindId(MapToHavanaBindIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mapToHavanaBindIdWithOptions(request, runtime);
    }

    public ModifyBizCategoryResponse modifyBizCategoryWithOptions(ModifyBizCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramList)) {
            query.put("ParamList", request.paramList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyBizCategoryResponse modifyBizCategory(ModifyBizCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBizCategoryWithOptions(request, runtime);
    }

    public ModifyContacterResponse modifyContacterWithOptions(ModifyContacterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyContacterResponse modifyContacter(ModifyContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyContacterWithOptions(request, runtime);
    }

    public ModifyCustomerInfoResponse modifyCustomerInfoWithOptions(ModifyCustomerInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyCustomerInfoResponse modifyCustomerInfo(ModifyCustomerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCustomerInfoWithOptions(request, runtime);
    }

    public OperateFinanceTaxResponse operateFinanceTaxWithOptions(OperateFinanceTaxRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public OperateFinanceTaxResponse operateFinanceTax(OperateFinanceTaxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateFinanceTaxWithOptions(request, runtime);
    }

    public QueryAccountAddressInfoResponse queryAccountAddressInfoWithOptions(QueryAccountAddressInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAccountAddressInfoResponse queryAccountAddressInfo(QueryAccountAddressInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountAddressInfoWithOptions(request, runtime);
    }

    public QueryAccountAddressInfoWithoutHavanaResponse queryAccountAddressInfoWithoutHavanaWithOptions(QueryAccountAddressInfoWithoutHavanaRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAccountAddressInfoWithoutHavanaResponse queryAccountAddressInfoWithoutHavana(QueryAccountAddressInfoWithoutHavanaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountAddressInfoWithoutHavanaWithOptions(request, runtime);
    }

    public QueryAccountDeliveryAddressInfoResponse queryAccountDeliveryAddressInfoWithOptions(QueryAccountDeliveryAddressInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAccountDeliveryAddressInfoResponse queryAccountDeliveryAddressInfo(QueryAccountDeliveryAddressInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountDeliveryAddressInfoWithOptions(request, runtime);
    }

    public QueryAccountProfileInfoResponse queryAccountProfileInfoWithOptions(QueryAccountProfileInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAccountProfileInfoResponse queryAccountProfileInfo(QueryAccountProfileInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountProfileInfoWithOptions(request, runtime);
    }

    public QueryAccountRealNameInfoResponse queryAccountRealNameInfoWithOptions(QueryAccountRealNameInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAccountRealNameInfoResponse queryAccountRealNameInfo(QueryAccountRealNameInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountRealNameInfoWithOptions(request, runtime);
    }

    public QueryAccountSiteResponse queryAccountSiteWithOptions(QueryAccountSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAccountSiteResponse queryAccountSite(QueryAccountSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountSiteWithOptions(request, runtime);
    }

    public QueryAgAccountLoginPermissionResponse queryAgAccountLoginPermissionWithOptions(QueryAgAccountLoginPermissionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAgAccountLoginPermissionResponse queryAgAccountLoginPermission(QueryAgAccountLoginPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAgAccountLoginPermissionWithOptions(request, runtime);
    }

    public QueryAgSecurityMobileResponse queryAgSecurityMobileWithOptions(QueryAgSecurityMobileRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAgSecurityMobileResponse queryAgSecurityMobile(QueryAgSecurityMobileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAgSecurityMobileWithOptions(request, runtime);
    }

    public QueryBindsByOuterIdResponse queryBindsByOuterIdWithOptions(QueryBindsByOuterIdRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryBindsByOuterIdResponse queryBindsByOuterId(QueryBindsByOuterIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBindsByOuterIdWithOptions(request, runtime);
    }

    public QueryBindsByPkResponse queryBindsByPkWithOptions(QueryBindsByPkRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryBindsByPkResponse queryBindsByPk(QueryBindsByPkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBindsByPkWithOptions(request, runtime);
    }

    public QueryCustomerLabelResponse queryCustomerLabelWithOptions(QueryCustomerLabelRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryCustomerLabelResponse queryCustomerLabel(QueryCustomerLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCustomerLabelWithOptions(request, runtime);
    }

    public QueryEncryptedAccountProfileInfoResponse queryEncryptedAccountProfileInfoWithOptions(QueryEncryptedAccountProfileInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryEncryptedAccountProfileInfoResponse queryEncryptedAccountProfileInfo(QueryEncryptedAccountProfileInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEncryptedAccountProfileInfoWithOptions(request, runtime);
    }

    public QueryEnterpriseInfoResponse queryEnterpriseInfoWithOptions(QueryEnterpriseInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryEnterpriseInfoResponse queryEnterpriseInfo(QueryEnterpriseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEnterpriseInfoWithOptions(request, runtime);
    }

    public QueryEnumConfigByTypeResponse queryEnumConfigByTypeWithOptions(QueryEnumConfigByTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryEnumConfigByTypeResponse queryEnumConfigByType(QueryEnumConfigByTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEnumConfigByTypeWithOptions(request, runtime);
    }

    public QueryOneKeyDeleteBlockListResponse queryOneKeyDeleteBlockListWithOptions(QueryOneKeyDeleteBlockListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryOneKeyDeleteBlockListResponse queryOneKeyDeleteBlockList(QueryOneKeyDeleteBlockListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOneKeyDeleteBlockListWithOptions(request, runtime);
    }

    public QuerySecurityInfoResponse querySecurityInfoWithOptions(QuerySecurityInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QuerySecurityInfoResponse querySecurityInfo(QuerySecurityInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySecurityInfoWithOptions(request, runtime);
    }

    public RegisterInternalAccountForBucResponse registerInternalAccountForBucWithOptions(RegisterInternalAccountForBucRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RegisterInternalAccountForBucResponse registerInternalAccountForBuc(RegisterInternalAccountForBucRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerInternalAccountForBucWithOptions(request, runtime);
    }

    public ReleaseAgAccountResponse releaseAgAccountWithOptions(ReleaseAgAccountRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ReleaseAgAccountResponse releaseAgAccount(ReleaseAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseAgAccountWithOptions(request, runtime);
    }

    public ResendAsyncCreateAgAccountResponse resendAsyncCreateAgAccountWithOptions(ResendAsyncCreateAgAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ResendAsyncCreateAgAccountResponse resendAsyncCreateAgAccount(ResendAsyncCreateAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendAsyncCreateAgAccountWithOptions(request, runtime);
    }

    public ResendAsyncModifyLoginEmailResponse resendAsyncModifyLoginEmailWithOptions(ResendAsyncModifyLoginEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceNo)) {
            query.put("TraceNo", request.traceNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ResendAsyncModifyLoginEmailResponse resendAsyncModifyLoginEmail(ResendAsyncModifyLoginEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendAsyncModifyLoginEmailWithOptions(request, runtime);
    }

    public SeparateAgRelationResponse separateAgRelationWithOptions(SeparateAgRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mpk)) {
            query.put("Mpk", request.mpk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SeparateAgRelationResponse separateAgRelation(SeparateAgRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.separateAgRelationWithOptions(request, runtime);
    }

    public UpdateAccountAddressInfoResponse updateAccountAddressInfoWithOptions(UpdateAccountAddressInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAccountAddressInfoShrinkRequest request = new UpdateAccountAddressInfoShrinkRequest();
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

        if (!com.aliyun.teautil.Common.isUnset(request.address2)) {
            query.put("Address2", request.address2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityJsonStringShrink)) {
            query.put("CityJsonString", request.cityJsonStringShrink);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateAccountAddressInfoResponse updateAccountAddressInfo(UpdateAccountAddressInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccountAddressInfoWithOptions(request, runtime);
    }

    public UpdateAccountProfileInfoResponse updateAccountProfileInfoWithOptions(UpdateAccountProfileInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAccountProfileInfoShrinkRequest request = new UpdateAccountProfileInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cityJsonString)) {
            request.cityJsonStringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cityJsonString, "CityJsonString", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.fax)) {
            query.put("Fax", request.fax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstName)) {
            query.put("FirstName", request.firstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.head)) {
            query.put("Head", request.head);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trueName)) {
            query.put("TrueName", request.trueName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateAccountProfileInfoResponse updateAccountProfileInfo(UpdateAccountProfileInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccountProfileInfoWithOptions(request, runtime);
    }

    public UpdateAgServiceStatusResponse updateAgServiceStatusWithOptions(UpdateAgServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateAgServiceStatusResponse updateAgServiceStatus(UpdateAgServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgServiceStatusWithOptions(request, runtime);
    }

    public UpdateCustomerCategoryResponse updateCustomerCategoryWithOptions(UpdateCustomerCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramList)) {
            query.put("ParamList", request.paramList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateCustomerCategoryResponse updateCustomerCategory(UpdateCustomerCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomerCategoryWithOptions(request, runtime);
    }

    public UpdateCustomerInformationResponse updateCustomerInformationWithOptions(UpdateCustomerInformationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateCustomerInformationResponse updateCustomerInformation(UpdateCustomerInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomerInformationWithOptions(request, runtime);
    }

    public UpdateOrInsertEnterpriseInfoResponse updateOrInsertEnterpriseInfoWithOptions(UpdateOrInsertEnterpriseInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateOrInsertEnterpriseInfoResponse updateOrInsertEnterpriseInfo(UpdateOrInsertEnterpriseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOrInsertEnterpriseInfoWithOptions(request, runtime);
    }

    public DoLogicalDeleteResourceResponse doLogicalDeleteResourceWithOptions(DoLogicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DoLogicalDeleteResourceResponse doLogicalDeleteResource(DoLogicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doLogicalDeleteResourceWithOptions(request, runtime);
    }
}
