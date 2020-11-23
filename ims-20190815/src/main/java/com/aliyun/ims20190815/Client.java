// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815;

import com.aliyun.tea.*;
import com.aliyun.ims20190815.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ims", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetUserSsoSettingsResponse getUserSsoSettingsWithOptions(GetUserSsoSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUserSsoSettings", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetUserSsoSettingsResponse());
    }

    public GetUserSsoSettingsResponse getUserSsoSettings(GetUserSsoSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserSsoSettingsWithOptions(request, runtime);
    }

    public SetUserSsoSettingsResponse setUserSsoSettingsWithOptions(SetUserSsoSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetUserSsoSettings", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new SetUserSsoSettingsResponse());
    }

    public SetUserSsoSettingsResponse setUserSsoSettings(SetUserSsoSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserSsoSettingsWithOptions(request, runtime);
    }

    public SetDefaultDomainResponse setDefaultDomainWithOptions(SetDefaultDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultDomain", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new SetDefaultDomainResponse());
    }

    public SetDefaultDomainResponse setDefaultDomain(SetDefaultDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultDomainWithOptions(request, runtime);
    }

    public ListUserBasicInfosResponse listUserBasicInfosWithOptions(ListUserBasicInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUserBasicInfos", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListUserBasicInfosResponse());
    }

    public ListUserBasicInfosResponse listUserBasicInfos(ListUserBasicInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserBasicInfosWithOptions(request, runtime);
    }

    public UpdateApplicationResponse updateApplicationWithOptions(UpdateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateApplication", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateApplicationResponse());
    }

    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListApplications", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListApplicationsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApplication", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetApplicationResponse());
    }

    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApplication", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    public GetAppSecretResponse getAppSecretWithOptions(GetAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAppSecret", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetAppSecretResponse());
    }

    public GetAppSecretResponse getAppSecret(GetAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSecretWithOptions(request, runtime);
    }

    public CreateAppSecretResponse createAppSecretWithOptions(CreateAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAppSecret", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateAppSecretResponse());
    }

    public CreateAppSecretResponse createAppSecret(CreateAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppSecretWithOptions(request, runtime);
    }

    public ListPredefinedScopesResponse listPredefinedScopesWithOptions(ListPredefinedScopesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPredefinedScopes", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListPredefinedScopesResponse());
    }

    public ListPredefinedScopesResponse listPredefinedScopes(ListPredefinedScopesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPredefinedScopesWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateApplication", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public DeleteAppSecretResponse deleteAppSecretWithOptions(DeleteAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAppSecret", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteAppSecretResponse());
    }

    public DeleteAppSecretResponse deleteAppSecret(DeleteAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppSecretWithOptions(request, runtime);
    }

    public ListAppSecretIdsResponse listAppSecretIdsWithOptions(ListAppSecretIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAppSecretIds", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListAppSecretIdsResponse());
    }

    public ListAppSecretIdsResponse listAppSecretIds(ListAppSecretIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppSecretIdsWithOptions(request, runtime);
    }

    public GenerateCredentialReportResponse generateCredentialReportWithOptions(GenerateCredentialReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateCredentialReport", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GenerateCredentialReportResponse());
    }

    public GenerateCredentialReportResponse generateCredentialReport(GenerateCredentialReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCredentialReportWithOptions(request, runtime);
    }

    public GetCredentialReportResponse getCredentialReportWithOptions(GetCredentialReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCredentialReport", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetCredentialReportResponse());
    }

    public GetCredentialReportResponse getCredentialReport(GetCredentialReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialReportWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUser", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public UpdateSAMLProviderResponse updateSAMLProviderWithOptions(UpdateSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSAMLProvider", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateSAMLProviderResponse());
    }

    public UpdateSAMLProviderResponse updateSAMLProvider(UpdateSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSAMLProviderWithOptions(request, runtime);
    }

    public UpdateLoginProfileResponse updateLoginProfileWithOptions(UpdateLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLoginProfile", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateLoginProfileResponse());
    }

    public UpdateLoginProfileResponse updateLoginProfile(UpdateLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoginProfileWithOptions(request, runtime);
    }

    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateGroupResponse());
    }

    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    public UpdateAccessKeyResponse updateAccessKeyWithOptions(UpdateAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAccessKey", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateAccessKeyResponse());
    }

    public UpdateAccessKeyResponse updateAccessKey(UpdateAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccessKeyWithOptions(request, runtime);
    }

    public UnbindMFADeviceResponse unbindMFADeviceWithOptions(UnbindMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindMFADevice", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UnbindMFADeviceResponse());
    }

    public UnbindMFADeviceResponse unbindMFADevice(UnbindMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindMFADeviceWithOptions(request, runtime);
    }

    public SetSecurityPreferenceResponse setSecurityPreferenceWithOptions(SetSecurityPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetSecurityPreference", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new SetSecurityPreferenceResponse());
    }

    public SetSecurityPreferenceResponse setSecurityPreference(SetSecurityPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSecurityPreferenceWithOptions(request, runtime);
    }

    public SetPasswordPolicyResponse setPasswordPolicyWithOptions(SetPasswordPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetPasswordPolicy", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new SetPasswordPolicyResponse());
    }

    public SetPasswordPolicyResponse setPasswordPolicy(SetPasswordPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordPolicyWithOptions(request, runtime);
    }

    public RemoveUserFromGroupResponse removeUserFromGroupWithOptions(RemoveUserFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveUserFromGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new RemoveUserFromGroupResponse());
    }

    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromGroupWithOptions(request, runtime);
    }

    public ListVirtualMFADevicesResponse listVirtualMFADevicesWithOptions(ListVirtualMFADevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVirtualMFADevices", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListVirtualMFADevicesResponse());
    }

    public ListVirtualMFADevicesResponse listVirtualMFADevices(ListVirtualMFADevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirtualMFADevicesWithOptions(request, runtime);
    }

    public ListUsersForGroupResponse listUsersForGroupWithOptions(ListUsersForGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUsersForGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListUsersForGroupResponse());
    }

    public ListUsersForGroupResponse listUsersForGroup(ListUsersForGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForGroupWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUsers", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListSAMLProvidersResponse listSAMLProvidersWithOptions(ListSAMLProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSAMLProviders", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListSAMLProvidersResponse());
    }

    public ListSAMLProvidersResponse listSAMLProviders(ListSAMLProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSAMLProvidersWithOptions(request, runtime);
    }

    public ListGroupsForUserResponse listGroupsForUserWithOptions(ListGroupsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGroupsForUser", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListGroupsForUserResponse());
    }

    public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForUserWithOptions(request, runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGroups", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListGroupsResponse());
    }

    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    public ListAccessKeysResponse listAccessKeysWithOptions(ListAccessKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAccessKeys", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ListAccessKeysResponse());
    }

    public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessKeysWithOptions(request, runtime);
    }

    public GetUserMFAInfoResponse getUserMFAInfoWithOptions(GetUserMFAInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUserMFAInfo", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetUserMFAInfoResponse());
    }

    public GetUserMFAInfoResponse getUserMFAInfo(GetUserMFAInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserMFAInfoWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUser", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetSecurityPreferenceResponse getSecurityPreferenceWithOptions(GetSecurityPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSecurityPreference", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetSecurityPreferenceResponse());
    }

    public GetSecurityPreferenceResponse getSecurityPreference(GetSecurityPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityPreferenceWithOptions(request, runtime);
    }

    public GetSAMLProviderResponse getSAMLProviderWithOptions(GetSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSAMLProvider", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetSAMLProviderResponse());
    }

    public GetSAMLProviderResponse getSAMLProvider(GetSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSAMLProviderWithOptions(request, runtime);
    }

    public GetPasswordPolicyResponse getPasswordPolicyWithOptions(GetPasswordPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPasswordPolicy", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetPasswordPolicyResponse());
    }

    public GetPasswordPolicyResponse getPasswordPolicy(GetPasswordPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordPolicyWithOptions(request, runtime);
    }

    public GetLoginProfileResponse getLoginProfileWithOptions(GetLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetLoginProfile", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetLoginProfileResponse());
    }

    public GetLoginProfileResponse getLoginProfile(GetLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginProfileWithOptions(request, runtime);
    }

    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetGroupResponse());
    }

    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGroupWithOptions(request, runtime);
    }

    public GetDefaultDomainResponse getDefaultDomainWithOptions(GetDefaultDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDefaultDomain", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetDefaultDomainResponse());
    }

    public GetDefaultDomainResponse getDefaultDomain(GetDefaultDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultDomainWithOptions(request, runtime);
    }

    public GetAccountSummaryResponse getAccountSummaryWithOptions(GetAccountSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAccountSummary", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetAccountSummaryResponse());
    }

    public GetAccountSummaryResponse getAccountSummary(GetAccountSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountSummaryWithOptions(request, runtime);
    }

    public GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReportWithOptions(GetAccountSecurityPracticeReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAccountSecurityPracticeReport", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetAccountSecurityPracticeReportResponse());
    }

    public GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReport(GetAccountSecurityPracticeReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountSecurityPracticeReportWithOptions(request, runtime);
    }

    public GetAccountMFAInfoResponse getAccountMFAInfoWithOptions(GetAccountMFAInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAccountMFAInfo", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetAccountMFAInfoResponse());
    }

    public GetAccountMFAInfoResponse getAccountMFAInfo(GetAccountMFAInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountMFAInfoWithOptions(request, runtime);
    }

    public GetAccessKeyLastUsedResponse getAccessKeyLastUsedWithOptions(GetAccessKeyLastUsedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAccessKeyLastUsed", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetAccessKeyLastUsedResponse());
    }

    public GetAccessKeyLastUsedResponse getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedWithOptions(request, runtime);
    }

    public DisableVirtualMFAResponse disableVirtualMFAWithOptions(DisableVirtualMFARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableVirtualMFA", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DisableVirtualMFAResponse());
    }

    public DisableVirtualMFAResponse disableVirtualMFA(DisableVirtualMFARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableVirtualMFAWithOptions(request, runtime);
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVirtualMFADevice", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteVirtualMFADeviceResponse());
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteUser", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteSAMLProviderResponse deleteSAMLProviderWithOptions(DeleteSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSAMLProvider", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteSAMLProviderResponse());
    }

    public DeleteSAMLProviderResponse deleteSAMLProvider(DeleteSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSAMLProviderWithOptions(request, runtime);
    }

    public DeleteLoginProfileResponse deleteLoginProfileWithOptions(DeleteLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLoginProfile", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteLoginProfileResponse());
    }

    public DeleteLoginProfileResponse deleteLoginProfile(DeleteLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoginProfileWithOptions(request, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteGroupResponse());
    }

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    public DeleteAccessKeyResponse deleteAccessKeyWithOptions(DeleteAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAccessKey", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteAccessKeyResponse());
    }

    public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessKeyWithOptions(request, runtime);
    }

    public CreateVirtualMFADeviceResponse createVirtualMFADeviceWithOptions(CreateVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVirtualMFADevice", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateVirtualMFADeviceResponse());
    }

    public CreateVirtualMFADeviceResponse createVirtualMFADevice(CreateVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualMFADeviceWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUser", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateSAMLProviderResponse createSAMLProviderWithOptions(CreateSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSAMLProvider", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateSAMLProviderResponse());
    }

    public CreateSAMLProviderResponse createSAMLProvider(CreateSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSAMLProviderWithOptions(request, runtime);
    }

    public CreateLoginProfileResponse createLoginProfileWithOptions(CreateLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLoginProfile", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateLoginProfileResponse());
    }

    public CreateLoginProfileResponse createLoginProfile(CreateLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoginProfileWithOptions(request, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateGroupResponse());
    }

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    public CreateAccessKeyResponse createAccessKeyWithOptions(CreateAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAccessKey", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateAccessKeyResponse());
    }

    public CreateAccessKeyResponse createAccessKey(CreateAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessKeyWithOptions(request, runtime);
    }

    public ChangePasswordResponse changePasswordWithOptions(ChangePasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangePassword", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new ChangePasswordResponse());
    }

    public ChangePasswordResponse changePassword(ChangePasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changePasswordWithOptions(request, runtime);
    }

    public BindMFADeviceResponse bindMFADeviceWithOptions(BindMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindMFADevice", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new BindMFADeviceResponse());
    }

    public BindMFADeviceResponse bindMFADevice(BindMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindMFADeviceWithOptions(request, runtime);
    }

    public AddUserToGroupResponse addUserToGroupWithOptions(AddUserToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddUserToGroup", "HTTPS", "POST", "2019-08-15", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new AddUserToGroupResponse());
    }

    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToGroupWithOptions(request, runtime);
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
}
