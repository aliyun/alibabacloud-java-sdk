// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323;

import com.aliyun.tea.*;
import com.aliyun.edasmsc20200323.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("edasmsc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetServiceMethodPageResponse getServiceMethodPageWithOptions(GetServiceMethodPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceMethodPage", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceMethodPageResponse());
    }

    public GetServiceMethodPageResponse getServiceMethodPage(GetServiceMethodPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceMethodPageWithOptions(request, runtime);
    }

    public ListAuthPolicyResponse listAuthPolicyWithOptions(ListAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAuthPolicy", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new ListAuthPolicyResponse());
    }

    public ListAuthPolicyResponse listAuthPolicy(ListAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthPolicyWithOptions(request, runtime);
    }

    public GetApplicationListResponse getApplicationListWithOptions(GetApplicationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApplicationList", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetApplicationListResponse());
    }

    public GetApplicationListResponse getApplicationList(GetApplicationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationListWithOptions(request, runtime);
    }

    public GetOutlierPolicyInfoResponse getOutlierPolicyInfoWithOptions(GetOutlierPolicyInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOutlierPolicyInfo", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetOutlierPolicyInfoResponse());
    }

    public GetOutlierPolicyInfoResponse getOutlierPolicyInfo(GetOutlierPolicyInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOutlierPolicyInfoWithOptions(request, runtime);
    }

    public ListOutlierPolicyResponse listOutlierPolicyWithOptions(ListOutlierPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOutlierPolicy", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new ListOutlierPolicyResponse());
    }

    public ListOutlierPolicyResponse listOutlierPolicy(ListOutlierPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutlierPolicyWithOptions(request, runtime);
    }

    public GetAuthPolicyInfoResponse getAuthPolicyInfoWithOptions(GetAuthPolicyInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAuthPolicyInfo", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetAuthPolicyInfoResponse());
    }

    public GetAuthPolicyInfoResponse getAuthPolicyInfo(GetAuthPolicyInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthPolicyInfoWithOptions(request, runtime);
    }

    public RemoveOutlierPolicyResponse removeOutlierPolicyWithOptions(RemoveOutlierPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveOutlierPolicy", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveOutlierPolicyResponse());
    }

    public RemoveOutlierPolicyResponse removeOutlierPolicy(RemoveOutlierPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeOutlierPolicyWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateApplication", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CheckAuthPolicyNameResponse checkAuthPolicyNameWithOptions(CheckAuthPolicyNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckAuthPolicyName", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckAuthPolicyNameResponse());
    }

    public CheckAuthPolicyNameResponse checkAuthPolicyName(CheckAuthPolicyNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAuthPolicyNameWithOptions(request, runtime);
    }

    public RemoveAuthPolicyResponse removeAuthPolicyWithOptions(RemoveAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveAuthPolicy", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveAuthPolicyResponse());
    }

    public RemoveAuthPolicyResponse removeAuthPolicy(RemoveAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAuthPolicyWithOptions(request, runtime);
    }

    public RemoveApplicationResponse removeApplicationWithOptions(RemoveApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveApplication", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveApplicationResponse());
    }

    public RemoveApplicationResponse removeApplication(RemoveApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApplicationWithOptions(request, runtime);
    }

    public UpdateOutlierConfigResponse updateOutlierConfigWithOptions(UpdateOutlierConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateOutlierConfig", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdateOutlierConfigResponse());
    }

    public UpdateOutlierConfigResponse updateOutlierConfig(UpdateOutlierConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOutlierConfigWithOptions(request, runtime);
    }

    public CreateOutlierConfigResponse createOutlierConfigWithOptions(CreateOutlierConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOutlierConfig", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateOutlierConfigResponse());
    }

    public CreateOutlierConfigResponse createOutlierConfig(CreateOutlierConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOutlierConfigWithOptions(request, runtime);
    }

    public UpdateAuthPolicyResponse updateAuthPolicyWithOptions(UpdateAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAuthPolicy", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAuthPolicyResponse());
    }

    public UpdateAuthPolicyResponse updateAuthPolicy(UpdateAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthPolicyWithOptions(request, runtime);
    }

    public GetOutlierApplicationListResponse getOutlierApplicationListWithOptions(GetOutlierApplicationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOutlierApplicationList", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetOutlierApplicationListResponse());
    }

    public GetOutlierApplicationListResponse getOutlierApplicationList(GetOutlierApplicationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOutlierApplicationListWithOptions(request, runtime);
    }

    public AddAuthPolicyResponse addAuthPolicyWithOptions(AddAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAuthPolicy", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new AddAuthPolicyResponse());
    }

    public AddAuthPolicyResponse addAuthPolicy(AddAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAuthPolicyWithOptions(request, runtime);
    }

    public GetServiceListPageResponse getServiceListPageWithOptions(GetServiceListPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceListPage", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceListPageResponse());
    }

    public GetServiceListPageResponse getServiceListPage(GetServiceListPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceListPageWithOptions(request, runtime);
    }

    public GetServiceDetailResponse getServiceDetailWithOptions(GetServiceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceDetail", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceDetailResponse());
    }

    public GetServiceDetailResponse getServiceDetail(GetServiceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceDetailWithOptions(request, runtime);
    }

    public GetServiceConsumersPageResponse getServiceConsumersPageWithOptions(GetServiceConsumersPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceConsumersPage", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceConsumersPageResponse());
    }

    public GetServiceConsumersPageResponse getServiceConsumersPage(GetServiceConsumersPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceConsumersPageWithOptions(request, runtime);
    }

    public GetServiceProvidersPageResponse getServiceProvidersPageWithOptions(GetServiceProvidersPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceProvidersPage", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceProvidersPageResponse());
    }

    public GetServiceProvidersPageResponse getServiceProvidersPage(GetServiceProvidersPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceProvidersPageWithOptions(request, runtime);
    }

    public GetServiceListResponse getServiceListWithOptions(GetServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceList", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceListResponse());
    }

    public GetServiceListResponse getServiceList(GetServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceListWithOptions(request, runtime);
    }

    public QueryLocationsResponse queryLocationsWithOptions(QueryLocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryLocations", "HTTPS", "POST", "2020-03-23", "AK", null, TeaModel.buildMap(request), runtime), new QueryLocationsResponse());
    }

    public QueryLocationsResponse queryLocations(QueryLocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocationsWithOptions(request, runtime);
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
