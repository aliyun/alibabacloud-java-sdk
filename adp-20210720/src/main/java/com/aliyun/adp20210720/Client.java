// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720;

import com.aliyun.tea.*;
import com.aliyun.adp20210720.models.*;
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
        this._endpoint = this.getEndpoint("adp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetEnvironmentResponse getEnvironment(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(uid, headers, runtime);
    }

    public GetEnvironmentResponse getEnvironmentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEnvironment", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/environments/" + uid + "", "json", req, runtime), new GetEnvironmentResponse());
    }

    public GetProductVersionPackageResponse getProductVersionPackage(String uid, GetProductVersionPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionPackageWithOptions(uid, request, headers, runtime);
    }

    public GetProductVersionPackageResponse getProductVersionPackageWithOptions(String uid, GetProductVersionPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageUID)) {
            query.put("packageUID", request.packageUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageContentType)) {
            query.put("packageContentType", request.packageContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            query.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withURL)) {
            query.put("withURL", request.withURL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersionPackage", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/hosting/product-versions/" + uid + "/packages", "json", req, runtime), new GetProductVersionPackageResponse());
    }

    public ListProductDeploymentsResponse listProductDeployments(ListProductDeploymentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductDeploymentsWithOptions(request, headers, runtime);
    }

    public ListProductDeploymentsResponse listProductDeploymentsWithOptions(ListProductDeploymentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductDeployments", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-instances/deployments", "json", req, runtime), new ListProductDeploymentsResponse());
    }

    public ListEnvironmentNodesResponse listEnvironmentNodes(String uid, ListEnvironmentNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentNodesResponse listEnvironmentNodesWithOptions(String uid, ListEnvironmentNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEnvironmentNodes", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/environments/" + uid + "/nodes", "json", req, runtime), new ListEnvironmentNodesResponse());
    }

    public AddProductComponentVersionResponse addProductComponentVersion(String uid, String componentVersionUID, AddProductComponentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductComponentVersionWithOptions(uid, componentVersionUID, request, headers, runtime);
    }

    public AddProductComponentVersionResponse addProductComponentVersionWithOptions(String uid, String componentVersionUID, AddProductComponentVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        componentVersionUID = com.aliyun.openapiutil.Client.getEncodeParam(componentVersionUID);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            body.put("releaseName", request.releaseName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AddProductComponentVersion", "2021-07-20", "HTTPS", "POST", "AK", "/integration/api/v2/product-versions/" + uid + "/component-versions/" + componentVersionUID + "", "json", req, runtime), new AddProductComponentVersionResponse());
    }

    public UpdateEnvironmentNodeResponse updateEnvironmentNode(String uid, String nodeUID, UpdateEnvironmentNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentNodeWithOptions(uid, nodeUID, request, headers, runtime);
    }

    public UpdateEnvironmentNodeResponse updateEnvironmentNodeWithOptions(String uid, String nodeUID, UpdateEnvironmentNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        nodeUID = com.aliyun.openapiutil.Client.getEncodeParam(nodeUID);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etcdDisk)) {
            body.put("etcdDisk", request.etcdDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemDisk)) {
            body.put("tridentSystemDisk", request.tridentSystemDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemSizeDisk)) {
            body.put("tridentSystemSizeDisk", request.tridentSystemSizeDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationDisk)) {
            body.put("applicationDisk", request.applicationDisk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateEnvironmentNode", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/environments/" + uid + "/nodes/" + nodeUID + "", "json", req, runtime), new UpdateEnvironmentNodeResponse());
    }

    public DeleteProductVersionResponse deleteProductVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductVersionWithOptions(uid, headers, runtime);
    }

    public DeleteProductVersionResponse deleteProductVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProductVersion", "2021-07-20", "HTTPS", "DELETE", "AK", "/api/v2/products/" + uid + "/versions", "json", req, runtime), new DeleteProductVersionResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateProductHeaders headers = new CreateProductHeaders();
        return this.createProductWithOptions(request, headers, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, CreateProductHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            body.put("foundationVersionUID", request.foundationVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", headers.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateProduct", "2021-07-20", "HTTPS", "POST", "AK", "/integration/api/v2/products", "json", req, runtime), new CreateProductResponse());
    }

    public ValidateEnvironmentTunnelResponse validateEnvironmentTunnel(String uid, ValidateEnvironmentTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateEnvironmentTunnelWithOptions(uid, request, headers, runtime);
    }

    public ValidateEnvironmentTunnelResponse validateEnvironmentTunnelWithOptions(String uid, ValidateEnvironmentTunnelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tunnelType)) {
            body.put("tunnelType", request.tunnelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tunnelConfig))) {
            body.put("tunnelConfig", request.tunnelConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ValidateEnvironmentTunnel", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/environments/" + uid + "/tunnels/validation", "json", req, runtime), new ValidateEnvironmentTunnelResponse());
    }

    public CreateProductDeploymentResponse createProductDeployment(CreateProductDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductDeploymentWithOptions(request, headers, runtime);
    }

    public CreateProductDeploymentResponse createProductDeploymentWithOptions(CreateProductDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageUID)) {
            body.put("packageUID", request.packageUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            body.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateProductDeployment", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/product-instances/deployments", "json", req, runtime), new CreateProductDeploymentResponse());
    }

    public DeleteProductComponentVersionResponse deleteProductComponentVersion(String uid, String relationUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductComponentVersionWithOptions(uid, relationUID, headers, runtime);
    }

    public DeleteProductComponentVersionResponse deleteProductComponentVersionWithOptions(String uid, String relationUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        relationUID = com.aliyun.openapiutil.Client.getEncodeParam(relationUID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProductComponentVersion", "2021-07-20", "HTTPS", "DELETE", "AK", "/api/v2/product-versions/" + uid + "/relations/" + relationUID + "", "json", req, runtime), new DeleteProductComponentVersionResponse());
    }

    public DeleteEnvironmentResponse deleteEnvironment(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentWithOptions(uid, headers, runtime);
    }

    public DeleteEnvironmentResponse deleteEnvironmentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEnvironment", "2021-07-20", "HTTPS", "DELETE", "AK", "/api/v2/environments/" + uid + "", "json", req, runtime), new DeleteEnvironmentResponse());
    }

    public CreateProductVersionResponse createProductVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductVersionWithOptions(uid, headers, runtime);
    }

    public CreateProductVersionResponse createProductVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateProductVersion", "2021-07-20", "HTTPS", "POST", "AK", "/integration/api/v2/products/" + uid + "/versions", "json", req, runtime), new CreateProductVersionResponse());
    }

    public PutEnvironmentTunnelResponse putEnvironmentTunnel(String uid, PutEnvironmentTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putEnvironmentTunnelWithOptions(uid, request, headers, runtime);
    }

    public PutEnvironmentTunnelResponse putEnvironmentTunnelWithOptions(String uid, PutEnvironmentTunnelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tunnelType)) {
            body.put("tunnelType", request.tunnelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tunnelConfig))) {
            body.put("tunnelConfig", request.tunnelConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("PutEnvironmentTunnel", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/environments/" + uid + "/tunnels", "json", req, runtime), new PutEnvironmentTunnelResponse());
    }

    public ListFoundationComponentVersionsResponse listFoundationComponentVersions(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationComponentVersionsWithOptions(uid, headers, runtime);
    }

    public ListFoundationComponentVersionsResponse listFoundationComponentVersionsWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListFoundationComponentVersions", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/foundation/versions/" + uid + "/component-versions", "json", req, runtime), new ListFoundationComponentVersionsResponse());
    }

    public ListProductEnvironmentsResponse listProductEnvironments(String uid, ListProductEnvironmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductEnvironmentsWithOptions(uid, request, headers, runtime);
    }

    public ListProductEnvironmentsResponse listProductEnvironmentsWithOptions(String uid, ListProductEnvironmentsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        ListProductEnvironmentsShrinkRequest request = new ListProductEnvironmentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("envType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compatibleProductVersionUID)) {
            query.put("compatibleProductVersionUID", request.compatibleProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductEnvironments", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/hosting/products/" + uid + "/environments", "json", req, runtime), new ListProductEnvironmentsResponse());
    }

    public DeleteEnvironmentNodeResponse deleteEnvironmentNode(String uid, String nodeUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentNodeWithOptions(uid, nodeUID, headers, runtime);
    }

    public DeleteEnvironmentNodeResponse deleteEnvironmentNodeWithOptions(String uid, String nodeUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        nodeUID = com.aliyun.openapiutil.Client.getEncodeParam(nodeUID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEnvironmentNode", "2021-07-20", "HTTPS", "DELETE", "AK", "/api/v2/environments/" + uid + "/nodes/" + nodeUID + "", "json", req, runtime), new DeleteEnvironmentNodeResponse());
    }

    public UpdateProductComponentVersionResponse updateProductComponentVersion(String uid, String relationUID, UpdateProductComponentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductComponentVersionWithOptions(uid, relationUID, request, headers, runtime);
    }

    public UpdateProductComponentVersionResponse updateProductComponentVersionWithOptions(String uid, String relationUID, UpdateProductComponentVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        relationUID = com.aliyun.openapiutil.Client.getEncodeParam(relationUID);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentOrchestrationValues)) {
            body.put("componentOrchestrationValues", request.componentOrchestrationValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            body.put("releaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newComponentVersionUID)) {
            body.put("newComponentVersionUID", request.newComponentVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductComponentVersion", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/product-versions/" + uid + "/relations/" + relationUID + "", "json", req, runtime), new UpdateProductComponentVersionResponse());
    }

    public GetFoundationVersionResponse getFoundationVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFoundationVersionWithOptions(uid, headers, runtime);
    }

    public GetFoundationVersionResponse getFoundationVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetFoundationVersion", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/foundation/versions/" + uid + "", "json", req, runtime), new GetFoundationVersionResponse());
    }

    public DeleteProductResponse deleteProduct(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductWithOptions(uid, headers, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProduct", "2021-07-20", "HTTPS", "DELETE", "AK", "/integration/api/v2/products/" + uid + "", "json", req, runtime), new DeleteProductResponse());
    }

    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentsWithOptions(request, headers, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._public)) {
            query.put("_public", request._public);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListComponents", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/components", "json", req, runtime), new ListComponentsResponse());
    }

    public AddProductVersionConfigResponse addProductVersionConfig(String uid, AddProductVersionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductVersionConfigWithOptions(uid, request, headers, runtime);
    }

    public AddProductVersionConfigResponse addProductVersionConfigWithOptions(String uid, AddProductVersionConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentVersionUID)) {
            body.put("parentComponentVersionUID", request.parentComponentVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AddProductVersionConfig", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/product-versions/" + uid + "/configs", "json", req, runtime), new AddProductVersionConfigResponse());
    }

    public InitEnvironmentResourceResponse initEnvironmentResource(String uid, InitEnvironmentResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnvironmentResourceWithOptions(uid, request, headers, runtime);
    }

    public InitEnvironmentResourceResponse initEnvironmentResourceWithOptions(String uid, InitEnvironmentResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKeyID)) {
            body.put("accessKeyID", request.accessKeyID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessKeySecret)) {
            body.put("accessKeySecret", request.accessKeySecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("securityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("InitEnvironmentResource", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/environments/" + uid + "/resources", "json", req, runtime), new InitEnvironmentResourceResponse());
    }

    public ListComponentVersionsResponse listComponentVersions(String uid, ListComponentVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListComponentVersionsResponse listComponentVersionsWithOptions(String uid, ListComponentVersionsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        ListComponentVersionsShrinkRequest request = new ListComponentVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListComponentVersions", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/components/" + uid + "/versions", "json", req, runtime), new ListComponentVersionsResponse());
    }

    public DeleteProductInstanceConfigResponse deleteProductInstanceConfig(String configUID, DeleteProductInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductInstanceConfigWithOptions(configUID, request, headers, runtime);
    }

    public DeleteProductInstanceConfigResponse deleteProductInstanceConfigWithOptions(String configUID, DeleteProductInstanceConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        configUID = com.aliyun.openapiutil.Client.getEncodeParam(configUID);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProductInstanceConfig", "2021-07-20", "HTTPS", "DELETE", "AK", "/api/v2/product-instances/configs/" + configUID + "", "json", req, runtime), new DeleteProductInstanceConfigResponse());
    }

    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateEnvironmentHeaders headers = new CreateEnvironmentHeaders();
        return this.createEnvironmentWithOptions(request, headers, runtime);
    }

    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, CreateEnvironmentHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.platform))) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            body.put("vendorType", request.vendorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", headers.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateEnvironment", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/environments", "json", req, runtime), new CreateEnvironmentResponse());
    }

    public GetComponentResponse getComponent(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentWithOptions(uid, headers, runtime);
    }

    public GetComponentResponse getComponentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetComponent", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/components/" + uid + "", "json", req, runtime), new GetComponentResponse());
    }

    public ListProductVersionConfigsResponse listProductVersionConfigs(String uid, ListProductVersionConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionConfigsWithOptions(uid, request, headers, runtime);
    }

    public ListProductVersionConfigsResponse listProductVersionConfigsWithOptions(String uid, ListProductVersionConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("configType", request.configType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductVersionConfigs", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-versions/" + uid + "/configs", "json", req, runtime), new ListProductVersionConfigsResponse());
    }

    public AddEnvironmentNodesResponse addEnvironmentNodes(String uid, AddEnvironmentNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public AddEnvironmentNodesResponse addEnvironmentNodesWithOptions(String uid, AddEnvironmentNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterPrivateIPs)) {
            body.put("masterPrivateIPs", request.masterPrivateIPs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPrivateIPs)) {
            body.put("workerPrivateIPs", request.workerPrivateIPs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etcdDisk)) {
            body.put("etcdDisk", request.etcdDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemDisk)) {
            body.put("tridentSystemDisk", request.tridentSystemDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemSizeDisk)) {
            body.put("tridentSystemSizeDisk", request.tridentSystemSizeDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationDisk)) {
            body.put("applicationDisk", request.applicationDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            body.put("dataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("hostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            body.put("systemDisk", request.systemDisk);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AddEnvironmentNodes", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/environments/" + uid + "/nodes", "json", req, runtime), new AddEnvironmentNodesResponse());
    }

    public CreateProductVersionPackageResponse createProductVersionPackage(String uid, CreateProductVersionPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateProductVersionPackageHeaders headers = new CreateProductVersionPackageHeaders();
        return this.createProductVersionPackageWithOptions(uid, request, headers, runtime);
    }

    public CreateProductVersionPackageResponse createProductVersionPackageWithOptions(String uid, CreateProductVersionPackageRequest request, CreateProductVersionPackageHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageContentType)) {
            query.put("packageContentType", request.packageContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            query.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", headers.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateProductVersionPackage", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/hosting/product-versions/" + uid + "/packages", "json", req, runtime), new CreateProductVersionPackageResponse());
    }

    public ListProductInstanceConfigsResponse listProductInstanceConfigs(ListProductInstanceConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductInstanceConfigsWithOptions(request, headers, runtime);
    }

    public ListProductInstanceConfigsResponse listProductInstanceConfigsWithOptions(ListProductInstanceConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("paramType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductInstanceConfigs", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-instances/configs", "json", req, runtime), new ListProductInstanceConfigsResponse());
    }

    public UpdateProductVersionResponse updateProductVersion(String uid, UpdateProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductVersionResponse updateProductVersionWithOptions(String uid, UpdateProductVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductVersion", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/product-versions/" + uid + "", "json", req, runtime), new UpdateProductVersionResponse());
    }

    public GetProductComponentVersionResponse getProductComponentVersion(String relationUID, String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductComponentVersionWithOptions(relationUID, uid, headers, runtime);
    }

    public GetProductComponentVersionResponse getProductComponentVersionWithOptions(String relationUID, String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        relationUID = com.aliyun.openapiutil.Client.getEncodeParam(relationUID);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductComponentVersion", "2021-07-20", "HTTPS", "GET", "AK", "/integration/api/v2/product-versions/" + uid + "/relations/" + relationUID + "", "json", req, runtime), new GetProductComponentVersionResponse());
    }

    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(request, headers, runtime);
    }

    public ListEnvironmentsResponse listEnvironmentsWithOptions(ListEnvironmentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("instanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            query.put("vendorType", request.vendorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterUID)) {
            query.put("clusterUID", request.clusterUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEnvironments", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/environments", "json", req, runtime), new ListEnvironmentsResponse());
    }

    public UpdateProductResponse updateProduct(String uid, UpdateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(String uid, UpdateProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProduct", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/products/" + uid + "", "json", req, runtime), new UpdateProductResponse());
    }

    public DeleteProductVersionConfigResponse deleteProductVersionConfig(String uid, String configUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductVersionConfigWithOptions(uid, configUID, headers, runtime);
    }

    public DeleteProductVersionConfigResponse deleteProductVersionConfigWithOptions(String uid, String configUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        configUID = com.aliyun.openapiutil.Client.getEncodeParam(configUID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProductVersionConfig", "2021-07-20", "HTTPS", "DELETE", "AK", "/api/v2/product-versions/" + uid + "/configs/" + configUID + "", "json", req, runtime), new DeleteProductVersionConfigResponse());
    }

    public GetComponentVersionResponse getComponentVersion(String uid, String versionUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentVersionWithOptions(uid, versionUID, headers, runtime);
    }

    public GetComponentVersionResponse getComponentVersionWithOptions(String uid, String versionUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        versionUID = com.aliyun.openapiutil.Client.getEncodeParam(versionUID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetComponentVersion", "2021-07-20", "HTTPS", "GET", "AK", "/integration/api/v2/components/" + uid + "/versions/" + versionUID + "", "json", req, runtime), new GetComponentVersionResponse());
    }

    public ListProductComponentVersionsResponse listProductComponentVersions(String uid, ListProductComponentVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductComponentVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListProductComponentVersionsResponse listProductComponentVersionsWithOptions(String uid, ListProductComponentVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("sortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirect)) {
            query.put("sortDirect", request.sortDirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductComponentVersions", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-versions/" + uid + "/component-versions", "json", req, runtime), new ListProductComponentVersionsResponse());
    }

    public GetEnvironmentNodeResponse getEnvironmentNode(String uid, String nodeUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentNodeWithOptions(uid, nodeUID, headers, runtime);
    }

    public GetEnvironmentNodeResponse getEnvironmentNodeWithOptions(String uid, String nodeUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        nodeUID = com.aliyun.openapiutil.Client.getEncodeParam(nodeUID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEnvironmentNode", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/environments/" + uid + "/nodes/" + nodeUID + "", "json", req, runtime), new GetEnvironmentNodeResponse());
    }

    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProducts", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/products", "json", req, runtime), new ListProductsResponse());
    }

    public GenerateProductInstanceDeploymentConfigResponse generateProductInstanceDeploymentConfig(GenerateProductInstanceDeploymentConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateProductInstanceDeploymentConfigWithOptions(request, headers, runtime);
    }

    public GenerateProductInstanceDeploymentConfigResponse generateProductInstanceDeploymentConfigWithOptions(GenerateProductInstanceDeploymentConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("GenerateProductInstanceDeploymentConfig", "2021-07-20", "HTTPS", "POST", "AK", "/api/v2/product-instances/package-configs", "json", req, runtime), new GenerateProductInstanceDeploymentConfigResponse());
    }

    public GetProductDeploymentResponse getProductDeployment(String deploymentUID, GetProductDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductDeploymentWithOptions(deploymentUID, request, headers, runtime);
    }

    public GetProductDeploymentResponse getProductDeploymentWithOptions(String deploymentUID, GetProductDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        deploymentUID = com.aliyun.openapiutil.Client.getEncodeParam(deploymentUID);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withParamConfig)) {
            query.put("withParamConfig", request.withParamConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProductDeployment", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-instances/deployments/" + deploymentUID + "", "json", req, runtime), new GetProductDeploymentResponse());
    }

    public ListFoundationReferenceComponentsResponse listFoundationReferenceComponents(ListFoundationReferenceComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationReferenceComponentsWithOptions(request, headers, runtime);
    }

    public ListFoundationReferenceComponentsResponse listFoundationReferenceComponentsWithOptions(ListFoundationReferenceComponentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            query.put("foundationVersionUID", request.foundationVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyEnabled)) {
            query.put("onlyEnabled", request.onlyEnabled);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListFoundationReferenceComponents", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/foundation-references/component-versions", "json", req, runtime), new ListFoundationReferenceComponentsResponse());
    }

    public GetProductVersionDifferencesResponse getProductVersionDifferences(String uid, String versionUID, GetProductVersionDifferencesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionDifferencesWithOptions(uid, versionUID, request, headers, runtime);
    }

    public GetProductVersionDifferencesResponse getProductVersionDifferencesWithOptions(String uid, String versionUID, GetProductVersionDifferencesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        versionUID = com.aliyun.openapiutil.Client.getEncodeParam(versionUID);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preVersionUID)) {
            query.put("preVersionUID", request.preVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersionDifferences", "2021-07-20", "HTTPS", "GET", "AK", "/integration/api/v2/products/" + uid + "/versions/" + versionUID + "/differences", "json", req, runtime), new GetProductVersionDifferencesResponse());
    }

    public UpdateEnvironmentResponse updateEnvironment(String uid, UpdateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentResponse updateEnvironmentWithOptions(String uid, UpdateEnvironmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorConfig)) {
            body.put("vendorConfig", request.vendorConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateEnvironment", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/environments/" + uid + "", "json", req, runtime), new UpdateEnvironmentResponse());
    }

    public ListEnvironmentTunnelsResponse listEnvironmentTunnels(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentTunnelsWithOptions(uid, headers, runtime);
    }

    public ListEnvironmentTunnelsResponse listEnvironmentTunnelsWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListEnvironmentTunnels", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/environments/" + uid + "/tunnels", "json", req, runtime), new ListEnvironmentTunnelsResponse());
    }

    public ListProductVersionsResponse listProductVersions(ListProductVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionsWithOptions(request, headers, runtime);
    }

    public ListProductVersionsResponse listProductVersionsWithOptions(ListProductVersionsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductVersionsShrinkRequest request = new ListProductVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.supportedFoundationTypes)) {
            request.supportedFoundationTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.supportedFoundationTypes, "supportedFoundationTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productUID)) {
            query.put("productUID", request.productUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.released)) {
            query.put("released", request.released);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedFoundationTypesShrink)) {
            query.put("supportedFoundationTypes", request.supportedFoundationTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductVersions", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-versions", "json", req, runtime), new ListProductVersionsResponse());
    }

    public PutProductInstanceConfigResponse putProductInstanceConfig(PutProductInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putProductInstanceConfigWithOptions(request, headers, runtime);
    }

    public PutProductInstanceConfigResponse putProductInstanceConfigWithOptions(PutProductInstanceConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentUID)) {
            body.put("componentUID", request.componentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configUID)) {
            body.put("configUID", request.configUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            body.put("releaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentName)) {
            body.put("parentComponentName", request.parentComponentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentVersionUID)) {
            body.put("parentComponentVersionUID", request.parentComponentVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("PutProductInstanceConfig", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/product-instances/configs", "json", req, runtime), new PutProductInstanceConfigResponse());
    }

    public UpdateEnvironmentProductVersionResponse updateEnvironmentProductVersion(String uid, UpdateEnvironmentProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentProductVersionResponse updateEnvironmentProductVersionWithOptions(String uid, UpdateEnvironmentProductVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateEnvironmentProductVersion", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/environments/" + uid + "/product-versions", "json", req, runtime), new UpdateEnvironmentProductVersionResponse());
    }

    public GetProductVersionResponse getProductVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionWithOptions(uid, headers, runtime);
    }

    public GetProductVersionResponse getProductVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersion", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/product-versions/" + uid + "", "json", req, runtime), new GetProductVersionResponse());
    }

    public UpdateProductFoundationVersionResponse updateProductFoundationVersion(String uid, UpdateProductFoundationVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductFoundationVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductFoundationVersionResponse updateProductFoundationVersionWithOptions(String uid, UpdateProductFoundationVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            body.put("foundationVersionUID", request.foundationVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductFoundationVersion", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/product-versions/" + uid + "/foundation", "json", req, runtime), new UpdateProductFoundationVersionResponse());
    }

    public GetProductResponse getProduct(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductWithOptions(uid, headers, runtime);
    }

    public GetProductResponse getProductWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProduct", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/products/" + uid + "", "json", req, runtime), new GetProductResponse());
    }

    public ListFoundationVersionsResponse listFoundationVersions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationVersionsWithOptions(headers, runtime);
    }

    public ListFoundationVersionsResponse listFoundationVersionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListFoundationVersions", "2021-07-20", "HTTPS", "GET", "AK", "/api/v2/foundation/versions", "json", req, runtime), new ListFoundationVersionsResponse());
    }

    public UpdateProductVersionConfigResponse updateProductVersionConfig(String uid, String configUID, UpdateProductVersionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionConfigWithOptions(uid, configUID, request, headers, runtime);
    }

    public UpdateProductVersionConfigResponse updateProductVersionConfigWithOptions(String uid, String configUID, UpdateProductVersionConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        configUID = com.aliyun.openapiutil.Client.getEncodeParam(configUID);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentVersionUID)) {
            body.put("parentComponentVersionUID", request.parentComponentVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductVersionConfig", "2021-07-20", "HTTPS", "PUT", "AK", "/api/v2/product-versions/" + uid + "/configs/" + configUID + "", "json", req, runtime), new UpdateProductVersionConfigResponse());
    }
}
