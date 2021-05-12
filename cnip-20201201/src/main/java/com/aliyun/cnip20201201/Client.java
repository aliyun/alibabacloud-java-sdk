// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201;

import com.aliyun.tea.*;
import com.aliyun.cnip20201201.models.*;
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
        this._endpoint = this.getEndpoint("cnip", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEnvironment", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "", "json", req, runtime), new GetEnvironmentResponse());
    }

    public ListProductVersionRelatedComponentVersionsResponse listProductVersionRelatedComponentVersions(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionRelatedComponentVersionsWithOptions(uid, headers, runtime);
    }

    public ListProductVersionRelatedComponentVersionsResponse listProductVersionRelatedComponentVersionsWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListProductVersionRelatedComponentVersions", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_versions/" + uid + "/component_versions", "json", req, runtime), new ListProductVersionRelatedComponentVersionsResponse());
    }

    public GetComponentVersionChildrenResponse getComponentVersionChildren(String uid, String versionUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentVersionChildrenWithOptions(uid, versionUID, headers, runtime);
    }

    public GetComponentVersionChildrenResponse getComponentVersionChildrenWithOptions(String uid, String versionUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetComponentVersionChildren", "2020-12-01", "HTTPS", "GET", "AK", "/integration/api/v1/components/" + uid + "/versions/" + versionUID + "/children", "json", req, runtime), new GetComponentVersionChildrenResponse());
    }

    public GetProductEnvironmentResponse getProductEnvironment(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductEnvironmentWithOptions(uid, headers, runtime);
    }

    public GetProductEnvironmentResponse getProductEnvironmentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductEnvironment", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_envs/" + uid + "", "json", req, runtime), new GetProductEnvironmentResponse());
    }

    public GetProductVersionPackageResponse getProductVersionPackage(String uid, GetProductVersionPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionPackageWithOptions(uid, request, headers, runtime);
    }

    public GetProductVersionPackageResponse getProductVersionPackageWithOptions(String uid, GetProductVersionPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            query.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersionPackage", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/hosting/product_versions/" + uid + "/packages", "json", req, runtime), new GetProductVersionPackageResponse());
    }

    public ListAlicloudRegionResponse listAlicloudRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlicloudRegionWithOptions(headers, runtime);
    }

    public ListAlicloudRegionResponse listAlicloudRegionWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListAlicloudRegion", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/alicloud/regions", "json", req, runtime), new ListAlicloudRegionResponse());
    }

    public ListComponentVersionsResponse listComponentVersions(String uid, ListComponentVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListComponentVersionsResponse listComponentVersionsWithOptions(String uid, ListComponentVersionsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
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
        return TeaModel.toModel(this.doROARequest("ListComponentVersions", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/components/" + uid + "/versions", "json", req, runtime), new ListComponentVersionsResponse());
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponse updateSnapshotInstanceJoinOptionWithBatch(String uid, UpdateSnapshotInstanceJoinOptionWithBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotInstanceJoinOptionWithBatchWithOptions(uid, request, headers, runtime);
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponse updateSnapshotInstanceJoinOptionWithBatchWithOptions(String uid, UpdateSnapshotInstanceJoinOptionWithBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceUIDs)) {
            query.put("instanceUIDs", request.instanceUIDs);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.joinSnapshot)) {
            body.put("joinSnapshot", request.joinSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSnapshotInstanceJoinOptionWithBatch", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/snapshots/" + uid + "/instances", "json", req, runtime), new UpdateSnapshotInstanceJoinOptionWithBatchResponse());
    }

    public GenerateVendorConfigTemplateResponse generateVendorConfigTemplate(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateVendorConfigTemplateWithOptions(uid, headers, runtime);
    }

    public GenerateVendorConfigTemplateResponse generateVendorConfigTemplateWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GenerateVendorConfigTemplate", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "/vendorConfigTmpl", "json", req, runtime), new GenerateVendorConfigTemplateResponse());
    }

    public UpdateProductComponentResponse updateProductComponent(String uid, UpdateProductComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductComponentWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductComponentResponse updateProductComponentWithOptions(String uid, UpdateProductComponentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductComponent", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/productComponentVersions/" + uid + "", "json", req, runtime), new UpdateProductComponentResponse());
    }

    public UpdateEnvironmentNodesResponse updateEnvironmentNodes(String uid, UpdateEnvironmentNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentNodesResponse updateEnvironmentNodesWithOptions(String uid, UpdateEnvironmentNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            body.put("dataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk2)) {
            body.put("dataDisk2", request.dataDisk2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envUID)) {
            body.put("envUID", request.envUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIP)) {
            body.put("nodeIP", request.nodeIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            body.put("systemDisk", request.systemDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk2)) {
            body.put("systemDisk2", request.systemDisk2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateEnvironmentNodes", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/environmentnodes/" + uid + "", "json", req, runtime), new UpdateEnvironmentNodesResponse());
    }

    public ListEnvironmentPackagesResponse listEnvironmentPackages(String uid, ListEnvironmentPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentPackagesWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentPackagesResponse listEnvironmentPackagesWithOptions(String uid, ListEnvironmentPackagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("ListEnvironmentPackages", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "/packages", "json", req, runtime), new ListEnvironmentPackagesResponse());
    }

    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateEnvironmentHeaders headers = new CreateEnvironmentHeaders();
        return this.createEnvironmentWithOptions(request, headers, runtime);
    }

    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, CreateEnvironmentHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

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
        return TeaModel.toModel(this.doROARequest("CreateEnvironment", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments", "json", req, runtime), new CreateEnvironmentResponse());
    }

    public GetEnvironmentLogResponse getEnvironmentLog(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentLogWithOptions(uid, headers, runtime);
    }

    public GetEnvironmentLogResponse getEnvironmentLogWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEnvironmentLog", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/envLogs/" + uid + "", "json", req, runtime), new GetEnvironmentLogResponse());
    }

    public ListEnvironmentNodeResponse listEnvironmentNode(String uid, ListEnvironmentNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentNodeWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentNodeResponse listEnvironmentNodeWithOptions(String uid, ListEnvironmentNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            query.put("nodeIp", request.nodeIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEnvironmentNode", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "/nodes", "json", req, runtime), new ListEnvironmentNodeResponse());
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponse listProductVersionRelatedFoundationComponentVersions(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionRelatedFoundationComponentVersionsWithOptions(uid, headers, runtime);
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponse listProductVersionRelatedFoundationComponentVersionsWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListProductVersionRelatedFoundationComponentVersions", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_versions/" + uid + "/foundation/component_versions", "json", req, runtime), new ListProductVersionRelatedFoundationComponentVersionsResponse());
    }

    public SyncComponentResponse syncComponent(SyncComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncComponentWithOptions(request, headers, runtime);
    }

    public SyncComponentResponse syncComponentWithOptions(SyncComponentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("bucketName", request.bucketName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SyncComponent", "2020-12-01", "HTTPS", "GET", "AK", "/integration/api/v1/oss/sync/apps", "json", req, runtime), new SyncComponentResponse());
    }

    public UpdateComponentToProductResponse updateComponentToProduct(String id, String versionId, String productComponentVersionRelationId, UpdateComponentToProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComponentToProductWithOptions(id, versionId, productComponentVersionRelationId, request, headers, runtime);
    }

    public UpdateComponentToProductResponse updateComponentToProductWithOptions(String id, String versionId, String productComponentVersionRelationId, UpdateComponentToProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionID)) {
            query.put("componentVersionID", request.componentVersionID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateComponentToProduct", "2020-12-01", "HTTPS", "PUT", "AK", "/integration/api/v1/products/" + id + "/versions/" + versionId + "/componentVersionRelations/" + productComponentVersionRelationId + "", "json", req, runtime), new UpdateComponentToProductResponse());
    }

    public CreateEnvironmentNodeResponse createEnvironmentNode(String uid, CreateEnvironmentNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentNodeWithOptions(uid, request, headers, runtime);
    }

    public CreateEnvironmentNodeResponse createEnvironmentNodeWithOptions(String uid, CreateEnvironmentNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            body.put("dataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("hostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            body.put("privateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            body.put("systemDisk", request.systemDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateEnvironmentNode", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/nodes", "json", req, runtime), new CreateEnvironmentNodeResponse());
    }

    public GetComponentResponse getComponent(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentWithOptions(uid, headers, runtime);
    }

    public GetComponentResponse getComponentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetComponent", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/components/" + uid + "", "json", req, runtime), new GetComponentResponse());
    }

    public ListFoundationVersionRelatedComponentVersionsResponse listFoundationVersionRelatedComponentVersions(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationVersionRelatedComponentVersionsWithOptions(uid, headers, runtime);
    }

    public ListFoundationVersionRelatedComponentVersionsResponse listFoundationVersionRelatedComponentVersionsWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListFoundationVersionRelatedComponentVersions", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/foundation/versions/" + uid + "/component_versions", "json", req, runtime), new ListFoundationVersionRelatedComponentVersionsResponse());
    }

    public GetSnapshotResponse getSnapshot(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSnapshotWithOptions(uid, headers, runtime);
    }

    public GetSnapshotResponse getSnapshotWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSnapshot", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/snapshots/" + uid + "", "json", req, runtime), new GetSnapshotResponse());
    }

    public GetLicenseResponse getLicense(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLicenseWithOptions(uid, headers, runtime);
    }

    public GetLicenseResponse getLicenseWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetLicense", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "/licenses", "json", req, runtime), new GetLicenseResponse());
    }

    public CreateLatestProductVersionResponse createLatestProductVersion(String uid, String versionUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateLatestProductVersionHeaders headers = new CreateLatestProductVersionHeaders();
        return this.createLatestProductVersionWithOptions(uid, versionUID, headers, runtime);
    }

    public CreateLatestProductVersionResponse createLatestProductVersionWithOptions(String uid, String versionUID, CreateLatestProductVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", headers.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("CreateLatestProductVersion", "2020-12-01", "HTTPS", "POST", "AK", "/integration/api/v1/products/" + uid + "/versions/" + versionUID + "", "json", req, runtime), new CreateLatestProductVersionResponse());
    }

    public ListAlicloudVPCResponse listAlicloudVPC(String regionid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlicloudVPCWithOptions(regionid, headers, runtime);
    }

    public ListAlicloudVPCResponse listAlicloudVPCWithOptions(String regionid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListAlicloudVPC", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/alicloud/regions/" + regionid + "/vpcs", "json", req, runtime), new ListAlicloudVPCResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateProductHeaders headers = new CreateProductHeaders();
        return this.createProductWithOptions(request, headers, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, CreateProductHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            body.put("foundationVersionUID", request.foundationVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusUID)) {
            body.put("prometheusUID", request.prometheusUID);
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
        return TeaModel.toModel(this.doROARequest("CreateProduct", "2020-12-01", "HTTPS", "POST", "AK", "/integration/api/v1/products", "json", req, runtime), new CreateProductResponse());
    }

    public GetProductEnvironmentsResponse getProductEnvironments(GetProductEnvironmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductEnvironmentsWithOptions(request, headers, runtime);
    }

    public GetProductEnvironmentsResponse getProductEnvironmentsWithOptions(GetProductEnvironmentsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetProductEnvironmentsShrinkRequest request = new GetProductEnvironmentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productUID)) {
            query.put("productUID", request.productUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("envType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProductEnvironments", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_envs", "json", req, runtime), new GetProductEnvironmentsResponse());
    }

    public DeleteComponentResponse deleteComponent(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComponentWithOptions(uid, headers, runtime);
    }

    public DeleteComponentResponse deleteComponentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteComponent", "2020-12-01", "HTTPS", "DELETE", "AK", "/integration/api/v1/components/" + uid + "", "json", req, runtime), new DeleteComponentResponse());
    }

    public DeleteProductComponentResponse deleteProductComponent(String id, String versionId, String productComponentVersionRelationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductComponentWithOptions(id, versionId, productComponentVersionRelationId, headers, runtime);
    }

    public DeleteProductComponentResponse deleteProductComponentWithOptions(String id, String versionId, String productComponentVersionRelationId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProductComponent", "2020-12-01", "HTTPS", "DELETE", "AK", "/integration/api/v1/products/" + id + "/versions/" + versionId + "/componentVersionRelations/" + productComponentVersionRelationId + "", "json", req, runtime), new DeleteProductComponentResponse());
    }

    public CreateEnvironmentWithSnapshotResponse createEnvironmentWithSnapshot(String uid, CreateEnvironmentWithSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentWithSnapshotWithOptions(uid, request, headers, runtime);
    }

    public CreateEnvironmentWithSnapshotResponse createEnvironmentWithSnapshotWithOptions(String uid, CreateEnvironmentWithSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentDesc)) {
            body.put("environmentDesc", request.environmentDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentName)) {
            body.put("environmentName", request.environmentName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateEnvironmentWithSnapshot", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/snapshots/" + uid + "/environments", "json", req, runtime), new CreateEnvironmentWithSnapshotResponse());
    }

    public DeleteEnvironmentResponse deleteEnvironment(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentWithOptions(uid, headers, runtime);
    }

    public DeleteEnvironmentResponse deleteEnvironmentWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEnvironment", "2020-12-01", "HTTPS", "DELETE", "AK", "/api/v1/environments/" + uid + "", "json", req, runtime), new DeleteEnvironmentResponse());
    }

    public UpdateProductVersionResponse updateProductVersion(String uid, UpdateProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductVersionResponse updateProductVersionWithOptions(String uid, UpdateProductVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compatibleVersions)) {
            body.put("compatibleVersions", request.compatibleVersions);
        }

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
        return TeaModel.toModel(this.doROARequest("UpdateProductVersion", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/product_versions/" + uid + "", "json", req, runtime), new UpdateProductVersionResponse());
    }

    public GetChildrenComponentVersionParametersListResponse getChildrenComponentVersionParametersList(String id, String versionId, GetChildrenComponentVersionParametersListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChildrenComponentVersionParametersListWithOptions(id, versionId, request, headers, runtime);
    }

    public GetChildrenComponentVersionParametersListResponse getChildrenComponentVersionParametersListWithOptions(String id, String versionId, GetChildrenComponentVersionParametersListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relationId)) {
            query.put("relation_id", request.relationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetChildrenComponentVersionParametersList", "2020-12-01", "HTTPS", "GET", "AK", "/integration/api/v1/components/" + id + "/versions/" + versionId + "/parameters", "json", req, runtime), new GetChildrenComponentVersionParametersListResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSnapshotWithOptions(request, headers, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("productVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionDesc)) {
            body.put("productVersionDesc", request.productVersionDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcid)) {
            body.put("vpcid", request.vpcid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSnapshot", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/snapshots", "json", req, runtime), new CreateSnapshotResponse());
    }

    public GetLatestVersionDifferencesResponse getLatestVersionDifferences(String id, String versionID, GetLatestVersionDifferencesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLatestVersionDifferencesWithOptions(id, versionID, request, headers, runtime);
    }

    public GetLatestVersionDifferencesResponse getLatestVersionDifferencesWithOptions(String id, String versionID, GetLatestVersionDifferencesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preVersionID)) {
            query.put("preVersionID", request.preVersionID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetLatestVersionDifferences", "2020-12-01", "HTTPS", "GET", "AK", "/integration/api/v1/products/" + id + "/versions/" + versionID + "/differences", "json", req, runtime), new GetLatestVersionDifferencesResponse());
    }

    public DeleteEnvironmentNodeResponse deleteEnvironmentNode(String uid, DeleteEnvironmentNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentNodeWithOptions(uid, request, headers, runtime);
    }

    public DeleteEnvironmentNodeResponse deleteEnvironmentNodeWithOptions(String uid, DeleteEnvironmentNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envUID)) {
            query.put("envUID", request.envUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEnvironmentNode", "2020-12-01", "HTTPS", "DELETE", "AK", "/api/v1/environmentnodes/" + uid + "", "json", req, runtime), new DeleteEnvironmentNodeResponse());
    }

    public ApplyComponentResponse applyComponent(ApplyComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyComponentWithOptions(request, headers, runtime);
    }

    public ApplyComponentResponse applyComponentWithOptions(ApplyComponentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("appVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentClass)) {
            body.put("componentClass", request.componentClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documents)) {
            body.put("documents", request.documents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagesMapping)) {
            body.put("imagesMapping", request.imagesMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orchestrationType)) {
            body.put("orchestrationType", request.orchestrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orchestrationValues)) {
            body.put("orchestrationValues", request.orchestrationValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageURL)) {
            body.put("packageURL", request.packageURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponent)) {
            body.put("parentComponent", request.parentComponent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platforms)) {
            body.put("platforms", request.platforms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._public)) {
            body.put("_public", request._public);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readme)) {
            body.put("readme", request.readme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleton)) {
            body.put("singleton", request.singleton);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ApplyComponent", "2020-12-01", "HTTPS", "POST", "AK", "/integration/api/v1/apps", "json", req, runtime), new ApplyComponentResponse());
    }

    public GetSnapshotInstancesResponse getSnapshotInstances(String uid, GetSnapshotInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSnapshotInstancesWithOptions(uid, request, headers, runtime);
    }

    public GetSnapshotInstancesResponse getSnapshotInstancesWithOptions(String uid, GetSnapshotInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("sortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirect)) {
            query.put("sortDirect", request.sortDirect);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSnapshotInstances", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/snapshots/" + uid + "/instances", "json", req, runtime), new GetSnapshotInstancesResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEnvironments", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments", "json", req, runtime), new ListEnvironmentsResponse());
    }

    public CheckSLRResponse checkSLR(CheckSLRRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSLRWithOptions(request, headers, runtime);
    }

    public CheckSLRResponse checkSLRWithOptions(CheckSLRRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CheckSLR", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/slr", "json", req, runtime), new CheckSLRResponse());
    }

    public UpdateProductResponse updateProduct(String uid, UpdateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(String uid, UpdateProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.description)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProduct", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/products/" + uid + "", "json", req, runtime), new UpdateProductResponse());
    }

    public ApplyComponentsResponse applyComponents(ApplyComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyComponentsWithOptions(request, headers, runtime);
    }

    public ApplyComponentsResponse applyComponentsWithOptions(ApplyComponentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childrenList)) {
            body.put("childrenList", request.childrenList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.component)) {
            body.put("component", request.component);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ApplyComponents", "2020-12-01", "HTTPS", "POST", "AK", "/integration/api/v1/components", "json", req, runtime), new ApplyComponentsResponse());
    }

    public CreatePackageConfigResponse createPackageConfig(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPackageConfigWithOptions(uid, headers, runtime);
    }

    public CreatePackageConfigResponse createPackageConfigWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreatePackageConfig", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/package_config", "json", req, runtime), new CreatePackageConfigResponse());
    }

    public AddProductComponentResponse addProductComponent(String id, String versionId, String componentVersionId, String ClientToken, AddProductComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductComponentWithOptions(id, versionId, componentVersionId, ClientToken, request, headers, runtime);
    }

    public AddProductComponentResponse addProductComponentWithOptions(String id, String versionId, String componentVersionId, String ClientToken, AddProductComponentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.releaseName)
        ));
        return TeaModel.toModel(this.doROARequest("AddProductComponent", "2020-12-01", "HTTPS", "POST", "AK", "/integration/api/v1/products/" + id + "/versions/" + versionId + "/componentVersions/" + componentVersionId + "", "json", req, runtime), new AddProductComponentResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSnapshotWithOptions(uid, headers, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSnapshot", "2020-12-01", "HTTPS", "DELETE", "AK", "/api/v1/snapshots/" + uid + "", "json", req, runtime), new DeleteSnapshotResponse());
    }

    public ListEnvironmentsWithSnapshotResponse listEnvironmentsWithSnapshot(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithSnapshotWithOptions(uid, headers, runtime);
    }

    public ListEnvironmentsWithSnapshotResponse listEnvironmentsWithSnapshotWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListEnvironmentsWithSnapshot", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/snapshots/" + uid + "/environments", "json", req, runtime), new ListEnvironmentsWithSnapshotResponse());
    }

    public GetEnvironmentNodeResponse getEnvironmentNode(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentNodeWithOptions(uid, headers, runtime);
    }

    public GetEnvironmentNodeResponse getEnvironmentNodeWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEnvironmentNode", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environmentnodes/" + uid + "", "json", req, runtime), new GetEnvironmentNodeResponse());
    }

    public UpdateSnapshotResponse updateSnapshot(String uid, UpdateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotWithOptions(uid, request, headers, runtime);
    }

    public UpdateSnapshotResponse updateSnapshotWithOptions(String uid, UpdateSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("productVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionDesc)) {
            body.put("productVersionDesc", request.productVersionDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateKey)) {
            body.put("updateKey", request.updateKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSnapshot", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/snapshots/" + uid + "", "json", req, runtime), new UpdateSnapshotResponse());
    }

    public CreateEnvironmentAndGenerateVendorConfigResponse createEnvironmentAndGenerateVendorConfig(CreateEnvironmentAndGenerateVendorConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateEnvironmentAndGenerateVendorConfigHeaders headers = new CreateEnvironmentAndGenerateVendorConfigHeaders();
        return this.createEnvironmentAndGenerateVendorConfigWithOptions(request, headers, runtime);
    }

    public CreateEnvironmentAndGenerateVendorConfigResponse createEnvironmentAndGenerateVendorConfigWithOptions(CreateEnvironmentAndGenerateVendorConfigRequest request, CreateEnvironmentAndGenerateVendorConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envUID)) {
            body.put("envUID", request.envUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.platform))) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUID)) {
            body.put("productUID", request.productUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("productVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            body.put("vendorType", request.vendorType);
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
        return TeaModel.toModel(this.doROARequest("CreateEnvironmentAndGenerateVendorConfig", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/product_envs/vendor_config", "json", req, runtime), new CreateEnvironmentAndGenerateVendorConfigResponse());
    }

    public CreateEnvironmentSnapshotResponse createEnvironmentSnapshot(String uid, CreateEnvironmentSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentSnapshotWithOptions(uid, request, headers, runtime);
    }

    public CreateEnvironmentSnapshotResponse createEnvironmentSnapshotWithOptions(String uid, CreateEnvironmentSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateEnvironmentSnapshot", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/snapshots", "json", req, runtime), new CreateEnvironmentSnapshotResponse());
    }

    public InitSnapshotInstanceResponse initSnapshotInstance(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initSnapshotInstanceWithOptions(uid, headers, runtime);
    }

    public InitSnapshotInstanceResponse initSnapshotInstanceWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("InitSnapshotInstance", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/snapshots/" + uid + "/instances", "json", req, runtime), new InitSnapshotInstanceResponse());
    }

    public UpdateProductVersionRelatedFoundationVersionResponse updateProductVersionRelatedFoundationVersion(String uid, UpdateProductVersionRelatedFoundationVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionRelatedFoundationVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductVersionRelatedFoundationVersionResponse updateProductVersionRelatedFoundationVersionWithOptions(String uid, UpdateProductVersionRelatedFoundationVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.foundationVersionUID)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductVersionRelatedFoundationVersion", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/product_versions/" + uid + "/foundation", "json", req, runtime), new UpdateProductVersionRelatedFoundationVersionResponse());
    }

    public ListEnvironmentParamsResponse listEnvironmentParams(String uid, ListEnvironmentParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentParamsWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentParamsResponse listEnvironmentParamsWithOptions(String uid, ListEnvironmentParamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("ListEnvironmentParams", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "/params", "json", req, runtime), new ListEnvironmentParamsResponse());
    }

    public GetFoundationVersionResponse getFoundationVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFoundationVersionWithOptions(uid, headers, runtime);
    }

    public GetFoundationVersionResponse getFoundationVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetFoundationVersion", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/foundation/versions/" + uid + "", "json", req, runtime), new GetFoundationVersionResponse());
    }

    public DeleteProductResponse deleteProduct(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductWithOptions(uid, headers, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProduct", "2020-12-01", "HTTPS", "DELETE", "AK", "/integration/api/v1/products/" + uid + "", "json", req, runtime), new DeleteProductResponse());
    }

    public UpdateEnvironmentResponse updateEnvironment(String uid, UpdateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentResponse updateEnvironmentWithOptions(String uid, UpdateEnvironmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("UpdateEnvironment", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/environments/" + uid + "", "json", req, runtime), new UpdateEnvironmentResponse());
    }

    public GetEnvironmentPackageResponse getEnvironmentPackage(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentPackageWithOptions(uid, headers, runtime);
    }

    public GetEnvironmentPackageResponse getEnvironmentPackageWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEnvironmentPackage", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/envPackages/" + uid + "", "json", req, runtime), new GetEnvironmentPackageResponse());
    }

    public GetProductComponentDetailResponse getProductComponentDetail(String uid, String versionUID, String productComponentVersionRelationUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductComponentDetailWithOptions(uid, versionUID, productComponentVersionRelationUID, headers, runtime);
    }

    public GetProductComponentDetailResponse getProductComponentDetailWithOptions(String uid, String versionUID, String productComponentVersionRelationUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductComponentDetail", "2020-12-01", "HTTPS", "GET", "AK", "/integration/api/v1/products/" + uid + "/versions/" + versionUID + "/productComponentVersionRelations/" + productComponentVersionRelationUID + "/detail", "json", req, runtime), new GetProductComponentDetailResponse());
    }

    public ImportEnvironmentNodesResponse importEnvironmentNodes(String uid, ImportEnvironmentNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public ImportEnvironmentNodesResponse importEnvironmentNodesWithOptions(String uid, ImportEnvironmentNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.nodeListYaml)
        ));
        return TeaModel.toModel(this.doROARequest("ImportEnvironmentNodes", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/importnodes", "json", req, runtime), new ImportEnvironmentNodesResponse());
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
        return TeaModel.toModel(this.doROARequest("ListComponents", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/components", "json", req, runtime), new ListComponentsResponse());
    }

    public AddEnvironmentProductVersionResponse addEnvironmentProductVersion(String uid, AddEnvironmentProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        AddEnvironmentProductVersionHeaders headers = new AddEnvironmentProductVersionHeaders();
        return this.addEnvironmentProductVersionWithOptions(uid, request, headers, runtime);
    }

    public AddEnvironmentProductVersionResponse addEnvironmentProductVersionWithOptions(String uid, AddEnvironmentProductVersionRequest request, AddEnvironmentProductVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUID)) {
            body.put("productUID", request.productUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("productVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
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
        return TeaModel.toModel(this.doROARequest("AddEnvironmentProductVersion", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/productVersions", "json", req, runtime), new AddEnvironmentProductVersionResponse());
    }

    public ListProductVersionsResponse listProductVersions(String uid, ListProductVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListProductVersionsResponse listProductVersionsWithOptions(String uid, ListProductVersionsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductVersionsShrinkRequest request = new ListProductVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.released)) {
            query.put("released", request.released);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductVersions", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/products/" + uid + "/versions", "json", req, runtime), new ListProductVersionsResponse());
    }

    public GetChildrenComponentVersionListResponse getChildrenComponentVersionList(String id, String versionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChildrenComponentVersionListWithOptions(id, versionId, headers, runtime);
    }

    public GetChildrenComponentVersionListResponse getChildrenComponentVersionListWithOptions(String id, String versionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetChildrenComponentVersionList", "2020-12-01", "HTTPS", "GET", "AK", "/integration/api/v1/products/" + id + "/versions/" + versionId + "/children", "json", req, runtime), new GetChildrenComponentVersionListResponse());
    }

    public CreateSLRResponse createSLR() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateSLRHeaders headers = new CreateSLRHeaders();
        return this.createSLRWithOptions(headers, runtime);
    }

    public CreateSLRResponse createSLRWithOptions(CreateSLRHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", headers.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("CreateSLR", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/slr", "json", req, runtime), new CreateSLRResponse());
    }

    public GetProductVersionRelatedComponentVersionDetailResponse getProductVersionRelatedComponentVersionDetail(String uid, String relationUID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionRelatedComponentVersionDetailWithOptions(uid, relationUID, headers, runtime);
    }

    public GetProductVersionRelatedComponentVersionDetailResponse getProductVersionRelatedComponentVersionDetailWithOptions(String uid, String relationUID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersionRelatedComponentVersionDetail", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_versions/" + uid + "/relations/" + relationUID + "", "json", req, runtime), new GetProductVersionRelatedComponentVersionDetailResponse());
    }

    public AddEnvironmentPackageResponse addEnvironmentPackage(String uid, AddEnvironmentPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        AddEnvironmentPackageHeaders headers = new AddEnvironmentPackageHeaders();
        return this.addEnvironmentPackageWithOptions(uid, request, headers, runtime);
    }

    public AddEnvironmentPackageResponse addEnvironmentPackageWithOptions(String uid, AddEnvironmentPackageRequest request, AddEnvironmentPackageHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("packageType", request.packageType);
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
        return TeaModel.toModel(this.doROARequest("AddEnvironmentPackage", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/package", "json", req, runtime), new AddEnvironmentPackageResponse());
    }

    public UpdateEnvironmentProductVersionResponse updateEnvironmentProductVersion(String uid, UpdateEnvironmentProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentProductVersionResponse updateEnvironmentProductVersionWithOptions(String uid, UpdateEnvironmentProductVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compatibleVersions)) {
            body.put("compatibleVersions", request.compatibleVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersion)) {
            body.put("oldProductVersion", request.oldProductVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            body.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUID)) {
            body.put("productUID", request.productUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("productVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateEnvironmentProductVersion", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/environments/" + uid + "/product_versions", "json", req, runtime), new UpdateEnvironmentProductVersionResponse());
    }

    public GetProductVersionPlatformsResponse getProductVersionPlatforms(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionPlatformsWithOptions(uid, headers, runtime);
    }

    public GetProductVersionPlatformsResponse getProductVersionPlatformsWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersionPlatforms", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_versions/" + uid + "/platforms", "json", req, runtime), new GetProductVersionPlatformsResponse());
    }

    public SaveEnvironmentParamResponse saveEnvironmentParam(String uid, SaveEnvironmentParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveEnvironmentParamWithOptions(uid, request, headers, runtime);
    }

    public SaveEnvironmentParamResponse saveEnvironmentParamWithOptions(String uid, SaveEnvironmentParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentUID)) {
            body.put("componentUID", request.componentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramUID)) {
            body.put("paramUID", request.paramUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("provider", request.provider);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SaveEnvironmentParam", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/environments/" + uid + "/params", "json", req, runtime), new SaveEnvironmentParamResponse());
    }

    public UpdateSnapshotInstanceJoinOptionResponse updateSnapshotInstanceJoinOption(String instanceuid, String uid, UpdateSnapshotInstanceJoinOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotInstanceJoinOptionWithOptions(instanceuid, uid, request, headers, runtime);
    }

    public UpdateSnapshotInstanceJoinOptionResponse updateSnapshotInstanceJoinOptionWithOptions(String instanceuid, String uid, UpdateSnapshotInstanceJoinOptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.joinSnapshot)) {
            body.put("joinSnapshot", request.joinSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSnapshotInstanceJoinOption", "2020-12-01", "HTTPS", "PUT", "AK", "/api/v1/snapshots/" + uid + "/instances/" + instanceuid + "", "json", req, runtime), new UpdateSnapshotInstanceJoinOptionResponse());
    }

    public GetProductVersionResourceResponse getProductVersionResource(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionResourceWithOptions(uid, headers, runtime);
    }

    public GetProductVersionResourceResponse getProductVersionResourceWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersionResource", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/product_versions/" + uid + "/resources", "json", req, runtime), new GetProductVersionResourceResponse());
    }

    public CreateLicenseResponse createLicense(String uid, CreateLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLicenseWithOptions(uid, request, headers, runtime);
    }

    public CreateLicenseResponse createLicenseWithOptions(String uid, CreateLicenseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveYear)) {
            query.put("effectiveYear", request.effectiveYear);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateLicense", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/licenses", "json", req, runtime), new CreateLicenseResponse());
    }

    public ShareSnapshotResponse shareSnapshot(String uid, ShareSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.shareSnapshotWithOptions(uid, request, headers, runtime);
    }

    public ShareSnapshotResponse shareSnapshotWithOptions(String uid, ShareSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetProvider)) {
            body.put("targetProvider", request.targetProvider);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ShareSnapshot", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/snapshots/" + uid + "/snapshots", "json", req, runtime), new ShareSnapshotResponse());
    }

    public DeleteEnvironmentParamResponse deleteEnvironmentParam(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentParamWithOptions(uid, headers, runtime);
    }

    public DeleteEnvironmentParamResponse deleteEnvironmentParamWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEnvironmentParam", "2020-12-01", "HTTPS", "DELETE", "AK", "/api/v1/environmentparams/" + uid + "", "json", req, runtime), new DeleteEnvironmentParamResponse());
    }

    public GetProductResponse getProduct(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductWithOptions(uid, headers, runtime);
    }

    public GetProductResponse getProductWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProduct", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/products/" + uid + "", "json", req, runtime), new GetProductResponse());
    }

    public DeleteComponentVersionResponse deleteComponentVersion(String uid, String versionUid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComponentVersionWithOptions(uid, versionUid, headers, runtime);
    }

    public DeleteComponentVersionResponse deleteComponentVersionWithOptions(String uid, String versionUid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteComponentVersion", "2020-12-01", "HTTPS", "DELETE", "AK", "/integration/api/v1/components/" + uid + "/versions/" + versionUid + "", "json", req, runtime), new DeleteComponentVersionResponse());
    }

    public DeployEnvironmentProductResponse deployEnvironmentProduct(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployEnvironmentProductWithOptions(uid, headers, runtime);
    }

    public DeployEnvironmentProductResponse deployEnvironmentProductWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeployEnvironmentProduct", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/deployment", "json", req, runtime), new DeployEnvironmentProductResponse());
    }

    public InitEnvironmentResourceResponse initEnvironmentResource(String uid, InitEnvironmentResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnvironmentResourceWithOptions(uid, request, headers, runtime);
    }

    public InitEnvironmentResourceResponse initEnvironmentResourceWithOptions(String uid, InitEnvironmentResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("InitEnvironmentResource", "2020-12-01", "HTTPS", "POST", "AK", "/api/v1/environments/" + uid + "/resources", "json", req, runtime), new InitEnvironmentResourceResponse());
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
        return TeaModel.toModel(this.doROARequest("ListFoundationVersions", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/foundation/versions", "json", req, runtime), new ListFoundationVersionsResponse());
    }

    public ListEnvironmentDeployRecordResponse listEnvironmentDeployRecord(String uid, ListEnvironmentDeployRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentDeployRecordWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentDeployRecordResponse listEnvironmentDeployRecordWithOptions(String uid, ListEnvironmentDeployRecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("ListEnvironmentDeployRecord", "2020-12-01", "HTTPS", "GET", "AK", "/api/v1/environments/" + uid + "/deployments", "json", req, runtime), new ListEnvironmentDeployRecordResponse());
    }
}
