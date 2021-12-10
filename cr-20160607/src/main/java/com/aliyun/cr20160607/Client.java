// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607;

import com.aliyun.tea.*;
import com.aliyun.cr20160607.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CancelRepoBuildResponse cancelRepoBuild(String RepoNamespace, String RepoName, String BuildId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRepoBuildWithOptions(RepoNamespace, RepoName, BuildId, headers, runtime);
    }

    public CancelRepoBuildResponse cancelRepoBuildWithOptions(String RepoNamespace, String RepoName, String BuildId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        BuildId = com.aliyun.openapiutil.Client.getEncodeParam(BuildId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRepoBuild"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/build/" + BuildId + "/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRepoBuildResponse());
    }

    public CreateNamespaceResponse createNamespace() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNamespaceWithOptions(headers, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/namespace"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    public CreateRepoResponse createRepo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepoWithOptions(headers, runtime);
    }

    public CreateRepoResponse createRepoWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepo"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoResponse());
    }

    public CreateRepoBuildRuleResponse createRepoBuildRule(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepoBuildRuleWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public CreateRepoBuildRuleResponse createRepoBuildRuleWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoBuildRule"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/rules"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoBuildRuleResponse());
    }

    public CreateRepoWebhookResponse createRepoWebhook(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepoWebhookWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public CreateRepoWebhookResponse createRepoWebhookWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoWebhook"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/webhooks"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoWebhookResponse());
    }

    public CreateUserInfoResponse createUserInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserInfoWithOptions(headers, runtime);
    }

    public CreateUserInfoResponse createUserInfoWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserInfo"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/users"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserInfoResponse());
    }

    public DeleteImageResponse deleteImage(String RepoNamespace, String RepoName, String Tag) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteImageWithOptions(RepoNamespace, RepoName, Tag, headers, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(String RepoNamespace, String RepoName, String Tag, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    public DeleteNamespaceResponse deleteNamespace(String Namespace) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNamespaceWithOptions(Namespace, headers, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(String Namespace, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Namespace = com.aliyun.openapiutil.Client.getEncodeParam(Namespace);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/namespace/" + Namespace + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    public DeleteRepoResponse deleteRepo(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepoWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public DeleteRepoResponse deleteRepoWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepo"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoResponse());
    }

    public DeleteRepoBuildRuleResponse deleteRepoBuildRule(String RepoNamespace, String RepoName, String BuildRuleId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepoBuildRuleWithOptions(RepoNamespace, RepoName, BuildRuleId, headers, runtime);
    }

    public DeleteRepoBuildRuleResponse deleteRepoBuildRuleWithOptions(String RepoNamespace, String RepoName, String BuildRuleId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        BuildRuleId = com.aliyun.openapiutil.Client.getEncodeParam(BuildRuleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepoBuildRule"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/rules/" + BuildRuleId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoBuildRuleResponse());
    }

    public DeleteRepoWebhookResponse deleteRepoWebhook(String RepoNamespace, String RepoName, String WebhookId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepoWebhookWithOptions(RepoNamespace, RepoName, WebhookId, headers, runtime);
    }

    public DeleteRepoWebhookResponse deleteRepoWebhookWithOptions(String RepoNamespace, String RepoName, String WebhookId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        WebhookId = com.aliyun.openapiutil.Client.getEncodeParam(WebhookId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepoWebhook"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/webhooks/" + WebhookId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepoWebhookResponse());
    }

    public GetAuthorizationTokenResponse getAuthorizationToken() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthorizationTokenWithOptions(headers, runtime);
    }

    public GetAuthorizationTokenResponse getAuthorizationTokenWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorizationToken"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokens"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorizationTokenResponse());
    }

    public GetImageLayerResponse getImageLayer(String RepoNamespace, String RepoName, String Tag) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageLayerWithOptions(RepoNamespace, RepoName, Tag, headers, runtime);
    }

    public GetImageLayerResponse getImageLayerWithOptions(String RepoNamespace, String RepoName, String Tag, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageLayer"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + "/layers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageLayerResponse());
    }

    public GetImageManifestResponse getImageManifest(String RepoNamespace, String RepoName, String Tag, GetImageManifestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageManifestWithOptions(RepoNamespace, RepoName, Tag, request, headers, runtime);
    }

    public GetImageManifestResponse getImageManifestWithOptions(String RepoNamespace, String RepoName, String Tag, GetImageManifestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.schemaVersion)) {
            query.put("SchemaVersion", request.schemaVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageManifest"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + "/manifest"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageManifestResponse());
    }

    public GetNamespaceResponse getNamespace(String Namespace) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNamespaceWithOptions(Namespace, headers, runtime);
    }

    public GetNamespaceResponse getNamespaceWithOptions(String Namespace, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Namespace = com.aliyun.openapiutil.Client.getEncodeParam(Namespace);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNamespace"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/namespace/" + Namespace + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNamespaceResponse());
    }

    public GetNamespaceListResponse getNamespaceList(GetNamespaceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNamespaceListWithOptions(request, headers, runtime);
    }

    public GetNamespaceListResponse getNamespaceListWithOptions(GetNamespaceListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            query.put("Authorize", request.authorize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNamespaceList"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/namespace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNamespaceListResponse());
    }

    public GetRegionResponse getRegion(GetRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionWithOptions(request, headers, runtime);
    }

    public GetRegionResponse getRegionWithOptions(GetRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegion"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionResponse());
    }

    public GetRegionListResponse getRegionList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionListWithOptions(headers, runtime);
    }

    public GetRegionListResponse getRegionListWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegionList"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionListResponse());
    }

    public GetRepoResponse getRepo(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public GetRepoResponse getRepoWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepo"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoResponse());
    }

    public GetRepoBuildListResponse getRepoBuildList(String RepoNamespace, String RepoName, GetRepoBuildListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoBuildListWithOptions(RepoNamespace, RepoName, request, headers, runtime);
    }

    public GetRepoBuildListResponse getRepoBuildListWithOptions(String RepoNamespace, String RepoName, GetRepoBuildListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoBuildList"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/build"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoBuildListResponse());
    }

    public GetRepoBuildRuleListResponse getRepoBuildRuleList(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoBuildRuleListWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public GetRepoBuildRuleListResponse getRepoBuildRuleListWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoBuildRuleList"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoBuildRuleListResponse());
    }

    public GetRepoBuildStatusResponse getRepoBuildStatus(String RepoNamespace, String RepoName, String BuildId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoBuildStatusWithOptions(RepoNamespace, RepoName, BuildId, headers, runtime);
    }

    public GetRepoBuildStatusResponse getRepoBuildStatusWithOptions(String RepoNamespace, String RepoName, String BuildId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        BuildId = com.aliyun.openapiutil.Client.getEncodeParam(BuildId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoBuildStatus"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/build/" + BuildId + "/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoBuildStatusResponse());
    }

    public GetRepoListResponse getRepoList(GetRepoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoListWithOptions(request, headers, runtime);
    }

    public GetRepoListResponse getRepoListWithOptions(GetRepoListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoList"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoListResponse());
    }

    public GetRepoListByNamespaceResponse getRepoListByNamespace(String RepoNamespace, GetRepoListByNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoListByNamespaceWithOptions(RepoNamespace, request, headers, runtime);
    }

    public GetRepoListByNamespaceResponse getRepoListByNamespaceWithOptions(String RepoNamespace, GetRepoListByNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoListByNamespace"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoListByNamespaceResponse());
    }

    public GetRepoTagResponse getRepoTag(String RepoNamespace, String RepoName, String Tag) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoTagWithOptions(RepoNamespace, RepoName, Tag, headers, runtime);
    }

    public GetRepoTagResponse getRepoTagWithOptions(String RepoNamespace, String RepoName, String Tag, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTag"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagResponse());
    }

    public GetRepoTagScanListResponse getRepoTagScanList(String RepoNamespace, String RepoName, String Tag, GetRepoTagScanListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoTagScanListWithOptions(RepoNamespace, RepoName, Tag, request, headers, runtime);
    }

    public GetRepoTagScanListResponse getRepoTagScanListWithOptions(String RepoNamespace, String RepoName, String Tag, GetRepoTagScanListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagScanList"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + "/scanResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagScanListResponse());
    }

    public GetRepoTagScanStatusResponse getRepoTagScanStatus(String RepoNamespace, String RepoName, String Tag) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoTagScanStatusWithOptions(RepoNamespace, RepoName, Tag, headers, runtime);
    }

    public GetRepoTagScanStatusResponse getRepoTagScanStatusWithOptions(String RepoNamespace, String RepoName, String Tag, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagScanStatus"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + "/scanStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagScanStatusResponse());
    }

    public GetRepoTagScanSummaryResponse getRepoTagScanSummary(String RepoNamespace, String RepoName, String Tag) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoTagScanSummaryWithOptions(RepoNamespace, RepoName, Tag, headers, runtime);
    }

    public GetRepoTagScanSummaryResponse getRepoTagScanSummaryWithOptions(String RepoNamespace, String RepoName, String Tag, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTagScanSummary"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + "/scanCount"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagScanSummaryResponse());
    }

    public GetRepoTagsResponse getRepoTags(String RepoNamespace, String RepoName, GetRepoTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoTagsWithOptions(RepoNamespace, RepoName, request, headers, runtime);
    }

    public GetRepoTagsResponse getRepoTagsWithOptions(String RepoNamespace, String RepoName, GetRepoTagsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoTags"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoTagsResponse());
    }

    public GetRepoWebhookResponse getRepoWebhook(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoWebhookWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public GetRepoWebhookResponse getRepoWebhookWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoWebhook"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/webhooks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoWebhookResponse());
    }

    public GetResourceQuotaResponse getResourceQuota(String ResourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceQuotaWithOptions(ResourceName, headers, runtime);
    }

    public GetResourceQuotaResponse getResourceQuotaWithOptions(String ResourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ResourceName = com.aliyun.openapiutil.Client.getEncodeParam(ResourceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceQuota"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resource/" + ResourceName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceQuotaResponse());
    }

    public StartImageScanResponse startImageScan(String RepoNamespace, String RepoName, String Tag) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startImageScanWithOptions(RepoNamespace, RepoName, Tag, headers, runtime);
    }

    public StartImageScanResponse startImageScanWithOptions(String RepoNamespace, String RepoName, String Tag, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        Tag = com.aliyun.openapiutil.Client.getEncodeParam(Tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartImageScan"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/tags/" + Tag + "/scan"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartImageScanResponse());
    }

    public StartRepoBuildByRuleResponse startRepoBuildByRule(String RepoNamespace, String RepoName, String BuildRuleId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRepoBuildByRuleWithOptions(RepoNamespace, RepoName, BuildRuleId, headers, runtime);
    }

    public StartRepoBuildByRuleResponse startRepoBuildByRuleWithOptions(String RepoNamespace, String RepoName, String BuildRuleId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        BuildRuleId = com.aliyun.openapiutil.Client.getEncodeParam(BuildRuleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRepoBuildByRule"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/rules/" + BuildRuleId + "/build"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRepoBuildByRuleResponse());
    }

    public UpdateNamespaceResponse updateNamespace(String Namespace) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceWithOptions(Namespace, headers, runtime);
    }

    public UpdateNamespaceResponse updateNamespaceWithOptions(String Namespace, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Namespace = com.aliyun.openapiutil.Client.getEncodeParam(Namespace);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespace"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/namespace/" + Namespace + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceResponse());
    }

    public UpdateRepoResponse updateRepo(String RepoNamespace, String RepoName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepoWithOptions(RepoNamespace, RepoName, headers, runtime);
    }

    public UpdateRepoResponse updateRepoWithOptions(String RepoNamespace, String RepoName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepo"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepoResponse());
    }

    public UpdateRepoBuildRuleResponse updateRepoBuildRule(String RepoNamespace, String RepoName, String BuildRuleId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepoBuildRuleWithOptions(RepoNamespace, RepoName, BuildRuleId, headers, runtime);
    }

    public UpdateRepoBuildRuleResponse updateRepoBuildRuleWithOptions(String RepoNamespace, String RepoName, String BuildRuleId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        BuildRuleId = com.aliyun.openapiutil.Client.getEncodeParam(BuildRuleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepoBuildRule"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/rules/" + BuildRuleId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepoBuildRuleResponse());
    }

    public UpdateRepoWebhookResponse updateRepoWebhook(String RepoNamespace, String RepoName, String WebhookId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepoWebhookWithOptions(RepoNamespace, RepoName, WebhookId, headers, runtime);
    }

    public UpdateRepoWebhookResponse updateRepoWebhookWithOptions(String RepoNamespace, String RepoName, String WebhookId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RepoNamespace = com.aliyun.openapiutil.Client.getEncodeParam(RepoNamespace);
        RepoName = com.aliyun.openapiutil.Client.getEncodeParam(RepoName);
        WebhookId = com.aliyun.openapiutil.Client.getEncodeParam(WebhookId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepoWebhook"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repos/" + RepoNamespace + "/" + RepoName + "/webhooks/" + WebhookId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepoWebhookResponse());
    }

    public UpdateUserInfoResponse updateUserInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserInfoWithOptions(headers, runtime);
    }

    public UpdateUserInfoResponse updateUserInfoWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserInfo"),
            new TeaPair("version", "2016-06-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserInfoResponse());
    }
}
