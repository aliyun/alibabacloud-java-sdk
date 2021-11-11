// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520;

import com.aliyun.tea.*;
import com.aliyun.idaas_doraemon20210520.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "idaas-doraemon.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("idaas-doraemon", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateAuthenticatorRegistrationResponse createAuthenticatorRegistrationWithOptions(CreateAuthenticatorRegistrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAuthenticatorRegistration", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAuthenticatorRegistrationResponse());
    }

    public CreateAuthenticatorRegistrationResponse createAuthenticatorRegistration(CreateAuthenticatorRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAuthenticatorRegistrationWithOptions(request, runtime);
    }

    public CreateUserAuthenticateOptionsResponse createUserAuthenticateOptionsWithOptions(CreateUserAuthenticateOptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUserAuthenticateOptions", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserAuthenticateOptionsResponse());
    }

    public CreateUserAuthenticateOptionsResponse createUserAuthenticateOptions(CreateUserAuthenticateOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserAuthenticateOptionsWithOptions(request, runtime);
    }

    public DeregisterAuthenticatorResponse deregisterAuthenticatorWithOptions(DeregisterAuthenticatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeregisterAuthenticator", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeregisterAuthenticatorResponse());
    }

    public DeregisterAuthenticatorResponse deregisterAuthenticator(DeregisterAuthenticatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deregisterAuthenticatorWithOptions(request, runtime);
    }

    public FetchAccessTokenResponse fetchAccessTokenWithOptions(FetchAccessTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchAccessToken", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new FetchAccessTokenResponse());
    }

    public FetchAccessTokenResponse fetchAccessToken(FetchAccessTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchAccessTokenWithOptions(request, runtime);
    }

    public GetAuthenticatorResponse getAuthenticatorWithOptions(GetAuthenticatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthenticator", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthenticatorResponse());
    }

    public GetAuthenticatorResponse getAuthenticator(GetAuthenticatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthenticatorWithOptions(request, runtime);
    }

    public ListAuthenticationLogsResponse listAuthenticationLogsWithOptions(ListAuthenticationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuthenticationLogs", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuthenticationLogsResponse());
    }

    public ListAuthenticationLogsResponse listAuthenticationLogs(ListAuthenticationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthenticationLogsWithOptions(request, runtime);
    }

    public ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogsWithOptions(ListAuthenticatorOpsLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuthenticatorOpsLogs", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuthenticatorOpsLogsResponse());
    }

    public ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogs(ListAuthenticatorOpsLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthenticatorOpsLogsWithOptions(request, runtime);
    }

    public ListAuthenticatorsResponse listAuthenticatorsWithOptions(ListAuthenticatorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuthenticators", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuthenticatorsResponse());
    }

    public ListAuthenticatorsResponse listAuthenticators(ListAuthenticatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthenticatorsWithOptions(request, runtime);
    }

    public ListPwnedPasswordsResponse listPwnedPasswordsWithOptions(ListPwnedPasswordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPwnedPasswords", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListPwnedPasswordsResponse());
    }

    public ListPwnedPasswordsResponse listPwnedPasswords(ListPwnedPasswordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPwnedPasswordsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public RegisterAuthenticatorResponse registerAuthenticatorWithOptions(RegisterAuthenticatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterAuthenticator", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterAuthenticatorResponse());
    }

    public RegisterAuthenticatorResponse registerAuthenticator(RegisterAuthenticatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerAuthenticatorWithOptions(request, runtime);
    }

    public ServiceInvokeResponse serviceInvokeWithOptions(ServiceInvokeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ServiceInvoke", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new ServiceInvokeResponse());
    }

    public ServiceInvokeResponse serviceInvoke(ServiceInvokeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.serviceInvokeWithOptions(request, runtime);
    }

    public UpdateAuthenticatorAttributeResponse updateAuthenticatorAttributeWithOptions(UpdateAuthenticatorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAuthenticatorAttribute", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAuthenticatorAttributeResponse());
    }

    public UpdateAuthenticatorAttributeResponse updateAuthenticatorAttribute(UpdateAuthenticatorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAuthenticatorAttributeWithOptions(request, runtime);
    }

    public VerifyUserAuthenticationResponse verifyUserAuthenticationWithOptions(VerifyUserAuthenticationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyUserAuthentication", "2021-05-20", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyUserAuthenticationResponse());
    }

    public VerifyUserAuthenticationResponse verifyUserAuthentication(VerifyUserAuthenticationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyUserAuthenticationWithOptions(request, runtime);
    }
}
